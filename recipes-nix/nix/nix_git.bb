require nix.inc

PV = "2.19.2"

SRC_URI = "git://github.com/NixOS/nix.git;nobranch=1;name=nix;protocol=https \
           file://0001-No-documentation.patch \
           file://0005-Install-systemd-files-to-yocto-s-folder.patch \
           file://0006-Don-t-split-nix-into-shared-libs.patch \
           "

SRCREV="50f8f1c8bc019a4c0fd098b9ac674b94cfc6af0d"

SRC_URI[sha256sum] = "c20d36994f686ada8e649a9dc51a32010066eea8a8bd74045985bc9110842773"

LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24 "

# Set S because we are using git not an extracted tarball
S = "${WORKDIR}/git"

