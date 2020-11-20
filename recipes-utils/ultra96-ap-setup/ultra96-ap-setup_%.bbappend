FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append_ultra96-zynqmp = " \
    file://0001-ultra96-v2-ap-config.patch \
    file://0002-ultra96-v2-udhcpd-config.patch \
    file://fix-for-my-hw.patch \
    file://settings \
    "

FILES_${PN} += "/var/lib/connman/"

do_install_append () {
    install -d ${D}/var/lib/connman
    install -m 0755 ${WORKDIR}/settings ${D}/var/lib/connman/settings
}

