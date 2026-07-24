package mcframe.serverMABC.MABCL5110;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL5110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SendIfService_MC extends MABCL_SendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendIf_Ins01オペレーション.<p>
	 *
	 * マスタをIF送信する。<br>
	 */
	public class SendIf_Ins01 extends MABCL_SendIfService_MC_A.SendIf_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessageList msgL =new MCMessageList();
			msgL = upChk();
			
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				return;
			}
			
			setDataNo(up0());
			callSendRecvIf(up0());
			
		}
		
		protected MCMessageList upChk() {
			MCMessageList msgL =new MCMessageList();
			msgL.addAll(reqChk());
			msgL.addAll(exstChk());
			return msgL;

		}
		
		/**
		 * 必須チェックを行います。
		 */
		protected MCMessageList reqChk() {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
					SendIf_Ins01_CndR.$if_proc_typ,
					SendIf_Ins01_CndR.$ext_sys_cd };
			
			for (String col : cols) {
				msgL.addAll(check(up0(), col, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		/**
		 * 存在チェックを行います。
		 */
		protected MCMessageList exstChk() {
			MCMessageList msgL = new MCMessageList();
			
			MAM_EXT_SYS_R rsltR = MAM_EXT_SYS_R.create();
			MAM_EXT_SYS_R dbc = MAM_EXT_SYS_R.create();
			dbSelectKey("MABCL5110_MAM_EXT_SYS_S01", rsltR, dbc, up0());
			
			if(isNull(rsltR) || !MAC_EXT_SYS_TYP.isBI(rsltR.ext_sys_typ())) {
				msgL.add(new MCMessage(MABCL0538, up0().ext_sys_cd()));
			}
			
			String biBat = MAC_IF_PROC_TYP.bi_bat(up0().if_proc_typ());
			if(!isSame(biBat, "MABCB0010")) {
				msgL.add(new MCMessage(MABCL0539, up0().if_proc_typ()));
			}
			
			return msgL;
		}

		protected void setDataNo(SendIf_Ins01_CndR up0) {		
			up0.addNumberColumn("data_no", getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value()));
		}

		/**
		 * ESB送信制御処理のオペレーションを実行します。
		 * <p>
		 * 上り電文の各レコードには if_proc_typ, data_no, ext_sys_cd の設定が必要です。
		 * 
		 * @param upR 上り電文
		 */
		protected void callSendRecvIf(MCRow upR) {
			String modId = "PF";
			String lgcId = "PFBZL9050";
			String opeId = "Ins01";

			// オペレーション作成
			MCOperation ope = createOperation(modId, lgcId, opeId, MCOperation.class);
			
			// 上り電文の設定
			MCList<MCRow> up0 = (MCList<MCRow>) ope.up(0);
			MCRow r = up0.createRow();
			r.setValuesByName(upR);
			up0.add(r);
			
			// 実行
			ope.exec();
		}
	}

	//FMCB CUSTOM END
}