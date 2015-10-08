Intellij Zurb Foundation 5 plugin
==================================

[![Join the chat at https://gitter.im/manolenso/intellij-foundation5](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/manolenso/intellij-foundation5?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

An IntelliJ plugin containing Zurb foundation 5 live templates! This plugin works for the following JetBrains products:

- IntelliJ IDEA 14 , PhpStorm 8, RubyMine 7
- WebStorm 9
- PyCharm 4
- RubyMine 7
- PhpStorm 8


![Plugin in action](https://github.com/manolenso/intellij-foundation5/blob/master/screencasts/starter-template.gif)



![Icon Bar in action](https://github.com/manolenso/intellij-foundation5/blob/master/screencasts/demo-iconbar.gif)

#### live template Icon Bar in action!

- The [Issues](https://github.com/manolenso/intellij-foundation5/issues) section on GitHub


### Intallation

**Update v 1.6**
_for some of Content components I used Awesome_ [Emmet plugin](http://bit.ly/1DzHjaT)
_you should install Emmet Everywhere if you have not yet!._

To install the plugin open your editor (WebStorm or PHPStorm) and hit:

1) `File > Settings > Plugins` and click on the `Browse repositories` button.

2) Search for `Zurb Foundation 5` then right click and select `Download plugin`.

3) Finally hit the `Apply` button, agree to restart your IDE and you're all done!

4

## contents

 `HTML`
- [CDN](#cdn)
- [STRUCTURE](#structure)
- [NAVIGATION](#navigation)
- [MEDIA](#media)
- [FORMS](#forms)
- [BUTTONS](#buttons)
- [TYPOGRAPHY](#typography)
- [CALLOUTS And PROMPTS](#callouts-and-prompts)
- [CONTENT](#content)
- [UTILITY](#utility)
- [MISCELLANEOUS](#miscellaneous)

### CDN

| Component:group zf-cdn `Ctrl + Space`| Snippet code               |
|--------------------------------- | :-----------------------------:|
| CDN link (CSS or CSS.MIN)      |  zf-cdn-css                   |
| CDN link (ICON or ICON.MIN)    |   zf-cdn-icn                   |
| CDN link (JS  or JS.MIN)       |   zf-cdn-js                    |
| CDN link (JS Library)          |   zf-cdn-lib                   |
| CDN link (JS vendor)           |   zf-cdn-vendor                |

### STRUCTURE

| Component:group zf-st `Ctrl + Space`| Snippet code                |
|----------------------------------| :-----------------------------:|
| row                              |   zf-strow                     |
| basic row                        |   zf-stro                      |
| small-? large-? columns          |   zf-stslc                     |
| small-? medium- large-? columns  |   zf-stsmlc                    |
| small-? columns                  |   zf-stsc                      |
| medium-? columns                 |   zf-stmc                      |
| large-? columns                  |   zf-stlc                      |
| Text Alignment let:              |   zf-stl                       |
| Text Alignment right:            |   zf-str                       |
| Text Alignment center:           |   zf-stc                       |
| Text Alignment justify:          |   zf-stj                       |
| Visibility Classes               |   zf-stsh                      |
| Accessibility Classes            |   zf-stvh                      |
| Block Grid Basic                 |   zf-stbb                      |
| Block Grid Advanced              |   zf-stba                      |

### NAVIGATION

| Component:group zf-nv `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Off-canvas Basic                 |   zf-nvofb              `JS`   |
| Off-canvas Advanced              |   zf-nvofa              `JS`   |
| Top Bar                          |   zf-nvtb               `JS`   |
| Top Bar Sticky                   |   zf-nvtbs              `JS`   |
| Icon Bar (Basic, Accessibility, Accessibility+Text|   zf-nvib     |
| Side Nav          Accessibility  |   zf-nvsn                      |
| Magellan                         |   zf-nvmg               `JS`   |
| Sub Nav           Accessibility  |   zf-nvsbn                     |
| Breadcrumbs       Accessibility  |   zf-nvbrc                     |
| Pagination        Accessibility  |   zf-nvpg                        |


### MEDIA

| Component:group zf-md `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
|Orbit Slider                      |   zf-mdos              `JS`    |
|Thumbnails                        |   zf-md                      |
|Clearing Lightbox                 |   zf-mdcl              `JS`    |
|Flex Video                        |   zf-mdfv                      |

### FORMS

| Component:group zf-fm `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
|Forms                             |   zf-form                      |
|RadioSwitch                       |   zf-fors                      |
|Checkbox                          |   zf-focb                      |
|Range Sliders                     |   zf-fosl              `JS`    |
|Abide Validation                  |   zf-foab              `JS`    |


### BUTTONS

| Component:group zf-bt `Ctrl + Space`  | Snippet code              |
|----------------------------------| :-----------------------------:|
| button (all options)             |   zf-btn                       |
| button group (all options)       |   zf-btg                       |
| button bar group (all options)   |   zf-btbg                      |
| button stack group (all options) |   zf-btsg                      |
| button split [Emmet plugin](http://bit.ly/1DzHjaT)|   zf-btsp              `JS`    |
| button dropdown [Emmet plugin](http://bit.ly/1DzHjaT)|   zf-btdp              `JS`    |




### TYPOGRAPHY

| Component:group zf-tx `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Labels (with clipboard content!) |    zf-tylb                     |


### CALLOUTS And PROMPTS

| Component:group zf-cp `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Reveal Modal                     |  zf-cprm                `JS`   |
| Alerts                           |  zf-cpal                `JS`   |
| Panels                           |  zf-cppn                       |
| Tooltips(with clipboard content!)|  zf-cptt                `JS`   |
| Joyride                          |  zf-cpjr                `JS`   |


### CONTENT

| Component:group zf-ct `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Dropdowns                        |   zf-ctdl              `JS`    |
| Pricing Tables                   |   zf-ctpt              `JS`    |
| Progress Bars                    |   zf-ctpb              `JS`    |
| Tables with [Emmet plugin](http://bit.ly/1DzHjaT)|   zf-cttb       |
| Accordion                        |   zf-ctac              `JS`    |
| Tabs with [Emmet plugin](http://bit.ly/1DzHjaT)|   zf-ctbs `JS`    |
| Equalizer                        |   zf-cteq              `JS`    |


### UTILITY

| Utility                          | Trigger                        |
|----------------------------------| :-----------------------------:|
| text align left & options        |  txtl                          |
| text align center & options      |  txtc                          |
| text align justify & options     |  txtj                          |
| text align right & options       |  txtr                          |
| image placeholder  PLACEHOLD.IT  |  imgpi                         |
| image placeholder PLACEKITTEN    |  imgpk                         |
| image placeholder LOREMPIXEL     |  imgpl                         |
| gallery placeholder LOREMPIXEL [Emmet plugin](http://bit.ly/1DzHjaT)|  imgpg  |                         |


### MISCELLANEOUS

| Component                        | Snippet code                   |
|----------------------------------| :-----------------------------:|
| CDN jquery, js.min + js.min lib  |   zf-jinit                     |
|  + initialize Foundation         |                                |
| Bower Html Template              |   zf-bower                     |
| 283  Foundation Icon Fonts 3     |   fi-                          |



| Inception in (live template)     | Trigger                        |
|----------------------------------| :-----------------------------:|
| add icon bar                     |  ADDicon-item                  |
| add icon bar accessibility       |  ADDicon-accessibility         |
| add icon bar accessibility text  |  ADDicon-accessibility-text    |
| add magellan item                |  ADDmagellan-item              |
| add page navigation              |  ADDpage                       |
| add orbit slider item            |  ADDslider-item                |
| add lightbox item                |  ADDlightbox-item              |
| add thumbnail item               |  ADDthumbnail-item             |
| add email field                  |  ADDemail-field                |
| add name field                   |  ADDname-field                 |
| add password field   (equal to)  |  ADDpassword-field             |
| add submit button                |  ADDsubmit-button              |
| add fieldset                     |  ADDfieldset                   |
| add input                        |  ADDinput                      |
| add input postfix                |  ADDinput-postfix              |
| add right input inline           |  ADDright-input-label          |
| add select box                   |  ADDselect-box                 |
| add textarea                     |  ADDtextarea                   |
| add accordion                    |  ADDaccordion-item             |
| add equalizer                    |  ADDequalizer-item             |
| add joyride                      |  ADDjoyride-item               |
| add joyride End                  |  ADDjoyride-itemend            |
| add small column                 |  ADDsmall-column-item             |
| add large column                 |  ADDlarge-column-item             |
| add medium column                |  ADDmedium-column-item               |
| add small medium large column    |  ADDsmall-medium-large-column-item  |
| add Vcard                        |  ADDvcard-item                 |


Foundation 5 - Intellij Plugin is open-sourced software licenced under the [MIT:Licence](http://opensource.org/licenses/MIT)


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/manolenso/intellij-foundation5/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

