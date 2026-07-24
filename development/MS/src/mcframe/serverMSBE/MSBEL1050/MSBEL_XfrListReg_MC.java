package mcframe.serverMSBE.MSBEL1050;

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
import mcframe.serverMSBE.MSBEL1050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverMSBE.MSBEL5210.*;
import mcframe.serverMSBE.MSBEL5220.*;
import mcframe.serverMSBE.MSBEL5550.*;

import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMSUC.MSUCL0010.*;
import static mcframe.serverMSBE.MSBEL1050.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import java.util.ArrayList;
import java.util.List;
import mcframe.commonCore.param.MCParam;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import mcframe.serverMSLA.MSLAL6050.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;

import java.util.HashMap;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrListReg_MC extends MSBEL_XfrListReg_MC_A{
	//FMCB CUSTOM START

	protected MCList<Srch_RsltR> _allocResultL = MCList.create(Srch_RsltR.class);
	protected MCList<Srch_TgtR> _unAllocResultL = MCList.create(Srch_TgtR.class);

	protected MCList<MST_XFR_SCHD_R> _xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
	protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
	protected MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
	protected MCQueryApiBuilder _xfrAllocL_bldr = MCQueryApiBuilder.create(t);
	protected MCIndexKey _xfrSchdIdx;
	protected MCIndexKey _xfrAllocIdx;
	protected MCList<MST_XFR_INST_R> _xfrInstL = MCList.create(MST_XFR_INST_R.class);
	protected MCIndexKey _xfrInstIdx;
	protected MCList<MST_XFR_INST_D_R> _xfrInstDL = MCList.create(MST_XFR_INST_D_R.class);
	protected MCIndexKey _xfrInstDIdx;
	protected MCList<MST_XFR_ACT_R> _xfrActL = MCList.create(MST_XFR_ACT_R.class);
	protected MCList<MST_XFR_ACT_D_R> _xfrActDL = MCList.create(MST_XFR_ACT_D_R.class);

	// 操作種別
	protected String _ope_ins = "1";
	protected String _ope_upd = "2";
	protected String _ope_prnt = "3";
	protected String _ope_del = "4";
	protected String _ope_ref = "5";

	// スレッド分割条件
	protected String[] headerCond, allocCond;
	protected MCRowComparator<Chk01_RsltR> headerComp, allocComp;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指図登録、予定訂正のために移動引当状況を検索します。<br>
	 */
	public class Srch01 extends MSBEL_XfrListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			up0().addStringColumn("ship_inst_pick", MAC_SHIP_INST_TYP.PICK.value());
			up0().addStringColumn("ship_inst_no_pick", MAC_SHIP_INST_TYP.NO_PICK.value());

			if (isSame(up0().ope(), _ope_upd) || 
					isSame(up0().ope(), _ope_ref)) {
				up0().addStringColumn("ship_inst_non", MAC_SHIP_INST_TYP.NON.value());
			}

			MCQueryPlan sql = MSBEL1050_MST_XFR_ALLOC_STS_S01();
			searchForDL(sql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			setWmsflg(down0(), MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), false);
			
			MCList<Srch01_RsltR> rsltL =  MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				r.wms_tgt_flg(r.wms_flg());
				
				if(up0().wms_flg() && r.wms_flg()) {
					rsltL.add(r);
				}
				if(up0().not_wms_flg() && !r.wms_flg()) {
					rsltL.add(r);
				}
			}
			down0().setAll(rsltL);
			for (Srch01_RsltR r : down0()) {
				// 梱包数量の設定
				setPckgUnitQty(r);

				// 実際有効成分の設定
				setActContQty(r);

				// 標準有効成分の設定
				setStdContQty(r);
				// 梱包不可ＦＬＧの設定
				r.pack_disable_flg(!isPack_trdPtn(r));
			}
		}
		/**
		 * まとめ対象かどうか
		 */
		protected boolean isPack_trdPtn(Srch01_RsltR r) {
			if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				if (!isNull(r.xfr_src_typ())) {
					if (!MSC_XFR_SRC_TYP.isWG_RQST(r.xfr_src_typ()) && !MSC_XFR_SRC_TYP.isSLO(r.xfr_src_typ())) {
						return true;
					}
				}
			}

			return false;
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 実績登録のために移動引当状況と移動指図を検索します。<br>
	 */
	public class Srch02 extends MSBEL_XfrListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			//検索条件に移動指図に関する項目が設定されている場合は、指図対象外のデータは検索しない
			if (!containsInstCols()) {
				up0().addStringColumn("ship_inst_non", MAC_SHIP_INST_TYP.NON.value());
				MCQueryPlan allocStsSql = MSBEL1050_MST_XFR_ALLOC_STS_S01();
				searchForDL(allocStsSql, up0(), down0());
			}

			MCQueryPlan instSql = MSBEL1050_MST_XFR_INST_D_S01();
			searchForDL(instSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setWmsflg(down0(), MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV.value(), false);

			MCList<Srch01_RsltR> rsltL =  MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if(up0().wms_flg() && r.wms_flg()) {
					rsltL.add(r);
				}
				if(up0().not_wms_flg() && !r.wms_flg()) {
					rsltL.add(r);
				}
			}
			down0().setAll(rsltL);

			for (Srch01_RsltR r : down0()) {
				// 残数量の設定（一部実績済）
				setXfrBacklog(r);

				// 梱包数量の設定
				setPckgUnitQty(r);

				// 実際有効成分の設定
				setActContQty(r);

				// 標準有効成分の設定
				setStdContQty(r);
			}
		}

		protected String[] _instCols = {
				Srch01_CndR.$xfr_inst_dt_fr,
				Srch01_CndR.$xfr_inst_dt_to,
				Srch01_CndR.$inst_usr_cd,
				Srch01_CndR.$inst_usr_nm,
				Srch01_CndR.$inst_dpt_cd,
				Srch01_CndR.$inst_dpt_nm,
				Srch01_CndR.$trd_rmrks,
				Srch01_CndR.$inst_rmrks,
				Srch01_CndR.$h_sub_char1,
				Srch01_CndR.$h_sub_char2,
				Srch01_CndR.$h_sub_char3,
				Srch01_CndR.$intr_d_rmrks,
				Srch01_CndR.$trd_d_rmrks,
				Srch01_CndR.$inst_d_rmrks,
				Srch01_CndR.$d_sub_char1,
				Srch01_CndR.$d_sub_char2,
				Srch01_CndR.$d_sub_char3,
				Srch01_CndR.$dlv_slip_no,
				Srch01_CndR.$dlv_slip_d_no,
				Srch01_CndR.$xfr_inst_no,
				Srch01_CndR.$xfr_inst_d_no
			};

		/**
		 * 検索条件に指図項目が含まれているか
		 */
		protected boolean containsInstCols() {
			return !isNullAnd(up0().toArray(_instCols));
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 移動指図ヘッダを検索します。<br>
	 */
	public class Srch03 extends MSBEL_XfrListReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			// 検索モード「納品書」
			if (isSame(up0().mode(), "3")) {
				searchForDL(MSBEL1050_MST_XFR_INST_S02(), up0(), down0());
			}
			else {
				searchForDL(MSBEL1050_MST_XFR_INST_S01(), up0(), down0());
			}
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			chkDac(down0());
			// 操作種別「帳票発行」
			if (isSame(up0().ope(), "3")) {
				setNonDlvPrntFlg(down0());
			}
		}

		/**
		 * 読取権限チェック
		 * @param down
		 */
		protected void chkDac(MCList<Srch01_RsltR> down) {
			MCList<MST_XFR_INST_D_R> instDInfoL = MCList.create(MST_XFR_INST_D_R.class);
			MST_XFR_INST_D_R t0 = MST_XFR_INST_D_R.create("T");
			MCQueryApiBuilder instDInfoL_bldr = MCQueryApiBuilder.create(t0);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");

			// 移動引当状況から出荷場所を取得
			instDInfoL.addStringColumn("gi_loc_cd");
			instDInfoL.addStringColumn("lg_grp_cd");
			instDInfoL_bldr.setSelect(t0.xfr_inst_no, t0.itm_cd,
					t0.itm_sub1, t0.itm_sub2, t0.itm_sub3);
			instDInfoL_bldr.addSelect(t1.lg_grp_cd);
			instDInfoL_bldr.addSelect(t1.gi_loc_cd);
			instDInfoL_bldr.addLeftOuterJoin(t1,
					bracket(t1.xfr_inst_d_no.eq(t0.xfr_inst_d_no)));
			instDInfoL_bldr.setWhere(t0.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL1050_MST_XFR_INST_D_S01", instDInfoL, instDInfoL_bldr, down);
			
			MCIndexKey instDIndex = instDInfoL.createIndex(MST_XFR_INST_D_R.$xfr_inst_no);
			
			// キャッシュ
			itmLgGrpLocCache(instDInfoL);
			locCache(down);

			// DACチェック
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down) {
				if (!readableLocCdDac(r.gr_loc_cd())
						&& !readableLgGrpCdDac(r.lg_grp_cd())
						&& !chkDtlDac(r, instDInfoL.subList(instDIndex, r.xfr_inst_no()))) {
					continue;
				}
				tmpL.add(r);
			}
			down.clear();
			down.addAll(tmpL);
		}
		
		protected boolean chkDtlDac(Srch01_RsltR down, MCList<MST_XFR_INST_D_R> instDInfoL) {
			
			MAM_LOC_R locR = getLocCache(down.lg_grp_cd());

			boolean hasReadableDac = true;
			for (MST_XFR_INST_D_R instDInfoR : instDInfoL) {
				MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(
						instDInfoR.itm_cd(), instDInfoR.itm_sub1(), instDInfoR.itm_sub2(),
						instDInfoR.itm_sub3(), down.lg_grp_cd());

				String strLocCd = !isNull(instDInfoR.getStringNE("gi_loc_cd"))
						? instDInfoR.getStringNE("gi_loc_cd")
						: !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
								: !isNull(locR) ? locR.loc_cd() : null;

				hasReadableDac = readableLocCdDac(strLocCd);

				if (!hasReadableDac) {
					break;
				}
			}
			
			return hasReadableDac;
		}
		
		protected void setNonDlvPrntFlg(MCList<Srch01_RsltR> down0) {
			if (down0.isEmpty()) {
				return;
			}
			MCList<MST_XFR_INST_R> actL = checkXfrAct(down0);
			MCIndexKey idxkey = 
				isSame(up0().mode(), "3") ? 
					actL.createIndex(MST_XFR_INST_R.$xfr_inst_no, MST_DLV_SLIP_R.$dlv_slip_no) :
					actL.createIndex(MST_XFR_INST_R.$xfr_inst_no);
			for (Srch01_RsltR r :down0) {
				// 以下の条件を満たす場合、納品書は発行不可
				// ・指図で発行していない
				// ・実績登録済み
				for (MST_XFR_INST_R actR : actL.subList(idxkey, r.toArray(idxkey.getKeys()))) {
					if (!actR.dlv_prnt_flg() && !isNull(actR.getStringNE("xfr_act_no"))) {
						r.non_dlv_prnt_flg(true);
						break;
					}
				}
			}
		}
		protected MCList<MST_XFR_INST_R> checkXfrAct(MCList<Srch01_RsltR> bindL) {
			MST_XFR_INST_R dbc = MST_XFR_INST_R.create();
			dbWkDelete("MSBEL1050_MSW_XFR_INST_D01", dbc);
			dbWkInsert("MSBEL1050_MSW_XFR_INST_I01", bindL, dbc);
	
			MSW_XFR_INST_KEY_R w = MSW_XFR_INST_KEY_R.create("W");
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
			MST_DLV_SLIP_R t3 = MST_DLV_SLIP_R.create("T3");
			MST_XFR_ACT_R t4 = MST_XFR_ACT_R.create("T4");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(w);
			bldr.addInnerJoin(t1, t1.xfr_inst_no.eq(w.xfr_inst_no));
			bldr.addInnerJoin(t2, t2.xfr_inst_d_no.eq(t1.xfr_inst_d_no));
			bldr.addLeftOuterJoin(t3,
				t3.dlv_slip_no.eq(t2.dlv_slip_no)
				.and(t3.dlv_slip_seq.eq(t2.dlv_slip_seq))
			);
			bldr.addLeftOuterJoin(t4, t4.xfr_inst_no.eq(t1.xfr_inst_no));
			bldr.setGroupBy(t1.xfr_inst_no, t2.dlv_slip_no);
			bldr.addMin(t3.slip_prnt_flg, "dlv_prnt_flg");
			bldr.addMin(t4.xfr_act_no, "xfr_act_no");
			
			MCList<MST_XFR_INST_R> rsltL = MCList.create(MST_XFR_INST_R.class);
			rsltL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
			rsltL.addStringColumn(MST_XFR_ACT_R.$xfr_act_no);
			dbSelect("MSBEL1050_MST_XFR_INST_S04", rsltL, bldr);
			
			dbWkDelete("MSBEL1050_MSW_XFR_INST_D02", dbc);
			return rsltL;
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 移動実績ヘッダを検索します。<br>
	 */
	public class Srch04 extends MSBEL_XfrListReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			// 検索モード「納品書」
			if (isSame(up0().mode(), "3")) {
				searchForDL(MSBEL1050_MST_XFR_ACT_S02(), up0(), down0());
			}
			else {
				searchForDL(MSBEL1050_MST_XFR_ACT_S01(), up0(), down0());
			}
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			chkDac(down0());
		}
		
		/**
		 * 読取権限チェック 
		 * @param down
		 */
		protected void chkDac(MCList<Srch01_RsltR> down) {
			MCList<MST_XFR_ACT_D_R> actDInfoL = MCList.create(MST_XFR_ACT_D_R.class);
			MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder actDInfoL_bldr = MCQueryApiBuilder.create(t);

			// 移動実績明細を取得
			actDInfoL_bldr.setSelect(t.xfr_act_no);
			actDInfoL_bldr.addSelect(t.gi_loc_cd);
			dbSelect("MSBEL1050_MST_XFR_ACT_D_S01", actDInfoL, actDInfoL_bldr, down);
			
			down.addStringColumn("chk_gi_loc_cd");
			MCIndexKey actDIndex = actDInfoL.createIndex(MST_XFR_ACT_D_R.$xfr_act_no);
			
			// DACチェック
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down) {
				MCList<MST_XFR_ACT_D_R> actDL = actDInfoL.subList(actDIndex, r.xfr_act_no());

				if (!readableLocCdDac(r.gr_loc_cd())
						&& !readableLgGrpCdDac(r.lg_grp_cd())
						&& !actDL.subList(rr -> !readableLocCdDac(rr.gi_loc_cd())).isEmpty()) {
					continue;
				}
				tmpL.add(r);
			}
			down.clear();
			down.addAll(tmpL);
		}
	}
	/**
	 * Srch05オペレーション.<p>
	 *
	 * 予定参照のために移動引当状況と移動指図を検索します。<br>
	 */
	public class Srch05 extends MSBEL_XfrListReg_MC_A.Srch05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			MCQueryPlan instSql = MSBEL1050_MST_XFR_ALLOC_STS_S02();

			if (!isNull(up0().itm_cd()) || !isNull(up0().itm_sub1()) || !isNull(up0().itm_sub2()) || !isNull(up0().itm_sub3())
					|| !isNull(up0().itm_nm()) || !isNull(up0().itm_typ()) || !isNull(up0().itm_typ_d_cd()) || !isNull(up0().pckg_unit_cd())) {
				execDbWkDelete("MSBEL1050_MSW_XFR_ALLOC_STS_KEY_D01", MSW_XFR_ALLOC_STS_KEY_R.create("T"));
				executeUpdate(MSBEL1050_MSW_XFR_ALLOC_STS_KEY_I01(), up0());
			}
			searchForDL(instSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setWmsflg(down0(), MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), true);

			MCList<Srch01_RsltR> rsltL =  MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {

				r.wms_tgt_flg(r.wms_flg());
				if (up0().wms_flg() && r.wms_flg()) {
					rsltL.add(r);
				}
				if (up0().not_wms_flg() && !r.wms_flg()) {
					rsltL.add(r);
				}
			}
			down0().setAll(rsltL);

			for (Srch01_RsltR r : down0()) {
				// 梱包数量の設定
				setPckgUnitQty(r);

				// 実際有効成分の設定
				setActContQty(r);

				// 標準有効成分の設定
				setStdContQty(r);
			}
		}
	}
	/**
	 * Srch06オペレーション.<p>
	 *
	 * 明細実績参照のために移動実績明細を検索します。<br>
	 */
	public class Srch06 extends MSBEL_XfrListReg_MC_A.Srch06 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			MCQueryPlan instSql = MSBEL1050_MST_XFR_ACT_D_S01();
			searchForDL(instSql, up0(), down0());

		}

		@Override
		protected void editListMain() {
			super.editListMain();

			for (Srch01_RsltR r : down0()) {
				// 梱包数量の設定
				setPckgUnitQty(r);

				// 実際有効成分の設定
				setActContQty(r);

				// 標準有効成分の設定
				setStdContQty(r);

				// 進捗状況区分 (計画外のみ)
				if (isSame(r.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value())) {
					r.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
				}
			}
		}
	}
	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void setWmsflg(MCList<Srch01_RsltR> dtlL, String ifProcTyp, boolean isCheckPick) {
		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		Map<MCNumber, Srch01_RsltR> map = new HashMap<MCNumber, Srch01_RsltR>();
		MCNumber peg = MCNumber.ZERO;
		for (Srch01_RsltR dtlR : dtlL) {
			if(isCheckPick) {
				if (MAC_SHIP_INST_TYP.isPICK(dtlR.ship_inst_typ())) {
					SCMLinkUtil_Srch01_CndR r = o.up0().add();
					r.peg_no(peg);
					r.if_proc_typ(ifProcTyp);
					r.loc_cd(dtlR.gi_loc_cd());
					r.lg_grp_cd(dtlR.lg_grp_cd());
					r.master_dt(getToday());

					map.put(peg, dtlR);
					peg = peg.add(1);
				} 
				else if(MAC_SHIP_INST_TYP.isNON(dtlR.ship_inst_typ())) {
					dtlR.wms_flg(false);
				}
			}
			else {
				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(ifProcTyp);
				r.loc_cd(dtlR.gi_loc_cd());
				r.lg_grp_cd(dtlR.lg_grp_cd());
				r.master_dt(getToday());

				map.put(peg, dtlR);
				peg = peg.add(1);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
				if (map.containsKey(r.peg_no())) {
					Srch01_RsltR dtlR = map.get(r.peg_no());
					dtlR.wms_flg(!isNull(r.ext_sys_cd()));
				}
			}
		}
	}

	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {

		if (up.not_inst_flg()) {
			up.addStringColumn("pr_sts_not_inst", MSC_PR_STS_TYP.NOT_INST.value());
		}
		if (up.inst_flg()) {
			up.addStringColumn("pr_sts_inst", MSC_PR_STS_TYP.INST.value());
		}
		if (up.p_xfr_flg()) {
			up.addStringColumn("pr_sts_part_xfr", MSC_PR_STS_TYP.PART_COMP.value());
		}
		if (up.sts_cmpl_flg()) {
			up.addStringColumn("pr_sts_cmpl", MSC_PR_STS_TYP.COMP.value());
		}
		// 引当
		if (up.not_alloc_flg() && up.alloc_flg()){
			up.addStringColumn("not_alloc_true", null);
			up.addStringColumn("alloc_true", null);
		}
		else{
			up.addStringColumn("not_alloc_true", toTrueStr(up.not_alloc_flg()));
			up.addStringColumn("alloc_true", toTrueStr(up.alloc_flg()));
		}
		// 予定完了
		if (up.schd_not_cmpl_flg() && up.schd_cmpl_flg()){
			up.addStringColumn("schd_not_cmpl_true", null);
			up.addStringColumn("schd_cmpl_true", null);
		}
		else{
			up.addStringColumn("schd_not_cmpl_true", toTrueStr(up.schd_not_cmpl_flg()));
			up.addStringColumn("schd_cmpl_true", toTrueStr(up.schd_cmpl_flg()));
		}
		// ピッキングリスト発行
		if (up.pick_not_prnt_flg() && up.pick_prnt_flg()){
			up.addStringColumn("pick_not_prnt_true", null);
			up.addStringColumn("pick_prnt_true", null);
		}
		else{
			up.addStringColumn("pick_not_prnt_true", toTrueStr(up.pick_not_prnt_flg()));
			up.addStringColumn("pick_prnt_true", toTrueStr(up.pick_prnt_flg()));
		}
		// 指図書発行
		if (up.inst_not_prnt_flg() && up.inst_prnt_flg()){
			up.addStringColumn("inst_not_prnt_true", null);
			up.addStringColumn("inst_prnt_true", null);
		}
		else{
			up.addStringColumn("inst_not_prnt_true", toTrueStr(up.inst_not_prnt_flg()));
			up.addStringColumn("inst_prnt_true", toTrueStr(up.inst_prnt_flg()));
		}
		// 納品書発行
		if (up.dlv_not_prnt_flg() && up.dlv_prnt_flg()){
			up.addStringColumn("dlv_not_prnt_true", null);
			up.addStringColumn("dlv_prnt_true", null);
		}
		else{
			up.addStringColumn("dlv_not_prnt_true", toTrueStr(up.dlv_not_prnt_flg()));
			up.addStringColumn("dlv_prnt_true", toTrueStr(up.dlv_prnt_flg()));
		}
		// 打切含む
		up.addStringColumn("abort_false", toTrueStr(!up.abort_flg()));
		// 依頼元訂正のみ
		up.addStringColumn("rqst_mod_true", toTrueStr(up.rqst_mod_flg()));

		if (isSame(up.ope(), _ope_prnt)) {
			up.addStringColumn("no_abort", toFalseStr(false));
		}
	}

	protected void setXfrBacklog(Srch01_RsltR r) {
		MCNumber actSchdQty = getActSchdQty(r);
		r.base_unit_qty(actSchdQty.subtract(nvl(r.base_unit_act_qty(), MCNumber.ZERO)));

		if (!isSame(r.base_unit_qty(), r.base_unit_schd_qty())) {
			//基準単位から取引単位へ換算する
			r.trd_unit_qty(rvrsBaseUnitConv(r.base_unit_qty(),
						r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.trd_unit_dec_place(), r.trd_unit_rnd_typ(), true));

			//端数が出る場合は、取引単位を基準単位に置き換える
			if (isNull(r.trd_unit_qty())) {
				r.trd_unit_cd(r.base_unit_cd());
				r.trd_unit_nm(r.base_unit_nm());
				r.trd_unit_qty(r.base_unit_qty());
			}
		}
	}

	protected MCNumber getActSchdQty(Srch01_RsltR r) {
		if(MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
			return r.base_unit_schd_qty();
		}
		else {
			return r.base_unit_inst_qty();
		}
	}

	protected void setActContQty(Srch01_RsltR r) {
		if (r.cont_fctr_flg()) {
			MCNumber qty = convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
			r.act_cont_qty(qty);
		}
	}

	protected void setStdContQty(Srch01_RsltR r) {
		if (r.cont_fctr_flg()) {
			MCNumber qty = convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
			r.std_cont_qty(qty);
		}
	}

	protected void setPckgUnitQty(Srch01_RsltR r) {
		if (!isNull(r.pckg_unit_cd())) {
			MCNumber qty = rvrsBaseUnitConv(r.base_unit_qty(), r.pckg_unit_conv_base_qty(), 
					r.pckg_unit_conv_qty(), r.pckg_unit_dec_place(), MAC_RND_TYP.RNDUP.value());
			r.pckg_unit_qty(qty);
		}
	}

	/**
	 * 移動・移送予定のロック
	 */
	protected void lockXfrSchd(MCList<Chk01_RsltR> notErrL) {
		//移動・移送予定のロック
		MCList<Chk01_RsltR> bindL = notErrL.subList(r -> (!(MAC_STR.isNULL_VAL(r.xfr_schd_no()) || isNull(r.xfr_schd_no())))).groupBy(Chk01_RsltR.$xfr_schd_no);

		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t);

		bindL.sort(Chk01_RsltR.$xfr_schd_no);
		xfrSchdL_bldr.setOrderByAsc(t.xfr_schd_no);
		dbSelectKeyForUpdate("MSBEL1050_MST_XFR_SCHD_S01", _xfrSchdL, xfrSchdL_bldr, bindL);
		_xfrSchdIdx = _xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
	}

	/**
	 * 移動引当状況のロック及び更新カウンタチェック
	 */
	protected MCMessageList chkAndLockXfrAlloc(MCList<Chk01_RsltR> notErrL) {
		MCMessageList msgL = new MCMessageList();
		if (notErrL.isEmpty()) {
			return msgL;
		}

		//移動引当状況のロック、更新カウンタチェック
		
		MCList<Chk01_RsltR> bindXAL = notErrL.groupBy(Chk01_RsltR.$xfr_alloc_sts_no);
		bindXAL.sort(Chk01_RsltR.$xfr_alloc_sts_no);
		_xfrAllocL.addStringColumn("itm_cd");
		_xfrAllocL.addStringColumn("itm_sub1");
		_xfrAllocL.addStringColumn("itm_sub2");
		_xfrAllocL.addStringColumn("itm_sub3");
		
		MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
		_xfrAllocL_bldr.addSelect(t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3);
		_xfrAllocL_bldr.addSelect(t1.xfr_inst_no);
		_xfrAllocL_bldr.addLeftOuterJoin(t1, bracket( t1.xfr_inst_d_no.eq(t.xfr_inst_d_no)));
		_xfrAllocL_bldr.setLockTable(t.xfr_alloc_sts_no);
		_xfrAllocL_bldr.setOrderByAsc(t.xfr_alloc_sts_no);
		dbSelectKeyForUpdateNoWait("MSBEL1050_MST_XFR_ALLOC_STS_S01", _xfrAllocL, _xfrAllocL_bldr, bindXAL);
		_xfrAllocIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

		for (Chk01_RsltR r : notErrL) {
			MST_XFR_ALLOC_STS_R selectR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
			if (!r.err_flg() && !isNull(r.xfr_alloc_sts_no())) {
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$alloc_sts_upd_cntr, selectR));
			}
			setErrFlgCmm(r, msgL);
		}

		return msgL;
	}
	/**
	 * 移動引当状況のロック
	 */
	protected void lockXfrAlloc(MCList<Chk01_RsltR> notErrL) {
		//移動引当状況のロック、更新カウンタチェック
		MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");

		_xfrAllocL_bldr.setSelect(t.xfr_alloc_sts_no, t.abort_flg);
		_xfrAllocL.addStringColumn("xfr_act_no");
		_xfrAllocL_bldr.addSelect(t1.xfr_act_no);
		_xfrAllocL_bldr.addInnerJoin(t1,
				bracket(t1.xfr_alloc_sts_no.eq(t.xfr_alloc_sts_no)));
		_xfrAllocL_bldr.addWhereWithAnd(t1.xfr_act_no.eq(bind(Chk01_RsltR.$xfr_act_no)));
		_xfrAllocL_bldr.setLockTable(t.xfr_alloc_sts_no);
		_xfrAllocL_bldr.addOrderByDesc(t.abort_flg);
		dbSelectForUpdateNoWait("MSBEL1050_MST_XFR_ALLOC_STS_S02", _xfrAllocL, _xfrAllocL_bldr, notErrL);
		_xfrAllocIdx = _xfrAllocL.createIndex(MST_XFR_ACT_D_R.$xfr_act_no);
	}

	/**
	 * 移動指図のロック、更新カウンタチェック
	 */
	protected MCMessageList chkAndLockXfrInst(MCList<Chk01_RsltR> notErrL) {
		MCMessageList msgL = new MCMessageList();
		if (notErrL.isEmpty()) {
			return msgL;
		}

		//移動指図のロック、更新カウンタチェック
		MST_XFR_INST_R t1 = MST_XFR_INST_R.create("T");
		MCQueryApiBuilder xfrInstL_bldr = MCQueryApiBuilder.create(t1);
		xfrInstL_bldr.setSelect(t1.xfr_inst_no, t1.gr_loc_cd, t1.lg_grp_cd, t1.upd_cntr, t1.trd_rmrks);
		xfrInstL_bldr.setOrderByAsc(t1.xfr_inst_no);

		MCList<Chk01_RsltR> bindL = notErrL.subList(r -> (!(MAC_STR.isNULL_VAL(r.xfr_inst_no()) || isNull(r.xfr_inst_no())))).groupBy(Chk01_RsltR.$xfr_inst_no);

		bindL.sort(Chk01_RsltR.$xfr_inst_no);
		dbSelectKeyForUpdateNoWait("MSBE1050L_MST_XFR_INST_S01", _xfrInstL, xfrInstL_bldr, bindL);

		_xfrInstIdx = _xfrInstL.createIndex(MST_XFR_INST_R.$xfr_inst_no);
		for (Chk01_RsltR r : notErrL) {
			MST_XFR_INST_R instR = _xfrInstL.getFirst(_xfrInstIdx, r.xfr_inst_no());
			if (!r.err_flg() && !isNull(r.xfr_inst_no())) {
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$inst_upd_cntr, instR));
			}
			setErrFlgCmm(r, msgL);
		}

		//移動指図明細を取得
		MST_XFR_INST_D_R t2 = MST_XFR_INST_D_R.create("T");
		MCQueryApiBuilder xfrInstDL_bldr = MCQueryApiBuilder.create(t2);
		xfrInstDL_bldr.setWhere(t2.xfr_inst_no.eq(bind("xfr_inst_no")));
		dbSelectForUpdate("MSBEL1050_MST_XFR_INST_D_S02",_xfrInstDL, xfrInstDL_bldr, bindL);
		_xfrInstDIdx = _xfrInstDL.createIndex(MST_XFR_INST_D_R.$xfr_inst_d_no);

		return msgL;
	}

	/**
	 * 移動実績のロック、更新カウンタチェック
	 */
	protected MCMessageList chkAndLockXfrAct(MCList<Chk01_RsltR> notErrL) {
		MCMessageList msgL = new MCMessageList();
		if (notErrL.isEmpty()) {
			return msgL;
		}

		//移動実績
		MST_XFR_ACT_R t1 = MST_XFR_ACT_R.create("T");
		MCQueryApiBuilder xfrActL_bldr = MCQueryApiBuilder.create(t1);

		xfrActL_bldr.setSelect(t1.xfr_act_no, t1.gr_loc_cd, t1.lg_grp_cd, t1.upd_cntr);
		xfrActL_bldr.setOrderByAsc(t1.xfr_act_no);

		notErrL.sort(Chk01_RsltR.$xfr_act_no);
		dbSelectKeyForUpdateNoWait("MSBEL1050_MST_XFR_ACT_S01", _xfrActL, xfrActL_bldr, notErrL);

		MCIndexKey idxkey = _xfrActL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
		for (Chk01_RsltR r : notErrL) {
			MST_XFR_ACT_R actR = _xfrActL.getFirst(idxkey, r.xfr_act_no());
			if (!r.err_flg() && !isNull(r.xfr_act_no())) {
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$act_upd_cntr, actR));
			}
			setErrFlgCmm(r, msgL);
		}

		
		
		//移動実績明細を取得
		MST_XFR_ACT_D_R t2 = MST_XFR_ACT_D_R.create("T");
		MCQueryApiBuilder xfrActDL_bldr = MCQueryApiBuilder.create(t2);
		xfrActDL_bldr.setWhere(t2.xfr_act_no.eq(bind("xfr_act_no")));
		dbSelectForUpdate("MSBEL1050_MST_XFR_ACT_D_S02", _xfrActDL, xfrActDL_bldr, notErrL);

		return msgL;
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 指図登録前のチェックをします。<br>
	 */
	public class Chk01 extends MSBEL_XfrListReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			execPckgProp(notErrL);
			callXfrInstChk01(notErrL);
			setCndErrFlg(notErrL);
			setErrToRtnStsTyp();
			setDown(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			lockXfrSchd(notErrL);
			msgL.addAll(chkAndLockXfrAlloc(notErrL));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			//DACチェック
			
			notErrL.addStringColumn("chk_gi_loc_cd");
			itmLgGrpLocCache(notErrL);
			locCache(notErrL);
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}

				if (!isNull(r.gi_loc_cd())) {
					r.setStringNE("chk_gi_loc_cd", r.gi_loc_cd());
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lg_grp_cd());
					MAM_LOC_R locR = getLocCache(r.lg_grp_cd());
		
					r.setStringNE("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
				}
				MCMessageList msgDacGiL = checkWritableLocCdDac(r, "chk_gi_loc_cd");
				
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}
			msgL.addAll(chkStop(notErrL, up1()));

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {

			//データの補完
			for (Chk01_RsltR r : up0()) {

				MST_XFR_SCHD_R xsdR = _xfrSchdL.getFirst(_xfrSchdIdx, r.xfr_schd_no());
				MST_XFR_ALLOC_STS_R xasR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
				if(xsdR == null || xasR == null) {
					continue;
				}

				r.trd_cd(xasR.trd_cd());
				r.trd_ptn_typ(xasR.trd_ptn_typ());
				r.wg_cd(xsdR.gr_wg_cd());
				r.lg_grp_cd(xasR.lg_grp_cd());
				r.gr_loc_cd(xasR.gr_loc_cd());
				r.gr_stk_arrv_bp_cd(xasR.gr_stk_arrv_bp_cd());
				r.slo_no(xsdR.slo_no());

				r.pr_sts_typ(xasR.pr_sts_typ());
				r.gi_loc_cd(xasR.gi_loc_cd());
				r.gi_str_ln_cd(xasR.gi_str_ln_cd());
				r.gi_stk_arrv_bp_cd(xasR.gi_stk_arrv_bp_cd());
				r.gr_str_ln_cd(xasR.gr_str_ln_cd());
				r.itm_cd(xsdR.itm_cd());
				r.itm_sub1(xsdR.itm_sub1());
				r.itm_sub2(xsdR.itm_sub2());
				r.itm_sub3(xsdR.itm_sub3());
				r.lot_no(xasR.lot_no());
				r.sublot_no(xasR.sublot_no());
				r.sno1(xasR.sno1());
				r.sno2(xasR.sno2());
				r.sno3(xasR.sno3());
				r.sno4(xasR.sno4());
				r.ver_no(xasR.ver_no());
				r.gd_cd(xasR.gd_cd());
				r.quality_typ(xasR.quality_typ());
				r.stk_id_typ(xasR.stk_id_typ());
				r.stk_bp_cd(xasR.stk_bp_cd());
				r.trd_unit_cd(xasR.trd_unit_cd());
				r.trd_unit_qty(xasR.trd_unit_qty());
				r.base_unit_cd(xasR.base_unit_cd());
				r.base_unit_qty(xasR.base_unit_qty());
				if(isNull(up1().xfr_schd_dt())) {
					r.xfr_schd_dt(xasR.xfr_schd_dt());
				}
				else {
					r.xfr_schd_dt(up1().xfr_schd_dt());
				}
				r.rsn_cd(xasR.rsn_cd());
				r.bd_dpt_cd(xasR.bd_dpt_cd());
				r.abort_flg(xasR.abort_flg());
				r.not_lot_mix_flg(xasR.not_lot_mix_flg());
				r.not_sublot_mix_flg(xasR.not_sublot_mix_flg());
				r.vld_dt_fr(xasR.vld_dt_fr());
				r.vld_dt_to(xasR.vld_dt_to());
				r.io_schd_pr_no(xasR.io_schd_pr_no());
				r.sno1_null_flg(xasR.sno1_null_flg());
				r.sno2_null_flg(xasR.sno2_null_flg());
				r.sno3_null_flg(xasR.sno3_null_flg());
				r.sno4_null_flg(xasR.sno4_null_flg());
				r.alloc_sno1(xasR.alloc_sno1());
				r.alloc_sno2(xasR.alloc_sno2());
				r.alloc_sno3(xasR.alloc_sno3());
				r.alloc_sno4(xasR.alloc_sno4());
				r.alloc_flg(xasR.alloc_flg());
				r.ship_inst_typ(xasR.ship_inst_typ());

				r.prov_typ(xasR.prov_typ());
				r.prov_basis_typ(xasR.prov_basis_typ());
				r.ret_prov_typ(xasR.ret_prov_typ());
				r.ret_prov_basis_typ(xasR.ret_prov_basis_typ());
				r.base_dlv_slip_no(xsdR.base_dlv_slip_no());
				r.base_prov_act_no(xsdR.base_prov_act_no());
				r.base_ac_dt(xsdR.base_ac_dt());
			}
		}

		/**
		 * 移動指図サービスチェック処理
		 */
		protected void callXfrInstChk01(MCList<Chk01_RsltR> list) {
			MSBEL_XfrInstService.XfrInst_Chk01 o = MSBEL_XfrInstService.crtXfrInst_Chk01();

			for (Chk01_RsltR r : list) {
				XfrInstChk_HdrDtlR up = XfrInstChk_HdrDtlR.create();
				copy(up, r, createMap_XfrInstChk_HdrDtlR_Chk01_RsltR());
				up.immd_dlv_prnt_flg(up1().immd_dlv_prnt_flg());
				o.up0().add(up);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown(MCList<Chk01_RsltR> list) {
			if (!isNull(up0().getFirst(Chk01_RsltR.$pack_tgt_flg, true))) {
				// まとめ先でメッセージがある場合は、まとめ元のメッセージに変換する
				MCMessageList msgL = new MCMessageList();
				MCIndexKey pegIdx = list.createIndex(Chk01_RsltR.$peg_no);
				MCIndexKey toIdx = up0().createIndex(Chk01_RsltR.$inst_bndl_to_peg_no);

				for (int i = 0; i < MCMessagePool.size(); i++) {
					MCMessage msg = MCMessagePool.get(i);
					Chk01_RsltR causeR = list.getFirst(pegIdx, msg.getCauseRow().getNumber(Chk01_RsltR.$peg_no));
					if (isNull(causeR) || !causeR.inst_bndl_flg()) {
						msgL.add(msg);
					}
					else {
						for (Chk01_RsltR r :up0().subList(toIdx, causeR.inst_bndl_peg_no())) {
							ArrayList<String> l = new ArrayList<String>();
							for (String str :msg.getBindArray()) {
								if (isSame(str, " ")) {
									l.add(toDispGUIIndex(r));
								}
								else {
									l.add(str);
								}
							}
							msgL.add(new MCMessage(r, msg.getCauseColumn(), msg.getID(), l.toArray(new String[0])));
						}
					}
				}
				MCMessagePool.clear();
				MCMessagePool.addAll(msgL);

				// まとめ先でエラーになっている場合は、まとめ元をエラーにする
				MCIndexKey idx = list.createIndex(Chk01_RsltR.$inst_bndl_peg_no);
				for (Chk01_RsltR r :list) {
					if (r.inst_bndl_src_flg()) {
						if (list.getFirst(idx, r.inst_bndl_to_peg_no()).err_flg()) {
							r.err_flg(true);
							r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
						}
					}
				}
			}

			down0().setAll(list);
		}

		/**
		 * 一括設定のエラーＦＬＧの設定
		 */
		protected void setCndErrFlg(MCList<Chk01_RsltR> list) {
			// 一括設定にエラーがある場合、全てエラーにする
			if (up1().getBooleanNE("err_flg")) {
				list.setBoolean(Chk01_RsltR.$err_flg, true);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 実績登録前のチェックをします。<br>
	 */
	public class Chk02 extends MSBEL_XfrListReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			callXfrActChk01(notErrL);
			setCndErrFlg(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			msgL.addAll(chkAndLockXfrInst(notErrL));
			lockXfrSchd(notErrL);
			msgL.addAll(chkAndLockXfrAlloc(notErrL));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {

			//データの補完
			initXfrAllocStsCache(up0());
			grLocCache(_xfrAllocL);
			for (Chk01_RsltR r : up0()) {

				MST_XFR_ALLOC_STS_R xasR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
				MST_XFR_INST_D_R xidR = MST_XFR_INST_D_R.create();
				MST_XFR_SCHD_R xsdR = MST_XFR_SCHD_R.create();
				MST_XFR_INST_R xiR = MST_XFR_INST_R.create();

				if(xasR == null) {
					continue;
				}

				if (!(MAC_STR.isNULL_VAL(xasR.xfr_inst_d_no()) || isNull(xasR.xfr_inst_d_no()))){
					xidR = _xfrInstDL.getFirst(_xfrInstDIdx, xasR.xfr_inst_d_no());
				}

				if (!(MAC_STR.isNULL_VAL(xasR.xfr_schd_no()) || isNull(xasR.xfr_schd_no()))){
					xsdR = _xfrSchdL.getFirst(_xfrSchdIdx, xasR.xfr_schd_no());
				}
				if (!_xfrInstL.isEmpty()) {
					xiR = _xfrInstL.getFirst(_xfrInstIdx, r.xfr_inst_no());
					r.trd_rmrks(isNull(xiR) ? null : xiR.trd_rmrks());
				}

				r.trd_cd(xasR.trd_cd());
				r.trd_ptn_typ(xasR.trd_ptn_typ());
				r.wg_cd(getGrLocCache().get(xasR.gr_loc_cd()).wg_cd());
				r.lg_grp_cd(xasR.lg_grp_cd()); 
				r.gr_loc_cd(xasR.gr_loc_cd()); 
				r.gr_stk_arrv_bp_cd(xasR.gr_stk_arrv_bp_cd());
				r.slo_no(xsdR.slo_no());

				r.xfr_inst_d_no(xasR.xfr_inst_d_no());
				r.pr_sts_typ(xasR.pr_sts_typ()); //残数設定に使用
				r.gi_loc_cd(xasR.gi_loc_cd());
				r.gi_str_ln_cd(xasR.gi_str_ln_cd());
				r.gi_stk_arrv_bp_cd(xasR.gi_stk_arrv_bp_cd());
				r.gr_str_ln_cd(xasR.gr_str_ln_cd());

				if (!(MAC_STR.isNULL_VAL(xasR.xfr_inst_d_no()) || isNull(xasR.xfr_inst_d_no()))){
					r.itm_cd(xidR.itm_cd());
					r.itm_sub1(xidR.itm_sub1());
					r.itm_sub2(xidR.itm_sub2());
					r.itm_sub3(xidR.itm_sub3());
					r.base_dlv_slip_no(xidR.base_dlv_slip_no());
					r.base_prov_act_no(xidR.base_prov_act_no());
					r.base_ac_dt(xidR.base_ac_dt());
				}
				else {
					r.itm_cd(xsdR.itm_cd());
					r.itm_sub1(xsdR.itm_sub1());
					r.itm_sub2(xsdR.itm_sub2());
					r.itm_sub3(xsdR.itm_sub3());
					r.base_dlv_slip_no(xsdR.base_dlv_slip_no());
					r.base_prov_act_no(xsdR.base_prov_act_no());
					r.base_ac_dt(xsdR.base_ac_dt());
				}

				r.lot_no(xasR.lot_no());
				r.sublot_no(xasR.sublot_no());
				r.sno1(xasR.sno1());
				r.sno2(xasR.sno2());
				r.sno3(xasR.sno3());
				r.sno4(xasR.sno4());
				r.gd_cd(xasR.gd_cd());
				r.stk_insp_typ(xasR.stk_insp_typ());
				r.quality_typ(xasR.quality_typ());
				r.stk_id_typ(xasR.stk_id_typ());
				r.stk_bp_cd(xasR.stk_bp_cd());
				r.trd_unit_cd(xasR.trd_unit_cd());
				r.trd_unit_qty(xasR.trd_unit_qty());
				r.base_unit_cd(xasR.base_unit_cd());
				r.base_unit_qty(xasR.base_unit_qty());
				r.base_unit_act_qty(xasR.act_qty()); //残数設定に使用
				r.rsn_cd(xasR.rsn_cd());
				r.bd_dpt_cd(xasR.bd_dpt_cd());
				r.abort_flg(xasR.abort_flg());
				r.io_schd_pr_no(xasR.io_schd_pr_no());
				r.alloc_sno1(xasR.alloc_sno1());
				r.alloc_sno2(xasR.alloc_sno2());
				r.alloc_sno3(xasR.alloc_sno3());
				r.alloc_sno4(xasR.alloc_sno4());
				r.prov_typ(xasR.prov_typ());
				r.ret_prov_typ(xasR.ret_prov_typ());
				r.trd_d_rmrks(xasR.trd_d_rmrks());

				MST_XFR_ALLOC_STS_R xR = getXfrAllocStsR(r.xfr_alloc_sts_no());
				r.prov_schd_no(xR.getString("prov_schd_no"));
				r.ret_prov_schd_no(xR.getString("ret_prov_schd_no"));
			}
			// 負担部門の組織変更対応
			up0().addDateColumn("ac_dt", up1().xfr_ac_dt());
			setDpt(up0(), Chk01_RsltR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_nm, "ac_dt", true);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			// DACチェック
			
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}
				MCMessageList msgDacGiL = checkWritableLocCdDac(r, Chk01_RsltR.$gi_loc_cd);
				
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}
			msgL.addAll(chkStop(notErrL, up1()));

			for (Chk01_RsltR r : notErrL) {

				// 出庫場所が決まっていない場合はエラー
				if (isNull(r.gi_loc_cd())){
					msgL.add(new MCMessage(r, null, MSBEL0199, toDispGUIIndex(r)));
				}

				//一部完了時は残数を実績登録する
				//単位の情報はcrrctDataBeforeDoServerChk、リストロジックで補完されている想定
				if (MSC_PR_STS_TYP.isPART_COMP(r.pr_sts_typ())) {
					r.base_unit_qty(r.base_unit_qty().subtract(nvl(r.base_unit_act_qty(), MCNumber.ZERO)));

					//基準単位から取引単位へ換算する
					r.trd_unit_qty(rvrsBaseUnitConv(r.base_unit_qty(),
									r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
									r.trd_unit_dec_place(), r.trd_unit_rnd_typ(), true));

					//端数が出る場合は、取引単位を基準単位に置き換える
					if (isNull(r.trd_unit_qty())) {
						r.trd_unit_cd(r.base_unit_cd());
						r.trd_unit_qty(r.base_unit_qty());
					}
				}
			}

			return msgL;
		}

		/**
		 * 移動実績サービスチェック処理
		 */
		protected void callXfrActChk01(MCList<Chk01_RsltR> list) {
			MSBEL_XfrActService.XfrAct_Chk01 o = MSBEL_XfrActService.crtXfrAct_Chk01();

			for (Chk01_RsltR r : list) {
				r.addDateColumn("act_dt", up1().xfr_act_dt());
				r.addDateColumn("ac_dt", up1().xfr_ac_dt());
				XfrActChk_HdrDtlR up = XfrActChk_HdrDtlR.create();
				copy(up, r, createMap_XfrActChk_HdrDtlR_Chk01_RsltR());
				up.immd_dlv_prnt_flg((up1().immd_dlv_prnt_flg()));
				o.up0().add(up);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 一括設定のエラーＦＬＧの設定
		 */
		protected void setCndErrFlg(MCList<Chk01_RsltR> list) {
			// 一括設定にエラーがある場合、全てエラーにする
			if (up1().getBooleanNE("err_flg")) {
				list.setBoolean(Chk01_RsltR.$err_flg, true);
			}
		}
	}

	protected void cmplBaseUnitQty(MCList<Chk01_RsltR> notErrL) {
		for (Chk01_RsltR r : notErrL) {
			//削除行は数量：0として扱う
			if (r.isStatusDelete()){
				r.base_unit_qty(MCNumber.ZERO);
			}
			else {
				r.base_unit_qty(
						convToBaseUnit(
							r.trd_unit_qty(), r.trd_unit_conv_base_qty() , r.trd_unit_conv_qty(),
							r.base_unit_dec_place(), r.base_unit_rnd_typ())
						);
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 移動指図を登録します。<br>
	 */
	public class Ins01 extends MSBEL_XfrListReg_MC_A.Ins01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			doCache();
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(r -> !r.err_flg());
			if (notErrL.size() != 0) {
				callXfrInstIns01(notErrL);
			}

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
			up0().setValue(Chk01_RsltR.$pr_sts_typ, MSC_PR_STS_TYP.INST.value());
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_XfrListReg.Chk01 ope = MSBEL_XfrListReg.crtChk01();
			ope.up0().setAll(up0());
			MCRow.copyall(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callXfrInstIns01(MCList<Chk01_RsltR> notErrL) {

			MSBEL_XfrInstService.XfrInst_Ins01 o = MSBEL_XfrInstService.crtXfrInst_Ins01();

			for (Chk01_RsltR r : notErrL) {
				XfrInst_HdrDtlR up0 = XfrInst_HdrDtlR.create();
				r.addDateColumn("xfr_inst_dt", up1().xfr_inst_dt());
				r.addStringColumn("usr_cd", up1().inst_usr_cd());
				r.addStringColumn("dpt_cd", up1().inst_dpt_cd());
				r.addBooleanColumn("immd_pick_prnt_flg", up1().immd_pick_prnt_flg());
				r.addBooleanColumn("immd_inst_prnt_flg", up1().immd_inst_prnt_flg());
				r.addBooleanColumn("immd_dlv_prnt_flg", up1().immd_dlv_prnt_flg());

				copy(up0, r, createMap_XfrInst_HdrDtlR_Chk01_RsltR());
				o.up0().add(up0);
			}

			o.up1().setBoolean(XfrInst_AggCndR.$agg_gi_loc_flg, up1().agg_gi_loc_flg());;
			o.up1().setBoolean(XfrInst_AggCndR.$bndl_prnt_flg, !up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			o.up1().setBoolean(XfrInst_AggCndR.$bndl_inst_prnt_flg, !up1().indiv_inst_prnt_flg());

			if (!o.up0().isEmpty()) {
				o.exec();
				copyByPegNo(notErrL, new String[] {Chk01_RsltR.$xfr_inst_no, Chk01_RsltR.$xfr_inst_d_no},
						o.down0(), new String[] {XfrInst_HdrDtlR.$dtl_xfr_inst_no, XfrInst_HdrDtlR.$xfr_inst_d_no});
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0().subList(Chk01_RsltR.$inst_bndl_flg, false));
		}

		// 分割実行関連処理。以下のメソッドを実装することで、Frameworkが自動で上り電文を分割して、オペレーションをexecしてくれる
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			initXfrAllocStsCache(up0());
			cmplUp(up0());
			initCond();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				Chk01_CndR up1R = (Chk01_CndR)ope.up(1);
				MCRow.copyvalue(up1R, up1());
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void initCond() {
			allocCond  = new String[] {
					Chk01_RsltR.$itm_cd
					, Chk01_RsltR.$itm_sub1
					, Chk01_RsltR.$itm_sub2
					, Chk01_RsltR.$itm_sub3
					, Chk01_RsltR.$lg_grp_cd
			};

			if(up1().agg_gi_loc_flg()) {
				headerCond = new String[] {Chk01_RsltR.$trd_cd
						, Chk01_RsltR.$xfr_schd_dt
						, Chk01_RsltR.$gr_loc_cd
						, Chk01_RsltR.$gi_loc_cd
						, Chk01_RsltR.$slo_no};
			}
			else {
				headerCond = new String[] {Chk01_RsltR.$trd_cd
						, Chk01_RsltR.$xfr_schd_dt
						, Chk01_RsltR.$gr_loc_cd
						, Chk01_RsltR.$slo_no};
			}
			headerComp = new MCRowComparator.ASC<>(headerCond);
			allocComp = new MCRowComparator.ASC<>(allocCond);
		}
	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 移動実績を登録します。<br>
	 */
	public class Ins02 extends MSBEL_XfrListReg_MC_A.Ins02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			doCache();
			callThisChk02();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callXfrActIns01(notErrL);
			}

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_XfrListReg.Chk02 ope = MSBEL_XfrListReg.crtChk02();
			ope.up0().setAll(up0());
			MCRow.copyall(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callXfrActIns01(MCList<Chk01_RsltR> notErrL) {

			MSBEL_XfrActService.XfrAct_Ins01 o = MSBEL_XfrActService.crtXfrAct_Ins01();

			for (Chk01_RsltR r : notErrL) {
				XfrAct_HdrDtlR up0 = XfrAct_HdrDtlR.create();
				r.addDateColumn("act_dt", up1().xfr_act_dt());
				r.addDateColumn("ac_dt", up1().xfr_ac_dt());
				r.addStringColumn("usr_cd", up1().act_usr_cd());
				r.addStringColumn("dpt_cd", up1().act_dpt_cd());
				r.addBooleanColumn("immd_dlv_prnt_flg", up1().immd_dlv_prnt_flg());

				copy(up0, r, createMap_XfrAct_HdrDtlR_Chk01_RsltR());
				o.up0().add(up0);
			}

			o.up1().setBoolean(XfrAct_AggCndR.$agg_gi_loc_flg, up1().agg_gi_loc_flg());;
			o.up1().setBoolean(XfrAct_AggCndR.$bndl_prnt_flg, !up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行

			if (!o.up0().isEmpty()) {
				o.exec();
				copyByPegNo(notErrL, new String[] {Chk01_RsltR.$xfr_act_no, Chk01_RsltR.$xfr_act_d_no},
						o.down0(), new String[] {XfrAct_HdrDtlR.$xfr_act_no, XfrAct_HdrDtlR.$xfr_act_d_no});
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		// 分割実行関連処理。以下のメソッドを実装することで、Frameworkが自動で上り電文を分割して、オペレーションをexecしてくれる
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			initXfrAllocStsCache(up0());
			cmplUp(up0());
			initCond();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				Chk02_CndR up1R = (Chk02_CndR)ope.up(1);
				MCRow.copyvalue(up1R, up1());
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void initCond() {
			allocCond  = new String[] {
					Chk01_RsltR.$itm_cd
					, Chk01_RsltR.$itm_sub1
					, Chk01_RsltR.$itm_sub2
					, Chk01_RsltR.$itm_sub3
					, Chk01_RsltR.$lg_grp_cd
			};

			if(up1().agg_gi_loc_flg()) {
				headerCond = new String[] {Chk01_RsltR.$xfr_inst_no
						, Chk01_RsltR.$trd_cd
						, Chk01_RsltR.$xfr_schd_dt
						, Chk01_RsltR.$gr_loc_cd
						, Chk01_RsltR.$gi_loc_cd
						, Chk01_RsltR.$slo_no};
			}
			else {
				headerCond = new String[] {Chk01_RsltR.$xfr_inst_no
						, Chk01_RsltR.$trd_cd
						, Chk01_RsltR.$xfr_schd_dt
						, Chk01_RsltR.$gr_loc_cd
						, Chk01_RsltR.$slo_no};
			}
			headerComp = new MCRowComparator.ASC<>(headerCond);
			allocComp = new MCRowComparator.ASC<>(allocCond);
		}
	}

	/**
	 * 「ヘッダ条件が同じ」または「品目と出庫場所が同じ」となる
	 * 上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
		List<AggGroup> aggL = new ArrayList<>();

		for (Chk01_RsltR row : list) {
			addAggGroup(aggL, row);
		}

		MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
		for (AggGroup agg : aggL) {
			MCList<Chk01_RsltR> grp =agg._groupL;
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_RsltR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	protected class AggGroup {
		protected MCList<Chk01_RsltR> _headerL = MCList.create(Chk01_RsltR.class);
		protected MCList<Chk01_RsltR> _allocL = MCList.create(Chk01_RsltR.class);
		protected MCList<Chk01_RsltR> _groupL = MCList.create(Chk01_RsltR.class);

		protected boolean headerLContains(Chk01_RsltR r) {
			for (Chk01_RsltR condR : _headerL) {
				if (headerComp.compare(condR, r) == 0) {
					return true;
				}
			}
			return false;
		}

		protected boolean allocLContains(Chk01_RsltR r) {
			for (Chk01_RsltR condR : _allocL) {
				if (allocComp.compare(condR, r) == 0) {
					return true;
				}
			}
			return false;
		}

		protected void addAllocL(Chk01_RsltR r) {
			if(!allocLContains(r)) {
				_allocL.add(r);
			}
		}

		protected void addHeaderL(Chk01_RsltR r) {
			if(!headerLContains(r)) {
				_headerL.add(r);
			}
		}
	}

	protected void addAggGroup(List<AggGroup> aggL, Chk01_RsltR row) {
		if(!aggL.isEmpty()) {
			for (AggGroup agg : aggL) {
				if (agg.headerLContains(row)) {
					agg._groupL.add(row);
					agg.addAllocL(row);
					return;
				}
				else if(agg.allocLContains(row)) {
					agg._groupL.add(row);
					agg.addHeaderL(row);
					return;
				}
			}
		}
		AggGroup newAgg = new AggGroup();
		newAgg._groupL.add(row);
		newAgg._allocL.add(row);
		newAgg._headerL.add(row);
		aggL.add(newAgg);
	}

	protected void cmplUp(MCList<Chk01_RsltR> l) {
		for (Chk01_RsltR r : l) {
			MST_XFR_ALLOC_STS_R xasR = getXfrAllocStsR(r.xfr_alloc_sts_no());
			r.trd_cd(xasR.trd_cd());
			r.gr_loc_cd(xasR.gr_loc_cd());
			r.gi_loc_cd(xasR.gi_loc_cd());
			r.addStringColumn("gi_sppl_cd", xasR.getString("gi_sppl_cd"));
			r.slo_no(xasR.getString("slo_no"));
			r.itm_cd(xasR.getString("itm_cd"));
			r.itm_sub1(xasR.getString("itm_sub1"));
			r.itm_sub2(xasR.getString("itm_sub2"));
			r.itm_sub3(xasR.getString("itm_sub3"));
			r.lg_grp_cd(xasR.lg_grp_cd());
		}
	}

	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();
		for (Chk01_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
		dbTran().rollback();

		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);

		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk01_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	/**
	 * Chk07オペレーション.<p>
	 *
	 * 指図取消前のチェックをします。<br>
	 */
	public class Chk07 extends MSBEL_XfrListReg_MC_A.Chk07 {

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			callXfrInstChk03(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			msgL.addAll(chkAndLockXfrInst(notErrL));
			lockXfrSchd(notErrL);
			msgL.addAll(chkAndLockXfrAlloc(notErrL));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			//DACチェック
			MCIndexKey idx = _xfrInstL.createIndex(MST_XFR_INST_R.$xfr_inst_no);
			MCIndexKey idxD = _xfrInstDL.createIndex(MST_XFR_INST_D_R.$xfr_inst_no);
			
			// 指図明細に紐づく移動移送予定を取得
			MCList<MST_XFR_ALLOC_STS_R> xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(t);
			xfrAllocL_bldr.setSelect(t.xfr_inst_d_no);
			xfrAllocL_bldr.addSelect(t.gi_loc_cd);
			xfrAllocL.groupBy(MST_XFR_ALLOC_STS_R.$xfr_inst_d_no,
					MST_XFR_ALLOC_STS_R.$gi_loc_cd);
			xfrAllocL_bldr.setWhere(t.xfr_inst_d_no.eq(bind("xfr_inst_d_no")));
			dbSelect("MSBEL1050_MST_XFR_ALLOC_STS_S03", xfrAllocL, xfrAllocL_bldr, _xfrInstDL);
			MCIndexKey idxAlloc = xfrAllocL
					.createIndex(MST_XFR_ALLOC_STS_R.$xfr_inst_d_no);
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			for (Chk01_RsltR r : notErrL) {
				MST_XFR_INST_R xfrR = _xfrInstL.getFirst(idx, r.xfr_inst_no());
				r.lg_grp_cd(xfrR.lg_grp_cd());
				MST_XFR_INST_D_R xfrDR = _xfrInstDL.getFirst(idxD, xfrR.xfr_inst_no());
				MST_XFR_ALLOC_STS_R xfrAllocR = xfrAllocL.getFirst(idxAlloc, xfrDR.xfr_inst_d_no());
				r.itm_cd(xfrDR.itm_cd());
				r.itm_sub1(xfrDR.itm_sub1());
				r.itm_sub2(xfrDR.itm_sub2());
				r.itm_sub3(xfrDR.itm_sub3());
				r.gi_loc_cd(xfrAllocR.gi_loc_cd());
			}
			
			notErrL.addStringColumn("chk_gi_loc_cd");
			itmLgGrpLocCache(notErrL);
			locCache(notErrL);
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}

				MCMessageList msgDacGiL = new MCMessageList();
				MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lg_grp_cd());
				MAM_LOC_R locR = getLocCache(r.lg_grp_cd());

				for (MST_XFR_INST_D_R xfrDR : _xfrInstDL.subList(idxD, r.xfr_inst_no())) {
					for (MST_XFR_ALLOC_STS_R xfrAllocR : xfrAllocL.subList(idxAlloc, xfrDR.xfr_inst_d_no())) {
						if (!isNull(xfrAllocR.gi_loc_cd())) {
							r.setStringNE("chk_gi_loc_cd", xfrAllocR.gi_loc_cd());
						}
						else {
							r.setStringNE("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
						}
						msgDacGiL.addAll(checkWritableLocCdDac(r, "chk_gi_loc_cd"));
					}
				}
				
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}

			return msgL;
		}

		protected MCList<MST_XFR_ALLOC_STS_R> selectXfrAlloc(MCList<MST_XFR_INST_D_R> xfrInstDL) {
			MCList<MST_XFR_ALLOC_STS_R> xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(t);
			xfrAllocL_bldr.setSelect(t.gi_loc_cd);
			xfrAllocL_bldr.setWhere(t.xfr_inst_d_no.eq(bind("xfr_inst_d_no")));
			dbSelect("MSBEL1050_MST_XFR_ALLOC_STS_S04", xfrAllocL, xfrAllocL_bldr, xfrInstDL);
			return xfrAllocL;
		}
		/**
		 * 移動指図サービスチェック処理
		 */
		protected void callXfrInstChk03(MCList<Chk01_RsltR> list) {
			MSBEL_XfrInstService.XfrInst_Chk03 o = MSBEL_XfrInstService.crtXfrInst_Chk03();

			for (Chk01_RsltR r : list) {
				XfrInstChk_HdrDtlR up = XfrInstChk_HdrDtlR.create();
				copy(up, r, createMap_XfrInstChk_HdrDtlR_Chk01_RsltR());
				o.up0().add(up);
			}

			if (!o.up0().isEmpty()) {
				setWmsFlg(o.up0());
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		protected void setWmsFlg(MCList<XfrInstChk_HdrDtlR> up) {
			MCList<MST_XFR_ALLOC_STS_R> dbc = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t0 = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t0);
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t0.gi_loc_cd, t0.lg_grp_cd, t1.xfr_inst_no);
			dbc_bldr.addInnerJoin(t1, bracket(t1.xfr_inst_d_no.eq(t0.xfr_inst_d_no)));
			dbc_bldr.setWhere(t1.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL1050_MST_XFR_ALLOC_STS_S05", dbc, dbc_bldr, up);

			// WMSフラグの取得・設定
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, MST_XFR_ALLOC_STS_R> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (MST_XFR_ALLOC_STS_R dbcR : dbc) {
				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value());
				r.loc_cd(dbcR.gi_loc_cd());
				r.lg_grp_cd(dbcR.lg_grp_cd());
				r.master_dt(getToday());
				map.put(peg, dbcR);
				peg = peg.add(1);
			}
			o.exec();

			for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
				if (map.containsKey(r.peg_no())) {
					map.get(r.peg_no()).wms_flg(!isNull(r.ext_sys_cd()));
				}
			}

			MCIndexKey idx = dbc.createIndex(MST_XFR_INST_D_R.$xfr_inst_no, MST_XFR_ALLOC_STS_R.$wms_flg);
			for (XfrInstChk_HdrDtlR r : up) {
				MST_XFR_ALLOC_STS_R dbcR = dbc.getFirst(idx, r.xfr_inst_no(), true);
				if (!isNull(dbcR)) {
					r.wms_flg(true);
				}
			}
		}
	}
	/**
	 * Chk08オペレーション.<p>
	 *
	 * 実績取消前のチェックをします。<br>
	 */
	public class Chk08 extends MSBEL_XfrListReg_MC_A.Chk08 {

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			callXfrActChk02(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			msgL.addAll(chkAndLockXfrAct(notErrL));
			lockXfrAlloc(notErrL);

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			//DACチェック

			for (MST_XFR_ACT_R r : _xfrActL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, MST_XFR_ACT_R.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}
				
				MCMessageList msgDacGiL = new MCMessageList();
				for (MST_XFR_ACT_D_R dR : _xfrActDL.subList(MST_XFR_ACT_D_R.$xfr_act_no, r.xfr_act_no())) {
					msgDacGiL.addAll(checkWritableLocCdDac(dR, MST_XFR_ACT_D_R.$gi_loc_cd));
				}

				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}
			msgL.addAll(checkAbortFlg());

			return msgL;
		}

		/**
		 * 移動実績サービスチェック処理
		 */
		protected void callXfrActChk02(MCList<Chk01_RsltR> list) {
			MSBEL_XfrActService.XfrAct_Chk02 o = MSBEL_XfrActService.crtXfrAct_Chk02();

			for (Chk01_RsltR r : list) {
				XfrActChk_HdrDtlR up = XfrActChk_HdrDtlR.create();
				copy(up, r, createMap_XfrActChk_HdrDtlR_Chk01_RsltR());
				o.up0().add(up);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		/**
		 * 削除行について、打切ＦＬＧがオンかどうかをチェックします。
		 * @param dtlL
		 * @return
		 */
		protected MCMessageList checkAbortFlg() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrList_Dtl = getChkList(up0());

			// 打切済みチェック
			for (Chk01_RsltR r : notErrList_Dtl) {
				MST_XFR_ALLOC_STS_R selectR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_act_no());
				if (!isNull(selectR) && selectR.abort_flg()) {
					msgL.add(new MCMessage(r, null, MSBEL0030, toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 移動指図を取り消します。<br>
	 */
	public class Del01 extends MSBEL_XfrListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			doCache();

			callThisChk07();
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// オペレーション実行
				callXfrInstDel01(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			for (Chk01_RsltR r : up0()) {
				r.setStatus(MCRow.Status.DELETE);
			}
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk07() {
			MSBEL_XfrListReg.Chk07 ope = MSBEL_XfrListReg.crtChk07();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 移動指図登録サービスの取消処理を実行する
		 */
		protected void callXfrInstDel01(MCList<Chk01_RsltR> notErrL) {

			MSBEL_XfrInstService.XfrInst_Del01 o = MSBEL_XfrInstService.crtXfrInst_Del01();

			for (Chk01_RsltR r : notErrL) {
				XfrInst_HdrDtlR up0 = XfrInst_HdrDtlR.create();
				r.addBooleanColumn("immd_pick_prnt_flg");
				r.addBooleanColumn("immd_inst_prnt_flg");
				r.addBooleanColumn("immd_dlv_prnt_flg", up1().immd_dlv_prnt_flg());
				copy(up0, r, createMap_XfrInst_HdrDtlR_Chk01_RsltR());
				o.up0().add(up0);
			}
			o.up1().setBoolean(XfrAct_AggCndR.$bndl_prnt_flg, !up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 移動実績を取り消します。<br>
	 */
	public class Del02 extends MSBEL_XfrListReg_MC_A.Del02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			doCache();
			callThisChk08();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// オペレーション実行
				callXfrActDel01(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			for (Chk01_RsltR r : up0()) {
				r.setStatus(MCRow.Status.DELETE);
			}
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk08() {
			MSBEL_XfrListReg.Chk08 ope = MSBEL_XfrListReg.crtChk08();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 移動実績登録サービスの取消処理を実行する
		 */
		protected void callXfrActDel01(MCList<Chk01_RsltR> notErrL) {

			MSBEL_XfrActService.XfrAct_Del01 o = MSBEL_XfrActService.crtXfrAct_Del01();

			for (Chk01_RsltR r : notErrL) {
				XfrAct_HdrDtlR up0 = XfrAct_HdrDtlR.create();
				r.addBooleanColumn("immd_dlv_prnt_flg", up1().immd_dlv_prnt_flg());
				copy(up0, r, createMap_XfrAct_HdrDtlR_Chk01_RsltR());
				o.up0().add(up0);
			}
			o.up1().setBoolean(XfrAct_AggCndR.$bndl_prnt_flg, !up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Chk09オペレーション.<p>
	 *
	 * 予定訂正前のチェックをします。<br>
	 */
	public class Chk09 extends MSBEL_XfrListReg_MC_A.Chk09 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			callXfrSchdChk02(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			lockXfrSchd(notErrL);
			msgL.addAll(chkAndLockXfrAlloc(notErrL));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR r : notErrL) {
				// ※コンテナを共有しているため、チェックロジックで定義できないのでチェック処理を実装
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_PositiveValidater()));
			}

			//DACチェック
			
			notErrL.addStringColumn("chk_gi_loc_cd");
			itmLgGrpLocCache(notErrL);
			locCache(notErrL);
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}

				if (!isNull(r.getStringNE("gi_loc_cd"))) {
					r.setStringNE("chk_gi_loc_cd", r.getStringNE("gi_loc_cd"));
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lg_grp_cd());
					MAM_LOC_R locR = getLocCache(r.lg_grp_cd());
			
					r.setStringNE("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
				}

				MCMessageList msgDacGiL = checkWritableLocCdDac(r, "chk_gi_loc_cd");
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}



			//基準単位数量の補完
			cmplBaseUnitQty(notErrL);

			//更新前後の基準単位数量が一致しているか
			msgL.addAll(chkSameQty(notErrL));
			//IF送信対象に対して送信後訂正不可チェック
			msgL.addAll(chkSendIf(notErrL));

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {

			//データの補完
			for (Chk01_RsltR r : up0()) {

				MST_XFR_SCHD_R xsdR = _xfrSchdL.getFirst(_xfrSchdIdx, r.xfr_schd_no());
				MST_XFR_ALLOC_STS_R xasR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());

				if(xasR == null) {
					continue;
				}
				if(xsdR == null)	{
					xsdR = MST_XFR_SCHD_R.create();
				}

				r.trd_cd(xasR.trd_cd());
				r.trd_ptn_typ(xasR.trd_ptn_typ());
				r.wg_cd(xasR.wg_cd());
				r.lg_grp_cd(xasR.lg_grp_cd());
				r.gr_loc_cd(xasR.gr_loc_cd());
				r.gr_stk_arrv_bp_cd(xasR.gr_stk_arrv_bp_cd());

				r.pr_sts_typ(xasR.pr_sts_typ());
				r.gi_loc_cd(xasR.gi_loc_cd());
				r.gi_str_ln_cd(xasR.gi_str_ln_cd());
				r.gi_stk_arrv_bp_cd(xasR.gi_stk_arrv_bp_cd());
				r.gr_str_ln_cd(xasR.gr_str_ln_cd());
				r.itm_cd(nvl(xsdR.itm_cd(), xasR.getString("itm_cd")));
				r.itm_sub1(nvl(xsdR.itm_sub1(), xasR.getString("itm_sub1")));
				r.itm_sub2(nvl(xsdR.itm_sub2(), xasR.getString("itm_sub2")));
				r.itm_sub3(nvl(xsdR.itm_sub3(), xasR.getString("itm_sub3")));
				r.lot_no(xasR.lot_no());
				r.sublot_no(xasR.sublot_no());
				r.sno1(xasR.sno1());
				r.sno2(xasR.sno2());
				r.sno3(xasR.sno3());
				r.sno4(xasR.sno4());
				r.sno1_null_flg(xasR.sno1_null_flg());
				r.sno2_null_flg(xasR.sno2_null_flg());
				r.sno3_null_flg(xasR.sno3_null_flg());
				r.sno4_null_flg(xasR.sno4_null_flg());
				r.alloc_sno1(xasR.alloc_sno1());
				r.alloc_sno2(xasR.alloc_sno2());
				r.alloc_sno3(xasR.alloc_sno3());
				r.alloc_sno4(xasR.alloc_sno4());
				r.ver_no(xasR.ver_no());
				r.gd_cd(xasR.gd_cd());
				r.quality_typ(xasR.quality_typ());
				r.stk_id_typ(xasR.stk_id_typ());
				r.stk_bp_cd(xasR.stk_bp_cd());
				r.ship_inst_typ(xasR.ship_inst_typ());
				r.rsn_cd(xasR.rsn_cd());
				r.bd_dpt_cd(xasR.bd_dpt_cd());
				r.alloc_flg(xasR.alloc_flg());
				r.not_lot_mix_flg(xasR.not_lot_mix_flg());
				r.not_sublot_mix_flg(xasR.not_sublot_mix_flg());
				r.vld_dt_fr(xasR.vld_dt_fr());
				r.vld_dt_to(xasR.vld_dt_to());
				r.io_schd_pr_no(xasR.io_schd_pr_no());
				//分割前移動引当状況ＮＯには自身の移動引当状況ＮＯを設定する
				r.old_xfr_alloc_sts_no(r.xfr_alloc_sts_no());
				r.xfr_inst_d_no(xasR.xfr_inst_d_no());
				r.xfr_inst_no(xasR.getString("xfr_inst_no"));
			}
			setWmsFlg();
		}

		/**
		 * 移動移送予定サービスチェック処理
		 */
		protected void callXfrSchdChk02(MCList<Chk01_RsltR> list) {
			MSBEL_XfrSchdService.XfrSchd_Chk02 o = MSBEL_XfrSchdService.crtXfrSchd_Chk02();

			for (Chk01_RsltR r : list) {
				if (r.isStatusCreate()) {
					r.xfr_alloc_sts_no(null);
				}
				XfrSchdChk02_DtlR up = XfrSchdChk02_DtlR.create();
				copy(up, r, createMap_XfrSchdChk02_DtlR_Chk01_RsltR());
				o.up0().add(up);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}
		/**
		 * WMS対象フラグを取得・設定する
		 */
		protected void setWmsFlg() {
			Map<Chk01_RsltR, Srch01_RsltR> map = new HashMap<>();
			MCList<Srch01_RsltR> lst = MCList.create(Srch01_RsltR.class);
			for (Chk01_RsltR up0R : up0()) {
				if(isNullOrNullVal(up0R.xfr_inst_d_no())) {
					continue;
				}
				Srch01_RsltR r = lst.add();
				r.gi_loc_cd(up0R.gi_loc_cd());
				r.lg_grp_cd(up0R.lg_grp_cd());
				map.put(up0R, r);
			}
			setWmsflg(lst, MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value(), false);

			map.entrySet().forEach(e -> {
				e.getKey().wms_flg(e.getValue().wms_flg());
			});
		}

		/**
		 * 送信後訂正不可チェック
		 */
		protected MCMessageList chkSendIf(MCList<Chk01_RsltR> list) {
			MCMessageList msgL = new MCMessageList();
	
			// 指図内にWMSフラグがオンの明細があればチェックの対象とする
			MCList<Chk01_RsltR> chkL = MCList.create(Chk01_RsltR.class);
			for (Chk01_RsltR r : list) {
				MST_XFR_ALLOC_STS_R xasR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
				if (!xasR.act_qty().isPositive() && r.wms_flg()) {
					chkL.add(r);
				}
			}
			if (chkL.isEmpty()) {
				return msgL;
			}

			MCList<MST_XFR_INST_SEND_IF_R> sendOkL = MCList.create(MST_XFR_INST_SEND_IF_R.class);
			MST_XFR_INST_SEND_IF_R t0 = MST_XFR_INST_SEND_IF_R.create("T");
			MCQueryApiBuilder sendOkL_bldr = MCQueryApiBuilder.create(t0);
			PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T1");
			sendOkL_bldr.setSelect(t0.xfr_inst_no);
			sendOkL_bldr.setDistinct();
			sendOkL_bldr.addInnerJoin(t1, bracket(t1.data_no.eq(t0.data_no)));

			sendOkL_bldr.setWhere(t0.xfr_inst_no.eq(bind("xfr_inst_no")));
			sendOkL_bldr.addConstWhereWithAnd(t1.not_send_upd_flg.eq(value(true))
					.and(t1.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.SEND_OK.value()))));
			dbSelect("MSBEL1050_MST_XFR_INST_SEND_IF_S01",
					sendOkL, sendOkL_bldr, chkL.groupBy(Chk01_RsltR.$xfr_inst_no), null);
			
			MCIndexKey sendOkIdx = sendOkL.createIndex(MST_XFR_INST_SEND_IF_R.$xfr_inst_no);
			for (Chk01_RsltR r : list) {
				MST_XFR_INST_SEND_IF_R sendOkR = sendOkL.getFirst(sendOkIdx, r.xfr_inst_no());
				if (!isNull(sendOkR)) {
					msgL.add(new MCMessage(r, null, MSBEL1047, r.xfr_inst_no()));
				}
			}

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	protected MCMessageList chkSameQty(MCList<Chk01_RsltR> notErrL) {
		MCMessageList msgL = new MCMessageList();
		MCGroupByPolicy policy = new MCGroupByPolicy(Chk01_RsltR.$xfr_schd_no);
		policy.sum(Chk01_RsltR.$base_unit_qty);

		//更新前
		MCList<MST_XFR_ALLOC_STS_R> oldSumL = _xfrAllocL.groupBy(policy);
		MCIndexKey oldIdx = oldSumL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_schd_no);

		//更新後
		MCList<Chk01_RsltR> newSumL = notErrL.groupBy(policy);
		MCIndexKey newIdx = newSumL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_schd_no);

		for (Chk01_RsltR r : notErrL) {
			MST_XFR_ALLOC_STS_R oldSumR = oldSumL.getFirst(oldIdx, r.xfr_schd_no());
			Chk01_RsltR newSumR = newSumL.getFirst(newIdx, r.xfr_schd_no());

			if (!isSame(oldSumR.base_unit_qty(), newSumR.base_unit_qty())) {
				msgL.add(new MCMessage(r, Chk01_RsltR.$xfr_schd_no, MSBEL0200,
						r.xfr_schd_no(), toDispGUIIndex(r)));
			}
		}

		return msgL;
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 予定を訂正します。<br>
	 */
	public class Upd01 extends MSBEL_XfrListReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			doCache();
			callThisChk09();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callXfrSchdUpd02(notErrL);
				callXfrInstSendIf(notErrL);
			}

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()){
				if (r.isStatusCreate()) {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusDelete()) {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
			initXfrAllocStsCache(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk09() {
			MSBEL_XfrListReg.Chk09 ope = MSBEL_XfrListReg.crtChk09();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callXfrSchdUpd02(MCList<Chk01_RsltR> notErrL) {

			MSBEL_XfrSchdService.XfrSchd_Upd02 o = MSBEL_XfrSchdService.crtXfrSchd_Upd02();

			for (Chk01_RsltR r : notErrL) {
				XfrPr_DtlR up0 = XfrPr_DtlR.create();
				copy(up0, r, createMap_XfrPr_DtlR_Chk01_RsltR());
				o.up0().add(up0);
				MST_XFR_ALLOC_STS_R xR = getXfrAllocStsR(r.xfr_alloc_sts_no());
				o.up0().getFirst(XfrPr_DtlR.$peg_no, r.peg_no()).setString(XfrPr_DtlR.$trd_d_rmrks, xR.trd_d_rmrks());
			}

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		// 分割実行関連処理。以下のメソッドを実装することで、Frameworkが自動で上り電文を分割して、オペレーションをexecしてくれる
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 移動・移送予定ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$xfr_schd_no);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
		protected void callXfrInstSendIf(MCList<Chk01_RsltR> notErrL) {
			MCList<MST_XFR_ALLOC_STS_R> list = MCList.create(MST_XFR_ALLOC_STS_R.class);
			for(Chk01_RsltR row :notErrL) {
				MST_XFR_ALLOC_STS_R xfrAllocR = getXfrAllocStsR(row.xfr_alloc_sts_no());
				if(isNullOrNullVal(row.xfr_inst_d_no())
					|| !row.wms_flg()
					|| row.abort_flg() && xfrAllocR.abort_flg()) {
					continue ;
				}
				MST_XFR_ALLOC_STS_R upR = list.add();
				upR.xfr_alloc_sts_no(row.xfr_alloc_sts_no());
				upR.wms_flg(row.wms_flg());
				upR.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
			}
			callXfrInstSendIfUpd01(list);
		}
		protected void callXfrInstSendIfUpd01(MCList<MST_XFR_ALLOC_STS_R> list) {
			//xfr_inst_noが設定された後に呼ばれることが前提
			//hdr_data_crud_typ -> data_crud_typの変換が行われていることが前提
			//XfrInstSendIf_Upd01の上り電文はList型

			MSLAL_XfrInstSendIfService.XfrInstSendIf_Upd01 o = MSLAL_XfrInstSendIfService.crtXfrInstSendIf_Upd01();
			list.forEach(row -> {
				if(row.wms_flg()) {
					copy(o.up0().add(), row, createMap_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R());
				}
			});
			if(!o.up0().isEmpty()) {
				o.exec();
			}
		}

		protected Map_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R<XfrInstSendIf_Upd01_DtlR,MST_XFR_ALLOC_STS_R> createMap_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R() {
			return new Map_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R<XfrInstSendIf_Upd01_DtlR, MST_XFR_ALLOC_STS_R>();
		}

		public class Map_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R<D extends XfrInstSendIf_Upd01_DtlR, S extends MST_XFR_ALLOC_STS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrInstSendIf_Upd01_DtlR.$xfr_alloc_sts_no, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(src.getStringNE("data_crud_typ"));
			}
		}	
	}

	/**
	 * Chk05オペレーション.<p>
	 *
	 * 引当前のチェックをします。<br>
	 */
	public class Chk05 extends MSBEL_XfrListReg_MC_A.Chk05 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			callXfrSchdChk02(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			lockXfrSchd(notErrL);
			msgL.addAll(chkAndLockXfrAlloc(notErrL));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			//DACチェック
			
			notErrL.addStringColumn("chk_gi_loc_cd");
			itmLgGrpLocCache(notErrL);
			locCache(notErrL);
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}

				if (!isNull(r.getStringNE("gi_loc_cd"))) {
					r.setStringNE("chk_gi_loc_cd", r.getStringNE("gi_loc_cd"));
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lg_grp_cd());
					MAM_LOC_R locR = getLocCache(r.lg_grp_cd());
			
					r.setStringNE("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
				}		

				MCMessageList msgDacGiL = checkWritableLocCdDac(r, "chk_gi_loc_cd");
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}

			for (Chk01_RsltR r : notErrL) {

				// ※コンテナを共有しているため、チェックロジックで定義できないのでチェック処理を実装
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_PositiveValidater()));

				// 引当済チェック
				if (r.alloc_flg() && !isNullOr(r.lot_no(), r.sublot_no())) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$xfr_alloc_sts_no, MSBEL0195,
						r.xfr_alloc_sts_no(), toDispGUIIndex(r)));
				}
				// 打切済チェック
				if (r.abort_flg()) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$xfr_alloc_sts_no, MSBEL0275,
						r.xfr_alloc_sts_no(), toDispGUIIndex(r)));
				}
			}

			//基準単位数量の補完
			cmplBaseUnitQty(notErrL);

			//更新前後の基準単位数量が一致しているか
			msgL.addAll(chkSameQty(notErrL));

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {

			//データの補完
			for (Chk01_RsltR r : up0()) {

				MST_XFR_SCHD_R xsdR = _xfrSchdL.getFirst(_xfrSchdIdx, r.xfr_schd_no());
				MST_XFR_ALLOC_STS_R xasR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());

				if(xsdR == null || xasR == null) {
					continue;
				}

				r.trd_cd(xasR.trd_cd());
				r.trd_ptn_typ(xasR.trd_ptn_typ());
				r.wg_cd(xasR.wg_cd());
				r.lg_grp_cd(xasR.lg_grp_cd());
				r.gr_loc_cd(xasR.gr_loc_cd());
				r.gr_stk_arrv_bp_cd(xasR.gr_stk_arrv_bp_cd());

				r.pr_sts_typ(xasR.pr_sts_typ());
				r.gi_loc_cd(xasR.gi_loc_cd());
				r.gi_str_ln_cd(xasR.gi_str_ln_cd());
				r.gi_stk_arrv_bp_cd(xasR.gi_stk_arrv_bp_cd());
				r.gr_str_ln_cd(xasR.gr_str_ln_cd());
				r.itm_cd(xsdR.itm_cd());
				r.itm_sub1(xsdR.itm_sub1());
				r.itm_sub2(xsdR.itm_sub2());
				r.itm_sub3(xsdR.itm_sub3());
				r.lot_no(xasR.lot_no());
				r.sublot_no(xasR.sublot_no());
				r.sno1(xasR.sno1());
				r.sno2(xasR.sno2());
				r.sno3(xasR.sno3());
				r.sno4(xasR.sno4());
				r.sno1_null_flg(xasR.sno1_null_flg());
				r.sno2_null_flg(xasR.sno2_null_flg());
				r.sno3_null_flg(xasR.sno3_null_flg());
				r.sno4_null_flg(xasR.sno4_null_flg());
				r.alloc_sno1(xasR.alloc_sno1());
				r.alloc_sno2(xasR.alloc_sno2());
				r.alloc_sno3(xasR.alloc_sno3());
				r.alloc_sno4(xasR.alloc_sno4());
				r.ver_no(xasR.ver_no());
				r.gd_cd(xasR.gd_cd());
				r.quality_typ(xasR.quality_typ());
				r.stk_id_typ(xasR.stk_id_typ());
				r.stk_bp_cd(xasR.stk_bp_cd());
				r.ship_inst_typ(xasR.ship_inst_typ());
				r.rsn_cd(xasR.rsn_cd());
				r.bd_dpt_cd(xasR.bd_dpt_cd());
				r.abort_flg(xasR.abort_flg());
				r.fix_flg(xasR.fix_flg());
				r.alloc_flg(xasR.alloc_flg());
				r.not_lot_mix_flg(xasR.not_lot_mix_flg());
				r.not_sublot_mix_flg(xasR.not_sublot_mix_flg());
				r.vld_dt_fr(xasR.vld_dt_fr());
				r.vld_dt_to(xasR.vld_dt_to());
				r.io_schd_pr_no(xasR.io_schd_pr_no());
				//分割前移動引当状況ＮＯには自身の移動引当状況ＮＯを設定する
				r.old_xfr_alloc_sts_no(r.xfr_alloc_sts_no());
			}
		}

		/**
		 * 移動移送予定サービスチェック処理
		 */
		protected void callXfrSchdChk02(MCList<Chk01_RsltR> list) {
			MSBEL_XfrSchdService.XfrSchd_Chk02 o = MSBEL_XfrSchdService.crtXfrSchd_Chk02();

			for (Chk01_RsltR r : list) {
				if (r.isStatusCreate()) {
					r.xfr_alloc_sts_no(null);
				}
				r.alloc_flg(true);
				XfrSchdChk02_DtlR up = XfrSchdChk02_DtlR.create();
				copy(up, r, createMap_XfrSchdChk02_DtlR_Chk01_RsltR());
				o.up0().add(up);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Alc01オペレーション.<p>
	 *
	 * 引当します。<br>
	 */
	public class Alc01 extends MSBEL_XfrListReg_MC_A.Alc01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			doCache();
			callThisChk05();

			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callAllocLockSrv(notErrL);
				callStkAllocSrv(notErrL);
				msgL.addAll(callXfrSchdUpd02(notErrL));
			}
			MCMessagePool.addAll(msgL);
			for (Chk01_RsltR r : notErrL) {
				if (r.err_flg()){
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()){
				if (r.isStatusCreate()) {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
			initXfrAllocStsCache(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MSBEL_XfrListReg.Chk05 ope = MSBEL_XfrListReg.crtChk05();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected MCMessageList callXfrSchdUpd02(MCList<Chk01_RsltR> notErrL) {

			MCMessageList msgL = new MCMessageList();
			MSBEL_XfrSchdService.XfrSchd_Upd02 o = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
			MCList<Srch_RsltR> allocL = MCList.create(Srch_RsltR.class);
			MCList<Srch_TgtR> unAllocL = MCList.create(Srch_TgtR.class);

			for (Chk01_RsltR r : notErrL) {
				XfrPr_DtlR up0 = XfrPr_DtlR.create();
				copy(up0, r, createMap_XfrPr_DtlR_Chk01_RsltR());

				MCNumber remain_qty = MCNumber.ZERO;
				allocL.init();
				unAllocL.init();
				if (!_allocResultL.isEmpty()) {
					allocL = _allocResultL.subList(Srch_RsltR.$peg_no, r.peg_no());
				}
				if (!_unAllocResultL.isEmpty()) {
					unAllocL = _unAllocResultL.subList(Srch_TgtR.$peg_no, r.peg_no());
				}

				if (allocL.isEmpty()) {
					msgL.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
					r.err_flg(true);
				}
				else {
					remain_qty = r.base_unit_qty();

					for (Srch_RsltR allocR : allocL) {

						// 残数
						remain_qty = remain_qty.subtract(allocR.base_unit_qty());

						// 引当できた分のレコード作成
						XfrPr_DtlR tmpR = up0.clone();
						tmpR.alloc_flg(true);
						tmpR.gi_loc_cd(allocR.stk_loc_cd());
						tmpR.gi_str_ln_cd(allocR.stk_str_ln_cd());
						tmpR.gd_cd(allocR.gd_cd());
						tmpR.quality_typ(allocR.quality_typ());
						tmpR.stk_id_typ(allocR.stk_id_typ());
						tmpR.stk_bp_cd(allocR.stk_bp_cd());

						tmpR.lot_no(allocR.lot_no());
						tmpR.sublot_no(allocR.sublot_no());
						tmpR.ver_no(allocR.ver_no());
						tmpR.alloc_sno1(allocR.sno1());
						tmpR.alloc_sno2(allocR.sno2());
						tmpR.alloc_sno3(allocR.sno3());
						tmpR.alloc_sno4(allocR.sno4());
						tmpR.base_unit_qty(allocR.base_unit_qty());

						if (r.pack_flg() && r.pack_alloc_flg()) {
							tmpR.trd_unit_qty(allocR.pack_unit_qty());
						}
						else{
							//基準単位から取引単位へ換算する
							tmpR.trd_unit_qty(rvrsBaseUnitConv(allocR.base_unit_qty(),
									r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
									r.trd_unit_dec_place(), r.trd_unit_rnd_typ(), true));

							//端数が出る場合は、取引単位を基準単位に置き換える
							if (isNull(tmpR.trd_unit_qty())) {
								tmpR.trd_unit_cd(tmpR.base_unit_cd());
								tmpR.trd_unit_qty(tmpR.base_unit_qty());
							}
						}

						//残数がある場合は、データ更新区分を「追加」にする
						if (remain_qty.isPositive()) {
							tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

							if (!isNull(tmpR.xfr_alloc_sts_no())) {
								tmpR.xfr_alloc_sts_no(null);
							}
						}
						tmpR.trd_d_rmrks(getXfrAllocStsR(r.xfr_alloc_sts_no()).trd_d_rmrks());
						o.up0().add(tmpR);

					}
					// 未引当リストがある場合は未引当レコードを作成する
					if (!unAllocL.isEmpty()) {
						Srch_TgtR unAllocR = unAllocL.getFirst(Srch_TgtR.$peg_no, r.peg_no());
						XfrPr_DtlR tmpR = up0.clone();

						tmpR.alloc_flg(false);
						tmpR.base_unit_qty(unAllocR.base_unit_qty());

						if (r.pack_flg() && r.pack_alloc_flg()) {
							tmpR.trd_unit_qty(unAllocR.pack_unit_qty());
						}
						else{
							//基準単位から取引単位へ換算する
							tmpR.trd_unit_qty(rvrsBaseUnitConv(unAllocR.base_unit_qty(),
									r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
									r.trd_unit_dec_place(), r.trd_unit_rnd_typ(), true));

							//端数が出る場合は、取引単位を基準単位に置き換える
							if (isNull(tmpR.trd_unit_qty())) {
								tmpR.trd_unit_cd(tmpR.base_unit_cd());
								tmpR.trd_unit_qty(tmpR.base_unit_qty());
							}
						}
						tmpR.trd_d_rmrks(getXfrAllocStsR(r.xfr_alloc_sts_no()).trd_d_rmrks());
						o.up0().add(tmpR);
					}
				}
			}

			if (!o.up0().isEmpty()) {
				o.exec();
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		// 分割実行関連処理。以下のメソッドを実装することで、Frameworkが自動で上り電文を分割して、オペレーションをexecしてくれる
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			initXfrAllocStsCache(up0());
			cmplUp(up0());
			initCond();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void initCond() {
			allocCond  = new String[] {
					Chk01_RsltR.$itm_cd
					, Chk01_RsltR.$itm_sub1
					, Chk01_RsltR.$itm_sub2
					, Chk01_RsltR.$itm_sub3
					, Chk01_RsltR.$lg_grp_cd
			};

			headerCond = new String[] {Chk01_RsltR.$xfr_schd_no};

			headerComp = new MCRowComparator.ASC<>(headerCond);
			allocComp = new MCRowComparator.ASC<>(allocCond);
		}
	}

	/**
	 * 引当対象の場所をロックする
	 */
	protected void callAllocLockSrv(MCList<Chk01_RsltR> notErrL) {

		MSBEL_AllocMngService.Alloc_Lock_Upd01 o = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
		for (Chk01_RsltR r : notErrL) {
			MSW_ALLOC_LOC_MAP_R lockR = o.up0().add();
			lockR.itm_cd(r.itm_cd());
			lockR.itm_sub1(r.itm_sub1());
			lockR.itm_sub2(r.itm_sub2());
			lockR.itm_sub3(r.itm_sub3());
			lockR.gi_lg_grp_cd(r.lg_grp_cd());
			lockR.gi_loc_cd(r.gi_loc_cd());
			lockR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * 引当処理を実行する
	 */
	protected void callStkAllocSrv(MCList<Chk01_RsltR> notErrL) {

		MSBEL_AllocMngService.Alloc_Srch01 o = MSBEL_AllocMngService.crtAlloc_Srch01();
		for (Chk01_RsltR r : notErrL) {
			Srch_TgtR alcR = Srch_TgtR.create();
			copy(alcR, r, createMap_Srch_TgtR_Chk01_RsltR());
			o.up1().add(alcR);

			if (!isNull(r.xfr_alloc_sts_no())) {
				Srch_Io_SchdR ioR = Srch_Io_SchdR.create();
				MST_XFR_ALLOC_STS_R xR = getXfrAllocStsR(r.xfr_alloc_sts_no());
				ioR.io_schd_typ(getIoSchdTypForMove(xR.trd_ptn_typ()));
				ioR.io_schd_no(r.xfr_alloc_sts_no());
				ioR.io_schd_sts_typ(getIoSchdStsTyp(xR.pr_sts_typ()));
				o.up3().add(ioR);
			}
		}

			// 投入予定と紐づく移動予定に対して再引当ができるよう、上り電文を編集する
			MCList<Srch_StkR> srchStkL = MCList.create(Srch_StkR.class);
			editAllocSrch01Up2(srchStkL, notErrL);
			o.up2().addAll(srchStkL);

		if (!o.up1().isEmpty()) {
			MCSortPolicy sp = new MCSortPolicy();
			// 出庫日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
			o.up1().sort(sp);

			o.up0().stk_flg(false);
			o.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			o.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			o.up0().nm_srch_flg(false);
			o.exec();
			MCGroupByPolicy policy = new MCGroupByPolicy(
					Srch_RsltR.$peg_no,
					Srch_RsltR.$itm_cd,
					Srch_RsltR.$itm_sub1,
					Srch_RsltR.$itm_sub2,
					Srch_RsltR.$itm_sub3,
					Srch_RsltR.$ver_no,
					Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_str_ln_cd,
					Srch_RsltR.$stk_sppl_cd,
					Srch_RsltR.$stk_lg_grp_cd,
					Srch_RsltR.$asst_typ,
					Srch_RsltR.$in_xfr_typ,
					Srch_RsltR.$quality_typ,
					Srch_RsltR.$stk_insp_typ,
					Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd,
					Srch_RsltR.$gd_cd,
					Srch_RsltR.$lot_no,
					Srch_RsltR.$sublot_no,
					Srch_RsltR.$sno1,
					Srch_RsltR.$sno2,
					Srch_RsltR.$sno3,
					Srch_RsltR.$sno4,
					Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$vld_dt_fr,
					Srch_RsltR.$vld_dt_to,
					Srch_RsltR.$pack_unit_cd
					);
			policy.sum(
					Srch_RsltR.$base_unit_qty,
					Srch_RsltR.$pack_unit_qty);

			//引当結果リストはグループ化して一時変数に格納
			//未引当結果リストはそのまま一時変数に格納
			_allocResultL.addAll(o.down0().groupBy(policy));
			_unAllocResultL.addAll(o.down2());
		}
	}

	/**
	 * 投入予定と紐づく移動予定に対して再引当ができるよう、上り電文を編集する
	 * @param allocL
	 */
	protected void editAllocSrch01Up2(MCList<Srch_StkR> srchStkL, MCList<?> allocL) {

		MST_XFR_SCHD_R t1 = MST_XFR_SCHD_R.create("T1");
		MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
		MST_INPT_SCHD_R t3 = MST_INPT_SCHD_R.create("T3");
		MST_INPT_ALLOC_STS_R t4 = MST_INPT_ALLOC_STS_R.create("T4");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t1);
		
		xfrSchdL_bldr.setSelect(
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t3.inpt_loc_cd.as(Srch_StkR.$loc_cd),
				t3.inpt_str_ln_cd.as(Srch_StkR.$str_ln_cd),
				t4.stk_arrv_bp_cd,
				nvl(t3.lot_no, value(MAC_STR.NULL_VAL.value())).as(Srch_StkR.$lot_no),
				nvl(t3.sublot_no, value(MAC_STR.NULL_VAL.value())).as(Srch_StkR.$sublot_no),
				t1.sno1,
				t1.sno2,
				t1.sno3,
				t1.sno4,
				t3.base_unit_cd.as(Srch_StkR.$pack_unit_cd),
				t3.gd_cd,
				value(MSC_IN_XFR_TYP.IN_LOC.value()).as(Srch_StkR.$in_xfr_typ),
				value(MAC_QUALITY_TYP.GOOD.value()).as(Srch_StkR.$quality_typ),
				value(MSC_STK_INSP_TYP.FIN.value()).as(Srch_StkR.$stk_insp_typ),
				t4.stk_id_typ,
				t4.stk_bp_cd,
				t4.base_unit_qty.as(Srch_StkR.$pack_unit_qty),
				t4.base_unit_qty.as(Srch_StkR.$base_unit_qty),
				
				// ユーティリティ用の情報
				t1.gi_loc_cd,
				t1.gi_str_ln_cd,
				t1.gi_stk_arrv_bp_cd,
				t1.stk_id_typ,
				t1.stk_bp_cd,
				t3.schd_tm
				);
		xfrSchdL_bldr.addInnerJoin(t2, bracket(t2.xfr_schd_no.eq(t1.xfr_schd_no)));
		xfrSchdL_bldr.addInnerJoin(t3, bracket(t3.inpt_schd_no.eq(t1.inpt_schd_no)));
		xfrSchdL_bldr.addInnerJoin(t4, bracket(t4.inpt_alloc_sts_no.eq(t1.xfr_src_no)));
		xfrSchdL_bldr.addInnerJoin(m1, bracket(m1.loc_cd.eq(t3.inpt_loc_cd)));
		xfrSchdL_bldr.setWhere(t1.xfr_schd_no.eq(bind("xfr_schd_no")));
		xfrSchdL_bldr.addWhereWithAnd(t2.alloc_flg.eq(value(false)));
		xfrSchdL_bldr.addWhereWithAnd(t1.rqst_can_flg.eq(value(false)));
		
		dbSelect("MSBEL5200_MST_XFR_SCHD_S04", srchStkL, xfrSchdL_bldr, allocL);
		
		// ユーティリティを呼び出して資産区分を設定する
		if (!srchStkL.isEmpty()) {
			srchStkL.addNumberColumn("peg_no");
			setPegNo(srchStkL);
			
			MCList<GiGr_LocR> giGrL = MCList.create(GiGr_LocR.class);
			setAll(giGrL, srchStkL, createMap_GiGr_LocR_Srch_StkR());
			MSUCL_GiGrLocUtil.setLocInfo(giGrL);
			MCIndexKey giGrKey = giGrL.createIndex(GiGr_LocR.$peg_no);
			
			for (Srch_StkR srchStkR : srchStkL) {
				GiGr_LocR giGrR = giGrL.getFirst(giGrKey, srchStkR.getNumber("peg_no"));
				srchStkR.asst_typ(giGrR.gr_asst_typ());
			}
		}
	}
	
	protected Map_GiGr_LocR_Srch_StkR<GiGr_LocR, Srch_StkR> createMap_GiGr_LocR_Srch_StkR() {
		return new Map_GiGr_LocR_Srch_StkR<GiGr_LocR, Srch_StkR>();
	}

	public class Map_GiGr_LocR_Srch_StkR<D extends GiGr_LocR, S extends Srch_StkR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(GiGr_LocR.$peg_no, "peg_no");
			addColumnPathMap(GiGr_LocR.$itm_cd, Srch_StkR.$itm_cd);
			addColumnPathMap(GiGr_LocR.$itm_sub1, Srch_StkR.$itm_sub1);
			addColumnPathMap(GiGr_LocR.$itm_sub2, Srch_StkR.$itm_sub2);
			addColumnPathMap(GiGr_LocR.$itm_sub3, Srch_StkR.$itm_sub3);
			addColumnPathMap(GiGr_LocR.$gi_loc_cd, "gi_loc_cd");
			addColumnPathMap(GiGr_LocR.$gi_str_ln_cd, "gi_str_ln_cd");
			addColumnPathMap(GiGr_LocR.$gi_stk_arrv_bp_cd, "gi_stk_arrv_bp_cd");
			addColumnPathMap(GiGr_LocR.$gi_stk_id_typ, "stk_id_typ");
			addColumnPathMap(GiGr_LocR.$gi_stk_bp_cd, "stk_bp_cd");
			addColumnPathMap(GiGr_LocR.$gr_loc_cd, Srch_StkR.$loc_cd);
			addColumnPathMap(GiGr_LocR.$gr_str_ln_cd, Srch_StkR.$str_ln_cd);
			addColumnPathMap(GiGr_LocR.$gr_schd_dt, "schd_tm");
		}
	}

	protected String getIoSchdStsTyp(String prStsTyp) {
		if (MSC_PR_STS_TYP.isNOT_INST(prStsTyp)) {
			return MSC_IO_SCHD_STS_TYP.SCHD.value();
		}
		else if (MSC_PR_STS_TYP.isINST(prStsTyp)) {
			return MSC_IO_SCHD_STS_TYP.ORD.value();
		}
		return null;
	}

	/**
	 * Chk06オペレーション.<p>
	 *
	 * 引当解除前のチェックをします。<br>
	 */
	public class Chk06 extends MSBEL_XfrListReg_MC_A.Chk06 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			callXfrSchdChk02(notErrL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			lockXfrSchd(notErrL);
			msgL.addAll(chkAndLockXfrAlloc(notErrL));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			//DACチェック

			notErrL.addStringColumn("chk_gi_loc_cd");
			itmLgGrpLocCache(notErrL);
			locCache(notErrL);
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$lg_grp_cd);
				if (msgDacLgL.isEmpty()) {
					continue;
				}

				if (!isNull(r.getStringNE("gi_loc_cd"))) {
					r.setStringNE("chk_gi_loc_cd", r.getStringNE("gi_loc_cd"));
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lg_grp_cd());
					MAM_LOC_R locR = getLocCache(r.lg_grp_cd());
			
					r.setStringNE("chk_gi_loc_cd", !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);
				}

				MCMessageList msgDacGiL = checkWritableLocCdDac(r, "chk_gi_loc_cd");
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}

			for (Chk01_RsltR r : notErrL) {

				// ※コンテナを共有しているため、チェックロジックで定義できないのでチェック処理を実装
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_PositiveValidater()));

				// 未引当でないかチェック
				if (!r.alloc_flg()) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$xfr_alloc_sts_no, MSBEL0196,
						r.xfr_alloc_sts_no(), toDispGUIIndex(r)));
				}
				// 打切済チェック
				if (r.abort_flg()) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$xfr_alloc_sts_no, MSBEL0276,
						r.xfr_alloc_sts_no(), toDispGUIIndex(r)));
				}
			}

			//引当解除後、同じ移動引当状況になる場合はまとめる
			mergeXfrAlloc(notErrL.subList(Chk01_RsltR.$alloc_flg, true));

			//基準単位数量の補完
			cmplBaseUnitQty(notErrL);

			//更新前後の基準単位数量が一致しているか
			msgL.addAll(chkSameQty(notErrL));

			return msgL;
		}

		protected void mergeXfrAlloc(MCList<Chk01_RsltR> notErrL) {
			for (Chk01_RsltR r1 : notErrL.subList(Chk01_RsltR.$abort_flg, false)) {
				if (!r1.isStatusDelete()){
					for (Chk01_RsltR r2 : notErrL.subList(Chk01_RsltR.$abort_flg, false)) {
						if (!isSame(r1, r2)
								&& isSame(r1.xfr_schd_no(), r2.xfr_schd_no())
								&& isSame(r1.xfr_schd_dt(), r2.xfr_schd_dt())
								&& isSame(r1.trd_unit_cd(), r2.trd_unit_cd())
								&& isSame(r1.fix_flg(), r2.fix_flg())) {

							//数量をマージする
							r1.trd_unit_qty(r1.trd_unit_qty().add(r2.trd_unit_qty()));
							//まとめられる側は削除行とする
							r2.setStatus(MCRow.DELETE);
							r2.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
						}
					}
				}
			}
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {

			//データの補完
			for (Chk01_RsltR r : up0()) {

				MST_XFR_SCHD_R xsdR = _xfrSchdL.getFirst(_xfrSchdIdx, r.xfr_schd_no());
				MST_XFR_ALLOC_STS_R xasR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());

				if (xasR == null) {
					continue;
				}

				r.trd_cd(xasR.trd_cd());
				r.trd_ptn_typ(xasR.trd_ptn_typ());
				r.wg_cd(xasR.wg_cd());
				r.lg_grp_cd(xasR.lg_grp_cd());
				r.gr_loc_cd(xasR.gr_loc_cd());
				r.gr_stk_arrv_bp_cd(xasR.gr_stk_arrv_bp_cd());

				r.pr_sts_typ(xasR.pr_sts_typ());
				r.gi_loc_cd(!isNull(xsdR) ? xsdR.gi_loc_cd() : xasR.gi_loc_cd()); //移動移送予定時点に戻す
				r.gi_str_ln_cd(!isNull(xsdR) ? xsdR.gi_str_ln_cd() : xasR.gi_str_ln_cd()); //移動移送予定時点に戻す
				r.gi_stk_arrv_bp_cd(!isNull(xsdR) ? xsdR.gi_stk_arrv_bp_cd() : xasR.gi_stk_arrv_bp_cd()); //移動移送予定時点に戻す
				r.gr_str_ln_cd(xasR.gr_str_ln_cd());
				r.itm_cd(!isNull(xsdR) ? xsdR.itm_cd() : xasR.getString("itm_cd"));
				r.itm_sub1(!isNull(xsdR) ? xsdR.itm_sub1() : xasR.getString("itm_sub1"));
				r.itm_sub2(!isNull(xsdR) ? xsdR.itm_sub2() : xasR.getString("itm_sub2"));
				r.itm_sub3(!isNull(xsdR) ? xsdR.itm_sub3() : xasR.getString("itm_sub3"));
				r.lot_no(!isNull(xsdR) ? xsdR.lot_no() : xasR.lot_no());  //移動移送予定時点に戻す
				r.sublot_no(!isNull(xsdR) ? xsdR.sublot_no() : xasR.sublot_no());  //移動移送予定時点に戻す
				r.sno1(xasR.sno1());
				r.sno2(xasR.sno2());
				r.sno3(xasR.sno3());
				r.sno4(xasR.sno4());
				r.sno1_null_flg(xasR.sno1_null_flg());
				r.sno2_null_flg(xasR.sno2_null_flg());
				r.sno3_null_flg(xasR.sno3_null_flg());
				r.sno4_null_flg(xasR.sno4_null_flg());
				r.alloc_sno1(!isNull(xsdR) ? xsdR.sno1() : xasR.alloc_sno1());
				r.alloc_sno2(!isNull(xsdR) ? xsdR.sno2() : xasR.alloc_sno2());
				r.alloc_sno3(!isNull(xsdR) ? xsdR.sno3() : xasR.alloc_sno3());
				r.alloc_sno4(!isNull(xsdR) ? xsdR.sno4() : xasR.alloc_sno4());
				r.ver_no(!isNull(xsdR) ? xsdR.ver_no() : xasR.ver_no());  //移動移送予定時点に戻す
				r.gd_cd(!isNull(xsdR) ? xsdR.gd_cd() : xasR.gd_cd()); //移動移送予定時点に戻す
				r.quality_typ(!isNull(xsdR) ? xsdR.quality_typ() : xasR.quality_typ()); //移動移送予定時点に戻す
				r.stk_id_typ(!isNull(xsdR) ? xsdR.stk_id_typ() : xasR.stk_id_typ()); //移動移送予定時点に戻す
				r.stk_bp_cd(!isNull(xsdR) ? xsdR.stk_bp_cd() : xasR.stk_bp_cd()); //移動移送予定時点に戻す
				r.ship_inst_typ(xasR.ship_inst_typ());
				r.rsn_cd(xasR.rsn_cd());
				r.bd_dpt_cd(xasR.bd_dpt_cd());
				r.abort_flg(xasR.abort_flg());
				r.fix_flg(xasR.fix_flg());
				r.alloc_flg(xasR.alloc_flg());
				r.not_lot_mix_flg(xasR.not_lot_mix_flg());
				r.not_sublot_mix_flg(xasR.not_sublot_mix_flg());
				r.vld_dt_fr(xasR.vld_dt_fr());
				r.vld_dt_to(xasR.vld_dt_to());
				r.io_schd_pr_no(xasR.io_schd_pr_no());
				//分割前移動引当状況ＮＯには自身の移動引当状況ＮＯを設定する
				r.old_xfr_alloc_sts_no(r.xfr_alloc_sts_no());
			}
		}

		/**
		 * 移動移送予定サービスチェック処理
		 */
		protected void callXfrSchdChk02(MCList<Chk01_RsltR> list) {
			MSBEL_XfrSchdService.XfrSchd_Chk02 o = MSBEL_XfrSchdService.crtXfrSchd_Chk02();

			for (Chk01_RsltR r : list) {
				if (r.isStatusCreate()) {
					r.xfr_alloc_sts_no(null);
				}
				XfrSchdChk02_DtlR up = XfrSchdChk02_DtlR.create();
				copy(up, r, createMap_XfrSchdChk02_DtlR_Chk01_RsltR());
				o.up0().add(up);
			}

			o.up1().alloc_off_flg(true);

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Alc02オペレーション.<p>
	 *
	 * 引当解除します。<br>
	 */
	public class Alc02 extends MSBEL_XfrListReg_MC_A.Alc02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			doCache();
			callThisChk06();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callXfrSchdUpd02(notErrL);
			}

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()){
				if (r.isStatusCreate()) {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
			initXfrAllocStsCache(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk06() {
			MSBEL_XfrListReg.Chk06 ope = MSBEL_XfrListReg.crtChk06();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callXfrSchdUpd02(MCList<Chk01_RsltR> notErrL) {

			MSBEL_XfrSchdService.XfrSchd_Upd02 o = MSBEL_XfrSchdService.crtXfrSchd_Upd02();

			for (Chk01_RsltR r : notErrL) {
				XfrPr_DtlR up0 = XfrPr_DtlR.create();

				//引当解除
				r.alloc_flg(false);

				copy(up0, r, createMap_XfrPr_DtlR_Chk01_RsltR());
				up0.trd_d_rmrks(getXfrAllocStsR(r.xfr_alloc_sts_no()).trd_d_rmrks());
				o.up0().add(up0);
			}

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		// 分割実行関連処理。以下のメソッドを実装することで、Frameworkが自動で上り電文を分割して、オペレーションをexecしてくれる
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 移動・移送予定ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$xfr_schd_no);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 指図帳票を発行する前のチェックをします。<br>
	 */
	public class Chk03 extends MSBEL_XfrListReg_MC_A.Chk03 {
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chkAndLockXfrInst());

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();
			msgL.addAll(chkXfrInstD());

			return msgL;
		}
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
		}

		/**
		 * 移動指図のロック、更新カウンタチェック
		 */
		protected MCMessageList chkAndLockXfrInst() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			//移動指図
			MCList<MST_XFR_INST_R> selectL = MCList.create(MST_XFR_INST_R.class);
			MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_inst_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.xfr_inst_no);

			notErrL.sort(Chk03_RsltR.$xfr_inst_no);
			dbSelectKeyForUpdateNoWait("MSBEL1050_MST_XFR_INST_S02", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_XFR_INST_R.$xfr_inst_no);
			for (Chk03_RsltR r : notErrL) {
				MST_XFR_INST_R selectR = selectL.getFirst(idxkey, r.xfr_inst_no());
				if (!isNull(r.xfr_inst_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$inst_upd_cntr, selectR));
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			return msgL;
		}
		protected MCMessageList chkXfrInstD() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_XFR_INST_R> selectL = MCList.create(MST_XFR_INST_R.class);
			MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");

			selectL.addStringColumn("base_ac_dt");
			selectL_bldr.setSelect(t.xfr_inst_no,t.trd_ptn_typ);
			selectL_bldr.addSelect(t1.base_ac_dt);
			selectL_bldr.addWhereWithAnd(t.xfr_inst_no.eq(bind(Chk01_RsltR.$xfr_inst_no)));
			selectL_bldr.addLeftOuterJoin(t1,
					bracket(t1.xfr_inst_no.eq(t.xfr_inst_no)));
			selectL_bldr.addOrderByAscNullsFirst(t.xfr_inst_no, t1.base_ac_dt);
			dbSelect("MSBEL1050_MST_XFR_INST_S03", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_XFR_INST_R.$xfr_inst_no);
			for (Chk03_RsltR r : notErrL) {
				MST_XFR_INST_R selectR = selectL.getFirst(idxkey, r.xfr_inst_no());
				if (MAC_TRD_PTN_TYP.isPROV_RTN(selectR.getString("trd_ptn_typ"))) {
					if (isNull(selectR.getStringNE("base_ac_dt"))) {
						msgL.add(new MCMessage(r, null, MSBEL1105 , toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 納品書発行前のチェックをします。<br>
	 */
	public class Chk04 extends MSBEL_XfrListReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chkAndLockXfrAct());

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();
			msgL.addAll(chkXfrActD());

			return msgL;
		}
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
		}

		/**
		 * 移動実績のロック、更新カウンタチェック
		 */
		protected MCMessageList chkAndLockXfrAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			//移動実績
			MCList<MST_XFR_ACT_R> selectL = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_act_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.xfr_act_no);

			notErrL.sort(Chk04_RsltR.$xfr_act_no);
			dbSelectKeyForUpdateNoWait("MSBEL1050_MST_XFR_ACT_S02", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
			for (Chk04_RsltR r : notErrL) {
				MST_XFR_ACT_R selectR = selectL.getFirst(idxkey, r.xfr_act_no());
				if (!isNull(r.xfr_act_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk04_RsltR.$act_upd_cntr, selectR));
				}
			}

			return msgL;
		}
		protected MCMessageList chkXfrActD() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_XFR_ACT_R> selectL = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");

			selectL.addStringColumn("base_ac_dt");
			selectL_bldr.setSelect(t.xfr_act_no,t.trd_ptn_typ);
			selectL_bldr.addSelect(t1.base_ac_dt);
			selectL_bldr.addWhereWithAnd(t.xfr_act_no.eq(bind(Chk01_RsltR.$xfr_act_no)));
			selectL_bldr.addLeftOuterJoin(t1,
					bracket(t1.xfr_act_no.eq(t.xfr_act_no)));
			selectL_bldr.addOrderByAscNullsFirst(t.xfr_act_no, t1.base_ac_dt);
			dbSelect("MSBEL1050_MST_XFR_ACT_S04", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
			for (Chk04_RsltR r : notErrL) {
				MST_XFR_ACT_R selectR = selectL.getFirst(idxkey, r.xfr_act_no());
				if (MAC_TRD_PTN_TYP.isPROV_RTN(selectR.getString("trd_ptn_typ"))) {
					if (isNull(selectR.getStringNE("base_ac_dt"))) {
						msgL.add(new MCMessage(r, null, MSBEL1105 , toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * ピッキングリスト、指図書、納品書を発行します。<br>
	 */
	public class Prnt01 extends MSBEL_XfrListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {

			editUp();
			callThisChk03();

			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callShipRprtPrntServicePrnt02(notErrL);
			}
			notErrL = notErrL.subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callShipRprtPrntServicePrnt01(notErrL);
			}
			MCList<Chk03_RsltR> notErrL2 = notErrL.subList(Chk03_RsltR.$err_flg, false);
			if (notErrL2.size() != 0) {
				updXfrInst(notErrL2);
			}
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			MCDate now = MCDate.now();
			for (Chk03_RsltR r : up0()) {
				r.trn_typ(MSC_TRN_TYP.XFR.value());

				if (up1().immd_pick_prnt_flg()) {
					r.pick_prnt_flg(true);
					r.pick_prnt_tm(now);
				}
				if (up1().immd_inst_prnt_flg()) {
					r.inst_prnt_flg(true);
					r.inst_prnt_tm(now);
				}
				if (up1().immd_dlv_prnt_flg()) {
					r.dlv_prnt_flg(true);
					r.dlv_prnt_tm(now);
				}
			}
		}
		protected void callShipRprtPrntServicePrnt01(MCList<Chk03_RsltR> list) {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01
				ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			
			MCList<MST_XFR_ALLOC_STS_R> rsltL = getPrntTgtL(list);
			MCIndexKey idx = list.createIndex(Chk03_RsltR.$xfr_inst_no);
			for (MST_XFR_ALLOC_STS_R actDR : rsltL) {
				Chk03_RsltR up0R = list.getFirst(idx, actDR.getStringNE(MST_XFR_INST_D_R.$xfr_inst_no));
				
				ShipRprt_Prnt01_HdrR prntR = ope.up0().add();
				prntR.peg_no(up0R.peg_no());
				prntR.dlv_slip_no(actDR.dlv_slip_no());
				prntR.dlv_slip_seq(actDR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0R);
			}
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			ope.exec();
			copyErrFlg(up0(), ope.down0());
		}
		
		protected MCList<MST_XFR_ALLOC_STS_R> getPrntTgtL(MCList<Chk03_RsltR> list) {
			xfrInstWkDel();
			xfrInstWkIns(list);
			
			// 上り電文の移動指図ＮＯに対応する納品書ＮＯ、連番を取得する
			MSW_XFR_INST_KEY_R w1 = MSW_XFR_INST_KEY_R.create("W1");
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(w1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.xfr_inst_no,
				t2.dlv_slip_no,
				t2.dlv_slip_seq
			);
			bldr.addInnerJoin(t1, t1.xfr_inst_no.eq(w1.xfr_inst_no));
			bldr.addInnerJoin(t2, t2.xfr_inst_d_no.eq(t1.xfr_inst_d_no));
			bldr.addWhereWithCutOffAnd(t2.dlv_slip_no.eq(bind("dlv_slip_no")));
			
			MCList<MST_XFR_ALLOC_STS_R> rsltL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			dbSelect("MSBEL1050_MST_DLV_SLIP_S02", rsltL, bldr, list);
			
			xfrInstWkDel();
			return rsltL;
		}
		protected void xfrInstWkDel() {
			dbWkDelete("MSBEL1050_MSW_XFR_INST_KEY_D01", MST_XFR_INST_R.create());
		}
		protected void xfrInstWkIns(MCList<Chk03_RsltR> list) {
			dbWkInsert(
				"MSBEL1050_MSW_XFR_INST_KEY_I01",
				list.subList(r -> r.dlv_prnt_flg())
					.groupBy(Chk03_RsltR.$xfr_inst_no),
				MST_XFR_INST_R.create()
			);
		}

		/**
		 * 印刷処理を実行する
		 */
		protected void callShipRprtPrntServicePrnt02(MCList<Chk03_RsltR> list) {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();

			for (Chk03_RsltR r : list) {
				ShipRprt_Prnt02_HdrR up0 = ShipRprt_Prnt02_HdrR.create();

				copy(up0, r, createMap_ShipRprt_Prnt02_HdrR_Chk03_RsltR());

				o.up0().add(up0);
			}
			o.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());	// まとめ発行＝個別発行ではない
			o.up1().bndl_inst_prnt_flg(!up1().indiv_inst_prnt_flg());

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}

		protected void callThisChk03() {
			MSBEL_XfrListReg.Chk03 ope = MSBEL_XfrListReg.crtChk03();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void updXfrInst(MCList<Chk03_RsltR> list) {
			MCList<MST_XFR_INST_R> updL = MCList.create(MST_XFR_INST_R.class);

			addAll(
				updL,
				list.distinctNE(Chk03_RsltR.$xfr_inst_no),
				createMap_MST_XFR_INST_R_Chk03_RsltR()
			);

			if (!updL.isEmpty()) {
				MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editXfrInstUpdSet(updL, t, updL_bldr);
				dbUpdateKey("MSBEL1050_MST_XFR_INST_U01", updL, updL_bldr);
			}
		}

		protected void editXfrInstUpdSet(MCList<MST_XFR_INST_R> updL, MST_XFR_INST_R t, MCQueryApiBuilder updL_bldr) {

			if (up1().immd_inst_prnt_flg()) {
				updL_bldr.setSet(t.inst_prnt_flg);
				updL_bldr.addSet(t.inst_prnt_tm);
			}
			else if (up1().immd_dlv_prnt_flg()) {
				updL_bldr.setSet(t.dlv_prnt_flg);
				updL_bldr.addSet(t.dlv_prnt_tm);
			}
			else if (up1().immd_pick_prnt_flg()) {
				updL_bldr.setSet(t.pick_prnt_flg);
				updL_bldr.addSet(t.pick_prnt_tm);
			}
		}

		protected void handleSuccess(MCList<Chk03_RsltR> l) {
			dbTran().commit();
			for (Chk03_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk03_RsltR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);

			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk03_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * 納品書を発行します。<br>
	 */
	public class Prnt02 extends MSBEL_XfrListReg_MC_A.Prnt02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			callThisChk04();

			MCList<Chk04_RsltR> notErrL = up0().subList(Chk04_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callShipRprtPrntServicePrnt01(notErrL);
			}
			MCList<Chk04_RsltR> notErrL2 = notErrL.subList(Chk04_RsltR.$err_flg, false);
			if (notErrL2.size() != 0) {
				updXfrAct(notErrL2);
			}
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			MCDate now = MCDate.now();
			for (Chk04_RsltR r : up0()) {
				r.trn_typ(MSC_TRN_TYP.XFR.value());
				r.dlv_prnt_flg(true);
				r.dlv_prnt_tm(now);
			}
		}

		/**
		 * 印刷処理を実行する
		 */
		protected void callShipRprtPrntServicePrnt01(MCList<Chk04_RsltR> list) {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();

			o.up0().setAll(crtShipRprtPrnt01(list));
			o.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());	// まとめ発行＝個別発行ではない

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(list, o.down0());
			}
		}
		
		protected final String DLV_PRNTED_FLG = "_dlv_prntd_flg_";
		protected MCList<ShipRprt_Prnt01_HdrR> crtShipRprtPrnt01(MCList<Chk04_RsltR> list) {
			MCList<MST_XFR_ACT_D_R> rsltL = getPrntTgtL(list);
			MCIndexKey idx = getUpIdxKey();
			MCList<ShipRprt_Prnt01_HdrR> prntL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			up0().addBooleanColumn(DLV_PRNTED_FLG);
			for (MST_XFR_ACT_D_R actDR : rsltL) {
				Chk04_RsltR up0R = up0().getFirst(idx, actDR.toArray(idx.getKeys()));
				
				ShipRprt_Prnt01_HdrR prntR = prntL.add();
				prntR.peg_no(up0R.peg_no());
				prntR.dlv_slip_act_no(actDR.xfr_act_no());	// まとめ発行=オフのときに使用する
				prntR.dlv_slip_no(actDR.dlv_slip_no());
				prntR.dlv_slip_seq(actDR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0R);
				
				if (up0R.dlv_prnt_flg() && !actDR.getBoolean(MST_DLV_SLIP_R.$slip_prnt_flg)) {
					up0R.setBooleanNE(DLV_PRNTED_FLG, true);
				}
			}
			
			return prntL;
		}
		protected MCIndexKey getUpIdxKey() {
			List<String> arr = new ArrayList<>();
			arr.add(Chk04_RsltR.$xfr_act_no);
			if (!up0().isEmpty()
				&& !isNull(up0().get(0).dlv_slip_no())) {
				arr.add(Chk04_RsltR.$dlv_slip_no);
			}
			return up0().createIndex(arr.toArray(new String[0]));
		}
		protected MCList<MST_XFR_ACT_D_R> getPrntTgtL(MCList<Chk04_RsltR> list) {
			xfrActWkDel();
			xfrActWkIns(list);
			
			// 上り電文の移動実績ＮＯに対応する納品書ＮＯ、連番を取得する
			MSW_XFR_ACT_KEY_R w1 = MSW_XFR_ACT_KEY_R.create("W1");
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(w1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.xfr_act_no,
				t1.dlv_slip_no,
				t1.dlv_slip_seq,
				t2.slip_prnt_flg
			);
			bldr.addInnerJoin(t1, t1.xfr_act_no.eq(w1.xfr_act_no));
			bldr.addInnerJoin(t2,
				t2.dlv_slip_no.eq(t1.dlv_slip_no).and(t2.dlv_slip_seq.eq(t1.dlv_slip_seq)));
			bldr.addWhereWithCutOffAnd(t1.dlv_slip_no.eq(bind("dlv_slip_no")));
			
			MCList<MST_XFR_ACT_D_R> rsltL = MCList.create(MST_XFR_ACT_D_R.class);
			rsltL.addBooleanColumn(MST_DLV_SLIP_R.$slip_prnt_flg);
			dbSelect("MSBEL1050_MST_DLV_SLIP_S03", rsltL, bldr, list);
			
			xfrActWkDel();
			return rsltL;
		}
		protected void xfrActWkDel() {
			dbWkDelete("MSBEL1050_MSW_XFR_ACT_KEY_D01", MST_XFR_ACT_R.create());
		}
		protected void xfrActWkIns(MCList<Chk04_RsltR> list) {
			dbWkInsert("MSBEL1050_MSW_XFR_ACT_KEY_I01",
				list.groupBy(Chk04_RsltR.$xfr_act_no),
				MST_XFR_ACT_R.create()
			);
		}

		protected void updXfrAct(MCList<Chk04_RsltR> list) {
			MCList<MST_XFR_ACT_R> updL = MCList.create(MST_XFR_ACT_R.class);

			addAll(
				updL,
				list.subList(r -> r.getBooleanNE(DLV_PRNTED_FLG))
					.distinctNE(Chk04_RsltR.$xfr_act_no),
				createMap_MST_XFR_ACT_R_Chk04_RsltR()
			);

			if (!updL.isEmpty()) {
				MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(t.dlv_prnt_flg);
				updL_bldr.addSet(t.dlv_prnt_tm);
				dbUpdateKey("MSBEL1050_MST_XFR_ACT_U01", updL, updL_bldr);
			}
		}

		protected void callThisChk04() {
			MSBEL_XfrListReg.Chk04 ope = MSBEL_XfrListReg.crtChk04();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void handleSuccess(MCList<Chk04_RsltR> l) {
			dbTran().commit();
			for (Chk04_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk04_RsltR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);

			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk04_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopL;
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStopR; 
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocL; 

	/**
	 * 梱包数量提案処理
	 */
	protected void execPckgProp(MCList<Chk01_RsltR> rsltL) {
		MCList<Chk01_RsltR> selectOnL = rsltL.subList(Chk01_RsltR.$pack_tgt_flg, true);

		if (selectOnL.isEmpty()) {
			return;
		}

		MCList<Chk01_RsltR> selectOffL = rsltL.subList(Chk01_RsltR.$pack_tgt_flg, false);
		MCNumber pegNo = (MCNumber) rsltL.max(Chk01_RsltR.$peg_no);

		// 選択チェック行をまとめ条件に従ってまとめた行を作成する
		MCGroupByPolicy pckgPolicy = new MCGroupByPolicy(getPckgGroupColumn());
		pckgPolicy.sum(Chk01_RsltR.$base_unit_qty);
		MCList<Chk01_RsltR> bndlDestL = selectOnL.groupBy(pckgPolicy); // まとめた先の行の一覧

		int i = 0;
		initItmCache(bndlDestL);
		for (Chk01_RsltR destR : bndlDestL) {
			MAM_ITM_R itm = _itmCache.get(destR.itm_cd(), destR.itm_sub1(), destR.itm_sub2(), destR.itm_sub3());
			pegNo = pegNo.add(MCNumber.ONE);

			// まとめた先の行の設定
			// 梱包数量の計算
			MCNumber pckgQty = rvrsBaseUnitConv(
					destR.base_unit_qty(),
					itm.getNumber(MAM_ITM_UNIT_R.$conv_base_qty),
					itm.getNumber(MAM_ITM_UNIT_R.$conv_qty),
					itm.dec_place(),
					MAC_RND_TYP.RNDUP.value());

			// 基準単位数量の計算
			MCNumber baseQty = convToBaseUnit(
					pckgQty,
					itm.getNumber(MAM_ITM_UNIT_R.$conv_base_qty),
					itm.getNumber(MAM_ITM_UNIT_R.$conv_qty),
					destR.base_unit_dec_place(),
					destR.base_unit_rnd_typ());

			destR.trd_unit_cd(itm.pckg_unit_cd());
			destR.trd_unit_conv_base_qty(itm.getNumber(MAM_ITM_UNIT_R.$conv_base_qty));
			destR.trd_unit_conv_qty(itm.getNumber(MAM_ITM_UNIT_R.$conv_qty));
			destR.trd_unit_dec_place(itm.dec_place());
			destR.trd_unit_qty(pckgQty);
			destR.peg_no(pegNo);
			destR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
			destR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
			destR.alloc_flg(false);
			destR.abort_flg(false);
			destR.ship_inst_typ(MAC_SHIP_INST_TYP.PICK.value());
			destR.inst_bndl_flg(true);
			destR.base_unit_qty(baseQty);
			destR.base_unit_act_qty(MCNumber.ZERO);
			destR.inst_bndl_peg_no(i++);

			// まとめた先の行からまとめ元の行の一覧を取得する
			MCList<Chk01_RsltR> bndlSrcL = selectOnL.subList(createDtlRowMatcher(destR));
			// まとめ元の行にひとつでも引当オンの行があればまとめ先もオンにする
			boolean alloc_flg = false;
			for (Chk01_RsltR srcR : bndlSrcL) {
				alloc_flg |= srcR.alloc_flg();
			}
			destR.alloc_flg(alloc_flg);

			// まとめられた元の行の設定
			for (Chk01_RsltR srcR : bndlSrcL) {
				srcR.setString("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
				srcR.inst_bndl_src_flg(true);
				srcR.inst_bndl_to_peg_no(destR.inst_bndl_peg_no());
			}
		}
		rsltL.setAll(selectOnL);
		rsltL.addAll(bndlDestL);
		rsltL.addAll(selectOffL);
	}

	protected String[] getPckgGroupColumn() {
		// 梱包数量提案のGroupBy条件
		return new String[] {
				Chk01_RsltR.$trd_cd,
				Chk01_RsltR.$trd_ptn_typ,
				Chk01_RsltR.$xfr_schd_dt,
				Chk01_RsltR.$wg_cd,
				Chk01_RsltR.$lg_grp_cd,
				Chk01_RsltR.$gr_loc_cd,
				Chk01_RsltR.$gr_stk_arrv_bp_cd,
				Chk01_RsltR.$itm_cd,
				Chk01_RsltR.$itm_sub1,
				Chk01_RsltR.$itm_sub2,
				Chk01_RsltR.$itm_sub3,
				Chk01_RsltR.$lot_no,
				Chk01_RsltR.$sublot_no,
				Chk01_RsltR.$ver_no,
				Chk01_RsltR.$base_unit_cd,
				Chk01_RsltR.$base_unit_nm,
				Chk01_RsltR.$base_unit_dec_place,
				Chk01_RsltR.$base_unit_rnd_typ,
				Chk01_RsltR.$gi_loc_cd,
				Chk01_RsltR.$gi_stk_arrv_bp_cd,
				Chk01_RsltR.$gi_str_ln_cd,
				Chk01_RsltR.$gr_loc_cd,
				Chk01_RsltR.$gr_stk_arrv_bp_cd,
				Chk01_RsltR.$gr_str_ln_cd,
				Chk01_RsltR.$gd_cd,
				Chk01_RsltR.$quality_typ,
				Chk01_RsltR.$sno1_null_flg,
				Chk01_RsltR.$sno1,
				Chk01_RsltR.$sno2_null_flg,
				Chk01_RsltR.$sno2,
				Chk01_RsltR.$sno3_null_flg,
				Chk01_RsltR.$sno3,
				Chk01_RsltR.$sno4_null_flg,
				Chk01_RsltR.$sno4,
				Chk01_RsltR.$alloc_sno1,
				Chk01_RsltR.$alloc_sno2,
				Chk01_RsltR.$alloc_sno3,
				Chk01_RsltR.$alloc_sno4,
				Chk01_RsltR.$stk_id_typ,
				Chk01_RsltR.$stk_bp_cd,
				Chk01_RsltR.$rsn_cd,
				Chk01_RsltR.$bd_dpt_cd,
				Chk01_RsltR.$prov_typ,
				Chk01_RsltR.$prov_basis_typ,
				Chk01_RsltR.$ret_prov_typ,
				Chk01_RsltR.$ret_prov_basis_typ
		};
	}
	// -- RowMatcher----------------------------------------------------------//
	protected MCRowMatcher<Chk01_RsltR> createDtlRowMatcher(Chk01_RsltR r) {
		return new DtlRowMatcher<Chk01_RsltR>(r);
	}

	public class DtlRowMatcher<R extends Chk01_RsltR> implements MCRowMatcher<R> {
		protected Chk01_RsltR _rsltR;

		public DtlRowMatcher(Chk01_RsltR r) {
			this._rsltR = r;
		}

		@Override
		public boolean match(R row) {
			// 梱包数量提案のまとめ条件
			if (row.isStatusDelete() && !row.inst_bndl_src_flg()
					|| !isSame(_rsltR.trd_cd(), row.trd_cd())
					|| !isSame(_rsltR.trd_ptn_typ(), row.trd_ptn_typ())
					|| !isSame(_rsltR.xfr_schd_dt(), row.xfr_schd_dt())
					|| isNullOrNullVal(row.itm_cd())
					|| !isSame(_rsltR.itm_cd(), row.itm_cd())
					|| !isSame(_rsltR.itm_sub1(), row.itm_sub1())
					|| !isSame(_rsltR.itm_sub2(), row.itm_sub2())
					|| !isSame(_rsltR.itm_sub3(), row.itm_sub3())
					|| !isSame(_rsltR.lot_no(), row.lot_no())
					|| !isSame(_rsltR.sublot_no(), row.sublot_no())
					|| !isSame(_rsltR.ver_no(), row.ver_no())
					|| !isSame(_rsltR.gi_loc_cd(), row.gi_loc_cd())
					|| !isSame(_rsltR.gi_stk_arrv_bp_cd(), row.gi_stk_arrv_bp_cd())
					|| !isSame(_rsltR.gi_str_ln_cd(), row.gi_str_ln_cd())
					|| !isSame(_rsltR.gr_loc_cd(), row.gr_loc_cd())
					|| !isSame(_rsltR.gr_stk_arrv_bp_cd(), row.gr_stk_arrv_bp_cd())
					|| !isSame(_rsltR.gr_str_ln_cd(), row.gr_str_ln_cd())
					|| !isSame(_rsltR.gd_cd(), row.gd_cd())
					|| !isSame(_rsltR.quality_typ(), row.quality_typ())
					|| !isSame(_rsltR.sno1_null_flg(), row.sno1_null_flg())
					|| !isSame(_rsltR.sno1(), row.sno1())
					|| !isSame(_rsltR.sno2_null_flg(), row.sno2_null_flg())
					|| !isSame(_rsltR.sno2(), row.sno2())
					|| !isSame(_rsltR.sno3_null_flg(), row.sno3_null_flg())
					|| !isSame(_rsltR.sno3(), row.sno3())
					|| !isSame(_rsltR.sno4_null_flg(), row.sno4_null_flg())
					|| !isSame(_rsltR.sno4(), row.sno4())
					|| !isSame(_rsltR.alloc_sno1(), row.alloc_sno1())
					|| !isSame(_rsltR.alloc_sno2(), row.alloc_sno2())
					|| !isSame(_rsltR.alloc_sno3(), row.alloc_sno3())
					|| !isSame(_rsltR.alloc_sno4(), row.alloc_sno4())
					|| !isSame(_rsltR.stk_id_typ(), row.stk_id_typ())
					|| !isSame(_rsltR.stk_bp_cd(), row.stk_bp_cd())
					|| !isSame(_rsltR.rsn_cd(), row.rsn_cd())
					|| !isSame(_rsltR.bd_dpt_cd(), row.bd_dpt_cd())
					|| !isSame(_rsltR.prov_typ(), row.prov_typ())
					|| !isSame(_rsltR.prov_basis_typ(), row.prov_basis_typ())
					|| !isSame(_rsltR.ret_prov_typ(), row.ret_prov_typ())
					|| !isSame(_rsltR.ret_prov_basis_typ(), row.ret_prov_basis_typ())) {
				return false;
			}
			return true;
		}
	}

	protected MCMessageList chkStop(MCList<? extends MCRow> upL, MCRow cndR) {
		MCMessageList msgL = new MCMessageList();

		completionSppl(upL);
		msgL.addAll(checkBpStop(upL.subList(r -> !isNull(r.getStringNE("gr_sppl_cd"))), cndR));
		msgL.addAll(checkItmStop(upL, cndR));
		return msgL;
	}

	protected void completionSppl(MCList<? extends MCRow> upL) {
		MCList<MAM_LOC_R> grLocL = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder grLocL_bldr = MCQueryApiBuilder.create(t);
		MCIndexKey locIdx;
		grLocL_bldr.setSelect(t.loc_cd, t.sppl_cd);
		grLocL_bldr.addWhereWithAnd(t.loc_cd.eq(bind("gr_loc_cd")));
		dbSelect("MSBEL1050_MAM_LOC_S01", grLocL, grLocL_bldr, upL.groupBy("gr_loc_cd"));
		locIdx = grLocL.createIndex(MAM_LOC_R.$loc_cd);

		for(MCRow r : upL) {
			MAM_LOC_R grLoc = grLocL.getFirst(locIdx, r.getStringNE("gr_loc_cd"));
			if(!isNull(grLoc) && !isNull(grLoc.sppl_cd())) {
				r.setStringNE("gr_sppl_cd", grLoc.sppl_cd());
			}
		}
	}

	protected void initGrLocL(MCList<? extends MCRow> bindL) {
		// 品目禁止マスタの取得
		_grLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(
				MCQueryApiBuilder.create(MAM_LOC_R.create("T")), bindL, "gr_loc_cd");
	}

	protected boolean isSpplLoc(MCRow bindR) {
		MAM_LOC_R grLoc = _grLocL.get(bindR.getStringNE("gr_loc_cd"));
		return !isNull(grLoc) && !isNull(grLoc.sppl_cd());
	}

	protected void initItmStopL(MCList<? extends MCRow> bindL) {
		// 品目禁止マスタの取得
		_itmStopL = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
				MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")),
				bindL,
				Chk01_RsltR.$itm_cd,
				Chk01_RsltR.$itm_sub1,
				Chk01_RsltR.$itm_sub2,
				Chk01_RsltR.$itm_sub3);
	}

	protected void initBpStopL(MCList<? extends MCRow> bindL) {
		// 取引先禁止マスタの取得
		_bpStopR = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
				MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")),
				bindL,
				"gr_sppl_cd");
	}

	protected MCMessageList checkItmStop(MCList<? extends MCRow> chkL, MCRow chkR) {
		MCMessageList msgL = new MCMessageList();
		initItmStopL(chkL); 
		MCDate dt;

		if (chkR instanceof Chk01_CndR) {
			dt = chkR.getDateNE("xfr_inst_dt");
		}
		else if (chkR instanceof Chk02_CndR) {
			dt = chkR.getDateNE("xfr_act_dt");
		}
		else {
			return msgL;
		}

		for(MCRow r : chkL) {
			String itm_cd = r.getStringNE("itm_cd");
			String itm_sub1 = r.getStringNE("itm_sub1");
			String itm_sub2 = r.getStringNE("itm_sub2");
			String itm_sub3 = r.getStringNE("itm_sub3");
			MAM_ITM_STOP_R itmStopR = _itmStopL.get(itm_cd, itm_sub1, itm_sub2, itm_sub3);
			if(!isNull(itmStopR.xfr_stop_dt()) && itmStopR.xfr_stop_dt().lte(dt)) {
				MCMessagePool.add(new MCMessage(
						r,
						Chk01_RsltR.$itm_cd,
						MSBEL0288,
						toDispItm(itm_cd, itm_sub1, itm_sub2, itm_sub3),
						toDispGUIIndex(r)));
				r.setBooleanNE("err_flg", true);
			}
		}
		return msgL;
	}

	protected MCMessageList checkBpStop(MCList<? extends MCRow> chkL, MCRow chkR) {
		MCMessageList msgL = new MCMessageList();
		initBpStopL(chkL);
		MCDate dt;

		if (chkR instanceof Chk01_CndR) {
			dt = chkR.getDateNE("xfr_inst_dt");
		}
		else if (chkR instanceof Chk02_CndR) {
			dt = chkR.getDateNE("xfr_act_dt");
		}
		else {
			return msgL;
		}

		for(MCRow r : chkL) {
			String gr_sppl_cd = r.getStringNE("gr_sppl_cd");
			MAM_BP_STOP_R bpStopR = _bpStopR.get(gr_sppl_cd);
			if(!isNull(bpStopR.xfr_stop_dt()) && bpStopR.xfr_stop_dt().lte(dt)) {
				msgL.add(new MCMessage(
						r,
						Chk01_RsltR.$gr_loc_cd,
						MSBEL0289,
						gr_sppl_cd,
						toDispGUIIndex(r)));
				r.setBooleanNE("err_flg", true);
			}
		}
		return msgL;
	}

	/**
	 * 品目マスタをキャッシュ
	 */
	protected void initItmCache(MCList<Chk01_RsltR> rsltL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAVM_ITM_UNIT_R m = MAVM_ITM_UNIT_R.create("M");
		dbc_bldr.addLeftOuterJoin(m,
				bracket(t.itm_cd.eq(m.itm_cd)
						.and(t.itm_sub1.eq(m.itm_sub1))
						.and(t.itm_sub2.eq(m.itm_sub2))
						.and(t.itm_sub3.eq(m.itm_sub3))
						.and(t.pckg_unit_cd.eq(m.unit_cd))));
		dbc_bldr.setSelect(t.pckg_unit_cd, m.conv_base_qty, m.conv_qty, m.dec_place);

		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, rsltL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}

	protected static final Class<MSBEL_XfrListReg> CLAZZ = MSBEL_XfrListReg.class;

	/**
	 * 移動引当状況、移動指図明細、移動・移送予定をキャッシュ
	 */
	protected static void initXfrAllocStsCache(MCList<Chk01_RsltR> rsltL) {
		object(CLAZZ)._initXfrAllocStsCache(rsltL);
	}
	protected FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> _xfrAllocStsCache = null;
	protected void _initXfrAllocStsCache(MCList<?> rsltL) {
		MCList<MST_XFR_ALLOC_STS_R> dbc = MCList.create(MST_XFR_ALLOC_STS_R.class);
		MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
		MST_XFR_SCHD_R t2 = MST_XFR_SCHD_R.create("T2");
		MST_XFR_INST_D_R t3 = MST_XFR_INST_D_R.create("T3");
		MST_PROV_SCHD_R t4 = MST_PROV_SCHD_R.create("T4");
		MST_PROV_SCHD_R t5 = MST_PROV_SCHD_R.create("T5");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		dbc.addStringColumn("itm_cd");
		dbc.addStringColumn("itm_sub1");
		dbc.addStringColumn("itm_sub2");
		dbc.addStringColumn("itm_sub3");
		dbc.addStringColumn("gi_sppl_cd");
		dbc.addStringColumn("slo_no");
		dbc.addStringColumn("prov_schd_no");
		dbc.addStringColumn("ret_prov_schd_no");
		dbc_bldr.addSelect(coalesce(t3.itm_cd, t2.itm_cd).as("itm_cd"));
		dbc_bldr.addSelect(coalesce(t3.itm_sub1, t2.itm_sub1).as("itm_sub1"));
		dbc_bldr.addSelect(coalesce(t3.itm_sub2, t2.itm_sub2).as("itm_sub2"));
		dbc_bldr.addSelect(coalesce(t3.itm_sub3, t2.itm_sub3).as("itm_sub3"));
		dbc_bldr.addSelect(t2.slo_no.as("slo_no"));
		dbc_bldr.addSelect(t4.prov_schd_no, t5.prov_schd_no.as("ret_prov_schd_no"));
		dbc_bldr.addSelect(m1.sppl_cd.as("gi_sppl_cd"));
		dbc_bldr.addLeftOuterJoin(t2, bracket(t1.xfr_schd_no.eq(t2.xfr_schd_no)));
		dbc_bldr.addLeftOuterJoin(t3, bracket(t1.xfr_inst_d_no.eq(t3.xfr_inst_d_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket(t1.xfr_alloc_sts_no.eq(t4.prov_src_schd_no1)
				.and(t4.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
				.and(t4.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))));
		dbc_bldr.addLeftOuterJoin(t5, bracket(t1.xfr_alloc_sts_no.eq(t5.prov_src_schd_no1)
				.and(t5.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
				.and(t5.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))));
		dbc_bldr.addLeftOuterJoin(m1, bracket(t1.gi_loc_cd.eq(m1.loc_cd)));

		_xfrAllocStsCache = new FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R>(dbc, dbc_bldr, rsltL, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
	}
	protected static FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> getXfrAllocStsCache() {
		return object(CLAZZ)._xfrAllocStsCache;
	}
	protected static MST_XFR_ALLOC_STS_R getXfrAllocStsR(String xfrAllocStsNo) {
		return getXfrAllocStsCache().get(xfrAllocStsNo);
	}

	protected FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> _itmLgGrpLocCache = null;
	protected MCList<MAM_LOC_R> _locCache = null;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;

	// 品目、出庫物流場所グループに対するデフォルト場所
	protected static void itmLgGrpLocCache(MCList<? extends MCRow> list) {
		object(CLAZZ)._itmLgGrpLocCache(list);
	}
	protected void _itmLgGrpLocCache(MCList<? extends MCRow> list) {
		MCList<? extends MCRow> grpL = list.subList("gi_loc_cd", null).groupBy("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "lg_grp_cd");
		
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.lg_def_loc_cd);

		MCRow tmpR = list.createRow();
		if (tmpR instanceof Chk01_RsltR) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL_bldr, grpL, Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3, Chk01_RsltR.$lg_grp_cd);
		}
		else if (tmpR instanceof Srch01_RsltR) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL_bldr, grpL, Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3, Srch01_RsltR.$lg_grp_cd);
		}
		else if (tmpR instanceof MST_XFR_INST_D_R) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL_bldr, grpL, MST_XFR_INST_D_R.$itm_cd, MST_XFR_INST_D_R.$itm_sub1, MST_XFR_INST_D_R.$itm_sub2, MST_XFR_INST_D_R.$itm_sub3, "lg_grp_cd");
		}
	}

	protected static FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> getItmLgGrpLocCache() {
		return object(CLAZZ)._itmLgGrpLocCache;
	}
			

	// 場所に対する物流標準場所
	protected static void locCache(MCList<? extends MCRow> list) {
		object(CLAZZ)._locCache(list);
	}
	protected void _locCache(MCList<? extends MCRow> list) {
		MCList<? extends MCRow> grpL = list.subList("gi_loc_cd", null).groupBy("lg_grp_cd");
		
		_locCache = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder locCache_bldr = MCQueryApiBuilder.create(t);
		locCache_bldr.setSelect(t.loc_cd);
		locCache_bldr.addSelect(t.lg_grp_cd);
		locCache_bldr.setWhere(t.lg_grp_cd.eq(bind("lg_grp_cd")));
		locCache_bldr.addWhereWithAnd(t.lg_def_flg.eq(value(true)));
		dbSelect("MSBEL1050_MAM_LOC_S02", _locCache, locCache_bldr, grpL);
	}

	protected static MAM_LOC_R getLocCache(String giLgGrpCd) {
		return object(CLAZZ)._getLocCache(giLgGrpCd);
	}
	
	protected MAM_LOC_R _getLocCache(String giLgGrpCd) {
		if (isNull(object(CLAZZ)._locCache)) {
			return null;
		}
		return object(CLAZZ)._locCache.getFirst(MAM_LOC_R.$lg_grp_cd, giLgGrpCd);
	}

	// 入庫場所情報
	protected static void grLocCache(MCList<MST_XFR_ALLOC_STS_R> list) {
		object(CLAZZ)._grLocCache(list);
	}
	protected void _grLocCache(MCList<MST_XFR_ALLOC_STS_R> list) {
		MCList<MST_XFR_ALLOC_STS_R>  grpL = list.groupBy(MST_XFR_ALLOC_STS_R.$gr_loc_cd);
		
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.loc_cd, t.wg_cd);
		_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, grpL, MST_XFR_ALLOC_STS_R.$gr_loc_cd);

	}

	protected static FXUCL_MCDbcCache<MAM_LOC_R> getGrLocCache() {
		return object(CLAZZ)._grLocCache;
	}
	protected Map_XfrActChk_HdrDtlR_Chk01_RsltR<XfrActChk_HdrDtlR,Chk01_RsltR> createMap_XfrActChk_HdrDtlR_Chk01_RsltR() {
		return new Map_XfrActChk_HdrDtlR_Chk01_RsltR<XfrActChk_HdrDtlR, Chk01_RsltR>();
	}

	public class Map_XfrActChk_HdrDtlR_Chk01_RsltR<D extends XfrActChk_HdrDtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrActChk_HdrDtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_alloc_sts_no, Chk01_RsltR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_act_no, Chk01_RsltR.$xfr_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_dt, "act_dt");
			addColumnPathMap(XfrActChk_HdrDtlR.$ac_dt, "ac_dt");
			addColumnPathMap(XfrActChk_HdrDtlR.$can_ac_dt, Chk01_RsltR.$can_ac_dt);
			addColumnPathMap(XfrActChk_HdrDtlR.$err_flg, Chk01_RsltR.$err_flg);

			addColumnPathMap(XfrActChk_HdrDtlR.$trd_cd, Chk01_RsltR.$trd_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$lg_grp_cd, Chk01_RsltR.$lg_grp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$rsn_cd, Chk01_RsltR.$rsn_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(XfrActChk_HdrDtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno1, Chk01_RsltR.$alloc_sno1);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno2, Chk01_RsltR.$alloc_sno2);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno3, Chk01_RsltR.$alloc_sno3);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno4, Chk01_RsltR.$alloc_sno4);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(XfrActChk_HdrDtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$quality_typ, Chk01_RsltR.$quality_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$gd_cd, Chk01_RsltR.$gd_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_insp_typ, Chk01_RsltR.$stk_insp_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_dlv_slip_no, Chk01_RsltR.$base_dlv_slip_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_prov_act_no, Chk01_RsltR.$base_prov_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_ac_dt, Chk01_RsltR.$base_ac_dt);
		}
	}

	protected Map_XfrAct_HdrDtlR_Chk01_RsltR<XfrAct_HdrDtlR,Chk01_RsltR> createMap_XfrAct_HdrDtlR_Chk01_RsltR() {
		return new Map_XfrAct_HdrDtlR_Chk01_RsltR<XfrAct_HdrDtlR, Chk01_RsltR>();
	}

	public class Map_XfrAct_HdrDtlR_Chk01_RsltR<D extends XfrAct_HdrDtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_HdrDtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_dt, "act_dt");
			addColumnPathMap(XfrAct_HdrDtlR.$ac_dt, "ac_dt");
			addColumnPathMap(XfrAct_HdrDtlR.$act_usr_cd, "usr_cd");
			addColumnPathMap(XfrAct_HdrDtlR.$act_dpt_cd, "dpt_cd");
			addColumnPathMap(XfrAct_HdrDtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(XfrAct_HdrDtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_alloc_sts_no, Chk01_RsltR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_inst_no, Chk01_RsltR.$xfr_inst_no);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_act_no, Chk01_RsltR.$xfr_act_no);
			addColumnPathMap(XfrAct_HdrDtlR.$abort_flg, Chk01_RsltR.$abort_flg);
			addColumnPathMap(XfrAct_HdrDtlR.$immd_dlv_prnt_flg, "immd_dlv_prnt_flg");
			addColumnPathMap(XfrAct_HdrDtlR.$can_ac_dt, Chk01_RsltR.$can_ac_dt);
			addColumnPathMap(XfrAct_HdrDtlR.$slo_no, Chk01_RsltR.$slo_no);

			addColumnPathMap(XfrAct_HdrDtlR.$trd_cd, Chk01_RsltR.$trd_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$lg_grp_cd, Chk01_RsltR.$lg_grp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gr_stk_arrv_bp_cd, Chk01_RsltR.$gr_stk_arrv_bp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_inst_d_no, Chk01_RsltR.$xfr_inst_d_no);
			addColumnPathMap(XfrAct_HdrDtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(XfrAct_HdrDtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(XfrAct_HdrDtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(XfrAct_HdrDtlR.$sno1, Chk01_RsltR.$alloc_sno1);
			addColumnPathMap(XfrAct_HdrDtlR.$sno2, Chk01_RsltR.$alloc_sno2);
			addColumnPathMap(XfrAct_HdrDtlR.$sno3, Chk01_RsltR.$alloc_sno3);
			addColumnPathMap(XfrAct_HdrDtlR.$sno4, Chk01_RsltR.$alloc_sno4);
			addColumnPathMap(XfrAct_HdrDtlR.$gd_cd, Chk01_RsltR.$gd_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$quality_typ, Chk01_RsltR.$quality_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$stk_insp_typ, Chk01_RsltR.$stk_insp_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$rsn_cd, Chk01_RsltR.$rsn_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$io_schd_pr_no, Chk01_RsltR.$io_schd_pr_no);
			addColumnPathMap(XfrAct_HdrDtlR.$prov_typ, Chk01_RsltR.$prov_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$ret_prov_typ, Chk01_RsltR.$ret_prov_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$prov_schd_no, Chk01_RsltR.$prov_schd_no);
			addColumnPathMap(XfrAct_HdrDtlR.$ret_prov_schd_no, Chk01_RsltR.$ret_prov_schd_no);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_rmrks, Chk01_RsltR.$trd_rmrks);
			addColumnPathMap(XfrAct_HdrDtlR.$base_dlv_slip_no, Chk01_RsltR.$base_dlv_slip_no);
			addColumnPathMap(XfrAct_HdrDtlR.$base_prov_act_no, Chk01_RsltR.$base_prov_act_no);
			addColumnPathMap(XfrAct_HdrDtlR.$base_ac_dt, Chk01_RsltR.$base_ac_dt);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_d_rmrks, Chk01_RsltR.$trd_d_rmrks);
		}
	}

	protected Map_XfrInstChk_HdrDtlR_Chk01_RsltR<XfrInstChk_HdrDtlR,Chk01_RsltR> createMap_XfrInstChk_HdrDtlR_Chk01_RsltR() {
		return new Map_XfrInstChk_HdrDtlR_Chk01_RsltR<XfrInstChk_HdrDtlR, Chk01_RsltR>();
	}

	public class Map_XfrInstChk_HdrDtlR_Chk01_RsltR<D extends XfrInstChk_HdrDtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInstChk_HdrDtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_alloc_sts_no, Chk01_RsltR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_schd_no, Chk01_RsltR.$xfr_schd_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_cd, Chk01_RsltR.$trd_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$lg_grp_cd, Chk01_RsltR.$lg_grp_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno1, Chk01_RsltR.$alloc_sno1);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno2, Chk01_RsltR.$alloc_sno2);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno3, Chk01_RsltR.$alloc_sno3);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno4, Chk01_RsltR.$alloc_sno4);
			addColumnPathMap(XfrInstChk_HdrDtlR.$ver_no, Chk01_RsltR.$ver_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gd_cd, Chk01_RsltR.$gd_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$quality_typ, Chk01_RsltR.$quality_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_schd_dt, Chk01_RsltR.$xfr_schd_dt);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_flg, Chk01_RsltR.$alloc_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$abort_flg, Chk01_RsltR.$abort_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$vld_dt_fr, Chk01_RsltR.$vld_dt_fr);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_dlv_slip_no, Chk01_RsltR.$base_dlv_slip_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_prov_act_no, Chk01_RsltR.$base_prov_act_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_ac_dt, Chk01_RsltR.$base_ac_dt);
			addColumnPathMap(XfrInstChk_HdrDtlR.$old_xfr_alloc_sts_no, Chk01_RsltR.$old_xfr_alloc_sts_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_inst_no, Chk01_RsltR.$xfr_inst_no); //指図取消時に使用
			addColumnPathMap(XfrInstChk_HdrDtlR.$err_flg, Chk01_RsltR.$err_flg);
		}
	}

	protected Map_XfrInst_HdrDtlR_Chk01_RsltR<XfrInst_HdrDtlR,Chk01_RsltR> createMap_XfrInst_HdrDtlR_Chk01_RsltR() {
		return new Map_XfrInst_HdrDtlR_Chk01_RsltR<XfrInst_HdrDtlR, Chk01_RsltR>();
	}

	public class Map_XfrInst_HdrDtlR_Chk01_RsltR<D extends XfrInst_HdrDtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInst_HdrDtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(XfrInst_HdrDtlR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(XfrInst_HdrDtlR.$xfr_inst_no, Chk01_RsltR.$xfr_inst_no); //指図取消に使用
			addColumnPathMap(XfrInst_HdrDtlR.$trd_cd, Chk01_RsltR.$trd_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$lg_grp_cd, Chk01_RsltR.$lg_grp_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$gr_stk_arrv_bp_cd, Chk01_RsltR.$gr_stk_arrv_bp_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$xfr_schd_dt, Chk01_RsltR.$xfr_schd_dt);
			addColumnPathMap(XfrInst_HdrDtlR.$xfr_inst_dt, "xfr_inst_dt");
			addColumnPathMap(XfrInst_HdrDtlR.$inst_usr_cd, "usr_cd");
			addColumnPathMap(XfrInst_HdrDtlR.$inst_dpt_cd, "dpt_cd");
			addColumnPathMap(XfrInst_HdrDtlR.$immd_inst_prnt_flg, "immd_inst_prnt_flg");
			addColumnPathMap(XfrInst_HdrDtlR.$immd_pick_prnt_flg, "immd_pick_prnt_flg");
			addColumnPathMap(XfrInst_HdrDtlR.$immd_dlv_prnt_flg, "immd_dlv_prnt_flg");
			addColumnPathMap(XfrInst_HdrDtlR.$slo_no, Chk01_RsltR.$slo_no);

			addColumnPathMap(XfrInst_HdrDtlR.$pr_sts_typ, Chk01_RsltR.$pr_sts_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(XfrInst_HdrDtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(XfrInst_HdrDtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(XfrInst_HdrDtlR.$base_dlv_slip_no, Chk01_RsltR.$base_dlv_slip_no);
			addColumnPathMap(XfrInst_HdrDtlR.$base_prov_act_no, Chk01_RsltR.$base_prov_act_no);
			addColumnPathMap(XfrInst_HdrDtlR.$base_ac_dt, Chk01_RsltR.$base_ac_dt);
			addColumnPathMap(XfrInst_HdrDtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(XfrInst_HdrDtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(XfrInst_HdrDtlR.$sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(XfrInst_HdrDtlR.$sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(XfrInst_HdrDtlR.$sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(XfrInst_HdrDtlR.$sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(XfrInst_HdrDtlR.$ver_no, Chk01_RsltR.$ver_no);
			addColumnPathMap(XfrInst_HdrDtlR.$gd_cd, Chk01_RsltR.$gd_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$quality_typ, Chk01_RsltR.$quality_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(XfrInst_HdrDtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(XfrInst_HdrDtlR.$rsn_cd, Chk01_RsltR.$rsn_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_cd);
			addColumnPathMap(XfrInst_HdrDtlR.$abort_flg, Chk01_RsltR.$abort_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$vld_dt_fr, Chk01_RsltR.$vld_dt_fr);
			addColumnPathMap(XfrInst_HdrDtlR.$vld_dt_to, Chk01_RsltR.$vld_dt_to);
			addColumnPathMap(XfrInst_HdrDtlR.$io_schd_pr_no, Chk01_RsltR.$io_schd_pr_no);
			addColumnPathMap(XfrInst_HdrDtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$alloc_sno1, Chk01_RsltR.$alloc_sno1);
			addColumnPathMap(XfrInst_HdrDtlR.$alloc_sno2, Chk01_RsltR.$alloc_sno2);
			addColumnPathMap(XfrInst_HdrDtlR.$alloc_sno3, Chk01_RsltR.$alloc_sno3);
			addColumnPathMap(XfrInst_HdrDtlR.$alloc_sno4, Chk01_RsltR.$alloc_sno4);
			addColumnPathMap(XfrInst_HdrDtlR.$alloc_flg, Chk01_RsltR.$alloc_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$ship_inst_typ, Chk01_RsltR.$ship_inst_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$xfr_alloc_sts_no, Chk01_RsltR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrInst_HdrDtlR.$xfr_schd_no, Chk01_RsltR.$xfr_schd_no);

			addColumnPathMap(XfrInst_HdrDtlR.$prov_typ, Chk01_RsltR.$prov_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$prov_basis_typ, Chk01_RsltR.$prov_basis_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$ret_prov_typ, Chk01_RsltR.$ret_prov_typ);
			addColumnPathMap(XfrInst_HdrDtlR.$ret_prov_basis_typ, Chk01_RsltR.$ret_prov_basis_typ);

			addColumnPathMap(XfrInst_HdrDtlR.$inst_bndl_flg, Chk01_RsltR.$inst_bndl_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$inst_bndl_src_flg, Chk01_RsltR.$inst_bndl_src_flg);
			addColumnPathMap(XfrInst_HdrDtlR.$inst_bndl_peg_no, Chk01_RsltR.$inst_bndl_peg_no);
			addColumnPathMap(XfrInst_HdrDtlR.$inst_bndl_to_peg_no, Chk01_RsltR.$inst_bndl_to_peg_no);
		}
	}

	protected Map_XfrPr_DtlR_Chk01_RsltR<XfrPr_DtlR,Chk01_RsltR> createMap_XfrPr_DtlR_Chk01_RsltR() {
		return new Map_XfrPr_DtlR_Chk01_RsltR<XfrPr_DtlR, Chk01_RsltR>();
	}

	public class Map_XfrPr_DtlR_Chk01_RsltR<D extends XfrPr_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrPr_DtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(XfrPr_DtlR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(XfrPr_DtlR.$xfr_alloc_sts_no, Chk01_RsltR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrPr_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(XfrPr_DtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(XfrPr_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(XfrPr_DtlR.$xfr_schd_dt, Chk01_RsltR.$xfr_schd_dt);
			addColumnPathMap(XfrPr_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(XfrPr_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(XfrPr_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(XfrPr_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);

			addColumnPathMap(XfrPr_DtlR.$pr_sts_typ, Chk01_RsltR.$pr_sts_typ);
			addColumnPathMap(XfrPr_DtlR.$xfr_schd_no, Chk01_RsltR.$xfr_schd_no);
			addColumnPathMap(XfrPr_DtlR.$trd_cd, Chk01_RsltR.$trd_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(XfrPr_DtlR.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(XfrPr_DtlR.$lg_grp_cd, Chk01_RsltR.$lg_grp_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_stk_arrv_bp_cd, Chk01_RsltR.$gr_stk_arrv_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(XfrPr_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(XfrPr_DtlR.$sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(XfrPr_DtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(XfrPr_DtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(XfrPr_DtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(XfrPr_DtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno1, Chk01_RsltR.$alloc_sno1);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno2, Chk01_RsltR.$alloc_sno2);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno3, Chk01_RsltR.$alloc_sno3);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno4, Chk01_RsltR.$alloc_sno4);
			addColumnPathMap(XfrPr_DtlR.$ver_no, Chk01_RsltR.$ver_no);
			addColumnPathMap(XfrPr_DtlR.$gd_cd, Chk01_RsltR.$gd_cd);
			addColumnPathMap(XfrPr_DtlR.$quality_typ, Chk01_RsltR.$quality_typ);
			addColumnPathMap(XfrPr_DtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
			addColumnPathMap(XfrPr_DtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$ship_inst_typ, Chk01_RsltR.$ship_inst_typ);
			addColumnPathMap(XfrPr_DtlR.$rsn_cd, Chk01_RsltR.$rsn_cd);
			addColumnPathMap(XfrPr_DtlR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_cd);
			addColumnPathMap(XfrPr_DtlR.$fix_flg, Chk01_RsltR.$fix_flg);
			addColumnPathMap(XfrPr_DtlR.$abort_flg, Chk01_RsltR.$abort_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_flg, Chk01_RsltR.$alloc_flg);
			addColumnPathMap(XfrPr_DtlR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
			addColumnPathMap(XfrPr_DtlR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
			addColumnPathMap(XfrPr_DtlR.$vld_dt_fr, Chk01_RsltR.$vld_dt_fr);
			addColumnPathMap(XfrPr_DtlR.$vld_dt_to, Chk01_RsltR.$vld_dt_to);
			addColumnPathMap(XfrPr_DtlR.$io_schd_pr_no, Chk01_RsltR.$io_schd_pr_no);
			addColumnPathMap(XfrPr_DtlR.$old_xfr_alloc_sts_no, Chk01_RsltR.$old_xfr_alloc_sts_no);
			addColumnPathMap(XfrPr_DtlR.$wms_flg, Chk01_RsltR.$wms_flg);
		}
	}

	protected Map_XfrSchdChk02_DtlR_Chk01_RsltR<XfrSchdChk02_DtlR,Chk01_RsltR> createMap_XfrSchdChk02_DtlR_Chk01_RsltR() {
		return new Map_XfrSchdChk02_DtlR_Chk01_RsltR<XfrSchdChk02_DtlR, Chk01_RsltR>();
	}

	public class Map_XfrSchdChk02_DtlR_Chk01_RsltR<D extends XfrSchdChk02_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrSchdChk02_DtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_alloc_sts_no, Chk01_RsltR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_schd_no, Chk01_RsltR.$xfr_schd_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$old_xfr_alloc_sts_no, Chk01_RsltR.$old_xfr_alloc_sts_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_cd, Chk01_RsltR.$trd_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$wg_cd, Chk01_RsltR.$wg_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$lg_grp_cd, Chk01_RsltR.$lg_grp_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gi_loc_cd, Chk01_RsltR.$gi_loc_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gi_str_ln_cd, Chk01_RsltR.$gi_str_ln_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_schd_dt, Chk01_RsltR.$xfr_schd_dt);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(XfrSchdChk02_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(XfrSchdChk02_DtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_flg, Chk01_RsltR.$alloc_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$abort_flg, Chk01_RsltR.$abort_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$gd_cd, Chk01_RsltR.$gd_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd, Chk01_RsltR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$quality_typ, Chk01_RsltR.$quality_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$vld_dt_fr, Chk01_RsltR.$vld_dt_fr);
			addColumnPathMap(XfrSchdChk02_DtlR.$vld_dt_to, Chk01_RsltR.$vld_dt_to);
			addColumnPathMap(XfrSchdChk02_DtlR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$ver_no, Chk01_RsltR.$ver_no);
		}
	}

	protected Map_Srch_TgtR_Chk01_RsltR<Srch_TgtR, Chk01_RsltR> createMap_Srch_TgtR_Chk01_RsltR() {
		return new Map_Srch_TgtR_Chk01_RsltR<Srch_TgtR, Chk01_RsltR>();
	}

	public class Map_Srch_TgtR_Chk01_RsltR<D extends Srch_TgtR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no()); //紐付けＮＯ
			dest.gi_schd_dt(src.xfr_schd_dt()); //出庫予定日
			dest.gr_schd_dt(src.xfr_schd_dt()); //入庫予定日
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.ver_no(src.ver_no()); //版ＮＯ

			dest.dlv_lg_grp_cd(null); //納品先物流グループ
			dest.alloc_grp_cd(null); //総量引当場所グループＣＤ
			dest.gi_lg_grp_cd(src.lg_grp_cd()); //出庫物流グループ
			dest.gi_loc_cd(src.gi_loc_cd()); //出庫場所ＣＤ
			dest.gi_str_ln_cd(src.gi_str_ln_cd()); //出庫棚・ラインＣＤ
			dest.gi_stk_arrv_bp_cd(src.gi_stk_arrv_bp_cd()); //出庫在庫着荷先ＣＤ
			dest.gr_loc_cd(src.gr_loc_cd()); //入庫場所ＣＤ
			dest.gr_str_ln_cd(src.gr_str_ln_cd()); //入庫棚・ラインＣＤ
			dest.quality_typ(src.quality_typ()); //良品区分
			dest.stk_id_typ(src.stk_id_typ()); //在庫識別区分
			dest.stk_bp_cd(src.stk_bp_cd()); //在庫取引先ＣＤ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			if (src.pack_flg()) {
				dest.pack_unit_cd(src.trd_unit_cd()); //荷姿単位ＣＤ
				dest.pack_unit_qty(src.trd_unit_qty()); //荷姿単位数量
			}
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.cont_qty(null); //有効成分
			dest.not_lot_fix_flg(false); //ロット指定なしＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.vld_dt_fr(src.vld_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_to(null); //有効期限ＴＯ
			dest.io_schd_typ(getIoSchdTypForMove(src.trd_ptn_typ())); //受払予定区分
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value()); //受払予定状況区分
			dest.stk_alloc_flg(false); //在庫優先引当ＦＬＧ
			if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ())) {
				dest.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.HOUSE.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
				dest.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.OUTSIDE.value());
			}
			else {
				dest.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.COMM.value());
			}
			if (src.alloc_flg()) {
				dest.except_alloc_wait_flg(true);
			}
			dest.chk_ship_flg(!src.skip_chk_ship_flg()); 
		}
	}

	protected Map_ShipRprt_Prnt01_HdrR_Chk04_RsltR<ShipRprt_Prnt01_HdrR, Chk04_RsltR> createMap_ShipRprt_Prnt01_HdrR_Chk04_RsltR() {
		return new Map_ShipRprt_Prnt01_HdrR_Chk04_RsltR<ShipRprt_Prnt01_HdrR, Chk04_RsltR>();
	}

	public class Map_ShipRprt_Prnt01_HdrR_Chk04_RsltR<D extends ShipRprt_Prnt01_HdrR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_act_no, Chk04_RsltR.$xfr_act_no);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$trn_typ, Chk04_RsltR.$trn_typ);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_prnt_flg, Chk04_RsltR.$dlv_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$peg_no, Chk04_RsltR.$peg_no);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$err_flg, Chk04_RsltR.$err_flg);
		}
	}

	protected Map_ShipRprt_Prnt02_HdrR_Chk03_RsltR<ShipRprt_Prnt02_HdrR, Chk03_RsltR> createMap_ShipRprt_Prnt02_HdrR_Chk03_RsltR() {
		return new Map_ShipRprt_Prnt02_HdrR_Chk03_RsltR<ShipRprt_Prnt02_HdrR, Chk03_RsltR>();
	}

	public class Map_ShipRprt_Prnt02_HdrR_Chk03_RsltR<D extends ShipRprt_Prnt02_HdrR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$xfr_inst_no, Chk03_RsltR.$xfr_inst_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$trn_typ, Chk03_RsltR.$trn_typ);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, Chk03_RsltR.$pick_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$inst_prnt_flg, Chk03_RsltR.$inst_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$peg_no, Chk03_RsltR.$peg_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$err_flg, Chk03_RsltR.$err_flg);
		}
	}

	protected Map_MST_XFR_INST_R_Chk03_RsltR<MST_XFR_INST_R,Chk03_RsltR> createMap_MST_XFR_INST_R_Chk03_RsltR() {
		return new Map_MST_XFR_INST_R_Chk03_RsltR<MST_XFR_INST_R, Chk03_RsltR>();
	}

	public class Map_MST_XFR_INST_R_Chk03_RsltR<D extends MST_XFR_INST_R, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_XFR_INST_R.$xfr_inst_no, Chk03_RsltR.$xfr_inst_no);
			addColumnPathMap(MST_XFR_INST_R.$pick_prnt_flg, Chk03_RsltR.$pick_prnt_flg);
			addColumnPathMap(MST_XFR_INST_R.$pick_prnt_tm, Chk03_RsltR.$pick_prnt_tm);
			addColumnPathMap(MST_XFR_INST_R.$inst_prnt_flg, Chk03_RsltR.$inst_prnt_flg);
			addColumnPathMap(MST_XFR_INST_R.$inst_prnt_tm, Chk03_RsltR.$inst_prnt_tm);
			addColumnPathMap(MST_XFR_INST_R.$dlv_prnt_flg, Chk03_RsltR.$dlv_prnt_flg);
			addColumnPathMap(MST_XFR_INST_R.$dlv_prnt_tm, Chk03_RsltR.$dlv_prnt_tm);
		}
	}

	protected Map_MST_XFR_ACT_R_Chk04_RsltR<MST_XFR_ACT_R, Chk04_RsltR> createMap_MST_XFR_ACT_R_Chk04_RsltR() {
		return new Map_MST_XFR_ACT_R_Chk04_RsltR<MST_XFR_ACT_R, Chk04_RsltR>();
	}

	public class Map_MST_XFR_ACT_R_Chk04_RsltR<D extends MST_XFR_ACT_R, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_XFR_ACT_R.$xfr_act_no, Chk04_RsltR.$xfr_act_no);
			addColumnPathMap(MST_XFR_ACT_R.$dlv_prnt_flg, Chk04_RsltR.$dlv_prnt_flg);
			addColumnPathMap(MST_XFR_ACT_R.$dlv_prnt_tm, Chk04_RsltR.$dlv_prnt_tm);
		}
	}

	//FMCB CUSTOM END
}