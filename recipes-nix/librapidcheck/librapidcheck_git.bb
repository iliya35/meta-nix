SUMMARY = "library for property based testing"
DESCRIPTION = "https://github.com/emil-e/rapidcheck."
HOMEPAGE = "https://github.com/emil-e/rapidcheck"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b0f0d6f305e86a85ddf9d58ec8057a8a"

SRCREV = "1c91f40e64d87869250cfb610376c629307bf77d"

SRC_URI = "git://github.com/emil-e/rapidcheck.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${libdir} -DRC_INSTALL_ALL_EXTRAS=ON"

# PACKAGES = "${PN}-dev"
FILES:${PN} = "${libdir}/* ${includedir}/* /usr/share/rapidcheck/"

SYSROOT_DIRS += "${includedir}/*"
SYSROOT_DIRS_NATIVE += "${includedir}/*"
# BBCLASSEXTEND = "native nativesdk"