package jp.co.storm.sample.Storm_Sample.bolt;

import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

public class QuestionAddBolt extends BaseRichBolt {

	private static final long serialVersionUID = 1L;

	private OutputCollector collector;
	
	public QuestionAddBolt() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
		// TODO Auto-generated method stub
		this.collector = collector;
	}
	
	@Override
	public void execute(Tuple input) {
		// TODO Auto-generated method stub
		String text = input.getString(0);
		System.out.println("[" + text + "?" + "]");
		collector.emit(new Values(text + "?"));
		collector.ack(input);
	}
	
	@Override
	public void cleanup() {
		// TODO Auto-generated method stub
		super.cleanup();
	}
	
	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		declarer.declare(new Fields("object"));
	}
	
}
