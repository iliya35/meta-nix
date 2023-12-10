FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PV = "3.11.2"


SRCREV = "bc889afb4c5bf1c0d8ee29ef35eaaf4c8bef8a5d"
SRCREV_json-test-data = "a1375cea09d27cc1c4cadb8d00470375b421ac37"
SRCREV_FORMAT = "_json-test-data"

SRC_URI += "\
    file://0001-custom-allocators-define-missing-rebind-type-3895.patch \
    file://0001-tests-unit-iterators2-use-std-ranges-equals-for-rang.patch \
"

do_install_ptest () {
    install -d ${D}${PTEST_PATH}/tests
    cp -r ${S}/json_test_data/ ${D}${PTEST_PATH}/
    cp -r ${B}/tests/test-* ${D}${PTEST_PATH}/tests
    rm -rf ${D}${PTEST_PATH}/json_test_data/.git
}