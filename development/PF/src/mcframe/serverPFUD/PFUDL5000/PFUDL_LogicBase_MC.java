package mcframe.serverPFUD.PFUDL5000;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverCore.resource.MCConst;
import mcframe.commonCore.report.container.MCReportSet;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFUDL_LogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFUDL_LogicBase_MC extends PFUDL_LogicBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * OperationBaseオペレーション.<p>
	 *
	 */
	public class OperationBase extends PFUDL_LogicBase_MC_A.OperationBase {

		/**
		 * オペレーション間で共有するコンテナを定義
		 * <p>
		 * 前処理オペレーション→送信オペレーション、 受信オペレーション→後処理オペレーション、などの
		 * オペレーション連携で、電文とは別にオペレーション固有の型のコンテナをやり取りする時に使用します
		 * 
		 */
		public MCList <?>  shareL;

		/**
		 * MCFrameの会社間連携において送受信で共有するコンテナを定義
		 * <p>
		 * データ出力→会社切替→データ書き込みの流れにおいて帳票コンテナを共有するために使用します
		 * 
		 */
		public java.util.ArrayList<MCReportSet> shareRptSetL;
		@Override
		protected void call() {
		}
	}

	/**
	 * ＩＦ処理区分が送信用か判定します
	 * 
	 * @param ifProcTyp
	 * @return
	 */
	protected boolean isSendIf(String ifProcTyp) {
		return MAC_IF_PROC_TYP.is_send(ifProcTyp);
	}

	/**
	 * ＩＦ処理区分が受信用か判定します
	 * 
	 * @param ifProcTyp
	 * @return
	 */
	protected boolean isRecvIf(String ifProcId) {
		return !isSendIf(ifProcId);
	}

	/**
	 * 受信ＩＦテーブルのデータ行No発番用シーケンス名を取得します
	 * 
	 * @param ifProcId
	 * @return
	 */
	protected String getIfSeqTypForDtl(String ifProcTyp) {
		
		return MAC_IF_PROC_TYP.data_lno_seq(ifProcTyp);

	}

	/**
	 * ESB標準アダプタを設定します
	 *  	
	 * @param adptrL
	 */
	protected void setStdAdapter(MCList<MAM_IF_ADAPTER_R> adptrL) {
		for (MAM_IF_ADAPTER_R adptrR : adptrL) {
			setStdAdapter(adptrR, MAM_IF_ADAPTER_R.$file_io_ope);
			setStdAdapter(adptrR, MAM_IF_ADAPTER_R.$conv_ope);
			setStdAdapter(adptrR, MAM_IF_ADAPTER_R.$web_api_ope);
			setStdAdapter(adptrR, MAM_IF_ADAPTER_R.$cmd_exec_ope);
		}
	}

	/**
	 * マスタにアダプタの指定が無い場合、ＥＳＢ標準アダプタを設定します
	 * 
	 * @param ctrlR
	 * @param col
	 */
	protected void setStdAdapter(MAM_IF_ADAPTER_R adptrR, String col) {

		if (isNull(adptrR.getString(col))) {
			if (isSame(col, MAM_IF_ADAPTER_R.$file_io_ope)) {
				adptrR.setString(col, MAC_IF_PROC_TYP.file_io_ope(adptrR.if_proc_typ()));
			}
			else if (isSame(col, MAM_IF_ADAPTER_R.$conv_ope)) {
				adptrR.setString(col, MAC_IF_PROC_TYP.conv_ope(adptrR.if_proc_typ()));
			}
			else if (isSame(col, MAM_IF_ADAPTER_R.$web_api_ope)) {
				adptrR.setString(col, MAC_IF_PROC_TYP.wep_api_ope(adptrR.if_proc_typ()));
			}
			else if (isSame(col, MAM_IF_ADAPTER_R.$cmd_exec_ope)) {
				adptrR.setString(col, MAC_IF_PROC_TYP.cmd_exec_ope(adptrR.if_proc_typ()));
			}
		}

	}

	/**
	 * エラー処理を行います
	 * 
	 * @param e
	 * @param ifL
	 */
	protected void handleEx(Exception e, MCRow ifR) {
		MCList<MCRow> ifL = MCList.create(MCRow.class);
		ifL.add(ifR);
		handleEx(e, ifL);
	}

	/**
	 * エラー処理を行います
	 * 
	 * @param e
	 * @param ifL
	 */
	protected void handleEx(Exception e, MCList<?> ifL) {

		MCException ex = e instanceof MCException ? (MCException)e : new MCException(e);
		if (isNull(ex.getCauseRow())) {
			for (MCRow ifR : ifL) {
				MCMessagePool.add(ifR, null,
					ex.getID(), (Object[])ex.getBindArray());
			}
		}
		else {
			MCMessagePool.add(ex.getCauseRow(), ex.getCauseColumn(),
				ex.getMCMessage().getID(), (Object[])ex.getBindArray());
		}
		for (MCMessage msg : ex.getCauseMessageList()) {
			for (MCRow ifR : ifL) {
				MCMessagePool.add(
					ifR, null, msg.getID(), (Object[])msg.getBindArray());
			}
		}
		if (ex.getCause() != null) {
			Throwable th = ex.getCause();
			MCException cause = th instanceof MCException ? (MCException)th : new MCException(th);
			for (MCRow ifR : ifL) {
				MCMessagePool.add(
					ifR, null, cause.getID(), (Object[])cause.getBindArray());
			}
		}

		MCLog.write(e);
	}

	/**
	 * メッセージプール内のCauseRowを上り電文のRowに置き換えます
	 * 
	 * @param upL
	 */
	protected void setMsgPoolCauseRows(MCList<?> upL) {
		MCIndexKey idx = upL.createIndex(_$ifKey);
		MCMessageList msgL = (MCMessageList)MCMessagePool.getMessageList().clone();
		MCMessagePool.getMessageList().clear();
		for (MCMessage msg : msgL) {
			MCRow r = msg.getCauseRow();
			if (isNull(r)) {
				for (MCRow upR : upL) {
					MCMessage copyMsg = new MCMessage(msg.getID(), (Object[])msg.getBindArray());
					copyMsg.setCauseRow(upR, null);
					MCMessagePool.add(copyMsg);
				}
			}
			else {
				boolean tgtRowExistsKey = true;
				for (String key : _$ifKey) {
					tgtRowExistsKey = r.contains(key);
					if (!tgtRowExistsKey) {
						break;
					}
				}
				if (tgtRowExistsKey) {
					MCRow upR = upL.getFirst(idx, r.toArray(_$ifKey));
					if (!isNull(upR)) {
						msg.setCauseRow(upR, null);
					}
				}
				MCMessagePool.add(msg);
			}
		}
	}

	/**
	 * 帳票用のリソースからラベル名を取得します
	 * 	
	 * @param rptSet
	 * @param blk
	 * @param nm
	 * @return
	 */
	protected String getRptLabel(String mId, String rptId, String blk, String nm) {
		String key = MCConst.createKey(mId, rptId, blk, nm, "label");
		String value = MCConst.repotlbl.getLabel(key); 
		return isNull(value) ? nm : value;
	}

	/**
	 * データベース用のリソースからラベル名を取得します
	 * 
	 * @param tbl
	 * @param nm
	 * @return
	 */
	protected String getDbLabel(String tbl, String nm) {
		String value = MCConst.dblbl.getLabel(tbl + "_ALL", nm.toUpperCase());
		value = nvl(value, MCConst.dblbl.getLabel(tbl, nm.toUpperCase()));
		return nvl(value, nm);
	}

	//FMCB CUSTOM END
}