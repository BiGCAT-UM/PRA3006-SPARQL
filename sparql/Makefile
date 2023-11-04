CODEFILES: \
 $(shell groovy ../findScripts.groovy .. .out | sort | uniq )

.PRECIOUS: %.java %.groovy

all: allScriptsCompiled

distclean: clean
	@rm -f *.md *.out

clean:
	@rm -f *~ allScriptsCompiled

allScriptsCompiled: ${CODEFILES}
	@touch allScriptsCompiled

%.out: %.rq %.ep
	@echo "doing $@ ..."
	groovy preprocess $^ > $@
	groovy postprocess $^
