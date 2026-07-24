package mcframe.serverMSBD.MSBDL5290;

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
import mcframe.serverMSBD.MSBDL5290.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5100.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;

import java.util.ArrayList;
import java.util.List;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoBulkRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoBulkRegService_MC extends MSBDL_PoBulkRegService_MC_A{
	//FMCB CUSTOM START
	String _sysParm = getSysParm("MASTER_DT_BASE");
	/** 部門情報キャッシュ */
	protected CacheSpplPurcDpt _cacheSpplPurcDpt = null;
	/** 発注予定キャッシュ */
	protected CachePoSchd _cachePoSchd = null;

	/**
	 * 部門マスタキャッシュ（発注先担当マスタの購買担当者に対応する部門情報のキャッシュ）
	 */
	protected class CacheSpplPurcDpt {
		MCList<MAM_USR_ACL_R> _aclL = MCList.create(MAM_USR_ACL_R.class);
		MCIndexKey _idxAclL = null;

		public CacheSpplPurcDpt(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			createCache(trgtL);
		}
		public void createCache(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			_aclL.addStringColumn("wg_cd");
			MAM_USR_ACL_R aclL_t = MAM_USR_ACL_R.create("T");
			MCQueryApiBuilder aclL_bldr = MCQueryApiBuilder.create(aclL_t);
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			aclL_bldr.addSelect(m1.wg_cd);
			aclL_bldr.addInnerJoin(m1, aclL_t.dpt_cd.eq(m1.dpt_cd)
							.and(m1.purc_dpt_flg.eq(value(true)))
							.and(bind("today").between(m1.st_dt, m1.end_dt)));
			aclL_bldr.addWhereWithAnd(aclL_t.usr_cd.eq(bind("purc_usr_cd")));
			aclL_bldr.addWhereWithAnd(bind("today").between(aclL_t.st_dt, aclL_t.end_dt));
			aclL_bldr.addWhereWithAnd(aclL_t.del_flg.eq(value(false)));
			aclL_bldr.addWhereWithAnd(m1.del_flg.eq(value(false)));
			dbSelect("MSBDL5290_MAM_USR_ACL_S01", _aclL, aclL_bldr, trgtL);
			_idxAclL = _aclL.createIndex(MAM_USR_ACL_R.$usr_cd);
		}

		/**
		 * 発注先担当マスタの購買担当者に対応する部門情報を取得します
		 * @param purcUsrCd
		 * @return
		 */
		protected MAM_USR_ACL_R getCacheSpplPurcDpt(String purcUsrCd) {
			MAM_USR_ACL_R aclR = _aclL.getFirst(_idxAclL, purcUsrCd);
			if (isNull(aclR)) {
				aclR = MAM_USR_ACL_R.create();
			}
			return aclR;
		}
	}
	/**
	 * 発注先担当マスタの購買担当者に対応する部門マスタのキャッシュを作成します
	 * @param trgtL
	 */
	protected void initCacheSpplPurcDpt(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
		_cacheSpplPurcDpt = new CacheSpplPurcDpt(trgtL);
	}
	/**
	 * 部門マスタキャッシュ（発注先担当マスタの購買担当者に対応する部門情報）を取得します
	 * @param purcUsrCd
	 * @return
	 */
	protected MAM_USR_ACL_R getCacheSpplPurcDpt(String purcUsrCd) {
		return _cacheSpplPurcDpt.getCacheSpplPurcDpt(purcUsrCd);
	}

	/**
	 * 発注予定キャッシュ
	 */
	public class CachePoSchd {

		MCList<PoBulkReg_Chk01_DtlR> _cachePoSchdL = MCList.create(PoBulkReg_Chk01_DtlR.class);

		public CachePoSchd(PoBulkReg_Chk01_CndR cndR) {
			getPoSchd(cndR);
		}
		/**
		 * 処理対象の発注予定をキャッシュします。
		 * @param cnd
		 */
		protected void getPoSchd(PoBulkReg_Chk01_CndR cnd) {
			// 処理対象の候補を検索
			MCList<MST_PO_SCHD_R> tgtPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder tgtPoSchdL_bldr = MCQueryApiBuilder.create(t1);
			tgtPoSchdL_bldr.setSelect(t1.po_schd_no);
			tgtPoSchdL_bldr.setWhere(t1.po_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
			tgtPoSchdL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			tgtPoSchdL_bldr.addWhereWithAnd(t1.abort_flg.eq(value(false)));
			tgtPoSchdL_bldr.addWhereWithAnd(t1.sppl_cd.isNotNull());
			tgtPoSchdL_bldr.addWhereWithAnd(t1.trd_cur_cd.isNotNull());
			tgtPoSchdL_bldr.addWhereWithAnd(t1.purc_upri_req_typ.isNotNull());

			if (!isNull(cnd.po_schd_dt_fr())) {
				tgtPoSchdL_bldr.addWhereWithAnd(t1.po_schd_dt.gte(bind("1")), cnd.po_schd_dt_fr());
			}
			if (isNull(cnd.po_schd_dt_to())) {
				tgtPoSchdL_bldr.addWhereWithAnd(t1.po_schd_dt.lte(bind("1")), getToday());
			}
			else {
				tgtPoSchdL_bldr.addWhereWithAnd(t1.po_schd_dt.lte(bind("1")), cnd.po_schd_dt_to());
			}

			if (!isNull(cnd.wg_cd())) {
				tgtPoSchdL_bldr.addWhereWithAnd(t1.wg_cd.eq(bind("1")), cnd.wg_cd());
			}

			if (!isNull(cnd.sppl_cd())) {
				tgtPoSchdL_bldr.addWhereWithAnd(t1.sppl_cd.eq(bind("1")), cnd.sppl_cd());
			}
			dbSelect("MSBDL5290_MST_PO_SCHD_S01", tgtPoSchdL, tgtPoSchdL_bldr);

			dbWkDelete("MSBDL5290_MSW_PO_SCHD_D01", tgtPoSchdL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5290_MSW_PO_SCHD_I01", tgtPoSchdL, tgtPoSchdL_bldr.getBaseDbc());

			MSW_PO_SCHD_KEY_R wk = MSW_PO_SCHD_KEY_R.create("WK");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MAM_ITM_DTL_R itm_dtl = MAM_ITM_DTL_R.create("ITM_DTL");
			// 購買品
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t2 = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t2);
			poSchdL.addStringColumn("purc_id_typ");
			poSchdL.addStringColumn("purc_basis_typ");
			poSchdL.addStringColumn("outsrc_sppl_cd");
			poSchdL.addStringColumn("in_to_loc_wg_cd");

			poSchdL_bldr.addSelect(itm_dtl.purc_id_typ);
			poSchdL_bldr.addSelect(itm_dtl.purc_basis_typ);
			poSchdL_bldr.addSelect(loc.sppl_cd.as("outsrc_sppl_cd"));
			poSchdL_bldr.addSelect(loc.wg_cd.as("in_to_loc_wg_cd"));
			poSchdL_bldr.addInnerJoin(wk, bracket(t2.po_schd_no.eq(wk.po_schd_no)));
			poSchdL_bldr.addInnerJoin(loc, bracket(t2.in_to_loc_cd.eq(loc.loc_cd)));
			
			if (isSame(_sysParm, "1")) {
				poSchdL_bldr.addInnerJoin(itm_dtl, bracket(t2.itm_cd.eq(itm_dtl.itm_cd)
						.and(t2.itm_sub1.eq(itm_dtl.itm_sub1))
						.and(t2.itm_sub2.eq(itm_dtl.itm_sub2))
						.and(t2.itm_sub3.eq(itm_dtl.itm_sub3))
						.and(itm_dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(t2.sppl_cd.eq(itm_dtl.sppl_cd))
						.and(t2.maker_cd.eq(itm_dtl.maker_cd))
						.and(itm_dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(loc.wg_cd.eq(itm_dtl.wg_cd))
						.and(t2.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
						.and(t2.rqst_avl_rqst_dt.between(itm_dtl.st_dt, itm_dtl.end_dt))
						.and(itm_dtl.po_batch_flg.eq(value(true)))));
			}
			else {
				poSchdL_bldr.addInnerJoin(itm_dtl, bracket(t2.itm_cd.eq(itm_dtl.itm_cd)
						.and(t2.itm_sub1.eq(itm_dtl.itm_sub1))
						.and(t2.itm_sub2.eq(itm_dtl.itm_sub2))
						.and(t2.itm_sub3.eq(itm_dtl.itm_sub3))
						.and(itm_dtl.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(t2.sppl_cd.eq(itm_dtl.sppl_cd))
						.and(t2.maker_cd.eq(itm_dtl.maker_cd))
						.and(itm_dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(loc.wg_cd.eq(itm_dtl.wg_cd))
						.and(t2.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
						.and(t2.po_schd_dt.between(itm_dtl.st_dt, itm_dtl.end_dt))
						.and(itm_dtl.po_batch_flg.eq(value(true)))));
			}
			poSchdL_bldr.addWhereWithAnd(t2.outsrc_flg.eq(value(false)));
			poSchdL_bldr.setOrderByAsc(t2.po_schd_no);
			dbSelect("MSBDL5290_MST_PO_SCHD_S02", poSchdL, poSchdL_bldr);

			// 外注品
			MCList<MST_PO_SCHD_R> outsrcPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t3 = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder outsrcPoSchdL_bldr = MCQueryApiBuilder.create(t3);
			outsrcPoSchdL.addStringColumn("purc_id_typ");
			outsrcPoSchdL.addStringColumn("purc_basis_typ");
			outsrcPoSchdL.addStringColumn("outsrc_sppl_cd");
			outsrcPoSchdL.addStringColumn("in_to_loc_wg_cd");

			outsrcPoSchdL_bldr.addSelect(itm_dtl.purc_id_typ);
			outsrcPoSchdL_bldr.addSelect(itm_dtl.purc_basis_typ);
			outsrcPoSchdL_bldr.addSelect(loc.sppl_cd.as("outsrc_sppl_cd"));
			outsrcPoSchdL_bldr.addSelect(loc.wg_cd.as("in_to_loc_wg_cd"));
			outsrcPoSchdL_bldr.addInnerJoin(wk, bracket(t3.po_schd_no.eq(wk.po_schd_no)));
			outsrcPoSchdL_bldr.addInnerJoin(loc, bracket(t3.in_to_loc_cd.eq(loc.loc_cd)));
			
			if (isSame(_sysParm, "1")) {
				outsrcPoSchdL_bldr.addInnerJoin(itm_dtl, bracket(t3.itm_cd.eq(itm_dtl.itm_cd)
						.and(t3.itm_sub1.eq(itm_dtl.itm_sub1))
						.and(t3.itm_sub2.eq(itm_dtl.itm_sub2))
						.and(t3.itm_sub3.eq(itm_dtl.itm_sub3))
						.and(t3.mfg_loc_cd.eq(itm_dtl.mfg_loc_cd))
						.and(itm_dtl.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(itm_dtl.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(itm_dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(loc.wg_cd.eq(itm_dtl.wg_cd))
						.and(t3.bom_ptn.eq(itm_dtl.bom_ptn))
						.and(t3.rqst_avl_rqst_dt.between(itm_dtl.st_dt, itm_dtl.end_dt))
						.and(itm_dtl.po_batch_flg.eq(value(true)))));
			}
			else {
				outsrcPoSchdL_bldr.addInnerJoin(itm_dtl, bracket(t3.itm_cd.eq(itm_dtl.itm_cd)
						.and(t3.itm_sub1.eq(itm_dtl.itm_sub1))
						.and(t3.itm_sub2.eq(itm_dtl.itm_sub2))
						.and(t3.itm_sub3.eq(itm_dtl.itm_sub3))
						.and(t3.mfg_loc_cd.eq(itm_dtl.mfg_loc_cd))
						.and(itm_dtl.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(itm_dtl.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(itm_dtl.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(loc.wg_cd.eq(itm_dtl.wg_cd))
						.and(t3.bom_ptn.eq(itm_dtl.bom_ptn))
						.and(t3.po_schd_dt.between(itm_dtl.st_dt, itm_dtl.end_dt))
						.and(itm_dtl.po_batch_flg.eq(value(true)))));
			}
			outsrcPoSchdL_bldr.addWhereWithAnd(t3.outsrc_flg.eq(value(true)));
			outsrcPoSchdL_bldr.setOrderByAsc(t3.po_schd_no);
			dbSelect("MSBDL5290_MST_PO_SCHD_S03", outsrcPoSchdL, outsrcPoSchdL_bldr);

			poSchdL.addAll(outsrcPoSchdL);

			MCList<PoBulkReg_Chk01_DtlR> dtlL = MCList.create(PoBulkReg_Chk01_DtlR.class);
			addAll(dtlL, poSchdL, createMap_PoBulkReg_Chk01_DtlR_MST_PO_SCHD_R());

			_cachePoSchdL = dtlL;
		}
		/**
		 * 処理対象の発注予定キャッシュを取得します。
		 * @return
		 */
		protected MCList<PoBulkReg_Chk01_DtlR>  getCachePoSchd() {
			return _cachePoSchdL;
		}

		protected Map_PoBulkReg_Chk01_DtlR_MST_PO_SCHD_R<PoBulkReg_Chk01_DtlR,MST_PO_SCHD_R> createMap_PoBulkReg_Chk01_DtlR_MST_PO_SCHD_R() {
			return new Map_PoBulkReg_Chk01_DtlR_MST_PO_SCHD_R<PoBulkReg_Chk01_DtlR, MST_PO_SCHD_R>();
		}

		public class Map_PoBulkReg_Chk01_DtlR_MST_PO_SCHD_R<D extends PoBulkReg_Chk01_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$po_schd_no, MST_PO_SCHD_R.$po_schd_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$io_schd_pr_no, MST_PO_SCHD_R.$io_schd_pr_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cd, MST_PO_SCHD_R.$trd_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_ptn_typ, MST_PO_SCHD_R.$trd_ptn_typ);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$itm_cd, MST_PO_SCHD_R.$itm_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$itm_sub1, MST_PO_SCHD_R.$itm_sub1);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$itm_sub2, MST_PO_SCHD_R.$itm_sub2);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$itm_sub3, MST_PO_SCHD_R.$itm_sub3);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$itm_nm, MST_PO_SCHD_R.$itm_nm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$iv_itm_nm, MST_PO_SCHD_R.$iv_itm_nm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sppl_itm_cd, MST_PO_SCHD_R.$sppl_itm_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sppl_itm_nm, MST_PO_SCHD_R.$sppl_itm_nm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sundry_itm_flg, MST_PO_SCHD_R.$sundry_itm_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sno1, MST_PO_SCHD_R.$sno1);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sno2, MST_PO_SCHD_R.$sno2);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sno3, MST_PO_SCHD_R.$sno3);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sno4, MST_PO_SCHD_R.$sno4);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$purc_rsn_cd, MST_PO_SCHD_R.$purc_rsn_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$in_to_loc_cd, MST_PO_SCHD_R.$in_to_loc_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$str_ln_cd, MST_PO_SCHD_R.$str_ln_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$ver_no, MST_PO_SCHD_R.$ver_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_cd, MST_PO_SCHD_R.$dlv_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_sundry_flg, MST_PO_SCHD_R.$dlv_sundry_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_nm, MST_PO_SCHD_R.$dlv_nm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_cntct_dpt, MST_PO_SCHD_R.$dlv_cntct_dpt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_cntct_psn, MST_PO_SCHD_R.$dlv_cntct_psn);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_zip_cd, MST_PO_SCHD_R.$dlv_zip_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_addr1, MST_PO_SCHD_R.$dlv_addr1);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_addr2, MST_PO_SCHD_R.$dlv_addr2);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_addr3, MST_PO_SCHD_R.$dlv_addr3);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_addr4, MST_PO_SCHD_R.$dlv_addr4);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_tel, MST_PO_SCHD_R.$dlv_tel);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_fax, MST_PO_SCHD_R.$dlv_fax);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_cd, MST_PO_SCHD_R.$tdlv_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_sundry_flg, MST_PO_SCHD_R.$tdlv_sundry_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_nm, MST_PO_SCHD_R.$tdlv_nm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_cntct_dpt, MST_PO_SCHD_R.$tdlv_cntct_dpt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_cntct_psn, MST_PO_SCHD_R.$tdlv_cntct_psn);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_zip_cd, MST_PO_SCHD_R.$tdlv_zip_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_addr1, MST_PO_SCHD_R.$tdlv_addr1);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_addr2, MST_PO_SCHD_R.$tdlv_addr2);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_addr3, MST_PO_SCHD_R.$tdlv_addr3);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_addr4, MST_PO_SCHD_R.$tdlv_addr4);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_tel, MST_PO_SCHD_R.$tdlv_tel);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tdlv_fax, MST_PO_SCHD_R.$tdlv_fax);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$wg_cd, MST_PO_SCHD_R.$wg_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$sppl_cd, MST_PO_SCHD_R.$sppl_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$maker_cd, MST_PO_SCHD_R.$maker_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$purc_usr_cd, MST_PO_SCHD_R.$purc_usr_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$purc_dpt_cd, MST_PO_SCHD_R.$purc_dpt_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$outsrc_flg, MST_PO_SCHD_R.$outsrc_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$outsrc_itm_ord_no, MST_PO_SCHD_R.$outsrc_itm_ord_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$mfg_loc_cd, MST_PO_SCHD_R.$mfg_loc_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bom_ptn, MST_PO_SCHD_R.$bom_ptn);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_unit_qty, MST_PO_SCHD_R.$trd_unit_qty);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_unit_cd, MST_PO_SCHD_R.$trd_unit_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$base_unit_qty, MST_PO_SCHD_R.$base_unit_qty);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$base_unit_cd, MST_PO_SCHD_R.$base_unit_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$purc_upri_req_typ, MST_PO_SCHD_R.$purc_upri_req_typ);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_cd, MST_PO_SCHD_R.$trd_cur_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$tax_cd, MST_PO_SCHD_R.$tax_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$xrate_inpt_flg, MST_PO_SCHD_R.$xrate_inpt_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$xrate, MST_PO_SCHD_R.$xrate);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$ptax_xrate, MST_PO_SCHD_R.$ptax_xrate);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$ptax_xrate_inpt_flg, MST_PO_SCHD_R.$ptax_xrate_inpt_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$upri_not_tgt_flg, MST_PO_SCHD_R.$upri_not_tgt_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$interim_flg, MST_PO_SCHD_R.$interim_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_upri, MST_PO_SCHD_R.$trd_cur_upri);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_proc_upri, MST_PO_SCHD_R.$trd_cur_proc_upri);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_onr_prov_upri, MST_PO_SCHD_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_amt, MST_PO_SCHD_R.$trd_cur_amt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_proc_amt, MST_PO_SCHD_R.$trd_cur_proc_amt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_onr_prov_amt, MST_PO_SCHD_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$trd_cur_tax_amt, MST_PO_SCHD_R.$trd_cur_tax_amt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$po_schd_dt, MST_PO_SCHD_R.$po_schd_dt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$dlv_rqst_tm, MST_PO_SCHD_R.$dlv_rqst_tm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$rqst_dlv_rqst_tm, MST_PO_SCHD_R.$rqst_dlv_rqst_tm);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$rqst_avl_rqst_dt, MST_PO_SCHD_R.$rqst_avl_rqst_dt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$purc_schd_dt, MST_PO_SCHD_R.$purc_schd_dt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$purc_lt, MST_PO_SCHD_R.$purc_lt);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$drct_dlv_typ, MST_PO_SCHD_R.$drct_dlv_typ);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$rqst_crrct_flg, MST_PO_SCHD_R.$rqst_crrct_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_itm_cd, MST_PO_SCHD_R.$bd_itm_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_itm_sub1, MST_PO_SCHD_R.$bd_itm_sub1);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_itm_sub2, MST_PO_SCHD_R.$bd_itm_sub2);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_itm_sub3, MST_PO_SCHD_R.$bd_itm_sub3);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_sno1, MST_PO_SCHD_R.$bd_sno1);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_sno2, MST_PO_SCHD_R.$bd_sno2);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_sno3, MST_PO_SCHD_R.$bd_sno3);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_sno4, MST_PO_SCHD_R.$bd_sno4);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_lot_no, MST_PO_SCHD_R.$bd_lot_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_sublot_no, MST_PO_SCHD_R.$bd_sublot_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_loc_cd, MST_PO_SCHD_R.$bd_loc_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_dpt_cd, MST_PO_SCHD_R.$bd_dpt_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_wg_cd, MST_PO_SCHD_R.$bd_wg_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_ctg_cd, MST_PO_SCHD_R.$bd_ctg_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_oper_cd, MST_PO_SCHD_R.$bd_oper_cd);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_slo_no, MST_PO_SCHD_R.$bd_slo_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_iv_no, MST_PO_SCHD_R.$bd_iv_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$bd_po_no, MST_PO_SCHD_R.$bd_po_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$slo_no, MST_PO_SCHD_R.$slo_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$slo_d_no, MST_PO_SCHD_R.$slo_d_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$po_no, MST_PO_SCHD_R.$po_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$po_d_no, MST_PO_SCHD_R.$po_d_no);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$rqst_can_flg, MST_PO_SCHD_R.$rqst_can_flg);
				addColumnPathMap(PoBulkReg_Chk01_DtlR.$upd_cntr, MST_PO_SCHD_R.$upd_cntr);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.purc_id_typ(src.getStringNE("purc_id_typ"));
				dest.purc_basis_typ(src.getStringNE("purc_basis_typ"));
				dest.outsrc_sppl_cd(src.getStringNE("outsrc_sppl_cd"));
				dest.in_to_loc_wg_cd(src.getStringNE("in_to_loc_wg_cd"));
			}
		}
	}
	/**
	 * 発注予定キャッシュを作成します。
	 * @param cndR
	 */
	protected void initCachePoSchd(PoBulkReg_Chk01_CndR cndR) {
		_cachePoSchd = new CachePoSchd(cndR);
	}
	/**
	 * 発注予定キャッシュを取得します。
	 * @return
	 */
	protected MCList<PoBulkReg_Chk01_DtlR>  getCachePoSchd() {
		return _cachePoSchd.getCachePoSchd();
	}

	/**
	 * PoBulkReg_Ins01オペレーション.<p>
	 *
	 * 発注を一括で登録する<br>
	 */
	public class PoBulkReg_Ins01 extends MSBDL_PoBulkRegService_MC_A.PoBulkReg_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisChk01();
			setAllErr(up0(), up1());
			callPoBulkRegIns02();
		}
		/**
		 * チェック処理を実行します。
		 */
		protected void callThisChk01() {
			MSBDL_PoBulkRegService.PoBulkReg_Chk01 ope = MSBDL_PoBulkRegService.crtPoBulkReg_Chk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			up1().setAll(ope.down0());
			MCRow.copyall(down0(), ope.down1());
		}

		/**
		 * 発注一括登録処理（メイン処理）を実行します。
		 */
		protected void callPoBulkRegIns02() {
			List<MSBDL_PoBulkRegService.PoBulkReg_Ins02> opeL = new ArrayList<>();
			MCList<PoBulkReg_Chk01_DtlR> trgtL = getChkList(up1());
			MCList<PoBulkReg_Chk01_DtlR>[] grpL = trgtL.groupList(PoBulkReg_Chk01_DtlR.$hdr_peg_no);
			for (MCList<PoBulkReg_Chk01_DtlR> tmpL : grpL) {
				MSBDL_PoBulkRegService.PoBulkReg_Ins02 ope = MSBDL_PoBulkRegService.crtPoBulkReg_Ins02();
				MCRow.copyall(ope.up0(), up0());
				ope.up1().addAll(tmpL);
				opeL.add(ope);
			}
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				else {
					MCServerThreadManager.setCommitAndRollback(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			for (MSBDL_PoBulkRegService.PoBulkReg_Ins02 ope : opeL) {
				copyErrFlg(up1(), ope.down0());
				String[] destCols = {PoBulkReg_Chk01_DtlR.$po_d_no};
				String[] srcCols = {PoBulkReg_Chk01_DtlR.$po_d_no};
				copyByPegNo(up1(), destCols, ope.down0(), srcCols);
			}
			
			insBatchLog(up1());
			
			MCList<PoBulkReg_Chk01_DtlR> okL = up1().subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!isNull(row.po_d_no())) {
						return true;
					}
					return false;
				}
			});
			down0().po_schd_success_cnt(okL.size());
			down0().po_schd_error_cnt(down0().total_cnt().subtract(down0().po_schd_success_cnt()));
		}
		
		/**
		 * バッチログをバッチ結果テーブルに書き込みます。
		 */
		protected void insBatchLog(MCList<PoBulkReg_Chk01_DtlR> up1L) {
			MCList<MST_PO_REG_BR_R> brL = MCList.create(MST_PO_REG_BR_R.class);
			for (PoBulkReg_Chk01_DtlR up1 : up1L) {
				MST_PO_REG_BR_R brR = MST_PO_REG_BR_R.create();
				brR.batch_data_no(up1.batch_data_no());
				brR.batch_log_no(up1.batch_log_no());
				brR.log_sub_key1(up1.log_sub_key1());
				brR.log_sub_key2(up1.log_sub_key2());
				brR.po_schd_no(up1.po_schd_no());
				brR.wg_cd(up1.wg_cd());
				brR.sppl_cd(up1.sppl_cd());
				brR.itm_cd(up1.itm_cd());
				brR.itm_sub1(up1.itm_sub1());
				brR.itm_sub2(up1.itm_sub2());
				brR.itm_sub3(up1.itm_sub3());
				brR.itm_nm(up1.itm_nm());
				brR.po_schd_dt(up1.po_schd_dt());
				brR.dlv_rqst_tm(up1.dlv_rqst_tm());

				if (up1.err_flg()) {
					brR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
				}
				else {
					brR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}

				brL.add(brR);
			}

			if (!brL.isEmpty()) {
				dbInsert("MSBDL5290_MST_PO_REG_BR_I01", brL,
						MCQueryApiBuilder.create(MST_PO_REG_BR_R.create("T")));
			}
		}
	}
	/**
	 * PoBulkReg_Chk01オペレーション.<p>
	 *
	 * 登録前チェック<br>
	 */
	public class PoBulkReg_Chk01 extends MSBDL_PoBulkRegService_MC_A.PoBulkReg_Chk01 {
		/** 明細ブロック */
		static final int IDX_DTL = 1;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCachePoSchd(up0()); 
			
			up1().addAll(getCachePoSchd());

			// 行インデックスを発番（エラーＦＬＧを設定する際に利用する）
			int paramIdx = 1;
			int paramRowIdx = 0;
			for (PoBulkReg_Chk01_DtlR r : up1()) {
				r.setParamIndex(paramIdx);
				r.setParamRowIndex(paramRowIdx);
				paramRowIdx++;
			}

			addTmpCol();

			setPegNo(up1());
			
			setLogKey(up1());
			
			super.doIt();
			
			setDown();
		}
		
		/**
		 * ログキーをセットします。
		 */
		protected void setLogKey(MCList<PoBulkReg_Chk01_DtlR> up1L) {
			doSeqCache(MAC_NUM_SYS_TYP.BATCH_DATA, up1L.size());
			for (PoBulkReg_Chk01_DtlR up1 : up1L) {
				up1.batch_data_no(getStrSeq(MAC_NUM_SYS_TYP.BATCH_DATA));
			}
			
			logger().setLogKey(up1L,
					PoBulkReg_Chk01_DtlR.$batch_log_no,
					PoBulkReg_Chk01_DtlR.$log_sub_key1,
					PoBulkReg_Chk01_DtlR.$log_sub_key2);
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().addAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			up1().setValue(PoBulkReg_Chk01_DtlR.$po_dt, getToday());
			
			setPurcUpriReqBaseDt();
			
			setTax();
			
			createCache();
			
			setSloD();
			
			down1().total_cnt(up1().size());
			return msgL;
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, IDX_DTL)) {
				PoBulkReg_Chk01_DtlR r = (PoBulkReg_Chk01_DtlR)row;
				if (isSame(column, PoBulkReg_Chk01_DtlR.$purc_dpt_cd)
						|| isSame(column, PoBulkReg_Chk01_DtlR.$purc_usr_cd)) {
					// 購買部門セット（発注予定に設定されている値を優先）
					if (!isNull(r.purc_dpt_cd())) {
						return false;
					}
				}
				if (isSame(column, PoBulkReg_Chk01_DtlR.$pay_crryovr_times)) {
					// 支払繰越回数（品目マスタからの補完を優先）
					if (!isNull(r.pay_crryovr_times())) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			cmpl();
			chk(msgL);
			// 値引品目チェック（チェック処理の一番最後に行う必要がある）
			dscntItmChk(msgL);
			return msgL;
		}

		/**
		 * 一時カラムを追加します。
		 */
		protected void addTmpCol() {
			up1().addStringColumn("if_proc_typ", MAC_IF_PROC_TYP.PO_SEND.value());
			up1().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up1().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			up1().addStringColumn("xrate_cd", getCo().purc_xrate_cd());
			up1().addStringColumn("xrate_rnd_typ", getCo().xrate_rnd_typ());
			up1().addStringColumn("wtax_rnd_typ", getCo().wtax_rnd_typ());
			up1().addNumberColumn("trd_cur_amt_dec_place");
			up1().addDateColumn("today", getToday());
		}

		/**
		 * テーブルキャッシュ
		 */
		protected void createCache() {
			cacheTax();
			cacheEdiIfCtl();
			cacheBpStop();
			cacheItmStop();
			cacheSlo();
			cacheSloD();
			cachePo();
			cacheRcptIv();
			cacheWrkSno();
			cacheItm();
			cacheSundryItm();
		}

		/**
		 * キャッシュ（税マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax;
		protected void cacheTax() {
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$tax_cd);
		}

		/**
		 * キャッシュ（ＥＤＩＩＦ制御マスタ）
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R> _cacheEdiIf;
		protected void cacheEdiIfCtl() {
			_cacheEdiIf = new FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R>(
					MCQueryApiBuilder.create(MAM_EDI_IF_CTL_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$sppl_cd, "if_proc_typ");
		}

		/**
		 * キャッシュ（取引先禁止マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _cacheBpStop;
		protected void cacheBpStop() {
			_cacheBpStop = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
					MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$sppl_cd);
		}

		/**
		 * キャッシュ（品目禁止マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _cacheItmStop;
		protected void cacheItmStop() {
			_cacheItmStop = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
					MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_sub1,
					PoBulkReg_Chk01_DtlR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub3);
		}

		/**
		 * キャッシュ（受注ヘッダ）
		 */
		protected FXUCL_MCDbcCache<MST_SLO_R> _cacheSlo;
		protected void cacheSlo() {
			_cacheSlo = new FXUCL_MCDbcCache<MST_SLO_R>(
					MCQueryApiBuilder.create(MST_SLO_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$bd_slo_no);
		}

		/**
		 * キャッシュ（受注明細）
		 */
		protected FXUCL_MCDbcCache<MST_SLO_D_R> _cacheSloD;
		protected void cacheSloD() {
			_cacheSloD = new FXUCL_MCDbcCache<MST_SLO_D_R>(
					MCQueryApiBuilder.create(MST_SLO_D_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$slo_d_no);
		}

		/**
		 * キャッシュ（発注ヘッダ）
		 */
		protected FXUCL_MCDbcCache<MST_PO_R> _cachePo;
		protected void cachePo() {
			_cachePo = new FXUCL_MCDbcCache<MST_PO_R>(
					MCQueryApiBuilder.create(MST_PO_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$bd_po_no);
		}

		/**
		 * キャッシュ（受領インボイス）
		 */
		protected FXUCL_MCDbcCache<MST_RCPT_IV_R> _cacheIv;
		protected void cacheRcptIv() {
			_cacheIv = new FXUCL_MCDbcCache<MST_RCPT_IV_R>(
					MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$bd_iv_no);
		}

		/**
		 * キャッシュ（案件手配紐付情報）
		 */
		protected FXUCL_MCDbcCache<MST_WRK_SNO_R> _cacheWrkSno;
		protected void cacheWrkSno() {
			_cacheWrkSno = new FXUCL_MCDbcCache<MST_WRK_SNO_R>(
					MCQueryApiBuilder.create(MST_WRK_SNO_R.create("T")), up1(),
					PoBulkReg_Chk01_DtlR.$sno1);
		}

		/**
		 * キャッシュ（品目マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		protected void cacheItm() {
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T"))
					, up1()
					, PoBulkReg_Chk01_DtlR.$itm_cd
					, PoBulkReg_Chk01_DtlR.$itm_sub1
					, PoBulkReg_Chk01_DtlR.$itm_sub2
					, PoBulkReg_Chk01_DtlR.$itm_sub3
					);
		}

		/**
		 * キャッシュ（諸口品マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _cacheSundry;
		protected void cacheSundryItm() {
			_cacheSundry = 	new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(
					MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"))
					, up1()
					, PoBulkReg_Chk01_DtlR.$itm_cd
					, PoBulkReg_Chk01_DtlR.$itm_sub1
					, PoBulkReg_Chk01_DtlR.$itm_sub2
					, PoBulkReg_Chk01_DtlR.$itm_sub3
					, PoBulkReg_Chk01_DtlR.$sno1
					, PoBulkReg_Chk01_DtlR.$sno2
					, PoBulkReg_Chk01_DtlR.$sno3
					, PoBulkReg_Chk01_DtlR.$sno4);
		}

		/**
		 * キャッシュ（品目マスタ（ロケール別情報））
		 * @param trgtL
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl;
		protected void cacheItmLcl(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			_cacheItmLcl = 	new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(
					MCQueryApiBuilder.create(MAM_ITM_LCL_R.create("T"))
					, trgtL
					, PoBulkReg_Chk01_DtlR.$itm_cd
					, PoBulkReg_Chk01_DtlR.$itm_sub1
					, PoBulkReg_Chk01_DtlR.$itm_sub2
					, PoBulkReg_Chk01_DtlR.$itm_sub3
					, PoBulkReg_Chk01_DtlR.$prnt_lcl_cd);
		}
		/**
		 * キャッシュ（部門マスタ）
		 * @param trgtL
		 */
		protected void cacheDpt(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> subL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!isNull(row.purc_usr_cd()) && isNull(row.purc_dpt_cd())) {
						return true;
					}
					return false;
				}
			});
			initCacheSpplPurcDpt(subL);
		}

		/**
		 * キャッシュ作成（品目詳細マスタ）
		 */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl;
		protected MCIndexKey _idxItmDtlCache;
		protected void createItmDtlCache() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			MCList<PoBulkReg_Chk01_DtlR> bindL = up1().groupBy(
					PoBulkReg_Chk01_DtlR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_sub1,
					PoBulkReg_Chk01_DtlR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub3,
					PoBulkReg_Chk01_DtlR.$in_to_loc_wg_cd, PoBulkReg_Chk01_DtlR.$po_schd_dt);
			bindL.setStringNE("mfg_loc_cd", MAC_STR.NULL_VAL.value());
			bindL.addStringColumn("rqst_loc_cd", MAC_STR.NULL_VAL.value());
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(bind("rqst_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(bind("po_schd_dt").between(t.st_dt, t.end_dt));
			dbSelect("MSBDL0040_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, bindL);
			_idxItmDtlCache = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd);
		}

		/**
		 * キャッシュ作成（取引先マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp; 
		protected void createBpCache() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (PoBulkReg_Chk01_DtlR r : up1().groupBy(PoBulkReg_Chk01_DtlR.$sppl_cd, PoBulkReg_Chk01_DtlR.$dlv_cd, PoBulkReg_Chk01_DtlR.$tdlv_cd)) {
				if (!isNullOrNullVal(r.sppl_cd())) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.sppl_cd());
					bindL.add(spplR);
				}
				
				if (!isNullOrNullVal(r.dlv_cd())) {
					MAM_BP_R dlvR = MAM_BP_R.create();
					dlvR.bp_cd(r.dlv_cd());
					bindL.add(dlvR);
				}
				if (!isNullOrNullVal(r.tdlv_cd())) {
					MAM_BP_R tdlvR = MAM_BP_R.create();
					tdlvR.bp_cd(r.tdlv_cd());
					bindL.add(tdlvR);
				}
			}
			
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					bindL, MAM_BP_R.$bp_cd);
		}

		/**
		 * キャッシュ作成（場所マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc; 
		protected void createLocCache() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
					up1().groupBy(PoBulkReg_Chk01_DtlR.$in_to_loc_cd), PoBulkReg_Chk01_DtlR.$in_to_loc_cd);
		}
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtl(PoBulkReg_Chk01_DtlR dtlR){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCache,
					dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd());
			MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
			for (MAM_ITM_DTL_R r : itmDtlL) {
				if (dtlR.po_schd_dt().lt(r.end_dt()) && dtlR.po_schd_dt().gt(r.st_dt())) {
					rslt.add(r);
				}
			}
			return rslt;
		}

		/**
		 * キャッシュ取得（取引先マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.get(bpCd);
		}

		/**
		 * キャッシュ取得（場所マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}

		/**
		 * 補完処理
		 */
		protected void cmpl() {
			MCList<PoBulkReg_Chk01_DtlR> trgtL = getChkList(up1());

			cacheItmLcl(trgtL);
			cacheDpt(trgtL);
			createItmDtlCache();
			createBpCache();
			createLocCache();

			for (PoBulkReg_Chk01_DtlR r : trgtL) {
				setItmNm(r);
				setIvItmNm(r);
				setWrkNo(r);
				setEdiFlg(r);
				setPurcIdTyp(r);
				setTaxInfo(r);
				setBaseUnitQty(r);
				setPriPrintFlg(r);
				setPurcBasisTyp(r);
				clearAmtInfo(r);
			}
			setDpt(trgtL);
			setApDpt(trgtL);
			callPurcUtilSrch01(trgtL);
			setSyncFlg(trgtL);
			setPoPrintCd(trgtL);
			setHdrPegNo(trgtL);
			setUpri(trgtL);
			setWtaxRate(trgtL);
			setXrate(trgtL);
			setPtaxXrate(trgtL);
			calcAmt(trgtL);
		}

		/**
		 * 購買単価取得基準日の設定
		 */
		protected void setPurcUpriReqBaseDt() {
			MCList<PoBulkReg_Chk01_DtlR> trgtL = up1().subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!isNull(row.purc_upri_req_typ())) {
						return true;
					}
					return false;
				}});
			
			for(PoBulkReg_Chk01_DtlR r : trgtL) {
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())) {
					r.purc_upri_req_base_dt(r.po_dt());
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(r.purc_upri_req_typ())) {
					r.purc_upri_req_base_dt(r.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(r.purc_upri_req_typ())) {
					r.purc_upri_req_base_dt(r.purc_schd_dt());
				}
			}
		}
		
		/**
		 * 税設定
		 */
		protected void setTax() {
			MCList<PoBulkReg_Chk01_DtlR> taxL = up1().subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (isPurc(row.purc_id_typ())) {
						return true;
					}
					return false;
				}});

			if (taxL.size() > 0) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
						MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
						PoBulkReg_Chk01_DtlR.$tax_cd, taxL, PoBulkReg_Chk01_DtlR.$itm_cd,
						PoBulkReg_Chk01_DtlR.$itm_sub1, PoBulkReg_Chk01_DtlR.$itm_sub2,
						PoBulkReg_Chk01_DtlR.$itm_sub3, PoBulkReg_Chk01_DtlR.$sppl_cd,
						PoBulkReg_Chk01_DtlR.$purc_upri_req_base_dt);
			}
		}

		/**
		 * 品名を補完します。
		 * @param r
		 */
		protected void setItmNm(PoBulkReg_Chk01_DtlR r) {
			if (r.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItmR = _cacheSundry.get(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
						, r.sno1(), r.sno2(), r.sno3(), r.sno4());
				if (!sundryItmR.isEmpty()) {
					r.itm_nm(sundryItmR.itm_nm());
				}
				else if (isNull(r.itm_nm())) {
					MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					r.itm_nm(itmR.itm_nm());
				}
			}
			else {
				r.itm_nm(null);
			}
		}

		/**
		 * インボイス表記品名を設定します。
		 * @param r
		 */
		protected void setIvItmNm(PoBulkReg_Chk01_DtlR r) {
			if (r.sppl_iv_flg()) {
				if (r.sundry_itm_flg()) {
					if (isNull(r.iv_itm_nm())) {
						// 諸口品で、発注予定にインボイス表記品名が設定されていない場合のみ補完
						MAM_ITM_LCL_R itmLclR = _cacheItmLcl.get(
								r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prnt_lcl_cd());
						r.iv_itm_nm(itmLclR.itm_nm());
					}
				}
				else {
					r.iv_itm_nm(null);
				}
			}
			else {
				r.iv_itm_nm(null);
			}
		}

		/**
		 * 案件を設定します。
		 * @param r
		 */
		protected void setWrkNo(PoBulkReg_Chk01_DtlR r) {
			MST_WRK_SNO_R wrkNoL = _cacheWrkSno.get(r.sno1());
			r.wrk_no(wrkNoL.wrk_no());
		}

		/**
		 * 税情報を設定します。
		 * @param r
		 */
		protected void setTaxInfo (PoBulkReg_Chk01_DtlR r) {
			if (isPurc(r.purc_id_typ())) {
				MAM_TAX_R taxR = _cacheTax.get(r.tax_cd());
				r.tax_rate(taxR.tax_rate());
				r.inc_tax_flg(taxR.inc_tax_flg());
			}
		}

		/**
		 * 基準単位数量を設定します。
		 * @param r
		 */
		protected void setBaseUnitQty(PoBulkReg_Chk01_DtlR r) {
			r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
					r.base_unit_dec_place(), r.base_unit_rnd_typ()));
		}

		/**
		 * 購買識別区分を設定します。
		 * @param r
		 */
		protected void setPurcIdTyp(PoBulkReg_Chk01_DtlR r) {
			MST_SLO_D_R sloDR = _cacheSloD.get(r.slo_d_no());
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
				r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
			if (r.dscnt_itm_flg()) {
				r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
			if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
				r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
		}

		/**
		 * ＥＤＩを設定します。
		 * @param r
		 */
		protected void setEdiFlg(PoBulkReg_Chk01_DtlR r) {
			MAM_EDI_IF_CTL_R ediIfR = _cacheEdiIf.get(r.po_dt(), r.sppl_cd(), r.getStringNE("if_proc_typ"));
			if (!ediIfR.isEmpty() && !ediIfR.del_flg()) {
				r.edi_flg(true);
			}
		}

		/**
		 * 価格印字を設定します。
		 * @param r
		 */
		protected void setPriPrintFlg(PoBulkReg_Chk01_DtlR r) {
			if (!isNull(r.sppl_ship_form_cd())) {
				r.pri_print_flg(true);
			}
		}

		/**
		 * 仕入計上区分を設定します。
		 * @param r
		 */
		protected void setPurcBasisTyp(PoBulkReg_Chk01_DtlR r) {
			// 取引先マスタ（発注先）
			MAM_BP_R bpR = getCacheBp(r.sppl_cd());

			if (!isNull(r.dlv_cd())) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
			else if (r.arr_skip_flg()) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (r.subcon_flg()) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
			else if (isNull(r.purc_basis_typ())) {
				if (!isNull(bpR.purc_basis_typ())) {
					r.purc_basis_typ(bpR.purc_basis_typ());
				}
				else {
					r.purc_basis_typ(MAC_PURC_BASIS_TYP.ANY_BASIS.value());
				}
			}
		}

		/**
		 * 同時計上を設定します。
		 * @param trgtL
		 */
		protected void setSyncFlg(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			for (PoBulkReg_Chk01_DtlR r : trgtL) {
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					if (!isNull(r.dlv_rqst_tm()) && !r.dlv_rqst_tm().eqDate(r.purc_schd_dt())) {
						r.purc_schd_dt(r.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
					}
					r.sync_flg(true);
				}
				else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
					if (!isPurc(r.purc_id_typ()) && !isNull(r.purc_schd_dt())) {
						r.purc_schd_dt(null);
					}
					r.sync_flg(false);
				}
				else if (!isNull(r.dlv_rqst_tm()) && r.dlv_rqst_tm().eqDate(r.purc_schd_dt()) && !r.arr_skip_flg()) {
					r.sync_flg(true);
				}
			}
		}

		/**
		 * 購買識別区分がＶＭＩ・無償需給の場合に、金額などの不要な情報をクリアします。
		 * @param r
		 */
		protected void clearAmtInfo(PoBulkReg_Chk01_DtlR r) {
			if (!isPurc(r.purc_id_typ())) {
				r.purc_schd_dt(null);
				r.sync_flg(false);
				r.pay_crryovr_times(null);
				r.purc_upri_req_typ(null);
				r.tax_cd(null);
				r.trd_cur_upri(null);
				r.trd_cur_amt(null);
				r.trd_cur_tax_amt(null);
				r.interim_flg(false);
				r.trd_cur_proc_upri(null);
				r.trd_cur_proc_amt(null);
				r.trd_cur_onr_prov_upri(null);
				r.trd_cur_onr_prov_amt(null);
				r.upri_not_tgt_flg(false);
			}
		}

		/**
		 * 仕入直送の場合、受注内容で上書きします。
		 */
		protected void setSloD() {
			for (PoBulkReg_Chk01_DtlR r : up1()) {
				if (!isNull(r.slo_d_no()) && !r.rqst_can_flg()) {
					MST_SLO_D_R sloDR = _cacheSloD.get(r.slo_d_no());
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
						r.in_to_loc_cd(nvl(sloDR.loc_cd(), sloDR.def_loc_cd()));
						r.str_ln_cd(nvl(sloDR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
						r.dlv_cd(sloDR.dlv_cd());
						r.dlv_nm(sloDR.dlv_nm());
						r.dlv_sundry_flg(sloDR.dlv_sundry_flg());
						r.dlv_zip_cd(sloDR.dlv_zip_cd());
						r.dlv_addr1(sloDR.dlv_addr1());
						r.dlv_addr2(sloDR.dlv_addr2());
						r.dlv_addr3(sloDR.dlv_addr3());
						r.dlv_addr4(sloDR.dlv_addr4());
						r.dlv_tel(sloDR.dlv_tel());
						r.dlv_fax(sloDR.dlv_fax());
						r.tdlv_cd(sloDR.tdlv_cd());
						r.tdlv_nm(sloDR.tdlv_nm());
						r.tdlv_sundry_flg(sloDR.tdlv_sundry_flg());
						r.tdlv_zip_cd(sloDR.tdlv_zip_cd());
						r.tdlv_addr1(sloDR.tdlv_addr1());
						r.tdlv_addr2(sloDR.tdlv_addr2());
						r.tdlv_addr3(sloDR.tdlv_addr3());
						r.tdlv_addr4(sloDR.tdlv_addr4());
						r.tdlv_cntct_dpt(sloDR.tdlv_cntct_dpt());
						r.tdlv_cntct_psn(sloDR.tdlv_cntct_psn());
						r.tdlv_tel(sloDR.tdlv_tel());
						r.tdlv_fax(sloDR.tdlv_fax());
					}
				}
			}
		}

		/**
		 * 部門補完
		 * @param trgtL
		 */
		protected void setDpt(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			for (PoBulkReg_Chk01_DtlR r : trgtL) {
				if (isNullAnd(r.purc_usr_cd(), r.purc_dpt_cd())) {
					r.purc_usr_cd(up0().purc_usr_cd());
					r.purc_dpt_cd(up0().purc_dpt_cd());
					r.wg_cd(up0().purc_dpt_wg_cd());
				}
				else if (!isNull(r.purc_usr_cd()) && isNull(r.purc_dpt_cd())) {
					MAM_USR_ACL_R usrAclR = getCacheSpplPurcDpt(r.purc_usr_cd());
					r.purc_dpt_cd(usrAclR.dpt_cd());
					r.wg_cd(usrAclR.getStringNE("wg_cd"));
				}
			}
		}

		protected void setApDpt(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> cmpTrgtL = trgtL.subList(PoBulkReg_Chk01_DtlR.$ap_dpt_cd, null);
			if(isNull(cmpTrgtL)) {
				return;
			}
			
			MCList<MAM_DPT_R> purcDptL = MCList.create(MAM_DPT_R.class);
			MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
			MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(dpt);
			dptL_bldr.setSelect(dpt.dpt_cd, dpt.ap_dpt_flg);
			dptL_bldr.setWhere(dpt.dpt_cd.eq(bind("purc_dpt_cd")));
			dptL_bldr.addWhereWithAnd(bind("today").between(dpt.st_dt, dpt.end_dt));
			dptL_bldr.addWhereWithAnd(dpt.del_flg.eq(value(false)));
			dbSelect("MSBDL5290_MAM_DPT_S01", purcDptL, dptL_bldr, cmpTrgtL);
			
			MCIndexKey purcDptIdx = purcDptL.createIndex(MAM_DPT_R.$dpt_cd);
			for (PoBulkReg_Chk01_DtlR r : cmpTrgtL) {
				MAM_DPT_R purcDptR = purcDptL.getFirst(purcDptIdx, r.purc_dpt_cd());
				if(!isNull(purcDptR) && purcDptR.ap_dpt_flg()) {
					r.ap_dpt_cd(purcDptR.dpt_cd());
				}
			}
		}

		/**
		 * 購買共通ユーティリティ呼出
		 * @param trgtL
		 */
		protected void callPurcUtilSrch01(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			if(!up0().calc_schd_dt_flg()) {
				return;
			}
			// 購買共通ユーティリティの上り電文に設定する情報を補完する
			for(PoBulkReg_Chk01_DtlR r: trgtL) {
				MAM_LOC_R locR = getCacheLoc(r.in_to_loc_cd());
				MAM_BP_R bpR = getCacheBp(r.sppl_cd());
				MAM_BP_R dlvR = getCacheBp(r.dlv_cd());
				MAM_BP_R tdlvR = getCacheBp(r.tdlv_cd());
				r.in_to_loc_cal_cd(locR.cal_cd());
				r.sppl_cal_cd(bpR.sppl_cal_cd());
				r.dlv_cal_cd(dlvR.dlv_cal_cd());
				r.tdlv_lg_grp_cd(tdlvR.lg_grp_cd());
				r.dlv_lg_grp_cd(dlvR.lg_grp_cd());
				r.lg_grp_cd(locR.lg_grp_cd());
			}
			
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), trgtL, createMap_PurcUtil_Srch01_DtlR_PoBulkReg_Chk01_DtlR());
			
			// 購買共通ユーティリティ呼出
			purcUtilSrch01.exec();
			
			MCIndexKey idxkey = purcUtilSrch01.down0().createIndex(PurcUtil_Srch01_DtlR.$peg_no);
			for(PoBulkReg_Chk01_DtlR r: trgtL) {
				PurcUtil_Srch01_DtlR downR = purcUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				r.dlv_rqst_tm(downR.dlv_rqst_dt());
				r.purc_schd_dt(downR.purc_schd_dt());
			}
		}

		/**
		 * 注文書表示ＣＤ補完
		 * @param trgtL
		 */
		protected void setPoPrintCd (MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			trgtL.subList(PoBulkReg_Chk01_DtlR.$po_print_cd, null).setStringNE(PoBulkReg_Chk01_DtlR.$po_print_cd, getCo().po_print_cd());
		}

		/**
		 * 伝票単位に分割
		 * @param trgtL
		 */
		protected void setHdrPegNo(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			// 発注ヘッダのエラーを紐づけるため、発注まとめ単位にpeg_noの最小値をhdr_peg_noにセットする
			for (MCList<PoBulkReg_Chk01_DtlR> grpL : trgtL.groupList(getHdrColumn())) {
				MCNumber minPegNo = (MCNumber) grpL.min(PoBulkReg_Chk01_DtlR.$peg_no);
				grpL.setNumberNE(PoBulkReg_Chk01_DtlR.$hdr_peg_no, minPegNo);
			}
		}

		/**
		 * 単価設定
		 * @param trgtL
		 */
		protected void setUpri(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> upriL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!row.upri_not_tgt_flg() && isPurc(row.purc_id_typ())) {
						return true;
					}
					return false;
				}
			});
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			addAll(purcUtilSrch02.up0(), upriL, createMap_PurcUtil_Srch02_DtlR_PoBulkReg_Chk01_DtlR());

			purcUtilSrch02.exec();
			String[] destCols = {PoBulkReg_Chk01_DtlR.$trd_cur_upri, PoBulkReg_Chk01_DtlR.$trd_cur_proc_upri, PoBulkReg_Chk01_DtlR.$trd_cur_onr_prov_upri, PoBulkReg_Chk01_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(trgtL, destCols, purcUtilSrch02.down0(), srcCols);

			// 下請対象に発注する場合で、仮単価の場合は登録対象から除く
			MCList<PoBulkReg_Chk01_DtlR> removeL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (row.subcon_flg() && row.interim_flg() && isPurc(row.purc_id_typ())) {
						return true;
					}
					return false;
				}
			});

			trgtL.removeAll(removeL);
			up1().removeAll(removeL);

			down1().total_cnt(down1().total_cnt().subtract(removeL.size()));
		}

		/**
		 * 源泉税率設定
		 * @param trgtL
		 */
		protected void setWtaxRate(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> wtaxRateL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (isPurc(row.purc_id_typ()) && 
							(isSame(row.trd_cur_cd(), getCo().base_cur_cd()) &&  
									(isSame(row.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd())))) {
						return true;
					}
					return false;
				}});
			if (wtaxRateL.size() > 0) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
						MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
						PoBulkReg_Chk01_DtlR.$wtax_rate, wtaxRateL,
						PoBulkReg_Chk01_DtlR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_sub1,
						PoBulkReg_Chk01_DtlR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub3,
						PoBulkReg_Chk01_DtlR.$purc_upri_req_base_dt);
			}
		}

		/**
		 * 為替レート設定
		 * @param trgtL
		 */
		protected void setXrate(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> xrateL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!row.xrate_inpt_flg() && !isSame(row.trd_cur_cd(), getCo().base_cur_cd())) {
						return true;
					}
					return false;
				}});
			if (xrateL.size() > 0) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE", "01"),
						MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_PURC_XRATE"),
						PoBulkReg_Chk01_DtlR.$xrate, xrateL,
						PoBulkReg_Chk01_DtlR.$trd_cur_cd, PoBulkReg_Chk01_DtlR.$po_dt);
			}
		}

		/**
		 * 納税為替レート設定
		 * @param trgtL
		 */
		protected void setPtaxXrate(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			if (isNull(getCo().ptax_cur_cd())) {
				return;
			}
			MCList<PoBulkReg_Chk01_DtlR> ptaxXrateL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!row.ptax_xrate_inpt_flg() && !isSame(row.trd_cur_cd(), getCo().ptax_cur_cd())) {
						return true;
					}
					return false;
				}});

			if (ptaxXrateL.size() > 0) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
						MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_XRATE"),
						PoBulkReg_Chk01_DtlR.$ptax_xrate, ptaxXrateL,
						PoBulkReg_Chk01_DtlR.$trd_cur_cd, "ptax_cur_cd", "xrate_cd",
						PoBulkReg_Chk01_DtlR.$po_dt);
			}
		}

		/**
		 * 最新単価から取引通貨金額情報と源泉税額を計算します。
		 * @param trgtL
		 */
		protected void calcAmt(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> calcL = trgtL.subList(new MCRowMatcher<PoBulkReg_Chk01_DtlR>() {
				@Override
				public boolean match(PoBulkReg_Chk01_DtlR row) {
					if (!isNull(row.trd_cur_upri())) {
						return true;
					}
					return false;
				}});
			for (PoBulkReg_Chk01_DtlR r : calcL) {
				r.setNumberNE("trd_cur_amt_dec_place", r.amt_dec_place());
				MSBDL_PurcUtil.setTrdCurInfo(r);
				if(r.outsrc_flg()){
					MAM_BP_R spplR = getCacheBp(r.sppl_cd());
					// 買戻し義務がオンかつ、外注単価区分が「外注単価＋有償支給単価」の場合、加工金額を元に税額を再計算する
					if(spplR.repurc_obli_flg() && MAC_OUTSRC_UPRI_TYP.isPROC_PROV(nvl(spplR.outsrc_upri_typ(), getCo().outsrc_upri_typ()))) {
						MCNumber amt = MAUCL_AmtUtil.getAmt(r.trd_cur_upri(),
								r.trd_unit_qty(),
								r.amt_dec_place(),
								r.purc_amt_rnd_typ());
						if(r.inc_tax_flg()) {
							// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
							MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(r.trd_cur_proc_upri(),
									r.trd_unit_qty(),
									r.amt_dec_place(),
									r.purc_amt_rnd_typ());
							r.trd_cur_proc_amt(proc_inc_tax_amt);
							// 有償支給金額は金額-加工金額
							r.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
						}
						MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
								r.trd_cur_proc_amt(),
								r.tax_rate(),
								r.amt_dec_place(),
								r.purc_tax_rnd_typ(),
								r.inc_tax_flg()
								);
						r.trd_cur_tax_amt(trdCurTaxAmt);
						if(r.inc_tax_flg()) {
							amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
							MCNumber proc_amt = !isNull(r.trd_cur_proc_amt()) ? r.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
							r.trd_cur_amt(amt);
							r.trd_cur_proc_amt(proc_amt);
						}
					}
				}
				MSBDL_PurcUtil.setWtaxInfo(r);
			}
		}

		/**
		 * チェック処理
		 * @param msgL
		 */
		protected void chk(MCMessageList msgL) {
			MCList<PoBulkReg_Chk01_DtlR> trgtL = getChkList(up1());
			for (PoBulkReg_Chk01_DtlR r : trgtL) {
				chkRequired(msgL, r);
				chkBeforeAfter(msgL, r);

				msgL.addAll(checkDecPlace(r, PoBulkReg_Chk01_DtlR.$trd_unit_dec_place, PoBulkReg_Chk01_DtlR.$trd_unit_qty));
				msgL.addAll(checkDecPlace(r, PoBulkReg_Chk01_DtlR.$upri_dec_place, PoBulkReg_Chk01_DtlR.$trd_cur_upri));

				chkStop(msgL, r);

			}
			existBdCheck(msgL, trgtL);
			chkOther(msgL, trgtL);
		}

		/**
		 * 必須チェック
		 * @param msgL
		 * @param r
		 */
		protected void chkRequired(MCMessageList msgL, PoBulkReg_Chk01_DtlR r) {
			msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$purc_dpt_cd, new FXUCL_RequiredValidater()));
			msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$ap_dpt_cd, new FXUCL_RequiredValidater()));
			if (isPurc(r.purc_id_typ())) {
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$purc_schd_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
			}

			if (r.sundry_itm_flg() && r.sppl_iv_flg()) {
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$iv_itm_nm, new FXUCL_RequiredValidater()));
			}

			if (r.ver_flg()) {
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
			}

			if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())) {
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, PoBulkReg_Chk01_DtlR.$purc_rsn_cd, new FXUCL_RequiredValidater()));
			}
		}
		
		/**
		 * 日付の前後チェック
		 * @param msgL
		 * @param r
		 */
		protected void chkBeforeAfter(MCMessageList msgL, PoBulkReg_Chk01_DtlR r) {
			msgL.addAll(check(r, new String[] {PoBulkReg_Chk01_DtlR.$po_dt, PoBulkReg_Chk01_DtlR.$dlv_rqst_tm}, new FXUCL_BeforeAfterValidater()));
			msgL.addAll(check(r, new String[] {PoBulkReg_Chk01_DtlR.$po_dt, PoBulkReg_Chk01_DtlR.$purc_schd_dt}, new FXUCL_BeforeAfterValidater()));
		}

		/**
		 * 発注禁止チェック
		 * @param msgL
		 * @param r
		 */
		protected void chkStop(MCMessageList msgL, PoBulkReg_Chk01_DtlR r) {
			MAM_BP_STOP_R bpStopR = _cacheBpStop.get(r.sppl_cd());
			if (!isNull(bpStopR.po_stop_dt()) && bpStopR.po_stop_dt().lte(r.po_dt()) && !bpStopR.del_flg()) {
				msgL.add(new MCMessage(r, null , MSBDL0091, r.sppl_cd(), toYMDString(r.po_dt())));
			}
			MAM_ITM_STOP_R itmStopR = _cacheItmStop.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!isNull(itmStopR.po_stop_dt()) && itmStopR.po_stop_dt().lte(r.po_dt()) && !itmStopR.del_flg()) {
				msgL.add(new MCMessage(r, null , MSBDL0089, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toYMDString(r.po_dt()), itmStopR.po_stop_dt(), toDispGUIIndex(r)));
			}
		}

		/**
		 * 負担項目の各種ＮＯの存在チェックを行います。
		 * @param trgtL
		 * @return
		 */
		protected void existBdCheck(MCMessageList msgL, MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			MCList<PoBulkReg_Chk01_DtlR> bdLotChkTgtL = MCList.create(PoBulkReg_Chk01_DtlR.class);

			for (PoBulkReg_Chk01_DtlR dr : trgtL) {
				if (!isNull(dr.bd_po_no())) {
					MST_PO_R poR = _cachePo.get(dr.bd_po_no());
					if (poR.isEmpty() || poR.can_flg()) {
						msgL.add(new MCMessage(dr, PoBulkReg_Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					MST_SLO_R sloR = _cacheSlo.get(dr.bd_slo_no());
					if (sloR.isEmpty() || sloR.can_flg()) {
						msgL.add(new MCMessage(dr, PoBulkReg_Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no())) {
					bdLotChkTgtL.add(dr);
				}
				if (!isNull(dr.bd_iv_no())) {
					MST_RCPT_IV_R rcptIvR = _cacheIv.get(dr.bd_iv_no());
					if (rcptIvR.isEmpty()) {
						msgL.add(new MCMessage(dr, PoBulkReg_Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
					}
				}
			}
			callLotServiceChkBdItm(bdLotChkTgtL);
		}

		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param trgtL
		 */
		protected void callLotServiceChkBdItm(MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			if (trgtL.isEmpty()) {
				return;
			}
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), trgtL, createMap_Lot_Chk03_CndR_PoBulkReg_Chk01_DtlR());
			ope.exec();
			copyErrFlg(trgtL, ope.up0());
		}

		/**
		 * 仕様チェック（その他）
		 * @param msgL
		 * @param trgtL
		 */
		protected void chkOther(MCMessageList msgL, MCList<PoBulkReg_Chk01_DtlR> trgtL) {
			for (PoBulkReg_Chk01_DtlR r : trgtL) {
				if (!isNull(r.outsrc_sppl_cd()) && MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
					// ＶＭＩ品の支給直送は不可
					msgL.add(new MCMessage(r, null, MSBDL0077, toDispGUIIndex(r)));
				}
				if (r.subcon_flg() && isPurc(r.purc_id_typ())) {
					if (!r.dlv_rqst_tm().eqDate(r.purc_schd_dt())) {
						// 下請法対象取引先に対しては入荷同時検収でないといけない
						msgL.add(new MCMessage(r, null , MSBDL0074, toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.purc_rsn_cd()) 
						&& (MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))
						&& !r.xpns_purc_flg()) {
					msgL.add(new MCMessage(r, null, MSBDL0151
							, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
							,r.purc_rsn_cd(), toDispGUIIndex(r)));
				}
			}
		}

		/**
		 * 仕様チェック（値引品目のみで登録は不可）
		 * @param msgL
		 */
		protected void dscntItmChk(MCMessageList msgL) {
			setErrFlg(up1());
			MCList<PoBulkReg_Chk01_DtlR> noErrL = getChkList(up1());
			for (MCList<PoBulkReg_Chk01_DtlR> grpL : noErrL.groupList(PoBulkReg_Chk01_DtlR.$hdr_peg_no)) {
				MCList<PoBulkReg_Chk01_DtlR> subL = grpL.subList(PoBulkReg_Chk01_DtlR.$dscnt_itm_flg, true);
				if (isSame(grpL.size(), subL.size())) {
					for (PoBulkReg_Chk01_DtlR r : grpL) {
						// 値引品のみの登録は不可
						msgL.add(new MCMessage(r, null, MSBDL0092, toDispGUIIndex(r)));
					}
				}
			}
		}

		/**
		 * 仕入対象か否かを判定します。
		 * @param purcIdTyp
		 * @return
		 */
		protected boolean isPurc(String purcIdTyp) {
			if (MAC_PURC_ID_TYP.isPURC(purcIdTyp) || MAC_PURC_ID_TYP.isONR_RCV(purcIdTyp)) {
				return true;
			}
			return false;
		}

		protected Map_PurcUtil_Srch02_DtlR_PoBulkReg_Chk01_DtlR<PurcUtil_Srch02_DtlR,PoBulkReg_Chk01_DtlR> createMap_PurcUtil_Srch02_DtlR_PoBulkReg_Chk01_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_PoBulkReg_Chk01_DtlR<PurcUtil_Srch02_DtlR, PoBulkReg_Chk01_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_PoBulkReg_Chk01_DtlR<D extends PurcUtil_Srch02_DtlR, S extends PoBulkReg_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, PoBulkReg_Chk01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, PoBulkReg_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, PoBulkReg_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, PoBulkReg_Chk01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, PoBulkReg_Chk01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, PoBulkReg_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, PoBulkReg_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, PoBulkReg_Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, PoBulkReg_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, PoBulkReg_Chk01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, PoBulkReg_Chk01_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, PoBulkReg_Chk01_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, PoBulkReg_Chk01_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, PoBulkReg_Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, PoBulkReg_Chk01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, PoBulkReg_Chk01_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, PoBulkReg_Chk01_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, PoBulkReg_Chk01_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, PoBulkReg_Chk01_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, PoBulkReg_Chk01_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, PoBulkReg_Chk01_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, PoBulkReg_Chk01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itmdtl_base_dt, PoBulkReg_Chk01_DtlR.$po_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.grp_no(String.valueOf(src.hdr_peg_no()));
				dest.base_dt(src.purc_upri_req_base_dt());
			}
		}

		protected Map_Lot_Chk03_CndR_PoBulkReg_Chk01_DtlR<Lot_Chk03_CndR,PoBulkReg_Chk01_DtlR> createMap_Lot_Chk03_CndR_PoBulkReg_Chk01_DtlR() {
			return new Map_Lot_Chk03_CndR_PoBulkReg_Chk01_DtlR<Lot_Chk03_CndR, PoBulkReg_Chk01_DtlR>();
		}

		public class Map_Lot_Chk03_CndR_PoBulkReg_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends PoBulkReg_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, PoBulkReg_Chk01_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, PoBulkReg_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, PoBulkReg_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, PoBulkReg_Chk01_DtlR.$bd_lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, PoBulkReg_Chk01_DtlR.$bd_sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$err_flg, PoBulkReg_Chk01_DtlR.$err_flg);
			}
		}
	}

	/**
	 * PoBulkReg_Ins02オペレーション.<p>
	 *
	 * 発注を一括で登録する（本処理）<br>
	 */
	public class PoBulkReg_Ins02 extends MSBDL_PoBulkRegService_MC_A.PoBulkReg_Ins02 {
		/**
		 * バッチログのlogger<br>
		 * バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				callThisChk02();
				callPoRegServicePoIns01();
				setDown();
			}
			finally {
				closeLogger();
			}
		}

		/**
		 * バッチログのインスタンスを取得します。
		 */
		protected void initLogger() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}

		/**
		 * バッチログをクローズします。
		 */
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				_logger.close();
			}
		}

		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().addAll(up1());
		}

		/**
		 *  発注登録サービス（登録前チェック）をコールします。
		 */
		protected void callThisChk02() {
			MSBDL_PoBulkRegService.PoBulkReg_Chk02 ope = MSBDL_PoBulkRegService.crtPoBulkReg_Chk02();
			ope.up0().addAll(up1());
			ope.exec();
			up1().setAll(ope.down0());
		}
		/**
		 * 発注登録サービス（登録）をコールします。
		 */
		protected void callPoRegServicePoIns01 () {
			MSBDL_PoRegService.Po_Ins01 ope = MSBDL_PoRegService.crtPo_Ins01();
			MCList<PoBulkReg_Chk01_DtlR> noErrL = getChkList(up1());
			for (MCList<PoBulkReg_Chk01_DtlR> grpL : noErrL.groupList(PoBulkReg_Chk01_DtlR.$hdr_peg_no)) {

				Po_Ins01_HdrR HdrR = Po_Ins01_HdrR.create();
				copy(HdrR, grpL.get(0), createMap_Po_Ins01_HdrR_PoBulkReg_Chk01_DtlR());
				ope.up0().add(HdrR);

				addAll(ope.up1(), grpL, createMap_Po_Ins01_DtlR_PoBulkReg_Chk01_DtlR());
				setDispSeq(ope.up1());

				addAll(ope.up2(), grpL, createMap_Po_Ins01_Bndl_DtlR_PoBulkReg_Chk01_DtlR());
			}
			ope.up0().setBooleanNE(Po_Ins01_HdrR.$prnt_po_flg, up0().prnt_po_flg());
			ope.up0().setBooleanNE(Po_Ins01_HdrR.$prnt_dlv_flg, up0().prnt_dlv_flg());

			if (ope.up0().size() > 0) {
				ope.exec();
				// 処理件数カウントのため発番されたＮＯを下らせる
				String[] destCols = {PoBulkReg_Chk01_DtlR.$po_d_no};
				String[] srcCols = {Po_Ins01_DtlR.$po_d_no};
				copyByPegNo(up1(), destCols, ope.down1(), srcCols);
			}
		}
	}

	protected String[] getHdrColumn(){
		return new String[]{
				PoBulkReg_Chk01_DtlR.$trd_cd
				,PoBulkReg_Chk01_DtlR.$purc_dpt_cd
				,PoBulkReg_Chk01_DtlR.$purc_usr_cd
				,PoBulkReg_Chk01_DtlR.$sppl_cd
				,PoBulkReg_Chk01_DtlR.$po_dt
				,PoBulkReg_Chk01_DtlR.$trd_cur_cd
				,PoBulkReg_Chk01_DtlR.$xrate
				,PoBulkReg_Chk01_DtlR.$xrate_inpt_flg
				,PoBulkReg_Chk01_DtlR.$ptax_xrate
				,PoBulkReg_Chk01_DtlR.$ptax_xrate_inpt_flg
				,PoBulkReg_Chk01_DtlR.$po_print_cd
				,PoBulkReg_Chk01_DtlR.$wrk_no
				,PoBulkReg_Chk01_DtlR.$sppl_tterm_cd1
				,PoBulkReg_Chk01_DtlR.$sppl_tterm_cd2
				,PoBulkReg_Chk01_DtlR.$sppl_tterm_cd3
				,PoBulkReg_Chk01_DtlR.$edi_flg
		};
	}
	/**
	 * PoBulkReg_Chk02オペレーション.<p>
	 *
	 * 登録前チェック（マルチスレッド実行用）<br>
	 */
	public class PoBulkReg_Chk02 extends MSBDL_PoBulkRegService_MC_A.PoBulkReg_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			chk();
			setHdrErr(up0());
			callPoRegServicePoChk01();
			setHdrErr(up0());
			setDown();
		}

		protected void chk() {
			MCMessageList msgL = new MCMessageList();
			lock(msgL);
			setErrFlg(msgL);
			MCMessagePool.addAll(msgL);
		}

		protected void lock(MCMessageList msgL) {
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setSelect(t.po_schd_no, t.upd_cntr);
			poSchdL_bldr.setOrderByAsc(poSchdL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBDL5290_MST_PO_SCHD_S04", poSchdL, poSchdL_bldr,
					up0().groupBy(PoBulkReg_Chk01_DtlR.$po_schd_no));
			MCIndexKey idxPoSchdL = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_no);
			for (PoBulkReg_Chk01_DtlR r : up0()) {
				MCMessageList tmpMsgL = new MCMessageList();
				MST_PO_SCHD_R poSchdR = poSchdL.getFirst(idxPoSchdL, r.po_schd_no());
				tmpMsgL.addAll(
						checkUpdCntrNE(r, PoBulkReg_Chk01_DtlR.$upd_cntr, poSchdR));
				if (tmpMsgL.size() > 0) {
					msgL.add(new MCMessage(r, null, MSBDL0405, r.po_schd_no()));
				}
			}
		}

		protected void callPoRegServicePoChk01(){
			MSBDL_PoRegService.Po_Chk01 ope = MSBDL_PoRegService.crtPo_Chk01();
			MCList<PoBulkReg_Chk01_DtlR> trgtL = getChkList(up0());
			for (MCList<PoBulkReg_Chk01_DtlR> grpL : trgtL.groupList(PoBulkReg_Chk01_DtlR.$hdr_peg_no)) {
				Po_Ins01_HdrR HdrR = Po_Ins01_HdrR.create();
				copy(HdrR, grpL.get(0), createMap_Po_Ins01_HdrR_PoBulkReg_Chk01_DtlR());
				ope.up0().add(HdrR);

				addAll(ope.up1(), grpL, createMap_Po_Ins01_DtlR_PoBulkReg_Chk01_DtlR());
				setDispSeq(ope.up1());

				addAll(ope.up2(), grpL, createMap_Po_Ins01_Bndl_DtlR_PoBulkReg_Chk01_DtlR());
			}
			if (ope.up0().size() > 0) {
				ope.exec();
				copyErrFlg(up0(), ope.down0().subList(Po_Ins01_DtlR.$err_flg, true));
				copyErrFlg(up0(), ope.down1().subList(Po_Ins01_DtlR.$err_flg, true));
			}
		}

		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	
	/**
	 * 明細に1件でもエラーがある場合は全件エラーとする。
	 * ただし、skip_err_flgがオンの場合は何も行わない。
	 * @param cndR
	 * @param dtlL
	 */
	protected void setAllErr(PoBulkReg_Chk01_CndR cndR, MCList<PoBulkReg_Chk01_DtlR> dtlL) {
		if (cndR.skip_err_flg()) {
			return;
		}
		
		PoBulkReg_Chk01_DtlR errR = dtlL.getFirst(PoBulkReg_Chk01_DtlR.$err_flg, true);
		if (!isNull(errR)) {
			MCList<PoBulkReg_Chk01_DtlR> okL = dtlL.subList(PoBulkReg_Chk01_DtlR.$err_flg, false);
			for (PoBulkReg_Chk01_DtlR r : okL) {
				MCMessagePool.add(new MCMessage(r, null, MSBDL0406));
				r.err_flg(true);
			}
		}
	}
	
	/**
	 * 発注ヘッダ単位でエラー制御を行う。ヘッダに含まれる明細にエラーがある場合はヘッダ単位でエラーとする。
	 * @param dtlL
	 */
	protected void setHdrErr(MCList<PoBulkReg_Chk01_DtlR> dtlL) {
		MCList<PoBulkReg_Chk01_DtlR>[] upGroupList = dtlL.groupList(PoBulkReg_Chk01_DtlR.$hdr_peg_no);
		for (MCList<PoBulkReg_Chk01_DtlR> tmpL : upGroupList) {
			PoBulkReg_Chk01_DtlR errR = dtlL.getFirst(PoBulkReg_Chk01_DtlR.$err_flg, true);
			if (!isNull(errR)) {
				MCList<PoBulkReg_Chk01_DtlR> okL = tmpL.subList(PoBulkReg_Chk01_DtlR.$err_flg, false);
				for (PoBulkReg_Chk01_DtlR r : okL) {
					MCMessagePool.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
	}
	
	protected Map_Po_Ins01_HdrR_PoBulkReg_Chk01_DtlR<Po_Ins01_HdrR,PoBulkReg_Chk01_DtlR> createMap_Po_Ins01_HdrR_PoBulkReg_Chk01_DtlR() {
		return new Map_Po_Ins01_HdrR_PoBulkReg_Chk01_DtlR<Po_Ins01_HdrR, PoBulkReg_Chk01_DtlR>();
	}

	public class Map_Po_Ins01_HdrR_PoBulkReg_Chk01_DtlR<D extends Po_Ins01_HdrR, S extends PoBulkReg_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_HdrR.$peg_no, PoBulkReg_Chk01_DtlR.$hdr_peg_no);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_ship_form_cd, PoBulkReg_Chk01_DtlR.$sppl_ship_form_cd);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cd, PoBulkReg_Chk01_DtlR.$trd_cd);
			addColumnPathMap(Po_Ins01_HdrR.$trd_ptn_typ, PoBulkReg_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(Po_Ins01_HdrR.$purc_dpt_cd, PoBulkReg_Chk01_DtlR.$purc_dpt_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wg_cd, PoBulkReg_Chk01_DtlR.$wg_cd);
			addColumnPathMap(Po_Ins01_HdrR.$purc_usr_cd, PoBulkReg_Chk01_DtlR.$purc_usr_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cd, PoBulkReg_Chk01_DtlR.$sppl_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_dpt, PoBulkReg_Chk01_DtlR.$sppl_cntct_dpt);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_psn, PoBulkReg_Chk01_DtlR.$sppl_cntct_psn);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_zip_cd, PoBulkReg_Chk01_DtlR.$sppl_zip_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr1, PoBulkReg_Chk01_DtlR.$sppl_addr1);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr2, PoBulkReg_Chk01_DtlR.$sppl_addr2);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr3, PoBulkReg_Chk01_DtlR.$sppl_addr3);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr4, PoBulkReg_Chk01_DtlR.$sppl_addr4);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_tel, PoBulkReg_Chk01_DtlR.$sppl_tel);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_fax, PoBulkReg_Chk01_DtlR.$sppl_fax);
			addColumnPathMap(Po_Ins01_HdrR.$po_dt, PoBulkReg_Chk01_DtlR.$po_dt);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cur_cd, PoBulkReg_Chk01_DtlR.$trd_cur_cd);
			addColumnPathMap(Po_Ins01_HdrR.$xrate, PoBulkReg_Chk01_DtlR.$xrate);
			addColumnPathMap(Po_Ins01_HdrR.$xrate_inpt_flg, PoBulkReg_Chk01_DtlR.$xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate, PoBulkReg_Chk01_DtlR.$ptax_xrate);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate_inpt_flg, PoBulkReg_Chk01_DtlR.$ptax_xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_cd, PoBulkReg_Chk01_DtlR.$po_print_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wrk_no, PoBulkReg_Chk01_DtlR.$wrk_no);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd1, PoBulkReg_Chk01_DtlR.$sppl_tterm_cd1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd2, PoBulkReg_Chk01_DtlR.$sppl_tterm_cd2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd3, PoBulkReg_Chk01_DtlR.$sppl_tterm_cd3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_flg, PoBulkReg_Chk01_DtlR.$edi_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}
	}

	protected Map_Po_Ins01_DtlR_PoBulkReg_Chk01_DtlR<Po_Ins01_DtlR,PoBulkReg_Chk01_DtlR> createMap_Po_Ins01_DtlR_PoBulkReg_Chk01_DtlR() {
		return new Map_Po_Ins01_DtlR_PoBulkReg_Chk01_DtlR<Po_Ins01_DtlR, PoBulkReg_Chk01_DtlR>();
	}

	public class Map_Po_Ins01_DtlR_PoBulkReg_Chk01_DtlR<D extends Po_Ins01_DtlR, S extends PoBulkReg_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_DtlR.$peg_no, PoBulkReg_Chk01_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$hdr_peg_no, PoBulkReg_Chk01_DtlR.$hdr_peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_cd, PoBulkReg_Chk01_DtlR.$sppl_cd);
			addColumnPathMap(Po_Ins01_DtlR.$po_dt, PoBulkReg_Chk01_DtlR.$po_dt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cd, PoBulkReg_Chk01_DtlR.$trd_cd);
			addColumnPathMap(Po_Ins01_DtlR.$trd_ptn_typ, PoBulkReg_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(Po_Ins01_DtlR.$purc_dpt_cd, PoBulkReg_Chk01_DtlR.$purc_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$wg_cd, PoBulkReg_Chk01_DtlR.$wg_cd);
			addColumnPathMap(Po_Ins01_DtlR.$purc_usr_cd, PoBulkReg_Chk01_DtlR.$purc_usr_cd);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_cd, PoBulkReg_Chk01_DtlR.$trd_cur_cd);
			addColumnPathMap(Po_Ins01_DtlR.$po_schd_no, PoBulkReg_Chk01_DtlR.$po_schd_no);
			addColumnPathMap(Po_Ins01_DtlR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub1, PoBulkReg_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub3, PoBulkReg_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Po_Ins01_DtlR.$ver_no, PoBulkReg_Chk01_DtlR.$ver_no);
			addColumnPathMap(Po_Ins01_DtlR.$itm_nm, PoBulkReg_Chk01_DtlR.$itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$iv_itm_nm, PoBulkReg_Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$sno1, PoBulkReg_Chk01_DtlR.$sno1);
			addColumnPathMap(Po_Ins01_DtlR.$sno2, PoBulkReg_Chk01_DtlR.$sno2);
			addColumnPathMap(Po_Ins01_DtlR.$sno3, PoBulkReg_Chk01_DtlR.$sno3);
			addColumnPathMap(Po_Ins01_DtlR.$sno4, PoBulkReg_Chk01_DtlR.$sno4);
			addColumnPathMap(Po_Ins01_DtlR.$purc_rsn_cd, PoBulkReg_Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(Po_Ins01_DtlR.$purc_id_typ, PoBulkReg_Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(Po_Ins01_DtlR.$sundry_itm_flg, PoBulkReg_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_cd, PoBulkReg_Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_nm, PoBulkReg_Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$ap_dpt_cd, PoBulkReg_Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$maker_cd, PoBulkReg_Chk01_DtlR.$maker_cd);
			addColumnPathMap(Po_Ins01_DtlR.$in_to_loc_cd, PoBulkReg_Chk01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$str_ln_cd, PoBulkReg_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cd, PoBulkReg_Chk01_DtlR.$dlv_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_sundry_flg, PoBulkReg_Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_nm, PoBulkReg_Chk01_DtlR.$dlv_nm);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cntct_dpt, PoBulkReg_Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cntct_psn, PoBulkReg_Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_zip_cd, PoBulkReg_Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr1, PoBulkReg_Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr2, PoBulkReg_Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr3, PoBulkReg_Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr4, PoBulkReg_Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_tel, PoBulkReg_Chk01_DtlR.$dlv_tel);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_fax, PoBulkReg_Chk01_DtlR.$dlv_fax);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cd, PoBulkReg_Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_sundry_flg, PoBulkReg_Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_nm, PoBulkReg_Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cntct_dpt, PoBulkReg_Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cntct_psn, PoBulkReg_Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_zip_cd, PoBulkReg_Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr1, PoBulkReg_Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr2, PoBulkReg_Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr3, PoBulkReg_Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr4, PoBulkReg_Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_tel, PoBulkReg_Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_fax, PoBulkReg_Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_rqst_tm, PoBulkReg_Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(Po_Ins01_DtlR.$purc_lt, PoBulkReg_Chk01_DtlR.$purc_lt);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_dlv_rqst_tm, PoBulkReg_Chk01_DtlR.$rqst_dlv_rqst_tm);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_avl_rqst_dt, PoBulkReg_Chk01_DtlR.$rqst_avl_rqst_dt);
			addColumnPathMap(Po_Ins01_DtlR.$purc_schd_dt, PoBulkReg_Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(Po_Ins01_DtlR.$sync_flg, PoBulkReg_Chk01_DtlR.$sync_flg);
			addColumnPathMap(Po_Ins01_DtlR.$purc_upri_req_typ, PoBulkReg_Chk01_DtlR.$purc_upri_req_typ);
			addColumnPathMap(Po_Ins01_DtlR.$trd_unit_qty, PoBulkReg_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Po_Ins01_DtlR.$trd_unit_cd, PoBulkReg_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Po_Ins01_DtlR.$base_unit_qty, PoBulkReg_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Po_Ins01_DtlR.$base_unit_cd, PoBulkReg_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Po_Ins01_DtlR.$interim_flg, PoBulkReg_Chk01_DtlR.$interim_flg);
			addColumnPathMap(Po_Ins01_DtlR.$upri_not_tgt_flg, PoBulkReg_Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_upri, PoBulkReg_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_upri, PoBulkReg_Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_upri, PoBulkReg_Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_amt, PoBulkReg_Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_amt, PoBulkReg_Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_amt, PoBulkReg_Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_tax_amt, PoBulkReg_Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Po_Ins01_DtlR.$tax_cd, PoBulkReg_Chk01_DtlR.$tax_cd);
			addColumnPathMap(Po_Ins01_DtlR.$inc_tax_flg, PoBulkReg_Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(Po_Ins01_DtlR.$wtax_rate, PoBulkReg_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(Po_Ins01_DtlR.$wtax_amt, PoBulkReg_Chk01_DtlR.$wtax_amt);
			addColumnPathMap(Po_Ins01_DtlR.$mfg_loc_cd, PoBulkReg_Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bom_ptn, PoBulkReg_Chk01_DtlR.$bom_ptn);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_itm_ord_no, PoBulkReg_Chk01_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_flg, PoBulkReg_Chk01_DtlR.$outsrc_flg);
			addColumnPathMap(Po_Ins01_DtlR.$pri_print_flg, PoBulkReg_Chk01_DtlR.$pri_print_flg);
			addColumnPathMap(Po_Ins01_DtlR.$pay_crryovr_times, PoBulkReg_Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Po_Ins01_DtlR.$slo_no, PoBulkReg_Chk01_DtlR.$slo_no);
			addColumnPathMap(Po_Ins01_DtlR.$slo_d_no, PoBulkReg_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(Po_Ins01_DtlR.$io_schd_pr_no, PoBulkReg_Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_cd, PoBulkReg_Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub1, PoBulkReg_Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub2, PoBulkReg_Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub3, PoBulkReg_Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno1, PoBulkReg_Chk01_DtlR.$bd_sno1);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno2, PoBulkReg_Chk01_DtlR.$bd_sno2);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno3, PoBulkReg_Chk01_DtlR.$bd_sno3);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno4, PoBulkReg_Chk01_DtlR.$bd_sno4);
			addColumnPathMap(Po_Ins01_DtlR.$bd_loc_cd, PoBulkReg_Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_lot_no, PoBulkReg_Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sublot_no, PoBulkReg_Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_dpt_cd, PoBulkReg_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_ctg_cd, PoBulkReg_Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_oper_cd, PoBulkReg_Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_slo_no, PoBulkReg_Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_iv_no, PoBulkReg_Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_po_no, PoBulkReg_Chk01_DtlR.$bd_po_no);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_can_flg, PoBulkReg_Chk01_DtlR.$rqst_can_flg);
			addColumnPathMap(Po_Ins01_DtlR.$purc_basis_typ, PoBulkReg_Chk01_DtlR.$purc_basis_typ);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (isNullAnd(src.outsrc_sppl_cd(), src.dlv_cd())) {
				dest.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
			}
			else {
				dest.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
			}
		}
	}

	protected Map_Po_Ins01_Bndl_DtlR_PoBulkReg_Chk01_DtlR<Po_Ins01_Bndl_DtlR,PoBulkReg_Chk01_DtlR> createMap_Po_Ins01_Bndl_DtlR_PoBulkReg_Chk01_DtlR() {
		return new Map_Po_Ins01_Bndl_DtlR_PoBulkReg_Chk01_DtlR<Po_Ins01_Bndl_DtlR, PoBulkReg_Chk01_DtlR>();
	}

	public class Map_Po_Ins01_Bndl_DtlR_PoBulkReg_Chk01_DtlR<D extends Po_Ins01_Bndl_DtlR, S extends PoBulkReg_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$peg_no, PoBulkReg_Chk01_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_schd_no, PoBulkReg_Chk01_DtlR.$po_schd_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$base_unit_qty, PoBulkReg_Chk01_DtlR.$base_unit_qty);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dtl_peg_no(src.peg_no());
		}
	}
	
	protected Map_PurcUtil_Srch01_DtlR_PoBulkReg_Chk01_DtlR<PurcUtil_Srch01_DtlR,PoBulkReg_Chk01_DtlR> createMap_PurcUtil_Srch01_DtlR_PoBulkReg_Chk01_DtlR() {
		return new Map_PurcUtil_Srch01_DtlR_PoBulkReg_Chk01_DtlR<PurcUtil_Srch01_DtlR, PoBulkReg_Chk01_DtlR>();
	}

	public class Map_PurcUtil_Srch01_DtlR_PoBulkReg_Chk01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends PoBulkReg_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, PoBulkReg_Chk01_DtlR.$peg_no);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$po_schd_dt, PoBulkReg_Chk01_DtlR.$po_dt);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, PoBulkReg_Chk01_DtlR.$sppl_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, PoBulkReg_Chk01_DtlR.$itm_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, PoBulkReg_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, PoBulkReg_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, PoBulkReg_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, PoBulkReg_Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, PoBulkReg_Chk01_DtlR.$maker_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, PoBulkReg_Chk01_DtlR.$in_to_loc_wg_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, PoBulkReg_Chk01_DtlR.$bom_ptn);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_cd, PoBulkReg_Chk01_DtlR.$dlv_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, PoBulkReg_Chk01_DtlR.$in_to_loc_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, PoBulkReg_Chk01_DtlR.$site_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, PoBulkReg_Chk01_DtlR.$sppl_cal_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, PoBulkReg_Chk01_DtlR.$in_to_loc_cal_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_cal_cd, PoBulkReg_Chk01_DtlR.$dlv_cal_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, PoBulkReg_Chk01_DtlR.$lg_grp_cd);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, PoBulkReg_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(PurcUtil_Srch01_DtlR.$err_flg, PoBulkReg_Chk01_DtlR.$err_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.prov_ddlv_flg(isNull(src.outsrc_sppl_cd()) ? false : true);
			if (!isNull(src.tdlv_cd())) {
				dest.lg_grp_cd(src.tdlv_lg_grp_cd());
			}
			else if (!isNull(src.dlv_cd())) {
				dest.lg_grp_cd(src.dlv_lg_grp_cd());
			}
			else {
				dest.lg_grp_cd(src.lg_grp_cd());
			}
			if (isSame(_sysParm, "1")) {
				dest.base_dt(src.rqst_avl_rqst_dt());
			}
		}
	}

	//FMCB CUSTOM END
}