// 把一个 html 元素，转换为相对定位元素，使它能够 左右“震动” shake
// 参数1 ，需要震动的对象，可以是对象或 id ,如果需要让自己震动传 this
// 参数2 ，震动完成时，需要调用的函数
// 参数3 ，设置震动的距离，默认 5 个像素
// 参数4 ，设置震动的时间，默认 500 毫秒
function shake(e, oncomplete, distance, time) {
    // 参数1，判断如果传入的是 id 字符串，通过方法得它的对象
    if (typeof e === "string") e = document.getElementById(e);
    if (!time) time = 500;           //震动时长
    if (!distance) distance = 5;     //震动距离

    var originalStyle = e.style.cssText;      // 保存 震动对象 e 原始的样式
    e.style.position = "relative";            // 设置 震动对象 e 为 相对定位
    var start = (new Date()).getTime();       // 注意：动画开始时间
    animate();                                // 开始动画

    // 动画函数，不断检查消耗的时间，并不断改变 震动对象 e 的位置
    // 如果动画完成，把 震动对象 e 的样式，还原到原始状态
    // 否则，将更新 震动对象 e 的位置，安排它自身重新运行
    function animate() {
        var now = (new Date()).getTime();     // 得到当前时间
        var elapsed = now-start;              // 从开始后，消耗了多长时间
        var fraction = elapsed/time;          // 消耗时间是总时间的几分之几

        if (fraction < 1) {     //如果动画没有完成
            // 根据动画完成比例，计算 震动对象 e 的x 坐标
            // 使用正弦函数将完成的比例乘以 4 pi
            // 所以来回往复 两次
            var x = distance * Math.sin(fraction*4*Math.PI);
            e.style.left = x + "px";

            // 在 25 毫秒后或总时间的最后，尝试再次运行函数
            // 目的是为了产生每秒  40 帧的动画效果
            setTimeout(animate, Math.min(25, time-elapsed));
        }
        else {                  //否则，动画完成
            e.style.cssText = originalStyle  // 恢复原始样式
            if (oncomplete) oncomplete(e);   // 调用完成后的回调函数
        }
    }
}

// 以毫秒级别的时间，将 震动对象 e 从完全不透明，淡出到完全透明
// 在调用函数时假设 e 是完全不透明的
// oncomplete 是一个可选函数，以 震动对象 e 为参数，将在动画结束时调用
// 如果不指定 time , 默认 500 毫秒
// 改函数在 IE 中不能运行
function fadeOut(e, oncomplete, time) {
    if (typeof e === "string") e = document.getElementById(e);
    if (!time) time = 500;

    // 使用 Math.sqrt 作为一个简单的“缓动函数”来创建动画
    // 精巧的“非线性”运动轨迹：先淡出的速度很快，后来变慢，最终完全透明
    var ease = Math.sqrt;

    var start = (new Date()).getTime();    // 注意：动画开始时间
    animate();                             // 动画开始

    function animate() {
        var elapsed = (new Date()).getTime()-start; // 消耗的时间
        var fraction = elapsed/time;                // 总时间的几分之几
        if (fraction < 1) {     // 如果动画完成
            var opacity = 1 - ease(fraction);  // 计算元素的不透明度
            e.style.opacity = String(opacity); // 把不透明度，设置在 震动对象 e 上  
            setTimeout(animate,                // 调用下一帧
                       Math.min(25, time-elapsed));
        }
        else {                  // 否则，动画完成
            e.style.opacity = "0";          // 使震动对象 e 完全透明
            if (oncomplete) oncomplete(e);  // 调用完成后的回调函数 callback
        }
    }
}
