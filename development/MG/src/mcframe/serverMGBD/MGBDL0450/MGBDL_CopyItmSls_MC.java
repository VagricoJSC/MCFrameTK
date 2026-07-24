package mcframe.serverMGBD.MGBDL0450;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBD.MGBDL0450.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0450.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CopyItmSls"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CopyItmSls_MC extends MGBDL_CopyItmSls_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象を検索します。<br>
	 */
	public class Srch01 extends MGBDL_CopyItmSls_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchSls();
		}

		protected void editUp(){
			//未存在
			up0().addStringColumn("no_exist_flg_str", toTrueStr(up0().no_exist_flg()));
			//存在(変更有)
			up0().addStringColumn("change_flg_str", toTrueStr(up0().change_flg()));
			//存在(変更無)
			// no_exist_flg_str = 0 且つ  change_flg_str = 0
			up0().addStringColumn("exist_flg_str", toFalseStr(!up0().exist_flg()));

			//エラー
			up0().addStringColumn("imp_err_flg_str", toTrueStr(up0().imp_err_flg()));

			setGrpFlg(up0(), "itm_grp");
		}

		protected void srchSls() {
			executeQuery(down0(), MGBDL0450_MGW_IMP_ITM_SLS_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象を作成するために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBDL_CopyItmSls_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			if (up0().cmn_flg()) {
				up0().wg_cd(MAC_STR.NULL_VAL.value());
			}
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			//共通モードの場合はWGの存在（ListLogic）チェックは不要
			if (up0().cmn_flg()) {
				if (container == up0() && isSame(column, Chk01_CndR.$wg_cd)) {
					return true;
				}
			}
			return super.skipListLogicCheck(container, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// DACチェック 
				if(up0().wg_flg()) {
					msgL.addAll(checkWritableWgCdDac(up0(), Chk01_CndR.$wg_cd));
				}
			}
			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 原価品目販売単価に取込むために、チェックを行う。<br>
	 */
	public class Chk02 extends MGBDL_CopyItmSls_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			if (up0().cmn_flg()) {
				up0().wg_cd(MAC_STR.NULL_VAL.value());
				up1().forEach(r -> r.wg_cd(MAC_STR.NULL_VAL.value()));
			}
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			//共通モードの場合はWGの存在（ListLogic）チェックは不要
			if (up0().cmn_flg()) {
				if (container == up0() && isSame(column, Chk02_DtlR.$wg_cd)) {
					return true;
				}
			}
			return super.skipListLogicCheck(container, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// DACチェック 
				if(up0().wg_flg()) {
					msgL.addAll(checkWritableWgCdDac(up0(), Chk02_DtlR.$wg_cd));
				}
			}
			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 原価品目販売単価に一括で取り込むために、チェックを行う。<br>
	 */
	public class Chk03 extends MGBDL_CopyItmSls_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			if (up0().cmn_flg()) {
				up0().wg_cd(MAC_STR.NULL_VAL.value());
			}
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			//共通モードの場合はWGの存在（ListLogic）チェックは不要
			if (up0().cmn_flg()) {
				if (container == up0() && isSame(column, Chk03_CndR.$wg_cd)) {
					return true;
				}
			}
			return super.skipListLogicCheck(container, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// DACチェック 
				if(up0().wg_flg()) {
					msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));
				}
			}
			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象を作成します。<br>
	 */
	public class Ins01 extends MGBDL_CopyItmSls_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// チェック処理
			callThisChk01();

			// エラーがあれば例外throw
			throwUpdErr();

			// 取込対象作成サービス実行
			callCopyItmSlsSrv();
		}

		/** チェック処理を実行する */
		protected void callThisChk01() {
			MGBDL_CopyItmSls.Chk01 ope = MGBDL_CopyItmSls.crtChk01();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyvalue(up0(), ope.down0());
		}

		/** 取込対象作成サービスを実行する */
		protected void callCopyItmSlsSrv() {
			mapUpContainers(CID);
			ins.exec();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象から対象を選択して原価品目販売単価へ取り込みます。<br>
	 */
	public class Upd01 extends MGBDL_CopyItmSls_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if(up0().isEmpty()) {
				return;
			}

			// チェック処理
			callThisChk02();

			// エラーがあれば例外throw
			throwUpdErr();

			// 取込サービス実行
			callCopyItmSlsSrv();
		}

		/** チェック処理を実行する */
		protected void callThisChk02() {
			MGBDL_CopyItmSls.Chk02 ope = MGBDL_CopyItmSls.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());

			ope.exec();

			MCRow.copyvalue(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/** 選択取込サービスを実行する */
		protected void callCopyItmSlsSrv() {
			mapUpContainers(CID);
			upd.exec();
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象から全件原価品目販売単価へ取り込みます。<br>
	 */
	public class Upd02 extends MGBDL_CopyItmSls_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			// チェック処理
			callThisChk03();

			// エラーがあれば例外throw
			throwUpdErr();

			// 一括取込サービス実行
			callCopyItmSlsSrv();

		}

		/** チェック処理を実行する */
		protected void callThisChk03() {
			MGBDL_CopyItmSls.Chk03 ope = MGBDL_CopyItmSls.crtChk03();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyvalue(up0(), ope.down0());
		}

		/** 一括取込サービスを実行する */
		protected void callCopyItmSlsSrv() {
			mapUpContainers(CID);
			upd.exec();
		}
	}

	//FMCB CUSTOM END
}