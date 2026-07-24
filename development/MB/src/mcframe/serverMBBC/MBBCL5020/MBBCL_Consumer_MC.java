package mcframe.serverMBBC.MBBCL5020;

import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.messagequeue.MCConsumer;

public class MBBCL_Consumer_MC implements MCConsumer<MCRow> {

	@Override
	public void execute(MCRow param, boolean isRetry, String messageQueueId) {
		MBBCL_AttachService.Attach_Copy01 ope = MBBCL_AttachService.crtAttach_Copy01();
		ope.up0().msg_queue_id(messageQueueId);
		ope.up0().retry_flg(isRetry);
		ope.exec();
	}

	@Override
	public MCRow createParamRow() {
		MCRow r = MCRow.create();
		return r;
	}
}

