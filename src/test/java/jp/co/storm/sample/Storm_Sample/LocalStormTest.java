package jp.co.storm.sample.Storm_Sample;

import org.apache.storm.flux.Flux;

public class LocalStormTest {

	public static void main(String[] args) {
		
		final String confFile = "/storm-sample.yaml";
		
		final int executeTime = 1000 * 60;
		
		try {
			Flux.main(new String[]{ "--local","-R",confFile,"-s",String.valueOf(executeTime) });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		TopologyBuilder builder = new TopologyBuilder();
//		
//		builder.setSpout("spout1", new TestWordSpout(), 3);
//		builder.setBolt("bolt1", new QuestionAddBolt(), 3);
//		builder.setBolt("bolt2", new QuestionAddBolt(), 3);
//		
//		Config config = new Config();
//		config.setDebug(true);
//		
//		if(args != null && args.length > 0) {
//			config.setNumWorkers(3);
//			
//				try {
//					StormSubmitter.submitTopologyWithProgressBar(args[0], config, builder.createTopology());
//				} catch (AlreadyAliveException | InvalidTopologyException | AuthorizationException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//			
//		} else {
//			LocalCluster cluster = new LocalCluster();
//			cluster.submitTopology("test", config, builder.createTopology());
//			Utils.sleep(60000);
//			cluster.killTopology("test");
//			cluster.shutdown();
//		}
//	}

}
