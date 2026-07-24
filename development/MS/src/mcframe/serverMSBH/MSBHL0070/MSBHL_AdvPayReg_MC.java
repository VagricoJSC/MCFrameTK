package mcframe.serverMSBH.MSBHL0070;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL5050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBH.MSBHL0070.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_AdvPayReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_AdvPayReg_MC extends MSBHL_AdvPayReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を検索する。<br>
	 */
	public class Srch01 extends MSBHL_AdvPayReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchAdvPayAct();
		}

		@Override
		protected void editListMain() {
			if (down0().isEmpty()) {
				return;
			}
			super.editListMain();

			editAdvPayAct();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 最新ＦＬＧがオンの場合は、一時カラムに検索条件制御用のカラムを追加
			// 念のため、改訂番号をクリアする
			if (up0().latest_flg()) {
				up0().setStringNE("latest_flg_str", toTrueStr(up0().latest_flg()));
				up0().adv_pay_act_rev(null);
			}
			else if (isNull(up0().adv_pay_act_rev())) {
				// 画面で制御しているが、仮に最新ＦＬＧがオフ、改訂番号がnullの場合、
				// サーバエラー(検索結果が１件と想定される箇所で、複数件のデータが検索されました。)が発生するので
				// 検索結果が0件になるように加工する
				up0().setStringNE("latest_flg_str", toFalseStr(up0().latest_flg()));
			}
		}

		/**
		 * 前渡金実績を検索する
		 */
		protected void srchAdvPayAct() {
			int cnt = executeQuery(down0(), MSBHL0070_MST_ADV_PAY_ACT_S01(), up0());
			if (cnt == 0) {
				down0().clear();
				return;
			}

			MCList<Srch01_HdrR> down0 = MCList.create(Srch01_HdrR.class);
			down0.add(down0());

			setValuesDbc(up0(), down0);
		}

		/**
		 * 前渡金実績を編集する
		 */
		protected void editAdvPayAct() {
			Srch01_HdrR hdrR = down0();

			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(hdrR.slip_sts_typ())) {
				hdrR.latest_flg(true);
			}

			hdrR.base_cur_cd(getBaseCur().cur_cd());
			hdrR.base_cur_nm(getBaseCur().cur_nm());
			hdrR.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を新規登録する。<br>
	 */
	public class Ins01 extends MSBHL_AdvPayReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callAdvPayRegChk01();
			throwUpdErr();
			callAdvPayRegIns01();
			setDown();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			up0().peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}

		/**
		 * 前渡金実績サービスの登録・更新可能チェックを実行する。
		 */
		protected void callAdvPayRegChk01() {
			MSBHL_AdvPayRegService.AdvPay_Chk01 o = MSBHL_AdvPayRegService.crtAdvPay_Chk01();
			o.up0().add(up0());
			o.exec();
			MCRow.copyall(up0(), o.down0().get(0));
		}

		/**
		 * 前渡金実績サービスの登録処理を実行する。
		 */
		protected void callAdvPayRegIns01() {
			MSBHL_AdvPayRegService.AdvPay_Ins01 o = MSBHL_AdvPayRegService.crtAdvPay_Ins01();
			o.up0().add(up0());
			o.exec();
			MCRow.copyall(up0(), o.down0().get(0));
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を更新する。<br>
	 */
	public class Upd01 extends MSBHL_AdvPayReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callAdvPayRegChk01();
			throwUpdErr();
			callAdvPayRegUpd01();
			setDown();
		}
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			up0().peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}

		/**
		 * 前渡金実績サービスの登録・更新可能チェックを実行する。
		 */
		protected void callAdvPayRegChk01() {
			MSBHL_AdvPayRegService.AdvPay_Chk01 o = MSBHL_AdvPayRegService.crtAdvPay_Chk01();
			o.up0().add(up0());
			o.exec();
			MCRow.copyall(up0(), o.down0().get(0));
		}

		/**
		 * 前渡金実績サービスの更新処理を実行する。
		 */
		protected void callAdvPayRegUpd01() {
			MSBHL_AdvPayRegService.AdvPay_Upd01 o = MSBHL_AdvPayRegService.crtAdvPay_Upd01();
			o.up0().add(up0());
			o.exec();
			MCRow.copyall(up0(), o.down0().get(0));
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			MCRow.copyvalue(down0(), up0());
		}
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を取り消す。<br>
	 */
	public class Del01 extends MSBHL_AdvPayReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callAdvPayRegChk02();
			throwUpdErr();
			callAdvPayRegDel01();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			up0().peg_no(1);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}

		/**
		 * 前渡金実績サービスの削除可能チェックを実行する。
		 */
		protected void callAdvPayRegChk02() {
			MSBHL_AdvPayRegService.AdvPay_Chk02 o = MSBHL_AdvPayRegService.crtAdvPay_Chk02();
			o.up0().add(up0());
			o.exec();
			MCRow.copyall(up0(), o.down0().get(0));
		}

		/**
		 * 前渡金実績サービスの削除処理を実行する。
		 */
		protected void callAdvPayRegDel01() {
			MSBHL_AdvPayRegService.AdvPay_Del01 o = MSBHL_AdvPayRegService.crtAdvPay_Del01();
			o.up0().add(up0());
			o.exec();
		}
	}
	
	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		setValuesDbc(MSBHL0070_Srch01_HdrR_J01(), upR, down);
	}

	//FMCB CUSTOM END
}