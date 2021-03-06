(function (a) {
    a.fn.extend({elastic: function () {
        var b = ["paddingTop", "paddingRight", "paddingBottom", "paddingLeft", "fontSize", "lineHeight", "fontFamily", "width", "fontWeight"];
        return this.each(function () {
            function m(e, d) {
                curratedHeight = Math.floor(parseInt(e, 10));
                h.height() != curratedHeight && h.css({height: curratedHeight + "px", overflow: d})
            }

            function j() {
                var e = h.val().replace(/&/g, "&amp;").replace(/ /g, "&nbsp;").replace(/<|>/g, "&gt;").replace(/\n/g, "<br />"), d = c.html().replace(/<br>/ig, "<br />");
                if (e + "&nbsp;" != d) {
                    c.html(e + "&nbsp;");
                    if (Math.abs(c.height() + g - h.height()) > 3) {
                        e = c.height() + g;
                        if (e >= p) {
                            m(p, "auto")
                        } else {
                            e <= o ? m(o, "hidden") : m(e, "hidden")
                        }
                    }
                }
            }

            if (this.type != "textarea") {
                return false
            }
            var h = a(this), c = a("<div />").css({position: "absolute", display: "none", "word-wrap": "break-word"}), g = parseInt(h.css("line-height"), 10) || parseInt(h.css("font-size"), "10"), o = parseInt(h.css("height"), 10) || g * 3, p = parseInt(h.css("max-height"), 10) || Number.MAX_VALUE, n = 0;
            if (p < 0) {
                p = Number.MAX_VALUE
            }
            c.appendTo(h.parent());
            for (n = b.length; n--;) {
                c.css(b[n].toString(), h.css(b[n].toString()))
            }
            h.css({overflow: "hidden"});
            h.bind("keyup change cut paste", function () {
                j()
            });
            h.live("input paste", function () {
                setTimeout(j, 250)
            });
            j()
        })
    }})
})(jQuery);