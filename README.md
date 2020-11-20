This README file contains information on the contents of the meta-ultra96v2 layer.
This layer is use for me to create petaliux environment with ros2 and xilinx embedded acceleration platform.

The Official recipes for ultra96v2 and its utilities are [here](https://github.com/Avnet/meta-avnet)  
You can't use with this repository and the official recipes.
(because conflicts with it)

Please see the corresponding sections below for details.

Dependencies
============

Dependencies are described in below.(use with repo)
  URI: https://github.com/akira-nishiyama/petalinux-ros2-manifests

Table of Contents
=================

  I. Adding the meta-ultra96v2 layer to your build  
 II. Misc  
III. License

I. Adding the meta-ultra96v2 layer to your build
=================================================

Run 'bitbake-layers add-layer meta-ultra96v2'

II. Misc
========

Including ultra96v2-zynqmp machine configuration.

Including petalinux-minimal-ultra96v2hw image for hw test.  
Including petalinux-minimal-ultra96v2ros2 image for ros2.

III. License
=================================================
Copyright (c) 2020 Akira Nishiyama, All rights reserved.

This software is released under the MIT License except otherwise indicated, see LICENSE.
