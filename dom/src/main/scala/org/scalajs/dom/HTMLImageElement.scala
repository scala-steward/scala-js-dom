/** All documentation for facades is thanks to Mozilla Contributors at https://developer.mozilla.org/en-US/docs/Web/API
  * and available under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License http://opensource.org/licenses/MIT
  */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** The HTMLImageElement interface provides special properties and methods (beyond the regular HTMLElement interface it
  * also has available to it by inheritance) for manipulating the layout and presentation of &lt;img&gt; elements.
  */
@js.native
@JSGlobal
abstract class HTMLImageElement extends HTMLElement {

  /** Reflects the width HTML attribute, indicating the rendered width of the image in CSS pixels. */
  var width: Int = js.native

  /** Intrinsic height of the image in CSS pixels, if it is available; otherwise, 0. */
  var naturalHeight: Int = js.native

  /** Reflects the alt HTML attribute, indicating fallback context for the image. */
  var alt: String = js.native

  /** Reflects the src HTML attribute, containing the URL of the image. */
  var src: String = js.native

  /** Reflects the usemap HTML attribute, containing a partial URL of a map element. */
  var useMap: String = js.native

  /** Intrinsic width of the image in CSS pixels, if it is available; otherwise, 0. */
  var naturalWidth: Int = js.native

  /** Reflects the height HTML attribute, indicating the rendered height of the image in CSS pixels. */
  var height: Int = js.native

  var href: String = js.native

  /** Reflects the ismap HTML attribute, indicating that the image is part of a server-side image map. */
  var isMap: Boolean = js.native

  /** True if the browser has fetched the image, and it is in a supported image type that was decoded without errors. */
  def complete: Boolean = js.native

  var onload: js.Function1[Event, _] = js.native
}
