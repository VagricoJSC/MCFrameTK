package mcframe.serverMSBC.MSBCL6120;

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
import mcframe.serverMSBC.MSBCL6120.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBC.MSBCL6130.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMABS.MABSL5030.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5200.*;
import java.util.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMAUC.MAUCL5020.*;
import static mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OutSrcInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OutSrcInstService_MC extends MSBCL_OutSrcInstService_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MSBCL_OutSrcInstService> CLAZZ = MSBCL_OutSrcInstService.class;
	
	/**
	 * OutSrcInst_Sprt01オペレーション.<p>
	 *
	 * 加工単価に有償支給単価を加味した、外注品の発注単価を取得する<br>
	 */
	public class OutSrcInst_Sprt01 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Sprt01 {
		/** 
		 * マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur;
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;
		protected MCList<MST_MFG_INST_R> _cacheMfgInst = MCList.create(MST_MFG_INST_R.class);
		protected MCIndexKey _idxCacheMfgInst;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			crtMasterCache();

			callProcUpriService();

			setMfgInstNo();

			setOutSrcInstSprt01DtlProv();

			setDown();
		}

		/**
		 * マスタ・キャッシュの作成
		 */
		protected void crtMasterCache() {
			// 取引先マスタ
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bp);
			bpL_bldr.setSelect(bp.bp_cd, bp.outsrc_upri_typ, bp.purc_amt_rnd_typ, bp.prov_amt_rnd_typ, bp.purc_tax_rnd_typ, bp.onr_prsppl_flg, bp.repurc_obli_flg);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, up0(),OutSrcInst_Sprt01_DtlR.$sppl_cd);

			// 通貨マスタ
			MAM_CUR_R cur = MAM_CUR_R.create("CUR");
			MCQueryApiBuilder curL_bldr = MCQueryApiBuilder.create(cur);
			curL_bldr.setSelect(cur.cur_cd, cur.amt_dec_place, cur.upri_dec_place);
			_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(curL_bldr, up0(),OutSrcInst_Sprt01_DtlR.$trd_cur_cd);

			// 税マスタ
			MAM_TAX_R tax = MAM_TAX_R.create("TAX");
			MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(tax);
			taxL_bldr.setSelect(tax.tax_cd, tax.tax_rate, tax.inc_tax_flg);
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(taxL_bldr, up0(),OutSrcInst_Sprt01_DtlR.$tax_cd);

			// 場所マスタ
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(loc);
			locL_bldr.setSelect(loc.loc_cd, loc.wg_cd);
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, up0(),OutSrcInst_Sprt01_DtlR.$in_to_loc_cd);

			_cacheMfgInst = MCList.create(MST_MFG_INST_R.class);
			_cacheMfgInst.addStringColumn(MST_ITM_MFG_INST_R.$bom_ptn);
			_cacheMfgInst.addStringColumn(MST_ITM_MFG_INST_R.$mfg_loc_cd);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MCQueryApiBuilder cacheMfgInst_bldr = MCQueryApiBuilder.create(t);
			cacheMfgInst_bldr.setSelect(t.mfg_inst_no);
			cacheMfgInst_bldr.addSelect(t.rqst_dlv_rqst_tm);
			cacheMfgInst_bldr.addSelect(t2.bom_ptn);
			cacheMfgInst_bldr.addSelect(t2.mfg_loc_cd);
			cacheMfgInst_bldr.addInnerJoin(t2, t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no));

			cacheMfgInst_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			cacheMfgInst_bldr.addWhereWithAnd(t.can_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
			cacheMfgInst_bldr.addWhereWithAnd(t2.can_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
			dbSelect("MSBCL6120_MST_MFG_INST_S01", _cacheMfgInst, cacheMfgInst_bldr, up0());
			_idxCacheMfgInst = _cacheMfgInst.createIndex(MST_MFG_INST_R.$mfg_inst_no);
		}

		/**
		 * 加工単価取得サービス.加工単価取得を呼び出し、
		 * 上り電文に「取引通貨加工単価」、「仮単価ＦＬＧ」を設定する
		 */
		protected void callProcUpriService() {
			MABSL_ProcUpriService.ProcUpri_Sprt01 o = MABSL_ProcUpriService.crtProcUpri_Sprt01();
			addAll(o.up0(), up0(), createMap_ProcUpri_Sprt01_DtlR_OutSrcInst_Sprt01_DtlR());

			for (ProcUpri_Sprt01_DtlR r :o.up0()) {
				MAM_LOC_R locR = _cacheLoc.get(r.loc_cd());
				r.wg_cd(locR.wg_cd());
			}
			o.exec();
			String[] destCols = new String[] {OutSrcInst_Sprt01_DtlR.$trd_cur_proc_upri, OutSrcInst_Sprt01_DtlR.$interim_flg};
			String[] srcCols = new String[] {ProcUpri_Sprt01_DtlR.$upri, ProcUpri_Sprt01_DtlR.$interim_flg};
			copyByPegNo(up0(), destCols, o.down0(), srcCols);
		}

		/**
		 * 上り電文に製造指図NOを設定する
		 */
		protected void setMfgInstNo() {
			MCList<OutSrcInst_Sprt01_DtlR> mfgInstNoL = MCList.create(OutSrcInst_Sprt01_DtlR.class);
			for (OutSrcInst_Sprt01_DtlR r :up0()) {
				MAM_BP_R bpR = _cacheBp.get(r.sppl_cd());

				if (!isNull(r.outsrc_itm_ord_no()) && bpR.onr_prsppl_flg()) {
					mfgInstNoL.add(r);
				}
			}
			
			if (mfgInstNoL.isEmpty()) {
				return;
			}

			MST_MFG_INST_R itm_inst2 = MST_MFG_INST_R.create("T2");

			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R itm_inst1 = MST_ITM_MFG_INST_R.create("ITM_INST");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(itm_inst1);
			imiL_bldr.setSelect(itm_inst1.itm_ord_no, itm_inst1.base_unit_inst_qty, itm_inst1.sno1, itm_inst1.sno2, itm_inst1.sno3, itm_inst1.sno4);
			imiL_bldr.addSelect(itm_inst2.mfg_inst_no);
			imiL_bldr.addSelect(itm_inst2.rqst_dlv_rqst_tm);
			imiL_bldr.addInnerJoin(itm_inst2, itm_inst1.itm_mfg_inst_no.eq(itm_inst2.itm_mfg_inst_no));
			imiL_bldr.setWhere(itm_inst1.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
			imiL_bldr.addWhereWithAnd(itm_inst1.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_ITM_MFG_INST_S01", imiL, imiL_bldr, mfgInstNoL);

			MCIndexKey idxkey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
			MST_PO_D_R po_d = MST_PO_D_R.create("PO_D");
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R po_schd = MST_PO_SCHD_R.create("PO_SDHD");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(po_schd);
			poSchdL.addDateColumn("before_dlv_rqst_tm");
			poSchdL_bldr.setSelect(po_schd.outsrc_itm_ord_no);
			poSchdL_bldr.addSelect(decode(po_schd.po_d_no, nullValue(), po_schd.dlv_rqst_tm, po_d.dlv_rqst_tm).as("before_dlv_rqst_tm"));
			poSchdL_bldr.addLeftOuterJoin(po_d, po_schd.po_d_no.eq(po_d.po_d_no));
			poSchdL_bldr.setWhere(po_schd.outsrc_itm_ord_no.eq(bind("outsrc_itm_ord_no")));
			dbSelect("MSBCL6120_MST_PO_SCHD_S01", poSchdL, poSchdL_bldr, up0());
			MCIndexKey idxPoSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);
			for (OutSrcInst_Sprt01_DtlR r :up0()) {
				MCList<MST_ITM_MFG_INST_R> subL = imiL.subList(idxkey, r.outsrc_itm_ord_no());
				if (subL.size() == 1) {
					MST_ITM_MFG_INST_R imiR = subL.get(0);
					MST_PO_SCHD_R poSchdR = poSchdL.getFirst(idxPoSchdKey,
							r.outsrc_itm_ord_no());
					if (!isNull(poSchdR)) {
						r.setDateNE("before_dlv_rqst_tm",
								poSchdR.getDate("before_dlv_rqst_tm"));
					}
					else {
						r.setDateNE("before_dlv_rqst_tm", r.dlv_rqst_tm());
					}
					if (isSame(r.base_unit_qty(), imiR.base_unit_inst_qty())
							&& isSame(r.sno1(), imiR.sno1())
							&& isSame(r.sno2(), imiR.sno2())
							&& isSame(r.sno3(), imiR.sno3())
							&& isSame(r.sno4(), imiR.sno4())
							&& isSame(r.dlv_rqst_tm().startTimeOfDay(),
									r.getDate("before_dlv_rqst_tm").startTimeOfDay())) {
						r.mfg_inst_no(imiR.getStringNE("mfg_inst_no"));
					}
				}
			}
		}

		/**
		 * 有償支給金額計算用の子品目コンテナ（OutSrcInst_Sprt01_DtlProvコンテナ）を作成する
		 */
		protected void setOutSrcInstSprt01DtlProv() {
			MCList<OutSrcInst_Sprt01_DtlR> inptSchdL = MCList.create(OutSrcInst_Sprt01_DtlR.class);

			MCList<OutSrcInst_Sprt01_DtlR> ordSprtL = MCList.create(OutSrcInst_Sprt01_DtlR.class);
			for (OutSrcInst_Sprt01_DtlR r :up0()) {
				MAM_BP_R bpR = _cacheBp.get(r.sppl_cd());
				if (isTgtOnrProv(bpR)) {
					if (isNull(r.mfg_inst_no()) && !isNull(r.bom_ptn())) {
						ordSprtL.add(r);	
					}
					else if (!isNull(r.outsrc_itm_ord_no())) {
						// 製造指図後に発注した場合、または、仕入伝票を仕入明細訂正登録した場合
						inptSchdL.add(r);
					}
					else {
						// 仕入返品登録した場合、または、返品伝票を仕入明細訂正登録した場合は補完してから展開処理を行う
						MST_MFG_INST_R mfgInstR = _cacheMfgInst.getFirst(_idxCacheMfgInst, r.mfg_inst_no());
						if (!isNull(mfgInstR)) {
							r.bom_ptn(mfgInstR.getStringNE(MST_ITM_MFG_INST_R.$bom_ptn));
							r.mfg_loc_cd(mfgInstR.getStringNE(MST_ITM_MFG_INST_R.$mfg_loc_cd));
							r.dlv_rqst_tm(mfgInstR.rqst_dlv_rqst_tm());
							ordSprtL.add(r);
						}
					}
				}
			}

			if (!inptSchdL.isEmpty()) {
				setChdConFrInptSchd(inptSchdL);
			}
			if (!ordSprtL.isEmpty()) {
				setChdConFrordSprt(ordSprtL);
			}

		}

		/**
		 *有償支給単価および有償支給金額の計算対象かどうか
		 * 
		 */
		protected boolean isTgtOnrProv(MAM_BP_R bpR) {

			if (!bpR.onr_prsppl_flg()) {
				return false;
			}

			if (!isNull(bpR.outsrc_upri_typ())) {
				if (MAC_OUTSRC_UPRI_TYP.isPROC_PROV(bpR.outsrc_upri_typ())) {
					return true;
				}
			}
			else {
				if (MAC_OUTSRC_UPRI_TYP.isPROC_PROV(getCo().outsrc_upri_typ())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 投入予定の取得用リストを元に子品目コンテナを作成する
		 * @param inptSchdL 投入予定の取得用リスト
		 * 
		 */
		protected void setChdConFrInptSchd(MCList<OutSrcInst_Sprt01_DtlR> inptSchdL) {


			MCList<MST_INPT_SCHD_R> mstInptSchdL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R inpt = MST_INPT_SCHD_R.create("INPT");
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MCQueryApiBuilder mstInptSchdL_bldr = MCQueryApiBuilder.create(inpt);
			mstInptSchdL_bldr.setSelect(inpt.mfg_inst_no, inpt.itm_cd, inpt.itm_sub1, inpt.itm_sub2, inpt.itm_sub3, inpt.base_unit_inpt_qty
					, inpt.oper_inst_no, inpt.alt_grp_cd, inpt.alt_grp_seq, inpt.alt_itm_fix_flg, inpt.alt_itm_typ, inpt.alt_itm_ratio, inpt.schd_tm);
			mstInptSchdL_bldr.addSelect(itm.dec_place);
			mstInptSchdL_bldr.addLeftOuterJoin(itm, bracket( itm.itm_cd.eq(inpt.itm_cd)
					.and(itm.itm_sub1.eq(inpt.itm_sub1))
					.and(itm.itm_sub2.eq(inpt.itm_sub2))
					.and(itm.itm_sub3.eq(inpt.itm_sub3))));
			mstInptSchdL_bldr.setWhere(inpt.mfg_inst_no.eq(bind("mfg_inst_no")));
			mstInptSchdL_bldr.addWhereWithAnd(inpt.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_INPT_SCHD_S01", mstInptSchdL, mstInptSchdL_bldr, inptSchdL);

			MCIndexKey mfgInstNoIdxKey = mstInptSchdL.createIndex(MST_INPT_SCHD_R.$mfg_inst_no);
			MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
			for (OutSrcInst_Sprt01_DtlR r :inptSchdL) {
				MCList<MST_INPT_SCHD_R> mstInptSchdsubL = mstInptSchdL.subList(mfgInstNoIdxKey, r. mfg_inst_no());
				mstInptSchdsubL.addNumberColumn("calc_inpt_qty");
				calcInptQty(mstInptSchdsubL);

				for (MST_INPT_SCHD_R instR :mstInptSchdsubL) {
					MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
					MAM_LOC_R locR = _cacheLoc.get(r.in_to_loc_cd());

					bindR.addNumberColumn("peg_no", r.peg_no());
					bindR.itm_cd(instR.itm_cd());
					bindR.itm_sub1(instR.itm_sub1());
					bindR.itm_sub2(instR.itm_sub2());
					bindR.itm_sub3(instR.itm_sub3());
					bindR.prsppl_cd(r.sppl_cd());
					bindR.cur_cd(r.trd_cur_cd());
					bindR.wg_cd(locR.wg_cd());
					bindR.st_dt(instR.schd_tm());
					bindR.addNumberColumn("base_unit_inpt_qty", instR.getNumber("calc_inpt_qty"));
					bindR.addStringColumn("outsrc_itm_ord_no", r.outsrc_itm_ord_no());
					bindR.addBooleanColumn("not_add_up_qty_flg", r.not_add_up_qty_flg());
					bindL.add(bindR);
				}
			}

			MCList<MAM_PROV_UPRI_R>[] bindGrpL = bindL.groupList("outsrc_itm_ord_no", MAM_PROV_UPRI_R.$itm_cd,
					MAM_PROV_UPRI_R.$itm_sub1, MAM_PROV_UPRI_R.$itm_sub2, MAM_PROV_UPRI_R.$itm_sub3
					, "not_add_up_qty_flg");
			for (MCList<MAM_PROV_UPRI_R> bindGrpSubL : bindGrpL) {
				if (isNotAddUpQty(bindGrpSubL)) {
					continue;
				}
				MCNumber totalInptQty = bindGrpSubL.sum("base_unit_inpt_qty");
				for (MAM_PROV_UPRI_R bindGrpSubR : bindGrpSubL) {
					bindGrpSubR.setNumber("base_unit_inpt_qty", totalInptQty);
				}
			}

			MAM_PROV_UPRI_R pro = MAM_PROV_UPRI_R.create("PRO");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(pro);
			dbc_bldr.setSelect(pro.itm_cd);
			dbc_bldr.addSelect(pro.prov_typ);
			dbc_bldr.addSelect(pro.upri);
			FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
					dbc_bldr, bindL, MAM_PROV_UPRI_R.$itm_cd,
					MAM_PROV_UPRI_R.$itm_sub1, MAM_PROV_UPRI_R.$itm_sub2,
					MAM_PROV_UPRI_R.$itm_sub3, MAM_PROV_UPRI_R.$prsppl_cd,
					MAM_PROV_UPRI_R.$cur_cd, MAM_PROV_UPRI_R.$wg_cd);

			for (MCList<MAM_PROV_UPRI_R> bindGrpSubL : bindGrpL) {
				MCList<MAM_PROV_UPRI_R>[] subChdGrpL = bindGrpSubL.groupList("peg_no");
				for (MCList<MAM_PROV_UPRI_R> bindChdGrpSubL : subChdGrpL) {
					MAM_PROV_UPRI_R bindR = bindChdGrpSubL.get(0);
					MAM_PROV_UPRI_R upriR = provUpriCache.get(bindR.st_dt(), bindR.itm_cd(), bindR.itm_sub1(),
							bindR.itm_sub2(), bindR.itm_sub3(), bindR.prsppl_cd(),
							bindR.cur_cd(), bindR.wg_cd());
					if (isNull(upriR.itm_cd())) {
						continue;
					}
					if (isSame(upriR.prov_typ(), MAC_PROV_TYP.ONR_PROV.value())) {
						OutSrcInst_Sprt01_DtlProvR chdConR = OutSrcInst_Sprt01_DtlProvR.create();
						chdConR.peg_no(bindR.getNumber("peg_no"));
						chdConR.base_unit_inpt_qty(bindR.getNumber("base_unit_inpt_qty"));
						chdConR.trd_cur_onr_prov_upri(upriR.upri());
						OutSrcInst_Sprt01_DtlProv().add(chdConR);
						continue;
					}
				}
			}
		}

		protected boolean isNotAddUpQty(MCList<MAM_PROV_UPRI_R> bindGrpSubL) {
			return bindGrpSubL.get(0).getBooleanNE("not_add_up_qty_flg");
		}

		/**
		 * オーダ登録サービス実行用リストを元に子品目コンテナを作成する
		 * @param ordSprtL オーダ登録サービス実行用リスト
		 * 
		 */
		protected void setChdConFrordSprt(MCList<OutSrcInst_Sprt01_DtlR> ordSprtL) {
			MSBCL_OrdRegService.Ord_Sprt03 oSp03 = MSBCL_OrdRegService.crtOrd_Sprt03();
			addAll(oSp03.up0(), ordSprtL, createMap_Ord_Sprt03_DtlR_OutSrcInst_Sprt01_DtlR());
			oSp03.exec();

			String[] destCols = new String[] {OutSrcInst_Sprt01_DtlR.$mfg_st_schd_dt, OutSrcInst_Sprt01_DtlR.$mfg_end_schd_dt};
			String[] srcCols = new String[] {Ord_Sprt03_DtlR.$mfg_st_schd_dt, Ord_Sprt03_DtlR.$mfg_end_schd_dt};
			copyByPegNo(ordSprtL, destCols, oSp03.down0(), srcCols);

			MSBCL_OrdRegService.Ord_Sprt02 owp02 = MSBCL_OrdRegService.crtOrd_Sprt02();
			// inst_exp_flgをfalseで渡せば、数量は優先度が高い子品目に載ることになるため、優先度が高い子品目を採用する仕様
			// ※引当後に再度単価取得すれば引き当てた子品目が採用される
			owp02.up0().inst_exp_flg(false);
			owp02.up0().get_prov_upri_flg(true);
			addAll(owp02.up1(), ordSprtL, createMap_Ord_Sprt02_DtlR_OutSrcInst_Sprt01_DtlR());
			owp02.exec();
			MCList<Ord_Sprt02_RsltR> owp02L = MCList.create(Ord_Sprt02_RsltR.class);
			owp02L = owp02.down0().subList(Ord_Sprt02_RsltR.$prov_typ, MAC_PROV_TYP.ONR_PROV.value());

			for (Ord_Sprt02_RsltR r :owp02L) {
				OutSrcInst_Sprt01_DtlProvR chdConR = OutSrcInst_Sprt01_DtlProvR.create();

				chdConR.peg_no(r.peg_no());
				if (isNull(r.alt_grp_cd())) {
					chdConR.base_unit_inpt_qty(r.inpt_qty());
				} else {
					chdConR.base_unit_inpt_qty(r.calc_inpt_qty());
				}
				chdConR.trd_cur_onr_prov_upri(r.prov_upri());
				OutSrcInst_Sprt01_DtlProv().add(chdConR);
			}
		}

		/**
		 * 親品目の有償支給単価を計算する
		 * 
		 */
		protected MCNumber caclTrdCurOnrProvUpri(OutSrcInst_Sprt01_DtlR upR, MCList<OutSrcInst_Sprt01_DtlProvR> subChdConL) {

			MCNumber trdCurOnrProvUpri = MCNumber.ZERO;
			MCNumber trdCurOnrProvAmt = MCNumber.ZERO;
			MAM_CUR_R curR = _cacheCur.get(upR.trd_cur_cd());

			for (OutSrcInst_Sprt01_DtlProvR r :subChdConL) {
				trdCurOnrProvAmt = trdCurOnrProvAmt
						.add(r.trd_cur_onr_prov_upri().multiply(r.base_unit_inpt_qty()));
			}
			trdCurOnrProvUpri = getUpri(trdCurOnrProvAmt, upR.trd_unit_qty(), curR.upri_dec_place());
			return trdCurOnrProvUpri;
		}

		protected void calcInptQty(MCList<MST_INPT_SCHD_R> inptL) {
			// ロット混在可の場合は案分比率に従って案分し、混在不可の場合は最も優先度が高い品目以外は０にする。

			// 取得した投入予定から工程指図ＮＯ、代替グループＣＤ、代替グループ連番単位に処理
			for (MCList<MST_INPT_SCHD_R> inptSubL : inptL.groupList(
					MST_INPT_SCHD_R.$oper_inst_no, MST_INPT_SCHD_R.$alt_grp_cd,
					MST_INPT_SCHD_R.$alt_grp_seq)) {

				// 代替グループ単位にグループ化したリストの１件目を取得
				MST_INPT_SCHD_R firstR = inptSubL.get(0);

				// 代替グループＣＤが未設定の場合、基準単位投入数量を設定
				if (isNull(firstR.alt_grp_cd())) {
					for (MST_INPT_SCHD_R inptR : inptSubL) {
						inptR.setNumber("calc_inpt_qty",inptR.getNumber("base_unit_inpt_qty"));
					}
					continue;
				}

				// 代替品目指定フラグにインデックスキーを設定
				MCIndexKey idxKey = inptSubL
						.createIndex(MST_INPT_SCHD_R.$alt_itm_fix_flg);

				if (inptSubL.contains(idxKey, true)) {
					// 代替品目指定のレコードが存在する場合
					for (MST_INPT_SCHD_R inptR : inptSubL) {
						if (inptR.alt_itm_fix_flg()) {
							// 代替品目指定対象のレコードには基準単位投入数量を設定
							inptR.setNumber("calc_inpt_qty",inptR.getNumber("base_unit_inpt_qty"));
						}
						else {
							// 代替品目指定対象外のレコードには０を設定
							inptR.setNumber("calc_inpt_qty", MCNumber.ZERO);
						}
					}
				}
				else {
					// 代替品目指定のレコードが存在しない場合、案分して基準単位投入数量を算出
					MSUCL_ProdUtil.setAltQty(inptSubL, MST_INPT_SCHD_R.$alt_itm_typ,
							MST_INPT_SCHD_R.$alt_itm_ratio, MST_INPT_SCHD_R.$itm_cd,
							MST_INPT_SCHD_R.$base_unit_inpt_qty, "DEC_PLACE", "calc_inpt_qty");
				}
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().addAll(up0());

			MCIndexKey upIndexKey = up0().createIndex(OutSrcInst_Sprt01_DtlR.$peg_no);
			MCIndexKey chdIndexKey = OutSrcInst_Sprt01_DtlProv().createIndex(OutSrcInst_Sprt01_DtlR.$peg_no);
			for (OutSrcInst_Sprt01_DtlR r :down0()) {
				OutSrcInst_Sprt01_DtlR upR = up0().getFirst(upIndexKey, r.peg_no());
				MCList<OutSrcInst_Sprt01_DtlProvR> subChdConL = OutSrcInst_Sprt01_DtlProv()
						.subList(chdIndexKey, r.peg_no());
				MAM_CUR_R curR = _cacheCur.get(upR.trd_cur_cd());
				MAM_BP_R bpR = _cacheBp.get(upR.sppl_cd());
				MAM_TAX_R taxR = _cacheTax.get(upR.tax_cd());

				if (!isNull(r.trd_cur_proc_upri())) {
					r.trd_cur_onr_prov_upri(caclTrdCurOnrProvUpri(upR, subChdConL));
					
					if (isNull(r.trd_cur_onr_prov_upri())) {
						r.trd_cur_upri(r.trd_cur_proc_upri());
					}
					else {
						r.trd_cur_upri(r.trd_cur_proc_upri().add(r.trd_cur_onr_prov_upri()));
					}
					r.trd_cur_amt(getAmt(r.trd_cur_upri(), upR.trd_unit_qty(), curR.amt_dec_place(), bpR.purc_amt_rnd_typ()));
					r.trd_cur_tax_amt(getTaxAmt(r.trd_cur_amt(), taxR.tax_rate(),
							curR.amt_dec_place(), bpR.purc_tax_rnd_typ(), taxR.inc_tax_flg()));
					setOutsrcAmt(upR, curR);
					if(bpR.repurc_obli_flg()) {
						setRepublicObliTax(upR, curR, bpR, taxR);
					}
					else {
						r.trd_cur_tax_amt(getTaxAmt(r.trd_cur_amt(), taxR.tax_rate(),
								curR.amt_dec_place(), bpR.purc_tax_rnd_typ(), taxR.inc_tax_flg()));
					}
					// 内税かつ、有償支給金額≠NULLかつ、買戻義務＝オフかつ、有償支給金額≠０場合、単価・金額項目をクリア（有償支給単価は外税のみのため、内税で計算できない）
					if (taxR.inc_tax_flg() && !bpR.repurc_obli_flg() && !isNull(r.trd_cur_onr_prov_amt()) && !r.trd_cur_onr_prov_amt().isZero()) {
						r.trd_cur_upri(null);
						r.trd_cur_proc_upri(null);
						r.trd_cur_onr_prov_upri(null);
						r.interim_flg(false);
						r.trd_cur_amt(null);
						r.trd_cur_proc_amt(null);
						r.trd_cur_onr_prov_amt(null);
						r.trd_cur_tax_amt(null);
						MCMessagePool.add(new MCMessage(r, null, MSBCL1139,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
										r.itm_sub3()),
								r.sppl_cd(), r.tax_cd(), toDispGUIIndex(r)));
					}
				}
			}
		}
		/**
		 * 金額を案分して有償支給金額・加工金額を導出します
		 * @param r
		 * @param curR
		 */
		protected void setOutsrcAmt(OutSrcInst_Sprt01_DtlR r, MAM_CUR_R curR) {
			if(isNull(r.trd_cur_amt())) {
				return;
			}
			MCList<MCRow> amtL = calcPropOutSrcUpri(r.trd_cur_amt(), curR.amt_dec_place(), r.trd_cur_onr_prov_upri(), r.trd_cur_proc_upri(), null);
			r.trd_cur_onr_prov_amt(amtL.get(0).getNumberNE("amt"));
			r.trd_cur_proc_amt(amtL.get(1).getNumberNE("amt"));
		}
		/**
		 * 買戻義務がオンの場合に、加工金額・有償支給金額・税額・税込金額を計算します。
		 * @param r
		 * @param curR
		 * @param bpR
		 * @param taxR
		 */
		protected void setRepublicObliTax(OutSrcInst_Sprt01_DtlR r, MAM_CUR_R curR, MAM_BP_R bpR, MAM_TAX_R taxR) {
			MCNumber amt = r.trd_cur_amt();
			if(taxR.inc_tax_flg()) {
				// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
				MCNumber proc_inc_tax_amt = getAmt(r.trd_cur_proc_upri(),
						r.trd_unit_qty(),
						curR.amt_dec_place(),
						bpR.purc_amt_rnd_typ());
				r.trd_cur_proc_amt(proc_inc_tax_amt);
				// 有償支給金額は金額-加工金額
				r.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
			}
			MCNumber trdCurTaxAmt = getTaxAmt(
					r.trd_cur_proc_amt(),
					taxR.tax_rate(),
					curR.amt_dec_place(),
					bpR.purc_amt_rnd_typ(),
					taxR.inc_tax_flg()
					);
			r.trd_cur_tax_amt(trdCurTaxAmt);
			if(taxR.inc_tax_flg()) {
				amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
				MCNumber proc_amt = !isNull(r.trd_cur_proc_amt()) ? r.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
				r.trd_cur_amt(amt);
				r.trd_cur_proc_amt(proc_amt);
			}
		}

		protected Map_ProcUpri_Sprt01_DtlR_OutSrcInst_Sprt01_DtlR<ProcUpri_Sprt01_DtlR,OutSrcInst_Sprt01_DtlR> createMap_ProcUpri_Sprt01_DtlR_OutSrcInst_Sprt01_DtlR() {
			return new Map_ProcUpri_Sprt01_DtlR_OutSrcInst_Sprt01_DtlR<ProcUpri_Sprt01_DtlR, OutSrcInst_Sprt01_DtlR>();
		}

		public class Map_ProcUpri_Sprt01_DtlR_OutSrcInst_Sprt01_DtlR<D extends ProcUpri_Sprt01_DtlR, S extends OutSrcInst_Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$peg_no, OutSrcInst_Sprt01_DtlR.$peg_no);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$grp_no, OutSrcInst_Sprt01_DtlR.$grp_no);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_cd, OutSrcInst_Sprt01_DtlR.$itm_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub1, OutSrcInst_Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub2, OutSrcInst_Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub3, OutSrcInst_Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$sppl_cd, OutSrcInst_Sprt01_DtlR.$sppl_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$maker_cd, OutSrcInst_Sprt01_DtlR.$maker_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$unit_cd, OutSrcInst_Sprt01_DtlR.$trd_unit_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$qty, OutSrcInst_Sprt01_DtlR.$trd_unit_qty);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$cur_cd, OutSrcInst_Sprt01_DtlR.$trd_cur_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$loc_cd, OutSrcInst_Sprt01_DtlR.$in_to_loc_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$dlv_cd, OutSrcInst_Sprt01_DtlR.$dlv_cd);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$proc_upri_typ, OutSrcInst_Sprt01_DtlR.$proc_upri_typ);
				addColumnPathMap(ProcUpri_Sprt01_DtlR.$dt, OutSrcInst_Sprt01_DtlR.$base_dt);
			}
		}

		protected Map_Ord_Sprt03_DtlR_OutSrcInst_Sprt01_DtlR<Ord_Sprt03_DtlR,OutSrcInst_Sprt01_DtlR> createMap_Ord_Sprt03_DtlR_OutSrcInst_Sprt01_DtlR() {
			return new Map_Ord_Sprt03_DtlR_OutSrcInst_Sprt01_DtlR<Ord_Sprt03_DtlR, OutSrcInst_Sprt01_DtlR>();
		}

		public class Map_Ord_Sprt03_DtlR_OutSrcInst_Sprt01_DtlR<D extends Ord_Sprt03_DtlR, S extends OutSrcInst_Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, OutSrcInst_Sprt01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, OutSrcInst_Sprt01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, OutSrcInst_Sprt01_DtlR.$itmdtl_base_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, OutSrcInst_Sprt01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, OutSrcInst_Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, OutSrcInst_Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, OutSrcInst_Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, OutSrcInst_Sprt01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, OutSrcInst_Sprt01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, OutSrcInst_Sprt01_DtlR.$in_to_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, OutSrcInst_Sprt01_DtlR.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
		}

		protected Map_Ord_Sprt02_DtlR_OutSrcInst_Sprt01_DtlR<Ord_Sprt02_DtlR,OutSrcInst_Sprt01_DtlR> createMap_Ord_Sprt02_DtlR_OutSrcInst_Sprt01_DtlR() {
			return new Map_Ord_Sprt02_DtlR_OutSrcInst_Sprt01_DtlR<Ord_Sprt02_DtlR, OutSrcInst_Sprt01_DtlR>();
		}

		public class Map_Ord_Sprt02_DtlR_OutSrcInst_Sprt01_DtlR<D extends Ord_Sprt02_DtlR, S extends OutSrcInst_Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt02_DtlR.$peg_no, OutSrcInst_Sprt01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, OutSrcInst_Sprt01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, OutSrcInst_Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, OutSrcInst_Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, OutSrcInst_Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, OutSrcInst_Sprt01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, OutSrcInst_Sprt01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt02_DtlR.$inst_qty, OutSrcInst_Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_st_schd_dt, OutSrcInst_Sprt01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$st_schd_tm, OutSrcInst_Sprt01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$end_schd_tm, OutSrcInst_Sprt01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno1, OutSrcInst_Sprt01_DtlR.$sno1);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno2, OutSrcInst_Sprt01_DtlR.$sno2);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno3, OutSrcInst_Sprt01_DtlR.$sno3);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno4, OutSrcInst_Sprt01_DtlR.$sno4);
				addColumnPathMap(Ord_Sprt02_DtlR.$cur_cd,  OutSrcInst_Sprt01_DtlR.$trd_cur_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.oper_cd(MAC_STR.NULL_VAL.value());
				dest.oper_seq(MCNumber.ZERO);
			}
		}
	}
	
	// Chk01とUpd01で共通して使用するキャッシュ関連の処理
	protected static void initCacheForUpd01(MCList<OutSrcInst_Chk01_PoDR> poDL,
			MCList<OutSrcInst_Chk01_SchdPoDR> schdL) {
		object(CLAZZ)._initCacheForUpd01(poDL, schdL);
	}

	protected FXUCL_Cache<MCList<MfgInstReg_Upd01_HdrR>> _instCacheForUpd01;

	protected static MCList<MfgInstReg_Upd01_HdrR> getCacheForUpd01(String itmOrdNo) {
		MCList<MfgInstReg_Upd01_HdrR> ret = object(CLAZZ)._instCacheForUpd01.getCache(itmOrdNo);
		if (ret == null) {
			ret = MCList.create(MfgInstReg_Upd01_HdrR.class);
		}
		return ret;
	}

	protected void _initCacheForUpd01(MCList<OutSrcInst_Chk01_PoDR> poDL,
			MCList<OutSrcInst_Chk01_SchdPoDR> schdL) {
		_instCacheForUpd01 = new FXUCL_Cache<MCList<MfgInstReg_Upd01_HdrR>>();
		_instCacheForUpd01.setFixMaxCacheSize(-1);
		
		MCList<MST_ITM_ORDER_R> bindL = MCList
				.create(MST_ITM_ORDER_R.class);
		for (OutSrcInst_Chk01_PoDR r : poDL) {
			if (!isNull(r.outsrc_itm_ord_no())) {
				MST_ITM_ORDER_R bindR = MST_ITM_ORDER_R.create();
				bindR.itm_ord_no(r.outsrc_itm_ord_no());
				bindL.add(bindR);
			}
		}

		for (OutSrcInst_Chk01_SchdPoDR r : schdL) {
			if (!isNull(r.outsrc_itm_ord_no())) {
				MST_ITM_ORDER_R bindR = MST_ITM_ORDER_R.create();
				bindR.itm_ord_no(r.outsrc_itm_ord_no());
				bindL.add(bindR);
			}
		}
		bindL = bindL.groupBy(MST_ITM_ORDER_R.$itm_ord_no);

		if (!bindL.isEmpty()) {
			MCList<MST_ITM_MFG_INST_R> imiL = srchImiForUpd01Cache(bindL);
			MCIndexKey idxkey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
			for (MST_ITM_ORDER_R bindR : bindL) {
				MCList<MST_ITM_MFG_INST_R> subL = imiL.subList(idxkey, bindR.itm_ord_no());
				
				MCList<MfgInstReg_Upd01_HdrR> cacheL = MCList.create(MfgInstReg_Upd01_HdrR.class);
				for (MST_ITM_MFG_INST_R subR : subL) {
					cacheL.add(copyToCacheFromImiL(subR));
				}
				_instCacheForUpd01.putCache(new String[] {bindR.itm_ord_no()}, cacheL);
			}
		}
	}

	protected MCList<MST_ITM_MFG_INST_R> srchImiForUpd01Cache(
			MCList<MST_ITM_ORDER_R> bindL) {
		MCList<MST_ITM_ORDER_R> ioL = MCList.create(MST_ITM_ORDER_R.class);
		MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
		MCQueryApiBuilder ioL_bldr = MCQueryApiBuilder.create(t);
		ioL_bldr.setSelect(t.itm_ord_no);
		ioL_bldr.setOrderByAsc(ioL_bldr.getBaseDbc().getKeyColumn$());
		// ロック行うがキャッシュはしない（複数の発注予定を一つにまとめた場合、このタイミングではまだ品目オーダが存在していないため）
		dbSelectKeyForUpdate("MSBCL6120_MST_ITM_ORDER_S01", ioL, ioL_bldr, bindL);
		
		MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
		MST_ITM_MFG_INST_R t1 = MST_ITM_MFG_INST_R.create("T1");
		MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t1);

		editImiLStmt(imiL, true, t1, imiL_bldr);

		dbSelect("MSBCL6120_MST_ITM_MFG_INST_S02", imiL, imiL_bldr, bindL);

		MST_PURC_ACT_D_R purc_act_d = MST_PURC_ACT_D_R.create("PURC_ACT_D");
		MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
		MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(purc_act_d);
		purcActDL_bldr.setSelect(purc_act_d.re_arr_flg );
		purcActDL_bldr.addSelect(purc_act_d.mfg_inst_no);
		purcActDL_bldr.setWhere(purc_act_d.mfg_inst_no.eq(bind("mfg_inst_no")));
		dbSelect("MSBCL6120_MST_PURC_ACT_D_S01", purcActDL, purcActDL_bldr, imiL);
		MCIndexKey idxPurcActDKey = purcActDL.createIndex(MST_PURC_ACT_D_R.$mfg_inst_no);
		for (MST_ITM_MFG_INST_R imiR : imiL) {
			MCList<MST_PURC_ACT_D_R> subL = purcActDL.subList(idxPurcActDKey, imiR.getStringNE("mfg_inst_no"));
			if (!isNull(subL) && subL.subList(MST_PURC_ACT_D_R.$re_arr_flg, true).size() > 0) {
				imiR.addBooleanColumn("re_arr_flg", true);
			}
			else {
				imiR.addBooleanColumn("re_arr_flg", false);
			}
		}

		return imiL;
	}
	
	protected void editImiLStmt(MCList<MST_ITM_MFG_INST_R> imiL, boolean useItmOrdNo, MST_ITM_MFG_INST_R t, MCQueryApiBuilder imiL_bldr) {
		MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T2");
		MST_ITM_ORDER_R t3 = MST_ITM_ORDER_R.create("T3");
		MSVT_MFG_INST_PR_R t4 = MSVT_MFG_INST_PR_R.create("T4");
		MST_ARR_PR_R arrPr = MST_ARR_PR_R.create("arrPr");

		imiL_bldr.setSelect(t.itm_mfg_inst_no);
		imiL_bldr.addSelect(t.itm_ord_no);
		imiL_bldr.addSelect(t.itm_cd);
		imiL_bldr.addSelect(t.itm_sub1);
		imiL_bldr.addSelect(t.itm_sub2);
		imiL_bldr.addSelect(t.itm_sub3);
		imiL_bldr.addSelect(t.bom_ptn);
		imiL_bldr.addSelect(t.sno1);
		imiL_bldr.addSelect(t.sno2);
		imiL_bldr.addSelect(t.sno3);
		imiL_bldr.addSelect(t.sno4);
		imiL_bldr.addSelect(t.lot_no);
		imiL_bldr.addSelect(t.sublot_no);
		imiL_bldr.addSelect(t.mfg_loc_cd);
		imiL_bldr.addSelect(t.site_cd);
		imiL_bldr.addSelect(t.wg_cd);
		imiL_bldr.addSelect(t.frst_mfg_inst_no);
		imiL_bldr.addSelect(t.master_dt);
		imiL_bldr.addSelect(t.strg_loc_cd);
		imiL_bldr.addSelect(t.mfg_str_ln_cd);
		imiL_bldr.addSelect(t.strg_str_ln_cd);

		imiL.addBooleanColumn("po_locked_flg");
		imiL.addBooleanColumn("po_auto_reg_flg");
		imiL.addBooleanColumn("aprv_flg");
		imiL.addBooleanColumn("abort_flg");
		imiL_bldr.addSelect(t2.mfg_inst_no);
		imiL_bldr.addSelect(t2.po_locked_flg);
		imiL_bldr.addSelect(t2.po_auto_reg_flg);
		imiL_bldr.addSelect(t2.mfg_aprv_sts_typ);
		imiL_bldr.addSelect(t2.rqst_dlv_rqst_tm);
		imiL_bldr.addSelect(t2.base_unit_inst_qty);
		imiL_bldr.addSelect(t2.abort_flg);
		imiL_bldr.addSelect(t2.aprv_flg);
		imiL_bldr.addSelect(t2.mfg_aprv_role_cd);
		imiL_bldr.addSelect(t2.inst_dt);

		imiL_bldr.addSelect(t3.not_inst_qty);
		imiL_bldr.addSelect(t3.inst_qty);
		imiL_bldr.addSelect(t3.mfg_inst_unit_typ);

		imiL_bldr.addSelect(t4.mfg_sts_typ);

		imiL_bldr.addSelect(arrPr.purc_sts_typ);
		imiL_bldr.addInnerJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
		imiL_bldr.addInnerJoin(t3, bracket( t.itm_ord_no.eq(t3.itm_ord_no)));
		imiL_bldr.addInnerJoin(t4, bracket( t2.mfg_inst_no.eq(t4.mfg_inst_no)));
		imiL_bldr.addLeftOuterJoin(arrPr, bracket( t2.po_d_no.eq(arrPr.po_d_no)));
		
		if (useItmOrdNo) {
			imiL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
		}
		else {
			imiL_bldr.setWhere(t2.mfg_inst_no.eq(bind("re_arr_mfg_inst_no")));
		}
		imiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
	}
	
	protected MfgInstReg_Upd01_HdrR copyToCacheFromImiL(MST_ITM_MFG_INST_R dbR) {
		MfgInstReg_Upd01_HdrR cacheR = MfgInstReg_Upd01_HdrR.create();
		cacheR.itm_mfg_inst_no(dbR.itm_mfg_inst_no());
		cacheR.itm_ord_no(dbR.itm_ord_no());
		cacheR.itm_cd(dbR.itm_cd());
		cacheR.itm_sub1(dbR.itm_sub1());
		cacheR.itm_sub2(dbR.itm_sub2());
		cacheR.itm_sub3(dbR.itm_sub3());
		cacheR.bom_ptn(dbR.bom_ptn());
		cacheR.sno1(dbR.sno1());
		cacheR.sno2(dbR.sno2());
		cacheR.sno3(dbR.sno3());
		cacheR.sno4(dbR.sno4());
		cacheR.lot_no(dbR.lot_no());
		cacheR.sublot_no(dbR.sublot_no());
		cacheR.old_lot_no(dbR.lot_no());
		cacheR.old_sublot_no(dbR.sublot_no());
		cacheR.mfg_loc_cd(dbR.mfg_loc_cd());
		cacheR.mfg_loc_site_cd(dbR.site_cd());
		cacheR.mfg_loc_wg_cd(dbR.wg_cd());
		cacheR.frst_mfg_inst_no(dbR.frst_mfg_inst_no());
		cacheR.master_dt(dbR.master_dt());
		cacheR.strg_loc_cd(dbR.strg_loc_cd());
		cacheR.mfg_str_ln_cd(dbR.mfg_str_ln_cd());
		cacheR.strg_str_ln_cd(dbR.strg_str_ln_cd());
		
		cacheR.mfg_inst_no(dbR.getStringNE("mfg_inst_no"));
		cacheR.po_locked_flg(dbR.getBooleanNE("po_locked_flg"));
		cacheR.po_auto_reg_flg(dbR.getBooleanNE("po_auto_reg_flg"));
		cacheR.old_mfg_aprv_sts_typ(dbR.getStringNE("mfg_aprv_sts_typ"));
		cacheR.rqst_dlv_rqst_tm(dbR.getDateNE("rqst_dlv_rqst_tm"));
		cacheR.base_unit_inst_qty(dbR.getNumberNE("base_unit_inst_qty"));
		cacheR.old_inst_abort_flg(dbR.getBooleanNE("abort_flg"));
		cacheR.old_aprv_flg(dbR.getBooleanNE("aprv_flg"));
		cacheR.old_mfg_aprv_role_cd(dbR.getStringNE("mfg_aprv_role_cd"));
		cacheR.old_inst_dt(dbR.getDateNE("inst_dt"));
		
		cacheR.base_unit_ord_qty(dbR.getNumberNE("inst_qty"));
		cacheR.base_unit_not_inst_qty(dbR.getNumberNE("not_inst_qty"));
		cacheR.mfg_inst_unit_typ(dbR.getStringNE("mfg_inst_unit_typ"));
		
		cacheR.old_mfg_sts_typ(dbR.getStringNE("mfg_sts_typ"));
		
		cacheR.setBooleanNE("re_arr_flg", dbR.getBooleanNE("re_arr_flg"));
		cacheR.setStringNE("purc_sts_typ", dbR.getStringNE("purc_sts_typ"));
		return cacheR;
	}
	
	// Chk02とUpd02で共通して使用するキャッシュ関連の処理
	protected static void initCacheForUpd02(MCList<OutSrcInst_Chk02_ReArrR> reArrL) {
		object(CLAZZ)._initCacheForUpd02(reArrL);
	}

	protected FXUCL_Cache<MfgInstReg_Upd01_HdrR> _instCacheForUpd02;

	protected static MfgInstReg_Upd01_HdrR getCacheForUpd02(String mfgInstNo) {
		return object(CLAZZ)._instCacheForUpd02.getCache(mfgInstNo);
	}
	
	protected void _initCacheForUpd02(MCList<OutSrcInst_Chk02_ReArrR> reArrL) {
		_instCacheForUpd02 = new FXUCL_Cache<MfgInstReg_Upd01_HdrR>();
		_instCacheForUpd02.setFixMaxCacheSize(-1);
		
		MCList<OutSrcInst_Chk02_ReArrR> bindL = reArrL.subList(r -> !isNull(r.re_arr_mfg_inst_no()));
		bindL = bindL.groupBy(OutSrcInst_Chk02_ReArrR.$re_arr_mfg_inst_no);

		if (!bindL.isEmpty()) {
			MCList<MST_ITM_MFG_INST_R> imiL = srchImiForUpd02Cache(bindL);
			MCIndexKey idxkey = imiL.createIndex("mfg_inst_no");
			for (OutSrcInst_Chk02_ReArrR bindR : bindL) {
				MST_ITM_MFG_INST_R dbR = imiL.getFirst(idxkey, bindR.re_arr_mfg_inst_no());
				if (!isNull(dbR)) {
					_instCacheForUpd02.putCache(new String[] {bindR.re_arr_mfg_inst_no()}, copyToCacheFromImiL(dbR));
				}
			}
		}
	}

	protected MCList<MST_ITM_MFG_INST_R> srchImiForUpd02Cache(
			MCList<OutSrcInst_Chk02_ReArrR> bindL) {
		MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
		MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
		MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t);

		editImiLStmt(imiL, false, t, imiL_bldr);
		
		dbSelect("MSBCL6120_MST_ITM_MFG_INST_S03", imiL, imiL_bldr, bindL);
		return imiL;
	}

	// Chk03とUpd03で共通して使用するキャッシュ関連の処理
	/** 製造指図ＮＯに紐付く入荷実績キャッシュ */
	protected MCList<MST_ARR_ACT_R> _arrActByMfgInstNoL = null;
	/** 製造指図ＮＯに紐付く入荷実績キャッシュ用インデックス */
	protected MCIndexKey _arrActByMfgInstNoKey = null;
	
	/**
	 * 製造指図ＮＯに紐付く入荷実績キャッシュを作成する
	 * @param instNoL 製造指図ＮＯが含まれるリスト
	 */
	protected static <E extends MCRow> void initArrActByMfgInstNoCache(MCList<E> instNoL) {
		object(CLAZZ)._initArrActByMfgInstNoCache(instNoL);
	}
	protected <E extends MCRow>  void _initArrActByMfgInstNoCache(MCList<E> instNoL) {
		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
		_arrActByMfgInstNoL = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder arrActByMfgInstNoL_bldr = MCQueryApiBuilder.create(t);
		arrActByMfgInstNoL_bldr.setSelect(t2.mfg_inst_no);
		arrActByMfgInstNoL_bldr.addInnerJoin(t2, bracket( t.arr_schd_no.eq(t2.arr_schd_no)));
		arrActByMfgInstNoL_bldr.setWhere(t2.mfg_inst_no.eq(bind("mfg_inst_no")));
		arrActByMfgInstNoL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBCL6120_MST_ARR_ACT_S01", _arrActByMfgInstNoL, arrActByMfgInstNoL_bldr, instNoL);
		_arrActByMfgInstNoKey = _arrActByMfgInstNoL.createIndex("mfg_inst_no");
	}
	/**
	 * 製造指図ＮＯに紐付く入荷実績キャッシュを取得する</p>
	 * 製造指図ＮＯを検索条件に使用する
	 * @param mfgInstNo 製造指図ＮＯ
	 * @return 入荷実績キャッシュ
	 */
	protected static MCList<MST_ARR_ACT_R> getArrActCacheByMfgInstNo(String mfgInstNo) {
		return object(CLAZZ)._getArrActCacheByMfgInstNo(mfgInstNo);
	}
	protected MCList<MST_ARR_ACT_R> _getArrActCacheByMfgInstNo(String mfgInstNo) {
		return _arrActByMfgInstNoL.subList(_arrActByMfgInstNoKey, mfgInstNo);
	}
	
	/**
	 * OutSrcInst_Chk01オペレーション.<p>
	 *
	 * 発注の登録・訂正・取消の前に、外注製造指図の状況をチェックする<br>
	 */
	public class OutSrcInst_Chk01 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Chk01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCacheForUpd01(up0(), up1());
			
			chkMain();
			
			setDown();
		}
		
		protected void chkMain() {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxKey = up1().createIndex(OutSrcInst_Chk01_SchdPoDR.$hdr_peg_no);
			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL.addDateColumn("before_dlv_rqst_tm");
			poSchdL_bldr.setSelect(t.outsrc_itm_ord_no);
			poSchdL_bldr.addSelect(decode(t.po_d_no, nullValue(), t.dlv_rqst_tm, t2.dlv_rqst_tm).as("before_dlv_rqst_tm"));
			poSchdL_bldr.addLeftOuterJoin(t2, bracket( t.po_d_no.eq(t2.po_d_no)));
			poSchdL_bldr.setWhere(t.outsrc_itm_ord_no.eq(bind("outsrc_itm_ord_no")));
			dbSelect("MSBCL6120_MST_PO_SCHD_S02", poSchdL, poSchdL_bldr, up0());
			MCIndexKey idxPoSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);
			for (OutSrcInst_Chk01_PoDR poDR : up0()) {
				MCList<MfgInstReg_Upd01_HdrR> cacheL = MCList.create(MfgInstReg_Upd01_HdrR.class);
				MCList<OutSrcInst_Chk01_SchdPoDR> schdL = up1().subList(idxKey,
						poDR.peg_no());
				// キャッシュを設定
				setCache(poDR, schdL, cacheL);
				
				if (!poSchdL.isEmpty()) {
					MST_PO_SCHD_R poSchdR = poSchdL.getFirst(idxPoSchdKey,
							poDR.outsrc_itm_ord_no());
					if (!isNull(poSchdR)) {
						poDR.setDateNE("before_dlv_rqst_tm",
								poSchdR.getDate("before_dlv_rqst_tm"));
					}
					else {
						if (MAC_DATA_CRUD_TYP.isUPD(poDR.data_crud_typ())) {
							poDR.setDateNE("before_dlv_rqst_tm", getDlvRqstTm_poD(poDR.po_d_no()));
						}
					}
				}
				else {
					if (MAC_DATA_CRUD_TYP.isUPD(poDR.data_crud_typ())) {
						poDR.setDateNE("before_dlv_rqst_tm", getDlvRqstTm_poD(poDR.po_d_no()));
					}
				}
				// 以下、チェック処理
				if (MAC_DATA_CRUD_TYP.isCRT(poDR.data_crud_typ())) {
					if (schdL.size() > 1 && !cacheL.isEmpty()) {
						// 「schdLが複数件存在する＝発注を一つの発注明細にまとめる」
						// この場合、品目オーダを作り直す想定のため、指図済みデータが存在したらエラーとする
						for (MfgInstReg_Upd01_HdrR cacheR : cacheL) {
							msgL.add(new MCMessage(poDR, null, MSBCL1012, cacheR.mfg_inst_no(),
									toDispGUIIndex(poDR)));
						}
						poDR.err_flg(true);
					}
				}
				
				if (isExecMfgInstSrvAbort(poDR) || isExecMfgInstSrvDel(poDR, cacheL)) {
					// 削除または、打切りを実施する場合、製造指図の状態をチェックする
					for (MfgInstReg_Upd01_HdrR cacheR : cacheL) {
						if (cacheR.po_locked_flg()) {
							msgL.add(new MCMessage(poDR, null, MSBCL1007, 
									cacheR.mfg_inst_no(), toDispGUIIndex(poDR)));
							poDR.err_flg(true);
						}
					}
					for (MfgInstReg_Upd01_HdrR cacheR : cacheL) {
						if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(cacheR.old_mfg_aprv_sts_typ())) {
							msgL.add(new MCMessage(poDR, null, MSBCL1008,
									cacheR.mfg_inst_no(), toDispGUIIndex(poDR)));
							poDR.err_flg(true);
						}
					}
					// 実績登録済みチェック
					msgL.addAll(chkMfgAct(poDR, cacheL));
				}
				else {
					if (MAC_DATA_CRUD_TYP.isDEL(poDR.data_crud_typ())) {
						// 実績登録済みチェック
						msgL.addAll(chkMfgAct(poDR, cacheL));
						
						// 発注時自動作成ＦＬＧがオンの製造指図が存在する場合は、発注処理が自動的に作成した製造指図のため、
						// 発注明細の取り消しと同時に製造指図を取り消しする。
						// 一方で、発注時自動作成ＦＬＧがオフの製造指図のみの場合、発注明細の取り消しと同時には製造指図を取り消ししない。
						// この場合に、「未発注だが製造指図が分割されている」という状態を許容できないため、発注明細の取り消し処理をエラーとする
						if (!cacheL.get(0).base_unit_not_inst_qty().isZero()) {
							for (MfgInstReg_Upd01_HdrR cacheR : cacheL) {
								msgL.add(new MCMessage(poDR, null, MSBCL1010, poDR.po_d_no(),
										cacheR.mfg_inst_no(), toDispGUIIndex(poDR)));
							}
							poDR.err_flg(true);
						}
						else if (cacheL.size() > 1) {
							msgL.add(new MCMessage(poDR, null, MSBCL1011, poDR
									.po_d_no(), toDispGUIIndex(poDR)));
							poDR.err_flg(true);
						}
					}
				}
			}
			
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}
		
		protected void setCache(OutSrcInst_Chk01_PoDR poDR,
				MCList<OutSrcInst_Chk01_SchdPoDR> schdL,
				MCList<MfgInstReg_Upd01_HdrR> cacheL) {
			if (MAC_DATA_CRUD_TYP.isCRT(poDR.data_crud_typ())) {
				for (OutSrcInst_Chk01_SchdPoDR schdR : schdL) {
					cacheL.addAll(getCacheForUpd01(schdR.outsrc_itm_ord_no()));
				}
			}
			else {
				cacheL.addAll(getCacheForUpd01(poDR.outsrc_itm_ord_no()));
			}
		}
		
		protected MCMessageList chkMfgAct(OutSrcInst_Chk01_PoDR poDR,MCList<MfgInstReg_Upd01_HdrR> cacheL) {
			MCMessageList msgL = new MCMessageList();
			for (MfgInstReg_Upd01_HdrR cacheR : cacheL) {
				if (!cacheR.old_inst_abort_flg()
						&& (MSC_MFG_STS_TYP.isSTT(cacheR.old_mfg_sts_typ()) || MSC_MFG_STS_TYP
								.isCMPL(cacheR.old_mfg_sts_typ()))) {
					// 指図の打切ＦＬＧがオフかつ、製造状況が着手中または完了であれば実績登録済み
					msgL.add(new MCMessage(poDR, null, MSBCL1009, poDR.po_d_no(),
							cacheR.mfg_inst_no(), toDispGUIIndex(poDR)));
					poDR.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * Upd01オペレーションで、製造指図登録サービスの打切を実施するかどうか
		 * @return
		 */
		protected boolean isExecMfgInstSrvAbort(OutSrcInst_Chk01_PoDR poDR) {
			if (MAC_DATA_CRUD_TYP.isUPD(poDR.data_crud_typ())) {
				if (poDR.abort_flg()) {
					return true;
				}
			}
			return false;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected MCDate getDlvRqstTm_poD(String podno) {
		MST_PO_D_R tmpPoDR = MST_PO_D_R.create();
		tmpPoDR.po_d_no(podno);
		MCQueryApiBuilder tmpPoDR_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		tmpPoDR_bldr.setSelect(tmpPoDR.dlv_rqst_tm);
		dbSelectKey("MSBCL6120_MST_PO_D_S01", tmpPoDR, tmpPoDR_bldr, tmpPoDR);
		return tmpPoDR.dlv_rqst_tm();
	}

	/**
	 * Upd01オペレーションで、製造指図登録サービスの削除を実施するかどうか
	 * @return
	 */
	protected boolean isExecMfgInstSrvDel(OutSrcInst_Chk01_PoDR poDR, MCList<MfgInstReg_Upd01_HdrR> cacheL) {
		if (MAC_DATA_CRUD_TYP.isCRT(poDR.data_crud_typ())
				|| MAC_DATA_CRUD_TYP.isUPD(poDR.data_crud_typ())) {
			if (cacheL.subList(r -> !r.getBoolean("re_arr_flg")).size() > 1) {
				// 外注品目オーダＮＯに対応する製造指図が複数存在する場合
				return true;
			}
			if (!cacheL.isEmpty()) {
				MfgInstReg_Upd01_HdrR dbR = cacheL.get(0);
				if (isMfgItmChg(poDR, dbR) && !MSC_PURC_STS_TYP.isCOMPL(dbR.getStringNE("purc_sts_typ"))) {
					// 製造関連項目に変更がある場合（削除⇒新規で製造指図が作り直される）
					return true;
				}
			}
		}
		if (MAC_DATA_CRUD_TYP.isDEL(poDR.data_crud_typ())) {
			if (!isNull(cacheL.getFirst(MfgInstReg_Upd01_HdrR.$po_auto_reg_flg, true))) {
				// 発注時自動作成ＦＬＧがtrueの行が存在する場合は、削除する。
				// 存在しない場合は、発注前に製造指図を登録したということなので、削除しない
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 製造関連項目に変更があるか否か
	 * @param upR
	 * @param dbR
	 * @return
	 */
	protected boolean isMfgItmChg(OutSrcInst_Chk01_PoDR upR, MfgInstReg_Upd01_HdrR dbR) {
		// 本メソッドを修正する場合は、Sprt01への影響（ＢＯＭ展開して単価を取得するか否かの判断）も調査する必要がある
		if (!isSame(upR.base_unit_qty(), dbR.base_unit_inst_qty())
				|| !isSame(upR.sno1(), dbR.sno1())
				|| !isSame(upR.sno2(), dbR.sno2())
				|| !isSame(upR.sno3(), dbR.sno3())
				|| !isSame(upR.sno4(), dbR.sno4())
				|| !isSame(upR.rqst_dlv_rqst_tm().startTimeOfDay(),
						upR.getDate("before_dlv_rqst_tm").startTimeOfDay())
				) {
			return true;
		}
		return false;
	}

	
	/**
	 * OutSrcInst_Chk02オペレーション.<p>
	 *
	 * 再入荷予定の訂正・取消の前に、外注製造指図の状況をチェックする<br>
	 */
	public class OutSrcInst_Chk02 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCacheForUpd02(up0());
			
			chkMain();
			
			setDown();
		}
		
		protected void chkMain() {
			MCMessageList msgL = new MCMessageList();
			
			for (OutSrcInst_Chk02_ReArrR upR : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					continue;
				}
				
				if (isNull(upR.re_arr_mfg_inst_no())) {
					// 製造指図を分割すると入荷予定の製造指図ＮＯがクリアされることがあるためチェックする
					msgL.add(new MCMessage(upR, null, MSBCL1093, upR.purc_act_d_no(), toDispGUIIndex(upR)));
					upR.err_flg(true);
					// 以降のチェックは意味が無いため行わない
					continue;
				}
				
				MfgInstReg_Upd01_HdrR cacheR = getCacheForUpd02(upR.re_arr_mfg_inst_no());
				if (isNull(cacheR)) {
					continue;
				}
				
				// 分割チェック
				if (!isSame(upR.old_base_unit_qty(), cacheR.base_unit_inst_qty())) {
					msgL.add(new MCMessage(upR, null, MSBCL1092, upR.purc_act_d_no(), 
							upR.re_arr_mfg_inst_no(), toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
					// 製造関連項目に変更がない場合は、以降のチェックは行わない
					if (!isChgReArr(upR, cacheR)) {
						continue;
					}
				}
				
				// 発注訂正・取消不可チェック
				if (cacheR.po_locked_flg()) {
					msgL.add(new MCMessage(upR, null, MSBCL1013, upR.purc_act_d_no(), 
							upR.re_arr_mfg_inst_no(), toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
				// 承認済チェック
				if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(cacheR.old_mfg_aprv_sts_typ())) {
					msgL.add(new MCMessage(upR, null, MSBCL1014, upR.purc_act_d_no(), 
							upR.re_arr_mfg_inst_no(), toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
				// 実績登録済チェック
				if (!cacheR.old_inst_abort_flg()
						&& (MSC_MFG_STS_TYP.isSTT(cacheR.old_mfg_sts_typ()) || MSC_MFG_STS_TYP
								.isCMPL(cacheR.old_mfg_sts_typ()))) {
					msgL.add(new MCMessage(cacheR, null, MSBCL1015, upR.purc_act_d_no(),
							upR.re_arr_mfg_inst_no(), toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
			}
			
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected boolean isChgReArr(OutSrcInst_Chk02_ReArrR upR, MfgInstReg_Upd01_HdrR cacheR) {
		if (!isSame(cacheR.base_unit_inst_qty(), upR.base_unit_qty())
				|| !isSame(cacheR.rqst_dlv_rqst_tm().startTimeOfDay(),
						upR.dlv_rqst_tm().startTimeOfDay())) {
			// 製造関連項目に変更がある場合（削除⇒新規で製造指図が作り直される）
			return true;
		}
		return false;
	}
	
	/**
	 * OutSrcInst_Chk03オペレーション.<p>
	 *
	 * 入荷予定の打切の前に、外注製造指図の状況をチェックする<br>
	 */
	public class OutSrcInst_Chk03 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			
			MCList<OutSrcInst_Chk03_ArrAbortR> bindL = up0().groupBy(OutSrcInst_Chk03_ArrAbortR.$mfg_inst_no);
			bindL.sort(OutSrcInst_Chk03_ArrAbortR.$mfg_inst_no);

			initArrActByMfgInstNoCache(bindL);
			MCList<MST_MFG_INST_R> miL = getMfgInst(bindL);
			
			MCIndexKey miIdxkey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			for (OutSrcInst_Chk03_ArrAbortR r : up0()) {
				if (isNull(r.mfg_inst_no())) {
					MCMessagePool.add(new MCMessage(r, null, MSBCL1020, r.arr_schd_no(), toDispGUIIndex(r)));
					r.err_flg(true);
					continue;
				}
				MST_MFG_INST_R miR = miL.getFirst(miIdxkey, r.mfg_inst_no());
				MCList<MST_ARR_ACT_R> aaL = getArrActCacheByMfgInstNo(r.mfg_inst_no());
				if (isNull(miR)) {
					// 製造指図存在チェック
					MCMessagePool.add(new MCMessage(r, null, MSBCL1019, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(true);
					continue;
				}
				
				if (isNull(aaL)) {
					// 入荷登録済みの場合は製造指図の打切をしないので、以下のチェックは行わない
					if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(miR.mfg_aprv_sts_typ())) {
						// 指図承認済みチェック
						MCMessagePool.add(new MCMessage(r, null, MSBCL1016, r.arr_schd_no(),
								r.mfg_inst_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}

					if (!isNull(miR.getStringNE("mfg_act_no"))) {
						// 製造実績登録済みチェック
						MCMessagePool.add(new MCMessage(r, null, MSBCL1017, r.arr_schd_no(),
								r.mfg_inst_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			chkQty(miL, miIdxkey);
			
			setDown();
		}
		
		protected MCList<MST_MFG_INST_R> getMfgInst(MCList<OutSrcInst_Chk03_ArrAbortR> bindL) {
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
			MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(t);
			miL_bldr.setSelect(t.mfg_inst_no);
			miL_bldr.addSelect(t.base_unit_inst_qty);
			miL_bldr.addSelect(t.mfg_aprv_sts_typ);
			miL_bldr.addSelect(t3.mfg_act_no);
			miL_bldr.addInnerJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			miL_bldr.addLeftOuterJoin(t3, bracket( t.mfg_inst_no.eq(t3.mfg_inst_no)));
			miL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			miL_bldr.addWhereWithAnd(t2.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
			miL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			miL_bldr.setOrderByAsc(miL_bldr.getBaseDbc().getKeyColumn$());
			miL_bldr.addLockTable(t.mfg_inst_no);
			dbSelectForUpdate("MSBCL6120_MST_MFG_INST_S02", miL, miL_bldr, bindL);
			return miL;
		}
		
		protected void chkQty(MCList<MST_MFG_INST_R> miL, MCIndexKey miIdxkey) {
			for (MCList<OutSrcInst_Chk03_ArrAbortR> gL : up0()
					.groupList(OutSrcInst_Chk03_ArrAbortR.$mfg_inst_no)) {
				OutSrcInst_Chk03_ArrAbortR g0R = gL.get(0);
				if (isNull(g0R.mfg_inst_no())) {
					continue;
				}
				
				MST_MFG_INST_R miR = miL.getFirst(miIdxkey, g0R.mfg_inst_no());
				if (isNull(miR)) {
					continue;
				}
				MCList<MST_ARR_ACT_R> aaL = getArrActCacheByMfgInstNo(g0R.mfg_inst_no());
				if (!isNull(aaL)) {
					// 入荷登録済みの場合は製造指図の打切をしないので、以下のチェックは行わない
					continue;
				}
				
				MCNumber sumAbortQty = gL.sum(OutSrcInst_Chk03_ArrAbortR.$base_unit_abort_qty);
				if (!isSame(sumAbortQty, miR.base_unit_inst_qty())) {
					// 打切数量の合計値と指図数量の一致のチェック
					for (OutSrcInst_Chk03_ArrAbortR gR : gL) {
						if (gR.abort_flg()) {
							MCMessagePool.add(new MCMessage(gR, null, MSBCL1018, gR.arr_schd_no(), gR.mfg_inst_no(), gR.base_unit_abort_qty(),
									sumAbortQty, miR.base_unit_inst_qty(), toDispGUIIndex(gR)));
						}
						else {
							MCMessagePool.add(new MCMessage(gR, null, MSBCL1207, gR.arr_schd_no(), gR.mfg_inst_no(), gR.base_unit_abort_qty(),
									sumAbortQty, miR.base_unit_inst_qty(), toDispGUIIndex(gR)));
						}
						gR.err_flg(true);
					}
				}
			}
		}
		
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	/**
	 * OutSrcInst_Upd01オペレーション.<p>
	 *
	 * 発注の登録・訂正・取消に応じて、外注製造指図を登録・訂正・取消する<br>
	 */
	public class OutSrcInst_Upd01 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doLocCache();
			
			MCList<MfgInstReg_Upd01_HdrR> delHdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			MCList<MfgInstReg_Upd01_HdrR> crtHdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			MCList<MST_ITM_ORDER_R> itmOrdUpdL = MCList.create(MST_ITM_ORDER_R.class);
			MCList<MST_IO_SCHD_R> ioSchdDelL = MCList.create(MST_IO_SCHD_R.class);
			
			// 製造指図のupdate用コンテナ
			// ・新規登録時に、既に製造指図が登録済みかつ再作成の必要がない場合、発注明細ＮＯを上り電文の値に更新する
			// ・取り消し時に、発注前に製造指図が登録済みであったため製造指図の取消が不要な場合、発注明細ＮＯをNULLにクリアする

			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL.addDateColumn("poschd_dlv_rqst_tm");
			poSchdL.addDateColumn("pod_dlv_rqst_tm");
			poSchdL_bldr.setSelect(t.outsrc_itm_ord_no);
			poSchdL_bldr.addSelect(t.dlv_rqst_tm.as("poschd_dlv_rqst_tm"));
			poSchdL_bldr.addSelect(t2.dlv_rqst_tm.as("pod_dlv_rqst_tm"));
			poSchdL_bldr.addLeftOuterJoin(t2, bracket( t.po_d_no.eq(t2.po_d_no)));
			poSchdL_bldr.setWhere(t.outsrc_itm_ord_no.eq(bind("outsrc_itm_ord_no")));
			dbSelect("MSBCL6120_MST_PO_SCHD_S03", poSchdL, poSchdL_bldr, up0());
			MCIndexKey idxPoSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);
			MCList<MST_MFG_INST_R> podNoUpdL = MCList.create(MST_MFG_INST_R.class);
			for (OutSrcInst_Chk01_PoDR r : up0()) {
				MCList<MfgInstReg_Upd01_HdrR> cacheL = getCacheForUpd01(r.outsrc_itm_ord_no());
				
				// 打切、打切取消は、入荷予定サービスから呼ばれるため本更新処理では何も行わない
				if (r.abort_flg()) {
					continue;
				}
				if (!cacheL.isEmpty()) {
					if (cacheL.get(0).old_inst_abort_flg()) {
						continue;
					}
				}

				if (!poSchdL.isEmpty()) {
					MST_PO_SCHD_R poSchdR = poSchdL.getFirst(idxPoSchdKey,
							r.outsrc_itm_ord_no());
					if (!isNull(poSchdR)) {
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							r.setDateNE("before_dlv_rqst_tm",
									poSchdR.getDate("poschd_dlv_rqst_tm"));
						}
						else {
							r.setDateNE("before_dlv_rqst_tm",
									nvl(poSchdR.getDate("pod_dlv_rqst_tm"),
											poSchdR.getDate("poschd_dlv_rqst_tm")));
						}
					}
					else {
						if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							r.setDateNE("before_dlv_rqst_tm", getDlvRqstTm_poD(r.po_d_no()));
						}
					}
				}
				else {
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						r.setDateNE("before_dlv_rqst_tm", getDlvRqstTm_poD(r.po_d_no()));
					}
				}
				if (isExecMfgInstSrvDel(r, cacheL)) {
					// 製造指図の取り消しを行う場合
					for (MfgInstReg_Upd01_HdrR cacheR : cacheL) {
						MfgInstReg_Upd01_HdrR delHdrR = MfgInstReg_Upd01_HdrR.create();
						delHdrR.setAttributes(r);
						copy(delHdrR, r, createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_DEL());
						setDelHdrCmn(delHdrR, cacheR);
						// 発注を取り消しすると全製造指図が取り消しされるため、未指図数量もオーダ数量に戻す
						delHdrR.base_unit_not_inst_qty(cacheR.base_unit_ord_qty());

						delHdrL.add(delHdrR);
					}
					
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						// 発注時自動作成、ロットＮＯ、サブロットＮＯは元の値を引き継ぐ
						// ※品目オーダなどから取得する項目のマッピングは後の処理で行う
						MfgInstReg_Upd01_HdrR crtHdrR = MfgInstReg_Upd01_HdrR.create();
						crtHdrR.setAttributes(r);
						copy(crtHdrR, r, createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_CRT());
						if (isCopyPoAutoRegFlg(r, cacheL)) {
							boolean isAutoReg = !isNull(cacheL.getFirst(MfgInstReg_Upd01_HdrR.$po_auto_reg_flg, true));
							crtHdrR.po_auto_reg_flg(isAutoReg);
						}
						else {
							crtHdrR.po_auto_reg_flg(true);
						}
						cacheL.sort(MfgInstReg_Upd01_HdrR.$mfg_inst_no);
						MfgInstReg_Upd01_HdrR lotSrcR = cacheL.get(0);
						crtHdrR.lot_no(lotSrcR.lot_no());
						crtHdrR.sublot_no(lotSrcR.sublot_no());
						if (MSC_MFG_STS_TYP.isSAV(lotSrcR.old_mfg_sts_typ()) || MSC_MFG_STS_TYP.isORD(lotSrcR.old_mfg_sts_typ())) {
							crtHdrR.setBooleanNE("complFroInst", true);
							crtHdrR.master_dt(lotSrcR.master_dt());
							crtHdrR.mfg_loc_cd(lotSrcR.mfg_loc_cd());
							crtHdrR.bom_ptn(lotSrcR.bom_ptn());
							crtHdrR.strg_loc_cd(lotSrcR.strg_loc_cd());
							crtHdrR.mfg_str_ln_cd(lotSrcR.mfg_str_ln_cd());
							crtHdrR.strg_str_ln_cd(lotSrcR.strg_str_ln_cd());
						}
						crtHdrL.add(crtHdrR);
					}
				}
				else {
					// 製造指図の取り消しを行わない場合
					// ※ここの分岐ではキャッシュが複数件存在することはありえない
					// 複数件存在する場合は、事前のチェックでエラーとなるまたは、上記取消の分岐に入るため
					
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						if (cacheL.isEmpty()) {
							// 新規に作成する（発注時自動作成はオン）
							// ※品目オーダなどから取得する項目のマッピングは後の処理で行う
							MfgInstReg_Upd01_HdrR crtHdrR = MfgInstReg_Upd01_HdrR.create();
							crtHdrR.setAttributes(r);
							copy(crtHdrR, r, createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_CRT());
							crtHdrR.po_auto_reg_flg(true);
							crtHdrL.add(crtHdrR);
						}
						else {
							MfgInstReg_Upd01_HdrR cacheR = cacheL.get(0);
							copyForDownByCache(r, cacheR);
							
							// 既に登録済みの場合、発注明細ＮＯを設定する
							MST_MFG_INST_R updR = MST_MFG_INST_R.create();
							updR.mfg_inst_no(r.mfg_inst_no());
							updR.po_d_no(r.po_d_no());
							podNoUpdL.add(updR);
						}
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						MfgInstReg_Upd01_HdrR cacheR = cacheL.get(0);
						copyForDownByCache(r, cacheR);
						
						MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
						MST_MFG_INST_R mfgInstL_t = MST_MFG_INST_R.create("T");
						MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(mfgInstL_t);
						mfgInstL_bldr.setWhere(mfgInstL_t.po_d_no.eq(bind("po_d_no")));
						mfgInstL_bldr.addWhereWithAnd(mfgInstL_t.can_flg.eq(value(false)));
						dbSelect("MSBCL6120_MST_MFG_INST_S06", mfgInstL, mfgInstL_bldr, r);
						
						MST_ITM_ORDER_R itmOrdR = MST_ITM_ORDER_R.create();
						MST_ITM_ORDER_R itmOrdR_t = MST_ITM_ORDER_R.create("T");
						MCQueryApiBuilder itmOrdR_bldr = MCQueryApiBuilder.create(itmOrdR_t);
						itmOrdR_bldr.setWhere(itmOrdR_t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
						dbSelect("MSBCL6120_MST_ITM_ORDER_S03", itmOrdR, itmOrdR_bldr, r);
						
						MCNumber notInstQty = MCNumber.ZERO;
						notInstQty = r.base_unit_qty().subtract(mfgInstL.sum(MST_MFG_INST_R.$base_unit_inst_qty));
						if (!isSame(itmOrdR.not_inst_qty(), notInstQty)) {
							itmOrdR.not_inst_qty(notInstQty);
							if (MSC_ORD_GNRT_TYP.isUPLND(itmOrdR.ord_gnrt_typ())) {
								// 計画外の場合、製造指図が未指図打切として扱われるのを防ぐため、指図予定数量と出来高予定数量を更新する
								itmOrdR.inst_qty(r.base_unit_qty());
								itmOrdR.yield_schd_qty(r.base_unit_qty());
							}
							itmOrdUpdL.add(itmOrdR);
						}
						
						MST_IO_SCHD_R ioSchdL_t = MST_IO_SCHD_R.create("T");
						MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(ioSchdL_t);
						ioSchdL_bldr.setWhere(ioSchdL_t.io_schd_no.eq(bind("outsrc_itm_ord_no")));
						mfgInstL_bldr.addWhereWithAnd(ioSchdL_t.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT.value())));
						mfgInstL_bldr.addWhereWithAnd(ioSchdL_t.io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.SCHD.value())));
						dbSelect("MSBCL6120_MST_IO_SCHD_S01", ioSchdDelL, ioSchdL_bldr, r);
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						// 発注前に指図済みであれば取り消し不要なので、発注明細ＮＯのクリアのみ
						MST_MFG_INST_R updR = MST_MFG_INST_R.create();
						updR.mfg_inst_no(cacheL.get(0).mfg_inst_no());
						updR.po_d_no(null);
						podNoUpdL.add(updR);
					}
				}
			}
			
			if (!delHdrL.isEmpty()) {
				callMfgInstDelService(delHdrL);
			}
			
			if (!crtHdrL.isEmpty()) {
				MCIndexKey hdrIdxKey = crtHdrL.createIndex(MfgInstReg_Upd01_HdrR.$peg_no);
				MCList<MfgInstReg_Upd01_HdrR> srvDown = callMfgInstCrtService(crtHdrL, hdrIdxKey, false);
				copyForDownByCrtSrv(up0(), crtHdrL, hdrIdxKey, srvDown);
			}
			
			// 発注明細ＮＯの更新
			if (!podNoUpdL.isEmpty()) {
				MST_MFG_INST_R podNoUpdL_t = MST_MFG_INST_R.create("PODUPD");
				MCQueryApiBuilder podNoUpdL_bldr = MCQueryApiBuilder.create(podNoUpdL_t);
				updMfgInst(podNoUpdL, podNoUpdL_t, podNoUpdL_bldr);
				callRevDataIns01(podNoUpdL);
			}
			
			if (!itmOrdUpdL.isEmpty()) {
				MST_ITM_ORDER_R updItmOrdL_t = MST_ITM_ORDER_R.create("T");
				MCQueryApiBuilder updItmOrdL_bldr = MCQueryApiBuilder.create(updItmOrdL_t);
				updItmOrdL_bldr.setSet(updItmOrdL_t.not_inst_qty);
				updItmOrdL_bldr.addSet(updItmOrdL_t.inst_qty, updItmOrdL_t.yield_schd_qty);
				dbUpdateKey("MSBCL6120_MST_ITM_ORDER_U01", itmOrdUpdL, updItmOrdL_bldr);
			}
			
			if (!ioSchdDelL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 del = MSBEL_IoSchdService.crtIoSchd_Del01();
				addAll(del.up0(), ioSchdDelL, createMap_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R());
				del.exec();
			}
			
			setDown();
		}
		
		/**
		 * 受払予定作成サービスの削除オペレーションへのマッピング
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R<MSW_IO_SCHD_DEL_R, MST_IO_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R<MSW_IO_SCHD_DEL_R, MST_IO_SCHD_R>();
		}
		
		public class Map_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R<D extends MSW_IO_SCHD_DEL_R, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_IO_SCHD_R.$io_schd_no);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_typ, MST_IO_SCHD_R.$io_schd_typ);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sts_typ, MST_IO_SCHD_R.$io_schd_sts_typ);
			}
		}
		
		protected boolean isCopyPoAutoRegFlg(OutSrcInst_Chk01_PoDR r, MCList<MfgInstReg_Upd01_HdrR> cacheL) {
			// 発注数量、手配ＮＯを変更していない場合のみ引き継ぐ（FLGがオフの場合に、引き継いで登録した製造指図を取り消ししたときオーダと齟齬があると問題のある項目が同じ場合に引き継ぐ）
			MfgInstReg_Upd01_HdrR cacheR = cacheL.get(0);
			return isSame(cacheR.base_unit_ord_qty(), r.base_unit_qty())
					&& isSame(cacheR.sno1(), r.sno1()) && isSame(cacheR.sno2(), r.sno2())
					&& isSame(cacheR.sno3(), r.sno3()) && isSame(cacheR.sno4(), r.sno4());
		}
		
		protected void doLocCache() {
			MCList<MfgInstReg_Upd01_HdrR> cacheL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			for (OutSrcInst_Chk01_PoDR r : up0()) {
				cacheL.addAll(getCacheForUpd01(r.outsrc_itm_ord_no()));
			}
			doLocCacheCmn(cacheL);
		}
		
		/**
		 * 製造指図が既に存在する場合の下り電文設定処理
		 * @param r
		 * @param cacheR
		 */
		protected void copyForDownByCache(OutSrcInst_Chk01_PoDR r, MfgInstReg_Upd01_HdrR cacheR) {
			r.mfg_inst_no(cacheR.mfg_inst_no());
			r.lot_no(cacheR.lot_no());
			r.sublot_no(cacheR.sublot_no());
			r.pre_outsrc_act_flg(_locCache.getEx(cacheR.mfg_loc_cd()).pre_outsrc_act_flg());
		}
		
		/**
		 * 製造指図を新規登録した場合の下り電文設定処理
		 * @return
		 */
		protected void copyForDownByCrtSrv(MCList<OutSrcInst_Chk01_PoDR> upL, MCList<MfgInstReg_Upd01_HdrR> crtHdrL,
				MCIndexKey hdrIdxKey,
				MCList<MfgInstReg_Upd01_HdrR> srvDown) {
			
			MCIndexKey upIdxKey = upL.createIndex(OutSrcInst_Chk01_PoDR.$peg_no);
			for (MfgInstReg_Upd01_HdrR srvDownR : srvDown) {
				MfgInstReg_Upd01_HdrR crtHdrR = crtHdrL.getFirst(hdrIdxKey, srvDownR.peg_no());
				OutSrcInst_Chk01_PoDR upR = up0().getFirst(upIdxKey, srvDownR.peg_no());
				upR.mfg_inst_no(srvDownR.mfg_inst_no());
				upR.lot_no(crtHdrR.lot_no());
				upR.sublot_no(crtHdrR.sublot_no());
				upR.pre_outsrc_act_flg(_locCache.getEx(crtHdrR.mfg_loc_cd()).pre_outsrc_act_flg());
			}
		}
		
		// ヘッダ（削除用）
		protected Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_DEL<MfgInstReg_Upd01_HdrR,OutSrcInst_Chk01_PoDR> createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_DEL() {
			return new Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_DEL<MfgInstReg_Upd01_HdrR, OutSrcInst_Chk01_PoDR>();
		}

		public class Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_DEL<D extends MfgInstReg_Upd01_HdrR, S extends OutSrcInst_Chk01_PoDR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$peg_no, OutSrcInst_Chk01_PoDR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_ord_no, OutSrcInst_Chk01_PoDR.$outsrc_itm_ord_no);

			}
		}
			
		// ヘッダ（新規用）
		protected Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_CRT<MfgInstReg_Upd01_HdrR, OutSrcInst_Chk01_PoDR> createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_CRT() {
			return new Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_CRT<MfgInstReg_Upd01_HdrR, OutSrcInst_Chk01_PoDR>();
		}

		public class Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk01_PoDR_CRT<D extends MfgInstReg_Upd01_HdrR, S extends OutSrcInst_Chk01_PoDR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$peg_no, OutSrcInst_Chk01_PoDR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno1, OutSrcInst_Chk01_PoDR.$sno1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno2, OutSrcInst_Chk01_PoDR.$sno2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno3, OutSrcInst_Chk01_PoDR.$sno3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno4, OutSrcInst_Chk01_PoDR.$sno4);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_inst_qty, OutSrcInst_Chk01_PoDR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_yield_qty, OutSrcInst_Chk01_PoDR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_dt, OutSrcInst_Chk01_PoDR.$po_dt);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_ord_no, OutSrcInst_Chk01_PoDR.$outsrc_itm_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_d_no, OutSrcInst_Chk01_PoDR.$po_d_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$rqst_dlv_rqst_tm, OutSrcInst_Chk01_PoDR.$rqst_dlv_rqst_tm);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 本処理から実行する場合は、発注予定を更新しないためnullを渡す
				dest.po_schd_data_crud_typ(null);
				dest.is_src_outsrc_srv_flg(true);
				dest.lst_reg_flg(true);
				// オーダ数量より少ない発注数量だったとしても未指図数量は0とする（発注側が発注予定を残管理していないため）
				dest.base_unit_not_inst_qty(MCNumber.ZERO);
			}
		}
		
		protected void updMfgInst(MCList<MST_MFG_INST_R> podNoUpdL, MST_MFG_INST_R list, MCQueryApiBuilder builder) {
			builder.setSet(list.po_d_no);
			dbUpdateKey("MSBCL6120_MST_MFG_INST_U01", podNoUpdL, builder);
		}

		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MCList<MST_MFG_INST_R> argL) {
			MCList<MST_MFG_INST_R> wkL = MCList.create(MST_MFG_INST_R.class);
			for (MST_MFG_INST_R r : argL) {
				MST_MFG_INST_R wkR = MST_MFG_INST_R.create();
				wkR.mfg_inst_no(r.mfg_inst_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6120_MSW_MFG_INST_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6120_MSW_MFG_INST_I01", wkL.groupBy(wkL.createRow().getKeyColumn()), wkL_bldr.getBaseDbc());
			
			MSW_MFG_INST_KEY_R w = MSW_MFG_INST_KEY_R.create("W");

			MCList<MST_MFG_INST_R> hdrL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T1");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t2);
			hdrL_bldr.addInnerJoin(w, bracket( t2.mfg_inst_no.eq(w.mfg_inst_no)));
			dbSelect("MSBCL6120_MST_MFG_INST_S03", hdrL, hdrL_bldr);

			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_MFG_INST_R hdrR : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.mfg_inst_no());
				opeR.rev_no(hdrR.mfg_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_MFG_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	// Upd01, Upd02共通処理
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
	
	protected void doLocCacheCmn(MCList<MfgInstReg_Upd01_HdrR> cacheL) {
		// 場所マスタ
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
		locL_bldr.setSelect(t.sppl_cd, t.maker_cd, t.wg_cd, t.site_cd, t.pre_outsrc_act_flg);
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, cacheL,
				MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
	}
	
	// Upd01,Upd02,Upd04共通処理関連
	protected String getMfgStsTyp(String lotIssueTyp, String lotNo) {
		if (!isNullOrNullVal(lotNo)) {
			return MSC_MFG_STS_TYP.ORD.value();
		}
		else {
			if (MAC_LOT_ISSUE_TYP.isON_INST(lotIssueTyp)) {
				// 指図時ロット発番であれば指図保存を渡す
				// ※子品目のロットを引き継ぐなど引き当てた投入品の情報を元にロットＮＯを決める場合があり、発注時にはロットＮＯが確定しないことがあるため、
				// 外注品のロットＮＯは製造指図時にロットを決める想定とする
				return MSC_MFG_STS_TYP.SAV.value();
			}
			else {
				return MSC_MFG_STS_TYP.ORD.value();
			}
		}
	}
	
	protected void setDelHdrCmn(MfgInstReg_Upd01_HdrR dest, MfgInstReg_Upd01_HdrR cacheR) {
		dest.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		dest.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		dest.mfg_mtd_typ(MSC_MFG_MTD_TYP.EXTNL.value());
		dest.itm_cd(cacheR.itm_cd());
		dest.itm_sub1(cacheR.itm_sub1());
		dest.itm_sub2(cacheR.itm_sub2());
		dest.itm_sub3(cacheR.itm_sub3());
		dest.bom_ptn(cacheR.bom_ptn());
		dest.sno1(cacheR.sno1());
		dest.sno2(cacheR.sno2());
		dest.sno3(cacheR.sno3());
		dest.sno4(cacheR.sno4());
		dest.mfg_inst_no(cacheR.mfg_inst_no());
		dest.itm_mfg_inst_no(cacheR.itm_mfg_inst_no());
		dest.frst_mfg_inst_no(cacheR.frst_mfg_inst_no());
		dest.mfg_inst_unit_typ(cacheR.mfg_inst_unit_typ());
		// 移動指図取消可は常にtrue（発注訂正取消不可ＦＬＧによって製造指図の取り消し可否をコントロールしているため）
		dest.xfr_inst_del_enable_flg(true);
		dest.mfg_loc_wg_cd(cacheR.mfg_loc_wg_cd());
		dest.mfg_loc_site_cd(cacheR.mfg_loc_site_cd());
		dest.old_mfg_sts_typ(cacheR.old_mfg_sts_typ());
		dest.old_aprv_flg(cacheR.old_aprv_flg());
		dest.old_mfg_aprv_sts_typ(cacheR.old_mfg_aprv_sts_typ());
		dest.old_mfg_aprv_role_cd(cacheR.old_mfg_aprv_role_cd());
		dest.old_inst_dt(cacheR.old_inst_dt());
		dest.old_lot_no(cacheR.old_lot_no());
		dest.old_sublot_no(cacheR.old_sublot_no());
		dest.is_src_outsrc_srv_flg(true);
		dest.lst_reg_flg(true);
		dest.mfg_loc_cd(cacheR.mfg_loc_cd());
	}
	/**
	 * 製造指図登録サービスの取消処理
	 */
	protected void callMfgInstDelService(MCList<MfgInstReg_Upd01_HdrR> delHdrL) {
		MSBCL_MfgInstRegService.MfgInstReg_Upd01 o = MSBCL_MfgInstRegService
				.crtMfgInstReg_Upd01();
		setPegNo(delHdrL);
		
		MCIndexKey hdrIdxKey = delHdrL.createIndex(MfgInstReg_Upd01_HdrR.$mfg_inst_no);
		MCList<MfgInstReg_Upd01_DtlOperR> delDtlOperL = getDtlOperLForDel(hdrIdxKey, delHdrL);
		MCIndexKey operIdxKey = delDtlOperL.createIndex(MfgInstReg_Upd01_DtlOperR.$oper_inst_no);
		MCList<MfgInstReg_Upd01_DtlInptR> delDtlInptL = setDtlInptLForDel(hdrIdxKey, delHdrL, operIdxKey, delDtlOperL);
		MCList<MfgInstReg_Upd01_DtlYieldR> delDtlYieldL = setDtlYieldLForDel(hdrIdxKey, delHdrL, operIdxKey, delDtlOperL);
		o.up0().setAll(delHdrL);
		o.up1().setAll(delDtlOperL);
		o.up2().setAll(delDtlInptL);
		o.up4().setAll(delDtlYieldL);
		setMesFlg(o.up0(), o.up1());
		o.exec();
	}
	
	protected MCList<MfgInstReg_Upd01_DtlOperR> getDtlOperLForDel(
			MCIndexKey hdrIdxKey, MCList<MfgInstReg_Upd01_HdrR> delHdrL) {
		MST_OPER_ORDER_R t2 = MST_OPER_ORDER_R.create("T2");
		MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
		MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
		MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
		oiL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.oper_ord_no);
		oiL_bldr.addSelect(t.oper_cd);
		oiL_bldr.addSelect(t2.oper_schd_qty);
		// 計画外製造指図の場合、工程オーダは存在しないため、OUTER JOINしている
		oiL_bldr.addLeftOuterJoin(t2, bracket( t.oper_ord_no.eq(t2.oper_ord_no)));
		oiL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
		dbSelect("MSBCL6120_MST_OPER_INST_S01", oiL, oiL_bldr, delHdrL);
		
		for (MST_OPER_INST_R oiR : oiL) {
			MfgInstReg_Upd01_HdrR hdrR = delHdrL.getFirst(hdrIdxKey, oiR.mfg_inst_no());
			oiR.setNumberNE("hdr_peg_no", hdrR.peg_no());
			oiR.setNumberNE("not_oper_schd_qty", hdrR.base_unit_not_inst_qty());
		}
		
		MCList<MfgInstReg_Upd01_DtlOperR> ret = MCList.create(MfgInstReg_Upd01_DtlOperR.class);
		addAll(ret, oiL, createMap_MfgInstReg_Upd01_DtlOperR_MST_OPER_INST_R_DEL());
		setPegNo(ret);
		
		return ret;
	}
	
	// 工程（削除用）
	protected Map_MfgInstReg_Upd01_DtlOperR_MST_OPER_INST_R_DEL<MfgInstReg_Upd01_DtlOperR,MST_OPER_INST_R> createMap_MfgInstReg_Upd01_DtlOperR_MST_OPER_INST_R_DEL() {
		return new Map_MfgInstReg_Upd01_DtlOperR_MST_OPER_INST_R_DEL<MfgInstReg_Upd01_DtlOperR, MST_OPER_INST_R>();
	}

	public class Map_MfgInstReg_Upd01_DtlOperR_MST_OPER_INST_R_DEL<D extends MfgInstReg_Upd01_DtlOperR, S extends MST_OPER_INST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_ord_no, MST_OPER_INST_R.$oper_ord_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_no, MST_OPER_INST_R.$oper_inst_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_cd, MST_OPER_INST_R.$oper_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.hdr_peg_no(src.getNumber("hdr_peg_no"));
			dest.not_oper_schd_qty(src.getNumber("not_oper_schd_qty"));
		}
	}

	protected MCList<MfgInstReg_Upd01_DtlInptR> setDtlInptLForDel(
			MCIndexKey hdrIdxKey, MCList<MfgInstReg_Upd01_HdrR> delHdrL,
			MCIndexKey operIdxKey, MCList<MfgInstReg_Upd01_DtlOperR> delDtlOperL) {
		MSVT_INPT_SCHD_PR_R t2 = MSVT_INPT_SCHD_PR_R.create("T2");
		MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
		MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
		MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
		isL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.ver_no, t.inpt_schd_no);
		isL_bldr.addSelect(t2.mfg_sts_typ);
		isL_bldr.addInnerJoin(t2, bracket( t.inpt_schd_no.eq(t2.inpt_schd_no)));
		isL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
		isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBCL6120_MST_INPT_SCHD_S02", isL, isL_bldr, delHdrL);
		
		for (MST_INPT_SCHD_R isR : isL) {
			isR.setNumberNE("hdr_peg_no",
					delHdrL.getFirst(hdrIdxKey, isR.mfg_inst_no()).peg_no());
			isR.setNumberNE("oper_peg_no",
					delDtlOperL.getFirst(operIdxKey, isR.oper_inst_no()).peg_no());
		}
		
		MCList<MfgInstReg_Upd01_DtlInptR> ret = MCList.create(MfgInstReg_Upd01_DtlInptR.class);
		addAll(ret, isL, createMap_MfgInstReg_Upd01_DtlInptR_MST_INPT_SCHD_R_DEL());
		setPegNo(ret);
		
		setXfrInstErrFlg(ret);
		
		return ret;
	}
	
	// 投入（削除用）
	protected Map_MfgInstReg_Upd01_DtlInptR_MST_INPT_SCHD_R_DEL<MfgInstReg_Upd01_DtlInptR,MST_INPT_SCHD_R> createMap_MfgInstReg_Upd01_DtlInptR_MST_INPT_SCHD_R_DEL() {
		return new Map_MfgInstReg_Upd01_DtlInptR_MST_INPT_SCHD_R_DEL<MfgInstReg_Upd01_DtlInptR, MST_INPT_SCHD_R>();
	}

	public class Map_MfgInstReg_Upd01_DtlInptR_MST_INPT_SCHD_R_DEL<D extends MfgInstReg_Upd01_DtlInptR, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_cd, MST_INPT_SCHD_R.$itm_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub1, MST_INPT_SCHD_R.$itm_sub1);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub2, MST_INPT_SCHD_R.$itm_sub2);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub3, MST_INPT_SCHD_R.$itm_sub3);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$ver_no, MST_INPT_SCHD_R.$ver_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.hdr_peg_no(src.getNumber("hdr_peg_no"));
			dest.oper_peg_no(src.getNumber("oper_peg_no"));
			dest.old_mfg_sts_typ(src.getString("mfg_sts_typ"));
		}
	}
	
	protected MCList<MfgInstReg_Upd01_DtlYieldR> setDtlYieldLForDel(
			MCIndexKey hdrIdxKey, MCList<MfgInstReg_Upd01_HdrR> delHdrL,
			MCIndexKey operIdxKey, MCList<MfgInstReg_Upd01_DtlOperR> delDtlOperL) {
		MSVT_YIELD_SCHD_PR_R t2 = MSVT_YIELD_SCHD_PR_R.create("T2");
		MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
		MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
		MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
		ysL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.yield_schd_no);
		ysL_bldr.addSelect(t2.mfg_sts_typ);
		ysL_bldr.addInnerJoin(t2, bracket( t.yield_schd_no.eq(t2.yield_schd_no)));
		ysL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
		ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBCL6120_MST_YIELD_SCHD_S01", ysL, ysL_bldr, delHdrL);
		
		for (MST_YIELD_SCHD_R ysR : ysL) {
			ysR.setNumberNE("hdr_peg_no",
					delHdrL.getFirst(hdrIdxKey, ysR.mfg_inst_no()).peg_no());
			ysR.setNumberNE("oper_peg_no",
					delDtlOperL.getFirst(operIdxKey, ysR.oper_inst_no()).peg_no());
		}
		
		MCList<MfgInstReg_Upd01_DtlYieldR> ret = MCList.create(MfgInstReg_Upd01_DtlYieldR.class);
		addAll(ret, ysL, createMap_MfgInstReg_Upd01_DtlYieldR_MST_YIELD_SCHD_R_DEL());
		setPegNo(ret);
		
		return ret;
	}
	
	// 出来高（削除用）
	protected Map_MfgInstReg_Upd01_DtlYieldR_MST_YIELD_SCHD_R_DEL<MfgInstReg_Upd01_DtlYieldR,MST_YIELD_SCHD_R> createMap_MfgInstReg_Upd01_DtlYieldR_MST_YIELD_SCHD_R_DEL() {
		return new Map_MfgInstReg_Upd01_DtlYieldR_MST_YIELD_SCHD_R_DEL<MfgInstReg_Upd01_DtlYieldR, MST_YIELD_SCHD_R>();
	}

	public class Map_MfgInstReg_Upd01_DtlYieldR_MST_YIELD_SCHD_R_DEL<D extends MfgInstReg_Upd01_DtlYieldR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.hdr_peg_no(src.getNumber("hdr_peg_no"));
			dest.oper_peg_no(src.getNumber("oper_peg_no"));
			dest.old_mfg_sts_typ(src.getString("mfg_sts_typ"));
		}
	}
	
	/**
	 * 製造指図登録サービスの新規登録処理
	 */
	protected MCList<MfgInstReg_Upd01_HdrR> callMfgInstCrtService(
			MCList<MfgInstReg_Upd01_HdrR> crtHdrL, MCIndexKey hdrIdxKey, boolean reArrFlg) {
		MSBCL_MfgInstRegService.MfgInstReg_Upd01 updOpe = MSBCL_MfgInstRegService
				.crtMfgInstReg_Upd01();

		// 品目オーダ取得
		MCList<MST_ITM_ORDER_R> ioL = srchItmOrd(crtHdrL);

		// マスタ取得
		doMasterCache(ioL);

		MCIndexKey ioIdxkey = ioL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
		for (MfgInstReg_Upd01_HdrR crtHdrR : crtHdrL) {
			MST_ITM_ORDER_R ioR = ioL.getFirst(ioIdxkey, crtHdrR.itm_ord_no());
			setCrtHdrByDB(crtHdrR, ioR, reArrFlg);
		}

		// 予定日計算
		setSchdDt(crtHdrL, ioL, ioIdxkey, reArrFlg);

		//　構成展開
		MSBCL_ReExpService.ReExp_Sprt05 expOpe = MSBCL_ReExpService.crtReExp_Sprt05();
		expBom(crtHdrL, expOpe);

		updOpe.up0().setAll(crtHdrL);
		addAll(updOpe.up1(), expOpe.down0(),
				createMap_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR());
		copyHdrValueToOper(crtHdrL, hdrIdxKey, updOpe.up1());

		addAll(updOpe.up2(), expOpe.down2(),
				createMap_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR());
		setPegNo(updOpe.up2());
		copyHdrValueToInpt(crtHdrL, hdrIdxKey, updOpe.up2());

		addAll(updOpe.up4(), expOpe.down1(),
				createMap_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
		setPegNo(updOpe.up4());
		copyHdrValueToYield(crtHdrL, hdrIdxKey, updOpe.up4());

		setMesFlg(updOpe.up0(), updOpe.up1());
		updOpe.exec();

		return updOpe.down0();
	}
	
	protected void setMesFlg(MCList<MfgInstReg_Upd01_HdrR> hdrL, MCList<MfgInstReg_Upd01_DtlOperR> operL) {
		for (MfgInstReg_Upd01_HdrR hdrR : hdrL) {
			MCList<MfgInstReg_Upd01_DtlOperR> subOperL = operL
					.subList(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, hdrR.peg_no());
			if (subOperL.isEmpty()) {
				continue;
			}
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil
					.crtSCMLinkUtil_Srch02();
			for (MfgInstReg_Upd01_DtlOperR rstR : subOperL) {
				SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
				cndR.peg_no(rstR.peg_no());
				cndR.loc_cd(hdrR.mfg_loc_cd());
				cndR.itm_cd(hdrR.itm_cd());
				cndR.itm_sub1(hdrR.itm_sub1());
				cndR.itm_sub2(hdrR.itm_sub2());
				cndR.itm_sub3(hdrR.itm_sub3());
				cndR.oper_cd(rstR.oper_cd());
				cndR.master_dt(getToday());

				ope.up0().add(cndR);
			}

			ope.exec();

			String[] destCols = new String[] {
					MfgInstReg_Upd01_DtlOperR.$mes_flg
			};
			String[] srcCols = new String[] {
					SCMLinkUtil_Srch02_CndR.$mes_flg
			};
			copyByPegNo(subOperL, destCols, ope.down0(), srcCols);
		}
	}
	protected MCList<MST_ITM_ORDER_R> srchItmOrd(MCList<MfgInstReg_Upd01_HdrR> crtHdrL) {
		MCList<MST_ITM_ORDER_R> ioL = MCList.create(MST_ITM_ORDER_R.class);
		MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
		MCQueryApiBuilder ioL_bldr = MCQueryApiBuilder.create(t);
		ioL_bldr.setSelect(t.itm_ord_no, t.master_dt, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.mfg_loc_cd, t.strg_loc_cd, t.sppl_cd, t.maker_cd, t.rqst_loc_cd, t.wg_cd, t.bom_ptn, t.oper_ptn, t.inst_qty, t.mfg_st_schd_dt, t.mfg_end_schd_dt, t.inst_po_cnt_rmrks, t.io_schd_pr_no);
		
		crtHdrL.sort(MfgInstReg_Upd01_HdrR.$itm_ord_no);
		dbSelectKeyForUpdate("MSBCL6120_MST_ITM_ORDER_S02", ioL, ioL_bldr, crtHdrL);
		return ioL;
	}
	
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
	protected FXUCL_MCDbcCacheStEnd<MAVM_ITM_DTL_MFG_R> _itmDtlCache;
	

	protected void doMasterCache(MCList<MST_ITM_ORDER_R> ioL) {
		// 品目マスタ
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
		itmL_bldr.setSelect(t.lot_mng_typ, t.lot_no_typ, t.lot_no_ptn_cd, t.sublot_mng_typ, t.sublot_no_typ, t.sublot_no_ptn_cd, t.unit_cd);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, ioL,
				MST_ITM_ORDER_R.$itm_cd, MST_ITM_ORDER_R.$itm_sub1,
				MST_ITM_ORDER_R.$itm_sub2, MST_ITM_ORDER_R.$itm_sub3);
		
		// 品目詳細マスタ
		MAVM_ITM_DTL_MFG_R t1 = MAVM_ITM_DTL_MFG_R.create("T1");
		MCQueryApiBuilder itmDtl_bldr = MCQueryApiBuilder.create(t1);
		itmDtl_bldr.setSelect(t1.lot_issue_typ, t1.no_mfg_aprv_flg, t1.itm_lower_yield, t1.itm_std_yield, t1.itm_upper_yield);
		_itmDtlCache = new FXUCL_MCDbcCacheStEnd<MAVM_ITM_DTL_MFG_R>(itmDtl_bldr, ioL,
				MST_ITM_ORDER_R.$itm_cd, MST_ITM_ORDER_R.$itm_sub1,
				MST_ITM_ORDER_R.$itm_sub2, MST_ITM_ORDER_R.$itm_sub3,
				MST_ITM_ORDER_R.$mfg_loc_cd, MST_ITM_ORDER_R.$sppl_cd,
				MST_ITM_ORDER_R.$maker_cd, MST_ITM_ORDER_R.$rqst_loc_cd,
				MST_ITM_ORDER_R.$wg_cd, MST_ITM_ORDER_R.$bom_ptn);

	}
	
	/**
	 * DBから取得した値を新規登録のヘッダコンテナに設定する
	 * @param dest
	 * @param ioR
	 */
	protected void setCrtHdrByDB(MfgInstReg_Upd01_HdrR dest, MST_ITM_ORDER_R ioR, boolean reArrFlg) {
		dest.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		dest.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		dest.mfg_mtd_typ(MSC_MFG_MTD_TYP.EXTNL.value());
		dest.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
		dest.itm_cd(ioR.itm_cd());
		dest.itm_sub1(ioR.itm_sub1());
		dest.itm_sub2(ioR.itm_sub2());
		dest.itm_sub3(ioR.itm_sub3());
		if (!reArrFlg && !dest.getBooleanNE("complFroInst")) {
			// 再入荷の場合は、発注前の製造指図時にを変更している可能性があるため、
			// 事前に元の製造指図ＮＯから取得した値を設定する。そのため、ここでは設定しない
			dest.mfg_loc_cd(ioR.mfg_loc_cd());
			dest.strg_loc_cd(ioR.strg_loc_cd());
			dest.bom_ptn(ioR.bom_ptn());
			dest.master_dt(ioR.master_dt());
			dest.mfg_str_ln_cd(MAC_STR.NULL_VAL.value());
			dest.strg_str_ln_cd(MAC_STR.NULL_VAL.value());
		}
		dest.oper_ptn(ioR.oper_ptn());
		dest.io_schd_pr_no(ioR.io_schd_pr_no());
		
		MAM_ITM_R itmR = _itmCache.getEx(ioR.itm_cd(), ioR.itm_sub1(), ioR.itm_sub2(), ioR.itm_sub3());
		dest.lot_mng_typ(itmR.lot_mng_typ());
		dest.lot_no_typ(itmR.lot_no_typ());
		dest.lot_no_ptn_cd(itmR.lot_no_ptn_cd());
		dest.sublot_mng_typ(itmR.sublot_mng_typ());
		dest.sublot_no_typ(itmR.sublot_no_typ());
		dest.sublot_no_ptn_cd(itmR.sublot_no_ptn_cd());
		dest.base_unit_cd(itmR.unit_cd());

		MAVM_ITM_DTL_MFG_R itmDtlR = _itmDtlCache.getEx(ioR.master_dt(), ioR.itm_cd(), ioR.itm_sub1(),
				ioR.itm_sub2(), ioR.itm_sub3(),	ioR.mfg_loc_cd(), ioR.sppl_cd(),
				ioR.maker_cd(), ioR.rqst_loc_cd(),
				ioR.wg_cd(), ioR.bom_ptn());
		dest.lot_issue_typ(itmDtlR.lot_issue_typ());
		dest.mfg_sts_typ(getMfgStsTyp(dest.lot_issue_typ(), dest.lot_no()));
		if (MSC_MFG_STS_TYP.isSAV(dest.mfg_sts_typ())) {
			dest.inst_dt(null);
		}
		dest.no_mfg_aprv_flg(itmDtlR.no_mfg_aprv_flg());
		dest.itm_lower_yield(itmDtlR.itm_lower_yield());
		dest.itm_std_yield(itmDtlR.itm_std_yield());
		dest.itm_upper_yield(itmDtlR.itm_upper_yield());
		
		MAM_LOC_R locR = _locCache.getEx(dest.mfg_loc_cd());
		dest.sppl_cd(locR.sppl_cd());
		dest.maker_cd(locR.maker_cd());
		dest.mfg_loc_wg_cd(locR.wg_cd());
		dest.mfg_loc_site_cd(locR.site_cd());

		dest.base_unit_ord_qty(ioR.inst_qty());
		dest.inst_po_cnt_rmrks(ioR.inst_po_cnt_rmrks());
	}
	
	/**
	 * 予定日計算サービスを実行し、着手・終了予定日を設定する
	 * @param crtHdrL
	 */
	protected void setSchdDt(MCList<MfgInstReg_Upd01_HdrR> crtHdrL,
			MCList<MST_ITM_ORDER_R> ioL, MCIndexKey ioIdxkey, boolean reArrFlg) {
		MSBCL_OrdRegService.Ord_Sprt03 o = MSBCL_OrdRegService.crtOrd_Sprt03();
		addAll(o.up0(), crtHdrL, createMap_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR());
		o.exec();
		copyByPegNo(crtHdrL, new String[] {
				MfgInstReg_Upd01_HdrR.$st_schd_tm, MfgInstReg_Upd01_HdrR.$end_schd_tm
		}, o.down0(), new String[] {
				Ord_Sprt03_RsltR.$mfg_st_schd_dt, Ord_Sprt03_RsltR.$mfg_end_schd_dt
		});
		
		for (MfgInstReg_Upd01_HdrR crtHdrR : crtHdrL) {
			MST_ITM_ORDER_R ioR = ioL.getFirst(ioIdxkey, crtHdrR.itm_ord_no());
			if (isSchdChg(crtHdrR, ioR, reArrFlg)) {
				crtHdrR.schd_chg_flg(true);
			}
		}
	}
	
	protected boolean isSchdChg(MfgInstReg_Upd01_HdrR r, MST_ITM_ORDER_R ioR, boolean reArrFlg) {
		if (reArrFlg) {
			// 再入荷の場合は、計画通りに行かなかったということなので、必ずtrue
			return true;
		}
		// 数量、着手予定日、終了予定日が異なれば計画変更とみなす（製造指図登録サービスにも同様の処理があるため、仕様変更時に注意）
		if (!isSame(r.base_unit_inst_qty(), ioR.inst_qty())) {
			return true;
		}
		if (!isSame(r.st_schd_tm().startTimeOfDay(), ioR.mfg_st_schd_dt()
				.startTimeOfDay())) {
			return true;
		}
		if (!isSame(r.end_schd_tm().startTimeOfDay(), ioR.mfg_end_schd_dt()
				.startTimeOfDay())) {
			return true;
		}
		return false;
	}
	
	protected Map_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR<Ord_Sprt03_DtlR, MfgInstReg_Upd01_HdrR> createMap_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR() {
		return new Map_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR<Ord_Sprt03_DtlR, MfgInstReg_Upd01_HdrR>();
	}

	public class Map_Ord_Sprt03_DtlR_MfgInstReg_Upd01_HdrR<D extends Ord_Sprt03_DtlR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, MfgInstReg_Upd01_HdrR.$rqst_dlv_rqst_tm);
			addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, MfgInstReg_Upd01_HdrR.$master_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, MfgInstReg_Upd01_HdrR.$bom_ptn);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, MfgInstReg_Upd01_HdrR.$strg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, MfgInstReg_Upd01_HdrR.$base_unit_inst_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
			dest.sppl_cd(MAC_STR.NULL_VAL.value());
			dest.maker_cd(MAC_STR.NULL_VAL.value());
			dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
		}
	}
	
	FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
	protected void expBom(MCList<MfgInstReg_Upd01_HdrR> crtHdrL, MSBCL_ReExpService.ReExp_Sprt05 expOpe) {
		// 取引先マスタをキャッシュ
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
		bpL_bldr.setSelect(t.cur_cd);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, crtHdrL,
				MfgInstReg_Upd01_HdrR.$sppl_cd);
		
		addAll(expOpe.up0(), crtHdrL, createMap_ReExp_Sprt05_HdrR_MfgInstReg_Upd01_HdrR());
		expOpe.exec();
	}
	
	protected Map_ReExp_Sprt05_HdrR_MfgInstReg_Upd01_HdrR<ReExp_Sprt05_HdrR,MfgInstReg_Upd01_HdrR> createMap_ReExp_Sprt05_HdrR_MfgInstReg_Upd01_HdrR() {
		return new Map_ReExp_Sprt05_HdrR_MfgInstReg_Upd01_HdrR<ReExp_Sprt05_HdrR, MfgInstReg_Upd01_HdrR>();
	}

	public class Map_ReExp_Sprt05_HdrR_MfgInstReg_Upd01_HdrR<D extends ReExp_Sprt05_HdrR, S extends MfgInstReg_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ReExp_Sprt05_HdrR.$peg_no, MfgInstReg_Upd01_HdrR.$peg_no);
			addColumnPathMap(ReExp_Sprt05_HdrR.$wg_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_wg_cd);
			addColumnPathMap(ReExp_Sprt05_HdrR.$itm_cd, MfgInstReg_Upd01_HdrR.$itm_cd);
			addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub1, MfgInstReg_Upd01_HdrR.$itm_sub1);
			addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub2, MfgInstReg_Upd01_HdrR.$itm_sub2);
			addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub3, MfgInstReg_Upd01_HdrR.$itm_sub3);
			addColumnPathMap(ReExp_Sprt05_HdrR.$oper_ptn, MfgInstReg_Upd01_HdrR.$oper_ptn);
			addColumnPathMap(ReExp_Sprt05_HdrR.$bom_ptn, MfgInstReg_Upd01_HdrR.$bom_ptn);
			addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_inst_qty, MfgInstReg_Upd01_HdrR.$base_unit_inst_qty);
			addColumnPathMap(ReExp_Sprt05_HdrR.$yield_schd_qty, MfgInstReg_Upd01_HdrR.$base_unit_yield_qty);
			addColumnPathMap(ReExp_Sprt05_HdrR.$strg_loc_cd, MfgInstReg_Upd01_HdrR.$strg_loc_cd);
			addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_loc_cd, MfgInstReg_Upd01_HdrR.$mfg_loc_cd);
			addColumnPathMap(ReExp_Sprt05_HdrR.$sno1, MfgInstReg_Upd01_HdrR.$sno1);
			addColumnPathMap(ReExp_Sprt05_HdrR.$sno2, MfgInstReg_Upd01_HdrR.$sno2);
			addColumnPathMap(ReExp_Sprt05_HdrR.$sno3, MfgInstReg_Upd01_HdrR.$sno3);
			addColumnPathMap(ReExp_Sprt05_HdrR.$sno4, MfgInstReg_Upd01_HdrR.$sno4);
			addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_st_schd_dt, MfgInstReg_Upd01_HdrR.$st_schd_tm);
			addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_end_schd_dt, MfgInstReg_Upd01_HdrR.$end_schd_tm);
			addColumnPathMap(ReExp_Sprt05_HdrR.$itm_ord_no, MfgInstReg_Upd01_HdrR.$itm_ord_no);
			addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_inst_no, MfgInstReg_Upd01_HdrR.$mfg_inst_no);
			addColumnPathMap(ReExp_Sprt05_HdrR.$master_dt, MfgInstReg_Upd01_HdrR.$master_dt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
			dest.not_wk_exp_flg(true);
			dest.cur_cd(_bpCache.getEx(src.sppl_cd()).cur_cd());
			dest.mfg_str_ln_cd(MAC_STR.NULL_VAL.value());
			dest.strg_str_ln_cd(MAC_STR.NULL_VAL.value());
		}
	}
	
	protected Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Upd01_DtlOperR,ReExp_Sprt05_RsltOperR> createMap_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR() {
		return new Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Upd01_DtlOperR, ReExp_Sprt05_RsltOperR>();
	}

	public class Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<D extends MfgInstReg_Upd01_DtlOperR, S extends ReExp_Sprt05_RsltOperR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, ReExp_Sprt05_RsltOperR.$hdr_peg_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$peg_no, ReExp_Sprt05_RsltOperR.$peg_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_cd, ReExp_Sprt05_RsltOperR.$oper_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_seq, ReExp_Sprt05_RsltOperR.$oper_seq);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$st_schd_tm, ReExp_Sprt05_RsltOperR.$st_schd_tm);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$end_schd_tm, ReExp_Sprt05_RsltOperR.$end_schd_tm);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$base_unit_qty, ReExp_Sprt05_RsltOperR.$base_unit_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$base_unit_cd, ReExp_Sprt05_RsltOperR.$base_unit_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_std_qty, ReExp_Sprt05_RsltOperR.$oper_std_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_conv_qty, ReExp_Sprt05_RsltOperR.$oper_conv_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_unit_conv_rnd_typ, ReExp_Sprt05_RsltOperR.$unit_conv_rnd_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_unit_dec_place, ReExp_Sprt05_RsltOperR.$dec_place);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_unit_cd, ReExp_Sprt05_RsltOperR.$oper_unit_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_loc_cd, ReExp_Sprt05_RsltOperR.$oper_loc_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_str_ln_cd, ReExp_Sprt05_RsltOperR.$oper_str_ln_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$disp_seq, ReExp_Sprt05_RsltOperR.$disp_seq);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$bkf_flg, ReExp_Sprt05_RsltOperR.$bkf_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$wk_cost_calc_flg, ReExp_Sprt05_RsltOperR.$wk_cost_calc_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_grp, ReExp_Sprt05_RsltOperR.$oper_inst_grp);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lt, ReExp_Sprt05_RsltOperR.$oper_lt);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lt_add_qty, ReExp_Sprt05_RsltOperR.$oper_lt_add_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst_typ, ReExp_Sprt05_RsltOperR.$oper_offst_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst, ReExp_Sprt05_RsltOperR.$oper_offst);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst_add_qty, ReExp_Sprt05_RsltOperR.$oper_offst_add_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lower_yield, ReExp_Sprt05_RsltOperR.$oper_lower_yield);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_std_yield, ReExp_Sprt05_RsltOperR.$oper_std_yield);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_upper_yield, ReExp_Sprt05_RsltOperR.$oper_upper_yield);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$wip_rate, ReExp_Sprt05_RsltOperR.$wip_rate);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_ord_no, ReExp_Sprt05_RsltOperR.$oper_ord_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$yield_oper_flg, ReExp_Sprt05_RsltOperR.$yield_oper_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$yield_oper_ratio, ReExp_Sprt05_RsltOperR.$yield_oper_ratio);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.tgt_oper_flg(true);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			// 外注は常にデフォルト工程のため、false
			dest.lmt_fr_dt_flg(false);
		}
	}
	
	protected Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Upd01_DtlYieldR,ReExp_Sprt03_RsltYieldR> createMap_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR() {
		return new Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Upd01_DtlYieldR, ReExp_Sprt03_RsltYieldR>();
	}
	
	protected Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Upd01_DtlInptR, ReExp_Sprt01_RsltInptR> createMap_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR() {
		return new Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Upd01_DtlInptR, ReExp_Sprt01_RsltInptR>();
	}

	public class Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<D extends MfgInstReg_Upd01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$hdr_peg_no, ReExp_Sprt01_RsltInptR.$hdr_peg_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$oper_peg_no, ReExp_Sprt01_RsltInptR.$oper_peg_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_mng_typ, ReExp_Sprt01_RsltInptR.$lot_mng_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_mng_typ, ReExp_Sprt01_RsltInptR.$sublot_mng_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_alt_qty, ReExp_Sprt01_RsltInptR.$alt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_inpt_qty, ReExp_Sprt01_RsltInptR.$inpt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_rqmt_qty, ReExp_Sprt01_RsltInptR.$rqmt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fctr_flg, ReExp_Sprt01_RsltInptR.$cont_fctr_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fctr_unit_cd, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$std_cont_fctr, ReExp_Sprt01_RsltInptR.$std_cont_fctr);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$schd_tm, ReExp_Sprt01_RsltInptR.$inpt_schd_dt);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_id_no, ReExp_Sprt01_RsltInptR.$bom_id);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_itm_seq, ReExp_Sprt01_RsltInptR.$itm_seq);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alloc_ctl_typ, ReExp_Sprt01_RsltInptR.$alloc_ctl_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$stk_mng_typ, ReExp_Sprt01_RsltInptR.$stk_mng_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
			addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			// ここでは指図済みを渡す（引当対象の子品目が存在する場合は、更新処理内で指図保存に塗り替えられる）
			dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
			// 本処理では引当しないため、引当FLGはfalse,ロット指定無しFLGもfalse（投入引当バッチや製造指図登録画面で別途引当する）
			dest.alloc_flg(false);
			dest.no_lot_fix_flg(false);
			// 投入棚・ラインをNULL文字で補完（製造場所≠投入場所かつ投入場所が棚・ライン対象外の場合はNULLになっているため、補完が必要）
			if (isNull(dest.inpt_str_ln_cd())) {
				dest.inpt_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}
	}

	public class Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<D extends MfgInstReg_Upd01_DtlYieldR, S extends ReExp_Sprt03_RsltYieldR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no, ReExp_Sprt03_RsltYieldR.$hdr_peg_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$oper_peg_no, ReExp_Sprt03_RsltYieldR.$oper_peg_no);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_cd, ReExp_Sprt03_RsltYieldR.$itm_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub1, ReExp_Sprt03_RsltYieldR.$itm_sub1);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub2, ReExp_Sprt03_RsltYieldR.$itm_sub2);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub3, ReExp_Sprt03_RsltYieldR.$itm_sub3);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$trd_unit_cd, ReExp_Sprt03_RsltYieldR.$trd_unit_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$trd_unit_yield_qty, ReExp_Sprt03_RsltYieldR.$trd_unit_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$base_unit_cd, ReExp_Sprt03_RsltYieldR.$base_unit_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$base_unit_yield_qty, ReExp_Sprt03_RsltYieldR.$base_unit_qty);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$schd_tm, ReExp_Sprt03_RsltYieldR.$yield_schd_dt);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_loc_cd, ReExp_Sprt03_RsltYieldR.$strg_loc_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_str_ln_cd, ReExp_Sprt03_RsltYieldR.$strg_str_ln_cd);
			addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$disp_seq, ReExp_Sprt03_RsltYieldR.$disp_seq);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}
	}
	
	protected void copyHdrValueToInpt(MCList<MfgInstReg_Upd01_HdrR> crtHdrL,
			MCIndexKey hdrIdxKey, MCList<MfgInstReg_Upd01_DtlInptR> inptL) {
		for (MfgInstReg_Upd01_DtlInptR r : inptL) {
			MfgInstReg_Upd01_HdrR crtHdrR = crtHdrL.getFirst(hdrIdxKey, r.hdr_peg_no());
			r.mfg_sts_typ(crtHdrR.mfg_sts_typ());
		}
	}
	
	protected void copyHdrValueToOper(MCList<MfgInstReg_Upd01_HdrR> crtHdrL,
			MCIndexKey hdrIdxKey, MCList<MfgInstReg_Upd01_DtlOperR> operL) {
		for (MfgInstReg_Upd01_DtlOperR r : operL) {
			MfgInstReg_Upd01_HdrR crtHdrR = crtHdrL.getFirst(hdrIdxKey, r.hdr_peg_no());
			r.hdr_mfg_sts_typ(crtHdrR.mfg_sts_typ());
			r.mfg_sts_typ(r.hdr_mfg_sts_typ());
			r.not_oper_schd_qty(crtHdrR.base_unit_not_inst_qty());
		}
	}
	
	protected void copyHdrValueToYield(MCList<MfgInstReg_Upd01_HdrR> crtHdrL,
			MCIndexKey hdrIdxKey, MCList<MfgInstReg_Upd01_DtlYieldR> yieldL) {
		for (MfgInstReg_Upd01_DtlYieldR r : yieldL) {
			MfgInstReg_Upd01_HdrR crtHdrR = crtHdrL.getFirst(hdrIdxKey, r.hdr_peg_no());
			r.sno1(crtHdrR.sno1());
			r.sno2(crtHdrR.sno2());
			r.sno3(crtHdrR.sno3());
			r.sno4(crtHdrR.sno4());
			r.mfg_loc_cd(crtHdrR.mfg_loc_cd());
			r.mfg_sts_typ(crtHdrR.mfg_sts_typ());
		}
	}
	
	// Upd01,Upd02,Upd03共通処理
	protected void setXfrInstErrFlg(MCList<MfgInstReg_Upd01_DtlInptR> inptL) {
		MCList<MST_XFR_SCHD_R> dbXfrRqstL = getXfrRqstL(inptL);
		MCIndexKey xfrIdxKey = dbXfrRqstL.createIndex(MST_XFR_SCHD_R.$inpt_schd_no);
		MCList<XfrSchdChk04_DtlR> xfrSchdSrvDelEnable = MCList.create(XfrSchdChk04_DtlR.class);
		for (MfgInstReg_Upd01_DtlInptR upR : inptL) {
			// 投入予定に紐付く移送依頼が存在する場合は、チェックサービスを呼び出す
			for (MST_XFR_SCHD_R xfrR : dbXfrRqstL.subList(xfrIdxKey, upR.inpt_schd_no())) {
				XfrSchdChk04_DtlR srvR = XfrSchdChk04_DtlR.create(); 
				copy(srvR, upR, createMap_XfrSchdChk04_DtlR_MfgInstReg_Upd01_DtlInptR());
				srvR.xfr_schd_no(xfrR.xfr_schd_no());
				xfrSchdSrvDelEnable.add(srvR);
			}
		}
		
		if (!xfrSchdSrvDelEnable.isEmpty()) {
			MSBEL_XfrSchdService.XfrSchd_Chk04 xfrChk = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			xfrChk.up0().addAll(xfrSchdSrvDelEnable);
			
			MCMessageList bfrMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
			MCMessagePool.clear();
			xfrChk.exec();
			MCMessagePool.clear();
			// チェックサービス呼び出し前のメッセージを元に戻す
			MCMessagePool.addAll(bfrMsgL);
			
			MCIndexKey xfrChkIdxkey = xfrChk.down0().createIndex(
					XfrSchdChk04_DtlR.$peg_no, XfrSchdChk04_DtlR.$err_flg);
			
			if (!xfrSchdSrvDelEnable.isEmpty()) {
				for (MfgInstReg_Upd01_DtlInptR upR : inptL) {
					if (!isNull(xfrChk.down0().getFirst(xfrChkIdxkey, upR.peg_no(), true))) {
						upR.xfr_inst_err_flg(true);
					}
				}
			}
		}
	}
	
	// 移動・移送予定サービスのチェック処理
	protected Map_XfrSchdChk04_DtlR_MfgInstReg_Upd01_DtlInptR<XfrSchdChk04_DtlR,MfgInstReg_Upd01_DtlInptR> createMap_XfrSchdChk04_DtlR_MfgInstReg_Upd01_DtlInptR() {
		return new Map_XfrSchdChk04_DtlR_MfgInstReg_Upd01_DtlInptR<XfrSchdChk04_DtlR, MfgInstReg_Upd01_DtlInptR>();
	}

	public class Map_XfrSchdChk04_DtlR_MfgInstReg_Upd01_DtlInptR<D extends XfrSchdChk04_DtlR, S extends MfgInstReg_Upd01_DtlInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, MfgInstReg_Upd01_DtlInptR.$peg_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}
	}
	
	protected MCList<MST_XFR_SCHD_R> getXfrRqstL(MCList<MfgInstReg_Upd01_DtlInptR> xfrChkL) {
		MCList<MST_XFR_SCHD_R> dbXfrL = MCList.create(MST_XFR_SCHD_R.class);
		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder dbXfrL_bldr = MCQueryApiBuilder.create(t);
		dbXfrL_bldr.setSelect(t.inpt_schd_no, t.xfr_schd_no);
		dbXfrL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
		dbXfrL_bldr.setOrderByAsc(dbXfrL_bldr.getBaseDbc().getKeyColumn$());
		if (!xfrChkL.isEmpty()) {
			dbSelectForUpdate("MSBCL6120_MST_XFR_SCHD_S01", dbXfrL, dbXfrL_bldr, xfrChkL);
		}
		return dbXfrL;
	}
	
	/**
	 * OutSrcInst_Upd02オペレーション.<p>
	 *
	 * 入荷・仕入実績登録における再入荷予定作成の登録・訂正・取消に伴い、外注製造指図を登録・訂正・取消する<br>
	 */
	public class OutSrcInst_Upd02 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doLocCache();
			
			MCList<MfgInstReg_Upd01_HdrR> delHdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			MCList<MfgInstReg_Upd01_HdrR> crtHdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			MCList<OutSrcInst_Chk02_ReArrR> crtUpL = MCList.create(OutSrcInst_Chk02_ReArrR.class);
			for (OutSrcInst_Chk02_ReArrR upR : up0()) {
				MfgInstReg_Upd01_HdrR cacheR = getCacheForUpd02(upR.re_arr_mfg_inst_no());
				
				if (isExecMfgInstSrvDel(upR, cacheR)) {
					// 製造指図の取消を行う場合、取消用のヘッダコンテナを作成
					MfgInstReg_Upd01_HdrR delHdrR = MfgInstReg_Upd01_HdrR.create();
					delHdrR.setAttributes(upR);
					copy(delHdrR, upR, createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_DEL());
					setDelHdrCmn(delHdrR, cacheR);
					delHdrR.itm_ord_no(cacheR.itm_ord_no());
					// 未指図数量は更新前の値を設定（再入荷予定を取り消したからと言って未指図数量は増えないので）
					delHdrR.base_unit_not_inst_qty(cacheR.base_unit_not_inst_qty());
					delHdrL.add(delHdrR);
					
					if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
						// 訂正の場合は、製造指図を登録する（ロットＮＯ、サブロットＮＯは元の値を引き継ぐ）
						// ※品目オーダなどから取得する項目のマッピングは後の処理で行う
						MfgInstReg_Upd01_HdrR crtHdrR = MfgInstReg_Upd01_HdrR.create();
						crtHdrR.setAttributes(upR);
						copy(crtHdrR, upR, createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_CRT());
						crtHdrR.lot_no(cacheR.lot_no());
						crtHdrR.sublot_no(cacheR.sublot_no());
						crtHdrL.add(crtHdrR);
						crtUpL.add(upR);
					}
				}
				else {
					// 製造指図の取り消しを行わない場合
					if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
						// 新規に作成する
						// ※品目オーダなどから取得する項目のマッピングは後の処理で行う
						MfgInstReg_Upd01_HdrR crtHdrR = MfgInstReg_Upd01_HdrR.create();
						crtHdrR.setAttributes(upR);
						copy(crtHdrR, upR, createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_CRT());
						crtHdrL.add(crtHdrR);
						crtUpL.add(upR);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
						// 製造指図の更新は行わない（下り電文を設定するのみ）
						copyForDownByCache(upR, cacheR);
					}
				}
			}
			
			if (!delHdrL.isEmpty()) {
				callMfgInstDelService(delHdrL);
			}
			
			if (!crtHdrL.isEmpty()) {
				MCIndexKey hdrIdxKey = crtHdrL.createIndex(MfgInstReg_Upd01_HdrR.$peg_no);
				copyFromOrgMfgInst(crtUpL, crtHdrL, hdrIdxKey);
				MCList<MfgInstReg_Upd01_HdrR> srvDown = callMfgInstCrtService(crtHdrL, hdrIdxKey, true);
				copyForDownByCrtSrv(up0(), crtHdrL, hdrIdxKey, srvDown);
			}
			
			setDown();
		}
		
		protected void doLocCache() {
			MCList<MfgInstReg_Upd01_HdrR> cacheL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			for (OutSrcInst_Chk02_ReArrR upR : up0()) {
				cacheL.add(getCacheForUpd02(upR.re_arr_mfg_inst_no()));
			}
			doLocCacheCmn(cacheL);
		}
		
		/**
		 * 製造指図登録サービスの削除を実施するかどうか
		 * @return
		 */
		protected boolean isExecMfgInstSrvDel(OutSrcInst_Chk02_ReArrR upR, MfgInstReg_Upd01_HdrR cacheR) {
			if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
				return true;
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
				if (isChgReArr(upR, cacheR)) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 製造指図が既に存在する場合の下り電文設定処理
		 * @param upR
		 * @param cacheR
		 */
		protected void copyForDownByCache(OutSrcInst_Chk02_ReArrR upR, MfgInstReg_Upd01_HdrR cacheR) {
			upR.re_arr_mfg_inst_no(cacheR.mfg_inst_no());
			upR.lot_no(cacheR.lot_no());
			upR.sublot_no(cacheR.sublot_no());
			upR.pre_outsrc_act_flg(_locCache.getEx(cacheR.mfg_loc_cd()).pre_outsrc_act_flg());
		}
		
		/**
		 * 製造指図を新規登録した場合の下り電文設定処理
		 * @return
		 */
		protected void copyForDownByCrtSrv(MCList<OutSrcInst_Chk02_ReArrR> upL, MCList<MfgInstReg_Upd01_HdrR> crtHdrL,
				MCIndexKey hdrIdxKey,
				MCList<MfgInstReg_Upd01_HdrR> srvDown) {
			
			MCIndexKey upIdxKey = upL.createIndex(OutSrcInst_Chk01_PoDR.$peg_no);
			for (MfgInstReg_Upd01_HdrR srvDownR : srvDown) {
				MfgInstReg_Upd01_HdrR crtHdrR = crtHdrL.getFirst(hdrIdxKey, srvDownR.peg_no());
				OutSrcInst_Chk02_ReArrR upR = up0().getFirst(upIdxKey, srvDownR.peg_no());
				upR.re_arr_mfg_inst_no(srvDownR.mfg_inst_no());
				upR.lot_no(crtHdrR.lot_no());
				upR.sublot_no(crtHdrR.sublot_no());
				upR.pre_outsrc_act_flg(_locCache.getEx(crtHdrR.mfg_loc_cd()).pre_outsrc_act_flg());
			}
		}
		
		// ヘッダ（削除用）
		protected Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_DEL<MfgInstReg_Upd01_HdrR,OutSrcInst_Chk02_ReArrR> createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_DEL() {
			return new Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_DEL<MfgInstReg_Upd01_HdrR, OutSrcInst_Chk02_ReArrR>();
		}

		public class Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_DEL<D extends MfgInstReg_Upd01_HdrR, S extends OutSrcInst_Chk02_ReArrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$peg_no, OutSrcInst_Chk02_ReArrR.$peg_no);
			}
		}
		
		// ヘッダ（新規用）
		protected Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_CRT<MfgInstReg_Upd01_HdrR,OutSrcInst_Chk02_ReArrR> createMap_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_CRT() {
			return new Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_CRT<MfgInstReg_Upd01_HdrR, OutSrcInst_Chk02_ReArrR>();
		}

		public class Map_MfgInstReg_Upd01_HdrR_OutSrcInst_Chk02_ReArrR_CRT<D extends MfgInstReg_Upd01_HdrR, S extends OutSrcInst_Chk02_ReArrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$peg_no, OutSrcInst_Chk02_ReArrR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_inst_qty, OutSrcInst_Chk02_ReArrR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_yield_qty, OutSrcInst_Chk02_ReArrR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$rqst_dlv_rqst_tm, OutSrcInst_Chk02_ReArrR.$dlv_rqst_tm);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 本処理から実行する場合は、発注予定を更新しないためnullを渡す
				dest.po_schd_data_crud_typ(null);
				dest.is_src_outsrc_srv_flg(true);
				dest.lst_reg_flg(true);
			}
		}
		
		/**
		 * 再入荷予定の元となった仕入実績明細に紐付く製造指図ＮＯからの値の補完処理
		 * @param crtUpL
		 * @param crtHdrL
		 * @param hdrIdxKey
		 */
		protected void copyFromOrgMfgInst(MCList<OutSrcInst_Chk02_ReArrR> crtUpL, 
				MCList<MfgInstReg_Upd01_HdrR> crtHdrL, MCIndexKey hdrIdxKey) {
			MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T2");
			MST_ITM_ORDER_R t3 = MST_ITM_ORDER_R.create("T3");
			MCList<MST_ITM_MFG_INST_R> orgImiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder orgImiL_bldr = MCQueryApiBuilder.create(t);
			orgImiL_bldr.setSelect(t.itm_ord_no);
			orgImiL_bldr.addSelect(t.sno1);
			orgImiL_bldr.addSelect(t.sno2);
			orgImiL_bldr.addSelect(t.sno3);
			orgImiL_bldr.addSelect(t.sno4);
			orgImiL_bldr.addSelect(t.mfg_loc_cd);
			orgImiL_bldr.addSelect(t.strg_loc_cd);
			orgImiL_bldr.addSelect(t.bom_ptn);
			orgImiL_bldr.addSelect(t.master_dt);
			orgImiL_bldr.addSelect(t.mfg_str_ln_cd);
			orgImiL_bldr.addSelect(t.strg_str_ln_cd);
			orgImiL_bldr.addSelect(t2.mfg_inst_no);
			orgImiL_bldr.addSelect(t2.inst_dt);
			orgImiL_bldr.addSelect(t2.po_d_no);
			orgImiL_bldr.addSelect(t3.not_inst_qty);
			orgImiL_bldr.addInnerJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			orgImiL_bldr.addInnerJoin(t3, bracket( t.itm_ord_no.eq(t3.itm_ord_no)));
			orgImiL_bldr.setWhere(t2.mfg_inst_no.eq(bind("org_mfg_inst_no")));
			orgImiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelectForUpdate("MSBCL6120_MST_ITM_MFG_INST_S04", orgImiL, orgImiL_bldr, crtUpL);

			MCIndexKey orgImiIdxKey = orgImiL.createIndex("mfg_inst_no");
			for (OutSrcInst_Chk02_ReArrR crtUpR : crtUpL) {
				MfgInstReg_Upd01_HdrR crtHdrR = crtHdrL.getFirst(hdrIdxKey, crtUpR.peg_no());
				MST_ITM_MFG_INST_R orgImiR = orgImiL.getFirst(orgImiIdxKey, crtUpR.org_mfg_inst_no());
				
				crtHdrR.itm_ord_no(orgImiR.itm_ord_no());
				crtHdrR.sno1(orgImiR.sno1());
				crtHdrR.sno2(orgImiR.sno2());
				crtHdrR.sno3(orgImiR.sno3());
				crtHdrR.sno4(orgImiR.sno4());
				crtHdrR.mfg_loc_cd(orgImiR.mfg_loc_cd());
				crtHdrR.strg_loc_cd(orgImiR.strg_loc_cd());
				crtHdrR.bom_ptn(orgImiR.bom_ptn());
				crtHdrR.master_dt(orgImiR.master_dt());
				crtHdrR.mfg_str_ln_cd(orgImiR.mfg_str_ln_cd());
				crtHdrR.strg_str_ln_cd(orgImiR.strg_str_ln_cd());
				crtHdrR.po_d_no(orgImiR.getStringNE("po_d_no"));
				crtHdrR.base_unit_not_inst_qty(orgImiR.getNumberNE("not_inst_qty"));
				crtHdrR.inst_dt(orgImiR.getDateNE("inst_dt"));
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * OutSrcInst_Upd03オペレーション.<p>
	 *
	 * 発注明細・入荷予定の打切に応じて、製造指図を打ち切る。<br>
	 */
	public class OutSrcInst_Upd03 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<OutSrcInst_Upd03_ArrAbortR> instNoL = MCList.create(OutSrcInst_Upd03_ArrAbortR.class);
			for (MCList<OutSrcInst_Upd03_ArrAbortR> gL : up0().groupList(OutSrcInst_Upd03_ArrAbortR.$mfg_inst_no)) {
				if (isNull(getArrActCacheByMfgInstNo(gL.get(0).mfg_inst_no()))) {
					// 入荷実績が存在しない場合のみ処理対象とする
					instNoL.add(gL.get(0));
				}
			}
			
			if (instNoL.isEmpty()) {
				return;
			}
			
			// ヘッダコンテナ
			MCList<MfgInstReg_Upd01_HdrR> opeHdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			setInstUpdHdrConatiner(instNoL, opeHdrL);
			
			// 工程コンテナ
			MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL = MCList.create(MfgInstReg_Upd01_DtlOperR.class);
			setInstUpdOperConatiner(opeHdrL, opeDtlOperL);
			
			// 投入コンテナ
			MCList<MfgInstReg_Upd01_DtlInptR> opeDtlInptL = MCList.create(MfgInstReg_Upd01_DtlInptR.class);
			setInstUpdInptConatiner(opeDtlOperL, opeDtlInptL);
			
			// 出来高コンテナ
			MCList<MfgInstReg_Upd01_DtlYieldR> opeDtlYieldL = MCList.create(MfgInstReg_Upd01_DtlYieldR.class);
			setInstUpdYieldConatiner(opeDtlOperL, opeDtlYieldL);
			
			// 指図打切処理実行
			MSBCL_MfgInstRegService.MfgInstReg_Upd01 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			ope.up0().addAll(opeHdrL);
			ope.up1().addAll(opeDtlOperL);
			ope.up2().addAll(opeDtlInptL);
			ope.up4().addAll(opeDtlYieldL);
			setMesFlg(ope.up0(), ope.up1());
			editMfgInstRev(ope.up0(), ope.up1());
			ope.exec();
		}
		protected void editMfgInstRev(MCList<MfgInstReg_Upd01_HdrR> hdrL, MCList<MfgInstReg_Upd01_DtlOperR> operL) {
			for (MfgInstReg_Upd01_HdrR hdrR : hdrL) {
				MCList<MfgInstReg_Upd01_DtlOperR> subOperL = operL
						.subList(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, hdrR.peg_no());
				if (!isNull(subOperL.getFirst(MfgInstReg_Chk01_DtlOperR.$mes_flg,
						true))) {
					hdrR.mfg_inst_rev(hdrR.mfg_inst_rev().add(1));
				}
			}
		}
		
		protected void setInstUpdHdrConatiner(
				MCList<OutSrcInst_Upd03_ArrAbortR> instNoL,
				MCList<MfgInstReg_Upd01_HdrR> opeHdrL) {
			MSVT_MFG_INST_PR_R inst_pr = MSVT_MFG_INST_PR_R.create("T2");
			MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R inst1 = MST_MFG_INST_R.create("INST");
			MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(inst1);
			miL_bldr.setSelect(inst1.mfg_inst_no);
			miL_bldr.addSelect(inst1.itm_mfg_inst_no);
			miL_bldr.addSelect(inst1.mfg_inst_unit_typ);
			miL_bldr.addSelect(inst1.mfg_aprv_sts_typ);
			miL_bldr.addSelect(inst1.aprv_flg);
			miL_bldr.addSelect(inst1.mfg_aprv_role_cd);
			miL_bldr.addSelect(inst1.inst_dt);
			miL_bldr.addSelect(inst1.mfg_inst_rev);
			miL_bldr.addSelect(inst_pr.mfg_sts_typ);
			miL_bldr.addInnerJoin(inst_pr, inst1.mfg_inst_no.eq(inst_pr.mfg_inst_no));
			dbSelectKey("MSBCL6120_MST_MFG_INST_S04", miL, miL_bldr, instNoL);

			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R itm_inst = MST_ITM_MFG_INST_R.create("ITM_INST");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(itm_inst);
			imiL_bldr.setSelect(itm_inst.mfg_mtd_typ);
			imiL_bldr.addSelect(itm_inst.itm_cd);
			imiL_bldr.addSelect(itm_inst.itm_sub1);
			imiL_bldr.addSelect(itm_inst.itm_sub2);
			imiL_bldr.addSelect(itm_inst.itm_sub3);
			imiL_bldr.addSelect(itm_inst.bom_ptn);
			imiL_bldr.addSelect(itm_inst.sno1);
			imiL_bldr.addSelect(itm_inst.sno2);
			imiL_bldr.addSelect(itm_inst.sno3);
			imiL_bldr.addSelect(itm_inst.sno4);
			imiL_bldr.addSelect(itm_inst.itm_mfg_inst_no);
			imiL_bldr.addSelect(itm_inst.frst_mfg_inst_no);
			imiL_bldr.addSelect(itm_inst.itm_ord_no);
			imiL_bldr.addSelect(itm_inst.wg_cd);
			imiL_bldr.addSelect(itm_inst.site_cd);
			imiL_bldr.addSelect(itm_inst.lot_no);
			imiL_bldr.addSelect(itm_inst.sublot_no);
			imiL_bldr.addSelect(itm_inst.unschd_inst_flg);
			imiL_bldr.addSelect(itm_inst.mfg_loc_cd);
			imiL_bldr.setWhere(itm_inst.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			dbSelect("MSBCL6120_MST_ITM_MFG_INST_S05", imiL, imiL_bldr, miL);

			MCIndexKey mikey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCIndexKey imikey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			for (OutSrcInst_Upd03_ArrAbortR upR : instNoL) {
				MfgInstReg_Upd01_HdrR opeHdrR = MfgInstReg_Upd01_HdrR.create();
				opeHdrR.setAttributes(upR);
				opeHdrR.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeHdrR.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeHdrR.base_unit_not_inst_qty(MCNumber.ZERO);
				opeHdrR.inst_abort_flg(true);
				// 発注側の更新可否は、発注訂正・取消不可で制御する想定なので、移動指図取消可はtrue
				opeHdrR.xfr_inst_del_enable_flg(true);
				// 打切処理では使用しない制御項目であるため、false
				opeHdrR.lst_reg_flg(false);
				opeHdrR.is_src_outsrc_srv_flg(true);
				
				MST_MFG_INST_R miR = miL.getFirst(mikey, upR.mfg_inst_no());
				opeHdrR.mfg_inst_no(miR.mfg_inst_no());
				opeHdrR.mfg_inst_rev(miR.mfg_inst_rev());
				opeHdrR.itm_mfg_inst_no(miR.itm_mfg_inst_no());
				opeHdrR.mfg_inst_unit_typ(miR.mfg_inst_unit_typ());
				opeHdrR.old_mfg_sts_typ(miR.getStringNE("mfg_sts_typ"));
				opeHdrR.old_mfg_aprv_sts_typ(miR.mfg_aprv_sts_typ());
				opeHdrR.old_aprv_flg(miR.aprv_flg());
				opeHdrR.old_mfg_aprv_role_cd(miR.mfg_aprv_role_cd());
				opeHdrR.old_inst_dt(miR.inst_dt());
				
				MST_ITM_MFG_INST_R imiR = imiL.getFirst(imikey, opeHdrR.itm_mfg_inst_no());
				opeHdrR.mfg_mtd_typ(imiR.mfg_mtd_typ());
				opeHdrR.itm_cd(imiR.itm_cd());
				opeHdrR.itm_sub1(imiR.itm_sub1());
				opeHdrR.itm_sub2(imiR.itm_sub2());
				opeHdrR.itm_sub3(imiR.itm_sub3());
				opeHdrR.bom_ptn(imiR.bom_ptn());
				opeHdrR.sno1(imiR.sno1());
				opeHdrR.sno2(imiR.sno2());
				opeHdrR.sno3(imiR.sno3());
				opeHdrR.sno4(imiR.sno4());
				opeHdrR.frst_mfg_inst_no(imiR.frst_mfg_inst_no());
				opeHdrR.itm_ord_no(imiR.itm_ord_no());
				opeHdrR.mfg_loc_wg_cd(imiR.wg_cd());
				opeHdrR.mfg_loc_site_cd(imiR.site_cd());
				opeHdrR.old_lot_no(imiR.lot_no());
				opeHdrR.old_sublot_no(imiR.sublot_no());
				opeHdrR.unschd_inst_flg(imiR.unschd_inst_flg());
				opeHdrR.mfg_loc_cd(imiR.mfg_loc_cd());
				
				opeHdrL.add(opeHdrR);
			}
			setPegNo(opeHdrL);
		}
		
		protected void setInstUpdOperConatiner(MCList<MfgInstReg_Upd01_HdrR> opeHdrL,
				MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL) {
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R ope_inst = MST_OPER_INST_R.create("OPE_INST");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(ope_inst);
			oiL_bldr.setSelect(ope_inst.oper_ord_no);
			oiL_bldr.addSelect(ope_inst.mfg_inst_no);
			oiL_bldr.addSelect(ope_inst.oper_inst_no);
			oiL_bldr.addSelect(ope_inst.unschd_inst_flg);
			oiL_bldr.addSelect(ope_inst.oper_cd);
			oiL_bldr.setWhere(ope_inst.mfg_inst_no.eq(bind("mfg_inst_no")));
			oiL_bldr.addWhereWithAnd(ope_inst.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_OPER_INST_S02", oiL, oiL_bldr, opeHdrL);
			
			MCIndexKey idxkey = oiL.createIndex(MST_OPER_INST_R.$mfg_inst_no);
			for (MfgInstReg_Upd01_HdrR opeHdrR : opeHdrL) {
				MfgInstReg_Upd01_DtlOperR opeDtlOperR = MfgInstReg_Upd01_DtlOperR.create();
				opeDtlOperR.setAttributes(opeHdrR);
				
				opeDtlOperR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeDtlOperR.hdr_peg_no(opeHdrR.peg_no());
				opeDtlOperR.not_oper_schd_qty(MCNumber.ZERO);
				opeDtlOperR.inst_abort_flg(true);
				opeDtlOperR.oper_abort_flg(true);
				
				// 工程指図はデフォルト工程一件のみのためgetFirstする
				MST_OPER_INST_R oiR = oiL.getFirst(idxkey, opeHdrR.mfg_inst_no());
				opeDtlOperR.oper_ord_no(oiR.oper_ord_no());
				opeDtlOperR.oper_inst_no(oiR.oper_inst_no());
				opeDtlOperR.unschd_inst_flg(oiR.unschd_inst_flg());
				opeDtlOperR.oper_cd(oiR.oper_cd());
				
				opeDtlOperL.add(opeDtlOperR);
			}
			setPegNo(opeDtlOperL);
		}

		protected void setInstUpdInptConatiner(
				MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL,
				MCList<MfgInstReg_Upd01_DtlInptR> opeDtlInptL) {
			MSVT_INPT_SCHD_PR_R t2 = MSVT_INPT_SCHD_PR_R.create("T2");
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			isL_bldr.setSelect(t.oper_inst_no);
			isL_bldr.addSelect(t.inpt_schd_no);
			isL_bldr.addSelect(t.itm_cd);
			isL_bldr.addSelect(t.itm_sub1);
			isL_bldr.addSelect(t.itm_sub2);
			isL_bldr.addSelect(t.itm_sub3);
			isL_bldr.addSelect(t.ver_no);
			isL_bldr.addSelect(t.inpt_ctl_typ);
			isL_bldr.addSelect(t.prov_typ);
			isL_bldr.addSelect(t2.mfg_sts_typ);
			isL_bldr.addInnerJoin(t2, bracket( t.inpt_schd_no.eq(t2.inpt_schd_no)));
			isL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_INPT_SCHD_S03", isL, isL_bldr, opeDtlOperL);
			
			MCIndexKey idxkey = isL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			for (MfgInstReg_Upd01_DtlOperR opeDtlOperR : opeDtlOperL) {
				MCList<MST_INPT_SCHD_R> isSubL = isL.subList(idxkey, opeDtlOperR.oper_inst_no());
				
				for (MST_INPT_SCHD_R isR : isSubL) {
					MfgInstReg_Upd01_DtlInptR opeDtlInptR = MfgInstReg_Upd01_DtlInptR.create();
					opeDtlInptR.setAttributes(opeDtlOperR);

					opeDtlInptR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					opeDtlInptR.hdr_peg_no(opeDtlOperR.hdr_peg_no());
					opeDtlInptR.oper_peg_no(opeDtlOperR.peg_no());
					opeDtlInptR.inst_abort_flg(true);
					
					opeDtlInptR.itm_cd(isR.itm_cd());
					opeDtlInptR.itm_sub1(isR.itm_sub1());
					opeDtlInptR.itm_sub2(isR.itm_sub2());
					opeDtlInptR.itm_sub3(isR.itm_sub3());
					opeDtlInptR.ver_no(isR.ver_no());
					opeDtlInptR.inpt_ctl_typ(isR.inpt_ctl_typ());
					opeDtlInptR.prov_typ(isR.prov_typ());
					opeDtlInptR.inpt_schd_no(isR.inpt_schd_no());
					opeDtlInptR.old_mfg_sts_typ(isR.getStringNE("mfg_sts_typ"));
					
					opeDtlInptL.add(opeDtlInptR);
				}
			}
			setPegNo(opeDtlInptL);
			setXfrInstErrFlg(opeDtlInptL);
		}
		
		protected void setInstUpdYieldConatiner(
				MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL,
				MCList<MfgInstReg_Upd01_DtlYieldR> opeDtlYieldL) {
			MSVT_YIELD_SCHD_PR_R t2 = MSVT_YIELD_SCHD_PR_R.create("T2");
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			ysL_bldr.setSelect(t.oper_inst_no);
			ysL_bldr.addSelect(t.yield_schd_no);
			ysL_bldr.addSelect(t2.mfg_sts_typ);
			ysL_bldr.addInnerJoin(t2, bracket( t.yield_schd_no.eq(t2.yield_schd_no)));
			ysL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_YIELD_SCHD_S02", ysL, ysL_bldr, opeDtlOperL);
			
			MCIndexKey idxkey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			for (MfgInstReg_Upd01_DtlOperR opeDtlOperR : opeDtlOperL) {
				// 出来高予定は１件の想定
				MST_YIELD_SCHD_R ysR = ysL.getFirst(idxkey, opeDtlOperR.oper_inst_no());
				MfgInstReg_Upd01_DtlYieldR opeDtlYieldR = MfgInstReg_Upd01_DtlYieldR.create();
				opeDtlYieldR.setAttributes(opeDtlOperR);
				opeDtlYieldR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeDtlYieldR.inst_abort_flg(true);
				opeDtlYieldR.hdr_peg_no(opeDtlOperR.hdr_peg_no());
				opeDtlYieldR.oper_peg_no(opeDtlOperR.peg_no());
				opeDtlYieldR.yield_schd_no(ysR.yield_schd_no());
				opeDtlYieldR.old_mfg_sts_typ(ysR.getStringNE("mfg_sts_typ"));
				
				opeDtlYieldL.add(opeDtlYieldR);
			}
			setPegNo(opeDtlYieldL);
		}
	}
	
	/**
	 * OutSrcInst_Upd04オペレーション.<p>
	 *
	 * 発注明細・入荷予定の打切取消に応じて、製造指図の打切りを取り消す。<br>
	 */
	public class OutSrcInst_Upd04 extends MSBCL_OutSrcInstService_MC_A.OutSrcInst_Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initArrActByMfgInstNoCache(up0().groupBy(OutSrcInst_Upd04_ArrAbortR.$mfg_inst_no));
			
			MCList<OutSrcInst_Upd04_ArrAbortR> instNoL = MCList.create(OutSrcInst_Upd04_ArrAbortR.class);
			for (MCList<OutSrcInst_Upd04_ArrAbortR> gL : up0().groupList(OutSrcInst_Upd04_ArrAbortR.$mfg_inst_no)) {
				if (isNull(getArrActCacheByMfgInstNo(gL.get(0).mfg_inst_no()))) {
					// 入荷実績が存在しない場合のみ処理対象とする
					instNoL.add(gL.get(0));
				}
			}
			
			if (instNoL.isEmpty()) {
				return;
			}
			
			// ヘッダコンテナ
			MCList<MfgInstReg_Upd01_HdrR> opeHdrL = MCList.create(MfgInstReg_Upd01_HdrR.class);
			setInstUpdHdrConatiner(instNoL, opeHdrL);
			
			// 工程コンテナ
			MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL = MCList.create(MfgInstReg_Upd01_DtlOperR.class);
			setInstUpdOperConatiner(opeHdrL, opeDtlOperL);
			
			// 投入コンテナ
			MCList<MfgInstReg_Upd01_DtlInptR> opeDtlInptL = MCList.create(MfgInstReg_Upd01_DtlInptR.class);
			setInstUpdInptConatiner(opeDtlOperL, opeDtlInptL);
			
			// 出来高コンテナ
			MCList<MfgInstReg_Upd01_DtlYieldR> opeDtlYieldL = MCList.create(MfgInstReg_Upd01_DtlYieldR.class);
			setInstUpdYieldConatiner(opeDtlOperL, opeDtlYieldL);
			
			// 指図打切取消処理実行
			MSBCL_MfgInstRegService.MfgInstReg_Upd01 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			ope.up0().addAll(opeHdrL);
			ope.up1().addAll(opeDtlOperL);
			ope.up2().addAll(opeDtlInptL);
			ope.up4().addAll(opeDtlYieldL);
			setMesFlg(ope.up0(), ope.up1());
			editMfgInstRev(ope.up0(), ope.up1());
			ope.exec();
		}
		protected void editMfgInstRev(MCList<MfgInstReg_Upd01_HdrR> hdrL, MCList<MfgInstReg_Upd01_DtlOperR> operL) {
			for (MfgInstReg_Upd01_HdrR hdrR : hdrL) {
				if (!MSC_MFG_STS_TYP.isORD(hdrR.mfg_sts_typ())) {
					continue;
				}
				MCList<MfgInstReg_Upd01_DtlOperR> subOperL = operL
						.subList(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, hdrR.peg_no());
				if (!isNull(subOperL.getFirst(MfgInstReg_Chk01_DtlOperR.$mes_flg,
						true))) {
					hdrR.mfg_inst_rev(hdrR.mfg_inst_rev().add(1));
				}
			}
		}
		
		protected void setInstUpdHdrConatiner(
				MCList<OutSrcInst_Upd04_ArrAbortR> instNoL,
				MCList<MfgInstReg_Upd01_HdrR> opeHdrL) {
			MSVT_MFG_INST_PR_R inst2 = MSVT_MFG_INST_PR_R.create("INST2");

			MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R inst1 = MST_MFG_INST_R.create("INST");
			MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(inst1);
			miL_bldr.setSelect(inst1.mfg_inst_no);
			miL_bldr.addSelect(inst1.itm_mfg_inst_no);
			miL_bldr.addSelect(inst1.mfg_inst_unit_typ);
			miL_bldr.addSelect(inst1.mfg_aprv_sts_typ);
			miL_bldr.addSelect(inst1.aprv_flg);
			miL_bldr.addSelect(inst1.mfg_aprv_role_cd);
			miL_bldr.addSelect(inst1.inst_dt);
			miL_bldr.addSelect(inst1.mfg_inst_rev);
			miL_bldr.addSelect(inst2.mfg_sts_typ);
			miL_bldr.addSelect(inst1.end_schd_tm);
			miL_bldr.addInnerJoin(inst2, bracket( inst1.mfg_inst_no.eq(inst2.mfg_inst_no)));
			dbSelectKey("MSBCL6120_MST_MFG_INST_S05", miL, miL_bldr, instNoL);

			MAVM_ITM_DTL_MFG_R itm_dtl = MAVM_ITM_DTL_MFG_R.create("ITM_DTL");

			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R itm_inst = MST_ITM_MFG_INST_R.create("ITM_INST");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(itm_inst);
			imiL_bldr.setSelect(itm_inst.mfg_mtd_typ);
			imiL_bldr.addSelect(itm_inst.itm_cd);
			imiL_bldr.addSelect(itm_inst.itm_sub1);
			imiL_bldr.addSelect(itm_inst.itm_sub2);
			imiL_bldr.addSelect(itm_inst.itm_sub3);
			imiL_bldr.addSelect(itm_inst.bom_ptn);
			imiL_bldr.addSelect(itm_inst.sno1);
			imiL_bldr.addSelect(itm_inst.sno2);
			imiL_bldr.addSelect(itm_inst.sno3);
			imiL_bldr.addSelect(itm_inst.sno4);
			imiL_bldr.addSelect(itm_inst.itm_mfg_inst_no);
			imiL_bldr.addSelect(itm_inst.frst_mfg_inst_no);
			imiL_bldr.addSelect(itm_inst.itm_ord_no);
			imiL_bldr.addSelect(itm_inst.wg_cd);
			imiL_bldr.addSelect(itm_inst.site_cd);
			imiL_bldr.addSelect(itm_inst.mfg_loc_cd);
			imiL_bldr.addSelect(itm_inst.io_schd_pr_no);
			imiL_bldr.addSelect(itm_inst.lot_no);
			imiL_bldr.addSelect(itm_inst.sublot_no);
			imiL_bldr.addSelect(itm_dtl.lot_issue_typ);
			imiL.addBooleanColumn("no_mfg_aprv_flg");
			imiL_bldr.addSelect(itm_dtl.no_mfg_aprv_flg);
			imiL_bldr.addInnerJoin(itm_dtl,
					itm_inst.itm_cd.eq(itm_dtl.itm_cd)
							.and(itm_inst.itm_sub1.eq(itm_dtl.itm_sub1))
							.and(itm_inst.itm_sub2.eq(itm_dtl.itm_sub2))
							.and(itm_inst.itm_sub3.eq(itm_dtl.itm_sub3))
							.and(itm_inst.mfg_loc_cd.eq(itm_dtl.mfg_loc_cd))
							.and(value(MAC_STR.NULL_VAL.value()).eq(itm_dtl.sppl_cd))
							.and(value(MAC_STR.NULL_VAL.value()).eq(itm_dtl.maker_cd))
							.and(value(MAC_STR.NULL_VAL.value()).eq(itm_dtl.rqst_loc_cd))
							.and(itm_inst.wg_cd.eq(itm_dtl.wg_cd))
							.and(itm_inst.bom_ptn.eq(itm_dtl.bom_ptn)));
			imiL_bldr.setWhere(itm_inst.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			dbSelect("MSBCL6120_MST_ITM_MFG_INST_S06", imiL, imiL_bldr, miL);
			
			MCIndexKey mikey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCIndexKey imikey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			for (OutSrcInst_Upd04_ArrAbortR upR : instNoL) {
				MfgInstReg_Upd01_HdrR opeHdrR = MfgInstReg_Upd01_HdrR.create();
				opeHdrR.setAttributes(upR);
				opeHdrR.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeHdrR.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeHdrR.base_unit_not_inst_qty(MCNumber.ZERO);
				opeHdrR.inst_abort_flg(false);
				opeHdrR.old_inst_abort_flg(true);
				// 発注側の更新可否は、発注訂正・取消不可で制御する想定なので、移動指図取消可はtrue
				opeHdrR.xfr_inst_del_enable_flg(true);
				opeHdrR.lst_reg_flg(true);
				opeHdrR.is_src_outsrc_srv_flg(true);
				
				MST_MFG_INST_R miR = miL.getFirst(mikey, upR.mfg_inst_no());
				opeHdrR.mfg_inst_no(miR.mfg_inst_no());
				opeHdrR.mfg_inst_rev(miR.mfg_inst_rev());
				opeHdrR.itm_mfg_inst_no(miR.itm_mfg_inst_no());
				opeHdrR.mfg_inst_unit_typ(miR.mfg_inst_unit_typ());
				opeHdrR.old_mfg_sts_typ(miR.getStringNE("mfg_sts_typ"));
				opeHdrR.old_mfg_aprv_sts_typ(miR.mfg_aprv_sts_typ());
				opeHdrR.old_aprv_flg(miR.aprv_flg());
				opeHdrR.old_mfg_aprv_role_cd(miR.mfg_aprv_role_cd());
				opeHdrR.inst_dt(miR.inst_dt());
				opeHdrR.end_schd_tm(miR.end_schd_tm());
				
				MST_ITM_MFG_INST_R imiR = imiL.getFirst(imikey, opeHdrR.itm_mfg_inst_no());
				opeHdrR.mfg_mtd_typ(imiR.mfg_mtd_typ());
				opeHdrR.itm_cd(imiR.itm_cd());
				opeHdrR.itm_sub1(imiR.itm_sub1());
				opeHdrR.itm_sub2(imiR.itm_sub2());
				opeHdrR.itm_sub3(imiR.itm_sub3());
				opeHdrR.bom_ptn(imiR.bom_ptn());
				opeHdrR.sno1(imiR.sno1());
				opeHdrR.sno2(imiR.sno2());
				opeHdrR.sno3(imiR.sno3());
				opeHdrR.sno4(imiR.sno4());
				opeHdrR.frst_mfg_inst_no(imiR.frst_mfg_inst_no());
				opeHdrR.itm_ord_no(imiR.itm_ord_no());
				opeHdrR.mfg_loc_wg_cd(imiR.wg_cd());
				opeHdrR.mfg_loc_site_cd(imiR.site_cd());
				opeHdrR.mfg_loc_cd(imiR.mfg_loc_cd());
				opeHdrR.io_schd_pr_no(imiR.io_schd_pr_no());
				opeHdrR.lot_no(imiR.lot_no());
				opeHdrR.sublot_no(imiR.sublot_no());
				opeHdrR.mfg_sts_typ(getMfgStsTyp(imiR.getStringNE("lot_issue_typ"), imiR.lot_no()));
				opeHdrR.no_mfg_aprv_flg(imiR.getBooleanNE("no_mfg_aprv_flg"));
				
				opeHdrL.add(opeHdrR);
			}
			setPegNo(opeHdrL);
		}
		
		protected void setInstUpdOperConatiner(MCList<MfgInstReg_Upd01_HdrR> opeHdrL,
				MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL) {
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
			oiL_bldr.setSelect(t.mfg_inst_no);
			oiL_bldr.addSelect(t.oper_inst_no);
			oiL_bldr.addSelect(t.oper_cd);
			oiL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			oiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_OPER_INST_S03", oiL, oiL_bldr, opeHdrL);
			
			MCIndexKey idxkey = oiL.createIndex(MST_OPER_INST_R.$mfg_inst_no);
			for (MfgInstReg_Upd01_HdrR opeHdrR : opeHdrL) {
				MfgInstReg_Upd01_DtlOperR opeDtlOperR = MfgInstReg_Upd01_DtlOperR.create();
				opeDtlOperR.setAttributes(opeHdrR);
				
				opeDtlOperR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeDtlOperR.hdr_peg_no(opeHdrR.peg_no());
				opeDtlOperR.inst_abort_flg(false);
				opeDtlOperR.oper_abort_flg(false);
				opeDtlOperR.old_inst_abort_flg(true);
				
				// 工程指図はデフォルト工程一件のみのためgetFirstする
				MST_OPER_INST_R oiR = oiL.getFirst(idxkey, opeHdrR.mfg_inst_no());
				opeDtlOperR.oper_inst_no(oiR.oper_inst_no());
				opeDtlOperR.mfg_inst_no(oiR.mfg_inst_no());
				opeDtlOperR.mfg_sts_typ(opeHdrR.mfg_sts_typ());
				opeDtlOperR.oper_cd(oiR.oper_cd());
				
				opeDtlOperL.add(opeDtlOperR);
			}
			setPegNo(opeDtlOperL);
		}

		protected void setInstUpdInptConatiner(
				MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL,
				MCList<MfgInstReg_Upd01_DtlInptR> opeDtlInptL) {
			MSVT_INPT_SCHD_PR_R t2 = MSVT_INPT_SCHD_PR_R.create("T2");
			MSVT_LOT_LIST_R t3 = MSVT_LOT_LIST_R.create("T3");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			isL_bldr.addSelect(t2.mfg_sts_typ);

			isL_bldr.addSelect(m1.lot_mng_typ);
			isL_bldr.addSelect(m1.sublot_mng_typ);
			isL_bldr.addSelect(m1.stk_mng_typ);
			isL.addBooleanColumn("cont_fctr_flg");
			isL_bldr.addSelect(m1.cont_fctr_flg);

			isL_bldr.addSelect(t3.vld_dt);
			isL_bldr.addSelect(t3.first_gr_dt);
			isL_bldr.addSelect(t3.lot_seq);

			isL_bldr.addInnerJoin(t2, t.inpt_schd_no.eq(t2.inpt_schd_no));
			isL_bldr.addLeftOuterJoin(t3,
					t.itm_cd.eq(t3.itm_cd)
							.and(t.itm_sub1.eq(t3.itm_sub1))
							.and(t.itm_sub2.eq(t3.itm_sub2))
							.and(t.itm_sub3.eq(t3.itm_sub3))
							.and(t.lot_no.eq(t3.lot_no))
							.and(t.sublot_no.eq(t3.sublot_no)));
			isL_bldr.addInnerJoin(m1,t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3)));
			isL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			isL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_INPT_SCHD_S04", isL, isL_bldr, opeDtlOperL);
			
			MCIndexKey idxkey = isL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			for (MfgInstReg_Upd01_DtlOperR opeDtlOperR : opeDtlOperL) {
				MCList<MST_INPT_SCHD_R> isSubL = isL.subList(idxkey, opeDtlOperR.oper_inst_no());
				
				for (MST_INPT_SCHD_R isR : isSubL) {
					MfgInstReg_Upd01_DtlInptR opeDtlInptR = MfgInstReg_Upd01_DtlInptR.create();
					opeDtlInptR.setAttributes(opeDtlOperR);

					opeDtlInptR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					opeDtlInptR.hdr_peg_no(opeDtlOperR.hdr_peg_no());
					opeDtlInptR.oper_peg_no(opeDtlOperR.peg_no());
					opeDtlInptR.mfg_sts_typ(opeDtlOperR.mfg_sts_typ());
					opeDtlInptR.inst_abort_flg(false);
					opeDtlInptR.old_inst_abort_flg(true);
					
					opeDtlInptR.alt_grp_cd(isR.alt_grp_cd());
					opeDtlInptR.alt_grp_seq(isR.alt_grp_seq());
					opeDtlInptR.alt_itm_fix_flg(isR.alt_itm_fix_flg());
					opeDtlInptR.itm_cd(isR.itm_cd());
					opeDtlInptR.itm_sub1(isR.itm_sub1());
					opeDtlInptR.itm_sub2(isR.itm_sub2());
					opeDtlInptR.itm_sub3(isR.itm_sub3());
					opeDtlInptR.ver_no(isR.ver_no());
					opeDtlInptR.lot_mng_typ(isR.getStringNE("lot_mng_typ"));
					opeDtlInptR.sublot_mng_typ(isR.getStringNE("sublot_mng_typ"));
					opeDtlInptR.base_unit_alt_qty(isR.base_unit_alt_qty());
					opeDtlInptR.base_unit_inpt_qty(isR.base_unit_inpt_qty());
					opeDtlInptR.base_unit_rqmt_qty(isR.base_unit_rqmt_qty());
					opeDtlInptR.base_unit_fxd_rqmt_qty(isR.base_unit_fxd_rqmt_qty());
					opeDtlInptR.base_unit_cd(isR.base_unit_cd());
					opeDtlInptR.cont_fctr_flg(isR.getBooleanNE("cont_fctr_flg"));
					opeDtlInptR.act_cont_fctr(isR.act_cont_fctr());
					opeDtlInptR.cont_inpt_qty(isR.cont_inpt_qty());
					opeDtlInptR.cont_rqmt_qty(isR.cont_rqmt_qty());
					opeDtlInptR.cont_fxd_rqmt_qty(isR.cont_fxd_rqmt_qty());
					opeDtlInptR.cont_fctr_unit_cd(isR.cont_fctr_unit_cd());
					opeDtlInptR.std_cont_fctr(isR.std_cont_fctr());
					opeDtlInptR.schd_tm(isR.schd_tm());
					opeDtlInptR.alloc_flg(isR.alloc_flg());
					opeDtlInptR.no_lot_fix_flg(isNull(isR.lot_no()));
					opeDtlInptR.inst_lot_fix_flg(isR.inst_lot_fix_flg());
					opeDtlInptR.lot_no(isR.lot_no());
					opeDtlInptR.sublot_no(isR.sublot_no());
					opeDtlInptR.vld_dt(isR.getDateNE("vld_dt"));
					opeDtlInptR.first_gr_dt(isR.getDateNE("first_gr_dt"));
					opeDtlInptR.lot_seq(isR.getStringNE("lot_seq"));
					opeDtlInptR.sno1(isR.sno1());
					opeDtlInptR.sno1_null_flg(isR.sno1_null_flg());
					opeDtlInptR.sno2(isR.sno2());
					opeDtlInptR.sno2_null_flg(isR.sno2_null_flg());
					opeDtlInptR.sno3(isR.sno3());
					opeDtlInptR.sno3_null_flg(isR.sno3_null_flg());
					opeDtlInptR.sno4(isR.sno4());
					opeDtlInptR.sno4_null_flg(isR.sno4_null_flg());
					opeDtlInptR.alloc_sno1(isR.alloc_sno1());
					opeDtlInptR.alloc_sno2(isR.alloc_sno2());
					opeDtlInptR.alloc_sno3(isR.alloc_sno3());
					opeDtlInptR.alloc_sno4(isR.alloc_sno4());
					opeDtlInptR.inpt_loc_cd(isR.inpt_loc_cd());
					opeDtlInptR.inpt_str_ln_cd(isR.inpt_str_ln_cd());
					opeDtlInptR.gd_cd(isR.gd_cd());
					opeDtlInptR.intr_rmrks(isR.intr_rmrks());
					opeDtlInptR.inst_rpt_rmrks(isR.inst_rpt_rmrks());
					opeDtlInptR.sub_char1(isR.sub_char1());
					opeDtlInptR.sub_char2(isR.sub_char2());
					opeDtlInptR.sub_char3(isR.sub_char3());
					opeDtlInptR.bkf_typ(isR.bkf_typ());
					opeDtlInptR.par_inst_qty(isR.par_inst_qty());
					opeDtlInptR.chd_inpt_qty(isR.chd_inpt_qty());
					opeDtlInptR.chd_rqmt_qty(isR.chd_rqmt_qty());
					opeDtlInptR.fxd_chd_rqmt_qty(isR.fxd_chd_rqmt_qty());
					opeDtlInptR.main_itm_flg(isR.main_itm_flg());
					opeDtlInptR.bom_id_no(isR.bom_id_no());
					opeDtlInptR.chd_itm_seq(isR.chd_itm_seq());
					opeDtlInptR.bom_memo1(isR.bom_memo1());
					opeDtlInptR.bom_memo2(isR.bom_memo2());
					opeDtlInptR.bom_memo3(isR.bom_memo3());
					opeDtlInptR.yield_calc_flg(isR.yield_calc_flg());
					opeDtlInptR.alloc_ctl_typ(isR.alloc_ctl_typ());
					opeDtlInptR.inpt_ctl_typ(isR.inpt_ctl_typ());
					opeDtlInptR.in_offst_typ(isR.in_offst_typ());
					opeDtlInptR.in_offst(isR.in_offst());
					opeDtlInptR.lot_mix_flg(isR.lot_mix_flg());
					opeDtlInptR.sublot_mix_flg(isR.sublot_mix_flg());
					opeDtlInptR.stk_mng_typ(isR.getStringNE("stk_mng_typ"));
					opeDtlInptR.prov_typ(isR.prov_typ());
					opeDtlInptR.alt_itm_typ(isR.alt_itm_typ());
					opeDtlInptR.alt_alloc_prio(isR.alt_alloc_prio());
					opeDtlInptR.alt_itm_ratio(isR.alt_itm_ratio());
					opeDtlInptR.itm_mfg_inst_no(isR.itm_mfg_inst_no());
					opeDtlInptR.mfg_inst_no(isR.mfg_inst_no());
					opeDtlInptR.oper_inst_no(isR.oper_inst_no());
					opeDtlInptR.inpt_schd_no(isR.inpt_schd_no());
					opeDtlInptR.old_mfg_sts_typ(isR.getStringNE("mfg_sts_typ"));
					opeDtlInptR.disp_seq(isR.disp_seq());
					opeDtlInptR.disp_seq_upd_flg(false);
					opeDtlInptR.xfr_inst_err_flg(false);
					
					opeDtlInptL.add(opeDtlInptR);
				}
			}
			setPegNo(opeDtlInptL);
		}
		
		protected void setInstUpdYieldConatiner(
				MCList<MfgInstReg_Upd01_DtlOperR> opeDtlOperL,
				MCList<MfgInstReg_Upd01_DtlYieldR> opeDtlYieldL) {
			MSVT_YIELD_SCHD_PR_R t2 = MSVT_YIELD_SCHD_PR_R.create("T2");
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			ysL_bldr.addSelect(t2.mfg_sts_typ);
			ysL.addBooleanColumn("stk_lst_prnt_flg");
			ysL_bldr.addSelect(t2.stk_lst_prnt_flg);
			ysL_bldr.addInnerJoin(t2, bracket( t.yield_schd_no.eq(t2.yield_schd_no)));
			ysL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6120_MST_YIELD_SCHD_S03", ysL, ysL_bldr, opeDtlOperL);
			
			MCIndexKey idxkey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			for (MfgInstReg_Upd01_DtlOperR opeDtlOperR : opeDtlOperL) {
				// 出来高予定は１件の想定
				MST_YIELD_SCHD_R ysR = ysL.getFirst(idxkey, opeDtlOperR.oper_inst_no());
				MfgInstReg_Upd01_DtlYieldR opeDtlYieldR = MfgInstReg_Upd01_DtlYieldR.create();
				opeDtlYieldR.setAttributes(opeDtlOperR);
				opeDtlYieldR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				opeDtlYieldR.inst_abort_flg(false);
				opeDtlYieldR.old_inst_abort_flg(true);
				opeDtlYieldR.hdr_peg_no(opeDtlOperR.hdr_peg_no());
				opeDtlYieldR.oper_peg_no(opeDtlOperR.peg_no());
				opeDtlYieldR.mfg_sts_typ(opeDtlOperR.mfg_sts_typ());
				
				opeDtlYieldR.itm_cd(ysR.itm_cd());
				opeDtlYieldR.itm_sub1(ysR.itm_sub1());
				opeDtlYieldR.itm_sub2(ysR.itm_sub2());
				opeDtlYieldR.itm_sub3(ysR.itm_sub3());
				opeDtlYieldR.sno1(ysR.sno1());
				opeDtlYieldR.sno2(ysR.sno2());
				opeDtlYieldR.sno3(ysR.sno3());
				opeDtlYieldR.sno4(ysR.sno4());
				opeDtlYieldR.trd_unit_cd(ysR.trd_unit_cd());
				opeDtlYieldR.trd_unit_yield_qty(ysR.trd_unit_yield_qty());
				opeDtlYieldR.base_unit_cd(ysR.base_unit_cd());
				opeDtlYieldR.base_unit_yield_qty(ysR.base_unit_yield_qty());
				opeDtlYieldR.schd_tm(ysR.schd_tm());
				opeDtlYieldR.strg_loc_cd(ysR.strg_loc_cd());
				opeDtlYieldR.strg_str_ln_cd(ysR.strg_str_ln_cd());
				opeDtlYieldR.intr_rmrks(ysR.intr_rmrks());
				opeDtlYieldR.inst_rpt_rmrks(ysR.inst_rpt_rmrks());
				opeDtlYieldR.insp_cnt_rmrks(ysR.insp_cnt_rmrks());
				opeDtlYieldR.stk_lst_prnt_flg(ysR.getBooleanNE("stk_lst_prnt_flg"));
				opeDtlYieldR.sub_char1(ysR.sub_char1());
				opeDtlYieldR.sub_char2(ysR.sub_char2());
				opeDtlYieldR.sub_char3(ysR.sub_char3());
				opeDtlYieldR.itm_mfg_inst_no(ysR.itm_mfg_inst_no());
				opeDtlYieldR.mfg_inst_no(ysR.mfg_inst_no());
				opeDtlYieldR.oper_inst_no(ysR.oper_inst_no());
				opeDtlYieldR.yield_schd_no(ysR.yield_schd_no());
				opeDtlYieldR.old_mfg_sts_typ(ysR.getStringNE("mfg_sts_typ"));
				opeDtlYieldR.disp_seq(ysR.disp_seq());
				
				opeDtlYieldL.add(opeDtlYieldR);
			}
			setPegNo(opeDtlYieldL);
		}

	}

	//FMCB CUSTOM END
}