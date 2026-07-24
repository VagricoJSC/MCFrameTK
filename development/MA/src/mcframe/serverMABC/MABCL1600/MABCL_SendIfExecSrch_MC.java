package mcframe.serverMABC.MABCL1600;

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
import mcframe.serverMABC.MABCL1600.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMABC.MABCL1600.Query.*;
import java.util.Map;
import java.util.HashMap;
import mcframe.serverMAUC.MAUCL5030.*;
import mcframe.serverCore.requester.cooperate.MCCooperateInvokeManager;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SendIfExecSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SendIfExecSrch_MC extends MABCL_SendIfExecSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 更新処理をする<br>
	 */
	public class Upd01 extends MABCL_SendIfExecSrch_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
			down0().setAll(up0());
		}
		
		@Override
		protected void doIt() {
			execMain();
		}
		
		protected void execMain() {
			MCIndexKey idxKey = up0().createIndex(Upd01_DtlR.$co_cd);
			MCList<Upd01_DtlR> coCdL = up0().groupBy(Upd01_DtlR.$co_cd);
			
			// オペレーション上り電文設定・実行
			for (Upd01_DtlR coCdR : coCdL) {
				MCList<Upd01_DtlR> tgtL = up0().subList(idxKey, coCdR.co_cd());
				for (Upd01_DtlR tgtR : tgtL) {
					Map<String, MCOperation> operationMap = new HashMap<String, MCOperation>();
					MCMessageList tmpMsgL = new MCMessageList();
					
					// オペレーション電文設定
					MAUCL_IfCmnService.MultiExec_Upd02 ope = MAUCL_IfCmnService.crtMultiExec_Upd02();
					ope.up0().if_proc_typ(tgtR.if_proc_typ());
					ope.up0().exec_co_cd(tgtR.exec_co_cd());
					operationMap.put(tgtR.co_cd(), ope);
					
					try {
						// オペレーション実行
						Map<String, MCMessageList> msgMap = MCCooperateInvokeManager.exec(operationMap);
						for (MCMessageList msgL : msgMap.values()) {
							tmpMsgL.addAll(msgL);
						}
					}
					catch (MCException e) {
						throw e;
					}
					
					// 処理結果設定
					MCOperation opeDown = operationMap.get(coCdR.co_cd());
					MCRow down0R= (MCRow)opeDown.down(0);
					
					if (!down0R.getBooleanNE("rslt_flg")) {
						boolean msgExistFlg = false;
						tgtR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
						// 発生したエラーをエラーメッセージより特定
						for (int i = 0; i < tmpMsgL.size(); i++ ) {
							MCMessage msg = tmpMsgL.get(i);
							MCRow msgR = msg.getCauseRow();
							if (!isNull(msgR)
									&& isSame(tgtR.exec_co_cd(), msgR.getStringNE("exec_co_cd"))
									&& isSame(tgtR.if_proc_typ(), msgR.getStringNE("if_proc_typ"))
									&& isSame(tgtR.co_cd(), msg.getBind(2))) {
								MCMessagePool.add(msg);
								msgExistFlg = true;
								msg.setCauseRow(tgtR, null);
								tmpMsgL.clear();
								break;
							}
						}
						// 特定できないエラーだった場合
						if (!msgExistFlg) {
							MCMessagePool.add(new MCMessage(tgtR, null, MAUCL0121, tgtR.if_proc_typ(), tgtR.co_cd(), tgtR.exec_co_cd()));
						}
					}
					else {
						// 処理結果設定：OK
						tgtR.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					}
				}
			}
		}
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
	 */
	public class Srch01 extends MABCL_SendIfExecSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			executeQuery(down0(), MABCL1600_MAT_BLNK_BAT_CNTL_S01(), up0());
		}
	}

	//FMCB CUSTOM END
}