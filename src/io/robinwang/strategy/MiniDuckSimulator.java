package io.robinwang.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model=new ModelDuck();
        model.performFly();
        //策略模式
        //组合 composition 不通过继承实现复用
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}


//        curl 'https://oapi.dingtalk.com/robot/send?access_token=8ef42c37b71860b8bc777dacbf15631302552c854836115afab093fb62abf450' \
//        -H 'Content-Type: application/json' \
//        -d '
//        {"msgtype": "text",
//        "text": {
//        "content": "关键字：observe，请求：curl测试，类型：incoming机器人"
//        }
//        }'