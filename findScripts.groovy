// Copyright (c) 2011-2023  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// find all references to scripts
//
// it takes one optional argument, which is appended to the output

import groovy.xml.XmlSlurper

if (args.length == 0) {
  println "groovy findScripts.groovy <directory> [suffix]"
  System.exit(0)
}

def folder = args[0]

def suffix = ""
if (args.length == 2) suffix = args[1]

def basedir = new File(folder)
files = basedir.listFiles().grep(~/.*i.md$/)
files.each { file ->
  file.eachLine { line ->
    try {
      if (line.contains("<sparql>")) {
        start = line.indexOf("<sparql>")
        end = line.indexOf("</sparql>")
        text = line.substring(start + 8, end)
        println "" + text + suffix
      } else if (line.contains("<out")) {
        start = line.indexOf("<out")
        end = line.indexOf("</out>")
        instructionText = line.substring(start, end+6)
        def outInstruction = new XmlSlurper().parseText(instructionText)
        outText = outInstruction.text()
        if (!outText.isEmpty()) 
          println "" + outText + suffix
      }
    } catch (Exception exception) {
      println "Error reading line: " + line
      println "  " + exception.getMessage()
      System.exit(-1)
    }
  }
}

