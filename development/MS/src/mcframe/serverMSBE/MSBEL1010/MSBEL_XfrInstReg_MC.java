package mcframe.serverMSBE.MSBEL1010;

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
import mcframe.serverMSBE.MSBEL1010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1010.Query.*;
import java.util.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import mcframe.serverMSBE.MSBEL5210.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBE.MSBEL5550.*;

import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverMSUC.MSUCL0090.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrInstReg_MC extends MSBEL_XfrInstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 移動・移送予定を検索する<br>
	 */
	public class Srch01 extends MSBEL_XfrInstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = srchXfrAllocHdr();

			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchXfrAllocDtl();

			if (isSame(cnt, 0)) {
				MCRow.copyall(down0(), Srch01_HdrR.create());
			}
		}

		protected int srchXfrAllocHdr() {
			return executeQuery(down0(), MSBEL1010_MST_XFR_SCHD_S01(), up0());
		}

		protected int srchXfrAllocDtl() {
			return executeQuery(down1(), MSBEL1010_MST_XFR_ALLOC_STS_S02(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_DtlR r : down1()) {
				setActContQty(r); // 実際有効成分の設定
				setStdContQty(r); // 標準有効成分の設定
				setPckgUnitQty(r);
				if(r.alloc_flg() && isNullOr(r.lot_no(), r.sublot_no())) {
					r.lot_none_flg(true);
				}
			}
			setWmsflg(down0(), down1());
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 移動指図を検索する<br>
	 */
	public class Srch02 extends MSBEL_XfrInstReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = srchXfrInstHdr();

			if (isSame(cnt, 0)) {
				return;
			}
			cnt = chkDac(down0());
			if (isSame(cnt, 0)) {
				MCRow.copyall(down0(), Srch01_HdrR.create());
				return;
			}

			cnt = srchXfrAllocDtl();

			if (isSame(cnt, 0)) {
				MCRow.copyall(down0(), Srch01_HdrR.create());
			}
			setNonDlvPrntFlg();
		}

		protected int srchXfrInstHdr() {
			return executeQuery(down0(), MSBEL1010_MST_XFR_INST_S01(), up0());
		}

		protected int srchXfrAllocDtl() {
			return executeQuery(down1(), MSBEL1010_MST_XFR_ALLOC_STS_S03(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_DtlR r : down1()) {
				setActContQty(r); // 実際有効成分の設定
				setStdContQty(r); // 標準有効成分の設定
				setPckgUnitQty(r);
				if(r.alloc_flg() && isNullOr(r.lot_no(), r.sublot_no())) {
					r.lot_none_flg(true);
				}
			}
			setWmsflg(down0(), down1());
		}

		/**
		 * 読取権限チェック
		 * @param down
		 */
		protected int chkDac(Srch01_HdrR down) {
		
			// DACチェック
			if (!readableLgGrpCdDac(down.lg_grp_cd())
					&& !chkDtlDac(down)) {
				return 0;
			}
			return 1;
		}
		
		protected boolean chkDtlDac(Srch01_HdrR down) {
			MCList<MST_XFR_INST_D_R> instDInfoL = MCList.create(MST_XFR_INST_D_R.class);
			MST_XFR_INST_D_R t = MST_XFR_INST_D_R.create("T");
			MCQueryApiBuilder instDInfoL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			
			// 移動引当状況から出荷場所を取得
			instDInfoL.addStringColumn("gi_loc_cd");
			instDInfoL.addStringColumn("lg_grp_cd");
			instDInfoL_bldr.addSelect(t1.gi_loc_cd);
			instDInfoL_bldr.addSelect(t1.lg_grp_cd);
			instDInfoL_bldr.addLeftOuterJoin(t1, bracket(t1.xfr_inst_d_no.eq(t.xfr_inst_d_no)));
			instDInfoL_bldr.setWhere(t.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL1010_MST_XFR_INST_D_S01", instDInfoL, instDInfoL_bldr, down);

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
		protected void setNonDlvPrntFlg() {
			// 以下の条件を満たす場合、納品書は発行不可
			// ・指図で発行していない
			// ・実績登録済み
			for (MST_XFR_INST_R actR : checkXfrAct()) {
				if (!actR.dlv_prnt_flg() && !isNull(actR.getStringNE("xfr_act_no"))) {
					down0().non_dlv_prnt_flg(true);
					break;
				}
			}
		}
		protected MCList<MST_XFR_INST_R> checkXfrAct() {
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
			MST_DLV_SLIP_R t3 = MST_DLV_SLIP_R.create("T3");
			MST_XFR_ACT_R t4 = MST_XFR_ACT_R.create("T4");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.addInnerJoin(t2, t2.xfr_inst_d_no.eq(t1.xfr_inst_d_no));
			bldr.addLeftOuterJoin(t3,
				t3.dlv_slip_no.eq(t2.dlv_slip_no)
				.and(t3.dlv_slip_seq.eq(t2.dlv_slip_seq))
			);
			bldr.addLeftOuterJoin(t4, t4.xfr_inst_no.eq(t1.xfr_inst_no));
			bldr.setGroupBy(t1.xfr_inst_no, t2.dlv_slip_no);
			bldr.addMin(t3.slip_prnt_flg, "dlv_prnt_flg");
			bldr.addMin(t4.xfr_act_no, "xfr_act_no");
			bldr.setWhere(t1.xfr_inst_no.eq(bind("1")), down0().xfr_inst_no());
			
			MCList<MST_XFR_INST_R> rsltL = MCList.create(MST_XFR_INST_R.class);
			rsltL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
			rsltL.addStringColumn(MST_XFR_ACT_R.$xfr_act_no);
			dbSelect("MSBEL1010_MST_XFR_INST_S04", rsltL, bldr);
			
			return rsltL;
		}
	}

	protected void setActContQty(Srch01_DtlR r) {
		if (r.cont_fctr_flg()) {
			MCNumber qty = convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
			r.act_cont_qty(qty);
		}
	}

	protected void setStdContQty(Srch01_DtlR r) {
		if (r.cont_fctr_flg()) {
			MCNumber qty = convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
			r.std_cont_qty(qty);
		}
	}

	protected void setPckgUnitQty(Srch01_DtlR r) {
		// 梱包単位数量（切り上げ固定）
		MCNumber qty = rvrsBaseUnitConv(r.base_unit_qty(),
					r.pckg_unit_conv_base_qty(), r.pckg_unit_conv_qty(),
					r.pckg_unit_dec_place(), MAC_RND_TYP.RNDUP.value());
		r.pckg_unit_qty(qty);
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
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value());
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
					dtlR.wms_tgt_flg(dtlR.wms_flg());
				}
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 移動指図が登録可能かチェックする<br>
	 */
	public class Chk01 extends MSBEL_XfrInstReg_MC_A.Chk01 {
		protected MCList<MST_XFR_SCHD_R> _xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MCIndexKey _xfrSchdIdx;
		protected MCIndexKey _xfrAllocIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callXfrInstServiceChk01();
			}

			setDown();
		}

		/**
		 * 更新カウンタチェックおよびトランザクションデータからの補完処理
		 * 更新前データのDACのチェック処理
		 */
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(chkXfrSchd());
			if(!msgL.isEmpty()) return msgL;

			msgL.addAll(chkXfrAllocSts());
			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 負担部門
			ListLogicBind bdDptCdBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptCdBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$xfr_inst_dt);
		}


		/**
		 * 移動・移送予定のロック
		 */
		protected MCMessageList chkXfrSchd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> bindL = up1()
					.subList(r -> !isNull(r.xfr_schd_no()));
			if(bindL.isEmpty()) {
				return msgL;
			}
			bindL.sort(MST_XFR_SCHD_R.$xfr_schd_no);

			MST_XFR_SCHD_R xfrSchdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(xfrSchdL_t);
			xfrSchdL_bldr.setOrderByAsc(xfrSchdL_t.xfr_schd_no);
			dbSelectKeyForUpdate("MSBEL1010_MST_XFR_SCHD_S01", _xfrSchdL, xfrSchdL_bldr, bindL);
			_xfrSchdIdx = _xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);

			return msgL;
		}

		/**
		 * 移動引当状況のロック、更新カウンタチェック
		 */
		protected MCMessageList chkXfrAllocSts() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.xfr_alloc_sts_no()));
			if(bindL.isEmpty()) {
				return msgL;
			}
			bindL.sort(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			MST_XFR_ALLOC_STS_R xfrAllocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(xfrAllocL_t);
			xfrAllocL_bldr.setOrderByAsc(xfrAllocL_t.xfr_alloc_sts_no);
			dbSelectKeyForUpdateNoWait("MSBEL1010_MST_XFR_ALLOC_STS_S01", _xfrAllocL, xfrAllocL_bldr, bindL);
			_xfrAllocIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			for (Chk01_DtlR r : bindL) {
				MST_XFR_ALLOC_STS_R selectR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$alloc_sts_upd_cntr, selectR));
			}
			return msgL;
		}

		/**
		 * トランザクションデータからの補完
		 * リストロジックによる補完前
		 */
		protected void compBase() {
			for (Chk01_DtlR dtlR : up1()) {
				compBaseFromTran(dtlR);
			}
		}

		/**
		 * リストロジックによる補完前にトランザクションから補完する項目
		 * @param dtlR
		 * @param allocR
		 */
		protected void compBaseFromTran(Chk01_DtlR dtlR) {
			MST_XFR_SCHD_R schdR = getSchdR(dtlR); 
			MST_XFR_ALLOC_STS_R allocR = getAllocR(dtlR);
			if(!isNull(schdR)) {
				dtlR.itm_cd(schdR.itm_cd());
				dtlR.itm_sub1(schdR.itm_sub1());
				dtlR.itm_sub2(schdR.itm_sub2());
				dtlR.itm_sub3(schdR.itm_sub3());
			}
			if(!isNull(allocR)) {
				dtlR.xfr_schd_no(allocR.xfr_schd_no());
				dtlR.trd_cd(allocR.trd_cd());
				dtlR.gr_loc_cd(allocR.gr_loc_cd());
				dtlR.sno1(allocR.sno1());
				dtlR.sno1_null_flg(allocR.sno1_null_flg());
				dtlR.sno2(allocR.sno2());
				dtlR.sno2_null_flg(allocR.sno2_null_flg());
				dtlR.sno3(allocR.sno3());
				dtlR.sno3_null_flg(allocR.sno3_null_flg());
				dtlR.sno4(allocR.sno4());
				dtlR.sno4_null_flg(allocR.sno4_null_flg());
				dtlR.not_lot_mix_flg(allocR.not_lot_mix_flg());
				dtlR.not_sublot_mix_flg(allocR.not_sublot_mix_flg());
				dtlR.vld_dt_fr(allocR.vld_dt_fr());
				dtlR.prov_typ(allocR.prov_typ());
				dtlR.prov_basis_typ(allocR.prov_basis_typ());
				dtlR.ret_prov_typ(allocR.ret_prov_typ());
				dtlR.ret_prov_basis_typ(allocR.ret_prov_basis_typ());
				if(!isNull(dtlR.gi_sppl_cd())) {
					// 支給返品または直送支給の場合
					dtlR.gi_stk_arrv_bp_cd(allocR.gi_stk_arrv_bp_cd());
					dtlR.stk_id_typ(allocR.stk_id_typ());
				}
			}
		}

		/**
		 * 更新データのDACのチェック処理、条件付チェックの処理
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1(), MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);

			compSubFromTran(up0(), notErrL);

			if (!up0().err_flg()) {
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
			}

			MCMessageList msgDacLgL = checkWritableLgGrpCdDac(up0(), Chk01_HdrR.$lg_grp_cd);
			
			if (!msgDacLgL.isEmpty()) {
				up1().addStringColumn("lg_grp_cd", up0().lg_grp_cd());
				MCList<MAM_ITM_LG_GRP_R> itmLgGrpL = getItmLgGrpLocL(up1());
				MAM_LOC_R locR = getLoc(up0().lg_grp_cd());
				MCIndexKey idxkey = itmLgGrpL.createIndex(MAM_ITM_LG_GRP_R.$itm_cd,
						MAM_ITM_LG_GRP_R.$itm_sub1, MAM_ITM_LG_GRP_R.$itm_sub2,
						MAM_ITM_LG_GRP_R.$itm_sub3, MAM_ITM_LG_GRP_R.$lg_grp_cd);
				
				MCMessageList msgDacGiL = new MCMessageList();
				
				for (Chk01_DtlR dtlR : up1()) {
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpL.getFirst(idxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), up0().lg_grp_cd());
					if (!isNull(dtlR.gi_loc_cd())) {
						msgDacGiL.addAll(checkWritableLocCdDac(dtlR, Chk01_DtlR.$gi_loc_cd));
					}
					else {
						dtlR.addStringColumn("chk_gi_loc_cd", !isNull(itmLgGrpR) ? itmLgGrpR.lg_def_loc_cd() : !locR.isEmpty() ? locR.loc_cd() : null);
						msgDacGiL.addAll(checkWritableLocCdDac(dtlR, "chk_gi_loc_cd"));
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

			return msgL;
		}

		/**
		 * リストロジックによる補完後のトランザクションからの補完
		 * (予定ありの場合に変更不可の項目)
		 */
		protected void compSubFromTran(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
			for(Chk01_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R allocR = getAllocR(r);

				if(isNull(allocR)) {
					if (isNull(r.prov_typ())
						|| MAC_PROV_TYP.isFFR_PROV(r.prov_typ())) {
						r.prov_basis_typ(null);
					}
					else {
						if (isNull(r.prov_basis_typ())) {
							r.prov_basis_typ(hdrR.gr_prov_basis_typ());
						}
					}
				}
				else {
					r.trd_ptn_typ(allocR.trd_ptn_typ());
					r.gr_wg_cd(hdrR.wg_cd());
					r.gr_lg_grp_cd(allocR.lg_grp_cd());
					r.prov_typ(allocR.prov_typ());
					r.prov_basis_typ(allocR.prov_basis_typ());
				}
			}
		}

		protected void compSub() {
			// リストロジックや画面入力と同等の補完処理以外の補完

			for (Chk01_DtlR dtlR : up1()) {
				if(dtlR.isStatusDelete()) {
					// 梱包数量提案によるまとめ元の行
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if(isNull(dtlR.xfr_alloc_sts_no())) {
					// 追加行、コピー行、梱包数量提案行
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}

			setPegNo(up1());
			setDispSeq(up1());
		}

		/** 
		 * 移動・移送予定のレコードを取得する。
		 * @param dtlR
		 * @return
		 */
		protected MST_XFR_SCHD_R getSchdR(Chk01_DtlR dtlR) {
			if(!isNull(dtlR.xfr_schd_no())){
				return _xfrSchdL.getFirst(_xfrSchdIdx, dtlR.xfr_schd_no());
			}
			return null;
		}

		/** 
		 * 移動引当状況のレコードを取得する。
		 * 分割行の場合は分割元の移動引当状況を取得する。
		 * @param dtlR
		 * @return
		 */
		protected MST_XFR_ALLOC_STS_R getAllocR(Chk01_DtlR dtlR) {
			if(!isNull(dtlR.xfr_alloc_sts_no())){
				return _xfrAllocL.getFirst(_xfrAllocIdx, dtlR.xfr_alloc_sts_no());
			}
			else if(!isNull(dtlR.old_xfr_alloc_sts_no())){
				return _xfrAllocL.getFirst(_xfrAllocIdx, dtlR.old_xfr_alloc_sts_no());
			}
			return null;
		}

		protected void callXfrInstServiceChk01() {
			MSBEL_XfrInstService.XfrInst_Chk01 ope = MSBEL_XfrInstService.crtXfrInst_Chk01();

			for(Chk01_DtlR upR : up1()) {
				XfrInstChk_HdrDtlR r = ope.up0().add();
				copy(r, up0(), createMap_XfrInstChk_HdrDtlR_Chk01_HdrR());
				copy(r, upR, createMap_XfrInstChk_HdrDtlR_Chk01_DtlR());
			}
			ope.exec();

			copyErrFlg(up1(), ope.down0());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 移動指図が更新可能かチェックする<br>
	 */
	public class Chk02 extends MSBEL_XfrInstReg_MC_A.Chk02 {
		protected MST_XFR_INST_R _xfrInstHdrR = MST_XFR_INST_R.create();
		protected MCList<MST_XFR_INST_D_R> _xfrInstDtlL = MCList.create(MST_XFR_INST_D_R.class);
		protected MCList<MST_XFR_SCHD_R> _xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MCIndexKey _xfrSchdIdx;
		protected MCIndexKey _xfrAllocIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callXfrInstServiceChk02();
			}
			setDown();
		}

		/**
		 * 更新カウンタチェックおよびトランザクションデータからの補完処理
		 * 更新前データのDACのチェック処理
		 */
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(chkXfrInst(up0()));
			if(!msgL.isEmpty()) return msgL;

			msgL.addAll(chkXfrSchd());
			if(!msgL.isEmpty()) return msgL;

			msgL.addAll(chkXfrAllocSts());
			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 負担部門
			ListLogicBind bdDptCdBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptCdBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$xfr_inst_dt);
		}


		/**
		 * 移動指図、移動指図明細のロック、更新カウンタチェック
		 */
		protected MCMessageList chkXfrInst(Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			// 指図ヘッダの検索
			MCQueryApiBuilder xfrInstHdrR_bldr = MCQueryApiBuilder.create(MST_XFR_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1010_MST_XFR_INST_S01", _xfrInstHdrR, xfrInstHdrR_bldr, hdrR);
			msgL.addAll(checkUpdCntrNE(hdrR, Chk01_HdrR.$inst_upd_cntr, _xfrInstHdrR));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			// 指図明細の検索
			MST_XFR_INST_D_R xfrInstDtlL_t = MST_XFR_INST_D_R.create("T");
			MCQueryApiBuilder xfrInstDtlL_bldr = MCQueryApiBuilder.create(xfrInstDtlL_t);
			xfrInstDtlL_bldr.setWhere(xfrInstDtlL_t.xfr_inst_no.eq(bind("xfr_inst_no")), hdrR);
			dbSelectForUpdate("MSBEL1010_MST_XFR_INST_D_S02", _xfrInstDtlL, xfrInstDtlL_bldr);
			return msgL;
		}

		/**
		 * 移動・移送予定のロック
		 */
		protected MCMessageList chkXfrSchd() {
			int cnt;
			MCMessageList msgL = new MCMessageList();

			cnt = setUpXfrSchdDbWork(up1());
			if(cnt == 0) {
				return msgL;
			}

			MST_XFR_SCHD_R xfrSchdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(xfrSchdL_t);
			MSW_XFR_SCHD_KEY_R t2 = MSW_XFR_SCHD_KEY_R.create("T2");
			xfrSchdL_bldr.addInnerJoin(t2, bracket(xfrSchdL_t.xfr_schd_no.eq(t2.xfr_schd_no)));
			xfrSchdL_bldr.setOrderByAsc(xfrSchdL_t.xfr_schd_no);
			dbSelectForUpdate("MSBEL1010_MST_XFR_SCHD_S02", _xfrSchdL, xfrSchdL_bldr);
			_xfrSchdIdx = _xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);

			return msgL;
		}

		protected int setUpXfrSchdDbWork(MCList<Chk01_DtlR> upL) {
			int cnt;
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ALLOC_STS_SV_R t2 = MST_XFR_ALLOC_STS_SV_R.create("T2");
			dbWkDelete("MSBEL1010_MSW_XFR_SCHD_D01", xfrSchdL_bldr.getBaseDbc());

			cnt = dbSelectKey("MSBEL1010_MST_XFR_SCHD_S03", xfrSchdL, xfrSchdL_bldr, upL.groupBy(Chk01_DtlR.$xfr_schd_no));
			dbWkInsert("MSBEL1010_MSW_XFR_SCHD_I01", xfrSchdL, xfrSchdL_bldr.getBaseDbc());

			xfrSchdL_bldr.setSelect(t.xfr_schd_no);
			xfrSchdL_bldr.addInnerJoin(t2, bracket(t.xfr_schd_no.eq(t2.xfr_schd_no)));
			xfrSchdL_bldr.addWhereWithAnd(t2.xfr_inst_d_no.eq(bind("xfr_inst_d_no")));
			cnt += dbSelect("MSBEL1010_MST_XFR_SCHD_S04", xfrSchdL, xfrSchdL_bldr, upL.groupBy(Chk01_DtlR.$xfr_inst_d_no));
			dbWkInsert("MSBEL1010_MSW_XFR_SCHD_I02", xfrSchdL, xfrSchdL_bldr.getBaseDbc());

			return cnt;
		}

		/**
		 * 移動引当状況のロック、更新カウンタチェック
		 */
		protected MCMessageList chkXfrAllocSts() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.xfr_alloc_sts_no()));
			if(bindL.isEmpty()) {
				return msgL;
			}
			bindL.sort(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			MST_XFR_ALLOC_STS_R xfrAllocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(xfrAllocL_t);
			xfrAllocL_bldr.setOrderByAsc(xfrAllocL_t.xfr_alloc_sts_no);
			dbSelectKeyForUpdateNoWait("MSBEL1010_MST_XFR_ALLOC_STS_S02", _xfrAllocL, xfrAllocL_bldr, bindL);
			_xfrAllocIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			for (Chk01_DtlR r : bindL) {
				MST_XFR_ALLOC_STS_R selectR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$alloc_sts_upd_cntr, selectR));
			}
			return msgL;
		}

		/**
		 * トランザクションデータからの補完
		 * リストロジックによる補完前
		 */
		protected void compBase() {
			up0().dlv_prnt_flg(_xfrInstHdrR.dlv_prnt_flg());
			up0().inst_prnt_flg(_xfrInstHdrR.inst_prnt_flg());
			up0().pick_prnt_flg(_xfrInstHdrR.pick_prnt_flg());

			for (Chk01_DtlR dtlR : up1()) {
				dtlR.xfr_inst_no(_xfrInstHdrR.xfr_inst_no());
				compBaseFromTran(dtlR);
			}
		}

		/**
		 * リストロジックによる補完前にトランザクションから補完する項目
		 * @param dtlR
		 * @param allocR
		 */
		protected void compBaseFromTran(Chk01_DtlR dtlR) {
			MST_XFR_SCHD_R schdR = getSchdR(dtlR); 
			MST_XFR_ALLOC_STS_R allocR = getAllocR(dtlR);
			if(!isNull(schdR)) {
				dtlR.itm_cd(schdR.itm_cd());
				dtlR.itm_sub1(schdR.itm_sub1());
				dtlR.itm_sub2(schdR.itm_sub2());
				dtlR.itm_sub3(schdR.itm_sub3());
			}
			if(!isNull(allocR)) {
				dtlR.xfr_schd_no(allocR.xfr_schd_no());
				dtlR.xfr_inst_d_no(allocR.xfr_inst_d_no());
				dtlR.trd_cd(allocR.trd_cd());
				dtlR.base_unit_act_qty(allocR.base_unit_qty());
				dtlR.gr_loc_cd(allocR.gr_loc_cd());
				dtlR.sno1(allocR.sno1());
				dtlR.sno1_null_flg(allocR.sno1_null_flg());
				dtlR.sno2(allocR.sno2());
				dtlR.sno2_null_flg(allocR.sno2_null_flg());
				dtlR.sno3(allocR.sno3());
				dtlR.sno3_null_flg(allocR.sno3_null_flg());
				dtlR.sno4(allocR.sno4());
				dtlR.sno4_null_flg(allocR.sno4_null_flg());
				dtlR.not_lot_mix_flg(allocR.not_lot_mix_flg());
				dtlR.not_sublot_mix_flg(allocR.not_sublot_mix_flg());
				dtlR.vld_dt_fr(allocR.vld_dt_fr());
				dtlR.prov_typ(allocR.prov_typ());
				dtlR.prov_basis_typ(allocR.prov_basis_typ());
				dtlR.ret_prov_typ(allocR.ret_prov_typ());
				dtlR.ret_prov_basis_typ(allocR.ret_prov_basis_typ());
				if(!isNull(dtlR.gi_sppl_cd())) {
					// 支給返品または直送支給の場合
					dtlR.gi_stk_arrv_bp_cd(allocR.gi_stk_arrv_bp_cd());
					dtlR.stk_id_typ(allocR.stk_id_typ());
				}
			}
		}

		/**
		 * 更新データのDACのチェック処理、条件付チェックの処理
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1(), MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);

			compSubFromTran(up0(), notErrL);

			if (!up0().err_flg()) {
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
			}

			MCMessageList msgDacLgL = checkWritableLgGrpCdDac(up0(), Chk01_HdrR.$lg_grp_cd);

			if (!msgDacLgL.isEmpty()) {
				MCMessageList msgDacGiL = chkDtlDac();
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

		protected MCMessageList chkDtlDac() {
			MCMessageList msgL = new MCMessageList();

			up1().addStringColumn("lg_grp_cd", up0().lg_grp_cd());
			MCList<MAM_ITM_LG_GRP_R> itmLgGrpL = getItmLgGrpLocL(up1());
			MAM_LOC_R locR = getLoc(up0().lg_grp_cd());
			MCIndexKey idxkey = itmLgGrpL.createIndex(MAM_ITM_LG_GRP_R.$itm_cd,
					MAM_ITM_LG_GRP_R.$itm_sub1, MAM_ITM_LG_GRP_R.$itm_sub2,
					MAM_ITM_LG_GRP_R.$itm_sub3, MAM_ITM_LG_GRP_R.$lg_grp_cd);

			boolean isBfUpd = false;
			boolean isAfUpd = false;
			for (Chk01_DtlR dtlR : up1()) {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpL.getFirst(idxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), up0().lg_grp_cd());
				MST_XFR_ALLOC_STS_R xfrAllocStsR = _xfrAllocL.getFirst(_xfrAllocIdx, dtlR.xfr_alloc_sts_no());
				dtlR.addStringColumn("chk_gi_loc_cd", !isNull(itmLgGrpR) ? itmLgGrpR.lg_def_loc_cd() : !locR.isEmpty() ? locR.loc_cd() : null);

				isBfUpd = false;
				isAfUpd = false;
				if (dtlR.isStatusCreate()) {
					isAfUpd = true;
				}
				else if (dtlR.isStatusDelete()) {
					isBfUpd = true;
				}
				else {
					if (!isSame(dtlR.gi_loc_cd(), xfrAllocStsR.gi_loc_cd())) {
						isBfUpd = true;
					}
					isAfUpd = true;
				}

				if (isAfUpd) {
					if (!isNull(dtlR.gi_loc_cd())) {
						msgL.addAll(checkWritableLocCdDac(dtlR, Chk01_DtlR.$gi_loc_cd));
					}
					else {
						msgL.addAll(checkWritableLocCdDac(dtlR, "chk_gi_loc_cd"));
					}
				}
				if (isBfUpd) {
					if (!isNull(xfrAllocStsR.gi_loc_cd())) {
						msgL.addAll(checkWritableLocCdDac(xfrAllocStsR, Chk01_DtlR.$gi_loc_cd));
					}
					else {
						msgL.addAll(checkWritableLocCdDac(dtlR, "chk_gi_loc_cd"));
					}
				}
			}

			return msgL;
		}
		/**
		 * リストロジックによる補完後のトランザクションからの補完
		 * (予定ありの場合に変更不可の項目)
		 */
		protected void compSubFromTran(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
			for(Chk01_DtlR r : notErrL) {
				MST_XFR_ALLOC_STS_R allocR = getAllocR(r);

				if(isNull(allocR)) {
					if (isNull(r.prov_typ())
						|| MAC_PROV_TYP.isFFR_PROV(r.prov_typ())) {
						r.prov_basis_typ(null);
					}
					else {
						if (isNull(r.prov_basis_typ())) {
							r.prov_basis_typ(hdrR.gr_prov_basis_typ());
						}
					}
				}
				else {
					r.trd_ptn_typ(allocR.trd_ptn_typ());
					r.gr_wg_cd(hdrR.wg_cd());
					r.gr_lg_grp_cd(allocR.lg_grp_cd());
					r.prov_typ(allocR.prov_typ());
					r.prov_basis_typ(allocR.prov_basis_typ());
				}
			}
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する

			for (Chk01_DtlR dtlR : up1()) {
				if(dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(dtlR.isStatusModify() || dtlR.isStatusNone()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if(dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}

			setPegNo(up1());
			setDispSeq(up1());
		}

		/** 
		 * 移動・移送予定のレコードを取得する。
		 * @param dtlR
		 * @return
		 */
		protected MST_XFR_SCHD_R getSchdR(Chk01_DtlR dtlR) {
			if(!isNull(dtlR.xfr_schd_no())){
				return _xfrSchdL.getFirst(_xfrSchdIdx, dtlR.xfr_schd_no());
			}
			return null;
		}

		/** 
		 * 移動引当状況のレコードを取得する。
		 * 分割行の場合は分割元の移動引当状況を取得する。
		 * @param dtlR
		 * @return
		 */
		protected MST_XFR_ALLOC_STS_R getAllocR(Chk01_DtlR dtlR) {
			if(!isNull(dtlR.xfr_alloc_sts_no())){
				return _xfrAllocL.getFirst(_xfrAllocIdx, dtlR.xfr_alloc_sts_no());
			}
			else if(!isNull(dtlR.old_xfr_alloc_sts_no())){
				return _xfrAllocL.getFirst(_xfrAllocIdx, dtlR.old_xfr_alloc_sts_no());
			}
			return null;
		}

		protected void callXfrInstServiceChk02() {
			MSBEL_XfrInstService.XfrInst_Chk02 ope = MSBEL_XfrInstService.crtXfrInst_Chk02();

			for(Chk01_DtlR upR : up1()) {
				XfrInstChk_HdrDtlR r = ope.up0().add();
				copy(r, up0(), createMap_XfrInstChk_HdrDtlR_Chk01_HdrR());
				copy(r, upR, createMap_XfrInstChk_HdrDtlR_Chk01_DtlR());
			}
			ope.exec();

			copyErrFlg(up1(), ope.down0());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 移動指図が取消可能かチェックする<br>
	 */
	public class Chk03 extends MSBEL_XfrInstReg_MC_A.Chk03 {
		protected MST_XFR_INST_R _xfrInstHdrR = MST_XFR_INST_R.create();
		protected MCList<MST_XFR_INST_D_R> _xfrInstDtlL = MCList.create(MST_XFR_INST_D_R.class);
		protected MCList<MST_XFR_SCHD_R> _xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MCIndexKey _xfrSchdIdx;
		protected MCIndexKey _xfrAllocIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callXfrInstServiceChk03();
			}
			setDown();
		}
		/**
		 * 更新カウンタチェックおよびトランザクションデータからの補完処理
		 * 更新前データのDACのチェック処理
		 */
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(chkXfrInst(up0()));
			if(!msgL.isEmpty()) {
				return msgL;
			}

			msgL.addAll(chkXfrSchd());
			if(!msgL.isEmpty()) {
				return msgL;
			}

			msgL.addAll(chkXfrAllocSts());
			return msgL;
		}

		/**
		 * 移動指図、移動指図明細のロック、更新カウンタチェック
		 */
		protected MCMessageList chkXfrInst(Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();
			// 指図ヘッダの検索
			MCQueryApiBuilder xfrInstHdrR_bldr = MCQueryApiBuilder.create(MST_XFR_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1010_MST_XFR_INST_S02", _xfrInstHdrR, xfrInstHdrR_bldr, hdrR);
			msgL.addAll(checkUpdCntrNE(hdrR, Chk01_HdrR.$inst_upd_cntr, _xfrInstHdrR));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			// 指図明細の検索
			MST_XFR_INST_D_R xfrInstDtlL_t = MST_XFR_INST_D_R.create("T");
			MCQueryApiBuilder xfrInstDtlL_bldr = MCQueryApiBuilder.create(xfrInstDtlL_t);
			xfrInstDtlL_bldr.setWhere(xfrInstDtlL_t.xfr_inst_no.eq(bind("xfr_inst_no")), hdrR);
			dbSelectForUpdate("MSBEL1010_MST_XFR_INST_D_S03", _xfrInstDtlL, xfrInstDtlL_bldr);
			return msgL;
		}

		/**
		 * 移動・移送予定のロック
		 */
		protected MCMessageList chkXfrSchd() {
			int cnt;
			MCMessageList msgL = new MCMessageList();

			cnt = setUpXfrSchdDbWork(up1());
			if(cnt == 0) {
				return msgL;
			}

			MST_XFR_SCHD_R xfrSchdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(xfrSchdL_t);
			MSW_XFR_SCHD_KEY_R t2 = MSW_XFR_SCHD_KEY_R.create("T2");
			xfrSchdL_bldr.addInnerJoin(t2, bracket(xfrSchdL_t.xfr_schd_no.eq(t2.xfr_schd_no)));
			xfrSchdL_bldr.setOrderByAsc(xfrSchdL_t.xfr_schd_no);
			dbSelectForUpdate("MSBEL1010_MST_XFR_SCHD_S05", _xfrSchdL, xfrSchdL_bldr);
			_xfrSchdIdx = _xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);

			return msgL;
		}

		protected int setUpXfrSchdDbWork(MCList<Chk01_DtlR> upL) {
			int cnt;
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ALLOC_STS_SV_R t2 = MST_XFR_ALLOC_STS_SV_R.create("T2");
			dbWkDelete("MSBEL1010_MSW_XFR_SCHD_D02", xfrSchdL_bldr.getBaseDbc());

			cnt = dbSelectKey("MSBEL1010_MST_XFR_SCHD_S06", xfrSchdL, xfrSchdL_bldr, upL.groupBy(Chk01_DtlR.$xfr_schd_no));
			dbWkInsert("MSBEL1010_MSW_XFR_SCHD_I03", xfrSchdL, xfrSchdL_bldr.getBaseDbc());

			xfrSchdL_bldr.setSelect(t.xfr_schd_no);
			xfrSchdL_bldr.addInnerJoin(t2, bracket(t.xfr_schd_no.eq(t2.xfr_schd_no)));
			xfrSchdL_bldr.addWhereWithAnd(t2.xfr_inst_d_no.eq(bind("xfr_inst_d_no")));
			cnt += dbSelect("MSBEL1010_MST_XFR_SCHD_S07", xfrSchdL, xfrSchdL_bldr, upL.groupBy(Chk01_DtlR.$xfr_inst_d_no));
			dbWkInsert("MSBEL1010_MSW_XFR_SCHD_I04", xfrSchdL, xfrSchdL_bldr.getBaseDbc());

			return cnt;
		}

		/**
		 * 移動引当状況のロック、更新カウンタチェック
		 */
		protected MCMessageList chkXfrAllocSts() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.xfr_alloc_sts_no()));
			if(bindL.isEmpty()) {
				return msgL;
			}
			bindL.sort(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			MST_XFR_ALLOC_STS_R xfrAllocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(xfrAllocL_t);
			xfrAllocL_bldr.setOrderByAsc(xfrAllocL_t.xfr_alloc_sts_no);
			dbSelectKeyForUpdateNoWait("MSBEL1010_MST_XFR_ALLOC_STS_S03", _xfrAllocL, xfrAllocL_bldr, bindL);
			_xfrAllocIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

			for (Chk01_DtlR r : bindL) {
				MST_XFR_ALLOC_STS_R selectR = _xfrAllocL.getFirst(_xfrAllocIdx, r.xfr_alloc_sts_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$alloc_sts_upd_cntr, selectR));
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCMessageList msgDacLgL = checkWritableLgGrpCdDac(_xfrInstHdrR, MST_XFR_INST_R.$lg_grp_cd);

			if (!msgDacLgL.isEmpty()) {
				MAM_LOC_R locR = getLoc(_xfrInstHdrR.lg_grp_cd());
				_xfrInstDtlL.addStringColumn("lg_grp_cd", _xfrInstHdrR.lg_grp_cd());
				MCList<MAM_ITM_LG_GRP_R> itmLgGrpL = getItmLgGrpLocL(_xfrInstDtlL);
				MCIndexKey idxkey = itmLgGrpL.createIndex(MAM_ITM_LG_GRP_R.$itm_cd,
						MAM_ITM_LG_GRP_R.$itm_sub1, MAM_ITM_LG_GRP_R.$itm_sub2,
						MAM_ITM_LG_GRP_R.$itm_sub3, MAM_ITM_LG_GRP_R.$lg_grp_cd);
				
				MCMessageList msgDacGiL = new MCMessageList();
				
				for (MST_XFR_INST_D_R dtlR : _xfrInstDtlL) {
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpL.getFirst(idxkey, dtlR.itm_cd(),
							dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(),
							_xfrInstHdrR.lg_grp_cd());
					for (MST_XFR_ALLOC_STS_R allocStsR : _xfrAllocL.subList(
							MST_XFR_ALLOC_STS_R.$xfr_inst_d_no, dtlR.xfr_inst_d_no())) {
						
						allocStsR.addStringColumn("chk_gi_loc_cd",
								!isNull(allocStsR.gi_loc_cd()) ? allocStsR.gi_loc_cd()
										: !isNull(itmLgGrpR) ? itmLgGrpR.lg_def_loc_cd()
												: !locR.isEmpty() ? locR.loc_cd() : null);
						
						msgDacGiL.addAll(checkWritableLocCdDac(allocStsR, "chk_gi_loc_cd"));
					}
				}
				
				if (!msgDacGiL.isEmpty()) {
					msgL.addAll(msgDacLgL);
					msgL.addAll(msgDacGiL);
				}
			}

			return msgL;
		}

		protected void callXfrInstServiceChk03() {
			MSBEL_XfrInstService.XfrInst_Chk03 ope = MSBEL_XfrInstService.crtXfrInst_Chk03();

			copy(ope.up0().add(), up0(), createMap_XfrInstChk_HdrDtlR_Chk01_HdrR());
			MCIndexKey
				instIdx = _xfrInstDtlL.createIndex(MST_XFR_INST_D_R.$xfr_inst_no),
				up1Idx = up1().createIndex(Chk01_DtlR.$xfr_inst_d_no, Chk01_DtlR.$wms_flg);
			for (XfrInstChk_HdrDtlR up0R : ope.up0()) {
				for (MST_XFR_INST_D_R instDR : _xfrInstDtlL.subList(instIdx, up0R.xfr_inst_no())) {
					Chk01_DtlR dtlR = up1().getFirst(up1Idx, instDR.xfr_inst_d_no(), true);
					if (!isNull(dtlR)) {
						up0R.wms_flg(true);
						break;
					}
				}
			}
			ope.exec();
			up0().err_flg(ope.down0().get(0).err_flg());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 帳票が発行可能かチェックする<br>
	 */
	public class Chk04 extends MSBEL_XfrInstReg_MC_A.Chk04 {
		protected MST_XFR_INST_R _xfrInstHdrR = MST_XFR_INST_R.create();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		/**
		 * 更新カウンタチェックおよびトランザクションデータからの補完処理
		 * 更新前データのDACのチェック処理
		 */

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(lockAndCheckBase());
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkXfrInst(up0()));
			msgL.addAll(chkXfrInstD());
			return msgL;
		}

		/**
		 * 移動指図、移動指図明細のロック、更新カウンタチェック
		 */
		protected MCMessageList chkXfrInst(Chk01_HdrR hdrR) {
			MCMessageList msgL = new MCMessageList();

			MCQueryApiBuilder xfrInstHdrR_bldr = MCQueryApiBuilder.create(MST_XFR_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1010_MST_XFR_INST_S03", _xfrInstHdrR, xfrInstHdrR_bldr, hdrR);
			msgL.addAll(checkUpdCntrNE(hdrR, Chk01_HdrR.$inst_upd_cntr, _xfrInstHdrR));

			return msgL;
		}
		/** 
		 * 移動指図明細のレコードをチェックする。
		 * @param hdrR
		 * @return
		 */
		protected MCMessageList chkXfrInstD() {
			MCMessageList msgL = new MCMessageList();

			if (MAC_TRD_PTN_TYP.isPROV_RTN(_xfrInstHdrR.trd_ptn_typ())) {
				for (Chk04_DtlR r : up1()) {
					if (isNull(r.base_ac_dt())) {
						msgL.add(new MCMessage(r, Chk04_DtlR.$base_ac_dt, MSBEL1105, toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	// ---- check共通
	/**
	 * 支給かどうか
	 * 社内場所から社外場所への移動なら支給。
	 * @param dtlR
	 * @return
	 */
	protected boolean isProv(Chk01_DtlR dtlR) {
		return isNullOrNullVal(dtlR.gi_sppl_cd())
				&& !isNullOrNullVal(dtlR.gr_sppl_cd());
	}

	/**
	 * 支給返品かどうか
	 * 社外場所から社内場所への移動なら支給返品。
	 * @param dtlR
	 * @return
	 */
	protected boolean isProvRtn(Chk01_DtlR dtlR) {
		return !isNullOrNullVal(dtlR.gi_sppl_cd())
				&& isNullOrNullVal(dtlR.gr_sppl_cd());
	}

	/**
	 * 直送支給かどうか
	 * 社外場所から社外場所へかつ異なる発注先間での移動なら直送支給。
	 * @param dtlR
	 * @return
	 */
	protected boolean isProvDD(Chk01_DtlR dtlR) {
		return !isNullOrNullVal(dtlR.gi_sppl_cd())
				&& !isNullOrNullVal(dtlR.gr_sppl_cd())
				&& !isSame(dtlR.gi_sppl_cd(), dtlR.gr_sppl_cd());
	}

	/**
	 * 支給区分と支給計上区分を設定する。
	 * @param idx
	 */
	protected void setProvInfo(Chk01_DtlR r) {
		if(MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())) {
			r.prov_typ(MAC_PROV_TYP.FFR_PROV.value());
		}
	}

	/**
	 * 支給区分（返品）と支給計上区分（返品）を設定する。
	 * @param idx
	 */
	protected void setRetProvInfo(Chk01_DtlR r) {
		if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
			r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
			r.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
		}
		else if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
				&& isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
			r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
			r.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
		}
		else {
			r.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
		}
	}

	/**
	 * 画面入力相当の補完とチェック
	 * @param notErrL
	 * @return メッセージリスト
	 */
	protected MCMessageList checkAndCompEqScreen(Chk01_HdrR hdrR, MCList<Chk01_DtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();

		for(Chk01_DtlR r : notErrL) {
			r.trd_cd(hdrR.trd_cd());
			r.trd_ptn_typ(hdrR.trd_ptn_typ());
			r.gr_loc_cd(hdrR.gr_loc_cd());
			r.gr_wg_cd(hdrR.wg_cd());
			r.gr_lg_grp_cd(hdrR.lg_grp_cd());
			r.gr_sppl_cd(hdrR.gr_sppl_cd());
			r.gr_onr_prsppl_flg(hdrR.gr_onr_prsppl_flg());

			msgL.addAll(checkStkUtilTrdPtnTypAndGiGrLoc(
					r,
					Chk01_DtlR.$trd_cd,
					Chk01_DtlR.$trd_ptn_typ,
					Chk01_DtlR.$gi_loc_cd,
					Chk01_DtlR.$gi_sppl_cd,
					Chk01_DtlR.$gr_loc_cd,
					Chk01_DtlR.$gr_sppl_cd));

			if(r.alloc_flg()) {
				if(r.lot_none_flg()) {
					r.lot_no(null);
					r.sublot_no(null);
				}
			}
			if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
				r.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
			if (!r.def_ver_flg()) {
				r.ver_no(null);
			}
			else {
				msgL.addAll(check(r, Chk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
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

			if (!isNull(r.gi_loc_cd())) {
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
					false,
					false));

			if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				r.stk_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
				r.stk_bp_cd(r.gi_sppl_cd());
				r.stk_bp_nm(r.gi_sppl_nm());
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

			if(isProv(r)) {
				setProvInfo(r);
			}
			else if(isProvRtn(r)) {
				setRetProvInfo(r);
			}
			else if(isProvDD(r)) {
				setProvInfo(r);
				setRetProvInfo(r);
			}

			if (isProv(r) || isProvDD(r)) {
				msgL.addAll(check(r, Chk01_DtlR.$prov_typ, new FXUCL_RequiredValidater()));
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
		}
		return msgL;
	}

	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopL;
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStopR; 

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
			if(!isNull(itmStopR.xfr_stop_dt()) && itmStopR.xfr_stop_dt().lte(hdrR.xfr_inst_dt())) {
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
		if (isNull(hdrR.gr_sppl_cd())) {
			return msgL;
		}

		initBpStopR();
		MAM_BP_STOP_R bpStopR = _bpStopR.get(hdrR.gr_sppl_cd());
		if(!isNull(bpStopR.xfr_stop_dt()) && bpStopR.xfr_stop_dt().lte(hdrR.xfr_inst_dt())) {
			msgL.add(new MCMessage(
					hdrR,
					Chk01_HdrR.$gr_loc_cd,
					MSBEL0289,
					hdrR.gr_sppl_cd(),
					toDispGUIIndex(hdrR)));
		}
		return msgL;
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 移動指図を新規登録する<br>
	 */
	public class Ins01 extends MSBEL_XfrInstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk01();
			throwUpdErr();
			callXfrInstSrvIns02();
			setDown();
		}

		protected void callThisChk01() {
			MSBEL_XfrInstReg.Chk01 op = MSBEL_XfrInstReg.crtChk01();
			MCRow.copyall(op.up0(),up0());
			op.up1().setAll(up1());
			op.exec();
			MCRow.copyall(up0(), op.down0());
			up1().setAll(op.down1());
		}

		protected void callXfrInstSrvIns02() {
			MSBEL_XfrInstService.XfrInst_Ins02 op = MSBEL_XfrInstService.crtXfrInst_Ins02();
			copy(op.up0(), up0(), createMap_XfrInst_HdrR_Chk01_HdrR());
			addAll(op.up1(), up1(), createMap_XfrInst_DtlR_Chk01_DtlR());
			op.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());

			op.exec();
			copyDown(op);
		}

		protected void copyDown(MSBEL_XfrInstService.XfrInst_Ins02 ope) {
			up0().xfr_inst_no(ope.down0().xfr_inst_no());
			up0().inst_prnt_flg(ope.down0().inst_prnt_flg());
			up0().pick_prnt_flg(ope.down0().pick_prnt_flg());
			up0().dlv_prnt_flg(ope.down0().dlv_prnt_flg());

			String[] destCols = new String[] {
					Chk01_DtlR.$xfr_inst_d_no,
					Chk01_DtlR.$xfr_inst_no,
					Chk01_DtlR.$pr_sts_typ,
					Chk01_DtlR.$io_schd_pr_no,
					Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_d_no,
					Chk01_DtlR.$xfr_alloc_sts_no,
					Chk01_DtlR.$old_xfr_alloc_sts_no,
					Chk01_DtlR.$prov_schd_no,
					Chk01_DtlR.$ret_prov_schd_no};
			String[] srcCols = new String[] {
					XfrInst_DtlR.$xfr_inst_d_no,
					XfrInst_DtlR.$xfr_inst_no,
					XfrInst_DtlR.$pr_sts_typ,
					XfrInst_DtlR.$io_schd_pr_no,
					XfrInst_DtlR.$dlv_slip_no,
					XfrInst_DtlR.$dlv_slip_d_no,
					XfrInst_DtlR.$xfr_alloc_sts_no,
					XfrInst_DtlR.$old_xfr_alloc_sts_no,
					XfrInst_DtlR.$prov_schd_no,
					XfrInst_DtlR.$ret_prov_schd_no};
			copyByPegNo(up1(), destCols, ope.down1(), srcCols);
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			for (Chk01_DtlR r :up1()) {
				if (!r.inst_bndl_src_flg()) {
					down1().add(r);
				}
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 移動指図を訂正する<br>
	 */
	public class Upd01 extends MSBEL_XfrInstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk02();
			throwUpdErr();
			callXfrInstSrvUpd02();
			setDown();
			}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected void callThisChk02() {
			MSBEL_XfrInstReg.Chk02 op = MSBEL_XfrInstReg.crtChk02();
			MCRow.copyall(op.up0(),up0());
			op.up1().setAll(up1());
			op.exec();
			MCRow.copyall(up0(), op.down0());
			up1().setAll(op.down1());
		}

		protected void callXfrInstSrvUpd02() {
			MSBEL_XfrInstService.XfrInst_Upd02 ope = MSBEL_XfrInstService.crtXfrInst_Upd02();

			copy(ope.up0(), up0(), createMap_XfrInst_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_XfrInst_DtlR_Chk01_DtlR());
			ope.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());
			ope.exec();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 移動指図を取消する<br>
	 */
	public class Del01 extends MSBEL_XfrInstReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk03();
			throwUpdErr();
			callXfrInstSrvDel02();
			}

		protected void editUp() {
			up0().setStatus(MCRow.Status.NONE);
			// チェック処理で必須チェックを行わないようにするために予めDELETEにしておく
			for(Chk01_DtlR dtlR : up1()) {
				dtlR.setStatus(MCRow.Status.DELETE);
			}
		}

		protected void callThisChk03() {
			MSBEL_XfrInstReg.Chk03 op = MSBEL_XfrInstReg.crtChk03();
			MCRow.copyall(op.up0(),up0());
			op.up1().setAll(up1());
			op.exec();
			MCRow.copyall(up0(),op.down0());
		}

		protected void callXfrInstSrvDel02() {
			MSBEL_XfrInstService.XfrInst_Del02 ope = MSBEL_XfrInstService.crtXfrInst_Del02();

			copy(ope.up0(), up0(), createMap_XfrInst_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_XfrInst_DtlR_Chk01_DtlR());
			ope.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());
			ope.exec();

		}
	}

	protected void setBaseUnitQty(Srch01_DtlR dtlR) {
		if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
	}

	protected void setBaseUnitQty(Chk01_DtlR dtlR) {
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
	 * 出庫在庫着荷先は、出庫場所が社内場所のときは NULL 文字固定とする。<br>
	 * また、出庫場所が外注場所のときは NULL もしくは出庫場所に対する外注先のみとする。
	 * @param dtlL
	 */
	protected void setGiStkArrvBp(Chk01_DtlR dtlR) {
		if (isNull(dtlR.gi_sppl_cd())) {
			// 社内場所の場合
			dtlR.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
		}
		else {
			// 社外場所の場合
			if (!isNull(dtlR.gi_stk_arrv_bp_cd())) {
				dtlR.gi_stk_arrv_bp_cd(dtlR.gi_sppl_cd());
			}
		}
	}

	protected void clearNullVal(Chk01_DtlR dtlR) {
		if (isSame(dtlR.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value())) {
			dtlR.gi_stk_arrv_bp_cd(null);
		}

		if (isSame(dtlR.stk_bp_cd(), MAC_STR.NULL_VAL.value())) {
			dtlR.stk_bp_cd(null);
		}
	}

	/**
	 * 計画外指図で出庫場所が外注先の場合、支給区分（返品）を次のように編集する。<br>
	 * 「在庫識別区分が自社在庫」かつ「在庫着荷先がNULL文字ではない」場合 ⇒ 無償支給<br>
	 * 「在庫識別区分が自社在庫」かつ「在庫着荷先がNULL文字」の場合 ⇒ 空白<br>
	 * 在庫識別区分が有償支給の場合 ⇒ 有償支給
	 * @param hdrR
	 * @param dtlL
	 */
	protected void setRetProvTyp(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		if (!isSame(hdrR.xfr_inst_no(), MAC_STR.NULL_VAL.value()) || !isSame(dtlR.xfr_alloc_sts_no(), MAC_STR.NULL_VAL.value())
				|| isNull(dtlR.gi_sppl_cd())) {
			return;
		}

		if (MSC_STK_ID_TYP.isCOSTK(dtlR.stk_id_typ())) {
			if (!isSame(dtlR.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value())) {
				dtlR.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
			}
			else {
				dtlR.ret_prov_typ(null);
			}
		}
		else if (MSC_STK_ID_TYP.isONR_PROV(dtlR.stk_id_typ())) {
			dtlR.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
		}
	}

	protected Map_XfrInst_HdrR_Chk01_HdrR<XfrInst_HdrR,Chk01_HdrR> createMap_XfrInst_HdrR_Chk01_HdrR() {
		return new Map_XfrInst_HdrR_Chk01_HdrR<XfrInst_HdrR, Chk01_HdrR>();
	}

	public class Map_XfrInst_HdrR_Chk01_HdrR<D extends XfrInst_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInst_HdrR.$xfr_inst_no, Chk01_HdrR.$xfr_inst_no);
			addColumnPathMap(XfrInst_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(XfrInst_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(XfrInst_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(XfrInst_HdrR.$lg_grp_cd, Chk01_HdrR.$lg_grp_cd);
			addColumnPathMap(XfrInst_HdrR.$gr_loc_cd, Chk01_HdrR.$gr_loc_cd);
			addColumnPathMap(XfrInst_HdrR.$xfr_schd_dt, Chk01_HdrR.$xfr_schd_dt);
			addColumnPathMap(XfrInst_HdrR.$xfr_inst_dt, Chk01_HdrR.$xfr_inst_dt);
			addColumnPathMap(XfrInst_HdrR.$inst_usr_cd, Chk01_HdrR.$inst_usr_cd);
			addColumnPathMap(XfrInst_HdrR.$inst_dpt_cd, Chk01_HdrR.$inst_dpt_cd);
			addColumnPathMap(XfrInst_HdrR.$inst_prnt_flg, Chk01_HdrR.$inst_prnt_flg);
			addColumnPathMap(XfrInst_HdrR.$dlv_prnt_flg, Chk01_HdrR.$dlv_prnt_flg);
			addColumnPathMap(XfrInst_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(XfrInst_HdrR.$inst_rmrks, Chk01_HdrR.$inst_rmrks);
			addColumnPathMap(XfrInst_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(XfrInst_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(XfrInst_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(XfrInst_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(XfrInst_HdrR.$immd_inst_prnt_flg, Chk01_HdrR.$inst_print);
			addColumnPathMap(XfrInst_HdrR.$immd_pick_prnt_flg, Chk01_HdrR.$pick_print);
			addColumnPathMap(XfrInst_HdrR.$immd_dlv_prnt_flg, Chk01_HdrR.$dlv_print);
		}
	}

	protected Map_XfrInst_DtlR_Chk01_DtlR<XfrInst_DtlR,Chk01_DtlR> createMap_XfrInst_DtlR_Chk01_DtlR() {
		return new Map_XfrInst_DtlR_Chk01_DtlR<XfrInst_DtlR, Chk01_DtlR>();
	}

	public class Map_XfrInst_DtlR_Chk01_DtlR<D extends XfrInst_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInst_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(XfrInst_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(XfrInst_DtlR.$xfr_inst_d_no, Chk01_DtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrInst_DtlR.$pr_sts_typ, Chk01_DtlR.$pr_sts_typ);
			addColumnPathMap(XfrInst_DtlR.$xfr_inst_no, Chk01_DtlR.$xfr_inst_no);
			addColumnPathMap(XfrInst_DtlR.$gi_loc_cd, Chk01_DtlR.$gi_loc_cd);
			addColumnPathMap(XfrInst_DtlR.$gi_str_ln_cd, Chk01_DtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrInst_DtlR.$gi_stk_arrv_bp_cd, Chk01_DtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrInst_DtlR.$gr_str_ln_cd, Chk01_DtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrInst_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(XfrInst_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(XfrInst_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(XfrInst_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(XfrInst_DtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
			addColumnPathMap(XfrInst_DtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
			addColumnPathMap(XfrInst_DtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
			addColumnPathMap(XfrInst_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(XfrInst_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(XfrInst_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(XfrInst_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(XfrInst_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(XfrInst_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(XfrInst_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(XfrInst_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(XfrInst_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(XfrInst_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(XfrInst_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(XfrInst_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(XfrInst_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(XfrInst_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(XfrInst_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(XfrInst_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
			addColumnPathMap(XfrInst_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(XfrInst_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(XfrInst_DtlR.$not_lot_mix_flg, Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(XfrInst_DtlR.$not_sublot_mix_flg, Chk01_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(XfrInst_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(XfrInst_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(XfrInst_DtlR.$inst_d_rmrks, Chk01_DtlR.$inst_d_rmrks);
			addColumnPathMap(XfrInst_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(XfrInst_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(XfrInst_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(XfrInst_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(XfrInst_DtlR.$sno1_null_flg, Chk01_DtlR.$sno1_null_flg);
			addColumnPathMap(XfrInst_DtlR.$sno2_null_flg, Chk01_DtlR.$sno2_null_flg);
			addColumnPathMap(XfrInst_DtlR.$sno3_null_flg, Chk01_DtlR.$sno3_null_flg);
			addColumnPathMap(XfrInst_DtlR.$sno4_null_flg, Chk01_DtlR.$sno4_null_flg);
			addColumnPathMap(XfrInst_DtlR.$alloc_sno1, Chk01_DtlR.$alloc_sno1);
			addColumnPathMap(XfrInst_DtlR.$alloc_sno2, Chk01_DtlR.$alloc_sno2);
			addColumnPathMap(XfrInst_DtlR.$alloc_sno3, Chk01_DtlR.$alloc_sno3);
			addColumnPathMap(XfrInst_DtlR.$alloc_sno4, Chk01_DtlR.$alloc_sno4);
			addColumnPathMap(XfrInst_DtlR.$alloc_flg, Chk01_DtlR.$alloc_flg);
			addColumnPathMap(XfrInst_DtlR.$inst_bndl_flg, Chk01_DtlR.$inst_bndl_flg);
			addColumnPathMap(XfrInst_DtlR.$inst_bndl_src_flg, Chk01_DtlR.$inst_bndl_src_flg);
			addColumnPathMap(XfrInst_DtlR.$inst_bndl_peg_no, Chk01_DtlR.$inst_bndl_peg_no);
			addColumnPathMap(XfrInst_DtlR.$inst_bndl_to_peg_no, Chk01_DtlR.$inst_bndl_to_peg_no);
			addColumnPathMap(XfrInst_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(XfrInst_DtlR.$xfr_alloc_sts_no, Chk01_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrInst_DtlR.$old_xfr_alloc_sts_no, Chk01_DtlR.$old_xfr_alloc_sts_no);
			addColumnPathMap(XfrInst_DtlR.$xfr_schd_no, Chk01_DtlR.$xfr_schd_no);
			addColumnPathMap(XfrInst_DtlR.$prov_schd_no, Chk01_DtlR.$prov_schd_no);
			addColumnPathMap(XfrInst_DtlR.$prov_typ, Chk01_DtlR.$prov_typ);
			addColumnPathMap(XfrInst_DtlR.$prov_basis_typ, Chk01_DtlR.$prov_basis_typ);
			addColumnPathMap(XfrInst_DtlR.$ret_prov_schd_no, Chk01_DtlR.$ret_prov_schd_no);
			addColumnPathMap(XfrInst_DtlR.$ret_prov_typ, Chk01_DtlR.$ret_prov_typ);
			addColumnPathMap(XfrInst_DtlR.$ret_prov_basis_typ, Chk01_DtlR.$ret_prov_basis_typ);
			addColumnPathMap(XfrInst_DtlR.$wms_flg, Chk01_DtlR.$wms_flg);
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * ロット提案を行う<br>
	 */
	public class Sprt01 extends MSBEL_XfrInstReg_MC_A.Sprt01 {
		protected MCList<Srch_RsltR> _allocRsltL = MCList.create(Srch_RsltR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			initCache();
			editUp();

			if (!doChk()) {
				return ;
			}

			// 選択がオフのレコードに対して受払予定の削除と追加を実施し、引当管理サービスを実行
			callIoSchdServiceDel01(up1().subList(r -> !isNull(r.xfr_alloc_sts_no()) && !r.check()));
			callIoSchdServiceIns01(up1().subList(r -> isIoSchdServiceIns01R(r)));
			callAllocMngServiceAllocSrch01(up1().subList(Sprt01_DtlR.$check, true));
			dbTran().rollback();

			setDown();
		}

		protected boolean isIoSchdServiceIns01R(Sprt01_DtlR r) {
			return !r.check()
					&& r.alloc_flg()
					&& (r.isStatusCreate() || r.isStatusModify())
					&& !isNull(r.itm_cd())
					&& !isNull(r.itm_sub1())
					&& !isNull(r.itm_sub2())
					&& !isNull(r.itm_sub3())
					&& !isNull(r.trd_unit_cd())
					&& !isNull(r.trd_unit_qty())
					&& !isNull(r.base_unit_cd())
					&& !isNull(r.base_unit_qty());
		}

		protected void initCache() {
			initGrLocCache();
			initTrdCache();
			initItmCache(up1());
			initXfrAllocCache(up1());
			initItmUnitCache(up1());
		}

		protected void editUp() {
			for (Sprt01_DtlR upR : up1()) {
				MAM_ITM_R itmCacheR = getItmCache().getEx(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.trd_unit_cd());
				MAM_TRD_R trdCacheR = getTrdCache().getEx(up0().trd_cd());
				MAM_LOC_R grLocCacheR = getGrLocCache().getEx(up0().gr_loc_cd());

				// マスタからの補完
				upR.trd_ptn_typ(trdCacheR.trd_ptn_typ());
				upR.lg_grp_cd(grLocCacheR.lg_grp_cd());
				upR.base_unit_cd(itmCacheR.unit_cd());

				// トランからの補完
				if(isNull(upR.xfr_alloc_sts_no())) {
					// 新規追加行
					upR.not_lot_mix_flg(false);
					upR.not_sublot_mix_flg(false);
					upR.vld_dt_fr(null);
				}
				else {
					// 予定ありまたは指図済行
					MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().get(upR.xfr_alloc_sts_no());
					upR.not_lot_mix_flg(allocR.not_lot_mix_flg());
					upR.not_sublot_mix_flg(allocR.not_sublot_mix_flg());
					upR.vld_dt_fr(allocR.vld_dt_fr());
				}

				// 計算によって求める項目
				upR.base_unit_qty(convToBaseUnit(
						upR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmCacheR.dec_place(), itmCacheR.rnd_typ()));

				// 固定値での補完
				upR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
				upR.io_schd_typ(getIoSchdTypForMove(upR.trd_ptn_typ()));
				upR.stk_alloc_flg(false);

				// その他
				upR.gr_str_ln_cd(nvl(upR.gr_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				if (upR.gi_str_ln_cd_none_flg()) {
					upR.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				upR.gd_cd(nvl(upR.gd_cd(), nvl(getSysParm("DEF_STK_GD_CD"), getDefaultFeedStkGd().gd_cd())));
			}
		}

		/**
		 * チェック処理
		 */
		protected boolean doChk() {
			List<IfValidater> valL = new ArrayList<IfValidater>();
			valL.add(new FXUCL_RequiredValidater());
			MCMessagePool.addAll(check(up0(), Sprt01_HdrR.$xfr_schd_dt, valL));
			MCMessagePool.addAll(check(up0(), Sprt01_HdrR.$gr_loc_cd, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$itm_cd, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$itm_sub1, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$itm_sub2, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$itm_sub3, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$trd_unit_cd, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$trd_unit_qty, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$gd_cd, valL));
			MCMessagePool.addAll(check(up1(), Sprt01_DtlR.$quality_typ, valL));
			xfrAllocStsExistsCheck();
			return MCMessagePool.size() == 0;
		}

		/**
		 * 移動引当状況が取得できるかのチェック
		 * 画面を開いた後に移動予定などが変更されると、
		 * 紐づく移動引当状況が無くなっていることがある
		 * 紐づく移動引当状況が存在するか確認し、無いなら排他エラーメッセージを出力する
		 */
		protected void xfrAllocStsExistsCheck() {
			MCList<Sprt01_DtlR> dtlL = up1().subList(Sprt01_DtlR.$check, true);
			
			for (Sprt01_DtlR dtlR : dtlL.subList(r -> !isNull(r.xfr_alloc_sts_no()))) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().get(dtlR.xfr_alloc_sts_no());
				
				if(allocR.isEmpty()) {
					MCMessagePool.add(msgExclusionErrUpd(dtlR));
					return;
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(setAllocRsltL(up1()));
		}

		protected MCList<Srch_TgtR> setStkAlloc(MCList<Sprt01_DtlR> packageL) {
			MCList<Srch_TgtR> alcL = MCList.create(Srch_TgtR.create());
			for (Sprt01_DtlR dtlR : packageL) {
				
				Srch_TgtR alcR = Srch_TgtR.create();
				copy(alcR, dtlR, createMap_Srch_TgtR_Sprt01_DtlR());
				
				if (isNull(dtlR.xfr_alloc_sts_no())) {
					alcL.add(alcR);
					continue;
				}
				
				MST_XFR_ALLOC_STS_R xfrAlloc = getXfrAllocCache().getEx(dtlR.xfr_alloc_sts_no());
				
				// 変更前数量＜変更後数量の場合の設定
				if (dtlR.base_unit_qty().gt(xfrAlloc.base_unit_qty())) {
					alcR.base_unit_qty(xfrAlloc.base_unit_qty());
					if (xfrAlloc.alloc_flg()) {
						alcR.except_alloc_wait_flg(true);
					} else {
						alcR.except_alloc_wait_flg(false);
					}
					
					MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(
							dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
					
					if (itmUnitR.pack_flg()) {
						alcR.pack_unit_qty(rvrsBaseUnitConv(alcR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
								itmUnitR.dec_place(), itmUnitR.rnd_typ()));
					}
					
					Srch_TgtR alcWaitR = alcR.clone();
					alcWaitR.base_unit_qty(dtlR.base_unit_qty().subtract(xfrAlloc.base_unit_qty()));
					alcWaitR.except_alloc_wait_flg(false);
					
					if (itmUnitR.pack_flg()) {
						alcWaitR.pack_unit_qty(rvrsBaseUnitConv(alcWaitR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
								itmUnitR.dec_place(), itmUnitR.rnd_typ()));
					}
					alcL.add(alcWaitR);
				} else {
					// 変更前数量＞＝変更後数量の場合の設定
					if (xfrAlloc.alloc_flg()) {
						alcR.except_alloc_wait_flg(true);
					} else {
						alcR.except_alloc_wait_flg(false);
					}
				}
				alcL.add(alcR);
			}
			return alcL;
		}

		protected void callAllocMngServiceAllocSrch01(MCList<Sprt01_DtlR> dtlL) {
			if(dtlL.isEmpty()) {
				return;
			}

			MSBEL_AllocMngService.Alloc_Srch01 op = MSBEL_AllocMngService.crtAlloc_Srch01();
			op.up0().stk_flg(false);
			op.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			op.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			op.up0().nm_srch_flg(true);

			// 引当済のものから先に引当処理を行うことで引当処理の度に未引当が分割されるのを防ぐ
			MCList<Sprt01_DtlR> packageL = dtlL.subList(r -> !isNull(r.peg_no()));
			packageL.sort(SortType.DESC, Sprt01_DtlR.$alloc_flg);
			op.up1().addAll(setStkAlloc(packageL));

			// 削除対象の出庫予定（移動予定）を上り電文に追加
			for (Sprt01_DtlR dtlR : dtlL.subList(r -> !isNull(r.xfr_alloc_sts_no()))) {
				Srch_Io_SchdR r = Srch_Io_SchdR.create();
				r.io_schd_typ(dtlR.io_schd_typ());
				r.io_schd_no(dtlR.xfr_alloc_sts_no());
				r.io_schd_sts_typ(getIoSchdStsTyp(dtlR));
				op.up3().add(r);
			}

			MCSortPolicy sp = new MCSortPolicy();
			// 出庫日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
			op.up1().sort(sp);

			op.exec();
			MCGroupByPolicy policy = new MCGroupByPolicy(
					Srch_RsltR.$peg_no,
					//Srch_RsltR.$schd_dt, // 画面で保持していない項目をまとめ条件にいれると複数回実行したときに同じ結果になることを保証できないのでやめる
					Srch_RsltR.$itm_cd,
					Srch_RsltR.$itm_sub1,
					Srch_RsltR.$itm_sub2,
					Srch_RsltR.$itm_sub3,
					Srch_RsltR.$ver_no,
					Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_loc_nm,
					Srch_RsltR.$stk_str_ln_tgt_flg,
					Srch_RsltR.$stk_str_ln_cd,
					Srch_RsltR.$stk_str_ln_nm,
					Srch_RsltR.$stk_arrv_bp_cd,
					Srch_RsltR.$stk_arrv_bp_nm,
					Srch_RsltR.$stk_sppl_cd,
					Srch_RsltR.$stk_lg_grp_cd,
					Srch_RsltR.$asst_typ,
					Srch_RsltR.$in_xfr_typ,
					Srch_RsltR.$quality_typ,
					Srch_RsltR.$stk_insp_typ,
					Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd,
					Srch_RsltR.$stk_bp_nm,
					Srch_RsltR.$gd_cd,
					Srch_RsltR.$gd_nm,
					Srch_RsltR.$lot_no,
					Srch_RsltR.$sublot_no,
					Srch_RsltR.$sno1,
					Srch_RsltR.$sno2,
					Srch_RsltR.$sno3,
					Srch_RsltR.$sno4,
					Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$base_unit_nm,
					Srch_RsltR.$base_unit_dec_place,
					Srch_RsltR.$vld_dt_fr,
					Srch_RsltR.$vld_dt_to,
					Srch_RsltR.$pack_unit_cd
					);
			policy.sum(
					Srch_RsltR.$base_unit_qty,
					Srch_RsltR.$pack_unit_qty);
			_allocRsltL.setAll(op.down0().groupBy(policy));
		}

		/**
		 * 引当結果を上り電文に反映して返す
		 */
		protected MCList<Sprt01_DtlR> setAllocRsltL(MCList<Sprt01_DtlR> list) {
			MCList<Sprt01_DtlR> l = MCList.create(Sprt01_DtlR.class);
			MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

			for (Sprt01_DtlR r : list.subList(Sprt01_DtlR.$check, true)) {

				MCNumber remain_qty = MCNumber.ZERO;

				rsltL.init();
				if (!_allocRsltL.isEmpty()) {
					rsltL = _allocRsltL.subList(Srch_RsltR.$peg_no, r.peg_no());
				}
				if (rsltL.isEmpty()) {
					r.no_alloc_flg(true);
					l.add(r);
				}
				else {
					// 引当できた
					remain_qty = r.base_unit_qty();

					MAVM_ITM_UNIT_R trdItmUnitR = getItmUnitCache().getEx(
							r.itm_cd(),
							r.itm_sub1(),
							r.itm_sub2(),
							r.itm_sub3(),
							r.trd_unit_cd());

					for (Srch_RsltR rsltR : rsltL) {
						// 引当できた分のレコード作成
						Sprt01_DtlR tmpR = r.clone();
						tmpR.lot_no(rsltR.lot_no());
						tmpR.sublot_no(rsltR.sublot_no());
						tmpR.ver_no(rsltR.ver_no());

						// 荷姿単位での引当の場合
						if(isSame(tmpR.trd_unit_cd(), rsltR.pack_unit_cd())) {
							tmpR.trd_unit_qty(rsltR.pack_unit_qty());
						}
						// 基準単位での引当の場合
						else {
							MCNumber trdQty = rvrsBaseUnitConv(
									rsltR.base_unit_qty(),
									trdItmUnitR.conv_base_qty(),
									trdItmUnitR.conv_qty(),
									trdItmUnitR.dec_place(),
									trdItmUnitR.rnd_typ(),
									true);
							if(isNull(trdQty)) {
								tmpR.trd_unit_cd(rsltR.base_unit_cd());
								tmpR.trd_unit_nm(rsltR.base_unit_nm());
								tmpR.trd_unit_conv_base_qty(MCNumber.ONE);
								tmpR.trd_unit_conv_qty(MCNumber.ONE);
								tmpR.trd_unit_dec_place(rsltR.base_unit_dec_place());
								tmpR.trd_unit_rnd_typ(rsltR.base_unit_rnd_typ());
								tmpR.trd_unit_qty(rsltR.base_unit_qty());
							}
							else {
								tmpR.trd_unit_qty(trdQty);
							}
						}
						tmpR.base_unit_qty(rsltR.base_unit_qty());
						tmpR.gi_loc_cd(rsltR.stk_loc_cd());
						tmpR.gi_loc_nm(rsltR.stk_loc_nm());
						tmpR.gi_str_ln_tgt_flg(rsltR.stk_str_ln_tgt_flg());
						tmpR.gi_str_ln_cd(rsltR.stk_str_ln_cd());
						tmpR.gi_str_ln_nm(rsltR.stk_str_ln_nm());
						tmpR.gi_str_ln_cd_none_flg(isSame(rsltR.stk_str_ln_cd(), MAC_STR.NULL_VAL.value()));
						tmpR.gi_stk_arrv_bp_cd(rsltR.stk_arrv_bp_cd());
						tmpR.gi_stk_arrv_bp_nm(rsltR.stk_arrv_bp_nm());
						tmpR.gd_cd(rsltR.gd_cd());
						tmpR.gd_nm(rsltR.gd_nm());
						tmpR.quality_typ(rsltR.quality_typ());
						tmpR.alloc_sno1(rsltR.sno1());
						tmpR.alloc_sno2(rsltR.sno2());
						tmpR.alloc_sno3(rsltR.sno3());
						tmpR.alloc_sno4(rsltR.sno4());
						tmpR.stk_id_typ(rsltR.stk_id_typ());
						tmpR.stk_bp_cd(rsltR.stk_bp_cd());
						tmpR.stk_bp_nm(rsltR.stk_bp_nm());

						l.add(tmpR);

						// 残数
						remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
					}
					// 残数がある場合は未引当レコードを作成する
					// 未引当行は単位と数量のみ下らせる
					if (remain_qty.isPositive()) {
						Sprt01_DtlR tmpR = r.clone();
						MCNumber trdQty = rvrsBaseUnitConv(
								remain_qty,
								trdItmUnitR.conv_base_qty(),
								trdItmUnitR.conv_qty(),
								trdItmUnitR.dec_place(),
								trdItmUnitR.rnd_typ(),
								true);
						if(isNull(trdQty)) {
							Srch_RsltR rsltR = rsltL.get(0);
							tmpR.trd_unit_cd(rsltR.base_unit_cd());
							tmpR.trd_unit_nm(rsltR.base_unit_nm());
							tmpR.trd_unit_conv_base_qty(MCNumber.ONE);
							tmpR.trd_unit_conv_qty(MCNumber.ONE);
							tmpR.trd_unit_dec_place(rsltR.base_unit_dec_place());
							tmpR.trd_unit_rnd_typ(rsltR.base_unit_rnd_typ());
							tmpR.trd_unit_qty(remain_qty);
						}
						else {
							tmpR.trd_unit_qty(trdQty);
						}
						tmpR.base_unit_qty(remain_qty);
						tmpR.no_alloc_flg(true);
						l.add(tmpR);
					}
				}
			}
			setWmsflgSprt(l);
			return l;
		}
		protected void setWmsflgSprt(MCList<Sprt01_DtlR> dtlL) {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, Sprt01_DtlR> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (Sprt01_DtlR dtlR : dtlL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value());
				r.loc_cd(dtlR.gi_loc_cd());
				r.lg_grp_cd(dtlR.lg_grp_cd());
				r.master_dt(getToday());

				map.put(peg, dtlR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						Sprt01_DtlR dtlR = map.get(r.peg_no());
						dtlR.wms_flg(!isNull(r.ext_sys_cd()));
						dtlR.wms_tgt_flg(dtlR.wms_flg());
					}
				}
			}
		}
		/**
		 * 受払予定削除
		 */
		protected void callIoSchdServiceDel01(MCList<Sprt01_DtlR> dtlL) {
			if(dtlL.isEmpty()) {
				return;
			}

			MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
			for (Sprt01_DtlR upR : dtlL) {
				MSW_IO_SCHD_DEL_R bindR = MSW_IO_SCHD_DEL_R.create();
				bindR.io_schd_typ(upR.io_schd_typ());
				bindR.io_schd_no(upR.xfr_alloc_sts_no());
				bindR.io_schd_sts_typ(getIoSchdStsTyp(upR));
				o.up0().add(bindR);
				o.exec();
			}
		}
		/**
		 * 受払予定作成
		 */
		protected void callIoSchdServiceIns01(MCList<Sprt01_DtlR> dtlL) {
			if(dtlL.isEmpty()) {
				return;
			}

			MSBEL_IoSchdService.IoSchd_Ins01 op = MSBEL_IoSchdService.crtIoSchd_Ins01();
			addAll(op.up0(), dtlL, createMap_IoSchd_Ins01_DtlR_Sprt01_DtlR());
			op.exec();
		}

		protected Map_IoSchd_Ins01_DtlR_Sprt01_DtlR<IoSchd_Ins01_DtlR,Sprt01_DtlR> createMap_IoSchd_Ins01_DtlR_Sprt01_DtlR() {
			return new Map_IoSchd_Ins01_DtlR_Sprt01_DtlR<IoSchd_Ins01_DtlR, Sprt01_DtlR>();
		}
		public class Map_IoSchd_Ins01_DtlR_Sprt01_DtlR<D extends IoSchd_Ins01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(getIoSchdTypForMove(src.trd_ptn_typ()));
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_no(MAC_STR.NULL_VAL.value());
				dest.io_schd_pr_no(MAC_STR.NULL_VAL.value());
				dest.schd_dt(up0().xfr_schd_dt());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.gr_loc_cd(up0().gr_loc_cd());
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Sprt01_DtlR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Sprt01_DtlR.$gi_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, Sprt01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, Sprt01_DtlR.$lot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, Sprt01_DtlR.$sublot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Sprt01_DtlR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, Sprt01_DtlR.$sno1_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Sprt01_DtlR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, Sprt01_DtlR.$sno2_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Sprt01_DtlR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, Sprt01_DtlR.$sno3_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Sprt01_DtlR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, Sprt01_DtlR.$sno4_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Sprt01_DtlR.$trd_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Sprt01_DtlR.$trd_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Sprt01_DtlR.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, Sprt01_DtlR.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ, Sprt01_DtlR.$quality_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_id_typ, Sprt01_DtlR.$stk_id_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_bp_cd, Sprt01_DtlR.$stk_bp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_scope_typ, Sprt01_DtlR.$alloc_scope_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_flg, Sprt01_DtlR.$alloc_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, Sprt01_DtlR.$vld_dt_fr);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gr_str_ln_cd, Sprt01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$prov_typ, Sprt01_DtlR.$prov_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$prov_basis_typ, Sprt01_DtlR.$prov_basis_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$rsn_cd, Sprt01_DtlR.$rsn_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_ptn_typ, Sprt01_DtlR.$trd_ptn_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
			}
		}
		protected String getIoSchdStsTyp(Sprt01_DtlR r) {
			MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getEx(r.xfr_alloc_sts_no());
			if(MSC_PR_STS_TYP.isNOT_INST(allocR.pr_sts_typ())) {
				return MSC_IO_SCHD_STS_TYP.SCHD.value();
			}
			else {
				return MSC_IO_SCHD_STS_TYP.ORD.value();
			}
		}
		protected Map_Srch_TgtR_Sprt01_DtlR<Srch_TgtR,Sprt01_DtlR> createMap_Srch_TgtR_Sprt01_DtlR() {
			return new Map_Srch_TgtR_Sprt01_DtlR<Srch_TgtR, Sprt01_DtlR>();
		}

		public class Map_Srch_TgtR_Sprt01_DtlR<D extends Srch_TgtR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MAM_ITM_R itmCacheR = getItmCache().getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());

				dest.gi_schd_dt(up0().xfr_schd_dt());
				dest.gr_loc_cd(up0().gr_loc_cd());

				// 荷姿対象かつ取引単位が荷姿単位なら取引単位を荷姿単位とする
				// 取引単位が荷姿単位でない場合は基準単位での提案とする(何もいれない)
				if(itmCacheR.pack_alloc_flg() && itmUnitR.pack_flg()) {
					dest.pack_alloc_flg(true);
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}

				// 引当済の手配ＮＯが設定されているならその値で引当し直す
				if(!isNull(src.alloc_sno1())) {
					dest.sno1(src.alloc_sno1());
				}
				if(!isNull(src.alloc_sno2())) {
					dest.sno2(src.alloc_sno2());
				}
				if(!isNull(src.alloc_sno3())) {
					dest.sno3(src.alloc_sno3());
				}
				if(!isNull(src.alloc_sno4())) {
					dest.sno4(src.alloc_sno4());
				}
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
				dest.chk_ship_flg(!src.skip_chk_ship_flg());

			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(Srch_TgtR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$ver_no, Sprt01_DtlR.$ver_no);
				addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, Sprt01_DtlR.$lg_grp_cd);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, Sprt01_DtlR.$gi_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Sprt01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, Sprt01_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(Srch_TgtR.$gr_str_ln_cd, Sprt01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, Sprt01_DtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, Sprt01_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, Sprt01_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, Sprt01_DtlR.$gd_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, Sprt01_DtlR.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, Sprt01_DtlR.$sublot_no);
				addColumnPathMap(Srch_TgtR.$sno1_null_flg, Sprt01_DtlR.$sno1_null_flg);
				addColumnPathMap(Srch_TgtR.$sno2_null_flg, Sprt01_DtlR.$sno2_null_flg);
				addColumnPathMap(Srch_TgtR.$sno3_null_flg, Sprt01_DtlR.$sno3_null_flg);
				addColumnPathMap(Srch_TgtR.$sno4_null_flg, Sprt01_DtlR.$sno4_null_flg);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, Sprt01_DtlR.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, Sprt01_DtlR.$lot_none_flg);
				addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Sprt01_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Sprt01_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr, Sprt01_DtlR.$vld_dt_fr);
				addColumnPathMap(Srch_TgtR.$alloc_scope_typ, Sprt01_DtlR.$alloc_scope_typ);
				addColumnPathMap(Srch_TgtR.$io_schd_typ, Sprt01_DtlR.$io_schd_typ);
				addColumnPathMap(Srch_TgtR.$stk_alloc_flg, Sprt01_DtlR.$stk_alloc_flg);
				addColumnPathMap(Srch_TgtR.$stk_info_loc_typ, Sprt01_DtlR.$stk_info_loc_typ);
			}
		}

	}

	// キャッシュ関連
	protected static final Class<MSBEL_XfrInstReg> CLAZZ = MSBEL_XfrInstReg.class;
	protected FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> _xfrAllocCache = null;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected FXUCL_MCDbcCache<MAM_TRD_R> _trdCache = null;
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;

	// 品目マスタ 基準単位ＣＤ、荷姿引当ＦＬＧ
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return object(CLAZZ)._itmCache;
	}
	protected static void initItmCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmCache(bindL);
	}
	protected void _initItmCache(MCList<? extends MCRow> bindL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
		itmL_bldr.setSelect(t.unit_cd, t.pack_alloc_flg, t.dec_place, t.rnd_typ);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindL,
				Chk01_DtlR.$itm_cd,
				Chk01_DtlR.$itm_sub1,
				Chk01_DtlR.$itm_sub2,
				Chk01_DtlR.$itm_sub3);
	}

	// 場所マスタ 物流グループＣＤ
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getGrLocCache() {
		return object(CLAZZ)._grLocCache;
	}
	protected static void initGrLocCache() {
		object(CLAZZ)._initGrLocCache();
	}
	protected void _initGrLocCache() {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(t);
		locR_bldr.setSelect(t.lg_grp_cd);
		_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locR_bldr); 
	}

	// 移動引当状況
	protected static FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> getXfrAllocCache() {
		return object(CLAZZ)._xfrAllocCache;
	}
	protected static void initXfrAllocCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initXfrAllocCache(bindL);
	}
	protected void _initXfrAllocCache(MCList<? extends MCRow> bindL) {
		MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T"));
		allocL_bldr.setSelectAll();
		_xfrAllocCache = new FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R>(allocL_bldr, bindL,
				Chk01_DtlR.$xfr_alloc_sts_no);
	}

	protected static void initItmUnitCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}
	protected void _initItmUnitCache(MCList<? extends MCRow> bindL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		itmUnitL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ, t.pack_flg);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, bindL,
				"itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}

	// 取引マスタ (取引ＣＤの取得) 「取引パタン区分」「自動時採用フラグ=1」
	protected static FXUCL_MCDbcCache<MAM_TRD_R> getTrdCache() {
		return object(CLAZZ)._trdCache;
	}
	public static void initTrdCache() {
		object(CLAZZ)._initTrdCache();
	}
	protected void _initTrdCache() {
		MAM_TRD_R t = MAM_TRD_R.create("T");
		MCQueryApiBuilder trdR_bldr = MCQueryApiBuilder.create(t);
		trdR_bldr.setSelect(t.trd_ptn_typ);
		_trdCache = new FXUCL_MCDbcCache<MAM_TRD_R>(trdR_bldr);
	}
	protected MCList<MAM_ITM_LG_GRP_R> getItmLgGrpLocL(MCList<?> dtlL) {
		MCList<MAM_ITM_LG_GRP_R> dbc = MCList.create(MAM_ITM_LG_GRP_R.class);
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd);
		dbc_bldr.addSelect(t.itm_sub1);
		dbc_bldr.addSelect(t.itm_sub2);
		dbc_bldr.addSelect(t.itm_sub3);
		dbc_bldr.addSelect(t.lg_grp_cd);
		dbc_bldr.addSelect(t.lg_def_loc_cd);
		dbSelectKey("MSBEL1010_MAM_ITM_LG_GRP_S01", dbc, dbc_bldr, dtlL);
		
		return dbc;
	}

	protected MAM_LOC_R getLoc(String lgGrpCd) {
		MAM_LOC_R dbc = MAM_LOC_R.create();
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.loc_cd);
		dbc_bldr.setWhere(t.lg_grp_cd.eq(bind("1")), lgGrpCd);
		dbc_bldr.addWhereWithAnd(t.lg_def_flg.eq(value(true)));
		dbSelect("MSBEL1010_MAM_LOC_S01", dbc, dbc_bldr);
		
		return dbc;
	}

	// Chk マッパー
	protected Map_XfrInstChk_HdrDtlR_Chk01_HdrR<XfrInstChk_HdrDtlR,Chk01_HdrR> createMap_XfrInstChk_HdrDtlR_Chk01_HdrR() {
		return new Map_XfrInstChk_HdrDtlR_Chk01_HdrR<XfrInstChk_HdrDtlR, Chk01_HdrR>();
	}
	public class Map_XfrInstChk_HdrDtlR_Chk01_HdrR<D extends XfrInstChk_HdrDtlR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$lg_grp_cd, Chk01_HdrR.$lg_grp_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gr_loc_cd, Chk01_HdrR.$gr_loc_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_schd_dt, Chk01_HdrR.$xfr_schd_dt);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_inst_no, Chk01_HdrR.$xfr_inst_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$immd_dlv_prnt_flg, Chk01_HdrR.$dlv_print);
		}
	}

	protected Map_XfrInstChk_HdrDtlR_Chk01_DtlR<XfrInstChk_HdrDtlR,Chk01_DtlR> createMap_XfrInstChk_HdrDtlR_Chk01_DtlR() {
		return new Map_XfrInstChk_HdrDtlR_Chk01_DtlR<XfrInstChk_HdrDtlR, Chk01_DtlR>();
	}
	public class Map_XfrInstChk_HdrDtlR_Chk01_DtlR<D extends XfrInstChk_HdrDtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			// 未指図からの打切は残数打切
			if(MSC_PR_STS_TYP.isNOT_INST(src.pr_sts_typ())) {
				dest.inst_rem_abort_flg(src.abort_flg());
				dest.abort_flg(false);
			}
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInstChk_HdrDtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_alloc_sts_no, Chk01_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$pr_sts_typ, Chk01_DtlR.$pr_sts_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_schd_no, Chk01_DtlR.$xfr_schd_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$xfr_inst_d_no, Chk01_DtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gi_loc_cd, Chk01_DtlR.$gi_loc_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gi_str_ln_cd, Chk01_DtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gi_stk_arrv_bp_cd, Chk01_DtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gr_str_ln_cd, Chk01_DtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno1_null_flg, Chk01_DtlR.$sno1_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno2_null_flg, Chk01_DtlR.$sno2_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno3_null_flg, Chk01_DtlR.$sno3_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(XfrInstChk_HdrDtlR.$sno4_null_flg, Chk01_DtlR.$sno4_null_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno1, Chk01_DtlR.$alloc_sno1);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno2, Chk01_DtlR.$alloc_sno2);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno3, Chk01_DtlR.$alloc_sno3);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_sno4, Chk01_DtlR.$alloc_sno4);
			addColumnPathMap(XfrInstChk_HdrDtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(XfrInstChk_HdrDtlR.$alloc_flg, Chk01_DtlR.$alloc_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$not_lot_mix_flg, Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$not_sublot_mix_flg, Chk01_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$vld_dt_fr, Chk01_DtlR.$vld_dt_fr);
			addColumnPathMap(XfrInstChk_HdrDtlR.$prov_typ, Chk01_DtlR.$prov_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$prov_basis_typ, Chk01_DtlR.$prov_basis_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$ret_prov_typ, Chk01_DtlR.$ret_prov_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$ret_prov_basis_typ, Chk01_DtlR.$ret_prov_basis_typ);
			addColumnPathMap(XfrInstChk_HdrDtlR.$old_xfr_alloc_sts_no, Chk01_DtlR.$old_xfr_alloc_sts_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(XfrInstChk_HdrDtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(XfrInstChk_HdrDtlR.$skip_chk_ship_flg, Chk01_DtlR.$skip_chk_ship_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$wms_flg, Chk01_DtlR.$wms_flg);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
			addColumnPathMap(XfrInstChk_HdrDtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 帳票を発行する<br>
	 */
	public class Prnt01 extends MSBEL_XfrInstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk04();
			throwUpdErr();
			callShipRprtServicePrnt02();
			callShipRprtServicePrnt01();
			if(up0().err_flg()) {
				setDown();
				return;
			}
			updatePrintFlg();
			// error処理
			setDown();
		}

		protected void callThisChk04() {
			MSBEL_XfrInstReg.Chk04 op = MSBEL_XfrInstReg.crtChk04();
			MCRow.copyall(op.up0(),up0());
			setAll(op.up1(), up2(), createMap_Chk04_DtlR_Prnt01_DtlR());
			op.exec();
			MCRow.copyall(up0(),op.down0());
		}

		protected void callShipRprtServicePrnt01() {
			if (up0().err_flg()) {
				return;
			}
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01
				ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			
			MCList<MST_DLV_SLIP_R> rsltL = getPrntTgtL();
			for (MST_DLV_SLIP_R dlvR : rsltL) {
				ShipRprt_Prnt01_HdrR prntR = ope.up0().add();
				prntR.dlv_slip_no(dlvR.dlv_slip_no());
				prntR.dlv_slip_seq(dlvR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0().dlv_print());
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0());
			}
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());
			ope.exec();
			up0().err_flg(ope.down0().get(0).err_flg());
		}
		
		protected MCList<MST_DLV_SLIP_R> getPrntTgtL() {
			// 上り電文の移動指図ＮＯに対応する納品書ＮＯ、連番を取得する
			MST_XFR_INST_R t1 = MST_XFR_INST_R.create("T1");
			MST_XFR_INST_D_R t2 = MST_XFR_INST_D_R.create("T2");
			MST_XFR_ALLOC_STS_R t3 = MST_XFR_ALLOC_STS_R.create("T3");
			MST_DLV_SLIP_R t4 = MST_DLV_SLIP_R.create("T4");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
				t3.dlv_slip_no,
				t3.dlv_slip_seq,
				t4.slip_prnt_flg
			);
			bldr.addInnerJoin(t2, t2.xfr_inst_no.eq(t1.xfr_inst_no));
			bldr.addInnerJoin(t3, t3.xfr_inst_d_no.eq(t2.xfr_inst_d_no));
			bldr.addInnerJoin(t4,
				t4.dlv_slip_no.eq(t3.dlv_slip_no).and(t4.dlv_slip_seq.eq(t3.dlv_slip_seq)));
			bldr.setWhere(t1.xfr_inst_no.eq(bind("1")), up0().xfr_inst_no());
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL1010_MST_DLV_SLIP_S01", rsltL, bldr);
			
			return rsltL;
		}
		
		protected void callShipRprtServicePrnt02() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();
			ShipRprt_Prnt02_HdrR prntHdrR = o.up0().add();
			copy(prntHdrR, up0(), createMap_ShipRprt_Prnt02_HdrR_Chk01_HdrR());
			o.exec();
			up0().err_flg(o.down0().get(0).err_flg());
		}

		protected void updatePrintFlg() {
			MST_XFR_INST_R instR = MST_XFR_INST_R.create();
			MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(t);

			instR_bldr.setSet(instR_bldr.getBaseDbc().getKeyColumn$());
			instR_bldr.removeSet(instR_bldr.getBaseDbc().getKeyColumn());

			if(up0().dlv_print()) {
				up0().dlv_prnt_flg(true);
				instR.dlv_prnt_flg(true);
				instR.dlv_prnt_tm(getToday());
				instR_bldr.addSet(t.dlv_prnt_flg);
				instR_bldr.addSet(t.dlv_prnt_tm);
			}
			if(up0().inst_print()) {
				up0().inst_prnt_flg(true);
				instR.inst_prnt_flg(true);
				instR.inst_prnt_tm(getToday());
				instR_bldr.addSet(t.inst_prnt_flg);
				instR_bldr.addSet(t.inst_prnt_tm);
			}
			if(up0().pick_print()) {
				up0().pick_prnt_flg(true);
				instR.pick_prnt_flg(true);
				instR.pick_prnt_tm(getToday());
				instR_bldr.addSet(t.pick_prnt_flg);
				instR_bldr.addSet(t.pick_prnt_tm);
			}

			instR.xfr_inst_no(up0().xfr_inst_no());
			dbUpdateKey("MSBEL1010_MST_XFR_INST_U01", instR, instR_bldr);
		}

		protected Map_ShipRprt_Prnt02_HdrR_Chk01_HdrR<ShipRprt_Prnt02_HdrR,Chk01_HdrR> createMap_ShipRprt_Prnt02_HdrR_Chk01_HdrR() {
			return new Map_ShipRprt_Prnt02_HdrR_Chk01_HdrR<ShipRprt_Prnt02_HdrR, Chk01_HdrR>();
		}

		public class Map_ShipRprt_Prnt02_HdrR_Chk01_HdrR<D extends ShipRprt_Prnt02_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trn_typ(MSC_TRN_TYP.XFR.value());
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipRprt_Prnt02_HdrR.$xfr_inst_no, Chk01_HdrR.$xfr_inst_no);
				addColumnPathMap(ShipRprt_Prnt02_HdrR.$inst_prnt_flg, Chk01_HdrR.$inst_print);
				addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, Chk01_HdrR.$pick_print);
			}
		}
		
		protected Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR,Prnt01_DtlR> createMap_Chk04_DtlR_Prnt01_DtlR() {
			return new Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR,Prnt01_DtlR>();
		}

		public class Map_Chk04_DtlR_Prnt01_DtlR<D extends Chk04_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( Chk04_DtlR.$base_ac_dt, Prnt01_DtlR.$base_ac_dt);
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(),up0());
		}
	}
	
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 返品元の支給計上日の取得を行う。<br>
	 */
	public class Sprt02 extends MSBEL_XfrInstReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (MAC_TRD_PTN_TYP.isPROV_RTN(up0().trd_ptn_typ())) {
				MCList<Sprt02_DtlR> dlvSlipNoL = MCList.create(Sprt02_DtlR.class);
				MCList<Sprt02_DtlR> provActNoL = MCList.create(Sprt02_DtlR.class);
				MCList<Sprt02_DtlR> retL = MCList.create(Sprt02_DtlR.class);

				for (Sprt02_DtlR r : up1()) {
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

				for (Sprt02_DtlR r : up1()) {
					if (!isNull(r.base_ac_dt())) {
						continue;
					}
					Sprt02_DtlR retR = null;
					if (!isNull(r.base_dlv_slip_no())) {
						retR = retL.getFirst(Sprt02_DtlR.$base_dlv_slip_no, r.base_dlv_slip_no());
					}
					else if (!isNull(r.base_prov_act_no())) {
						retR = retL.getFirst(Sprt02_DtlR.$base_prov_act_no, r.base_prov_act_no());
					}
					if (!isNull(retR)) {
						r.base_ac_dt(retR.base_ac_dt());
					}
					else {
						MCMessagePool.add(new MCMessage(r, Sprt02_DtlR.$base_ac_dt, MSBEL1104
						, r.base_dlv_slip_no()
						, r.base_prov_act_no()
						, toDispGUIIndex(r)));
					}
				}

				setDown();
			}
		}

		protected MCList<Sprt02_DtlR> getDlvSlipNo(MCList<Sprt02_DtlR> dlvSlipNoL) {

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
			dbSelect("MSBEL1010_MST_PROV_ACT_S01", dlvSlipNoL, provActR_bldr, dlvSlipNoL);

			return dlvSlipNoL;

		}

		protected MCList<Sprt02_DtlR> getProvActNo(MCList<Sprt02_DtlR> provActNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(t.prov_act_no.as("base_prov_act_no"));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(t.prov_act_no.eq(bind("base_prov_act_no")));
			provActNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1010_MST_PROV_ACT_S02", provActNoL, provActR_bldr, provActNoL);

			return provActNoL;

		}

		protected void setDown() {
			down0().setAll(up1());
		}
	}

	//FMCB CUSTOM END
}