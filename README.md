Intellij Zurb Foundation 5 plugin
==================================

An IntelliJ plugin containing Zurb foundation 5 live templates! This plugin works for the following JetBrains products:

- IntelliJ IDEA
- WebStorm 9
- RubyMine 7.0.2
- PhpStorm (probably, but not tested!)


![Plugin in action](https://github.com/manolenso/intellij-foundation5/blob/master/screencasts/starter-template.gif)

- The [Issues](https://github.com/manolenso/intellij-foundation5/issues) section on GitHub


### Intallation

To install the plugin open your editor (WebStorm or PHPStorm) and hit:

1) `File > Settings > Plugins` and click on the `Browse repositories` button.

2) Search for `Zurb Foundation 5` then right click and select `Download plugin`.

3) Finally hit the `Apply` button, agree to restart your IDE and you're all done!

## contents
- [CDN](#cdn)
- [STRUCTURE](#structure)
- [BUTTONS](#buttons)

### CDN

| Component                      | Snippet code                   |
|------------------------------- | :-----------------------------:|
| CDN link (CSS or CSS.MIN)      | zf-cdn.css                     |
| CDN link (ICON or ICON.MIN)    | zf-cdn.icn                     |
| CDN link (JS  or JS.MIN)       | zf-cdn.js                      |
| CDN link (JS Library)          | zf-cdn.lib                     |
| CDN link (JS vendor)           | zf-cdn.vendor                  |

### STRUCTURE

| Component                        | Snippet code                   |
|----------------------------------| :-----------------------------:|
| row                              | zf-row                         |
| small-? large-?  columns         | zf-sl                          |
| small-? medium- large-? columns  | zf-sml                         |
| small-? columns                  | zf-s                           |
| medium-? columns                 | zf-m                           |
| large-? columns                  | zf-l                           |

### BUTTONS

| Component                        | Snippet code                   |
|----------------------------------| :-----------------------------:|
| button basic                     | zf-bt                          |
| button sizing                    | zf-bts                         |
| button colors                    | zf-btc                         |
| button group (all options)       | zf-btg                         |
| button bar group (all options)   | zf-btbg                        |
| button stack group (all options) | zf-btsg                        |
| button split (all options)       | zf-btsp [!JS.USE](#js.use)     |
| button dropdown (all options)    | zf-btdp [!JS.USE](#js.use)     |

### JS.USE

| Component                        | Snippet code                   |
|----------------------------------| :-----------------------------:|
| CDN js.min + js.min lib          | zf-js.init                     |
|  + initialize Foundation         |                                |


Foundation 5 - Intellij Plugin is open-sourced software licenced under the [MIT:Licence](http://opensource.org/licenses/MIT)