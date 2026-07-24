package mcframe.serverMAUC.MAUCL5010;

import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

public class MAUCL_PushNtcInfo_MC {

	protected int pegNo = 0;

	protected MAUCL_PushNtcRegService.PushNtc_Upd01 ope = null;

	protected void setPegNo(int pegNo) {
		this.pegNo = pegNo;
	}

	protected void setOpe(MAUCL_PushNtcRegService.PushNtc_Upd01 ope) {
		this.ope = ope;
	}

	protected void crtHdr(MAC_PUSH_NTC_TYP typ) {
		PushNtc_Upd01_Dtl1R dtl1R = PushNtc_Upd01_Dtl1R.create();
		dtl1R.peg_no(pegNo);
		dtl1R.push_ntc_typ(typ.value());
		dtl1R.src_module_id(MCSys.request.moduleId());
		dtl1R.src_logic_id(MCSys.request.logicId());
		dtl1R.src_operation_id(MCSys.request.operationId());
		ope.up0().add(dtl1R);
	}

	public void addWg(String wgCd, MCDate masterDt) {
		if (isNull(wgCd)) {
			return ;
		}

		PushNtc_Upd01_Dtl2R dtl2R = PushNtc_Upd01_Dtl2R.create();
		dtl2R.peg_no(pegNo);
		dtl2R.ntc_wg_cd(wgCd);
		dtl2R.master_dt(masterDt);
		ope.up1().add(dtl2R);
	}

	public void addDpt(String dptCd, MCDate masterDt) {
		if (isNull(dptCd)) {
			return ;
		}

		PushNtc_Upd01_Dtl2R dtl2R = PushNtc_Upd01_Dtl2R.create();
		dtl2R.peg_no(pegNo);
		dtl2R.ntc_dpt_cd(dptCd);
		dtl2R.master_dt(masterDt);
		ope.up1().add(dtl2R);
	}

	public void addAprvRole(String aprvRoleCd, MCDate masterDt) {
		if (isNull(aprvRoleCd)) {
			return ;
		}

		PushNtc_Upd01_Dtl2R dtl2R = PushNtc_Upd01_Dtl2R.create();
		dtl2R.peg_no(pegNo);
		dtl2R.ntc_aprv_role_cd(aprvRoleCd);
		dtl2R.master_dt(masterDt);
		ope.up1().add(dtl2R);
	}

	public void addUsr(String usrCd, MCDate masterDt) {
		if (isNull(usrCd)) {
			return ;
		}

		PushNtc_Upd01_Dtl2R dtl2R = PushNtc_Upd01_Dtl2R.create();
		dtl2R.peg_no(pegNo);
		dtl2R.ntc_usr_cd(usrCd);
		dtl2R.master_dt(masterDt);
		ope.up1().add(dtl2R);
	}

	public void setMsg(MCMessage msg) {
		String col = PushNtc_Upd01_Dtl1R.$peg_no;
		ope.up0().getFirst(col, MCNumber.valueOf(pegNo)).msg_id(msg.getID());
		for (String bind : msg.getBindArray()) {
			PushNtc_Upd01_Dtl3R dtl3R = PushNtc_Upd01_Dtl3R.create();
			dtl3R.peg_no(pegNo);
			dtl3R.bind_val(bind);
			ope.up2().add(dtl3R);
		}
	}

	public void addScrBind(Comparable<?>... vals) {
		for (Comparable<?> val : vals) {
			PushNtc_Upd01_Dtl4R dtl4R = PushNtc_Upd01_Dtl4R.create();
			dtl4R.peg_no(pegNo);
			dtl4R.data_val(conv(val));
			ope.up3().add(dtl4R);
		}
	}

	protected String conv(Comparable<?> c) {
		if (c == null) {
			return null;
		}
		else if (c instanceof String) {
			return ((String) c);
		}
		else if (c instanceof MCNumber) {
			return ((MCNumber) c).toSimpleString();
		}
		else if (c instanceof MCDate) {
			return ((MCDate) c).toString();
		}
		else if (c instanceof MCTimestamp) {
			return ((MCTimestamp) c).toString();
		}
		else if (c instanceof Boolean) {
			return MCBooleanUtil.booleanToDBString((Boolean) c);
		}
		else {
			return c.toString();
		}
	}

}
