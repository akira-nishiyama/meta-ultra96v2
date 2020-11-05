DESCRIPTION = "PETALINUX image definition for ultra96v2 boards with wifi."
LICENSE = "MIT"

require recipes-core/images/petalinux-image-common.inc 

CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-base-extended"
CORE_IMAGE_EXTRA_INSTALL_append = " wilc"
CORE_IMAGE_EXTRA_INSTALL_append = " wilc3000-fw"
CORE_IMAGE_EXTRA_INSTALL_append = " wpa-supplicant"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-ap-setup"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-misc"
CORE_IMAGE_EXTRA_INSTALL_append = " bluez5"
CORE_IMAGE_EXTRA_INSTALL_append = " usbutils"
CORE_IMAGE_EXTRA_INSTALL_append = " ethtool"
CORE_IMAGE_EXTRA_INSTALL_append = " i2c-tools"

