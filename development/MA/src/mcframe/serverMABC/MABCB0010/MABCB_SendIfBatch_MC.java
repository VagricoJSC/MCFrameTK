package mcframe.serverMABC.MABCB0010;

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
import mcframe.serverMABC.MABCL5110.MABCL_SendIfService;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCB_SendIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCB_SendIfBatch_MC extends MABCB_SendIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendIf_Ins01オペレーション.<p>
	 *
	 * 送受信ＩＦテーブルに対象マスタの送信レコードを登録する。<br>
	 */
	public class SendIf_Ins01 extends MABCB_SendIfBatch_MC_A.SendIf_Ins01 {

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			try {
				
				initLogger();
				
				writeStartLog();
				
				execMain();
			}
			catch (Exception ex) {
				
				handleEx(ex);
			}
			finally {
				
				writeEndLog();
			}
		}
		
		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}
		
		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MABCL0536, up0().ext_sys_cd(), up0().if_proc_typ());
			pushStartLog(logger());
		}
		
		/**
		 * 例外処理
		 * @param ex 例外
		 */
		protected void handleEx(Exception ex) {
			
			MCException mcEx;
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			
			logger().writeProcessLog(mcEx);

			_exceptionFlg = true;

			throw mcEx;
		}
		
		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			
			if (_exceptionFlg || hasErrMsg()) {
				MCMessagePool.add(MAUDL0009);
				logger().writeProcessLog(MCMessagePool.getMessageList());
				pushErrorLog(logger());
			}

			logger().writeEndLog(MABCL0537);
			pushEndLog(logger());
			logger().close();
		}

		protected void execMain() {
			MCMessageList msgL = new MCMessageList();
			msgL = reqChk();
			
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				return;
			}
			
			callSendIfServ();
		}
		
		protected MCMessageList reqChk() {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
					SendIf_Ins01_CndR.$ext_sys_cd };
			
			for (String col : cols) {
				msgL.addAll(check(up0(), col, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}

		// マスタ送信IFサービス実行
		protected void callSendIfServ() {
			MABCL_SendIfService.SendIf_Ins01 ope = MABCL_SendIfService.crtSendIf_Ins01();
			copy(ope.up0(), up0(), createMap_SendIf_Ins01_CndR_SendIf_Ins01_CndR());
			
			if(!isNull(up0().if_proc_typ())) {
				ope.exec();
			}
			
			else {
				for(MCRow r : MAC_IF_PROC_TYP.list()) {
					String ifProcTyp = r.getString("if_proc_typ");
					if(isSame(MAC_IF_PROC_TYP.bi_bat(ifProcTyp), "MABCB0010")) {
						if (up0().cfp_flg()) {
							if(MAC_IF_PROC_TYP.is_cfp(ifProcTyp)) {
								ope.up0().if_proc_typ(ifProcTyp);
								ope.exec();
							}
						}
						else {
							if(!MAC_IF_PROC_TYP.is_cfp(ifProcTyp)) {
								ope.up0().if_proc_typ(ifProcTyp);
								ope.exec();
							}
						}
					}
				}
			}
		}

		protected Map_SendIf_Ins01_CndR_SendIf_Ins01_CndR<mcframe.serverMABC.MABCL5110.SendIf_Ins01_CndR,SendIf_Ins01_CndR> createMap_SendIf_Ins01_CndR_SendIf_Ins01_CndR() {
			return new Map_SendIf_Ins01_CndR_SendIf_Ins01_CndR<mcframe.serverMABC.MABCL5110.SendIf_Ins01_CndR, SendIf_Ins01_CndR>();
		}

		public class Map_SendIf_Ins01_CndR_SendIf_Ins01_CndR<D extends mcframe.serverMABC.MABCL5110.SendIf_Ins01_CndR, S extends SendIf_Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(mcframe.serverMABC.MABCL5110.SendIf_Ins01_CndR.$if_proc_typ, SendIf_Ins01_CndR.$if_proc_typ);
				addColumnPathMap(mcframe.serverMABC.MABCL5110.SendIf_Ins01_CndR.$ext_sys_cd, SendIf_Ins01_CndR.$ext_sys_cd);

			}
		}
	}

	//FMCB CUSTOM END
}