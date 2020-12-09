DESCRIPTION = "PETALINUX image definition for ultra96v2 boards with wifi."
LICENSE = "MIT"

require recipes-core/images/petalinux-image-common.inc 

IMAGE_FEATURES_append = " package-management"

CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-base-extended"
CORE_IMAGE_EXTRA_INSTALL_append = " wilc"
CORE_IMAGE_EXTRA_INSTALL_append = " wilc3000-fw"
CORE_IMAGE_EXTRA_INSTALL_append = " wpa-supplicant"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-ap-setup"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-misc"
CORE_IMAGE_EXTRA_INSTALL_append = " ultra96-wpa"
CORE_IMAGE_EXTRA_INSTALL_append = " connman"
CORE_IMAGE_EXTRA_INSTALL_append = " connman-tools"
CORE_IMAGE_EXTRA_INSTALL_append = " connman-client"
CORE_IMAGE_EXTRA_INSTALL_append = " bluez5"
CORE_IMAGE_EXTRA_INSTALL_append = " usbutils"
CORE_IMAGE_EXTRA_INSTALL_append = " ethtool"
CORE_IMAGE_EXTRA_INSTALL_append = " i2c-tools"
CORE_IMAGE_EXTRA_INSTALL_append = " parted"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs-resize2fs"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs-e2fsck"
CORE_IMAGE_EXTRA_INSTALL_append = " e2fsprogs-mke2fs"

CORE_IMAGE_EXTRA_INSTALL_append = " xrt"
CORE_IMAGE_EXTRA_INSTALL_append = " xrt-dev"
CORE_IMAGE_EXTRA_INSTALL_append = " zocl"
CORE_IMAGE_EXTRA_INSTALL_append = " opencl-clhpp-dev"
CORE_IMAGE_EXTRA_INSTALL_append = " opencl-headers-dev"
CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-petalinux-opencv"
CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-petalinux-vitisai"
CORE_IMAGE_EXTRA_INSTALL_append = " packagegroup-petalinux-vitisai-dev"

CORE_IMAGE_EXTRA_INSTALL_append = " ros-core"

