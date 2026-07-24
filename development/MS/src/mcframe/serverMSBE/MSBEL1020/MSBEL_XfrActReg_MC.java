package mcframe.serverMSBE.MSBEL1020;

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
import mcframe.serverMSBE.MSBEL1020.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5220.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;

import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMSBE.MSBEL1020.Query.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import java.util.Map;
import mcframe.serverMSUC.MSUCL0090.*;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrActReg_MC extends MSBEL_XfrActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 登録済みの移動指図を検索する。<br>
	 */
	public class Srch01 extends MSBEL_XfrActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = srchInstHdr();

			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchInstDtl();

			if (isSame(cnt, 0)) {
				MCRow.copyall(down0(), Srch01_HdrR.create());
			}

		}

		protected int srchInstHdr() {
			if (MSC_STK_SRCH_TGT_TYP.isXFR_SCHD_NO(up0().srch_tgt_typ())) {
				return executeQuery(down0(), MSBEL1020_MST_XFR_ALLOC_STS_S01(), up0());
			}
			else if (MSC_STK_SRCH_TGT_TYP.isXFR_INST_NO(up0().srch_tgt_typ())) {
				executeQuery(down0(), MSBEL1020_MST_XFR_INST_S01(), up0());
				return chkDac(down0());
			}
			return 0;
		}

		protected int srchInstDtl() {
			if (MSC_STK_SRCH_TGT_TYP.isXFR_SCHD_NO(up0().srch_tgt_typ())) {
				return executeQuery(down1(), MSBEL1020_MST_XFR_ALLOC_STS_S02(), up0());
			}
			else if (MSC_STK_SRCH_TGT_TYP.isXFR_INST_NO(up0().srch_tgt_typ())) {
				return executeQuery(down1(), MSBEL1020_MST_XFR_ALLOC_STS_S03(), up0());
			}
			return 0;
		}

		/**
		 * 検索処理の下り電文を編集する
		 */
		@Override
		protected void editListMain() {
			for (Srch01_DtlR dtlR : down1()) {
				// 数量の初期値
				setBaseUnitQtyForSrch(up0(), dtlR);

				// 標準有効成分
				dtlR.std_cont_qty(
						convToContFctrUnit(dtlR.base_unit_qty(), dtlR.std_cont_fctr(),
								dtlR.cont_fctr_dec_place(), dtlR.cont_fctr_rnd_typ()));

				// 実際有効成分
				dtlR.act_cont_qty(
						convToContFctrUnit(dtlR.base_unit_qty(), dtlR.act_cont_fctr(),
								dtlR.cont_fctr_dec_place(), dtlR.cont_fctr_rnd_typ()));

				// 取引パタン区分
				dtlR.trd_ptn_typ(down0().trd_ptn_typ());
			}
			if (MSC_STK_SRCH_TGT_TYP.isXFR_INST_NO(up0().srch_tgt_typ())) {
				setWmsflg(down0(), down1());
			}
		}
		/**
		 * WMS対象フラグを取得・設定する
		 */
		protected void setWmsflg(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, Srch01_DtlR> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (Srch01_DtlR dtlR : dtlL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV.value());
				r.loc_cd(dtlR.gi_loc_cd());
				r.lg_grp_cd(hdrR.lg_grp_cd());
				r.master_dt(getToday());

				map.put(peg, dtlR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						Srch01_DtlR dtlR = map.get(r.peg_no());
						dtlR.wms_flg(!isNull(r.ext_sys_cd()));
					}
				}
			}
		}

		protected void setBaseUnitQtyForSrch(Srch01_CndR up0, Srch01_DtlR dtlR) {
			// 取引数量と基準単位数量の初期値を設定
			MCNumber diffQty = null;
			if (MSC_STK_SRCH_TGT_TYP.isXFR_SCHD_NO(up0.srch_tgt_typ())) {
				diffQty = dtlR.base_unit_schd_qty().subtract(dtlR.base_unit_act_qty());
			}
			else if (MSC_STK_SRCH_TGT_TYP.isXFR_INST_NO(up0.srch_tgt_typ())) {
				diffQty = dtlR.base_unit_inst_qty().subtract(dtlR.base_unit_act_qty());
			}
			else {
				return;
			}
			dtlR.trd_unit_qty(rvrsBaseUnitConv(diffQty, dtlR.trd_unit_conv_base_qty(),
					dtlR.trd_unit_conv_qty(), dtlR.trd_unit_dec_place(),
					dtlR.trd_unit_rnd_typ()));
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
		/**
		 * 読取権限チェック
		 * @param down
		 */
		protected int chkDac(Srch01_HdrR down) {

			// DACチェック
			if (!readableLgGrpCdDac(down.lg_grp_cd())
					&& !chkDtlDac(down)) {
				down.clear();
				return 0;
			}
			return 1;
		}
		
		protected boolean chkDtlDac(Srch01_HdrR down) {
			// 移動引当状況から出荷場所を取得
			MCList<MST_XFR_INST_D_R> instDInfoL = MCList.create(MST_XFR_INST_D_R.class);
			instDInfoL.addStringColumn("gi_loc_cd");
			instDInfoL.addStringColumn("lg_grp_cd");
			MST_XFR_INST_D_R t = MST_XFR_INST_D_R.create("T");
			MCQueryApiBuilder instDInfoL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			instDInfoL_bldr.addSelect(t1.gi_loc_cd);
			instDInfoL_bldr.addSelect(t1.lg_grp_cd);
			instDInfoL_bldr.addLeftOuterJoin(t1, bracket( t1.xfr_inst_d_no.eq(t.xfr_inst_d_no)));
			instDInfoL_bldr.setWhere(t.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL1020_MST_XFR_INST_D_S01", instDInfoL, instDInfoL_bldr, down);

			MAM_LOC_R locR = getLoc(down.lg_grp_cd());
			MCList<MAM_ITM_LG_GRP_R> itmLgGrpL = getItmLgGrpLocL(instDInfoL);
			MCIndexKey idxkey = itmLgGrpL.createIndex(MAM_ITM_LG_GRP_R.$itm_cd,
					MAM_ITM_LG_GRP_R.$itm_sub1, MAM_ITM_LG_GRP_R.$itm_sub2,
					MAM_ITM_LG_GRP_R.$itm_sub3, MAM_ITM_LG_GRP_R.$lg_grp_cd);

			boolean hasReadableDac = true;
			for (MST_XFR_INST_D_R instDInfoR : instDInfoL) {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpL.getFirst(idxkey,
						instDInfoR.itm_cd(), instDInfoR.itm_sub1(), instDInfoR.itm_sub2(),
						instDInfoR.itm_sub3(), down.lg_grp_cd());

				String strLocCd = !isNull(instDInfoR.getStringNE("gi_loc_cd"))
						? instDInfoR.getStringNE("gi_loc_cd")
						: !isNull(itmLgGrpR) ? itmLgGrpR.lg_def_loc_cd()
								: !isNull(locR) ? locR.loc_cd() : null;

				hasReadableDac = readableLocCdDac(strLocCd);

				if (!hasReadableDac) {
					break;
				}
			}
			
			return hasReadableDac;
		}
		
		protected MCList<MAM_ITM_LG_GRP_R> getItmLgGrpLocL(MCList<MST_XFR_INST_D_R> dtlL) {
			MCList<MAM_ITM_LG_GRP_R> dbc = MCList.create(MAM_ITM_LG_GRP_R.class);
			MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addSelect(t.itm_sub1);
			dbc_bldr.addSelect(t.itm_sub2);
			dbc_bldr.addSelect(t.itm_sub3);
			dbc_bldr.addSelect(t.lg_grp_cd);
			dbc_bldr.addSelect(t.lg_def_loc_cd);
			dbSelectKey("MSBEL1020_MAM_ITM_LG_GRP_S01", dbc, dbc_bldr, dtlL);
			
			return dbc;
		}
		protected MAM_LOC_R getLoc(String lgGrpCd) {
			MAM_LOC_R dbc = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setSelect(dbc.loc_cd);
			dbc_bldr.setWhere(dbc.lg_grp_cd.eq(bind("1")), lgGrpCd);
			dbc_bldr.addWhereWithAnd(dbc.lg_def_flg.eq(value(true)));
			dbSelect("MSBEL1020_MAM_LOC_S01", dbc, dbc_bldr);
			
			return dbc;
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 登録済みの移動実績を検索する。<br>
	 */
	public class Srch02 extends MSBEL_XfrActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = srchInstHdr();

			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchActDtl();

			if (isSame(cnt, 0)) {
				MCRow.copyall(down0(), Srch01_HdrR.create());
			}
		}

		protected int srchInstHdr() {
			executeQuery(down0(), MSBEL1020_MST_XFR_ACT_S01(), up0());
			return chkDac(down0());
		}

		protected int srchActDtl() {
			return executeQuery(down1(), MSBEL1020_MST_XFR_ACT_D_S01(), up0());
		}

		/**
		 * 検索処理の下り電文を編集する
		 */
		@Override
		protected void editListMain() {
			for (Srch01_DtlR dtlR : down1()) {
				// 数量の初期値
				setBaseUnitQtyForSrch(up0(), dtlR);

				// 標準有効成分
				dtlR.std_cont_qty(
						convToContFctrUnit(dtlR.base_unit_qty(), dtlR.std_cont_fctr(),
								dtlR.cont_fctr_dec_place(), dtlR.cont_fctr_rnd_typ()));

				// 実際有効成分
				dtlR.act_cont_qty(
						convToContFctrUnit(dtlR.base_unit_qty(), dtlR.act_cont_fctr(),
								dtlR.cont_fctr_dec_place(), dtlR.cont_fctr_rnd_typ()));

				// 取引パタン区分
				dtlR.trd_ptn_typ(down0().trd_ptn_typ());

				// 進捗状況区分 (計画外のみ)
				if (isSame(dtlR.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value())) {
					dtlR.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
				}

				// 計画外のみ
				if (isSame(dtlR.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value())) {
					if (isNotSameSppl(dtlR, down0())) {
						// 支給区分、支給計上区分
						if (!isNull(down0().sppl_cd()) && isNull(dtlR.prov_typ())) {
							dtlR.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
							dtlR.prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
						}
						// 支給区分(返品)、支給計上区分(返品)
						if (!isNull(dtlR.gi_sppl_cd()) && isNull(dtlR.ret_prov_typ())) {
							dtlR.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
							dtlR.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
						}
					}
				}
			}
			down0().dlv_prnt_flg(MCBooleanUtil.dbStringToBoolean((String)down1().max("slip_prnt_flg")));
		}

		protected boolean isNotSameSppl(Srch01_DtlR gi_locR, Srch01_HdrR  gr_locR) {
			if(!isNull(gi_locR.gi_sppl_cd()) && !isSame(gi_locR.gi_sppl_cd(), gr_locR.sppl_cd())) {
				return true;
			}
			return false;
		}

		protected void setBaseUnitQtyForSrch(Srch01_CndR up0, Srch01_DtlR dtlR) {
			if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.base_unit_qty(dtlR.trd_unit_qty());
			}
			else {
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
		/**
		 * 読取権限チェック
		 * @param down
		 */
		protected int chkDac(Srch01_HdrR down) {
			// 移動実績明細を取得
			MCList<MST_XFR_ACT_D_R> actDInfoL = MCList.create(MST_XFR_ACT_D_R.class);
			MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder actDInfoL_bldr = MCQueryApiBuilder.create(t);
			actDInfoL_bldr.setSelect(t.xfr_act_no);
			actDInfoL_bldr.addSelect(t.gi_loc_cd);
			actDInfoL_bldr.setWhere(t.xfr_act_no.eq(bind("xfr_act_no")));
			dbSelect("MSBEL1020_MST_XFR_ACT_D_S01", actDInfoL, actDInfoL_bldr, down);

			// DACチェック
			if (!readableLgGrpCdDac(down.lg_grp_cd())
					&& !actDInfoL.subList( r -> !readableLocCdDac(r.gi_loc_cd())).isEmpty()) {
				down.clear();
				return 0;
			}
			return 1;
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 移動実績を登録する前に、チェックを実行します。<br>
	 */
	public class Chk01 extends MSBEL_XfrActReg_MC_A.Chk01 {

		protected MCList<MST_XFR_SCHD_R> _schdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MST_XFR_INST_R _instR = MST_XFR_INST_R.create("T");
		protected MCList<MST_XFR_ALLOC_STS_R> _allocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MCIndexKey _schdIdx;
		protected MCIndexKey _allocIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callXfrActServiceChk01();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk01_DtlR> notErrList_Dtl = getChkList(up1());
			
			// 移動引当状況
			MCList<Chk01_DtlR> chkTgt = notErrList_Dtl.subList(r -> !isNull(r.xfr_alloc_sts_no())
					&& !isSame(r.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value()));

			// 移動指図引継ぎ
			if (!isNull(up0().xfr_inst_no())
					&& !isSame(up0().xfr_inst_no(), MAC_STR.NULL_VAL.value())) {
				// 移動指図と移動引当状況をロック
				lockXfrInst(up0());
				lockXfrAlloc(chkTgt);
			}
			// 移動・移送予定引継ぎ
			else if (chkTgt.size() > 0) {
				// 移動・移送予定、移動引当状況をロック
				lockXfrSchd(chkTgt);
				lockXfrAlloc(chkTgt);
			}

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntr(chkTgt));
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			// 補完
			compBase();

			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntr(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R selectR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$alloc_sts_upd_cntr, selectR));
			}

			return msgL;
		}

		/**
		 * 移動・移送予定のロック
		 */
		protected void lockXfrSchd(MCList<Chk01_DtlR> notErrL) {
			MCList<Chk01_DtlR> bindL = notErrL.groupBy(Chk01_DtlR.$xfr_alloc_sts_no);
			bindL.sort(Chk01_DtlR.$xfr_alloc_sts_no);
			MST_XFR_SCHD_R schdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			schdL_bldr.addInnerJoin(t1, bracket( t1.xfr_schd_no.eq(schdL_t.xfr_schd_no)));
			schdL_bldr.setOrderByAsc(schdL_t.xfr_schd_no);
			schdL_bldr.setWhere(t1.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
			schdL_bldr.setLockTable(schdL_t.xfr_schd_no);
			dbSelectForUpdateNoWait("MSBEL1020_MST_XFR_SCHD_S01", _schdL, schdL_bldr, bindL);
			_schdIdx = _schdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
		}

		/**
		 * 移動引当状況のロック
		 */
		protected void lockXfrAlloc(MCList<Chk01_DtlR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			
			MCList<Chk01_DtlR> bindXAL = notErrL.groupBy(Chk01_DtlR.$xfr_alloc_sts_no);
			bindXAL.sort(Chk01_DtlR.$xfr_alloc_sts_no);

			MST_XFR_ALLOC_STS_R allocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(allocL_t);
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			MST_PROV_SCHD_R t2 = MST_PROV_SCHD_R.create("T2");
			MST_PROV_SCHD_R t3 = MST_PROV_SCHD_R.create("T3");
			allocL_bldr.addSelect(t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t2.prov_schd_no, t3.prov_schd_no.as("ret_prov_schd_no"));
			allocL_bldr.addLeftOuterJoin(t1,
					bracket(t1.xfr_inst_d_no.eq(allocL_t.xfr_inst_d_no)));
			allocL_bldr.addLeftOuterJoin(t2, bracket(allocL_t.xfr_alloc_sts_no.eq(t2.prov_src_schd_no1)
					.and(t2.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
					.and(t2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))));
			allocL_bldr.addLeftOuterJoin(t3, bracket(allocL_t.xfr_alloc_sts_no.eq(t3.prov_src_schd_no1)
					.and(t3.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
					.and(t3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))));
			allocL_bldr.setOrderByAsc(allocL_t.xfr_alloc_sts_no);
			allocL_bldr.setLockTable(allocL_t.xfr_alloc_sts_no);
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ALLOC_STS_S01", _allocL, allocL_bldr, bindXAL);
			
			_allocIdx = _allocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
		}

		/**
		 * 移動指図のロック、検索
		 */
		protected void lockXfrInst(Chk01_HdrR up0) {
			if (up0.isEmpty()) {
				return;
			}

			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_INST_S01", _instR,
					MCQueryApiBuilder.create(_instR), up0);
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきトランザクションデータからの補完
		 */
		protected void compBase() {
			up1().setStringNE(Chk01_DtlR.$gr_loc_cd, up0().gr_loc_cd());

			// 移動引当状況のデータ未取得＝計画外の実績登録＝補完不要
			// 移動指図から登録した場合でも移動引当状況は作成されるので、移動引当状況の有無で引継データかを判断する
			if (isNull(_allocL)) {
				return;
			}

			// ヘッダの補完
			if (!isNullOrNullVal(up0().xfr_inst_no())) {
				// 指図が存在する場合、画面では入力不可。そのため、念のためここで指図より補完し直す。
				up0().trd_cd(_instR.trd_cd());
				up0().gr_loc_cd(_instR.gr_loc_cd());
			}
			else {
				MST_XFR_SCHD_R schdR = _schdL.getFirst(_schdIdx, _allocL.get(0).xfr_schd_no()); 
				up0().trd_cd(schdR.trd_cd());
				up0().gr_loc_cd(schdR.gr_loc_cd());
			}
			
			for (Chk01_DtlR dtlR : up1()) {
				compBaseFromTran(dtlR);
			}
			// 負担部門の組織変更対応
			up1().addDateColumn("ac_dt", up0().ac_dt());
			setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, "ac_dt");
		}

		/**
		 * リストロジックによる補完前にトランザクションから補完する項目
		 * @param dtlR
		 */
		protected void compBaseFromTran(Chk01_DtlR dtlR) {
			MST_XFR_ALLOC_STS_R allocR = _allocL.getFirst(_allocIdx, dtlR.xfr_alloc_sts_no());
			if (isNull(allocR)) {
				return;
			}
			if (isNullOrNullVal(dtlR.xfr_inst_d_no())) {
				// 移動・移送予定引継ぎは移動・移送予定の品目を補完
				MST_XFR_SCHD_R schdR = _schdL.getFirst(_schdIdx, allocR.xfr_schd_no()); 
				dtlR.itm_cd(schdR.itm_cd());
				dtlR.itm_sub1(schdR.itm_sub1());
				dtlR.itm_sub2(schdR.itm_sub2());
				dtlR.itm_sub3(schdR.itm_sub3());
			}
			else {
				// 移動指図引継ぎは指図明細の品目を補完
				dtlR.itm_cd(allocR.getString("itm_cd"));
				dtlR.itm_sub1(allocR.getString("itm_sub1"));
				dtlR.itm_sub2(allocR.getString("itm_sub2"));
				dtlR.itm_sub3(allocR.getString("itm_sub3"));
			}
			dtlR.trd_cd(allocR.trd_cd());
			dtlR.gr_loc_cd(allocR.gr_loc_cd());
			dtlR.rsn_cd(allocR.rsn_cd());
			dtlR.prov_typ(allocR.prov_typ());
			dtlR.ret_prov_typ(allocR.ret_prov_typ());
			dtlR.prov_schd_no(allocR.getString("prov_schd_no"));
			dtlR.ret_prov_schd_no(allocR.getString("ret_prov_schd_no"));
			dtlR.io_schd_pr_no(allocR.io_schd_pr_no());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (up0().err_flg()) {
				up1().setValue(Chk01_DtlR.$err_flg, true);
			}
			msgL.addAll(checkSub());

			if (!msgL.isEmpty() || hasErrFlgOn(up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());

			compSubFromTran(up0(), notErrL);

			if (!up0().err_flg()) {
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
			}


			MCMessageList msgDacLgL = checkWritableLgGrpCdDac(up0(), Chk01_HdrR.$lg_grp_cd);
			if (!msgDacLgL.isEmpty()) {
				MCMessageList msgDacGiL = new MCMessageList();
				for (Chk01_DtlR r : up1()) {
					msgDacGiL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$gi_loc_cd));
				}

				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}
			msgL.addAll(checkBpStop(up0()));
			msgL.addAll(checkItmStop(up0(), up1()));
			msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
			msgL.addAll(checkAndCompEqScreen(up0(), notErrL));			

			return msgL;
		}

		/**
		 * リストロジックによる補完後のトランザクションからの補完
		 * (予定ありの場合に変更不可の項目)
		 */
		protected void compSubFromTran(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
			if (isNull(_allocL)) {
				return;
			}
			for(Chk01_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R allocR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
				if (isNull(allocR)) {
					continue;
				}
				// リストロジックで補完されてしまう値をトランの値で再度上書きする
				r.trd_ptn_typ(allocR.trd_ptn_typ());
				r.gr_wg_cd(hdrR.wg_cd());
				r.gr_lg_grp_cd(allocR.lg_grp_cd());
				r.prov_typ(allocR.prov_typ());
				r.ret_prov_typ(allocR.ret_prov_typ());
				if(!isNull(r.gi_sppl_cd())) {
					// 支給返品または直送支給の場合
					r.gi_stk_arrv_bp_cd(allocR.gi_stk_arrv_bp_cd());
					r.stk_id_typ(allocR.stk_id_typ());
				}
			}
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する

			// ヘッダ補完は不要
			// サービスに渡す際、ヘッダと明細を合体させて List にするため

			for (Chk01_DtlR dtlR : up1()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlR.gr_loc_cd(up0().gr_loc_cd());
			}

			setPegNo(up0());
			setPegNo(up1());
			setDispSeq(up1());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			ListLogicBind instDptBind = getListLogicBind(up0(), Chk01_HdrR.$act_dpt_cd);
			instDptBind.putBind(DptCols.$i_dt, Chk01_HdrR.$ac_dt);
			
			ListLogicBind BdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			BdDptBind.putBind(DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}


		protected void callXfrActServiceChk01() {
			MSBEL_XfrActService.XfrAct_Chk01 ope = MSBEL_XfrActService.crtXfrAct_Chk01();

			addAll(ope.up0(), up1(), createMap_XfrActChk_HdrDtlR_Chk01_DtlR());
			setHdrData(ope.up0(), up0());
			ope.exec();

			copyErrFlg(up1(), ope.down0());

			// ヘッダ部分を取得コピーする
			copy(up0(), ope.down0().get(0), createMap_Chk01_HdrR_XfrActChk_HdrDtlR());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 移動実績を訂正する前に、チェックを実行します。<br>
	 */
	public class Chk02 extends MSBEL_XfrActReg_MC_A.Chk02 {

		protected MCList<MST_XFR_SCHD_R> _schdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MST_XFR_INST_R _instR = MST_XFR_INST_R.create("T");
		protected MCList<MST_XFR_ALLOC_STS_R> _allocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MST_XFR_ACT_R _actR = MST_XFR_ACT_R.create("T");
		protected MCList<MST_XFR_ACT_D_R> _actDL = MCList.create(MST_XFR_ACT_D_R.class);
		protected MCIndexKey _schdIdx;
		protected MCIndexKey _allocIdx;
		protected MCIndexKey _actDIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callXfrActServiceChk01();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk01_DtlR> notErrList_Dtl = getChkList(up1());

			// 移動引当状況
			MCList<Chk01_DtlR> chkTgt = notErrList_Dtl.subList(r -> !isNull(r.xfr_alloc_sts_no())
					&& !isSame(r.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value()));

			// 移動指図引継ぎ
			if (!isNull(up0().xfr_inst_no())
					&& !isSame(up0().xfr_inst_no(), MAC_STR.NULL_VAL.value())) {
				// 移動指図と移動引当状況をロック
				lockXfrInst(up0());
				lockXfrAlloc(chkTgt);
			}
			// 移動・移送予定引継ぎ
			else if (chkTgt.size() > 0) {
				// 移動・移送予定、移動引当状況をロック
				lockXfrSchd(chkTgt);
				lockXfrAlloc(chkTgt);
			}

			// 移動実績
			if (!isNull(up0().xfr_act_no())) {
				lockXfrActHdr(up0());
				lockXfrActDtl(notErrList_Dtl);
			}
			
			// 更新カウンタチェック
			msgL.addAll(chkUpdCntr(chkTgt));
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			// 補完
			compBase();

			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntr(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R selectR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$alloc_sts_upd_cntr, selectR));
			}

			if (msgL.isEmpty() && !isNull(up0().xfr_act_no())) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$act_upd_cntr, _actR));
			}

			return msgL;
		}

		/**
		 * 移動・移送予定のロック
		 */
		protected void lockXfrSchd(MCList<Chk01_DtlR> notErrL) {
			MCList<Chk01_DtlR> bindL = notErrL.groupBy(Chk01_DtlR.$xfr_alloc_sts_no);
			bindL.sort(Chk01_DtlR.$xfr_alloc_sts_no);
			MST_XFR_SCHD_R schdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			schdL_bldr.addInnerJoin(t1, bracket( t1.xfr_schd_no.eq(schdL_t.xfr_schd_no)));
			schdL_bldr.setOrderByAsc(schdL_t.xfr_schd_no);
			schdL_bldr.setWhere(t1.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
			schdL_bldr.setLockTable(schdL_t.xfr_schd_no);
			dbSelectForUpdateNoWait("MSBEL1020_MST_XFR_SCHD_S02", _schdL, schdL_bldr, bindL);
			_schdIdx = _schdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
		}

		/**
		 * 移動引当状況のロック
		 */
		protected void lockXfrAlloc(MCList<Chk01_DtlR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			
			MCList<Chk01_DtlR> bindXAL = notErrL.groupBy(Chk01_DtlR.$xfr_alloc_sts_no);
			bindXAL.sort(Chk01_DtlR.$xfr_alloc_sts_no);

			MST_XFR_ALLOC_STS_R allocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(allocL_t);
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			MST_PROV_SCHD_R t2 = MST_PROV_SCHD_R.create("T2");
			MST_PROV_SCHD_R t3 = MST_PROV_SCHD_R.create("T3");
			allocL_bldr.addSelect(t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
					t2.prov_schd_no, t3.prov_schd_no.as("ret_prov_schd_no"));
			allocL_bldr.addLeftOuterJoin(t1,
					bracket(t1.xfr_inst_d_no.eq(allocL_t.xfr_inst_d_no)));
			allocL_bldr.addLeftOuterJoin(t2, bracket(allocL_t.xfr_alloc_sts_no.eq(t2.prov_src_schd_no1)
					.and(t2.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
					.and(t2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))));
			allocL_bldr.addLeftOuterJoin(t3, bracket(allocL_t.xfr_alloc_sts_no.eq(t3.prov_src_schd_no1)
					.and(t3.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
					.and(t3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))));
			allocL_bldr.setOrderByAsc(allocL_t.xfr_alloc_sts_no);
			allocL_bldr.setLockTable(allocL_t.xfr_alloc_sts_no);
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ALLOC_STS_S02", _allocL, allocL_bldr, bindXAL);
			
			_allocIdx = _allocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
		}

		/**
		 * 移動指図のロック、検索
		 */
		protected void lockXfrInst(Chk01_HdrR up0) {
			if (up0.isEmpty()) {
				return;
			}

			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_INST_S02", _instR,
					MCQueryApiBuilder.create(_instR), up0);
		}

		/**
		 * 移動実績(ヘッダ)のロック
		 */
		protected void lockXfrActHdr(Chk01_HdrR up0) {
			if (up0.isEmpty()) {
				return;
			}
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ACT_S01", _actR,
					MCQueryApiBuilder.create(_actR), up0);
		}

		/**
		 * 移動実績(明細)のロック、検索
		 */
		protected void lockXfrActDtl(MCList<Chk01_DtlR> notErrL) {
			MCList<Chk01_DtlR> bindXAL = notErrL.groupBy(Chk01_DtlR.$xfr_act_d_no);
			bindXAL.sort(Chk01_DtlR.$xfr_act_d_no);
			MST_XFR_ACT_D_R actDL_t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(actDL_t);
			actDL_bldr.setOrderByAsc(actDL_t.xfr_act_d_no);
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ACT_D_S02", _actDL, actDL_bldr, bindXAL);
			_actDIdx = _actDL.createIndex(MST_XFR_ACT_D_R.$xfr_act_d_no);
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきトランザクションデータからの補完
		 */
		protected void compBase() {

			if (!isNull(_allocL)) {
				// ヘッダの補完
				if (!isNullOrNullVal(up0().xfr_inst_no())) {
					up0().trd_cd(_instR.trd_cd());
					up0().gr_loc_cd(_instR.gr_loc_cd());
				}
				else {
					MST_XFR_SCHD_R schdR = _schdL.getFirst(_schdIdx, _allocL.get(0).xfr_schd_no()); 
					up0().trd_cd(schdR.trd_cd());
					up0().gr_loc_cd(schdR.gr_loc_cd());
				}
			}
			else {
				up0().trd_cd(_actR.trd_cd());
				up0().gr_loc_cd(_actR.gr_loc_cd());
			}

			// 明細の補完
			for (Chk01_DtlR dtlR : up1()) {
				compBaseFromTran(dtlR);
			}
			// 負担部門の組織変更対応
			up1().addDateColumn("ac_dt", up0().ac_dt());
			setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, "ac_dt");
		}

		/**
		 * リストロジックによる補完前にトランザクションから補完する項目
		 * @param dtlR
		 */
		protected void compBaseFromTran(Chk01_DtlR dtlR) {

			// 明細にコピー（予定ありの場合は、後続で予定の値をで上書きする）
			dtlR.trd_cd(_actR.trd_cd());
			dtlR.gr_loc_cd(_actR.gr_loc_cd());

			MST_XFR_ACT_D_R actDR = _actDL.getFirst(_actDIdx, dtlR.xfr_act_d_no());
			if (!isNull(actDR)) {
				dtlR.xfr_alloc_sts_no(actDR.xfr_alloc_sts_no());
				dtlR.xfr_inst_d_no(actDR.xfr_inst_d_no());
			}
			if (isNull(_allocL)) {
				return;
			}

			MST_XFR_ALLOC_STS_R allocR = _allocL.getFirst(_allocIdx, dtlR.xfr_alloc_sts_no());
			if (isNull(allocR)) {
				return;
			}
			if (isNullOrNullVal(dtlR.xfr_inst_d_no())) {
				// 移動・移送予定引継ぎは移動・移送予定の品目を補完
				MST_XFR_SCHD_R schdR = _schdL.getFirst(_schdIdx, allocR.xfr_schd_no()); 
				dtlR.itm_cd(schdR.itm_cd());
				dtlR.itm_sub1(schdR.itm_sub1());
				dtlR.itm_sub2(schdR.itm_sub2());
				dtlR.itm_sub3(schdR.itm_sub3());
			}
			else {
				// 移動指図引継ぎは指図明細の品目を補完
				dtlR.itm_cd(allocR.getString("itm_cd"));
				dtlR.itm_sub1(allocR.getString("itm_sub1"));
				dtlR.itm_sub2(allocR.getString("itm_sub2"));
				dtlR.itm_sub3(allocR.getString("itm_sub3"));
			}
			dtlR.trd_cd(allocR.trd_cd());
			dtlR.gr_loc_cd(allocR.gr_loc_cd());
			dtlR.rsn_cd(allocR.rsn_cd());
			dtlR.prov_typ(allocR.prov_typ());
			dtlR.ret_prov_typ(allocR.ret_prov_typ());
			dtlR.prov_schd_no(allocR.getString("prov_schd_no"));
			dtlR.ret_prov_schd_no(allocR.getString("ret_prov_schd_no"));
			dtlR.io_schd_pr_no(allocR.io_schd_pr_no());
			if (dtlR.isStatusDelete()) {
				dtlR.base_unit_qty(actDR.base_unit_qty());
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (up0().err_flg()) {
				up1().setValue(Chk01_DtlR.$err_flg, true);
			}
			msgL.addAll(checkSub());

			if (!msgL.isEmpty() || hasErrFlgOn(up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up1(), MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
			MCList<Chk01_DtlR> notErrDelL = getChkList(up1(), MCRow.DELETE);

			compSubFromTran(up0(), notErrL);

			if (!up0().err_flg()) {
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
			}


			MCMessageList msgDacLgL = checkWritableLgGrpCdDac(up0(), Chk01_HdrR.$lg_grp_cd);

			if (!msgDacLgL.isEmpty()) {
				MCMessageList msgDacGiL = new MCMessageList();
				boolean isBfUpd = false;
				boolean isAfUpd = false;
				for (Chk01_DtlR r : up1()) {
					MST_XFR_ACT_D_R actDR = _actDL.getFirst(_actDIdx, r.xfr_act_d_no());

					isBfUpd = false;
					isAfUpd = false;
					if (r.isStatusCreate()) {
						isAfUpd = true;
					}
					else if (r.isStatusDelete()) {
						isBfUpd = true;
					}
					else {
						if (!isSame(r.gi_loc_cd(), actDR.gi_loc_cd())) {
							isBfUpd = true;
						}
						isAfUpd = true;
					}

					if (isBfUpd) {
						msgDacGiL.addAll(checkWritableLocCdDac(actDR, MST_XFR_ACT_D_R.$gi_loc_cd));
					}
					if (isAfUpd) {
						msgDacGiL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$gi_loc_cd));
					}
				}
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}
			msgL.addAll(checkBpStop(up0()));
			msgL.addAll(checkItmStop(up0(), up1()));
			msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
			msgL.addAll(checkAndCompEqScreen(up0(), notErrL));
			msgL.addAll(checkAbortFlg(notErrDelL));

			return msgL;
		}

		/**
		 * 削除行について、打切ＦＬＧがオンかどうかをチェックします。
		 * @param dtlL
		 * @return
		 */
		protected MCMessageList checkAbortFlg(MCList<Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			// 打切済みチェック
			for (Chk01_DtlR r : dtlL) {
				if (!isNullOrNullVal(r.xfr_alloc_sts_no())) {	// 計画外の実績は対象外
					MST_XFR_ALLOC_STS_R selectR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
					if (!isNull(selectR) && selectR.abort_flg()) {
						msgL.add(new MCMessage(r, null, MSBEL0025, toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			up0().hdr_dtl_peg(MCNumber.ONE);

			for (Chk01_DtlR dtlR : up1()) {
				dtlR.hdr_dtl_peg(up0().hdr_dtl_peg());
				dtlR.xfr_act_no(up0().xfr_act_no());

				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (dtlR.isStatusModify()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (dtlR.isStatusNone()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}

			setPegNo(up0());
			setPegNo(up1());
			setDispSeq(up1());
		}

		/**
		 * リストロジックによる補完後のトランザクションからの補完
		 * (予定ありの場合に変更不可の項目)
		 */
		protected void compSubFromTran(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
			if (isNull(_allocL)) {
				return;
			}
			for(Chk01_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R allocR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
				if (isNull(allocR)) {
					continue;
				}
				// リストロジックで補完されてしまう値をトランの値で再度上書きする
				r.trd_ptn_typ(allocR.trd_ptn_typ());
				r.gr_wg_cd(hdrR.wg_cd());
				r.gr_lg_grp_cd(allocR.lg_grp_cd());
				r.prov_typ(allocR.prov_typ());
				r.ret_prov_typ(allocR.ret_prov_typ());
				if(!isNull(r.gi_sppl_cd())) {
					// 支給返品または直送支給の場合
					r.gi_stk_arrv_bp_cd(allocR.gi_stk_arrv_bp_cd());
					r.stk_id_typ(allocR.stk_id_typ());
				}
			}
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			ListLogicBind actDptBind = getListLogicBind(up0(), Chk01_HdrR.$act_dpt_cd);
			actDptBind.putBind(DptCols.$i_dt, Chk01_HdrR.$ac_dt);
			
			ListLogicBind BdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			BdDptBind.putBind(DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}


		protected void callXfrActServiceChk01() {
			MSBEL_XfrActService.XfrAct_Chk01 ope = MSBEL_XfrActService.crtXfrAct_Chk01();

			addAll(ope.up0(), up1(), createMap_XfrActChk_HdrDtlR_Chk01_DtlR());
			setHdrData(ope.up0(), up0());
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));

			// ヘッダ部分を取得コピーする
			copy(up0(), ope.down0().get(0), createMap_Chk01_HdrR_XfrActChk_HdrDtlR());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 移動実績を取消す前に、チェックを実行します。<br>
	 */
	public class Chk03 extends MSBEL_XfrActReg_MC_A.Chk03 {

		protected MCList<MST_XFR_SCHD_R> _schdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MCList<MST_XFR_ALLOC_STS_R> _allocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MST_XFR_ACT_R _actR = MST_XFR_ACT_R.create("T");
		protected MCList<MST_XFR_ACT_D_R> _actDL = MCList.create(MST_XFR_ACT_D_R.class);
		protected MCIndexKey _allocIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callXfrActServiceChk02();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk03_DtlR> notErrList_Dtl = getChkList(up1());
			
			// 移動引当状況
			MCList<Chk03_DtlR> chkTgt = notErrList_Dtl.subList(r -> !isNull(r.xfr_alloc_sts_no())
					&& !isSame(r.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value()));

			// 移動指図引継ぎ
			if (!isNull(up0().xfr_inst_no())
					&& !isSame(up0().xfr_inst_no(), MAC_STR.NULL_VAL.value())) {
				// 移動指図と移動引当状況をロック
				lockXfrInst(up0());
				lockXfrAlloc(chkTgt);
			}
			// 移動・移送予定引継ぎ
			else if (chkTgt.size() > 0) {
				// 移動・移送予定、移動引当状況をロック
				lockXfrSchd(chkTgt);
				lockXfrAlloc(chkTgt);
			}

			// 移動実績
			if (msgL.isEmpty() && !isNull(up0().xfr_act_no())) {
				lockXfrActHdr(up0());
				lockXfrActDtl(notErrList_Dtl);
			}

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntr(chkTgt));
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwCanErr();
			}

			compBase();
			
			return msgL;
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntr(MCList<Chk03_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk03_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R selectR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_DtlR.$alloc_sts_upd_cntr, selectR));
			}

			if (msgL.isEmpty() && !isNull(up0().xfr_act_no())) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk03_HdrR.$act_upd_cntr, _actR));
			}

			return msgL;
		}

		/**
		 * 移動・移送予定のロック
		 */
		protected void lockXfrSchd(MCList<Chk03_DtlR> notErrL) {
			MCList<Chk03_DtlR> bindL = notErrL.groupBy(Chk03_DtlR.$xfr_alloc_sts_no);
			bindL.sort(Chk03_DtlR.$xfr_alloc_sts_no);
			MST_XFR_SCHD_R schdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			schdL_bldr.addInnerJoin(t1, bracket( t1.xfr_schd_no.eq(schdL_t.xfr_schd_no)));
			schdL_bldr.setOrderByAsc(schdL_t.xfr_schd_no);
			schdL_bldr.setWhere(t1.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
			schdL_bldr.setLockTable(schdL_t.xfr_schd_no);
			dbSelectForUpdateNoWait("MSBEL1020_MST_XFR_SCHD_S03", _schdL, schdL_bldr, bindL);
		}

		/**
		 * 移動引当状況のロック
		 */
		protected void lockXfrAlloc(MCList<Chk03_DtlR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			
			MCList<Chk03_DtlR> bindXAL = notErrL.groupBy(Chk03_DtlR.$xfr_alloc_sts_no);
			bindXAL.sort(Chk03_DtlR.$xfr_alloc_sts_no);
			
			MST_XFR_ALLOC_STS_R allocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(allocL_t);
			allocL_bldr.setSelect(allocL_t.xfr_alloc_sts_no, allocL_t.abort_flg, allocL_t.upd_cntr);
			allocL_bldr.setOrderByAsc(allocL_t.xfr_alloc_sts_no);
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ALLOC_STS_S03", _allocL, allocL_bldr, bindXAL);
			
			_allocIdx = _allocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
		}

		/**
		 * 移動指図のロック
		 */
		protected void lockXfrInst(Chk03_HdrR up0) {
			if (up0.isEmpty()) {
				return;
			}
			
			MST_XFR_INST_R xfrInstR = MST_XFR_INST_R.create();
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_INST_S03", xfrInstR,
					MCQueryApiBuilder.create(MST_XFR_INST_R.create("T")), up0);
		}

		/**
		 * 移動実績(ヘッダ)のロック
		 */
		protected void lockXfrActHdr(Chk03_HdrR up0) {
			if (up0.isEmpty()) {
				return;
			}

			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ACT_S02", _actR,
					MCQueryApiBuilder.create(_actR), up0);
		}

		/**
		 * 移動実績(明細)のロック、検索
		 */
		protected void lockXfrActDtl(MCList<Chk03_DtlR> notErrL) {
			MCList<Chk03_DtlR> bindXAL = notErrL.groupBy(Chk03_DtlR.$xfr_act_d_no);
			bindXAL.sort(Chk03_DtlR.$xfr_act_d_no);
			MST_XFR_ACT_D_R actDL_t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(actDL_t);
			actDL_bldr.setOrderByAsc(actDL_t.xfr_act_d_no);
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ACT_D_S03", _actDL, actDL_bldr, bindXAL);
		}

		protected void compBase() {
			// ヘッダの補完

			// 明細の補完

		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();


			MCMessageList msgDacLgL = checkWritableLgGrpCdDac(_actR, MST_XFR_ACT_R.$lg_grp_cd);

			if (!msgDacLgL.isEmpty()) {
				MCMessageList msgDacGiL = new MCMessageList();
				for (MST_XFR_ACT_D_R r : _actDL) {
					msgDacGiL.addAll(checkWritableLocCdDac(r, MST_XFR_ACT_D_R.$gi_loc_cd));
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
		 * 削除行について、打切ＦＬＧがオンかどうかをチェックします。
		 * @param dtlL
		 * @return
		 */
		protected MCMessageList checkAbortFlg() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk03_DtlR> notErrList_Dtl = getChkList(up1());

			// 打切済みチェック
			for (Chk03_DtlR r : notErrList_Dtl) {
				if (!isNullOrNullVal(r.xfr_alloc_sts_no())) {	// 計画外の実績は対象外
					MST_XFR_ALLOC_STS_R selectR = _allocL.getFirst(_allocIdx, r.xfr_alloc_sts_no());
					if (!isNull(selectR) && selectR.abort_flg()) {
						msgL.add(new MCMessage(r, null, MSBEL0030, toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する
			if (up0().isStatusModify()) {
				up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}

			setPegNo(up0());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

		}

		protected void callXfrActServiceChk02() {
			MSBEL_XfrActService.XfrAct_Chk02 ope = MSBEL_XfrActService.crtXfrAct_Chk02();
			XfrActChk_HdrDtlR up = XfrActChk_HdrDtlR.create();
			
			copy(up, up0(), createMap_XfrActChk_HdrDtlR_Chk03_HdrR());
			ope.up0().add(up);
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}

		protected void setDown() {
			copyall(down0(), up0());
		}
	}

	/**
	 * 画面入力相当の補完とチェック
	 * @param notErrL
	 * @return メッセージリスト
	 */
	protected MCMessageList checkAndCompEqScreen(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();
		initGiLocL(notErrL);

		for(Chk01_DtlR r : notErrL) {
			r.trd_cd(hdrR.trd_cd());
			r.trd_ptn_typ(hdrR.trd_ptn_typ());
			r.gr_loc_cd(hdrR.gr_loc_cd());
			r.gr_wg_cd(hdrR.wg_cd());
			r.gr_lg_grp_cd(hdrR.lg_grp_cd());
			r.gr_sppl_cd(hdrR.sppl_cd());
			r.gr_onr_prsppl_flg(hdrR.onr_prsppl_flg());

			msgL.addAll(checkStkUtilTrdPtnTypAndGiGrLoc(
					r,
					Chk01_DtlR.$trd_cd,
					Chk01_DtlR.$trd_ptn_typ,
					Chk01_DtlR.$gi_loc_cd,
					Chk01_DtlR.$gi_sppl_cd,
					Chk01_DtlR.$gr_loc_cd,
					Chk01_DtlR.$gr_sppl_cd));

			if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
				r.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}

			if (!r.ver_flg()) {
				r.ver_no(null);
			}

			msgL.addAll(checkDecPlace(
					r,
					r.trd_unit_dec_place().intValue(),
					Chk01_DtlR.$trd_unit_qty));

			if (isSame(r.trd_unit_cd(), r.base_unit_cd())) {
				r.base_unit_qty(r.trd_unit_qty());
			}
			else {
				r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(),
						r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.base_unit_dec_place(), r.base_unit_rnd_typ()));
			}

			if (r.cont_fctr_flg()) {
				// 実際有効成分の算出
				MCNumber actContQty = convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(), 
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.act_cont_qty(actContQty);

				// 標準有効成分の算出
				MCNumber stdContQty = convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), 
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.std_cont_qty(stdContQty);
			}

			if (isNull(r.gr_str_ln_cd())) {
				r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
			}

			if (isNull(r.gi_str_ln_cd())) {
				r.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
			}

			if(!isSame(r.gr_lg_grp_cd(), r.gi_lg_grp_cd())) {
				msgL.add(new MCMessage(r, Chk01_DtlR.$gi_loc_cd, MSBEL0060,
						r.gi_loc_cd(),
						r.gr_loc_cd(),
						toDispGUIIndex(r)));
			}

			if(!isNullOr(r.gr_str_ln_cd(), r.gi_str_ln_cd())
					&& isSame(r.gr_loc_cd(), r.gi_loc_cd())
					&& isSame(r.gr_str_ln_cd(), r.gi_str_ln_cd())) {
				msgL.add(new MCMessage(r, Chk01_DtlR.$gi_loc_cd, MSBEL0254, toDispGUIIndex(r)));
			}

			if (isNull(r.gi_sppl_cd())) {
				r.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					if (isNullOrNullVal(r.gi_stk_arrv_bp_cd())){
						r.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					}
					else if (!isSame(r.gi_stk_arrv_bp_cd(), r.gi_sppl_cd())) {
						r.gi_stk_arrv_bp_cd(r.gi_sppl_cd());
					}
				}
				else {
					r.gi_stk_arrv_bp_cd(r.gi_sppl_cd());
				}
				msgL.addAll(check(r, Chk01_DtlR.$stk_id_typ, new FXUCL_RequiredValidater()));
			}

			if (isNull(r.quality_typ())) {
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			}
			msgL.addAll(checkStkUtilQualityTyp(
					r,
					Chk01_HdrR.$trd_cd,
					Chk01_HdrR.$trd_ptn_typ,
					Chk01_DtlR.$quality_typ));

			if (isNull(r.gd_cd())) {
				r.gd_cd(getDefaultFeedStkGd().gd_cd());
				r.gd_nm(getDefaultFeedStkGd().gd_nm());
			}

			if(isNull(r.stk_insp_typ())) {
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			if(!MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())
					&& !isSame(hdrR.gr_site_cd(), r.gi_site_cd())) {
				msgL.add(new MCMessage(r, null, MSBEL0224, hdrR.gr_site_cd(), r.gi_site_cd()));
			}

			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
				r.sno1(MAC_STR.NULL_VAL.value());
				r.sno1_null_flg(false);
			}
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
				r.sno2(MAC_STR.NULL_VAL.value());
				r.sno2_null_flg(false);
			}
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
				r.sno3(MAC_STR.NULL_VAL.value());
				r.sno3_null_flg(false);
			}
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
				r.sno4(MAC_STR.NULL_VAL.value());
				r.sno4_null_flg(false);
			}

			if (isNull(r.stk_id_typ())) {
				r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			}
			msgL.addAll(checkStkUtilStkIdTyp(r,
					Chk01_DtlR.$gi_loc_cd,
					Chk01_DtlR.$gi_sppl_cd,
					Chk01_DtlR.$gr_loc_cd,
					Chk01_DtlR.$gr_sppl_cd,
					null,
					Chk01_DtlR.$stk_id_typ,
					true,
					false));

			if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				r.stk_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
				r.stk_bp_cd(r.gi_sppl_cd());
			}
			else {
				msgL.addAll(check(r, Chk01_DtlR.$stk_bp_cd, new FXUCL_RequiredValidater()));
			}

			if (r.acxfr_gi_flg()) {
				if (!MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$rsn_cd, MSBEL0304, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
				}
				else {
					msgL.addAll(check(r, Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
				}
			}
			else {
				r.bd_dpt_cd(null);
				r.bd_dpt_nm(null);
			}

			MAM_LOC_R gi_locR = _giLocL.getEx(r.gi_loc_cd());
			if(isProvIsNotSameSppl(r, gi_locR)) {
				if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
				}
				else if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						&& isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
					r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
				}
				else {
					r.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
				}
			}

			msgL.addAll(checkStkUtilProvTyp(
					r,
					Chk01_DtlR.$itm_cd,
					Chk01_DtlR.$itm_sub1,
					Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3,
					Chk01_DtlR.$gr_sppl_cd,
					Chk01_DtlR.$gr_onr_prsppl_flg,
					Chk01_DtlR.$asset_mng_typ,
					Chk01_DtlR.$prov_typ));
			if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())
					&& hdrR.immd_dlv_prnt_flg()) {
				if (isNull(r.base_ac_dt())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$base_ac_dt, MSBEL1105, toDispGUIIndex(r)));
				}
			}
		}
		return msgL;
	}

	protected boolean isProvIsNotSameSppl(Chk01_DtlR r, MAM_LOC_R gi_locR) {
		if(MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && !isNull(gi_locR.sppl_cd()) 
				&& !isSame(gi_locR.sppl_cd(), r.gr_sppl_cd())) {
			return true;
		}
		return false;
	}

	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopL;
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStopR;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocL;

	protected void initItmStopL(MCList<Chk01_DtlR> bindL) {
		// 品目禁止マスタの取得
		_itmStopL = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
				MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")),
				bindL.groupBy(Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3),
				Chk01_DtlR.$itm_cd,
				Chk01_DtlR.$itm_sub1,
				Chk01_DtlR.$itm_sub2,
				Chk01_DtlR.$itm_sub3);
	}

	protected void initBpStopR() {
		// 取引先禁止マスタの取得
		_bpStopR = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")));
	}

	protected MCMessageList checkItmStop(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();

		initItmStopL(notErrL);
		for(Chk01_DtlR r : notErrL) {
			MAM_ITM_STOP_R itmStopR = _itmStopL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if(!isNull(itmStopR.xfr_stop_dt()) && itmStopR.xfr_stop_dt().lte(hdrR.xfr_dt())) {
				msgL.add(new MCMessage(
						r,
						Chk01_DtlR.$itm_cd,
						MSBEL0288,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toDispGUIIndex(r)));
			}
		}
		return msgL;
	}

	protected MCMessageList checkBpStop(Chk01_HdrR hdrR) {
		MCMessageList msgL = new MCMessageList();

		initBpStopR();
		MAM_BP_STOP_R bpStopR = _bpStopR.get(hdrR.sppl_cd());
		if(!isNull(bpStopR.xfr_stop_dt()) && bpStopR.xfr_stop_dt().lte(hdrR.xfr_dt())) {
			msgL.add(new MCMessage(
					hdrR,
					Chk01_HdrR.$gr_loc_cd,
					MSBEL0289,
					hdrR.sppl_cd(),
					toDispGUIIndex(hdrR)));
		}
		return msgL;
	}

	protected void initGiLocL(MCList<Chk01_DtlR> bindL) {
		// 場所マスタの取得
		_giLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(
				MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
				bindL.groupBy(Chk01_DtlR.$gi_loc_cd),
				Chk01_DtlR.$gi_loc_cd);
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 移動実績を新規登録する。<br>
	 */
	public class Ins01 extends MSBEL_XfrActReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk01();
			throwUpdErr();
			callXfrActServiceIns02();
			setDown();
		}

		protected void callThisChk01() {
			MSBEL_XfrActReg.Chk01 ope = MSBEL_XfrActReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();

			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callXfrActServiceIns02() {
			MSBEL_XfrActService.XfrAct_Ins02 ope = MSBEL_XfrActService.crtXfrAct_Ins02();

			copy(ope.up0(), up0(), createMap_XfrAct_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_XfrAct_DtlR_Chk01_DtlR());
			ope.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());
			ope.exec();

			copy(up0(), ope.down0(), createMap_Chk01_HdrR_XfrAct_HdrR());
			copyByPegNo(up1(), new String[] {
					Chk01_DtlR.$xfr_act_d_no, Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$prov_act_no,
					Chk01_DtlR.$prov_typ, Chk01_DtlR.$ret_prov_act_no,
					Chk01_DtlR.$ret_prov_typ, Chk01_DtlR.$pr_sts_typ
			}, ope.down1(), new String[] {
					XfrAct_DtlR.$xfr_act_d_no, XfrAct_DtlR.$dlv_slip_no,
					XfrAct_DtlR.$dlv_slip_d_no, XfrAct_DtlR.$prov_act_no,
					XfrAct_DtlR.$prov_typ, XfrAct_DtlR.$ret_prov_act_no,
					XfrAct_DtlR.$ret_prov_typ, XfrAct_DtlR.$pr_sts_typ
			});
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());

			setConstNm(down1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録済みの移動実績を更新する。<br>
	 */
	public class Upd01 extends MSBEL_XfrActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk02();
			throwUpdErr();
			callXfrActServiceUpd02();
			setDown();
		}

		protected void callThisChk02() {
			MSBEL_XfrActReg.Chk02 ope = MSBEL_XfrActReg.crtChk02();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();

			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callXfrActServiceUpd02() {
			MSBEL_XfrActService.XfrAct_Upd02 ope = MSBEL_XfrActService.crtXfrAct_Upd02();

			copy(ope.up0(), up0(), createMap_XfrAct_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_XfrAct_DtlR_Chk01_DtlR());
			ope.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());
			ope.exec();

			copy(up0(), ope.down0(), createMap_Chk01_HdrR_XfrAct_HdrR());
			copyByPegNo(up1(), new String[] {
					Chk01_DtlR.$xfr_act_d_no, Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$prov_act_no,
					Chk01_DtlR.$prov_typ, Chk01_DtlR.$ret_prov_act_no,
					Chk01_DtlR.$ret_prov_typ, Chk01_DtlR.$pr_sts_typ
			}, ope.down1(), new String[] {
					XfrAct_DtlR.$xfr_act_d_no, XfrAct_DtlR.$dlv_slip_no,
					XfrAct_DtlR.$dlv_slip_d_no, XfrAct_DtlR.$prov_act_no,
					XfrAct_DtlR.$prov_typ, XfrAct_DtlR.$ret_prov_act_no,
					XfrAct_DtlR.$ret_prov_typ, XfrAct_DtlR.$pr_sts_typ
			});
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());

			setConstNm(down1());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 登録済みの移動実績を取消す。<br>
	 */
	public class Del01 extends MSBEL_XfrActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk03();
			throwCanErr();
			callXfrActServiceDel02();
			setDown();
		}

		protected void callThisChk03() {
			MSBEL_XfrActReg.Chk03 ope = MSBEL_XfrActReg.crtChk03();
			
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callXfrActServiceDel02() {
			MSBEL_XfrActService.XfrAct_Del02 ope = MSBEL_XfrActService.crtXfrAct_Del02();
			
			copy(ope.up0(), up0(), createMap_XfrAct_HdrR_Chk03_HdrR());
			ope.up1().bndl_prnt_flg(!up2().indiv_prnt_flg());
			ope.exec();
		}

		protected void setDown() {
			down0().setStringNE(Chk03_DtlR.$pr_sts_typ, MSC_PR_STS_TYP.INST.value());
			down0().setStringNE(Chk03_DtlR.$pr_sts_typ_nm, MSC_PR_STS_TYP.INST.name());
		}
	}

	protected void setHdrData(MCList<XfrActChk_HdrDtlR> ope, Chk01_HdrR up) {
		ope.setString(XfrActChk_HdrDtlR.$trd_cd, up.trd_cd());
		ope.setString(XfrActChk_HdrDtlR.$trd_ptn_typ, up.trd_ptn_typ());
		ope.setString(XfrActChk_HdrDtlR.$wg_cd, up.wg_cd());
		ope.setString(XfrActChk_HdrDtlR.$lg_grp_cd, up.lg_grp_cd());
		ope.setString(XfrActChk_HdrDtlR.$gr_loc_cd, up.gr_loc_cd());
		ope.setDate(XfrActChk_HdrDtlR.$xfr_dt, up.xfr_dt());
		ope.setDate(XfrActChk_HdrDtlR.$ac_dt, up.ac_dt());
		ope.setDate(XfrActChk_HdrDtlR.$can_ac_dt, up.can_ac_dt());
	}

	protected Map_XfrActChk_HdrDtlR_Chk01_DtlR<XfrActChk_HdrDtlR, Chk01_DtlR> createMap_XfrActChk_HdrDtlR_Chk01_DtlR() {
		return new Map_XfrActChk_HdrDtlR_Chk01_DtlR<XfrActChk_HdrDtlR, Chk01_DtlR>();
	}

	public class Map_XfrActChk_HdrDtlR_Chk01_DtlR<D extends XfrActChk_HdrDtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrActChk_HdrDtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_alloc_sts_no, Chk01_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_act_d_no, Chk01_DtlR.$xfr_act_d_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$gi_loc_cd, Chk01_DtlR.$gi_loc_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gr_loc_cd, Chk01_DtlR.$gr_loc_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$prov_schd_no, Chk01_DtlR.$prov_schd_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$prov_typ, Chk01_DtlR.$prov_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$ret_prov_schd_no, Chk01_DtlR.$ret_prov_schd_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$ret_prov_typ, Chk01_DtlR.$ret_prov_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(XfrActChk_HdrDtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(XfrActChk_HdrDtlR.$skip_chk_ship_flg, Chk01_DtlR.$skip_chk_ship_flg);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_act_no, Chk01_DtlR.$xfr_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$err_flg, Chk01_DtlR.$err_flg);

			addColumnPathMap(XfrActChk_HdrDtlR.$stk_arrv_bp_cd, Chk01_DtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gi_str_ln_cd, Chk01_DtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gr_str_ln_cd, Chk01_DtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
		}
	}

	protected Map_Chk01_HdrR_XfrActChk_HdrDtlR<Chk01_HdrR, XfrActChk_HdrDtlR> createMap_Chk01_HdrR_XfrActChk_HdrDtlR() {
		return new Map_Chk01_HdrR_XfrActChk_HdrDtlR<Chk01_HdrR, XfrActChk_HdrDtlR>();
	}

	public class Map_Chk01_HdrR_XfrActChk_HdrDtlR<D extends Chk01_HdrR, S extends XfrActChk_HdrDtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_HdrR.$xfr_act_no, XfrActChk_HdrDtlR.$xfr_act_no);
			addColumnPathMap(Chk01_HdrR.$gr_loc_cd, XfrActChk_HdrDtlR.$gr_loc_cd);
			addColumnPathMap(Chk01_HdrR.$wg_cd, XfrActChk_HdrDtlR.$wg_cd);
			addColumnPathMap(Chk01_HdrR.$lg_grp_cd, XfrActChk_HdrDtlR.$lg_grp_cd);
			addColumnPathMap(Chk01_HdrR.$xfr_dt, XfrActChk_HdrDtlR.$xfr_dt);
			addColumnPathMap(Chk01_HdrR.$ac_dt, XfrActChk_HdrDtlR.$ac_dt);
			addColumnPathMap(Chk01_HdrR.$can_ac_dt, XfrActChk_HdrDtlR.$can_ac_dt);
			addColumnPathMap(Chk01_HdrR.$data_crud_typ, XfrActChk_HdrDtlR.$data_crud_typ);
			addColumnPathMap(Chk01_HdrR.$err_flg, XfrActChk_HdrDtlR.$err_flg);
			addColumnPathMap(Chk01_HdrR.$peg_no, XfrActChk_HdrDtlR.$peg_no);

		}
	}

	protected Map_XfrActChk_HdrDtlR_Chk03_HdrR<XfrActChk_HdrDtlR, Chk03_HdrR> createMap_XfrActChk_HdrDtlR_Chk03_HdrR() {
		return new Map_XfrActChk_HdrDtlR_Chk03_HdrR<XfrActChk_HdrDtlR, Chk03_HdrR>();
	}

	public class Map_XfrActChk_HdrDtlR_Chk03_HdrR<D extends XfrActChk_HdrDtlR, S extends Chk03_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrActChk_HdrDtlR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$data_crud_typ, Chk03_HdrR.$data_crud_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$can_ac_dt, Chk03_HdrR.$can_ac_dt);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_act_no, Chk03_HdrR.$xfr_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$err_flg, Chk03_HdrR.$err_flg);

		}
	}

	protected Map_XfrAct_HdrR_Chk01_HdrR<XfrAct_HdrR, Chk01_HdrR> createMap_XfrAct_HdrR_Chk01_HdrR() {
		return new Map_XfrAct_HdrR_Chk01_HdrR<XfrAct_HdrR, Chk01_HdrR>();
	}

	public class Map_XfrAct_HdrR_Chk01_HdrR<D extends XfrAct_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(XfrAct_HdrR.$xfr_act_no, Chk01_HdrR.$xfr_act_no);
			addColumnPathMap(XfrAct_HdrR.$xfr_inst_no, Chk01_HdrR.$xfr_inst_no);
			addColumnPathMap(XfrAct_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(XfrAct_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(XfrAct_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(XfrAct_HdrR.$lg_grp_cd, Chk01_HdrR.$lg_grp_cd);
			addColumnPathMap(XfrAct_HdrR.$gr_loc_cd, Chk01_HdrR.$gr_loc_cd);
			addColumnPathMap(XfrAct_HdrR.$xfr_dt, Chk01_HdrR.$xfr_dt);
			addColumnPathMap(XfrAct_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(XfrAct_HdrR.$act_usr_cd, Chk01_HdrR.$act_usr_cd);
			addColumnPathMap(XfrAct_HdrR.$act_dpt_cd, Chk01_HdrR.$act_dpt_cd);
			addColumnPathMap(XfrAct_HdrR.$dlv_prnt_flg, Chk01_HdrR.$dlv_prnt_flg);
			addColumnPathMap(XfrAct_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(XfrAct_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(XfrAct_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(XfrAct_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(XfrAct_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(XfrAct_HdrR.$immd_dlv_prnt_flg,
					Chk01_HdrR.$immd_dlv_prnt_flg);
			addColumnPathMap(XfrAct_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);

		}
	}

	protected Map_XfrAct_DtlR_Chk01_DtlR<XfrAct_DtlR, Chk01_DtlR> createMap_XfrAct_DtlR_Chk01_DtlR() {
		return new Map_XfrAct_DtlR_Chk01_DtlR<XfrAct_DtlR, Chk01_DtlR>();
	}

	public class Map_XfrAct_DtlR_Chk01_DtlR<D extends XfrAct_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(XfrAct_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(XfrAct_DtlR.$xfr_act_d_no, Chk01_DtlR.$xfr_act_d_no);
			addColumnPathMap(XfrAct_DtlR.$xfr_act_no_dtl, Chk01_DtlR.$xfr_act_no);
			addColumnPathMap(XfrAct_DtlR.$xfr_alloc_sts_no, Chk01_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrAct_DtlR.$xfr_inst_d_no, Chk01_DtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrAct_DtlR.$gi_loc_cd, Chk01_DtlR.$gi_loc_cd);
			addColumnPathMap(XfrAct_DtlR.$gi_str_ln_cd, Chk01_DtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrAct_DtlR.$gi_stk_arrv_bp_cd,
					Chk01_DtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrAct_DtlR.$gr_str_ln_cd, Chk01_DtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrAct_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(XfrAct_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(XfrAct_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(XfrAct_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(XfrAct_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(XfrAct_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(XfrAct_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(XfrAct_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(XfrAct_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(XfrAct_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(XfrAct_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(XfrAct_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(XfrAct_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(XfrAct_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(XfrAct_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(XfrAct_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(XfrAct_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(XfrAct_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(XfrAct_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(XfrAct_DtlR.$skip_chk_ship_flg,
					Chk01_DtlR.$skip_chk_ship_flg);
			addColumnPathMap(XfrAct_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
			addColumnPathMap(XfrAct_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(XfrAct_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(XfrAct_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(XfrAct_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(XfrAct_DtlR.$sub_char1_dtl, Chk01_DtlR.$sub_char1);
			addColumnPathMap(XfrAct_DtlR.$sub_char2_dtl, Chk01_DtlR.$sub_char2);
			addColumnPathMap(XfrAct_DtlR.$sub_char3_dtl, Chk01_DtlR.$sub_char3);
			addColumnPathMap(XfrAct_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(XfrAct_DtlR.$prov_schd_no, Chk01_DtlR.$prov_schd_no);
			addColumnPathMap(XfrAct_DtlR.$prov_typ, Chk01_DtlR.$prov_typ);
			addColumnPathMap(XfrAct_DtlR.$ret_prov_schd_no, Chk01_DtlR.$ret_prov_schd_no);
			addColumnPathMap(XfrAct_DtlR.$ret_prov_typ, Chk01_DtlR.$ret_prov_typ);
			addColumnPathMap(XfrAct_DtlR.$pr_sts_typ, Chk01_DtlR.$pr_sts_typ);
			addColumnPathMap(XfrAct_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(XfrAct_DtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
			addColumnPathMap(XfrAct_DtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
			addColumnPathMap(XfrAct_DtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
		}
	}

	protected Map_XfrAct_HdrR_Chk03_HdrR<XfrAct_HdrR, Chk03_HdrR> createMap_XfrAct_HdrR_Chk03_HdrR() {
		return new Map_XfrAct_HdrR_Chk03_HdrR<XfrAct_HdrR, Chk03_HdrR>();
	}

	public class Map_XfrAct_HdrR_Chk03_HdrR<D extends XfrAct_HdrR, S extends Chk03_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_HdrR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(XfrAct_HdrR.$xfr_act_no, Chk03_HdrR.$xfr_act_no);
			addColumnPathMap(XfrAct_HdrR.$immd_dlv_prnt_flg,
					Chk03_HdrR.$immd_dlv_prnt_flg);
			addColumnPathMap(XfrAct_HdrR.$can_ac_dt, Chk03_HdrR.$can_ac_dt);

		}
	}

	protected Map_ShipRprt_Prnt01_HdrR_Chk04_HdrR<ShipRprt_Prnt01_HdrR, Chk04_HdrR> createMap_ShipRprt_Prnt01_HdrR_Chk04_HdrR() {
		return new Map_ShipRprt_Prnt01_HdrR_Chk04_HdrR<ShipRprt_Prnt01_HdrR, Chk04_HdrR>();
	}

	public class Map_ShipRprt_Prnt01_HdrR_Chk04_HdrR<D extends ShipRprt_Prnt01_HdrR, S extends Chk04_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_no, Chk04_HdrR.$dlv_slip_no);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_seq,
					Chk04_HdrR.$dlv_slip_seq);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$trn_typ, Chk04_HdrR.$trn_typ);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_inst_no,
					Chk04_HdrR.$dlv_slip_inst_no);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_act_no,
					Chk04_HdrR.$dlv_slip_act_no);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$dlv_slip_prnt_flg,
					Chk04_HdrR.$dlv_slip_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt01_HdrR.$ship_adv_prnt_flg,
					Chk04_HdrR.$ship_adv_prnt_flg);

		}
	}

	protected Map_Chk01_HdrR_XfrAct_HdrR<Chk01_HdrR, XfrAct_HdrR> createMap_Chk01_HdrR_XfrAct_HdrR() {
		return new Map_Chk01_HdrR_XfrAct_HdrR<Chk01_HdrR, XfrAct_HdrR>();
	}

	public class Map_Chk01_HdrR_XfrAct_HdrR<D extends Chk01_HdrR, S extends XfrAct_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_HdrR.$trd_cd, XfrAct_HdrR.$trd_cd);
			addColumnPathMap(Chk01_HdrR.$trd_ptn_typ, XfrAct_HdrR.$trd_ptn_typ);
			addColumnPathMap(Chk01_HdrR.$xfr_act_no, XfrAct_HdrR.$xfr_act_no);
			addColumnPathMap(Chk01_HdrR.$xfr_inst_no, XfrAct_HdrR.$xfr_inst_no);
			addColumnPathMap(Chk01_HdrR.$gr_loc_cd, XfrAct_HdrR.$gr_loc_cd);
			addColumnPathMap(Chk01_HdrR.$wg_cd, XfrAct_HdrR.$wg_cd);
			addColumnPathMap(Chk01_HdrR.$lg_grp_cd, XfrAct_HdrR.$lg_grp_cd);
			addColumnPathMap(Chk01_HdrR.$xfr_dt, XfrAct_HdrR.$xfr_dt);
			addColumnPathMap(Chk01_HdrR.$ac_dt, XfrAct_HdrR.$ac_dt);
			addColumnPathMap(Chk01_HdrR.$can_ac_dt, XfrAct_HdrR.$can_ac_dt);
			addColumnPathMap(Chk01_HdrR.$act_usr_cd, XfrAct_HdrR.$act_usr_cd);
			addColumnPathMap(Chk01_HdrR.$act_dpt_cd, XfrAct_HdrR.$act_dpt_cd);
			addColumnPathMap(Chk01_HdrR.$immd_dlv_prnt_flg,
					XfrAct_HdrR.$immd_dlv_prnt_flg);
			addColumnPathMap(Chk01_HdrR.$dlv_prnt_flg, XfrAct_HdrR.$dlv_prnt_flg);
			addColumnPathMap(Chk01_HdrR.$intr_rmrks, XfrAct_HdrR.$intr_rmrks);
			addColumnPathMap(Chk01_HdrR.$trd_rmrks, XfrAct_HdrR.$trd_rmrks);
			addColumnPathMap(Chk01_HdrR.$sub_char1, XfrAct_HdrR.$sub_char1);
			addColumnPathMap(Chk01_HdrR.$sub_char2, XfrAct_HdrR.$sub_char2);
			addColumnPathMap(Chk01_HdrR.$sub_char3, XfrAct_HdrR.$sub_char3);
			addColumnPathMap(Chk01_HdrR.$peg_no, XfrAct_HdrR.$peg_no);

		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 帳票を発行する前に、チェックを実行します。<br>
	 */
	public class Chk04 extends MSBEL_XfrActReg_MC_A.Chk04 {
		protected MST_XFR_ACT_R _actR = MST_XFR_ACT_R.create();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				// 特に無し
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (hasErr()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			// 移動実績ヘッダのロック
			lockXfrActHdr();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntr());
			msgL.addAll(chkXfrActD());

			return msgL;
		}

		protected void compBase() {
			// ヘッダの補完

			// 明細の補完

		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (hasErr()) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 特に無し

			return msgL;
		}

		protected void compSub() {
			up0().trn_typ(MSC_TRN_TYP.XFR.value());
			up0().dlv_slip_act_no(up0().xfr_act_no());
			up0().dlv_slip_prnt_flg(true);
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 特に無し
		}

		protected void setDown() {
			copyall(down0(), up0());
		}

		/**
		 * 移動実績(ヘッダ)のロック
		 */
		protected void lockXfrActHdr() {
			if (up0().isEmpty()) {
				return;
			}

			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1020_MST_XFR_ACT_S03", _actR, actR_bldr, up0());
		}

		/**
		 * 更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntr() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$act_upd_cntr, _actR));

			return msgL;
		}
		
		protected MCMessageList chkXfrActD() {
			MCMessageList msgL = new MCMessageList();

			if (MAC_TRD_PTN_TYP.isPROV_RTN(_actR.trd_ptn_typ())) {
				for (Chk04_DtlR r : up1()) {
					if (isNull(r.base_ac_dt())) {
						msgL.add(new MCMessage(r, Chk04_DtlR.$base_ac_dt, MSBEL1105, toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行する。<br>
	 */
	public class Prnt01 extends MSBEL_XfrActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk04();
			throwUpdErr();
			callShipRprtPrntServicePrnt01();
			updPrntFlg();
			setDown();
		}

		protected void callThisChk04() {
			MSBEL_XfrActReg.Chk04 ope = MSBEL_XfrActReg.crtChk04();

			copyall(ope.up0(), up0());
			setAll(ope.up1(), up2(), createMap_Chk04_DtlR_Prnt01_DtlR());
			ope.exec();

			copyall(up0(), ope.down0());
		}

		protected void callShipRprtPrntServicePrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 ope = MSBEL_ShipRprtPrntService
					.crtShipRprt_Prnt01();
			ope.up0().setAll(crtShipRprtPrnt01());
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());
			ope.exec();
		}
		
		protected MCList<ShipRprt_Prnt01_HdrR> crtShipRprtPrnt01() {
			MCList<MST_DLV_SLIP_R> rsltL = getPrntTgtL();
			MCList<ShipRprt_Prnt01_HdrR> prntL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			boolean prnted = false;
			for (MST_DLV_SLIP_R dlvR : rsltL) {
				ShipRprt_Prnt01_HdrR prntR = prntL.add();
				prntR.dlv_slip_no(dlvR.dlv_slip_no());
				prntR.dlv_slip_seq(dlvR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0().dlv_slip_prnt_flg());
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0());
				
				// 未発行がある場合、移動実績ヘッダのフラグを更新する
				if (!dlvR.slip_prnt_flg()) {
					prnted = true;
				}
			}
			up0().dlv_slip_prnt_flg(prnted);
			return prntL;
		}
		protected MCList<MST_DLV_SLIP_R> getPrntTgtL() {
			// 上り電文の移動実績ＮＯに対応する納品書ＮＯ、連番を取得する
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MST_XFR_ACT_R t2 = MST_XFR_ACT_R.create("T2");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.dlv_slip_no,
				t1.dlv_slip_seq,
				t2.dlv_prnt_flg.as("slip_prnt_flg")
			);
			bldr.addInnerJoin(t2, t2.xfr_act_no.eq(t1.xfr_act_no));
			bldr.setWhere(t1.xfr_act_no.eq(bind("1")), up0().xfr_act_no());
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL1020_MST_XFR_ACT_S04", rsltL, bldr);
			
			return rsltL;
		}

		protected void updPrntFlg() {

			if (!up0().dlv_slip_prnt_flg()) {
				return;
			}
			MST_XFR_ACT_R actR = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(actR);
			actR.xfr_act_no(up0().xfr_act_no());
			actR.dlv_prnt_flg(true);
			actR.dlv_prnt_tm(MCDate.sysnow());
			actR_bldr.setSet(actR.dlv_prnt_flg, actR.dlv_prnt_tm);
			dbUpdateKey("MSBEL1020_MST_XFR_ACT_U01", actR, actR_bldr);
		}
		
		protected Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR, Prnt01_DtlR> createMap_Chk04_DtlR_Prnt01_DtlR() {
			return new Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR, Prnt01_DtlR>();
		}
		public class Map_Chk04_DtlR_Prnt01_DtlR<D extends Chk04_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( Chk04_DtlR.$base_ac_dt, Prnt01_DtlR.$base_ac_dt);
			}
		}

		protected void setDown() {
			// 特に無し
		}
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 支給元の支給計上日を取得する。<br>
	 */
	public class Sprt01 extends MSBEL_XfrActReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (MAC_TRD_PTN_TYP.isPROV_RTN(up0().trd_ptn_typ())) {
				MCList<Sprt01_DtlR> dlvSlipNoL = MCList.create(Sprt01_DtlR.class);
				MCList<Sprt01_DtlR> provActNoL = MCList.create(Sprt01_DtlR.class);
				MCList<Sprt01_DtlR> retL = MCList.create(Sprt01_DtlR.class);

				for (Sprt01_DtlR r : up1()) {
					if (isNull(r.base_ac_dt())) {
						if (!isNull(r.base_dlv_slip_no())) {
							dlvSlipNoL.add(r);
						}
						else if (!isNull(r.base_prov_act_no())) {
							provActNoL.add(r);
						}
					}
				}

				retL.addAll(getDlvSlipNo(dlvSlipNoL));
				retL.addAll(getProvActNo(provActNoL));

				for (Sprt01_DtlR r : up1()) {
					if (!isNull(r.base_ac_dt())) {
						continue;
					}
					Sprt01_DtlR retR = null;
					if (!isNull(r.base_dlv_slip_no())) {
						retR = retL.getFirst(Sprt01_DtlR.$base_dlv_slip_no, r.base_dlv_slip_no());
					}
					else if (!isNull(r.base_prov_act_no())) {
						retR = retL.getFirst(Sprt01_DtlR.$base_prov_act_no, r.base_prov_act_no());
					}
					if (!isNull(retR)) {
						r.base_ac_dt(retR.base_ac_dt());
					}
					else {
						MCMessagePool.add(new MCMessage(r, Sprt01_DtlR.$base_ac_dt, MSBEL1104
						, r.base_dlv_slip_no()
						, r.base_prov_act_no()
						, toDispGUIIndex(r)));
					}
				}

				setDown();

			}

		}

		protected MCList<Sprt01_DtlR> getDlvSlipNo(MCList<Sprt01_DtlR> dlvSlipNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_SHIP_ACT_D_R t4 = MST_SHIP_ACT_D_R.create("T4");

			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(
				cases().when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
					.then(t1.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
					.then(t3.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
					.then(t4.dlv_slip_no)
					.otherwise(t.dlv_slip_no)
					.as("base_dlv_slip_no"));
			provActR_bldr.addLeftOuterJoin(t1, t.prov_src_act_no.eq(t1.xfr_act_d_no));
			provActR_bldr.addLeftOuterJoin(t2, t.prov_src_act_no.eq(t2.arr_act_no));
			provActR_bldr.addLeftOuterJoin(t3, t2.arr_schd_no.eq(t3.arr_schd_no));
			provActR_bldr.addLeftOuterJoin(t4, t.prov_src_act_no.eq(t4.ship_act_d_no));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(bracket(
				t.dlv_slip_no.eq(bind("base_dlv_slip_no"))
				.or(t1.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t3.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t4.dlv_slip_no.eq(bind("base_dlv_slip_no")))
			));
			dlvSlipNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1020_MST_PROV_ACT_S01", dlvSlipNoL, provActR_bldr, dlvSlipNoL);

			return dlvSlipNoL;

		}

		protected MCList<Sprt01_DtlR> getProvActNo(MCList<Sprt01_DtlR> provActNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(t.prov_act_no.as("base_prov_act_no"));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(t.prov_act_no.eq(bind("base_prov_act_no")));
			provActNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1020_MST_PROV_ACT_S02", provActNoL, provActR_bldr, provActNoL);

			return provActNoL;

		}

		protected void setDown() {
			down0().setAll(up1());
		}
	}

	//FMCB CUSTOM END
}