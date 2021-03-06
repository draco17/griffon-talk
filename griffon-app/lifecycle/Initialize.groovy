/*
 * This script is executed inside the EDT, so be sure to
 * call long running code in another thread.
 *
 * You have the following options
 * - SwingBuilder.doOutside { // your code  }
 * - Thread.start { // your code }
 * - SwingXBuilder.withWorker( start: true ) {
 *      onInit { // initialization (optional, runs in current thread) }
 *      work { // your code }
 *      onDone { // finish (runs inside EDT) }
 *   }
 *
 * You have the following options to run code again inside EDT
 * - SwingBuilder.doLater { // your code }
 * - SwingBuilder.edt { // your code }
 * - SwingUtilities.invokeLater { // your code }
 */

import groovy.swing.SwingBuilder
import griffon.util.GriffonPlatformHelper

GriffonPlatformHelper.tweakForNativePlatform(app)
SwingBuilder.lookAndFeel('org.jvnet.substance.skin.SubstanceChallengerDeepLookAndFeel', 'mac', 'nimbus', 'gtk', ['metal', [boldFonts: false]])
//SwingBuilder.lookAndFeel('org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel', 'mac', 'nimbus', 'gtk', ['metal', [boldFonts: false]])
