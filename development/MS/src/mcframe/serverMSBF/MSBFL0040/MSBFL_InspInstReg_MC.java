package mcframe.serverMSBF.MSBFL0040;

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
import mcframe.serverMS.dbc.*;
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
import mcframe.serverMSBF.MSBFL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5020.*;
import mcframe.serverMSBF.MSBFL5330.*;
import static mcframe.serverMSBF.MSBFL0040.Query.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSUC.MSUCL0090.*;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspInstReg_MC extends MSBFL_InspInstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査予定情報を検索する。<br>
	 */
	public class Srch01 extends MSBFL_InspInstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検査指図登録用情報取得
			int cnt = srchHdr();
			if (cnt <= 0) {
				return ;
			}

			// 検査予定情報取得
			srchDtlSchd();

			// マスタ関連情報でデフォルト値設定
			srchMstInfo();

			setLimsFlg();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// ヘッダ情報編集
			editHdr();

			// 抜取指図数に抜取予定数を設定
			if (!isNull(down0().insp_mtd_typ()) && !MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
				down1().setColumnValue(Srch01_DtlSchdR.$smpl_inst_qty, Srch01_DtlSchdR.$smpl_schd_qty);
			}
		}

		/**
		 * 検査予定から検査指図登録用情報を取得する。
		 * @return 件数
		 */
		protected int srchHdr() {
			int cnt = executeQuery(down0(), MSBFL0040_MST_INSP_SCHD_S01(), up0().get(0));
			return cnt;
		}

		/**
		 * 検査予定情報を取得する。
		 */
		protected void srchDtlSchd() {
			for (Srch01_CndR cndR : up0()) {
				Srch01_DtlSchdR dtlSchdR = Srch01_DtlSchdR.create();
				executeQuery(dtlSchdR, MSBFL0040_MST_INSP_SCHD_S02(), cndR);
				down1().add(dtlSchdR);
			}
		}

		/**
		 * 検査予定情報を元に、検査指図コンテナを編集する。<br>
		 * ※複数の予定が存在する場合を考慮した処理を行う。<br>
		 */
		protected void editHdr() {
			//基準単位数量の合計値を設定。
			down0().base_unit_qty((MCNumber)down1().sum(Srch01_DtlSchdR.$base_unit_qty));
			//最も「早い」検査開始予定日時を設定。
			down0().st_dt((MCDate)down1().min(Srch01_DtlSchdR.$st_dt));
			down0().st_hm((MCDate)down1().min(Srch01_DtlSchdR.$st_hm));
			//最も「遅い」検査終了予定日時を設定。
			down0().end_dt((MCDate)down1().max(Srch01_DtlSchdR.$end_dt));
			down0().end_hm((MCDate)down1().max(Srch01_DtlSchdR.$end_hm));
			//最も「遅い」マスタ適用日を設定。
			down0().master_dt((MCDate)down1().max(Srch01_DtlSchdR.$master_dt));
			//検査予定ＮＯを設定
			if (down1().size() > 1) {
				down0().insp_schd_no(null);
				down0().loc_cd(null);
				down0().loc_nm(null);
			}
		}

		/**
		 * マスタ関連情報を取得し、デフォルト値を設定する。
		 */
		protected void srchMstInfo() {
			MSBFL_InspInstReg.Srch03 srch03 = MSBFL_InspInstReg.crtSrch03();
			
			srch03.up0().itm_cd(down0().itm_cd());
			srch03.up0().itm_sub1(down0().itm_sub1());
			srch03.up0().itm_sub2(down0().itm_sub2());
			srch03.up0().itm_sub3(down0().itm_sub3());
			srch03.up0().master_dt(down0().master_dt());
			srch03.up0().loc_cd(down1().get(0).loc_cd());
			srch03.up0().mfg_loc_cd(down0().mfg_loc_cd());
			srch03.up0().sppl_cd(down0().sppl_cd());
			srch03.up0().maker_cd(down0().maker_cd());
			srch03.up0().insp_typ(down0().insp_typ());
			srch03.up0().insp_ptn_cd(down0().insp_ptn_cd());
			
			srch03.exec();

			copy(down0(), srch03.down0(), createMap_Srch01_HdrR_Srch03_RsltR());

			down0().is_invalid_insp_ptn_flg(isNull(down0().insp_ptn_cd()));

			// 検査パタンＣＤのデフォルト値がない場合、検査状況区分により、検査方法区分を固定する。
			if (down0().is_invalid_insp_ptn_flg()) {
				getItmSite(down0());
				if (MSC_INSP_TYP.isLOT(down0().insp_typ())) {
					down0().insp_mtd_typ(MAC_INSP_MTD_TYP.SMPL.value());
				}
				else if (MSC_INSP_TYP.isPRCD(down0().insp_typ())) {
					down0().insp_mtd_typ(MAC_INSP_MTD_TYP.SPEC.value());
				}
			}

			if (MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
				down0().insp_bind_typ(MAC_INSP_BIND_TYP.ACT.value());
			}
			else {
				if (MAC_INSP_MTD_TYP.isSPEC(down0().insp_mtd_typ())) {
					down2().setAll(srch03.down1());
				}
			}
		}

		protected void getItmSite(Srch01_HdrR down) {
			MAM_ITM_SITE_R itmSiteR = MAM_ITM_SITE_R.create("itmSiteR");
			MCQueryApiBuilder itmInspL_bldr = MCQueryApiBuilder.create(itmSiteR);
			itmInspL_bldr.setSelect(itmSiteR.plnt_aprv_flg);
			itmInspL_bldr.addSelect(itmSiteR.itm_cd);
			itmInspL_bldr.addSelect(itmSiteR.itm_sub1);
			itmInspL_bldr.addSelect(itmSiteR.itm_sub2);
			itmInspL_bldr.addSelect(itmSiteR.itm_sub3);
			itmInspL_bldr.addSelect(itmSiteR.site_cd);
			itmInspL_bldr.setWhere(itmSiteR.itm_cd.eq(value(down.itm_cd())));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.itm_sub1.eq(value(down.itm_sub1())));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.itm_sub2.eq(value(down.itm_sub2())));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.itm_sub3.eq(value(down.itm_sub3())));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.site_cd.eq(value(down.to_site_cd())));
			dbSelect("MSBFL0040_MAM_ITM_SITE_S01", itmSiteR, itmInspL_bldr);
			if (!isNull(itmSiteR)) {
				down.plnt_aprv_flg(itmSiteR.plnt_aprv_flg());
			}
		}

		protected void setLimsFlg() {
			if (down0().insp_aprv_flg()){
				return;
			}

			down0().lims_flg(isLims(down0(), down1()));
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 検査指図情報を検索する。<br>
	 */
	public class Srch02 extends MSBFL_InspInstReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol();

			// 検査指図情報の取得
			int cnt = srchHdr();
			if (cnt <= 0) {
				return;
			}

			// 検査予定情報の取得
			srchDtlSchd();

			// 検査指図の検査方法区分：抜取規格検査の場合、規格検査指図情報取得
			if (MAC_INSP_MTD_TYP.isSPEC(down0().insp_mtd_typ())) {
				srchDtlStd();
			}

			// マスタ関連情報でデフォルト値設定
			srchMstInfo();

			setLimsFlg();
		}

		@Override
		protected void editListMain() {
			super.editListMain();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			setOpe();
		}
		
		protected void setOpe() {
			// 検索時に動的にDACを設定するための条件
			up0().addStringColumn("LOGIN_USR_CD", mcframe.serverCore.sys.MCSys.user.ID());
			up0().addDateColumn("DT", getToday());
			if (isSame(up0().ope(), "2")) {
				up0().addStringColumn("OPE_VAL", "2");
			}
			else if (isSame(up0().ope(), "3")) {
				up0().addStringColumn("OPE_VAL", "3");
			}
			else {
				up0().addStringColumn("OPE_VAL", "1");
			}
		}

		/**
		 * マスタ関連情報を取得し、デフォルト値を設定する。
		 */
		protected void srchMstInfo() {
			MSBFL_InspInstReg.Srch03 srch03 = MSBFL_InspInstReg.crtSrch03();
			
			srch03.up0().itm_cd(down0().itm_cd());
			srch03.up0().itm_sub1(down0().itm_sub1());
			srch03.up0().itm_sub2(down0().itm_sub2());
			srch03.up0().itm_sub3(down0().itm_sub3());
			srch03.up0().master_dt(down0().master_dt());
			srch03.up0().to_site_cd(down0().to_site_cd());
			srch03.up0().mfg_loc_cd(down0().mfg_loc_cd());
			srch03.up0().sppl_cd(down0().sppl_cd());
			srch03.up0().maker_cd(down0().maker_cd());
			srch03.up0().insp_typ(down0().insp_typ());
			srch03.up0().insp_ptn_cd(down0().insp_ptn_cd());

			srch03.exec();

			down0().is_invalid_insp_ptn_flg(isNull(down0().insp_ptn_cd()));

			down0().master_plnt_aprv_flg(srch03.down0().plnt_aprv_flg());
		}

		protected void setLimsFlg() {
			boolean isLims = isLims(down0(), down1());

			if (down0().insp_aprv_flg()){
				down0().aprv_lims_flg(isLims);
				down0().last_aprv_lims_flg(down0().getBooleanNE("tmp_last_lims_flg"));
			}
			else {
				down0().lims_flg(isLims);
				down0().last_lims_flg(down0().getBooleanNE("tmp_last_lims_flg"));
			}
		}

		/**
		 * 検査指図情報を取得する。
		 * @return 検査指図情報件数
		 */
		protected int srchHdr() {
			down0().addBooleanColumn("tmp_last_lims_flg", false);
			return executeQuery(down0(), MSBFL0040_MST_INSP_INST_S01(), up0());
		}

		/**
		 * 検査予定情報を取得する。
		 */
		protected void srchDtlSchd() {
			executeQuery(down1(), MSBFL0040_MST_INSP_SCHD_S02(), up0());
		}

		/**
		 * 規格検査指図情報を取得する。
		 */
		protected void srchDtlStd() {
			executeQuery(down2(), MSBFL0040_MST_STD_INSP_INST_S01(), up0());
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * マスタ取得処理(マスタ適用日変更時)<br>
	 */
	public class Srch03 extends MSBFL_InspInstReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// マスタ再取得
			callInspInstServiceSrch01();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// 検査予定から検索時に検査パタン[上り電文]が設定されなかった場合、デフォルト値で設定する。
			if (isNull(up0().insp_ptn_cd())) {
				up0().insp_ptn_cd(down0().insp_ptn_cd());
			}
		}

		/**
		 * マスタ再取得処理を呼び出す。
		 */
		protected void callInspInstServiceSrch01() {
			MSBFL_InspInstService.InspInst_Srch01 ope = MSBFL_InspInstService.crtInspInst_Srch01();

			copy(ope.up0(), up0(), createMap_InspInst_Srch01_CndR_Srch03_CndR());

			ope.exec();

			copy(down0(), ope.down0(), createMap_Srch03_RsltR_InspInst_Srch01_RsltR());

			addAll(down1(), ope.down1(), createMap_Srch01_DtlStdR_InspInst_Srch01_DtlStdR());
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * マスタ取得処理(検査パタン変更時)<br>
	 */
	public class Srch04 extends MSBFL_InspInstReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// マスタ再取得
			callInspInstServiceSrch01();
		}

		/**
		 * マスタ再取得処理を呼び出す。
		 */
		protected void callInspInstServiceSrch01() {
			MSBFL_InspInstService.InspInst_Srch01 ope = MSBFL_InspInstService.crtInspInst_Srch01();

			copy(ope.up0(), up0(), createMap_InspInst_Srch01_CndR_Srch03_CndR());

			ope.exec();

			copy(down0(), ope.down0(), createMap_Srch03_RsltR_InspInst_Srch01_RsltR());

			addAll(down1(), ope.down1(), createMap_Srch01_DtlStdR_InspInst_Srch01_DtlStdR());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行う。<br>
	 */
	public class Chk01 extends MSBFL_InspInstReg_MC_A.Chk01 {
		/**
		 * 場所マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
		/**
		 * 場所マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			// 下り電文設定
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック、値の補完
			msgL.addAll(chkSchdUpdCnt());

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (up0().err_flg()) {
				return msgL;
			}

			// 場所の更新権限のチェック
			msgL.addAll(dacChk());
			// 条件付チェック
			msgL.addAll(chkItmsWithCnd());
			// まとめ可能チェック
			msgL.addAll(chkCanCollect());
			// 規格検査指図チェック
			msgL.addAll(chkStdInsp());
			// 検査方法区分チェック
			msgL.addAll(chkInspMtdTyp());
			// 工場出荷承認役割ＣＤチェック
			msgL.addAll(chkPlntAprvRoleCd());
			msgL.addAll(chkSummaryInspSchd());

			return msgL;
		}

		/**
		 * 検査予定の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkSchdUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_schd_no);
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_SCHD_S01", selectL, selectL_bldr, up2());

			// キャッシュ
			initMasterData(selectL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (Chk01_DtlSchdR schdR : up2()) {
				MST_INSP_SCHD_R selectR = selectL.getFirst(idxkey, schdR.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(schdR, Chk01_DtlSchdR.$upd_cntr, selectR));
				setErrFlg(schdR, msgL);
				if (schdR.err_flg() && !up0().err_flg()) {
					up0().err_flg(true);
					break;
				}
				if (!isNull(selectR)) {
					schdR.insp_freq(selectR.insp_freq());
					schdR.src_no1(selectR.src_no1());
					schdR.src_no2(selectR.src_no2());
					schdR.insp_typ(selectR.insp_typ());
					schdR.insp_mtd_typ(selectR.insp_mtd_typ());
					schdR.itm_cd(selectR.itm_cd());
					schdR.itm_sub1(selectR.itm_sub1());
					schdR.itm_sub2(selectR.itm_sub2());
					schdR.itm_sub3(selectR.itm_sub3());
					schdR.lot_no(selectR.lot_no());
					schdR.sublot_no(selectR.sublot_no());
					schdR.loc_cd(selectR.loc_cd());
					schdR.sno1(selectR.sno1());
					schdR.sno2(selectR.sno2());
					schdR.sno3(selectR.sno3());
					schdR.sno4(selectR.sno4());
					schdR.own_insp_no(selectR.own_insp_no());
					schdR.insp_bind_typ(selectR.insp_bind_typ());
					schdR.mfg_loc_cd(selectR.mfg_loc_cd());
					schdR.sppl_cd(selectR.sppl_cd());
					schdR.maker_cd(selectR.maker_cd());
					schdR.from_site_cd(selectR.from_site_cd());
					schdR.to_site_cd(getLocR(selectR.loc_cd()).site_cd());
					schdR.sublot_mng_typ(getItmR(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3()).sublot_mng_typ());
					schdR.lmt_up_flg(selectR.lmt_up_flg());
				}
			}

			return msgL;
		}
		
		/**
		 * 入力していないまとめ対象が他に存在するかチェックを行う。
		 */
		protected MCMessageList chkSummaryInspSchd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlSchdR> inspSchdL1 = MCList.create(Chk01_DtlSchdR.class);
			MCList<Chk01_DtlSchdR> inspSchdL2 = MCList.create(Chk01_DtlSchdR.class);

			for (Chk01_DtlSchdR schdR : up2()) {
				if (MAC_SUBLOT_MNG_TYP.isSTK(schdR.sublot_mng_typ())) {
					// サブロットＮＯを設定しないパターン
					inspSchdL1.add(schdR);
				} else {
					// サブロットＮＯを設定するパターン
					inspSchdL2.add(schdR);
				}
			}

			MCList<MST_INSP_SCHD_R> sumInspSchdDbL = MCList.create(MST_INSP_SCHD_R.class);
			// サブロットＮＯは設定しないパターンでまとめ対象データ取得
			if (!inspSchdL1.isEmpty()) {
				sumInspSchdDbL.addAll(getInspSchd(inspSchdL1,false));
			}
			// サブロットＮＯは設定するパターンでまとめ対象データ取得
			if (!inspSchdL2.isEmpty()) {
				sumInspSchdDbL.addAll(getInspSchd(inspSchdL2, true));
			}

			// NGListの作成
			MCList<MST_INSP_SCHD_R> inspSchdNGL = MCList.create(MST_INSP_SCHD_R.class);
			MCIndexKey idxkey = up2().createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (MST_INSP_SCHD_R sumInspSchdDbR : sumInspSchdDbL) {
				if (!up2().contains(idxkey, sumInspSchdDbR.insp_schd_no())) {
					inspSchdNGL.add(sumInspSchdDbR);
				}
			}

			// 上り電文に含まれていないまとめ対象データチェック
			MCIndexKey idxkeyNotSublot = inspSchdNGL.createIndex(Chk01_DtlSchdR.$insp_freq, Chk01_DtlSchdR.$src_no1,
					Chk01_DtlSchdR.$src_no2,Chk01_DtlSchdR.$insp_typ,Chk01_DtlSchdR.$insp_mtd_typ,Chk01_DtlSchdR.$itm_cd,
					Chk01_DtlSchdR.$itm_sub1,Chk01_DtlSchdR.$itm_sub2,Chk01_DtlSchdR.$itm_sub3,Chk01_DtlSchdR.$lot_no,
					Chk01_DtlSchdR.$own_insp_no,Chk01_DtlSchdR.$insp_bind_typ,Chk01_DtlSchdR.$mfg_loc_cd,Chk01_DtlSchdR.$sppl_cd,
					Chk01_DtlSchdR.$maker_cd,Chk01_DtlSchdR.$from_site_cd,Chk01_DtlSchdR.$to_site_cd);
			MCIndexKey idxkeySublot = inspSchdNGL.createIndex(Chk01_DtlSchdR.$insp_freq, Chk01_DtlSchdR.$src_no1,
					Chk01_DtlSchdR.$src_no2,Chk01_DtlSchdR.$insp_typ,Chk01_DtlSchdR.$insp_mtd_typ,Chk01_DtlSchdR.$itm_cd,
					Chk01_DtlSchdR.$itm_sub1,Chk01_DtlSchdR.$itm_sub2,Chk01_DtlSchdR.$itm_sub3,Chk01_DtlSchdR.$lot_no,Chk01_DtlSchdR.$sublot_no,
					Chk01_DtlSchdR.$own_insp_no,Chk01_DtlSchdR.$insp_bind_typ,Chk01_DtlSchdR.$mfg_loc_cd,Chk01_DtlSchdR.$sppl_cd,
					Chk01_DtlSchdR.$maker_cd,Chk01_DtlSchdR.$from_site_cd,Chk01_DtlSchdR.$to_site_cd);

			for (Chk01_DtlSchdR r : up2()) {
				// NGリストの取得
				if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
					if (inspSchdNGL.contains(idxkeyNotSublot, r.insp_freq(), r.src_no1(),
							r.src_no2(),r.insp_typ(),r.insp_mtd_typ(),r.itm_cd(),
							r.itm_sub1(),r.itm_sub2(),r.itm_sub3(),r.lot_no(),
							r.own_insp_no(),r.insp_bind_typ(),r.mfg_loc_cd(),r.sppl_cd(),
							r.maker_cd(),r.from_site_cd(),r.to_site_cd())) {

						msgL.add(new MCMessage(r, null, MSBFL0139, r.insp_schd_no(), toDispGUIIndex(r)));
						
					}
				} else {
					if (inspSchdNGL.contains(idxkeySublot, r.insp_freq(), r.src_no1(),
							r.src_no2(),r.insp_typ(),r.insp_mtd_typ(),r.itm_cd(),
							r.itm_sub1(),r.itm_sub2(),r.itm_sub3(),r.lot_no(),r.sublot_no(),
							r.own_insp_no(),r.insp_bind_typ(),r.mfg_loc_cd(),r.sppl_cd(),
							r.maker_cd(),r.from_site_cd(),r.to_site_cd())) {

						msgL.add(new MCMessage(r, null, MSBFL0139, r.insp_schd_no(), toDispGUIIndex(r)));
					}
				}
				setErrFlg(r, msgL);
				if (r.err_flg() && !up0().err_flg()) {
					up0().err_flg(true);
				}
			}
			return msgL;
		}

		/**
		 * まとめ対象一覧を取得する。
		 * 
		 * @return まとめ対象一覧
		 */
		protected MCList<MST_INSP_SCHD_R> getInspSchd(MCList<Chk01_DtlSchdR> inspL,boolean setSublot) {
			// まとめ対象のデータ取得
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addSelect(m1.sublot_mng_typ);
			dbc_bldr.addSelect(m2.site_cd.as("TO_SITE_CD"));
			dbc_bldr.addLeftOuterJoin(m1, bracket(t.itm_cd.eq(m1.itm_cd).and(t.itm_sub1.eq(m1.itm_sub1).and(t.itm_sub2.eq(m1.itm_sub2).and(t.itm_sub3.eq(m1.itm_sub3))))));
			dbc_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)));
			dbc_bldr.setWhere(value(0).eq(value(0)));
			dbc_bldr.addConstWhereWithAnd(t.insp_schd_sts_typ.eq(value(MSC_INSP_STS_TYP.YET.value())));
			dbc_bldr.addConstWhereWithAnd(t.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())).or(t.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))).or(t.insp_typ.eq(value(MSC_INSP_TYP.LOT.value()))));
			dbc_bldr.addConstWhereWithAnd(t.insp_bind_typ.isNotNull());
			dbc_bldr.addConstWhereWithAnd(t.insp_bind_typ.neq(value(MAC_INSP_BIND_TYP.ACT.value())));
			dbc_bldr.addWhereWithAnd(t.insp_freq.eq(bind("insp_freq")));
			dbc_bldr.addWhereWithAnd(t.src_no1.isNull().and(bind("src_no1").isNull()).or(t.src_no1.eq(bind("src_no1"))));
			dbc_bldr.addWhereWithAnd(t.src_no2.isNull().and(bind("src_no2").isNull()).or(t.src_no2.eq(bind("src_no2"))));
			dbc_bldr.addWhereWithAnd(t.insp_typ.eq(bind("insp_typ")));
			dbc_bldr.addWhereWithAnd(t.insp_mtd_typ.isNull().and(bind("insp_mtd_typ").isNull()).or(t.insp_mtd_typ.eq(bind("insp_mtd_typ"))));
			dbc_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbc_bldr.addWhereWithAnd(t.lot_no.isNull().and(bind("lot_no").isNull()).or(t.lot_no.eq(bind("lot_no"))));
			if (setSublot) {
				dbc_bldr.addWhereWithAnd(t.sublot_no.isNull().and(bind("sublot_no").isNull()).or(t.sublot_no.eq(bind("sublot_no"))));
			}
			dbc_bldr.addWhereWithAnd(t.own_insp_no.isNull().and(bind("own_insp_no").isNull()).or(t.own_insp_no.eq(bind("own_insp_no"))));
			dbc_bldr.addWhereWithAnd(t.insp_bind_typ.isNull().and(bind("insp_bind_typ").isNull()).or(t.insp_bind_typ.eq(bind("insp_bind_typ"))));
			dbc_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			dbc_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("sppl_cd")));
			dbc_bldr.addWhereWithAnd(t.maker_cd.eq(bind("maker_cd")));
			dbc_bldr.addWhereWithAnd(t.from_site_cd.eq(bind("from_site_cd")));
			dbc_bldr.addWhereWithAnd(m2.site_cd.eq(bind("to_site_cd")));
			
			dbSelect("MSBFL0040_MST_INSP_SCHD_S05", dbc, dbc_bldr, inspL);
			
			return dbc;
		}
		
		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @return
		 */
		protected MCMessageList dacChk() {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_DtlSchdR schdR : up2()) {
				if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk01_DtlSchdR.$mfg_loc_cd));
				}
				else {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk01_DtlSchdR.$loc_cd));
				}
			}
			
			if (up2().size() == msgL.size()) {
				return msgL;
			}
			else {
				return null;
			}
		}
		
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			for (Chk01_DtlStdR r : up1()) {
				r.chk_least_one_flg(MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ()));
			}
			if (!up2().isEmpty()) {
				up0().itm_cd(up2().get(0).itm_cd());
				up0().itm_sub1(up2().get(0).itm_sub1());
				up0().itm_sub2(up2().get(0).itm_sub2());
				up0().itm_sub3(up2().get(0).itm_sub3());
				up0().lmt_up_flg(up2().get(0).lmt_up_flg());
			}
		}
		
		
		/**
		 * 条件付チェックを実行する。
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd() {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlStdR r : up1()) {
				if (MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
					msgL.addAll(check(r, Chk01_DtlStdR.$ql_std_val, new FXUCL_RequiredValidater()));
				}
				else if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
					msgL.addAll(check(r, Chk01_DtlStdR.$trd_unit_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlStdR.$qn_int_digit, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlStdR.$qn_int_frac, new FXUCL_RequiredValidater()));
				}
			}

			for (Chk01_DtlSchdR r : up2()) {
				// 抜取指図数の正数チェック
				if (!MAC_INSP_MTD_TYP.isTTL(up0().insp_mtd_typ())) {
					if (!isNull(r.smpl_inst_qty()) && !r.smpl_inst_qty().isZero()) {
						msgL.addAll(check(r, Chk01_DtlSchdR.$smpl_inst_qty, new FXUCL_PositiveValidater()));
					}
				}
			}

			return msgL;
		}

		@Override
		protected IfValidater getAtLeastOneValidater(String[] cols) {
			if (Arrays.asList(cols).contains(Chk01_DtlStdR.$qn_out_min) &&
					Arrays.asList(cols).contains(Chk01_DtlStdR.$qn_in_min) &&
					Arrays.asList(cols).contains(Chk01_DtlStdR.$qn_out_max) &&
					Arrays.asList(cols).contains(Chk01_DtlStdR.$qn_in_max)) {
				// 定量検査の場合、上下限値は一つ以上必須
				return new FXUCL_AtLeastOneValidater(
						filter -> (filter.getBoolean(Chk01_DtlStdR.$chk_least_one_flg)));
			}
			
			return super.getAtLeastOneValidater(cols);
		}

		/**
		 * マスタ初期化
		 */
		protected void initMasterData(MCList<MST_INSP_SCHD_R> schdL) {
			initItmCache(schdL);
			initLocCache(schdL);
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void initItmCache(MCList<MST_INSP_SCHD_R> schdL) {
			MAM_ITM_R dbc_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbc_bldr.setSelect(dbc_t.sublot_mng_typ);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, schdL, MST_INSP_SCHD_R.$itm_cd, MST_INSP_SCHD_R.$itm_sub1, MST_INSP_SCHD_R.$itm_sub2, MST_INSP_SCHD_R.$itm_sub3);
		}

		/**
		 * 場所マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void initLocCache(MCList<MST_INSP_SCHD_R> schdL) {
			MAM_LOC_R dbc_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbc_bldr.setSelect(dbc_t.site_cd);
			_cacheLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, schdL, MST_INSP_SCHD_R.$loc_cd);
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @return 品目マスタコンテナ
		 */
		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {

			MAM_ITM_R retR = _cacheItmL.getEx(itmCd, itmSub1, itmSub2, itmSub3);
			if (retR == null) {
				retR = MAM_ITM_R.create();
			}
			return retR;
		}

		/**
		 * 場所マスタコンテナを取得する。
		 * 
		 * @param locCd 場所ＣＤ
		 * @return 場所マスタコンテナ
		 */
		protected MAM_LOC_R getLocR(String locCd) {

			MAM_LOC_R retR = _cacheLocL.getEx(locCd);
			if (retR == null) {
				retR = MAM_LOC_R.create();
			}
			return retR;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 上り電文の検査予定がまとめ可能かどうかのチェックを行う。<br>
		 * まとめ不可能な場合は、エラーを出す。
		 */
		protected MCMessageList chkCanCollect() {
			MCMessageList msgL = new MCMessageList();
			if (up2().size() == 1) {
				return msgL;
			}

			Chk01_DtlSchdR base= up2().get(0);
			for (Chk01_DtlSchdR r : up2()) {
				// まとめ可能な検査実施単位チェック
				if (MAC_INSP_BIND_TYP.isACT(r.insp_bind_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0021, toDispGUIIndex(r)));
				}
				if (!isColSame(base, r, hdrCols(MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())))) {
					msgL.add(new MCMessage(r, null, MSBFL0022, toDispGUIIndex(r)));
				}
			}

			return msgL;
		}

		/**
		 * 抜取規格検査の場合、規格検査情報があるかチェックを行う。
		 */
		protected MCMessageList chkStdInsp() {
			MCMessageList msgL = new MCMessageList();

			if (MAC_INSP_MTD_TYP.isSPEC(up0().insp_mtd_typ())) {
				// 規格検査情報は1件もない場合
				if (isNull(up1())) {
					msgL.add(new MCMessage(up0(), null, MSBFL0080, toDispGUIIndex(up0())));
				}
			}

			return msgL;
		}
		
		protected MCMessageList chkInspMtdTyp() {
			MCMessageList msgL = new MCMessageList();
			
			// 品目品管マスタ情報の取得
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);
			for (Chk01_DtlSchdR upR : up2()) {
				InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
				cndR.peg_no(upR.peg_no());
				cndR.itm_cd(upR.itm_cd());
				cndR.itm_sub1(upR.itm_sub1());
				cndR.itm_sub2(upR.itm_sub2());
				cndR.itm_sub3(upR.itm_sub3());
				cndR.base_dt(up0().master_dt());
				cndR.mfg_loc_cd(upR.mfg_loc_cd());
				cndR.sppl_cd(upR.sppl_cd());
				cndR.maker_cd(upR.maker_cd());
				cndR.insp_typ(upR.insp_typ());
				cndR.insp_ptn_cd(up0().insp_ptn_cd());
				cndR.to_loc_cd(upR.loc_cd());
				cndR.to_site_cd(upR.to_site_cd());
				cndL.add(cndR);
			}
			
			MCList<InspSchd_Srch01_CndR> mstInfoL = callInspSchdService(cndL);
			MCIndexKey idx = mstInfoL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			
			if (MSC_INSP_TYP.isPRDCT(up2().get(0).insp_typ()) || MSC_INSP_TYP.isACCPT(up2().get(0).insp_typ())) {
				// 検査方法区分変更不可チェック
				for (Chk01_DtlSchdR schdR : up2()) {
					if (MAC_INSP_MTD_TYP.isTTL(up0().insp_mtd_typ())) {
						if (!MAC_INSP_MTD_TYP.isTTL(schdR.insp_mtd_typ())) {
							InspSchd_Srch01_CndR chk = mstInfoL.getFirst(idx, schdR.peg_no());
							if (up0().in_prmt_insp_flg() || MAC_INSP_INST_ISSUE_TYP.isON_INST(chk.insp_inst_issue_typ())) {
								msgL.add(new MCMessage(up0(), null, MSBFL0136, toDispGUIIndex(up0())));
							}
						}
					}
				}
			}
			if (MSC_INSP_TYP.isPRCD(up2().get(0).insp_typ())
					&& !MAC_INSP_MTD_TYP.isSPEC(up0().insp_mtd_typ())) {
				msgL.add(new MCMessage(up0(), null, MSBFL0106, toDispGUIIndex(up0())));
			}
			if (MSC_INSP_TYP.isLOT(up2().get(0).insp_typ()) && up0().lmt_up_flg()
					&& MAC_INSP_MTD_TYP.isTTL(up0().insp_mtd_typ())) {
				msgL.add(new MCMessage(up0(), null, MSBFL0107, toDispGUIIndex(up0())));
			}

			return msgL;
		}


		/**
		 * 工場出荷承認役割CDが設定されるかチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkPlntAprvRoleCd() {
			MCMessageList msgL = new MCMessageList();
			if (!up0().plnt_aprv_flg()) {
				return msgL;
			}
			
			MCList<Chk01_DtlSchdR> subL = up2().groupBy(Chk01_DtlSchdR.$itm_cd, Chk01_DtlSchdR.$itm_sub1, Chk01_DtlSchdR.$itm_sub2, Chk01_DtlSchdR.$itm_sub3, Chk01_DtlSchdR.$to_site_cd);
			MCList<MAM_ITM_SITE_R> itmSiteL = MCList.create(MAM_ITM_SITE_R.class);
			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder itmSiteL_bldr = MCQueryApiBuilder.create(t);
			itmSiteL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmSiteL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmSiteL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmSiteL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmSiteL_bldr.addWhereWithAnd(t.site_cd.eq(bind("to_site_cd")));
			dbSelect("MSBFL0040_MAM_ITM_SITE_S01", itmSiteL, itmSiteL_bldr, subL);
			
			MCIndexKey idxkey = itmSiteL.createIndex(MAM_ITM_SITE_R.$itm_cd, MAM_ITM_SITE_R.$itm_sub1, MAM_ITM_SITE_R.$itm_sub2, MAM_ITM_SITE_R.$itm_sub3, MAM_ITM_SITE_R.$site_cd);
			
			for (Chk01_DtlSchdR r : subL) {
				MAM_ITM_SITE_R itmSiteR = itmSiteL.getFirst(idxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.to_site_cd());

				if (isNull(itmSiteR) || !itmSiteR.plnt_aprv_flg() || isNull(itmSiteR.plnt_aprv_role_cd())) {
					msgL.add(new MCMessage(r, null, MSBFL0118, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), 
							r.to_site_cd(), toDispGUIIndex(up0())));
					up0().err_flg(true);
					break;
				}
			}
			
			return msgL;
		}

		/**
		 * まとめ可能な項目名 リストを返す。
		 * 
		 * @param isDelSublotFlg サブロットＮＯが含まないＦＬＧ
		 * @return
		 */
		protected String[] hdrCols(boolean isDelSublotFlg) {
			//insp_bind_typは対象に含めていない。
			//※複数の検査予定において、同じ品目品管マスタの
			//レコードを採用することが保証されているため。
			// ・サブロット単位区分が「４：在庫のみサブロット管理する」の場合、サブロットＮＯをまとめキーから除外してください。
			// ・まとめ単位に以下を追加してください。（品目品管マスタのキー項目です。）
			// 製造場所ＣＤ、発注先ＣＤ、メーカＣＤ、工場・物流倉庫ＣＤ、出荷元工場・物流倉庫ＣＤ
			if (isDelSublotFlg) {
				return new String[]{
						Chk01_DtlSchdR.$insp_freq,
						Chk01_DtlSchdR.$src_no1,
						Chk01_DtlSchdR.$src_no2,
						Chk01_DtlSchdR.$insp_typ,
						Chk01_DtlSchdR.$insp_mtd_typ,
						Chk01_DtlSchdR.$itm_cd,
						Chk01_DtlSchdR.$itm_sub1,
						Chk01_DtlSchdR.$itm_sub2,
						Chk01_DtlSchdR.$itm_sub3,
						Chk01_DtlSchdR.$lot_no,
						Chk01_DtlSchdR.$own_insp_no,
						Chk01_DtlSchdR.$insp_bind_typ,
						Chk01_DtlSchdR.$mfg_loc_cd,
						Chk01_DtlSchdR.$sppl_cd,
						Chk01_DtlSchdR.$maker_cd,
						Chk01_DtlSchdR.$from_site_cd,
						Chk01_DtlSchdR.$to_site_cd
				};
			}
			return new String[]{
					Chk01_DtlSchdR.$insp_freq,
					Chk01_DtlSchdR.$src_no1,
					Chk01_DtlSchdR.$src_no2,
					Chk01_DtlSchdR.$insp_typ,
					Chk01_DtlSchdR.$insp_mtd_typ,
					Chk01_DtlSchdR.$itm_cd,
					Chk01_DtlSchdR.$itm_sub1,
					Chk01_DtlSchdR.$itm_sub2,
					Chk01_DtlSchdR.$itm_sub3,
					Chk01_DtlSchdR.$lot_no,
					Chk01_DtlSchdR.$sublot_no,
					Chk01_DtlSchdR.$own_insp_no,
					Chk01_DtlSchdR.$insp_bind_typ,
					Chk01_DtlSchdR.$mfg_loc_cd,
					Chk01_DtlSchdR.$sppl_cd,
					Chk01_DtlSchdR.$maker_cd,
					Chk01_DtlSchdR.$from_site_cd,
					Chk01_DtlSchdR.$to_site_cd
			};
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 指図更新前チェックを行う。<br>
	 */
	public class Chk02 extends MSBFL_InspInstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callInspInstServiceChk05();
			}
			
			// 下り電文設定
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック
			msgL.addAll(chkSchdUpdCnt());

			// 検査指図の更新カウンタチェック、値の補完
			msgL.addAll(chkInstUpdCnt());

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (up0().err_flg()) {
				return msgL;
			}

			// 場所の更新権限のチェック
			msgL.addAll(dacChk());
			// 条件付チェック
			msgL.addAll(chkItmsWithCnd());
			// 更新可能チェック
			msgL.addAll(chkCanUpadte());
			// 規格検査指図チェック
			msgL.addAll(chkStdInsp());
			// 検査方法区分チェック
			msgL.addAll(chkInspMtdTyp());
			// 工場出荷承認役割ＣＤチェック
			msgL.addAll(chkPlntAprvRoleCd());
			// 規格検査実績のチェック
			msgL.addAll(chckStdInspAct());
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		protected MCMessageList chckStdInspAct() {
			MCMessageList msgL = new MCMessageList();
			if (!MAC_INSP_MTD_TYP.isSPEC(up0().bfr_insp_mtd_typ())) {
				return msgL;
			}
			if (!hasDiff()) {
				return msgL;
			}
			MCList<MST_STD_INSP_ACT_R> stdActL = selStdInspActL();
			if (!stdActL.isEmpty()) {
				msgL.add(new MCMessage(up0(), null, MSBFL0024, up0().insp_no(), toDispGUIIndex(up0())));
			}
			return msgL;
		}

		protected boolean hasDiff() {
			//規格検査情報が更新されている場合
			if (!up1().subList(r -> !isNull(r.data_crud_typ())).isEmpty()) {
				return true;
			}
			//検査方法区分が更新されている場合
			if (!isSame(up0().bfr_insp_mtd_typ(),up0().insp_mtd_typ())) {
				return true;
			}
			return false;
		}

		/**
		 * 規格検査実績情報を取得する。
		 * 
		 * @return 規格検査実績情報リスト
		 */
		protected MCList<MST_STD_INSP_ACT_R> selStdInspActL() {
			MCList<MST_STD_INSP_ACT_R> stdActL = MCList.create(MST_STD_INSP_ACT_R.class);
			MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
			MCQueryApiBuilder stdActL_bldr = MCQueryApiBuilder.create(t);
			stdActL_bldr.setWhere(t.insp_no.eq(bind("1")), up0().insp_no());
			dbSelect("MSBFL0040_MST_STD_INSP_ACT_S01", stdActL, stdActL_bldr);
			return stdActL;
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}
			MST_INSP_INST_R dbR = MST_INSP_INST_R.create();
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_INST_S01",
					dbR, MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$upd_cntr, dbR));

			if (!isNull(dbR)) {
				up0().itm_cd(dbR.itm_cd());
				up0().itm_sub1(dbR.itm_sub1());
				up0().itm_sub2(dbR.itm_sub2());
				up0().itm_sub3(dbR.itm_sub3());
				up0().insp_sts_typ(dbR.insp_sts_typ());
				up0().insp_aprv_sts_typ(dbR.insp_aprv_sts_typ());
				up0().bfr_insp_mtd_typ(dbR.insp_mtd_typ());
				up0().insp_typ(dbR.insp_typ());
				up0().lmt_up_flg(dbR.lmt_up_flg());
			}
			return msgL;
		}

		/**
		 * 検査予定の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkSchdUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_schd_no);
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_SCHD_S02", selectL, selectL_bldr, up2());

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (Chk02_DtlSchdR schdR : up2()) {
				MST_INSP_SCHD_R selectR = selectL.getFirst(idxkey, schdR.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(schdR, Chk02_DtlSchdR.$upd_cntr, selectR));
				setErrFlg(schdR, msgL);
				if (schdR.err_flg() && !up0().err_flg()) {
					up0().err_flg(true);
					break;
				}
				if (!isNull(selectR)) {
					schdR.insp_typ(selectR.insp_typ());
					schdR.loc_cd(selectR.loc_cd());
					schdR.mfg_loc_cd(selectR.mfg_loc_cd());
					schdR.insp_mtd_typ(selectR.insp_mtd_typ());
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @return
		 */
		protected MCMessageList dacChk() {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk02_DtlSchdR schdR : up2()) {
				if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk02_DtlSchdR.$mfg_loc_cd));
				}
				else {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk02_DtlSchdR.$loc_cd));
				}
			}
			
			if (up2().size() == msgL.size()) {
				return msgL;
			}
			else {
				return null;
			}
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			for (Chk02_DtlStdR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.chk_least_one_flg(MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ()));
				}
			}
		}

		/**
		 * 更新可能チェックを行う。
		 */
		protected MCMessageList chkCanUpadte() {
			MCMessageList msgL = new MCMessageList();

			// 検査状況区分：指図済以外の場合
			if (!MSC_INSP_STS_TYP.isORD(up0().insp_sts_typ())) {
				MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
				int cnt = execDbCount("MSBFL0040_MST_INSP_ACT_S01", t, t.insp_no.eq(bind("insp_no")), up0());
				if (cnt > 0) {
					msgL.add(new MCMessage(up0(), null, MSBFL0023, up0().insp_no(), toDispGUIIndex(up0())));
				}
				// 検査承認状況が指図承認済の場合
				if (MSC_INSP_APRV_STS_TYP.isINST_ACPT(up0().insp_aprv_sts_typ())) {
					msgL.add(new MCMessage(up0(), null, MSBFL0024, up0().insp_no(), toDispGUIIndex(up0())));
				}
			}

			return msgL;
		}

		/**
		 * 抜取規格検査の場合、規格検査情報があるかチェックを行う。
		 */
		protected MCMessageList chkStdInsp() {
			MCMessageList msgL = new MCMessageList();

			if (MAC_INSP_MTD_TYP.isSPEC(up0().insp_mtd_typ())) {
				// 規格検査情報は1件もない場合
				if (isNull(up1()) || up1().size() == up1().subList(Chk02_DtlStdR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()).size()) {
					msgL.add(new MCMessage(up0(), null, MSBFL0080, toDispGUIIndex(up0())));
				}
			}

			return msgL;
		}

		protected MCMessageList chkInspMtdTyp() {
			MCMessageList msgL = new MCMessageList();
			
			// 品目品管マスタ情報の取得
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T1");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MCQueryApiBuilder insp_schd_builder = MCQueryApiBuilder.create(t);
			insp_schd_builder.addSelect(m1.site_cd);
			insp_schd_builder.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
			insp_schd_builder.setWhere(t.insp_schd_no.eq(bind("insp_schd_no")));
			dbSelect("MSBFL0040_MST_INSP_SCHD_S04", dbc, insp_schd_builder, up2());
			MCIndexKey inspSchdIdx = dbc.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);
			for (Chk02_DtlSchdR upR : up2()) {
				InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
				MST_INSP_SCHD_R schdR = dbc.getFirst(inspSchdIdx, upR.insp_schd_no());
				cndR.peg_no(upR.peg_no());
				cndR.itm_cd(up0().itm_cd());
				cndR.itm_sub1(up0().itm_sub1());
				cndR.itm_sub2(up0().itm_sub2());
				cndR.itm_sub3(up0().itm_sub3());
				cndR.base_dt(up0().master_dt());
				cndR.mfg_loc_cd(upR.mfg_loc_cd());
				cndR.sppl_cd(schdR.sppl_cd());
				cndR.maker_cd(schdR.maker_cd());
				cndR.insp_typ(upR.insp_typ());
				cndR.insp_ptn_cd(up0().insp_ptn_cd());
				cndR.to_loc_cd(upR.loc_cd());
				cndR.to_site_cd(schdR.getStringNE("site_cd"));
				cndL.add(cndR);
			}
			
			MCList<InspSchd_Srch01_CndR> mstInfoL = callInspSchdService(cndL);
			MCIndexKey idx = mstInfoL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			
			if (MSC_INSP_TYP.isPRDCT(up2().get(0).insp_typ()) || MSC_INSP_TYP.isACCPT(up2().get(0).insp_typ())) {
				// 検査方法区分変更不可チェック
				for (Chk02_DtlSchdR schdR : up2()) {
					if (MAC_INSP_MTD_TYP.isTTL(up0().insp_mtd_typ())) {
						if (!MAC_INSP_MTD_TYP.isTTL(up0().bfr_insp_mtd_typ())) {
							InspSchd_Srch01_CndR chk = mstInfoL.getFirst(idx, schdR.peg_no());
							if (up0().in_prmt_insp_flg() || MAC_INSP_INST_ISSUE_TYP.isON_INST(chk.insp_inst_issue_typ())) {
								msgL.add(new MCMessage(up0(), null, MSBFL0136, toDispGUIIndex(up0())));
							}
						}
					}
				}
			}
			if (MSC_INSP_TYP.isPRCD(up2().get(0).insp_typ())
					&& !MAC_INSP_MTD_TYP.isSPEC(up0().insp_mtd_typ())) {
				msgL.add(new MCMessage(up0(), null, MSBFL0106, toDispGUIIndex(up0())));
			}
			if (MSC_INSP_TYP.isLOT(up2().get(0).insp_typ()) && up0().lmt_up_flg()
					&& MAC_INSP_MTD_TYP.isTTL(up0().insp_mtd_typ())) {
				msgL.add(new MCMessage(up0(), null, MSBFL0107, toDispGUIIndex(up0())));
			}

			return msgL;
		}

		/**
		 * 工場出荷承認役割CDが設定されるかチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkPlntAprvRoleCd() {
			MCMessageList msgL = new MCMessageList();
			if (!up0().plnt_aprv_flg() || up2().isEmpty()) {
				return msgL;
			}
			
			MAM_LOC_R locR = MAM_LOC_R.create();
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(t);
			locR_bldr.setSelect(t.loc_cd);
			locR_bldr.addSelect(t.site_cd);
			dbSelectKey("MSBFL0040_MAM_LOC_S01", locR, locR_bldr, up2().get(0));
			
			if (!isNull(locR)) {
				up0().addStringColumn("site_cd", locR.site_cd());

				MAM_ITM_SITE_R itmSiteR = MAM_ITM_SITE_R.create();
				dbSelectKey("MSBFL0040_MAM_ITM_SITE_S02", itmSiteR, MCQueryApiBuilder.create(MAM_ITM_SITE_R.create("T")), up0());
				
				if (isNull(itmSiteR) || !itmSiteR.plnt_aprv_flg() || isNull(itmSiteR.plnt_aprv_role_cd())) {
					msgL.add(new MCMessage(up0(), null, MSBFL0118, toDispItm(up0().itm_cd(), up0().itm_sub1(), up0().itm_sub2(), up0().itm_sub3()), 
							up0().getStringNE("site_cd"), toDispGUIIndex(up0())));
				}
			}
			
			return msgL;
		}

		/**
		 * 条件付チェックを実行する。
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd() {
			MCMessageList msgL = new MCMessageList();

			for (Chk02_DtlStdR r : up1()) {
				if (MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
					msgL.addAll(check(r, Chk02_DtlStdR.$ql_std_val, new FXUCL_RequiredValidater()));
				}
				else if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
					msgL.addAll(check(r, Chk02_DtlStdR.$trd_unit_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk02_DtlStdR.$qn_int_digit, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk02_DtlStdR.$qn_int_frac, new FXUCL_RequiredValidater()));
				}
			}

			for (Chk02_DtlSchdR r : up2()) {
				// 抜取指図数の正数チェック
				if (!MAC_INSP_MTD_TYP.isTTL(up0().insp_mtd_typ())) {
					if (!isNull(r.smpl_inst_qty()) && !r.smpl_inst_qty().isZero()) {
						msgL.addAll(check(r, Chk02_DtlSchdR.$smpl_inst_qty, new FXUCL_PositiveValidater()));
					}
				}
			}

			return msgL;
		}

		@Override
		protected IfValidater getAtLeastOneValidater(String[] cols) {
			if (Arrays.asList(cols).contains(Chk02_DtlStdR.$qn_out_min) &&
					Arrays.asList(cols).contains(Chk02_DtlStdR.$qn_in_min) &&
					Arrays.asList(cols).contains(Chk02_DtlStdR.$qn_out_max) &&
					Arrays.asList(cols).contains(Chk02_DtlStdR.$qn_in_max)) {
				// 定量検査の場合、上下限値は一つ以上必須
				return new FXUCL_AtLeastOneValidater(
						filter -> (filter.getBoolean(Chk02_DtlStdR.$chk_least_one_flg)));
			}
			
			return super.getAtLeastOneValidater(cols);
		}
		
		/**
		 * 検査指図サービスの更新・取消・承認取消の共通チェックを行う。
		 */
		protected void callInspInstServiceChk05() {
			MSBFL_InspInstService.InspInst_Chk05 ope = MSBFL_InspInstService.crtInspInst_Chk05();
			InspInst_Chk05_RsltR chkR = InspInst_Chk05_RsltR.create();

			copy(chkR, up0(), createMap_InspInst_Chk05_RsltR_Chk02_HdrR());
			ope.up0().add(chkR);

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}
		
		protected Map_InspInst_Chk05_RsltR_Chk02_HdrR<InspInst_Chk05_RsltR,Chk02_HdrR> createMap_InspInst_Chk05_RsltR_Chk02_HdrR() {
			return new Map_InspInst_Chk05_RsltR_Chk02_HdrR<InspInst_Chk05_RsltR, Chk02_HdrR>();
		}

		public class Map_InspInst_Chk05_RsltR_Chk02_HdrR<D extends InspInst_Chk05_RsltR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk05_RsltR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_no, Chk02_HdrR.$insp_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_freq, Chk02_HdrR.$insp_freq);
				addColumnPathMap(InspInst_Chk05_RsltR.$err_flg, Chk02_HdrR.$err_flg);

			}
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 承認前チェックを行う。<br>
	 */
	public class Chk03 extends MSBFL_InspInstReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			// 下り電文設定
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (up0().err_flg()) {
				return msgL;
			}

			// 承認役割チェック
			msgL.addAll(chkAprvRole());

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MST_INSP_INST_R dbR = MST_INSP_INST_R.create();
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_INST_S02", dbR, MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$upd_cntr, dbR));

			if (!isNull(dbR)) {
				up0().inst_dt(dbR.inst_dt());
				up0().insp_aprv_role_cd(dbR.insp_aprv_role_cd());
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @return
		 */
		protected MCMessageList chkAprvRole() {
			MCMessageList msgL = new MCMessageList();

			// 権限チェック
			if (!isAprvUsrR(up0().insp_aprv_role_cd())) {
				msgL.add(new MCMessage(up0(), null, MSBFL0010, toDispGUIIndex(up0())));
			}

			return msgL;
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 指図取消前チェックを行う。<br>
	 */
	public class Chk04 extends MSBFL_InspInstReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callInspInstServiceChk05();

				// 検査指図サービスの取消前チェック
				callInspInstServiceChk04();
			}

			// 下り電文設定
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック
			msgL.addAll(chkSchdUpdCnt());

			// 検査指図の更新カウンタチェック、値の補完
			msgL.addAll(chkInstUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (up0().err_flg()) {
				return msgL;
			}
			// 場所の更新権限のチェック
			msgL.addAll(dacChk());

			return msgL;
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}
			MST_INSP_INST_R dbR = MST_INSP_INST_R.create();
			MCQueryApiBuilder dbR_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_INST_S03", dbR, dbR_bldr, up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk04_HdrR.$upd_cntr, dbR));

			return msgL;
		}

		/**
		 * 検査予定の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkSchdUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_schd_no);
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_SCHD_S03", selectL, selectL_bldr, up1());

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (Chk04_DtlSchdR schdR : up1()) {
				MST_INSP_SCHD_R selectR = selectL.getFirst(idxkey, schdR.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(schdR, Chk04_DtlSchdR.$upd_cntr, selectR));
				setErrFlg(schdR, msgL);
				if (schdR.err_flg() && !up0().err_flg()) {
					up0().err_flg(true);
					break;
				}
				if (!isNull(selectR)) {
					schdR.insp_typ(selectR.insp_typ());
					schdR.loc_cd(selectR.loc_cd());
					schdR.mfg_loc_cd(selectR.mfg_loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @return
		 */
		protected MCMessageList dacChk() {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk04_DtlSchdR schdR : up1()) {
				if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk04_DtlSchdR.$mfg_loc_cd));
				}
				else {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk04_DtlSchdR.$loc_cd));
				}
			}
			
			if (up1().size() == msgL.size()) {
				return msgL;
			}
			else {
				return null;
			}
		}

		/**
		 * 検査指図サービスの更新・取消・承認取消の共通チェックを行う。
		 */
		protected void callInspInstServiceChk05() {
			MSBFL_InspInstService.InspInst_Chk05 ope = MSBFL_InspInstService.crtInspInst_Chk05();
			InspInst_Chk05_RsltR chkR = InspInst_Chk05_RsltR.create();

			copy(chkR, up0(), createMap_InspInst_Chk05_RsltR_Chk04_HdrR());
			ope.up0().add(chkR);

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}

		/**
		 * 検査指図サービスの取消前チェックを行う。
		 */
		protected void callInspInstServiceChk04() {
			MSBFL_InspInstService.InspInst_Chk04 ope = MSBFL_InspInstService.crtInspInst_Chk04();
			InspInst_Chk04_RsltR chkR = InspInst_Chk04_RsltR.create();

			copy(chkR, up0(), createMap_InspInst_Chk04_RsltR_Chk04_HdrR());
			ope.up0().add(chkR);

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}

		protected Map_InspInst_Chk04_RsltR_Chk04_HdrR<InspInst_Chk04_RsltR,Chk04_HdrR> createMap_InspInst_Chk04_RsltR_Chk04_HdrR() {
			return new Map_InspInst_Chk04_RsltR_Chk04_HdrR<InspInst_Chk04_RsltR, Chk04_HdrR>();
		}

		public class Map_InspInst_Chk04_RsltR_Chk04_HdrR<D extends InspInst_Chk04_RsltR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk04_RsltR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspInst_Chk04_RsltR.$insp_no, Chk04_HdrR.$insp_no);
			}
		}
		
		protected Map_InspInst_Chk05_RsltR_Chk04_HdrR<InspInst_Chk05_RsltR,Chk04_HdrR> createMap_InspInst_Chk05_RsltR_Chk04_HdrR() {
			return new Map_InspInst_Chk05_RsltR_Chk04_HdrR<InspInst_Chk05_RsltR, Chk04_HdrR>();
		}

		public class Map_InspInst_Chk05_RsltR_Chk04_HdrR<D extends InspInst_Chk05_RsltR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk05_RsltR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_no, Chk04_HdrR.$insp_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_freq, Chk04_HdrR.$insp_freq);
				addColumnPathMap(InspInst_Chk05_RsltR.$err_flg, Chk04_HdrR.$err_flg);

			}
		}
	}
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 承認取消前チェックを行う。<br>
	 */
	public class Chk05 extends MSBFL_InspInstReg_MC_A.Chk05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callInspInstServiceChk05();
				
				// 検査指図サービスの取消前チェック
				callInspInstServiceChk04();
			}
			// 下り電文設定
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (up0().err_flg()) {
				return msgL;
			}
			// 承認役割チェック
			msgL.addAll(chkAprvRole());

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MST_INSP_INST_R dbR = MST_INSP_INST_R.create();
			dbSelectKeyForUpdateNoWait("MSBFL0040_MST_INSP_INST_S04",
					dbR, MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk05_HdrR.$upd_cntr, dbR));

			if (!isNull(dbR)) {
				up0().insp_aprv_role_cd(dbR.insp_aprv_role_cd());
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @return
		 */
		protected MCMessageList chkAprvRole() {
			MCMessageList msgL = new MCMessageList();

			// 権限チェック
			if (!isAprvUsrR(up0().insp_aprv_role_cd())) {
				msgL.add(new MCMessage(up0(), null, MSBFL0010, toDispGUIIndex(up0())));
			}

			return msgL;
		}

		/**
		 * 検査指図サービスの取消前チェックを行う。
		 */
		protected void callInspInstServiceChk04() {
			MSBFL_InspInstService.InspInst_Chk04 ope = MSBFL_InspInstService.crtInspInst_Chk04();
			InspInst_Chk04_RsltR chkR = InspInst_Chk04_RsltR.create();

			copy(chkR, up0(), createMap_InspInst_Chk04_RsltR_Chk05_HdrR());
			ope.up0().add(chkR);

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}
		
		/**
		 * 検査指図サービスの更新・取消・承認取消の共通チェックを行う。
		 */
		protected void callInspInstServiceChk05() {
			MSBFL_InspInstService.InspInst_Chk05 ope = MSBFL_InspInstService.crtInspInst_Chk05();
			InspInst_Chk05_RsltR chkR = InspInst_Chk05_RsltR.create();

			copy(chkR, up0(), createMap_InspInst_Chk05_RsltR_Chk05_HdrR());
			ope.up0().add(chkR);

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}

		protected Map_InspInst_Chk04_RsltR_Chk05_HdrR<InspInst_Chk04_RsltR,Chk05_HdrR> createMap_InspInst_Chk04_RsltR_Chk05_HdrR() {
			return new Map_InspInst_Chk04_RsltR_Chk05_HdrR<InspInst_Chk04_RsltR, Chk05_HdrR>();
		}

		public class Map_InspInst_Chk04_RsltR_Chk05_HdrR<D extends InspInst_Chk04_RsltR, S extends Chk05_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk04_RsltR.$peg_no, Chk05_HdrR.$peg_no);
				addColumnPathMap(InspInst_Chk04_RsltR.$insp_no, Chk05_HdrR.$insp_no);
			}
		}
		
		protected Map_InspInst_Chk05_RsltR_Chk05_HdrR<InspInst_Chk05_RsltR,Chk05_HdrR> createMap_InspInst_Chk05_RsltR_Chk05_HdrR() {
			return new Map_InspInst_Chk05_RsltR_Chk05_HdrR<InspInst_Chk05_RsltR, Chk05_HdrR>();
		}

		public class Map_InspInst_Chk05_RsltR_Chk05_HdrR<D extends InspInst_Chk05_RsltR, S extends Chk05_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk05_RsltR.$peg_no, Chk05_HdrR.$peg_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_no, Chk05_HdrR.$insp_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_freq, Chk05_HdrR.$insp_freq);
				addColumnPathMap(InspInst_Chk05_RsltR.$err_flg, Chk05_HdrR.$err_flg);

			}
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 指図情報を登録する。<br>
	 */
	public class Ins01 extends MSBFL_InspInstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk01();

			throwUpdErr();

			// 検査指図の一括登録
			callInspInstServiceIns01();

			// 即時発行（電文）はオンの場合、検査成績書の発行
			if (up0().prnt_flg() && up0().inst_rslt_issue_flg()) {
				callInspRptServicePrnt02();
			}

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_HdrR.$peg_no, up0());
			setPegNo(Chk01_DtlStdR.$peg_no, up1());
			setPegNo(Chk01_DtlSchdR.$peg_no, up2());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_InspInstReg.Chk01 ope = MSBFL_InspInstReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * 検査指図を一括登録する。
		 */
		protected void callInspInstServiceIns01() {
			MSBFL_InspInstService.InspInst_Ins01 ins = MSBFL_InspInstService.crtInspInst_Ins01();

			InspInst_Ins01_RsltR instRsltR = InspInst_Ins01_RsltR.create();
			copy(instRsltR, up0(), createMap_InspInst_Ins01_RsltR_Chk01_HdrR());
			ins.up0().add(instRsltR);
			addAll(ins.up1(), up1(), createMap_InspInst_Ins01_RsltStdR_Chk01_DtlStdR());
			addAll(ins.up2(), up2(), createMap_InspInst_Ins01_RsltSchdR_Chk01_DtlSchdR());

			ins.exec();

			up0().insp_no(ins.down0().get(0).insp_no());
			up0().insp_sts_typ(ins.down0().get(0).insp_sts_typ());
			up0().insp_sts_typ_nm(ins.down0().get(0).insp_sts_typ_nm());
			up0().insp_aprv_sts_typ(ins.down0().get(0).insp_aprv_sts_typ());
			up0().insp_aprv_sts_typ_nm(ins.down0().get(0).insp_aprv_sts_typ_nm());
			up0().insp_aprv_flg(ins.down0().get(0).insp_aprv_flg());
			up0().inst_rslt_issue_flg(ins.down0().get(0).inst_rslt_issue_flg());

			String[] destCols = new String[] {Chk01_DtlStdR.$std_insp_inst_no};
			String[] srcCols = new String[] {InspInst_Ins01_RsltStdR.$std_insp_inst_no};
			copyByPegNo(up1(), destCols, ins.down1(), srcCols);
		}

		/**
		 * 検査成績書を発行する。
		 */
		protected void callInspRptServicePrnt02() {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			InspRpt_Prnt02_DtlR prntR = InspRpt_Prnt02_DtlR.create();
			copy(prntR, up0(), createMap_InspRpt_Prnt02_DtlR_Chk01_HdrR());
			prnt.up0().add(prntR);

			prnt.exec();
		}

		protected Map_InspRpt_Prnt02_DtlR_Chk01_HdrR<InspRpt_Prnt02_DtlR,Chk01_HdrR> createMap_InspRpt_Prnt02_DtlR_Chk01_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Chk01_HdrR<InspRpt_Prnt02_DtlR, Chk01_HdrR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Chk01_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Chk01_HdrR.$insp_no);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 指図情報を更新する。<br>
	 */
	public class Upd01 extends MSBFL_InspInstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk02();

			throwUpdErr();

			// 検査指図の更新
			callInspInstServiceUpd01();

			// 即時発行（電文）はオンの場合、検査成績書の発行
			if (up0().prnt_flg() && up0().inst_rslt_issue_flg()) {
				callInspRptServicePrnt02();
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_HdrR.$peg_no, up0());
			setPegNo(Chk02_DtlStdR.$peg_no, up1());
			setPegNo(Chk02_DtlSchdR.$peg_no, up2());
			setDataCrudTyp();
		}

		/**
		 * データ更新区分を設定する。
		 */
		protected void setDataCrudTyp() {
			for (Chk02_DtlStdR r : up1()) {
				if (isSame(MCRow.Status.CREATE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					r.insp_no(up0().insp_no());
				} 
				else if (isSame(MCRow.Status.MODIFY, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				} 
				else if (isSame(MCRow.Status.DELETE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBFL_InspInstReg.Chk02 ope = MSBFL_InspInstReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * 検査指図を更新する。
		 */
		protected void callInspInstServiceUpd01() {
			MSBFL_InspInstService.InspInst_Upd01 upd = MSBFL_InspInstService.crtInspInst_Upd01();

			InspInst_Upd01_RsltR updRsltR = InspInst_Upd01_RsltR.create();
			copy(updRsltR, up0(), createMap_InspInst_Upd01_RsltR_Chk02_HdrR());
			upd.up0().add(updRsltR);

			addAll(upd.up1(), up1(), createMap_InspInst_Upd01_RsltStdR_Chk02_DtlStdR());

			addAll(upd.up2(), up2(), createMap_InspInst_Upd01_RsltSchdR_Chk02_DtlSchdR());
			upd.exec();
			
			up0().inst_rslt_issue_flg(upd.down0().get(0).inst_rslt_issue_flg());
		}

		/**
		 * 検査成績書を発行する。
		 */
		protected void callInspRptServicePrnt02() {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			InspRpt_Prnt02_DtlR prntR = InspRpt_Prnt02_DtlR.create();
			copy(prntR, up0(), createMap_InspRpt_Prnt02_DtlR_Chk02_HdrR());
			prnt.up0().add(prntR);

			prnt.exec();
		}

		protected Map_InspRpt_Prnt02_DtlR_Chk02_HdrR<InspRpt_Prnt02_DtlR,Chk02_HdrR> createMap_InspRpt_Prnt02_DtlR_Chk02_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Chk02_HdrR<InspRpt_Prnt02_DtlR, Chk02_HdrR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Chk02_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Chk02_HdrR.$insp_no);

			}
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 指図情報を承認する。<br>
	 */
	public class Upd02 extends MSBFL_InspInstReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk03();

			throwUpdErr();

			// 検査指図の承認
			callInspInstServiceUpd02();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_HdrR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_InspInstReg.Chk03 ope = MSBFL_InspInstReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * 検査指図を承認する。
		 */
		protected void callInspInstServiceUpd02() {
			MSBFL_InspInstService.InspInst_Upd02 upd = MSBFL_InspInstService.crtInspInst_Upd02();

			InspInst_Upd02_RsltR updRsltR = InspInst_Upd02_RsltR.create();
			copy(updRsltR, up0(), createMap_InspInst_Upd02_RsltR_Chk03_HdrR());
			upd.up0().add(updRsltR);

			upd.exec();
			
			up0().insp_aprv_sts_typ(upd.down0().get(0).insp_aprv_sts_typ());
			up0().insp_aprv_sts_typ_nm(upd.down0().get(0).insp_aprv_sts_typ_nm());
		}

		protected Map_InspInst_Upd02_RsltR_Chk03_HdrR<InspInst_Upd02_RsltR,Chk03_HdrR> createMap_InspInst_Upd02_RsltR_Chk03_HdrR() {
			return new Map_InspInst_Upd02_RsltR_Chk03_HdrR<InspInst_Upd02_RsltR, Chk03_HdrR>();
		}

		public class Map_InspInst_Upd02_RsltR_Chk03_HdrR<D extends InspInst_Upd02_RsltR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Upd02_RsltR.$peg_no, Chk03_HdrR.$peg_no);
				addColumnPathMap(InspInst_Upd02_RsltR.$insp_no, Chk03_HdrR.$insp_no);
				addColumnPathMap(InspInst_Upd02_RsltR.$aprv_dt, Chk03_HdrR.$aprv_dt);
				addColumnPathMap(InspInst_Upd02_RsltR.$aprv_tm, Chk03_HdrR.$aprv_tm);
				addColumnPathMap(InspInst_Upd02_RsltR.$aprv_usr_cd, Chk03_HdrR.$aprv_usr_cd);
				addColumnPathMap(InspInst_Upd02_RsltR.$aprv_dpt_cd, Chk03_HdrR.$aprv_dpt_cd);
				addColumnPathMap(InspInst_Upd02_RsltR.$aprv_rsn, Chk03_HdrR.$aprv_rsn);
				addColumnPathMap(InspInst_Upd02_RsltR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspInst_Upd02_RsltR.$lims_flg, Chk03_HdrR.$lims_flg);

			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 検査指図情報を削除する。<br>
	 */
	public class Del01 extends MSBFL_InspInstReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk04();

			throwUpdErr();

			// 検査指図の取消
			callInspInstServiceDel01();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk04_HdrR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBFL_InspInstReg.Chk04 ope = MSBFL_InspInstReg.crtChk04();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * 検査指図を取り消す。
		 */
		protected void callInspInstServiceDel01() {
			MSBFL_InspInstService.InspInst_Del01 del = MSBFL_InspInstService.crtInspInst_Del01();

			InspInst_Del01_RsltR delRsltR = InspInst_Del01_RsltR.create();
			copy(delRsltR, up0(), createMap_InspInst_Del01_RsltR_Chk04_HdrR());
			del.up0().add(delRsltR);

			del.exec();
			
			up0().insp_sts_typ(del.down0().get(0).insp_sts_typ());
			up0().insp_sts_typ_nm(del.down0().get(0).insp_sts_typ_nm());
		}

		protected Map_InspInst_Del01_RsltR_Chk04_HdrR<InspInst_Del01_RsltR,Chk04_HdrR> createMap_InspInst_Del01_RsltR_Chk04_HdrR() {
			return new Map_InspInst_Del01_RsltR_Chk04_HdrR<InspInst_Del01_RsltR, Chk04_HdrR>();
		}

		public class Map_InspInst_Del01_RsltR_Chk04_HdrR<D extends InspInst_Del01_RsltR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Del01_RsltR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspInst_Del01_RsltR.$insp_no, Chk04_HdrR.$insp_no);
				addColumnPathMap(InspInst_Del01_RsltR.$lims_flg, Chk04_HdrR.$lims_flg);
				addColumnPathMap(InspInst_Del01_RsltR.$insp_sts_typ, Chk04_HdrR.$insp_sts_typ);
			}
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 検査指図承認を取り消す。<br>
	 */
	public class Del02 extends MSBFL_InspInstReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk05();

			throwUpdErr();

			// 検査指図承認の取消
			callInspInstServiceDel01();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk05_HdrR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MSBFL_InspInstReg.Chk05 ope = MSBFL_InspInstReg.crtChk05();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * 検査指図承認を取り消す。
		 */
		protected void callInspInstServiceDel01() {
			MSBFL_InspInstService.InspInst_Del01 del = MSBFL_InspInstService.crtInspInst_Del01();

			InspInst_Del01_RsltR delRsltR = InspInst_Del01_RsltR.create();
			copy(delRsltR, up0(), createMap_InspInst_Del01_RsltR_Chk05_HdrR());
			del.up0().add(delRsltR);

			del.exec();
			
			up0().insp_aprv_sts_typ(del.down0().get(0).insp_aprv_sts_typ());
			up0().insp_aprv_sts_typ_nm(del.down0().get(0).insp_aprv_sts_typ_nm());
		}

		protected Map_InspInst_Del01_RsltR_Chk05_HdrR<InspInst_Del01_RsltR,Chk05_HdrR> createMap_InspInst_Del01_RsltR_Chk05_HdrR() {
			return new Map_InspInst_Del01_RsltR_Chk05_HdrR<InspInst_Del01_RsltR, Chk05_HdrR>();
		}

		public class Map_InspInst_Del01_RsltR_Chk05_HdrR<D extends InspInst_Del01_RsltR, S extends Chk05_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Del01_RsltR.$peg_no, Chk05_HdrR.$peg_no);
				addColumnPathMap(InspInst_Del01_RsltR.$insp_no, Chk05_HdrR.$insp_no);
				addColumnPathMap(InspInst_Del01_RsltR.$aprv_rsn, Chk05_HdrR.$aprv_rsn);
				addColumnPathMap(InspInst_Del01_RsltR.$lims_flg, Chk05_HdrR.$lims_flg);
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査成績書を発行する。<br>
	 */
	public class Prnt01 extends MSBFL_InspInstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 検査成績書発行
			callInspRptServicePrnt02();

			throwErr(msgNoPrintData());
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_HdrR.$peg_no, up0());
		}

		/**
		 * 検査成績書を発行する。
		 */
		protected void callInspRptServicePrnt02() {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			InspRpt_Prnt02_DtlR prntDtlR = InspRpt_Prnt02_DtlR.create();
			copy(prntDtlR, up0(), createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR());
			prnt.up0().add(prntDtlR);

			prnt.exec();

			copyErrFlg(up0(), prnt.down0().get(0));
		}

		protected Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR,Prnt01_HdrR> createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR, Prnt01_HdrR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Prnt01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Prnt01_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Prnt01_HdrR.$insp_no);
			}
		}
	}

	/**
	 * ログインユーザの承認役割権限チェックを行う。
	 * 
	 * @param roleCd 役割ＣＤ
	 * @return 
	 */
	protected boolean isAprvUsrR(String roleCd) {
		String loginUsrId = mcframe.serverCore.sys.MCSys.user.ID();

		MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
		int cnt = execDbCount("MSBFL0040_MAVM_APRV_USR_S01", t,
				t.aprv_role_cd.eq(bind("1"))
				.and(t.usr_cd.eq(bind("2")))
				.and(t.st_dt.lte(bind("3")))
				.and( t.end_dt.isNull()
						.or(t.end_dt.gte(bind("3")))),
				roleCd, loginUsrId, getToday());

		return cnt > 0;
	}

	/**
	 * 検査予定登録サービスの品管関連マスタ取得を呼び出す。
	 * @param cndL 上り電文
	 * @return 品管関連マスタ情報
	 */
	protected MCList<InspSchd_Srch01_CndR> callInspSchdService(MCList<InspSchd_Srch01_CndR> cndL) {

		MSBFL_InspSchdService.InspSchd_Srch01 srch01 = MSBFL_InspSchdService.crtInspSchd_Srch01();

		srch01.up0().setAll(cndL);;

		srch01.exec();

		return srch01.down0();
	}

	protected boolean isLims(Srch01_HdrR hdrR, MCList<Srch01_DtlSchdR> dtlSchdL) {
		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch03();
		
		prepareScmLinkUtilSrch03Up(ope, hdrR, dtlSchdL);
		
		ope.exec();
		
		if (ope.down0().isEmpty()) {
			return false;
		}

		for (SCMLinkUtil_Srch03_CndR r : ope.down0()) {
			if (r.lims_flg()) {
				return true;
			}
		}
		return false;
	}
	
	protected void prepareScmLinkUtilSrch03Up(MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 ope, Srch01_HdrR hdrR, MCList<Srch01_DtlSchdR> dtlSchdL) {
		MCNumber peg = MCNumber.ZERO;
		
		for (Srch01_DtlSchdR dtlSchdR : dtlSchdL) {
			SCMLinkUtil_Srch03_CndR r = ope.up0().add();
			r.peg_no(peg);

			if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())){
				r.loc_cd(hdrR.mfg_loc_cd());
			}
			else {
				r.loc_cd(dtlSchdR.loc_cd());
			}
			r.itm_cd(hdrR.itm_cd());
			r.itm_sub1(hdrR.itm_sub1());
			r.itm_sub2(hdrR.itm_sub2());
			r.itm_sub3(hdrR.itm_sub3());
			r.master_dt(getToday());
			peg = peg.add(1);
		}
	}

	// Mapping
	protected Map_InspInst_Srch01_CndR_Srch03_CndR<InspInst_Srch01_CndR,Srch03_CndR> createMap_InspInst_Srch01_CndR_Srch03_CndR() {
		return new Map_InspInst_Srch01_CndR_Srch03_CndR<InspInst_Srch01_CndR, Srch03_CndR>();
	}

	public class Map_InspInst_Srch01_CndR_Srch03_CndR<D extends InspInst_Srch01_CndR, S extends Srch03_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Srch01_CndR.$itm_cd, Srch03_CndR.$itm_cd);
			addColumnPathMap(InspInst_Srch01_CndR.$itm_sub1, Srch03_CndR.$itm_sub1);
			addColumnPathMap(InspInst_Srch01_CndR.$itm_sub2, Srch03_CndR.$itm_sub2);
			addColumnPathMap(InspInst_Srch01_CndR.$itm_sub3, Srch03_CndR.$itm_sub3);
			addColumnPathMap(InspInst_Srch01_CndR.$master_dt, Srch03_CndR.$master_dt);
			addColumnPathMap(InspInst_Srch01_CndR.$insp_typ, Srch03_CndR.$insp_typ);
			addColumnPathMap(InspInst_Srch01_CndR.$loc_cd, Srch03_CndR.$loc_cd);
			addColumnPathMap(InspInst_Srch01_CndR.$to_site_cd, Srch03_CndR.$to_site_cd);
			addColumnPathMap(InspInst_Srch01_CndR.$mfg_loc_cd, Srch03_CndR.$mfg_loc_cd);
			addColumnPathMap(InspInst_Srch01_CndR.$sppl_cd, Srch03_CndR.$sppl_cd);
			addColumnPathMap(InspInst_Srch01_CndR.$maker_cd, Srch03_CndR.$maker_cd);
			addColumnPathMap(InspInst_Srch01_CndR.$insp_ptn_cd, Srch03_CndR.$insp_ptn_cd);
		}
	}
	protected Map_Srch03_RsltR_InspInst_Srch01_RsltR<Srch03_RsltR,InspInst_Srch01_RsltR> createMap_Srch03_RsltR_InspInst_Srch01_RsltR() {
		return new Map_Srch03_RsltR_InspInst_Srch01_RsltR<Srch03_RsltR, InspInst_Srch01_RsltR>();
	}

	public class Map_Srch03_RsltR_InspInst_Srch01_RsltR<D extends Srch03_RsltR, S extends InspInst_Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch03_RsltR.$insp_ptn_cd, InspInst_Srch01_RsltR.$insp_ptn_cd);
			addColumnPathMap(Srch03_RsltR.$insp_ptn_nm, InspInst_Srch01_RsltR.$insp_ptn_nm);
			addColumnPathMap(Srch03_RsltR.$insp_mtd_typ, InspInst_Srch01_RsltR.$insp_mtd_typ);
			addColumnPathMap(Srch03_RsltR.$insp_mtd_typ_nm, InspInst_Srch01_RsltR.$insp_mtd_typ_nm);
			addColumnPathMap(Srch03_RsltR.$insp_std_no, InspInst_Srch01_RsltR.$insp_std_no);
			addColumnPathMap(Srch03_RsltR.$insp_bind_typ, InspInst_Srch01_RsltR.$insp_bind_typ);
			addColumnPathMap(Srch03_RsltR.$std_req_flg, InspInst_Srch01_RsltR.$std_req_flg);
			addColumnPathMap(Srch03_RsltR.$std_cnf_req_flg, InspInst_Srch01_RsltR.$std_cnf_req_flg);
			addColumnPathMap(Srch03_RsltR.$plnt_aprv_flg, InspInst_Srch01_RsltR.$plnt_aprv_flg);
			addColumnPathMap(Srch03_RsltR.$insp_aprv_flg, InspInst_Srch01_RsltR.$insp_aprv_flg);
			addColumnPathMap(Srch03_RsltR.$spl_qty, InspInst_Srch01_RsltR.$spl_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!MAC_INSP_MTD_TYP.isTTL(src.insp_mtd_typ())) {
				dest.spl_qty(src.spl_qty());
			}
		}
	}

	protected Map_Srch01_DtlStdR_InspInst_Srch01_DtlStdR<Srch01_DtlStdR,InspInst_Srch01_DtlStdR> createMap_Srch01_DtlStdR_InspInst_Srch01_DtlStdR() {
		return new Map_Srch01_DtlStdR_InspInst_Srch01_DtlStdR<Srch01_DtlStdR, InspInst_Srch01_DtlStdR>();
	}

	public class Map_Srch01_DtlStdR_InspInst_Srch01_DtlStdR<D extends Srch01_DtlStdR, S extends InspInst_Srch01_DtlStdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlStdR.$insp_seq, InspInst_Srch01_DtlStdR.$insp_seq);
			addColumnPathMap(Srch01_DtlStdR.$insp_point_cd, InspInst_Srch01_DtlStdR.$insp_point_cd);
			addColumnPathMap(Srch01_DtlStdR.$insp_point_nm, InspInst_Srch01_DtlStdR.$insp_point_nm);
			addColumnPathMap(Srch01_DtlStdR.$insp_qlqn_typ, InspInst_Srch01_DtlStdR.$insp_qlqn_typ);
			addColumnPathMap(Srch01_DtlStdR.$insp_qlqn_typ_nm, InspInst_Srch01_DtlStdR.$insp_qlqn_typ_nm);
			addColumnPathMap(Srch01_DtlStdR.$ql_std_val, InspInst_Srch01_DtlStdR.$ql_std_val);
			addColumnPathMap(Srch01_DtlStdR.$trd_unit_cd, InspInst_Srch01_DtlStdR.$trd_unit_cd);
			addColumnPathMap(Srch01_DtlStdR.$trd_unit_nm, InspInst_Srch01_DtlStdR.$trd_unit_nm);
			addColumnPathMap(Srch01_DtlStdR.$qn_int_digit, InspInst_Srch01_DtlStdR.$qn_int_digit);
			addColumnPathMap(Srch01_DtlStdR.$qn_int_frac, InspInst_Srch01_DtlStdR.$qn_int_frac);
			addColumnPathMap(Srch01_DtlStdR.$qn_out_min, InspInst_Srch01_DtlStdR.$qn_out_min);
			addColumnPathMap(Srch01_DtlStdR.$sign_out_min_typ, InspInst_Srch01_DtlStdR.$sign_out_min_typ);
			addColumnPathMap(Srch01_DtlStdR.$sign_out_min_typ_nm, InspInst_Srch01_DtlStdR.$sign_out_min_typ_nm);
			addColumnPathMap(Srch01_DtlStdR.$qn_in_min, InspInst_Srch01_DtlStdR.$qn_in_min);
			addColumnPathMap(Srch01_DtlStdR.$sign_in_min_typ, InspInst_Srch01_DtlStdR.$sign_in_min_typ);
			addColumnPathMap(Srch01_DtlStdR.$sign_in_min_typ_nm, InspInst_Srch01_DtlStdR.$sign_in_min_typ_nm);
			addColumnPathMap(Srch01_DtlStdR.$sign_in_max_typ, InspInst_Srch01_DtlStdR.$sign_in_max_typ);
			addColumnPathMap(Srch01_DtlStdR.$sign_in_max_typ_nm, InspInst_Srch01_DtlStdR.$sign_in_max_typ_nm);
			addColumnPathMap(Srch01_DtlStdR.$qn_in_max, InspInst_Srch01_DtlStdR.$qn_in_max);
			addColumnPathMap(Srch01_DtlStdR.$sign_out_max_typ, InspInst_Srch01_DtlStdR.$sign_out_max_typ);
			addColumnPathMap(Srch01_DtlStdR.$sign_out_max_typ_nm, InspInst_Srch01_DtlStdR.$sign_out_max_typ_nm);
			addColumnPathMap(Srch01_DtlStdR.$qn_out_max, InspInst_Srch01_DtlStdR.$qn_out_max);

		}
	}

	protected Map_Srch01_HdrR_Srch03_RsltR<Srch01_HdrR,Srch03_RsltR> createMap_Srch01_HdrR_Srch03_RsltR() {
		return new Map_Srch01_HdrR_Srch03_RsltR<Srch01_HdrR, Srch03_RsltR>();
	}

	public class Map_Srch01_HdrR_Srch03_RsltR<D extends Srch01_HdrR, S extends Srch03_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_HdrR.$insp_ptn_cd, Srch03_RsltR.$insp_ptn_cd);
			addColumnPathMap(Srch01_HdrR.$insp_ptn_nm, Srch03_RsltR.$insp_ptn_nm);
			addColumnPathMap(Srch01_HdrR.$insp_mtd_typ, Srch03_RsltR.$insp_mtd_typ);
			addColumnPathMap(Srch01_HdrR.$insp_mtd_typ_nm, Srch03_RsltR.$insp_mtd_typ_nm);
			addColumnPathMap(Srch01_HdrR.$insp_std_no, Srch03_RsltR.$insp_std_no);
			addColumnPathMap(Srch01_HdrR.$std_req_flg, Srch03_RsltR.$std_req_flg);
			addColumnPathMap(Srch01_HdrR.$std_cnf_req_flg, Srch03_RsltR.$std_cnf_req_flg);
			addColumnPathMap(Srch01_HdrR.$plnt_aprv_flg, Srch03_RsltR.$plnt_aprv_flg);
			addColumnPathMap(Srch01_HdrR.$insp_aprv_flg, Srch03_RsltR.$insp_aprv_flg);
			addColumnPathMap(Srch01_HdrR.$insp_bind_typ, Srch03_RsltR.$insp_bind_typ);
			addColumnPathMap(Srch01_HdrR.$spl_qty, Srch03_RsltR.$spl_qty);
		}
	}

	protected Map_InspInst_Ins01_RsltR_Chk01_HdrR<InspInst_Ins01_RsltR,Chk01_HdrR> createMap_InspInst_Ins01_RsltR_Chk01_HdrR() {
		return new Map_InspInst_Ins01_RsltR_Chk01_HdrR<InspInst_Ins01_RsltR, Chk01_HdrR>();
	}

	public class Map_InspInst_Ins01_RsltR_Chk01_HdrR<D extends InspInst_Ins01_RsltR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Ins01_RsltR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_schd_no, Chk01_HdrR.$insp_schd_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_mtd_typ, Chk01_HdrR.$insp_mtd_typ);
			addColumnPathMap(InspInst_Ins01_RsltR.$inst_dt, Chk01_HdrR.$inst_dt);
			addColumnPathMap(InspInst_Ins01_RsltR.$st_tm, Chk01_HdrR.$st_tm);
			addColumnPathMap(InspInst_Ins01_RsltR.$end_tm, Chk01_HdrR.$end_tm);
			addColumnPathMap(InspInst_Ins01_RsltR.$inst_dpt_cd, Chk01_HdrR.$inst_dpt_cd);
			addColumnPathMap(InspInst_Ins01_RsltR.$inst_usr_cd, Chk01_HdrR.$inst_usr_cd);
			addColumnPathMap(InspInst_Ins01_RsltR.$master_dt, Chk01_HdrR.$master_dt);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_ptn_cd, Chk01_HdrR.$insp_ptn_cd);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_std_no, Chk01_HdrR.$insp_std_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$plnt_aprv_flg, Chk01_HdrR.$plnt_aprv_flg);
			addColumnPathMap(InspInst_Ins01_RsltR.$lims_flg, Chk01_HdrR.$lims_flg);
			addColumnPathMap(InspInst_Ins01_RsltR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(InspInst_Ins01_RsltR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(InspInst_Ins01_RsltR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(InspInst_Ins01_RsltR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_no, Chk01_HdrR.$insp_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ);

		}
	}

	protected Map_InspInst_Ins01_RsltStdR_Chk01_DtlStdR<InspInst_Ins01_RsltStdR,Chk01_DtlStdR> createMap_InspInst_Ins01_RsltStdR_Chk01_DtlStdR() {
		return new Map_InspInst_Ins01_RsltStdR_Chk01_DtlStdR<InspInst_Ins01_RsltStdR, Chk01_DtlStdR>();
	}

	public class Map_InspInst_Ins01_RsltStdR_Chk01_DtlStdR<D extends InspInst_Ins01_RsltStdR, S extends Chk01_DtlStdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Ins01_RsltStdR.$peg_no, Chk01_DtlStdR.$peg_no);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$std_insp_inst_no, Chk01_DtlStdR.$std_insp_inst_no);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$insp_seq, Chk01_DtlStdR.$insp_seq);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$insp_point_cd, Chk01_DtlStdR.$insp_point_cd);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$insp_qlqn_typ, Chk01_DtlStdR.$insp_qlqn_typ);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$ql_std_val, Chk01_DtlStdR.$ql_std_val);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$trd_unit_cd, Chk01_DtlStdR.$trd_unit_cd);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$qn_int_digit, Chk01_DtlStdR.$qn_int_digit);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$qn_int_frac, Chk01_DtlStdR.$qn_int_frac);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$qn_out_min, Chk01_DtlStdR.$qn_out_min);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sign_out_min_typ, Chk01_DtlStdR.$sign_out_min_typ);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$qn_in_min, Chk01_DtlStdR.$qn_in_min);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sign_in_min_typ, Chk01_DtlStdR.$sign_in_min_typ);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sign_in_max_typ, Chk01_DtlStdR.$sign_in_max_typ);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$qn_in_max, Chk01_DtlStdR.$qn_in_max);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sign_out_max_typ, Chk01_DtlStdR.$sign_out_max_typ);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$qn_out_max, Chk01_DtlStdR.$qn_out_max);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$intr_rmrks, Chk01_DtlStdR.$intr_rmrks);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sub_char1, Chk01_DtlStdR.$sub_char1);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sub_char2, Chk01_DtlStdR.$sub_char2);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$sub_char3, Chk01_DtlStdR.$sub_char3);
			addColumnPathMap(InspInst_Ins01_RsltStdR.$add_point_flg, Chk01_DtlStdR.$add_point_flg);

		}
	}

	protected Map_InspInst_Ins01_RsltSchdR_Chk01_DtlSchdR<InspInst_Ins01_RsltSchdR,Chk01_DtlSchdR> createMap_InspInst_Ins01_RsltSchdR_Chk01_DtlSchdR() {
		return new Map_InspInst_Ins01_RsltSchdR_Chk01_DtlSchdR<InspInst_Ins01_RsltSchdR, Chk01_DtlSchdR>();
	}

	public class Map_InspInst_Ins01_RsltSchdR_Chk01_DtlSchdR<D extends InspInst_Ins01_RsltSchdR, S extends Chk01_DtlSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Ins01_RsltSchdR.$peg_no, Chk01_DtlSchdR.$peg_no);
			addColumnPathMap(InspInst_Ins01_RsltSchdR.$insp_schd_no, Chk01_DtlSchdR.$insp_schd_no);
			addColumnPathMap(InspInst_Ins01_RsltSchdR.$smpl_inst_qty, Chk01_DtlSchdR.$smpl_inst_qty);

		}
	}

	protected Map_InspInst_Upd01_RsltR_Chk02_HdrR<InspInst_Upd01_RsltR,Chk02_HdrR> createMap_InspInst_Upd01_RsltR_Chk02_HdrR() {
		return new Map_InspInst_Upd01_RsltR_Chk02_HdrR<InspInst_Upd01_RsltR, Chk02_HdrR>();
	}

	public class Map_InspInst_Upd01_RsltR_Chk02_HdrR<D extends InspInst_Upd01_RsltR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Upd01_RsltR.$peg_no, Chk02_HdrR.$peg_no);
			addColumnPathMap(InspInst_Upd01_RsltR.$insp_no, Chk02_HdrR.$insp_no);
			addColumnPathMap(InspInst_Upd01_RsltR.$inst_dt, Chk02_HdrR.$inst_dt);
			addColumnPathMap(InspInst_Upd01_RsltR.$st_tm, Chk02_HdrR.$st_tm);
			addColumnPathMap(InspInst_Upd01_RsltR.$end_tm, Chk02_HdrR.$end_tm);
			addColumnPathMap(InspInst_Upd01_RsltR.$inst_usr_cd, Chk02_HdrR.$inst_usr_cd);
			addColumnPathMap(InspInst_Upd01_RsltR.$inst_dpt_cd, Chk02_HdrR.$inst_dpt_cd);
			addColumnPathMap(InspInst_Upd01_RsltR.$master_dt, Chk02_HdrR.$master_dt);
			addColumnPathMap(InspInst_Upd01_RsltR.$insp_ptn_cd, Chk02_HdrR.$insp_ptn_cd);
			addColumnPathMap(InspInst_Upd01_RsltR.$insp_mtd_typ, Chk02_HdrR.$insp_mtd_typ);
			addColumnPathMap(InspInst_Upd01_RsltR.$insp_std_no, Chk02_HdrR.$insp_std_no);
			addColumnPathMap(InspInst_Upd01_RsltR.$plnt_aprv_flg, Chk02_HdrR.$plnt_aprv_flg);
			addColumnPathMap(InspInst_Upd01_RsltR.$lims_flg, Chk02_HdrR.$lims_flg);
			addColumnPathMap(InspInst_Upd01_RsltR.$intr_rmrks, Chk02_HdrR.$intr_rmrks);
			addColumnPathMap(InspInst_Upd01_RsltR.$sub_char1, Chk02_HdrR.$sub_char1);
			addColumnPathMap(InspInst_Upd01_RsltR.$sub_char2, Chk02_HdrR.$sub_char2);
			addColumnPathMap(InspInst_Upd01_RsltR.$sub_char3, Chk02_HdrR.$sub_char3);
		}
	}

	protected Map_InspInst_Upd01_RsltStdR_Chk02_DtlStdR<InspInst_Upd01_RsltStdR,Chk02_DtlStdR> createMap_InspInst_Upd01_RsltStdR_Chk02_DtlStdR() {
		return new Map_InspInst_Upd01_RsltStdR_Chk02_DtlStdR<InspInst_Upd01_RsltStdR, Chk02_DtlStdR>();
	}

	public class Map_InspInst_Upd01_RsltStdR_Chk02_DtlStdR<D extends InspInst_Upd01_RsltStdR, S extends Chk02_DtlStdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Upd01_RsltStdR.$data_crud_typ, Chk02_DtlStdR.$data_crud_typ);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$insp_no, Chk02_DtlStdR.$insp_no);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$std_insp_inst_no, Chk02_DtlStdR.$std_insp_inst_no);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$insp_seq, Chk02_DtlStdR.$insp_seq);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$insp_point_cd, Chk02_DtlStdR.$insp_point_cd);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$insp_qlqn_typ, Chk02_DtlStdR.$insp_qlqn_typ);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$ql_std_val, Chk02_DtlStdR.$ql_std_val);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$trd_unit_cd, Chk02_DtlStdR.$trd_unit_cd);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$qn_int_digit, Chk02_DtlStdR.$qn_int_digit);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$qn_int_frac, Chk02_DtlStdR.$qn_int_frac);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$qn_out_min, Chk02_DtlStdR.$qn_out_min);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sign_out_min_typ, Chk02_DtlStdR.$sign_out_min_typ);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$qn_in_min, Chk02_DtlStdR.$qn_in_min);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sign_in_min_typ, Chk02_DtlStdR.$sign_in_min_typ);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sign_in_max_typ, Chk02_DtlStdR.$sign_in_max_typ);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$qn_in_max, Chk02_DtlStdR.$qn_in_max);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sign_out_max_typ, Chk02_DtlStdR.$sign_out_max_typ);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$qn_out_max, Chk02_DtlStdR.$qn_out_max);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$intr_rmrks, Chk02_DtlStdR.$intr_rmrks);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sub_char1, Chk02_DtlStdR.$sub_char1);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sub_char2, Chk02_DtlStdR.$sub_char2);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$sub_char3, Chk02_DtlStdR.$sub_char3);
			addColumnPathMap(InspInst_Upd01_RsltStdR.$add_point_flg, Chk02_DtlStdR.$add_point_flg);
		}
	}

	protected Map_InspInst_Upd01_RsltSchdR_Chk02_DtlSchdR<InspInst_Upd01_RsltSchdR,Chk02_DtlSchdR> createMap_InspInst_Upd01_RsltSchdR_Chk02_DtlSchdR() {
		return new Map_InspInst_Upd01_RsltSchdR_Chk02_DtlSchdR<InspInst_Upd01_RsltSchdR, Chk02_DtlSchdR>();
	}

	public class Map_InspInst_Upd01_RsltSchdR_Chk02_DtlSchdR<D extends InspInst_Upd01_RsltSchdR, S extends Chk02_DtlSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Upd01_RsltSchdR.$insp_schd_no, Chk02_DtlSchdR.$insp_schd_no);
			addColumnPathMap(InspInst_Upd01_RsltSchdR.$smpl_inst_qty, Chk02_DtlSchdR.$smpl_inst_qty);
		}
	}

	//FMCB CUSTOM END
}