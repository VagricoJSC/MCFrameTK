package mcframe.serverMSBD.MSBDL0030;

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
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBD.MSBDL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBD.MSBDL5090.MSBDL_PoSchdRegService;
import mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR;
import mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverMSBD.MSBDL0030.Query.*;

import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0110.*;
import mcframe.serverMSBD.MSBDL5040.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import mcframe.serverMSBF.MSBFL5210.*;
import java.util.HashMap;
import java.util.Map;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoSchdListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoSchdListReg_MC extends MSBDL_PoSchdListReg_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBDL_PoSchdListReg> CLAZZ = MSBDL_PoSchdListReg.class;
	//----------------------------
	// Cache
	//----------------------------
	/** 発注予定 */
	protected MCList<MST_PO_SCHD_R> _cachePoSchd = MCList.create(MST_PO_SCHD_R.class);
	/** 品目製造指図 */
	protected MCList<MST_ITM_MFG_INST_R> _itmMnfctInstL = MCList.create(MST_ITM_MFG_INST_R.class);
	protected MCList<MAVM_ITM_DTL_PURC_R> _cacheItmDtlPurc = MCList.create(MAVM_ITM_DTL_PURC_R.class);
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
	//----------------------------
	// IndexKey
	//----------------------------
	/** 発注予定 */
	protected MCIndexKey _idxCachePoSchd = null;
	/** 品目製造指図 */
	MCIndexKey _idxItmMnfctInstL = null;
	MCIndexKey _idxCacheItmDtlPurc = null;
	//----------------------------
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注予定を検索する<br>
	 */
	public class Srch01 extends MSBDL_PoSchdListReg_MC_A.Srch01 {
		/** 操作種別：依頼元訂正あり */
		protected static final String OPE_UPD_CRCT = "4";
		/** 操作種別：分割する */
		protected static final String OPE_SPLIT = "5";
		
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol();
			
			up0().setStringNE(MAM_CO_R.$base_cur_cd, getCo().base_cur_cd());
			up0().setStringNE(MAM_CO_R.$ptax_cur_cd, getCo().ptax_cur_cd());
			
			// 検索ＳＱＬ
			MCQueryPlan sql = MSBDL0030_MST_PO_SCHD_S01();
			
			// 操作種別に応じて、固有の検索条件を付与する
			if (isSame(up0().screen_ope(), OPE_UPD)) {
				sql.addDynamicSQLInfo(MSBDL0030_MST_PO_SCHD_S01_WHERE01());
			}
			else if (isSame(up0().screen_ope(), OPE_DEL)) {
				sql.addDynamicSQLInfo(MSBDL0030_MST_PO_SCHD_S01_WHERE02());
			}
			else if (isSame(up0().screen_ope(), OPE_REF)) {
				sql.addDynamicSQLInfo(MSBDL0030_MST_PO_SCHD_S01_WHERE03());
			}
			else if (isSame(up0().screen_ope(), OPE_UPD_CRCT)) {
				sql.addDynamicSQLInfo(MSBDL0030_MST_PO_SCHD_S01_WHERE04());
			}
			else if (isSame(up0().screen_ope(), OPE_SPLIT)) {
				sql.addDynamicSQLInfo(MSBDL0030_MST_PO_SCHD_S01_WHERE05());
			}
			
			// 検索実行
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void doSearchSub() {
			super.doSearchSub();
			
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			// 固定値の設定
			down0().setStringNE(Srch01_RsltR.$xrate_cd, getCo().purc_xrate_cd());
			down0().setStringNE(Srch01_RsltR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setBooleanNE(Srch01_RsltR.$tax_fix_flg, true);
			
			for (Srch01_RsltR r : down0()) {
				
				// 有効成分を設定する
				if (r.cont_fctr_flg()) {
					MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					r.cont_qty(contQty);
				}
				
				// 基準通貨金額を設定する
				MSBDL_PurcUtil.setBaseCurInfo(r);
				
				// 納税通貨金額を設定する
				MSBDL_PurcUtil.setPtaxCurInfo(r);
			}
		}
		@Override
		protected void editListSub() {
			super.editListSub();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return super.isDelFlgCtl();
		}
		
		/**
		 * 検索条件を編集します
		 */
		protected void setUpTmpCol() {
			// 発注予定状況
			if (!isSame(up0().po_schd_flg(), up0().po_flg())) {
				up0().addStringColumn("po_flg_str", MCBooleanUtil.booleanToDBString(up0().po_flg()));
			} 
						
			//発注先インボイス取引ＦＬＧ
			if (!isSame(up0().iv_trgt_flg(), up0().iv_not_trgt_flg())) {
				up0().addStringColumn("iv_trgt_flg_str", MCBooleanUtil.booleanToDBString(up0().iv_trgt_flg()));
			}
			// 打切を含みたくない場合
			if (!up0().abort_flg()) {
				up0().addStringColumn("abort_flg_str", MCBooleanUtil.booleanToDBString(false));
			}

			// 仮単価ＦＬＧ
			if (!isSame(up0().interim_flg(), up0().not_interim_flg())) {
				up0().addStringColumn("interim_flg_str", MCBooleanUtil.booleanToDBString(up0().interim_flg()));
			} 
		}
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 各予定日を取得する<br>
	 */
	public class Sprt01 extends MSBDL_PoSchdListReg_MC_A.Sprt01 {
		static final String TMP_BASE_DT = "TMP_BASE_DT";
		static final String TMP_PTAX_CUR_CD = "TMP_PTAX_CUR_CD";
		static final String TMP_PURC_XRATE_CD = "TMP_PURC_XRATE_CD";
		
		//-------------------------------------
		// indexKey
		//-------------------------------------
		/** 品目詳細 */
		MCIndexKey _idxItmDtlCache = null;
		/**　版 */
		MCIndexKey _idxItmVerCache = null;
		/**　取引マスタ（発注先 補助） */
		MCIndexKey _idxBpSubCache = null;
		//-------------------------------------
		// cache
		//-------------------------------------
		/** 品目詳細 */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		/** 取引先マスタ（発注先） */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null;
		/**　版 */
		protected MCList<MAM_ITM_VER_R> _cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
		/** 品目マスタ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
		/** 取引先マスタ（発注先 補助） */
		protected MCList<MAM_BP_R> _cacheBpSub = MCList.create(MAM_BP_R.class);
		/** 取引先品目マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItm = null;
		/** 品目マスタ（ロケール） */
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl = null;
		/** 税マスタ */
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax = null;
		/** 部門マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;
		/** 担当者権限マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _cacheUsrAcl = null;
		//-------------------------------------
		// cache作成
		//-------------------------------------
		/**
		 * キャッシュ作成（品目詳細マスタ）
		 * @param list
		 */
		protected void createItmDtlCache() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			String sysParm = getSysParm("MASTER_DT_BASE");
			MCList<Sprt01_DtlR> bindL = up0().groupBy(Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3, 
					Sprt01_DtlR.$in_to_loc_wg_cd, Sprt01_DtlR.$mfg_loc_cd, Sprt01_DtlR.$bom_ptn, isSame(sysParm, "1") ? Sprt01_DtlR.$rqst_avl_rqst_dt : Sprt01_DtlR.$po_schd_dt);
			for (Sprt01_DtlR r : bindL) {
				if (isNull(r.mfg_loc_cd()) || MAC_STR.isNULL_VAL(r.mfg_loc_cd())) {
					r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
					r.bom_ptn(MAC_STR.NULL_VAL.value());
				}
			}
			bindL.addStringColumn("rqst_loc_cd", MAC_STR.NULL_VAL.value());
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(bind("rqst_loc_cd")));
			if (isSame(sysParm, "1")) {
				cacheItmDtl_bldr.addWhereWithAnd(bind("rqst_avl_rqst_dt").between(t.st_dt, t.end_dt));
			} else {
				cacheItmDtl_bldr.addWhereWithAnd(bind("po_schd_dt").between(t.st_dt, t.end_dt));
			}
			dbSelect("MSBDL0030_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, bindL);
			_idxItmDtlCache = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd);
		}
		
		/**
		 * キャッシュ作成（取引先マスタ（発注先））
		 * @param r
		 */
		protected void createBpCache() {
			// バインド条件を編集する
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			
			// 購買品の場合は、品目詳細から、優先順の高い発注先に再設定するため、品目詳細の発注先でキャッシュをとっておく。
			for (MAM_ITM_DTL_R r : _cacheItmDtl.groupBy(MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd)) {
				if (!isNullOrNullVal(r.sppl_cd())) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.sppl_cd());
					bindL.add(spplR);
				}
				if (!isNullOrNullVal(r.maker_cd())) {
					MAM_BP_R makerR = MAM_BP_R.create();
					makerR.bp_cd(r.maker_cd());
					bindL.add(makerR);
				}
			}
			
			// 資産管理しない品目は品目詳細がないので、上ってきた発注先のキャッシュをとっておく。
			MCList<Sprt01_DtlR> assetNotMngL = up0().subList(new MCRowMatcher<Sprt01_DtlR>(){
				@Override
				public boolean match(Sprt01_DtlR row) {
					MAM_ITM_R itmR = getCacheItm(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3());
					if (MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ())) {
						return true;
					}
					return false;
				}
			});
			for (Sprt01_DtlR r : assetNotMngL) {
				if (!isNullOrNullVal(r.sppl_cd())) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.sppl_cd());
					bindL.add(spplR);	
				}
				if (!isNullOrNullVal(r.maker_cd())) {
					MAM_BP_R makerR = MAM_BP_R.create();
					makerR.bp_cd(r.maker_cd());
					bindL.add(makerR);
				}
			}
			
			// 外注品の場合は、発注先の変更は不可であるため、上ってきた発注先のキャッシュをとっておく。
			for (Sprt01_DtlR r : up0().subList(Sprt01_DtlR.$outsrc_flg, true).groupBy(Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$maker_cd)) {
				MAM_BP_R spplR = MAM_BP_R.create();
				spplR.bp_cd(r.sppl_cd());
				bindL.add(spplR);
				if (!isNullOrNullVal(r.maker_cd())) {
					MAM_BP_R makerR = MAM_BP_R.create();
					makerR.bp_cd(r.maker_cd());
					bindL.add(makerR);
				}
			}
			
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			bpL.addNumberColumn("amt_dec_place");
			bpL.addNumberColumn("upri_dec_place");
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			MAM_CUR_R m1 = MAM_CUR_R.create("M1");
			bpL_bldr.addSelect(m1.cur_nm);			
			bpL_bldr.addSelect(m1.amt_dec_place);
			bpL_bldr.addSelect(m1.upri_dec_place);
			bpL_bldr.addLeftOuterJoin(m1, bracket( m1.cur_cd.eq(t.cur_cd)));
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL, bpL_bldr, bindL, MAM_BP_R.$bp_cd);
		}
		
		/**
		 * キャッシュ作成（版マスタ）
		 * @param list
		 */
		protected void createItmVerCache() {
			_cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
			MCList<Sprt01_DtlR> bindL = up0().groupBy(Sprt01_DtlR.$itm_cd,
					Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3,
					Sprt01_DtlR.$site_cd);
			MAM_ITM_VER_R t = MAM_ITM_VER_R.create("T");
			MCQueryApiBuilder cacheItmVer_bldr = MCQueryApiBuilder.create(t);
			cacheItmVer_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmVer_bldr.addWhereWithAnd(t.site_cd.eq(bind("site_cd")));
			dbSelect("MSBDL0030_MAM_ITM_VER_S01", _cacheItmVer, cacheItmVer_bldr, bindL);
			_idxItmVerCache = _cacheItmVer.createIndex(MAM_ITM_VER_R.$itm_cd,
					MAM_ITM_VER_R.$itm_sub1, MAM_ITM_VER_R.$itm_sub2,
					MAM_ITM_VER_R.$itm_sub3, MAM_ITM_VER_R.$site_cd);
		}
		/**
		 * キャッシュ作成（品目マスタ）
		 * @param r
		 */
		protected void createItmCache() {
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")), up0(),
					Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2,
					Sprt01_DtlR.$itm_sub3);
		}
		/**
		 * キャッシュ作成（取引先マスタ（発注先 補助））
		 * @param r
		 */
		protected void createBpSubCache() {
			_cacheBpSub = MCList.create(MAM_BP_R.class);
			_cacheBpSub.addStringColumn("purc_usr_cd");
			_cacheBpSub.addStringColumn("purc_usr_nm");
			_cacheBpSub.addStringColumn("purc_dpt_cd");
			_cacheBpSub.addStringColumn("purc_dpt_nm");
			_cacheBpSub.addStringColumn("purc_dpt_wg_cd");
			_cacheBpSub.addStringColumn("purc_dpt_wg_nm");

			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder cacheBpSub_bldr = MCQueryApiBuilder.create(t);
			MAM_SPPL_USR_R m1 = MAM_SPPL_USR_R.create("M1");
			MAM_USR_R m2 = MAM_USR_R.create("M2");
			MAM_DPT_R m3 = MAM_DPT_R.create("M3");
			MAM_WG_R m4 = MAM_WG_R.create("M4");
			cacheBpSub_bldr.addSelect(m1.purc_usr_cd);
			cacheBpSub_bldr.addSelect(m2.usr_nm.as("purc_usr_nm"));
			cacheBpSub_bldr.addSelect(m1.purc_dpt_cd);
			cacheBpSub_bldr.addSelect(m3.dpt_nm.as("purc_dpt_nm"));
			cacheBpSub_bldr.addSelect(m3.wg_cd.as("purc_dpt_wg_cd"));
			cacheBpSub_bldr.addSelect(m4.wg_nm.as("purc_dpt_wg_nm"));			
			cacheBpSub_bldr.addLeftOuterJoin(m1, bracket( m1.sppl_cd.eq(t.bp_cd)
					.and(bind("reg_dt").between(m1.st_dt, m1.end_dt))));
			cacheBpSub_bldr.addLeftOuterJoin(m2, bracket( m2.usr_cd.eq(m1.purc_usr_cd)));
			cacheBpSub_bldr.addLeftOuterJoin(m3, bracket( m3.dpt_cd.eq(m1.purc_dpt_cd)
					.and(bind("reg_dt").between(m3.st_dt, m3.end_dt))));
			cacheBpSub_bldr.addLeftOuterJoin(m4, bracket( m4.wg_cd.eq(m3.wg_cd)));
			cacheBpSub_bldr.setWhere(t.bp_cd.eq(bind("sppl_cd")));
			dbSelect("MSBDL0030_MAM_BP_S01", _cacheBpSub, cacheBpSub_bldr, up0());
			
			_idxBpSubCache = _cacheBpSub.createIndex(MAM_BP_R.$bp_cd);
		}
		/**
		 * キャッシュ作成（取引先品目マスタ）
		 */
		protected void createBpItmCache() {
			_cacheBpItm = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
					MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T")), up0(),
					Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1,
					Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3);
		}
		/**
		 * キャッシュ作成（品目ロケールマスタ）
		 */
		protected void createItmLclCache() {
			_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(
					MCQueryApiBuilder.create(MAM_ITM_LCL_R.create("T")), up0(),
					Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2,
					Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$prnt_lcl_cd);
		}
		/**
		 * キャッシュ作成（税マスタ）
		 * @param r
		 */
		protected void createTaxCache() {
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T")), up0(),
					Sprt01_DtlR.$tax_cd);
		}
		/**
		 * キャッシュ作成（部門マスタ）
		 */
		protected void createDptCache() {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MAM_WG_R t2 = MAM_WG_R.create("T2");
			MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(t);
			dptL_bldr.addInnerJoin(t2, t.wg_cd.eq(t2.wg_cd));
			dptL_bldr.addSelect(t2.wg_nm);
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dptL_bldr, up0(),
					Sprt01_DtlR.$purc_dpt_cd);
		}
		/**
		 * キャッシュ作成（担当者権限マスタ）
		 */
		protected void createUsrAclCache() {
			_cacheUsrAcl = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(
					MCQueryApiBuilder.create(MAM_USR_ACL_R.create("T")), up0(),
					Sprt01_DtlR.$purc_usr_cd);
		}
		//-------------------------------------
		// cache取得
		//-------------------------------------
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtl(Sprt01_DtlR dtlR){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCache, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd());
			MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
			String sysParm = getSysParm("MASTER_DT_BASE");
			for (MAM_ITM_DTL_R r : itmDtlL) {
				if (isSame(sysParm, "1")) {
					if (dtlR.rqst_avl_rqst_dt().lt(r.end_dt())
							&& dtlR.rqst_avl_rqst_dt().gt(r.st_dt())
							&& (isNull(dtlR.sppl_cd()) || isSame(dtlR.sppl_cd(), r.sppl_cd()))) {
						rslt.add(r);
					}
				} else {
					if (dtlR.po_schd_dt().lte(r.end_dt())
							&& dtlR.po_schd_dt().gte(r.st_dt())
							&& (isNull(dtlR.sppl_cd()) || isSame(dtlR.sppl_cd(), r.sppl_cd()))) {
						rslt.add(r);
					}
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
		 * キャッシュ取得（版マスタ）
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_VER_R> getCacheItmVer(Sprt01_DtlR row){
			MCList<MAM_ITM_VER_R> itmVerL = _cacheItmVer.subList(_idxItmVerCache, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.site_cd());
			return itmVerL;
		}
		/**
		 * キャッシュ取得（品目マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
		/**
		 * キャッシュ取得（取引先品目マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_ITM_R getCacheBpItm(MCDate poSchdDt, String bpCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheBpItm.get(poSchdDt, bpCd, itmCd, itmSub1, itmSub2, itmSub3);
		}
		/**
		 * キャッシュ取得（品目（ロケール）マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_ITM_LCL_R getCacheItmLcl(String lclCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItmLcl.get(lclCd, itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * キャッシュ取得（税マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_TAX_R getCacheTax(String taxCd) {
			return _cacheTax.get(taxCd);
		}
		/**
		 * キャッシュ取得（取引先マスタ）
		 * @param r
		 * @return
		 */
		protected MAM_BP_R getCacheBpSub(String bpCd) {
			return _cacheBpSub.getFirst(_idxBpSubCache, bpCd);
		}
		/**
		 * キャッシュ取得（担当者権限マスタ）
		 * @param masterDt 適用日
		 * @param usrCd 担当者
		 * @return 担当者権限マスタ
		 */
		protected MAM_USR_ACL_R getCacheUsrAcl(MCDate masterDt, String usrCd) {
			return _cacheUsrAcl.get(masterDt, usrCd);
		}
		/**
		 * キャッシュ取得（部門マスタ）<br>購買部門の部門のみ返します。
		 * @param masterDt 適用日
		 * @param dptCd 部門ＣＤ
		 * @return 部門マスタ
		 */
		protected MAM_DPT_R getCacheDptOnlyPurcDpt(MCDate masterDt, String dptCd) {
			MAM_DPT_R purcDptR = _cacheDpt.get(masterDt, dptCd);
			if (purcDptR.purc_dpt_flg()) {
				return purcDptR;
			}
			else {
				return MAM_DPT_R.create();
			}
		}
		//-------------------------------------
		// 主処理
		//-------------------------------------
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 最新マスタのキャッシュ作成
			createMstr();
			// 最新マスタ値の反映
			setLatestMstr();
			// 予定日計算
			callPurcUtilSrch01();
			// 詳細情報の設定
			cmplBaseInfo();
			// 下り電文設定
			setDown();
		}
		
		/**
		 * マスタを再取得します
		 */
		protected void createMstr() {
			// 品目
			createItmCache();
			// 品目詳細
			createItmDtlCache();
			// 取引先
			createBpCache();
			// 版
			createItmVerCache();
		}
		
		/**
		 * マスタ最新値を設定します
		 */
		protected void setLatestMstr() {
			for (Sprt01_DtlR r : up0()) {
				if (!r.outsrc_flg()) {
					// 発注先・メーカ
					setSpplMaker(r);
				}
				// 発注先情報
				setSpplMakerInfo(r);
			}
		}
		
		/**
		 * 発注先を設定します
		 * @param dtlR
		 */
		protected void setSpplMaker(Sprt01_DtlR dtlR) {
			if (!isNull(dtlR.sppl_cd()) && !isNull(dtlR.maker_cd())) {
				return;
			}
			MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtl(dtlR);
			itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$st_dt);
			if (isNull(itmDtlL)) {
				return;
			}
			MAM_ITM_DTL_R itmDtlR = itmDtlL.get(0);
			dtlR.sppl_cd(itmDtlR.sppl_cd());
			dtlR.maker_cd(itmDtlR.maker_cd());
		}

		/**
		 * 発注先情報を設定します
		 * @param dtlR
		 */
		protected void setSpplMakerInfo(Sprt01_DtlR dtlR) {
			if (isNull(dtlR.sppl_cd())) {
				return;
			}
			MAM_BP_R bpR = getCacheBp(dtlR.sppl_cd());
			dtlR.sppl_nm(bpR.bp_nm());
			dtlR.sppl_iv_flg(bpR.sppl_iv_flg());
			dtlR.sppl_cal_cd(bpR.sppl_cal_cd());
			dtlR.sppl_purc_upri_cng_flg(bpR.purc_upri_cng_flg());
			dtlR.purc_upri_req_typ(nvl(bpR.purc_upri_req_typ(), getCo().purc_upri_req_typ()));
			dtlR.purc_amt_rnd_typ(bpR.purc_amt_rnd_typ());
			dtlR.purc_tax_rnd_typ(bpR.purc_tax_rnd_typ());
			dtlR.prnt_lcl_cd(bpR.prnt_lcl_cd());
			
			dtlR.trd_cur_cd(bpR.cur_cd());			
			dtlR.trd_cur_nm(bpR.getStringNE("cur_nm"));
			dtlR.trd_cur_amt_dec_place(bpR.getNumberNE("amt_dec_place"));
			dtlR.trd_cur_upri_dec_place(bpR.getNumberNE("upri_dec_place"));
			
			MAM_BP_R makerR = getCacheBp(dtlR.maker_cd());
			if (!isNull(makerR)) {
				dtlR.maker_nm(makerR.bp_nm());	
			}
		}
		
		/**
		 * 版ＮＯを設定します
		 * @param dtlR
		 */
		protected void setItmVerInfo(Sprt01_DtlR dtlR) {
			MCList<MAM_ITM_VER_R> itmVerL = getCacheItmVer(dtlR);
			if (isNull(itmVerL)) {
				return;
			}
			itmVerL.sort(mcframe.commonCore.container.MCList.SortType.DESC, MAM_ITM_VER_R.$purc_st_dt);
			for (MAM_ITM_VER_R itmVerR : itmVerL) {
				if (dtlR.rqst_avl_rqst_dt().gte(itmVerR.purc_st_dt())) {
					dtlR.ver_no(itmVerR.ver_no());
					return;
				}
			}
		}
		
		/**
		 * 購買ユーティリティをコールします。
		 */
		protected void callPurcUtilSrch01() {
			setPegNo(up0());
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), up0(), createMap_PurcUtil_Srch01_DtlR_Sprt01_DtlR());
			purcUtilSrch01.exec();
			String[] srcCols = {PurcUtil_Srch01_DtlR.$po_schd_dt, PurcUtil_Srch01_DtlR.$rqst_dlv_rqst_dt, PurcUtil_Srch01_DtlR.$dlv_rqst_dt, PurcUtil_Srch01_DtlR.$purc_schd_dt};
			String[] destCols = {Sprt01_DtlR.$po_schd_dt, Sprt01_DtlR.$rqst_avl_rqst_dt, Sprt01_DtlR.$dlv_rqst_dt, Sprt01_DtlR.$purc_schd_dt};
			copyByPegNo(up0(), destCols, purcUtilSrch01.down0(), srcCols);
		}
		
		/**
		 * 基本情報の補完
		 */
		protected void cmplBaseInfo() {
			// 発注先に関連する情報を取得する
			createBpSubCache();
			// 発注先品目に関する情報を取得する
			createBpItmCache();
			// 品目（ロケール）情報を取得する
			createItmLclCache();
			// 担当者権限マスタを取得する
			createUsrAclCache();
			// 部門マスタを取得する
			createDptCache();
			// 補完
			for (Sprt01_DtlR r : up0()) {
				MAM_BP_R bpSubR = getCacheBpSub(r.sppl_cd());
				if (!isNull(bpSubR)) {
					if (isNullAnd(r.purc_usr_cd(), r.purc_dpt_cd())) {
						r.purc_usr_cd(bpSubR.getStringNE("purc_usr_cd"));
						r.purc_usr_nm(bpSubR.getStringNE("purc_usr_nm"));
						r.purc_dpt_cd(bpSubR.getStringNE("purc_dpt_cd"));
						r.purc_dpt_nm(bpSubR.getStringNE("purc_dpt_nm"));
						r.purc_dpt_wg_cd(bpSubR.getStringNE("purc_dpt_wg_cd"));
						r.purc_dpt_wg_nm(bpSubR.getStringNE("purc_dpt_wg_nm"));
					}
					if (!isNull(r.purc_usr_cd()) && isNull(r.purc_dpt_cd())) {
						MAM_USR_ACL_R usrAclR = getCacheUsrAcl(r.reg_dt(), r.purc_usr_cd());
						MAM_DPT_R purcDptR = getCacheDptOnlyPurcDpt(r.reg_dt(), usrAclR.dpt_cd());
						r.purc_dpt_cd(purcDptR.dpt_cd());
						r.purc_dpt_nm(purcDptR.dpt_nm());
						r.purc_dpt_wg_cd(purcDptR.wg_cd());
						r.purc_dpt_wg_nm(purcDptR.getStringNE("wg_nm"));
					}
				}
				
				// 版ＮＯ
				if (r.ver_flg() && isNull(r.ver_no())) {
					setItmVerInfo(r);
				}
				
				// IV表記品名
				if (r.sppl_iv_flg()) {
					MAM_ITM_LCL_R itmLclR = getCacheItmLcl(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),r.prnt_lcl_cd());
					r.iv_itm_nm(itmLclR.itm_nm());
				}
				else {
					r.iv_itm_nm(null);
				}
				
				// 発注先品目・品名
				MAM_BP_ITM_R bpItmR = getCacheBpItm(r.po_schd_dt(), r.sppl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.sppl_itm_cd(bpItmR.bp_itm_cd());
				r.sppl_itm_nm(bpItmR.bp_itm_nm());
				
				// 税取得用基準日
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())) {
					r.setDateNE(TMP_BASE_DT, r.po_schd_dt());
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(r.purc_upri_req_typ())) {
					r.setDateNE(TMP_BASE_DT, r.dlv_rqst_dt());
				}
				else {
					r.setDateNE(TMP_BASE_DT, r.purc_schd_dt());
				}
			}
			// 税情報を取得する
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					Sprt01_DtlR.$tax_cd, up0(), Sprt01_DtlR.$itm_cd,
					Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub3,
					Sprt01_DtlR.$sppl_cd, TMP_BASE_DT);
			createTaxCache();
			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.tax_cd())) {
					MAM_TAX_R taxR = getCacheTax(r.tax_cd());
					r.tax_nm(taxR.tax_nm());
					r.tax_rate(taxR.tax_rate());
					r.tax_typ(taxR.tax_typ());
					r.inc_tax_flg(taxR.inc_tax_flg());
				}
			}
			
			// 為替レートを取得する
			setXrate();
			
			// 納税為替レートを算出する
			setPtaxXrate();
		}
		
		/**
		 * 為替レートを設定します
		 */
		protected void setXrate() {
			// 為替レート
			MCList<Sprt01_DtlR> tmpXrateTgtL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> tmpXrateNonTgtL = MCList.create(Sprt01_DtlR.class);
			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.trd_cur_cd())) {
					if (!isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
						tmpXrateTgtL.add(r);
					}
					else {
						tmpXrateNonTgtL.add(r);	
					}
				}
			}
			tmpXrateNonTgtL.setNumberNE(Sprt01_DtlR.$xrate, MCNumber.ONE);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE_NE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_PURC_XRATE_NE"),
					Sprt01_DtlR.$xrate, tmpXrateTgtL, Sprt01_DtlR.$trd_cur_cd,
					Sprt01_DtlR.$reg_dt);
			String[] destCols = new String[]{Sprt01_DtlR.$xrate};
			String[] srcCols = new String[]{Sprt01_DtlR.$xrate};
			copyByPegNo(up0(), destCols, tmpXrateTgtL, srcCols);
			copyByPegNo(up0(), destCols, tmpXrateNonTgtL, srcCols);
		}
		
		/**
		 * 納税為替レートを設定します。
		 */
		protected void setPtaxXrate() {
			// 納税為替レート
			if (isNull(getCo().ptax_cur_cd())) {
				return;
			}
			// 納税為替レート
			MCList<Sprt01_DtlR> tmpPtaxXrateTgtL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> tmpPtaxXrateNonTgtL = MCList.create(Sprt01_DtlR.class);
			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.trd_cur_cd())) {
					if (!isSame(r.trd_cur_cd(), getCo().ptax_cur_cd())) {
						tmpPtaxXrateTgtL.add(r);
					}
					else {
						tmpPtaxXrateNonTgtL.add(r);	
					}
				}
			}
			tmpPtaxXrateNonTgtL.setNumberNE(Sprt01_DtlR.$ptax_xrate, MCNumber.ONE);
			
			tmpPtaxXrateTgtL.addStringColumn(TMP_PTAX_CUR_CD, getCo().ptax_cur_cd());
			tmpPtaxXrateTgtL.addStringColumn(TMP_PURC_XRATE_CD, getCo().purc_xrate_cd());
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE_NE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_XRATE_NE"),
					Sprt01_DtlR.$ptax_xrate, tmpPtaxXrateTgtL, Sprt01_DtlR.$trd_cur_cd,
					TMP_PTAX_CUR_CD, TMP_PURC_XRATE_CD, Sprt01_DtlR.$reg_dt);
			String[] destCols = new String[]{Sprt01_DtlR.$ptax_xrate};
			String[] srcCols = new String[]{Sprt01_DtlR.$ptax_xrate};
			copyByPegNo(up0(), destCols, tmpPtaxXrateTgtL, srcCols);
			copyByPegNo(up0(), destCols, tmpPtaxXrateNonTgtL, srcCols);
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		/** 予定日・マスタ取得 */
		protected Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<PurcUtil_Srch01_DtlR,Sprt01_DtlR> createMap_PurcUtil_Srch01_DtlR_Sprt01_DtlR() {
			return new Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<PurcUtil_Srch01_DtlR, Sprt01_DtlR>();
		}
		public class Map_PurcUtil_Srch01_DtlR_Sprt01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$rqst_dlv_rqst_dt, Sprt01_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_rqst_dt, Sprt01_DtlR.$dlv_rqst_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$po_schd_dt, Sprt01_DtlR.$po_schd_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$purc_schd_dt, Sprt01_DtlR.$purc_schd_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Sprt01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Sprt01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Sprt01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_cd, Sprt01_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Sprt01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Sprt01_DtlR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Sprt01_DtlR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Sprt01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_cal_cd, Sprt01_DtlR.$dlv_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, Sprt01_DtlR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Sprt01_DtlR.$in_to_loc_wg_cd);
				
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
				String sysParm = getSysParm("MASTER_DT_BASE");
				if (isSame(sysParm, "1")) {
					dest.base_dt(src.rqst_avl_rqst_dt());
				}
			}
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 単価情報を取得します<br>
	 */
	public class Sprt02 extends MSBDL_PoSchdListReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setUpriInfo();
		}
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			setPegNo(up0());
			
			MCList<Sprt02_DtlR> tmpL = MCList.create(Sprt02_DtlR.class);
			for (Sprt02_DtlR r : up0()) {
				// 発注予定の段階では単価は必須ではない（また、単価取得に必要な発注先なども必須ではない）ので、単価が取得できない場合は特に何もしない。
				if (!isNullOr(
						  r.base_dt()
						, r.sppl_cd()
						, r.trd_cur_cd()
						, r.in_to_loc_wg_cd()
						, r.in_to_loc_cd()
						, r.itm_cd()
						, r.itm_sub1()
						, r.itm_sub2()
						, r.itm_sub3()
						, r.trd_unit_cd()
						, r.trd_unit_qty()
						, r.base_unit_qty())){
					
					// 外注の場合に単価取得で必要な項目の確認
					String sysParm = getSysParm("MASTER_DT_BASE");
					if (isSame(sysParm, "1")) {
						if (r.outsrc_flg() 
								&& (isNullOr(r.mfg_loc_cd(), r.bom_ptn(), r.outsrc_itm_ord_no(), r.rqst_avl_rqst_dt()))) {
							continue;
						}
					} else {
						if (r.outsrc_flg() 
								&& (isNullOr(r.mfg_loc_cd(), r.bom_ptn(), r.outsrc_itm_ord_no(), r.po_schd_dt(), r.rqst_avl_rqst_dt()))) {
							continue;
						}
					}
					tmpL.add(r);
				}
			}
			
			if (tmpL.size() > 0) {
				// サービスコール
				MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
				addAll(purcUtilSrch02.up0(), tmpL, createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR());
				
				purcUtilSrch02.exec();
				String[] destCols = {Sprt02_DtlR.$trd_cur_upri, Sprt02_DtlR.$trd_cur_proc_upri, Sprt02_DtlR.$trd_cur_onr_prov_upri, Sprt02_DtlR.$interim_flg};
				String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
				copyByPegNo(tmpL, destCols, purcUtilSrch02.down0(), srcCols);
			}
			
			down0().setAll(up0());
		}
		
		protected Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR,Sprt02_DtlR> createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR, Sprt02_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Sprt02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Sprt02_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Sprt02_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Sprt02_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Sprt02_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Sprt02_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, Sprt02_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Sprt02_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Sprt02_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Sprt02_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, Sprt02_DtlR.$trd_cur_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Sprt02_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Sprt02_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, Sprt02_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Sprt02_DtlR.$base_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Sprt02_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, Sprt02_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, Sprt02_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, Sprt02_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Sprt02_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Sprt02_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Sprt02_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Sprt02_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, Sprt02_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Sprt02_DtlR.$base_unit_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.grp_no(dest.peg_no().toString());
				String sysParm = getSysParm("MASTER_DT_BASE");
				if (isSame(sysParm, "1")) {
					dest.itmdtl_base_dt(src.rqst_avl_rqst_dt());
				} else {
					dest.itmdtl_base_dt(src.po_schd_dt());
				}
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 納品先情報を取得します<br>
	 */
	public class Sprt03 extends MSBDL_PoSchdListReg_MC_A.Sprt03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setPegNo(up0());
			setDlvInfo();
			setDown();
		}
		
		/**
		 * 納品先情報を設定します
		 */
		protected void setDlvInfo () {
			MSBDL_PurcUtil.PurcUtil_Srch03 purcUtilSrch03 = MSBDL_PurcUtil.crtPurcUtil_Srch03();
			addAll(purcUtilSrch03.up0(), up0(), createMap_PurcUtil_Srch03_DtlR_Sprt03_DtlR());
			purcUtilSrch03.exec();
			
			String[] destCols = makeDestCol();
			String[] srcCols = makeSrcCol();
			copyByPegNo(up0(), destCols, purcUtilSrch03.down0(), srcCols);
		}
		
		/**
		 * コピー先カラムを設定します。
		 * @return
		 */
		protected String[] makeDestCol() {
			String[] destCols = {Sprt03_DtlR.$in_to_loc_cd,
					Sprt03_DtlR.$in_to_loc_nm,
					Sprt03_DtlR.$outsrc_sppl_cd,
					Sprt03_DtlR.$pri_prnt_flg,
					Sprt03_DtlR.$str_ln_tgt_flg,
					Sprt03_DtlR.$loc_mng_typ,
					Sprt03_DtlR.$in_to_loc_cal_cd,
					Sprt03_DtlR.$site_cd,
					Sprt03_DtlR.$lg_grp_cd,
					Sprt03_DtlR.$str_ln_cd,
					Sprt03_DtlR.$str_ln_nm,
					Sprt03_DtlR.$str_ln_cd_none_flg,
					Sprt03_DtlR.$dlv_cd,
					Sprt03_DtlR.$dlv_sundry_flg,
					Sprt03_DtlR.$dlv_nm,
					Sprt03_DtlR.$dlv_cntct_dpt,
					Sprt03_DtlR.$dlv_cntct_psn,
					Sprt03_DtlR.$dlv_zip_cd,
					Sprt03_DtlR.$dlv_addr1,
					Sprt03_DtlR.$dlv_addr2,
					Sprt03_DtlR.$dlv_addr3,
					Sprt03_DtlR.$dlv_addr4,
					Sprt03_DtlR.$dlv_lg_grp_cd,
					Sprt03_DtlR.$dlv_tel,
					Sprt03_DtlR.$dlv_fax,
					Sprt03_DtlR.$dlv_cal_cd,
					Sprt03_DtlR.$tdlv_cd,
					Sprt03_DtlR.$tdlv_sundry_flg,
					Sprt03_DtlR.$tdlv_nm,
					Sprt03_DtlR.$tdlv_cntct_dpt,
					Sprt03_DtlR.$tdlv_cntct_psn,
					Sprt03_DtlR.$tdlv_zip_cd,
					Sprt03_DtlR.$tdlv_addr1,
					Sprt03_DtlR.$tdlv_addr2,
					Sprt03_DtlR.$tdlv_addr3,
					Sprt03_DtlR.$tdlv_addr4,
					Sprt03_DtlR.$tdlv_lg_grp_cd,
					Sprt03_DtlR.$tdlv_tel,
					Sprt03_DtlR.$tdlv_fax};
			return destCols;
		}
		
		/**
		 * コピー元カラムを設定します。
		 * @return
		 */
		protected String[] makeSrcCol() {
			String[] srcCols = {PurcUtil_Srch03_DtlR.$in_to_loc_cd,
					PurcUtil_Srch03_DtlR.$in_to_loc_nm,
					PurcUtil_Srch03_DtlR.$outsrc_sppl_cd,
					PurcUtil_Srch03_DtlR.$pri_prnt_flg,
					PurcUtil_Srch03_DtlR.$str_ln_tgt_flg,
					PurcUtil_Srch03_DtlR.$loc_mng_typ,
					PurcUtil_Srch03_DtlR.$in_to_loc_cal_cd,
					PurcUtil_Srch03_DtlR.$site_cd,
					PurcUtil_Srch03_DtlR.$lg_grp_cd,
					PurcUtil_Srch03_DtlR.$str_ln_cd,
					PurcUtil_Srch03_DtlR.$str_ln_nm,
					PurcUtil_Srch03_DtlR.$str_ln_cd_none_flg,
					PurcUtil_Srch03_DtlR.$dlv_cd,
					PurcUtil_Srch03_DtlR.$dlv_sundry_flg,
					PurcUtil_Srch03_DtlR.$dlv_nm,
					PurcUtil_Srch03_DtlR.$dlv_cntct_dpt,
					PurcUtil_Srch03_DtlR.$dlv_cntct_psn,
					PurcUtil_Srch03_DtlR.$dlv_zip_cd,
					PurcUtil_Srch03_DtlR.$dlv_addr1,
					PurcUtil_Srch03_DtlR.$dlv_addr2,
					PurcUtil_Srch03_DtlR.$dlv_addr3,
					PurcUtil_Srch03_DtlR.$dlv_addr4,
					PurcUtil_Srch03_DtlR.$dlv_lg_grp_cd,
					PurcUtil_Srch03_DtlR.$dlv_tel,
					PurcUtil_Srch03_DtlR.$dlv_fax,
					PurcUtil_Srch03_DtlR.$dlv_cal_cd,
					PurcUtil_Srch03_DtlR.$tdlv_cd,
					PurcUtil_Srch03_DtlR.$tdlv_sundry_flg,
					PurcUtil_Srch03_DtlR.$tdlv_nm,
					PurcUtil_Srch03_DtlR.$tdlv_cntct_dpt,
					PurcUtil_Srch03_DtlR.$tdlv_cntct_psn,
					PurcUtil_Srch03_DtlR.$tdlv_zip_cd,
					PurcUtil_Srch03_DtlR.$tdlv_addr1,
					PurcUtil_Srch03_DtlR.$tdlv_addr2,
					PurcUtil_Srch03_DtlR.$tdlv_addr3,
					PurcUtil_Srch03_DtlR.$tdlv_addr4,
					PurcUtil_Srch03_DtlR.$tdlv_lg_grp_cd,
					PurcUtil_Srch03_DtlR.$tdlv_tel,
					PurcUtil_Srch03_DtlR.$tdlv_fax};
			return srcCols;
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
		
		protected Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<PurcUtil_Srch03_DtlR,Sprt03_DtlR> createMap_PurcUtil_Srch03_DtlR_Sprt03_DtlR() {
			return new Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<PurcUtil_Srch03_DtlR, Sprt03_DtlR>();
		}

		public class Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<D extends PurcUtil_Srch03_DtlR, S extends Sprt03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch03_DtlR.$peg_no, Sprt03_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch03_DtlR.$slo_d_no, Sprt03_DtlR.$slo_d_no);
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェック<br>
	 */
	public class Chk01 extends MSBDL_PoSchdListReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			// 後続処理のエラーチェック
			callPoSchdRegChk(getChkList(up0()));
			setErrToRtnStsTyp();
			// 下り電文設定
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			getDataForExistChk(up0());
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind trdBind = getListLogicBind(up0(), Chk01_DtlR.$trd_cd);
			trdBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.TrdCols.$i_func_id, (Comparable<?>)"MSBDP0030");
			String sysParm = getSysParm("MASTER_DT_BASE");
			ListLogicBind spplBind = getListLogicBind(up0(), Chk01_DtlR.$sppl_cd);
			if (isSame(sysParm, "1")) {
				spplBind .putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.BpCols.$i_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			compl();
			// チェック後の補完処理
			completionAfterDoServerCheck(getChkList(up0()));
			msgL.addAll(thisCheck());
			msgL.addAll(chkDac(up0()));
			return msgL;
		}

		protected void compl() {
			for (Chk01_DtlR r : up0()) {
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nullValToNull(r.sno1()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nullValToNull(r.sno2()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nullValToNull(r.sno3()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nullValToNull(r.sno4()));
				}

			}
		}
		
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, Chk01_DtlR.$itm_nm)) {
					if (row.getBoolean(Chk01_DtlR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			createItmCache(up0());
			createItmDtlPurcCache(up0());
		}
		/**
		 * 更新カウンタチェック、補完処理、更新前データのＤＡＣチェック処理を行います。
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			up0().setStringNE(Chk01_DtlR.$base_cur_cd, getCo().base_cur_cd());
			up0().setStringNE(Chk01_DtlR.$ptax_cur_cd, getCo().ptax_cur_cd());
			for (Chk01_DtlR dtlR : up0()) {
				dtlR.rqst_dlv_rqst_tm(dtlR.dlv_rqst_tm());
				if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
					dtlR.xrate(MCNumber.ONE);
				}
				if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
					dtlR.ptax_xrate(MCNumber.ONE);
				}
				// 通貨がNULLの場合は単価をNULLで補完
				if (isNull(dtlR.trd_cur_cd())) {
					dtlR.upri_not_tgt_flg(false);
					dtlR.trd_cur_upri(null);
					dtlR.trd_cur_proc_upri(null);
					dtlR.trd_cur_onr_prov_upri(null);
					dtlR.interim_flg(false);
					dtlR.xrate(null);
					dtlR.ptax_xrate(null);
				}
				if(!isNull(dtlR.bd_itm_cd())) {
					dtlR.bd_itm_sub1(nvl(dtlR.bd_itm_sub1(), MAC_STR.NULL_VAL.value()));
					dtlR.bd_itm_sub2(nvl(dtlR.bd_itm_sub2(), MAC_STR.NULL_VAL.value()));
					dtlR.bd_itm_sub3(nvl(dtlR.bd_itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
			}
			// レート補完
			MCList<Chk01_DtlR>[] grpL = up0().groupList(Chk01_DtlR.$reg_dt, Chk01_DtlR.$trd_cur_cd);
			for (MCList<Chk01_DtlR> tmpL : grpL) {
				if (isNull(tmpL.get(0).reg_dt()) || isNull(tmpL.get(0).trd_cur_cd())) {
					continue;
				}
				Chk01_DtlR bindR = Chk01_DtlR.create();
				bindR.reg_dt(tmpL.get(0).reg_dt());
				bindR.trd_cur_cd(tmpL.get(0).trd_cur_cd());
				bindR.ptax_cur_cd(getCo().ptax_cur_cd());
				bindR.xrate_cd(getCo().purc_xrate_cd());

				MCNumber xrate = null;
				MCNumber ptaxXrate = null;

				for (Chk01_DtlR r : tmpL) { 
					if (!r.xrate_inpt_flg()) {
						if (isNull(xrate)) {
							xrate = execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE", "01"),
									MAPA_XCHNG$F_GET_PURC_XRATE(bind("trd_cur_cd"), bind("reg_dt")), bindR);
						}
						r.xrate_cd(getCo().purc_xrate_cd());
						r.xrate(xrate);
					}
					if (!isNull(bindR.ptax_cur_cd())) {
						if (!r.ptax_xrate_inpt_flg()) {
							if (isNull(ptaxXrate)) {
								ptaxXrate = execFuncNumber(
										createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
										MAPA_XCHNG$F_GET_XRATE(bind("trd_cur_cd"), bind("ptax_cur_cd"), bind("xrate_cd"), bind("reg_dt")),
										bindR);
							}
							r.ptax_xrate(ptaxXrate);
						}						
					}
					else {
						r.ptax_xrate_inpt_flg(false);
						r.ptax_xrate(null);
					}
				}
			}
				
			return msgL;  
		}
		/**
		 * サーバーチェック処理後の補完処理
		 */
		protected void completionAfterDoServerCheck(MCList<Chk01_DtlR> dtlL) {
			for (Chk01_DtlR dtlR : dtlL) {
				// 直納区分
				setDrctDlvTyp(dtlR);
				// 税指定（発注予定の段階では税指定の概念が無いが、ファイル入力を考慮し、部品の入力制御のために必要。）
				dtlR.tax_fix_flg(true);
				// 値引品の場合
				if (dtlR.dscnt_itm_flg()) {
					dtlR.trd_unit_qty(MCNumber.ONE);
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
					dtlR.trd_unit_rnd_typ(dtlR.base_unit_rnd_typ());
					dtlR.trd_unit_dec_place(dtlR.base_unit_dec_place());
				}
				// 基準単位数量の設定
				completionBaseUnitInfo(dtlR);
				if (!dtlR.sppl_iv_flg()) {
					dtlR.iv_itm_nm(null);
				}
			}
		}
		
		/**
		 *　本機能固有のチェック
		 * @return
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			// 品目詳細マスタチェック
			msgL.addAll(checkExistItmDtl(getChkList(up0())));
			msgL.addAll(checkPurcItm(getChkList(up0())));
			// 負担項目NO存在チェック
			msgL.addAll(existBdCheck(up0()));
			// 新規・更新時共通チェック
			msgL.addAll(checkCmn(getChkList(up0())));
			return msgL;
		}
		/**
		 * 発注予定ＳＶチェック処理呼び出し
		 * @param list
		 */
		protected void callPoSchdRegChk(MCList<Chk01_DtlR> list){
			MSBDL_PoSchdRegService.PoSchd_Chk01 poSchdReg = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
			for (Chk01_DtlR r : list) {
				PoSchd_Upd01_DtlR dtlR = PoSchd_Upd01_DtlR.create();
				copy(dtlR, r, createMap_PoSchd_Upd01_DtlR_Chk01_DtlR());
				poSchdReg.up0().add(dtlR);
			}
			poSchdReg.exec();
			
			copyErrFlg(list, poSchdReg.down0());
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 訂正前チェック<br>
	 */
	public class Chk02 extends MSBDL_PoSchdListReg_MC_A.Chk02 {
		//--------------------------------
		// Cache
		//--------------------------------
		/** 受注明細 */
		protected MCList<MST_SLO_D_R> _cacheSloD = MCList.create(MST_SLO_D_R.class);
		
		//--------------------------------
		// IndexKey
		//--------------------------------
		/** 受注明細 */
		protected MCIndexKey _idxCacheSloD = null;
		
		//--------------------------------
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			// 後続処理のエラーチェック
			callPoSchdRegChk(getChkList(up0()));
			setErrToRtnStsTyp();
			// 下り電文設定
			setDown();
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			for (Chk01_DtlR r : up0()) {
				msgL.addAll(check(r, Chk01_DtlR.$po_schd_no, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			//打切行の補完
			completionAbort();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up0());
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}

		/**
		 * 打切データの上り電文項目の補完
		 */
		protected void completionAbort() {
			for (Chk01_DtlR r : up0()) {
				MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, r.po_schd_no());
				if (r.abort_flg() || (!isNull(poSchdR) && poSchdR.abort_flg())) {
					getAbortCompCols().forEach(col -> r.setValue(col, poSchdR.getValue(col)));
					r.str_ln_cd_none_flg(MAUCL_MCDataUtil.isNullOrNullVal(r.str_ln_cd()));
				}
			}
		}
		protected List<String> _abortCompCols = null;
		/**
		 * 打切時に発注予定トランザクションから取得する項目のリスト
		 */
		protected List<String> getAbortCompCols() {
			if (_abortCompCols == null) {
				MST_PO_SCHD_R ps = MST_PO_SCHD_R.create();
				_abortCompCols =  Arrays.asList(PDef.MS_MSBDL0030_Chk02_UP_BLOCK0().transItems())
						.stream().filter(i-> !i.isIgnore() && !i.isInnerRow()
								&& !isSame(i.id, Chk01_DtlR.$abort_flg)
								&& ps.contains(i.id)
								)
						.map(i-> i.id).collect(Collectors.toList());
			}
			return _abortCompCols;
		}
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			// チェック後の補完処理
			completionAfterDoServerCheck();
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkDacPo(_cachePoSchd));
			msgL.addAll(chkDac(up0()));
			msgL.addAll(thisCheck());
			return msgL;
		}
		
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, Chk01_DtlR.$itm_nm)) {
					if (row.getBoolean(Chk01_DtlR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up0());
			// 受注明細
			createCacheSloD();
			// 品目製造指図
			createCacheItmMnfctInst();
		}
		
		/**
		 * キャッシュ作成（受注明細）
		 * @param dtlL
		 * @return
		 */
		protected void createCacheSloD () {
			// 対応する受注情報を取得
			_cacheSloD = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder cacheSloD_bldr = MCQueryApiBuilder.create(t);
			cacheSloD_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
			dbSelect("MSBDL0030_MST_SLO_D_S01", _cacheSloD, cacheSloD_bldr, _cachePoSchd);
			_idxCacheSloD = _cacheSloD.createIndex(MST_SLO_D_R.$slo_d_no);
		}
		
		/**
		 * 更新カウンタチェック、補完処理、更新前データのＤＡＣチェック処理を行います。
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定補完
			msgL.addAll(completionPoSchd());
			return msgL;  
		}
		/**
		 * 訂正前発注予定から、値を補完します
		 * @param list
		 * @return
		 */
		protected MCMessageList completionPoSchd(){
			MCList<Chk01_DtlR> list = getChkList(up0());
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : list) {
				MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, r.po_schd_no());
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$po_schd_upd_cntr, poSchdR));
				if (msgL.size() == 0) {
					// リストロジックのキー項目、後続チェック処理に必要な項目のみ補完
					r.itm_cd(poSchdR.itm_cd());
					r.itm_sub1(poSchdR.itm_sub1());
					r.itm_sub2(poSchdR.itm_sub2());
					r.itm_sub3(poSchdR.itm_sub3());
					
					r.po_schd_src_typ(poSchdR.po_schd_src_typ());
					r.po_schd_src_no(poSchdR.po_schd_src_no());
					r.io_schd_pr_no(poSchdR.io_schd_pr_no());
					r.slo_no(poSchdR.slo_no());
					r.slo_d_no(poSchdR.slo_d_no());
					r.outsrc_flg(poSchdR.outsrc_flg());
					r.pln_itm_ord_no(poSchdR.pln_itm_ord_no());
					r.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
					r.mfg_loc_cd(poSchdR.mfg_loc_cd());
					r.bom_ptn(poSchdR.bom_ptn());
					if (!MSC_PO_SCHD_SRC_TYP.isUPLND(r.po_schd_src_typ())) {
						r.trd_cd(poSchdR.trd_cd());
						r.trd_ptn_typ(poSchdR.trd_ptn_typ());
						r.rqst_dlv_rqst_tm(poSchdR.rqst_dlv_rqst_tm());
						r.itm_nm(poSchdR.itm_nm());
					}
					else {
						r.rqst_dlv_rqst_tm(r.dlv_rqst_tm());
					}
						
					
					if (r.outsrc_flg()) {
						r.sppl_cd(poSchdR.sppl_cd());
						r.maker_cd(poSchdR.maker_cd());
						r.trd_unit_qty(poSchdR.trd_unit_qty());
						r.sno1(poSchdR.sno1());
						r.sno2(poSchdR.sno2());
						r.sno3(poSchdR.sno3());
						r.sno4(poSchdR.sno4());
					}
				}
			}
			return msgL;
		}
		
		/**
		 * その他補完処理
		 */
		protected void completionAfterDoServerCheck() {
			for (Chk01_DtlR dtlR : up0()) {
				// 品名
				if (!dtlR.sundry_itm_flg()) {
					dtlR.itm_nm(null);
					dtlR.iv_itm_nm(null);
				}
				// 直納区分
				setDrctDlvTyp(dtlR);
				
				// 基準単位数量の設定
				completionBaseUnitInfo(dtlR);
			}
		}
		
		/**
		 *　本機能固有のチェック
		 * @return
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			// 品目詳細マスタチェック
			msgL.addAll(checkExistItmDtl(getChkList(up0())));
			// 負担項目NO存在チェック
			msgL.addAll(existBdCheck(up0()));
			// 新規・更新時共通チェック
			msgL.addAll(checkCmn(up0()));
			// 更新時固有チェック
			msgL.addAll(thisCheckSub());
			return msgL;
		}
		
		/**
		 * 更新時固有のチェック
		 * @return
		 */
		protected MCMessageList thisCheckSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> subL = getChkList(up0());
			for (Chk01_DtlR dtlR : subL) {
				// 納品先チェック（受注紐付の場合）
				if (!isNull(dtlR.slo_d_no())) {
					MST_SLO_D_R sloDR = _cacheSloD.getFirst(_idxCacheSloD, dtlR.slo_d_no());
					if (!isNull(sloDR) && MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ()) && !isNull(dtlR.dlv_cd())) {
						// 仕入直送の場合のみ、納品先と数量のチェックを行う
						if (diffSloDlvInfo(dtlR, sloDR)) {
							// 受注紐付の場合は、受注明細の納品先と同じでないといけない。
							msgL.add(new MCMessage(dtlR, null , MSBDL0088));
						}
						if (diffSloQtyInfo(dtlR, sloDR)) {
							// 受注紐付の場合は、受注明細の数量と同じでないといけない。
							msgL.add(new MCMessage(dtlR, Chk01_DtlR.$trd_unit_qty, MSBDL0161, sloDR.base_unit_qty(), dtlR.base_unit_qty(), toDispGUIIndex(dtlR)));	
						}
					}
				}
				// 品目製造指図がいたら打切不可
				MST_ITM_MFG_INST_R itmMnfctInstR = _itmMnfctInstL.getFirst(_idxItmMnfctInstL, dtlR.outsrc_itm_ord_no());
				if (!isNull(itmMnfctInstR) && dtlR.abort_flg()) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0070, dtlR.po_schd_no(), toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}
		/**
		 * 発注予定ＳＶチェック処理呼び出し
		 * @param list
		 */
		protected void callPoSchdRegChk(MCList<Chk01_DtlR> list){
			MSBDL_PoSchdRegService.PoSchd_Chk01 poSchdReg = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
			for (Chk01_DtlR r : list) {
				PoSchd_Upd01_DtlR dtlR = PoSchd_Upd01_DtlR.create();
				copy(dtlR, r, createMap_PoSchd_Upd01_DtlR_Chk01_DtlR());
				poSchdReg.up0().add(dtlR);
			}
			poSchdReg.exec();
			
			copyErrFlg(list, poSchdReg.down0());
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		
		/**
		 * 対応する受注明細と納品先などを比較します。
		 * @param dtlR
		 * @param sloDR
		 * @return true:差異あり/false：差異なし
		 */
		protected boolean diffSloDlvInfo(Chk01_DtlR dtlR, MST_SLO_D_R sloDR) {
			String dlvNm = null;
			if (dtlR.dlv_sundry_flg()) {
				dlvNm = dtlR.dlv_nm(); 
			}
			String tdlvNm = null;
			if (dtlR.tdlv_sundry_flg()) {
				tdlvNm = dtlR.tdlv_nm(); 
			}
			if (!isSame(dtlR.in_to_loc_cd(), nvl(sloDR.loc_cd(), sloDR.def_loc_cd()))
					|| !isSame(dtlR.str_ln_cd(), nvl(sloDR.str_ln_cd(), MAC_STR.NULL_VAL.value()))
					|| !isSame(dtlR.dlv_cd(), sloDR.dlv_cd())
					|| !isSame(dlvNm, sloDR.dlv_nm())
					|| !isSame(dtlR.dlv_sundry_flg(), sloDR.dlv_sundry_flg())
					|| !isSame(dtlR.dlv_zip_cd(), sloDR.dlv_zip_cd())
					|| !isSame(dtlR.dlv_addr1(), sloDR.dlv_addr1())
					|| !isSame(dtlR.dlv_addr2(), sloDR.dlv_addr2())
					|| !isSame(dtlR.dlv_addr3(), sloDR.dlv_addr3())
					|| !isSame(dtlR.dlv_addr4(), sloDR.dlv_addr4())
					|| !isSame(dtlR.dlv_tel(), sloDR.dlv_tel())
					|| !isSame(dtlR.dlv_fax(), sloDR.dlv_fax())
					|| !isSame(dtlR.tdlv_cd(), sloDR.tdlv_cd())
					|| !isSame(tdlvNm, sloDR.tdlv_nm())
					|| !isSame(dtlR.tdlv_sundry_flg(), sloDR.tdlv_sundry_flg())
					|| !isSame(dtlR.tdlv_cntct_dpt(), sloDR.tdlv_cntct_dpt())
					|| !isSame(dtlR.tdlv_cntct_psn(), sloDR.tdlv_cntct_psn())
					|| !isSame(dtlR.tdlv_zip_cd(), sloDR.tdlv_zip_cd())
					|| !isSame(dtlR.tdlv_addr1(), sloDR.tdlv_addr1())
					|| !isSame(dtlR.tdlv_addr2(), sloDR.tdlv_addr2())
					|| !isSame(dtlR.tdlv_addr3(), sloDR.tdlv_addr3())
					|| !isSame(dtlR.tdlv_addr4(), sloDR.tdlv_addr4())
					|| !isSame(dtlR.tdlv_tel(), sloDR.tdlv_tel())
					|| !isSame(dtlR.tdlv_fax(), sloDR.tdlv_fax())
			) {
				return true;
			}
			else {
				return false;
			}
		}
		/**
		 * 対応する受注明細と数量を比較します。
		 * @param dtlR
		 * @param sloDR
		 * @return true:差異あり/false：差異なし 
		 */
		protected boolean diffSloQtyInfo(Chk01_DtlR dtlR, MST_SLO_D_R sloDR) {
			if (!isSame(dtlR.base_unit_qty(), sloDR.base_unit_qty())
					|| !isSame(dtlR.base_unit_cd(), sloDR.base_unit_cd())) {
				// 受注数量と発注数量が異なっている
				return true;
			}
			else {
				// 受注数量と発注数量が同じである
				return false;
			}
		}
	}
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 依頼元訂正ＦＬＧ更新前チェック<br>
	 */
	public class Chk03 extends MSBDL_PoSchdListReg_MC_A.Chk03 {
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
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			for (Chk03_DtlR r : up0()) {
				msgL.addAll(check(r, Chk01_DtlR.$po_schd_no, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		
	
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkDacPo(_cachePoSchd));
			return msgL;
		}
		/**
		 * キャッシュ作成（発注予定）
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up0());
		}
		/**
		 * 更新カウンタチェック、補完処理、更新前データのＤＡＣチェック処理を行います。
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定
			msgL.addAll(completionPoSchd());
			return msgL;
		}
		/**
		 * 訂正前発注予定から、値を補完します
		 * @param list
		 * @return
		 */
		protected MCMessageList completionPoSchd(){
			MCMessageList msgL = new MCMessageList();
			MCList<Chk03_DtlR> list = getChkList(up0());
			for (Chk03_DtlR r : list) {
				MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, r.po_schd_no());
				// 更新カウンタチェック
				MCMessageList tmpL = new MCMessageList();
				tmpL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$po_schd_upd_cntr, poSchdR));
				if (tmpL.size() > 0) {
					msgL.addAll(tmpL);
				}
				else {
					// 補完処理
					r.rqst_can_flg(poSchdR.rqst_can_flg());
				}
			}
			return msgL;
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 取り消し前チェック<br>
	 */
	public class Chk04 extends MSBDL_PoSchdListReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			// 後続処理のエラーチェック
			callPoSchdRegChk(getChkList(up0()));
			setErrToRtnStsTyp();
			// 下り電文設定
			setDown();
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			for (Chk04_DtlR r : up0()) {
				msgL.addAll(check(r, Chk01_DtlR.$po_schd_no, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkDacPo(_cachePoSchd));
			msgL.addAll(thisCheck());
			return msgL;
		}
		/**
		 * キャッシュ作成（発注予定）
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up0());
			// 品目製造指図
			createCacheItmMnfctInst();
		}
		/**
		 * 補完処理
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定補完
			msgL.addAll(completionPoSchd());
			return msgL;
		}
		/**
		 * 訂正前発注予定から、値を補完します
		 * @param list
		 * @return
		 */
		protected MCMessageList completionPoSchd(){
			MCList<Chk04_DtlR> list = getChkList(up0());
			MCMessageList msgL = new MCMessageList();
			for (Chk04_DtlR r : list) {
				MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, r.po_schd_no());
				// 更新カウンタチェック
				MCMessageList tmpL = new MCMessageList();
				tmpL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$po_schd_upd_cntr, poSchdR));
				if (tmpL.size() > 0) {
					msgL.addAll(tmpL);
				}
				else {
					// 補完
					r.po_schd_no(poSchdR.po_schd_no());
					r.po_schd_src_typ(poSchdR.po_schd_src_typ());
					r.po_schd_src_no(poSchdR.po_schd_src_no());
					r.outsrc_flg(poSchdR.outsrc_flg());
					r.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
				}
				
			}
			return msgL;
		}
		
		/**
		 *　本機能固有のチェック
		 * @return
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			for (Chk04_DtlR r : up0()) {
				// 品目製造指図がいたら取消不可
				MST_ITM_MFG_INST_R itmMnfctInstR = _itmMnfctInstL.getFirst(_idxItmMnfctInstL, r.outsrc_itm_ord_no());
				if (!isNull(itmMnfctInstR)) {
					msgL.add(new MCMessage(r, null , MSBDL0070, r.po_schd_no(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
		
		/**
		 * 発注予定ＳＶチェック処理呼び出し
		 * @param list
		 */
		protected void callPoSchdRegChk(MCList<Chk04_DtlR> list){
			MSBDL_PoSchdRegService.PoSchd_Chk01 poSchdReg = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
			for (Chk04_DtlR r : list) {
				PoSchd_Upd01_DtlR dtlR = PoSchd_Upd01_DtlR.create();
				copy(dtlR, r, createMap_PoSchd_Upd01_DtlR_Chk04_DtlR());
				poSchdReg.up0().add(dtlR);
			}
			poSchdReg.exec();
			
			copyErrFlg(list, poSchdReg.down0());
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown () {
			down0().setAll(up0());
		}
	}

	/**
	 * キャッシュ作成（発注予定）
	 * @param list
	 * @return
	 */
	protected void createCachePoSchd (MCList<?> list) {
		_cachePoSchd = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder cachePoSchd_bldr = MCQueryApiBuilder.create(t);
		cachePoSchd_bldr.setOrderByAsc(t.po_schd_no);
		dbSelectKeyForUpdateNoWait("MSBDL0030_MST_PO_SCHD_S01", _cachePoSchd, cachePoSchd_bldr, list);
		_idxCachePoSchd = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_no);
	}
	/**
	 * キャッシュ作成（品目製造指図）
	 */
	protected void createCacheItmMnfctInst() {
		// 発注予定の外注品目オーダNOに対応する品目製造指図を取得する
		_itmMnfctInstL = MCList.create(MST_ITM_MFG_INST_R.class);
		MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
		MCQueryApiBuilder itmMnfctInstL_bldr = MCQueryApiBuilder.create(t);
		itmMnfctInstL_bldr.setWhere(t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
		itmMnfctInstL_bldr.addWhereWithAnd(t.can_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
		dbSelect("MSBDL0030_MST_ITM_MFG_INST_S01", _itmMnfctInstL, itmMnfctInstL_bldr, _cachePoSchd);
		_idxItmMnfctInstL = _itmMnfctInstL.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
	}
	protected void createItmDtlPurcCache(MCList<?> list) {
		_cacheItmDtlPurc = MCList.create(MAVM_ITM_DTL_PURC_R.class);
		MAVM_ITM_DTL_PURC_R itmDtlL_t = MAVM_ITM_DTL_PURC_R.create("T");
		MCQueryApiBuilder itmDtlL_bldr = MCQueryApiBuilder.create(itmDtlL_t);
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_cd.eq(bind("itm_cd")));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub1.eq(bind("itm_sub1")));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub2.eq(bind("itm_sub2")));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub3.eq(bind("itm_sub3")));
		itmDtlL_bldr.addWhereWithAnd(bind("po_schd_dt").between(itmDtlL_t.st_dt, itmDtlL_t.end_dt));
		dbSelect("MSBDL0030_MAVM_ITM_DTL_PURC_S02", _cacheItmDtlPurc, itmDtlL_bldr, list);
		_idxCacheItmDtlPurc = _cacheItmDtlPurc.createIndex(
				MAVM_ITM_DTL_PURC_R.$itm_cd, MAVM_ITM_DTL_PURC_R.$itm_sub1,
				MAVM_ITM_DTL_PURC_R.$itm_sub2, MAVM_ITM_DTL_PURC_R.$itm_sub3);
	}
	protected static void createItmCache(MCList<?> list) {
		if (object(CLAZZ)._cacheItm == null) {
			object(CLAZZ)._createItmCache(list);
		}
	}
	protected void _createItmCache(MCList<?> list) {
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(
				MCQueryApiBuilder.create(MAM_ITM_R.create("T")), list,
				MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
				MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	protected static MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getCacheItm(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected MAM_ITM_R _getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	/**
	 * 共通チェック処理を行います。
	 * @param dtlL
	 * @return
	 */
	protected MCMessageList checkCmn(MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR> subL = getChkList(dtlL);
		MCMessageList msgL = new MCMessageList();
		// 全般的なチェック
		msgL.addAll(checkDecPlace(subL, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
		msgL.addAll(checkDecPlace(subL, Chk01_DtlR.$trd_cur_upri_dec_place, Chk01_DtlR.$trd_cur_upri));
		
		for (Chk01_DtlR dtlR : subL) {
			msgL.addAll(check(dtlR, Chk01_DtlR.$sno1, new FXUCL_RequiredValidater()));
			msgL.addAll(check(dtlR, Chk01_DtlR.$sno2, new FXUCL_RequiredValidater()));
			msgL.addAll(check(dtlR, Chk01_DtlR.$sno3, new FXUCL_RequiredValidater()));
			msgL.addAll(check(dtlR, Chk01_DtlR.$sno4, new FXUCL_RequiredValidater()));
			//----------------------------
			// 条件付必須チェック
			//----------------------------
			if (dtlR.ver_flg()) {
				msgL.addAll(check(dtlR, Chk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
			}
			if (dtlR.xrate_inpt_flg()) {
				msgL.addAll(check(dtlR, Chk01_DtlR.$xrate, new FXUCL_RequiredValidater()));
			}
			if (dtlR.ptax_xrate_inpt_flg()) {
				msgL.addAll(check(dtlR, Chk01_DtlR.$ptax_xrate, new FXUCL_RequiredValidater()));
			}
			// 打切ＦＬＧ
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				msgL.addAll(check(dtlR, Chk01_DtlR.$purc_dpt_cd, new FXUCL_RequiredValidater()));
			}
			else {
				MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, dtlR.po_schd_no());
				if (!dtlR.abort_flg() && isSame(dtlR.abort_flg(), poSchdR.abort_flg())) {
					msgL.addAll(check(dtlR, Chk01_DtlR.$purc_dpt_cd, new FXUCL_RequiredValidater()));	
				}	
			}
			
			//----------------------------
			// 外注関連チェック
			//----------------------------
			if (dtlR.outsrc_flg()) {
				// 外注品の経費購買はできない
				if (isXpnsPurc(dtlR)) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0080, toDispGUIIndex(dtlR)));
				}
			}
			//----------------------------
			// 経費購買関連チェック
			//----------------------------
			// 経費購買の場合、資産管理しない品目しか登録できない
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0149, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispGUIIndex(dtlR)));
			}
			if (!isNull(dtlR.purc_rsn_cd())) {
				// 資産管理する品目に経費理由を設定できない
				if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ()) && dtlR.xpns_purc_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0150, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
				}
				// 資産管理しない品目には経費理由しか設定できない
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && !dtlR.xpns_purc_flg()) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0151, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
				}
			}
			
		}
		return msgL;
	}
	/**
	 * 品目詳細マスタの存在チェックを行います。
	 * @return
	 */
	protected MCMessageList checkExistItmDtl(MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR> subL = getChkList(dtlL);
		MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		for (Chk01_DtlR r : subL) {
			// 条件を満たさない場合は、品目詳細のチェックは行わない。
			if (isNull(r.sppl_cd())) {
				continue;
			}
			// 品目詳細マスタの存在チェックを行う
			MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
			itmDtlR.setAttributes(r);
			itmDtlR.itm_cd(r.itm_cd());
			itmDtlR.itm_sub1(r.itm_sub1());
			itmDtlR.itm_sub2(r.itm_sub2());
			itmDtlR.itm_sub3(r.itm_sub3());
			itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
			if(isNullOrNullVal(r.mfg_loc_cd())) {
				itmDtlR.sppl_cd(r.sppl_cd());
				itmDtlR.maker_cd(r.maker_cd());
			}
			else {
				itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
				itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
			}
			itmDtlR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			itmDtlR.wg_cd(r.in_to_loc_wg_cd());
			itmDtlR.bom_ptn(r.bom_ptn());
			String sysParm = getSysParm("MASTER_DT_BASE");
			itmDtlR.st_dt(isSame(sysParm, "1") ? r.rqst_avl_rqst_dt() : r.po_schd_dt());
			itmDtlL.add(itmDtlR);
		}
		return MSUCL_ProdUtil.chkItmDtlKey(itmDtlL);
	}
	protected MCMessageList checkPurcItm(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Chk01_DtlR> subL = getChkList(dtlL);
		for (Chk01_DtlR r : subL) {
			if (!isNull(r.sppl_cd())) {
				continue;
			}
			MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!MAC_ASSET_MNG_TYP.isMNG(itmR.asset_mng_typ())) {
				continue;
			}
			MCList<MAVM_ITM_DTL_PURC_R> subItmDtlPurcL = _cacheItmDtlPurc.subList(
					_idxCacheItmDtlPurc, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (subItmDtlPurcL.isEmpty()) {
				msgL.add(new MCMessage(r, null, MSBDL0508,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
			}
		}
		return msgL;
	}
	/**
	 * 負担項目の各種ＮＯの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 * @return メッセージリスト
	 */
	protected MCMessageList existBdCheck(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Chk01_DtlR> bdLotChkTgtL = MCList.create(Chk01_DtlR.class);
				
		for (Chk01_DtlR dr : dtlL) {
			if (dr.getStatus() == MCRow.DELETE) {
				continue;
			}
			if (!isNull(dr.bd_po_no())) {
				if (!existsPoNo(dr.bd_po_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_slo_no())) {
				if (!existsSloNo(dr.bd_slo_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
				bdLotChkTgtL.add(dr);
			}
			if (!isNull(dr.bd_iv_no())) {
				if (!existsBdIvNo(dr.bd_iv_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
				}
			}
			
		}		
		callLotServiceChkBdItm(bdLotChkTgtL);
		
		return msgL;
	}
	/**
	 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 */
	protected void callLotServiceChkBdItm(MCList<Chk01_DtlR> dtlL) {
		if (dtlL.isEmpty()) {
			return;
		}
		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
		addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Chk01_DtlR());
		ope.exec();		
		copyErrFlg(dtlL, ope.up0());
	}
	/**
	 * 直納区分の設定
	 * @param dtlR
	 */
	protected void setDrctDlvTyp(Chk01_DtlR dtlR){	
		if (isNullAnd(dtlR.outsrc_sppl_cd(), dtlR.dlv_cd())) {
			dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
		}
		else {
			dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
		}
	}
	
	/**
	 * 経費購買判定
	 * 取引パタンが経費購買であるか、資産管理しない品目を発注する場合は経費購買とする。
	 * @param poSchd
	 */
	protected boolean isXpnsPurc(Chk01_DtlR dtlR){
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル入力処理<br>
	 */
	public class Imp01 extends MSBDL_PoSchdListReg_MC_A.Imp01 {
		/** 場所マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		/** 品目単位マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 紐付けＮＯのの設定
			setPegNo(up0());
			// データ更新区分の設定
			up0().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			editUp();
			callThisSprt01();
			clearUpri();
			setSchdDt();
			// チェック処理
			callThisChk01(up0());
			// 一度画面に戻すため、導出項目を算出してから戻す
			for (Chk01_DtlR r : up0()) {
				// 導出項目の補完
				completion(r);
			}
			// 下り電文設定
			down0().setAll(up0());
		}

		protected void editUp() {
			
			setNullVal();
			
			setRegDt();
			
			createCache();
			
			complLoc();
			
			complItm();
			
			setDefStrLnCd();
			
			clearStrLnCdNoneFlg();
			
			setBaseUintQty();
		}
		
		protected void clearUpri() {
			
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setWhere(t.bp_cd.eq(bind("sppl_cd")));
			dbSelect("MSBDL0030_MAM_BP_S02", bpL, bpL_bldr, up0());
			MCIndexKey idxkey = bpL.createIndex(MAM_BP_R.$bp_cd);
			for (Chk01_DtlR r : up0()) {
				MAM_BP_R bpR = bpL.getFirst(idxkey, r.sppl_cd());
				MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				
				if (!isNull(bpR)) {
					if (!bpR.purc_upri_cng_flg() && !itmR.purc_upri_cng_flg()) {
						r.upri_not_tgt_flg(false);
					}
				}
				if (!r.upri_not_tgt_flg()) {
					
					r.clear(Chk01_DtlR.$trd_cur_upri, 
							Chk01_DtlR.$trd_cur_proc_upri, 
							Chk01_DtlR.$trd_cur_onr_prov_upri, 
							Chk01_DtlR.$interim_flg);
				}
			}
		}
		
		protected void setNullVal() {
			
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.itm_cd())) {
					r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
					r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
					r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}
			}
		}
		
		protected void createCache() {
			
			createLocCache();
			
			createItmCache(up0());
			
			createItmUnitCache();
		}
		
		protected void setRegDt() {
			
			for (Chk01_DtlR r : up0()) {
				
				r.reg_dt((MCDate)complInputFileValue(Chk01_DtlR.$reg_dt, r.reg_dt(), getToday()));
			}
		}
		
		protected void complLoc() {
			
			for (Chk01_DtlR r : up0()) {
				
				MAM_LOC_R locR = getCacheLoc(r.in_to_loc_cd());
				
				if (!isNull(locR)) {
					r.in_to_loc_wg_cd(locR.wg_cd());
					r.lg_grp_cd(locR.lg_grp_cd());
					r.site_cd(locR.site_cd());
					r.in_to_loc_cal_cd(locR.cal_cd());
					r.str_ln_tgt_flg(locR.str_ln_tgt_flg());
				}
			}
		}
		
		protected void complItm() {
			
			for (Chk01_DtlR r : up0()) {
				
				MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				
				if (!isNull(itmR)) {
					
					if (itmR.dscnt_itm_flg()) {
						r.trd_unit_qty(MCNumber.ONE);
						r.trd_unit_cd(itmR.unit_cd());
					}
					else {
						r.trd_unit_cd((String)complInputFileValue(
								Chk01_DtlR.$trd_unit_cd, r.trd_unit_cd(), nvl(itmR.purc_unit_cd(), itmR.unit_cd())));
					}
					
					if (!itmR.sundry_itm_flg()) {
						r.iv_itm_nm(null);
					}
				}
			}
		}
		
		protected void setDefStrLnCd() {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 strLnUtilSrch01 = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			MCList<Chk01_DtlR> tgtList = up0().subList(r -> !r.str_ln_cd_none_flg() && r.str_ln_tgt_flg());
			if (tgtList.isEmpty()) {
				return;
			}
			addAll(strLnUtilSrch01.up0(), tgtList, createMap_StrLnUtil_Srch01_CndR_Chk01_DtlR());
			strLnUtilSrch01.exec();

			MCIndexKey idxkey = strLnUtilSrch01.down0().createIndex(StrLnUtil_Srch01_CndR.$peg_no);
			for (Chk01_DtlR r : tgtList) {
				StrLnUtil_Srch01_CndR downR = strLnUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				r.str_ln_cd((String) complInputFileValue(Chk01_DtlR.$str_ln_cd, r.str_ln_cd(), downR.str_ln_cd()));
			}
		}
		
		protected void clearStrLnCdNoneFlg() {
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.str_ln_cd())) {
					r.clear(Chk01_DtlR.$str_ln_cd_none_flg);
				}
			}
		}

		protected void setBaseUintQty() {
			
			for (Chk01_DtlR r : up0()) {
				
				MAVM_ITM_UNIT_R itmUnitR = getCacheItmUnit(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				
				if (!isNull(itmUnitR)) {
					
					r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
							itmUnitR.dec_place(), itmUnitR.rnd_typ()));
				}
			}
		}
		
		protected void callThisSprt01() {
			
			MSBDL_PoSchdListReg.Sprt01 sprt01 = MSBDL_PoSchdListReg.crtSprt01();
			addAll(sprt01.up0(), up0(), createMap_Sprt01_DtlR_Chk01_DtlR());
			sprt01.exec();
			
			MCIndexKey sprtIdxkey = sprt01.down0().createIndex(Sprt01_DtlR.$peg_no);
			
			Map<String, String> map = new HashMap<String, String>();
			
			map.put(Chk01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
			map.put(Chk01_DtlR.$purc_upri_req_typ, Sprt01_DtlR.$purc_upri_req_typ);
			map.put(Chk01_DtlR.$maker_cd, Sprt01_DtlR.$maker_cd);
			map.put(Chk01_DtlR.$ver_no, Sprt01_DtlR.$ver_no);
			map.put(Chk01_DtlR.$trd_cur_cd, Sprt01_DtlR.$trd_cur_cd);
			map.put(Chk01_DtlR.$purc_usr_cd, Sprt01_DtlR.$purc_usr_cd);
			map.put(Chk01_DtlR.$purc_dpt_cd, Sprt01_DtlR.$purc_dpt_cd);
			map.put(Chk01_DtlR.$purc_dpt_wg_cd, Sprt01_DtlR.$purc_dpt_wg_cd);
			map.put(Chk01_DtlR.$iv_itm_nm, Sprt01_DtlR.$iv_itm_nm);
			map.put(Chk01_DtlR.$sppl_itm_cd, Sprt01_DtlR.$sppl_itm_cd);
			map.put(Chk01_DtlR.$sppl_itm_nm, Sprt01_DtlR.$sppl_itm_nm);
			map.put(Chk01_DtlR.$tax_cd, Sprt01_DtlR.$tax_cd);
			map.put(Chk01_DtlR.$xrate, Sprt01_DtlR.$xrate);
			map.put(Chk01_DtlR.$ptax_xrate, Sprt01_DtlR.$ptax_xrate);
			map.put(Chk01_DtlR.$sppl_cal_cd, Sprt01_DtlR.$sppl_cal_cd);
			
			for (Chk01_DtlR r : up0()) {
				
				Sprt01_DtlR sprtR = sprt01.down0().getFirst(sprtIdxkey, r.peg_no());
				
				for (String col : map.keySet()) {
					
					if (!isNull(sprtR.getValueNE(map.get(col)))) {
						r.setValueNE(col, complInputFileValue(col, r.getValueNE(col), sprtR.getValueNE(map.get(col))));
					}
				}
			}
		}
		
		protected void setSchdDt() {
			
			MCList<Chk01_DtlR> tgtList = getTgtList();
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), tgtList, createMap_PurcUtil_Srch01_DtlR_Chk01_DtlR());
			purcUtilSrch01.exec();
			
			MCIndexKey idxkey = purcUtilSrch01.down0().createIndex(PurcUtil_Srch01_DtlR.$peg_no);
			
			for (Chk01_DtlR r : tgtList) {
				PurcUtil_Srch01_DtlR downR = purcUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				
				if (!isNull(downR)) {
					r.po_schd_dt((MCDate)complInputFileValue(Chk01_DtlR.$po_schd_dt, r.po_schd_dt(), downR.po_schd_dt()));
					r.rqst_avl_rqst_dt((MCDate)complInputFileValue(Chk01_DtlR.$rqst_avl_rqst_dt, r.rqst_avl_rqst_dt(), downR.rqst_dlv_rqst_dt()));
					r.dlv_rqst_tm((MCDate)complInputFileValue(Chk01_DtlR.$dlv_rqst_tm, r.dlv_rqst_tm(), downR.dlv_rqst_dt()));
					r.purc_schd_dt((MCDate)complInputFileValue(Chk01_DtlR.$purc_schd_dt, r.purc_schd_dt(), downR.purc_schd_dt()));
				}
			}
		}
		
		protected MCList<Chk01_DtlR> getTgtList() {
			MCList<Chk01_DtlR> tgtList = MCList.create(Chk01_DtlR.class);
			
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.po_schd_dt()) && !isNull(r.purc_schd_dt()) && !isNull(r.rqst_avl_rqst_dt()) && !isNull(r.rqst_dlv_rqst_tm())) {
					continue;
				}
				tgtList.add(r);
			}
			
			return tgtList;
		}
		
		protected Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<PurcUtil_Srch01_DtlR,Chk01_DtlR> createMap_PurcUtil_Srch01_DtlR_Chk01_DtlR() {
			return new Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<PurcUtil_Srch01_DtlR, Chk01_DtlR>();
		}

		public class Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$rqst_dlv_rqst_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_rqst_dt, Chk01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$po_schd_dt, Chk01_DtlR.$po_schd_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Chk01_DtlR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Chk01_DtlR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Chk01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, Chk01_DtlR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Chk01_DtlR.$in_to_loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				String sysParm = getSysParm("MASTER_DT_BASE");
				if (isSame(sysParm, "1")) {
					if(isNull(src.rqst_avl_rqst_dt())) {
						dest.base_dt(src.dlv_rqst_tm());
					}
					else {
						dest.base_dt(src.rqst_avl_rqst_dt());
					}
				}
			}
		}
		
		protected Map_StrLnUtil_Srch01_CndR_Chk01_DtlR<StrLnUtil_Srch01_CndR,Chk01_DtlR> createMap_StrLnUtil_Srch01_CndR_Chk01_DtlR() {
			return new Map_StrLnUtil_Srch01_CndR_Chk01_DtlR<StrLnUtil_Srch01_CndR, Chk01_DtlR>();
		}

		public class Map_StrLnUtil_Srch01_CndR_Chk01_DtlR<D extends StrLnUtil_Srch01_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(StrLnUtil_Srch01_CndR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$loc_cd, Chk01_DtlR.$in_to_loc_cd);
			}
		}
		
		protected void createLocCache() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")), up0(),
					Chk01_DtlR.$in_to_loc_cd);
		}
		
		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
		
		protected void createItmUnitCache() {
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), up0(),
					Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3, Chk01_DtlR.$trd_unit_cd);
		}
		
		protected MAVM_ITM_UNIT_R getCacheItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String trdUnitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
		}
		
		protected Map_Sprt01_DtlR_Chk01_DtlR<Sprt01_DtlR,Chk01_DtlR> createMap_Sprt01_DtlR_Chk01_DtlR() {
			return new Map_Sprt01_DtlR_Chk01_DtlR<Sprt01_DtlR, Chk01_DtlR>();
		}

		public class Map_Sprt01_DtlR_Chk01_DtlR<D extends Sprt01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sprt01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Sprt01_DtlR.$po_schd_dt, Chk01_DtlR.$po_schd_dt);
				addColumnPathMap(Sprt01_DtlR.$dlv_rqst_dt, Chk01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(Sprt01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
				addColumnPathMap(Sprt01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_nm, Chk01_DtlR.$sppl_nm);
				addColumnPathMap(Sprt01_DtlR.$sppl_iv_flg, Chk01_DtlR.$sppl_iv_flg);
				addColumnPathMap(Sprt01_DtlR.$sppl_purc_upri_cng_flg, Chk01_DtlR.$sppl_purc_upri_cng_flg);
				addColumnPathMap(Sprt01_DtlR.$purc_upri_req_typ, Chk01_DtlR.$purc_upri_req_typ);
				addColumnPathMap(Sprt01_DtlR.$purc_upri_req_typ_nm, Chk01_DtlR.$purc_upri_req_typ_nm);
				addColumnPathMap(Sprt01_DtlR.$purc_amt_rnd_typ, Chk01_DtlR.$purc_amt_rnd_typ);
				addColumnPathMap(Sprt01_DtlR.$purc_tax_rnd_typ, Chk01_DtlR.$purc_tax_rnd_typ);
				addColumnPathMap(Sprt01_DtlR.$prnt_lcl_cd, Chk01_DtlR.$prnt_lcl_cd);
				addColumnPathMap(Sprt01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(Sprt01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Sprt01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Sprt01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Sprt01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Sprt01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
				addColumnPathMap(Sprt01_DtlR.$maker_nm, Chk01_DtlR.$maker_nm);
				addColumnPathMap(Sprt01_DtlR.$reg_dt, Chk01_DtlR.$reg_dt);
				addColumnPathMap(Sprt01_DtlR.$in_to_loc_wg_cd, Chk01_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(Sprt01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
				addColumnPathMap(Sprt01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
				addColumnPathMap(Sprt01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
				addColumnPathMap(Sprt01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
				addColumnPathMap(Sprt01_DtlR.$site_cd, Chk01_DtlR.$site_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_cal_cd, Chk01_DtlR.$sppl_cal_cd);
				addColumnPathMap(Sprt01_DtlR.$in_to_loc_cal_cd, Chk01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(Sprt01_DtlR.$dlv_cal_cd, Chk01_DtlR.$dlv_cal_cd);
				addColumnPathMap(Sprt01_DtlR.$lg_grp_cd, Chk01_DtlR.$lg_grp_cd);
				addColumnPathMap(Sprt01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(Sprt01_DtlR.$ver_flg, Chk01_DtlR.$ver_flg);
				addColumnPathMap(Sprt01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(Sprt01_DtlR.$outsrc_flg, Chk01_DtlR.$outsrc_flg);
				addColumnPathMap(Sprt01_DtlR.$outsrc_sppl_cd, Chk01_DtlR.$outsrc_sppl_cd);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_cd, Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_nm, Chk01_DtlR.$trd_cur_nm);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_amt_dec_place, Chk01_DtlR.$trd_cur_amt_dec_place);
				addColumnPathMap(Sprt01_DtlR.$trd_cur_upri_dec_place, Chk01_DtlR.$trd_cur_upri_dec_place);
				addColumnPathMap(Sprt01_DtlR.$purc_usr_cd, Chk01_DtlR.$purc_usr_cd);
				addColumnPathMap(Sprt01_DtlR.$purc_usr_nm, Chk01_DtlR.$purc_usr_nm);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_cd, Chk01_DtlR.$purc_dpt_cd);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_nm, Chk01_DtlR.$purc_dpt_nm);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
				addColumnPathMap(Sprt01_DtlR.$purc_dpt_wg_nm, Chk01_DtlR.$purc_dpt_wg_nm);
				addColumnPathMap(Sprt01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(Sprt01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
				addColumnPathMap(Sprt01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
				addColumnPathMap(Sprt01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
				addColumnPathMap(Sprt01_DtlR.$tax_nm, Chk01_DtlR.$tax_nm);
				addColumnPathMap(Sprt01_DtlR.$tax_typ, Chk01_DtlR.$tax_typ);
				addColumnPathMap(Sprt01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
				addColumnPathMap(Sprt01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
				addColumnPathMap(Sprt01_DtlR.$xrate, Chk01_DtlR.$xrate);
				addColumnPathMap(Sprt01_DtlR.$ptax_xrate, Chk01_DtlR.$ptax_xrate);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isNull(src.rqst_avl_rqst_dt())) {
					dest.rqst_avl_rqst_dt(src.dlv_rqst_tm());
				}
				else {
					dest.rqst_avl_rqst_dt(src.rqst_avl_rqst_dt());
				}
				String sysParm = getSysParm("MASTER_DT_BASE");
				if (!isSame(sysParm, "1")) {
					// sprt01では発注予定日（仮）が必須
					if (isNull(dest.po_schd_dt())) {
						dest.po_schd_dt(dest.rqst_avl_rqst_dt());
					}
				}
			}
		}
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 発注予定を登録する。<br>
	 */
	public class Ins01 extends MSBDL_PoSchdListReg_MC_A.Ins01 {
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
				down0().setAll(up0());
			}
		}
		
		@Override
		protected void doIt() {
			// 紐付けＮＯのの設定
			setPegNo(up0());
			editUp();
			// チェック処理
			callThisChk01(up0());
			// 正常なデータのみ処理続行
			MCList<Chk01_DtlR> list = getChkList(up0());
			// 登録サービス呼び出し
			callPoSchdUpd01(list);
			// 下り電文設定
			setDown();
		}
		
		protected void editUp() {

			for (Chk01_DtlR r : up0()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.UPLND.value());
				r.add_flg(true);
			}
		}
		
		/**
		 * 処理区分設定
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		/**
		 * 例外時処理
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e,
				MCList<Chk01_DtlR> l) {
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
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発注予定を訂正する。<br>
	 */
	public class Upd01 extends MSBDL_PoSchdListReg_MC_A.Upd01 {
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
				down0().setAll(up0());
			}
		}
		
		@Override
		protected void doIt() {
			// 紐付けＮＯのの設定
			setPegNo(up0());
			// データ更新区分の設定
			setDataCrudTyp();
			// チェック処理
			callThisChk02(up0());
			// 正常なデータのみ処理続行
			MCList<Chk01_DtlR> list = getChkList(up0());
			// サービス呼び出し
			callPoSchdUpd01(list);
		}
		/**
		 * 処理区分設定
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		/**
		 * 例外時処理
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e,
				MCList<Chk01_DtlR> l) {
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
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02(MCList<Chk01_DtlR> list) {
			MSBDL_PoSchdListReg.Chk02 chk02 = MSBDL_PoSchdListReg.crtChk02();
			chk02.up0().setAll(list);
			chk02.exec();
			
			list.clear();
			
			list.setAll(chk02.down0());
		}
		
		/**
		 * データ更新区分を設定する。
		 * @param list
		 */
		protected void setDataCrudTyp(){
			for (Chk01_DtlR r : up0()) {
				if (isSame(MCRow.Status.CREATE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				} 
				else if (isSame(MCRow.Status.MODIFY, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				} 
				else if (isSame(MCRow.Status.DELETE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 依頼元訂正ＦＬＧを訂正する。<br>
	 */
	public class Upd02 extends MSBDL_PoSchdListReg_MC_A.Upd02 {
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
				down0().setAll(up0());
			}
		}
		@Override
		protected void doIt() {
			// 紐付けＮＯのの設定
			setPegNo(up0());
			// データ更新区分設定
			up0().setStringNE(Chk03_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			// チェック処理呼び出し
			callThisChk03(up0());
			// 正常なデータのみ処理続行
			MCList<Chk03_DtlR> list = getChkList(up0());
			// サービス呼び出し
			callPoSchdUpd04(list);
		}
		/**
		 * 処理区分設定
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk03_DtlR> l) {
			dbTran().commit();
			for (Chk03_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		/**
		 * 例外時処理
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e,
				MCList<Chk03_DtlR> l) {
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
			for (Chk03_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03(MCList<Chk03_DtlR> list) {
			MSBDL_PoSchdListReg.Chk03 chk03 = MSBDL_PoSchdListReg.crtChk03();
			chk03.up0().setAll(list);
			chk03.exec();
			list.clear();
			list.setAll(chk03.down0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 発注予定を取り消す<br>
	 */
	public class Del01 extends MSBDL_PoSchdListReg_MC_A.Del01 {
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
				down0().setAll(up0());
			}
		}
		@Override
		protected void doIt() {
			// 紐付けＮＯのの設定
			setPegNo(Chk04_DtlR.$peg_no, up0());
			// データ更新区分の設定
			up0().setString(Chk03_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			up0().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			callThisChk04(up0());
			MCList<Chk04_DtlR> list = getChkList(up0());
			callPoSchdUpd01(list);
			callOrdUpd01(list);
			callIoSchdDel01(list);
		}
		/**
		 * 処理区分設定
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk04_DtlR> l) {
			dbTran().commit();
			for (Chk04_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		/**
		 * 例外時処理
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e,
				MCList<Chk04_DtlR> l) {
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
			for (Chk04_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04(MCList<Chk04_DtlR> list) {
			MSBDL_PoSchdListReg.Chk04 chk04 = MSBDL_PoSchdListReg.crtChk04();
			chk04.up0().setAll(list);
			chk04.exec();
			
			list.clear();
			
			list.setAll(chk04.down0());
		}
		
		/**
		 * 更新処理呼び出し
		 * @param list
		 */
		protected void callPoSchdUpd01(MCList<Chk04_DtlR> list){
			MSBDL_PoSchdRegService.PoSchd_Upd01 poSchdReg = MSBDL_PoSchdRegService.crtPoSchd_Upd01();
			for (Chk04_DtlR r : list) {
				// 補完処理
				Chk04_DtlR dtlR = Chk04_DtlR.create();
				MCRow.copyall(dtlR, r);
				
				// 上り電文設定
				PoSchd_Upd01_DtlR poSchddtlR = PoSchd_Upd01_DtlR.create();
				copy(poSchddtlR, dtlR, createMap_PoSchd_Upd01_DtlR_Chk04_DtlR());
				
				// 発注予定登録サービスの上り電文に追加
				poSchdReg.up0().add(poSchddtlR);
			}
			if (poSchdReg.up0().size() > 0) {
				poSchdReg.exec();
			}
		}
		/**
		 * オーダ登録サービス呼び出し
		 * @param list
		 */
		protected void callOrdUpd01(MCList<Chk04_DtlR> list){
			MSBCL_OrdRegService.Ord_Upd01 ordUpd01 = MSBCL_OrdRegService.crtOrd_Upd01();
			MCList<Chk04_DtlR> subL = list.subList(Chk04_DtlR.$outsrc_flg, true);
			addAll(ordUpd01.up0(), subL, createMap_Ord_Upd01_Dtl1R_Chk04_DtlR());
			if (ordUpd01.up0().size() > 0) {
				ordUpd01.exec();
			}
		}
		/**
		 * 受払予定サービス呼び出し
		 * @param list
		 */
		protected void callIoSchdDel01(MCList<Chk04_DtlR> list){
			MSBEL_IoSchdService.IoSchd_Del01 ioSchdDel01 = MSBEL_IoSchdService.crtIoSchd_Del01();
			MCList<Chk04_DtlR> subL = list.subList(Chk04_DtlR.$outsrc_flg, true);
			addAll(ioSchdDel01.up0(), subL, createMap_MSW_IO_SCHD_DEL_R_Chk04_DtlR());
			if (ioSchdDel01.up0().size() > 0) {
				ioSchdDel01.exec();
			}
		}
		
		protected Map_Ord_Upd01_Dtl1R_Chk04_DtlR<Ord_Upd01_Dtl1R,Chk04_DtlR> createMap_Ord_Upd01_Dtl1R_Chk04_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk04_DtlR<Ord_Upd01_Dtl1R, Chk04_DtlR>();
		}

		public class Map_Ord_Upd01_Dtl1R_Chk04_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk04_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk04_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk04_DtlR.$outsrc_itm_ord_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mrp_typ(MSC_MRP_TYP.MRP.value());
			}
		}
		protected Map_MSW_IO_SCHD_DEL_R_Chk04_DtlR<MSW_IO_SCHD_DEL_R,Chk04_DtlR> createMap_MSW_IO_SCHD_DEL_R_Chk04_DtlR() {
			return new Map_MSW_IO_SCHD_DEL_R_Chk04_DtlR<MSW_IO_SCHD_DEL_R, Chk04_DtlR>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_Chk04_DtlR<D extends MSW_IO_SCHD_DEL_R, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, Chk04_DtlR.$outsrc_itm_ord_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * 補完処理
	 * @param dtlR
	 */
	protected void completion(Chk01_DtlR dtlR){
		
		
		dtlR.xrate_cd(getCo().purc_xrate_cd());
		dtlR.xrate_rnd_typ(getCo().xrate_rnd_typ());

		// 取引通貨金額情報の設定
		MSBDL_PurcUtil.setTrdCurInfo(dtlR);
		// 外注かつ買戻し義務がオンの場合、加工金額を元に税額を再計算する
		if(dtlR.outsrc_flg() && dtlR.repurc_obli_flg() && MAC_OUTSRC_UPRI_TYP.isPROC_PROV(nvl(dtlR.outsrc_upri_typ(), getCo().outsrc_upri_typ()))) {
			if(dtlR.inc_tax_flg()) {
				// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
				MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
						dtlR.trd_unit_qty(),
						dtlR.trd_cur_amt_dec_place(),
						dtlR.purc_amt_rnd_typ());
				dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
				// 有償支給金額は金額-加工金額
				dtlR.trd_cur_onr_prov_amt(!isNull(dtlR.trd_cur_inc_tax_amt()) ? dtlR.trd_cur_inc_tax_amt().subtract(proc_inc_tax_amt) : null);
			}
			MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
					dtlR.trd_cur_proc_amt(),
					dtlR.tax_rate(),
					dtlR.trd_cur_amt_dec_place(),
					dtlR.purc_tax_rnd_typ(),
					dtlR.inc_tax_flg()
					);
			dtlR.trd_cur_tax_amt(trdCurTaxAmt);
			if(dtlR.inc_tax_flg()) {
				MCNumber amt = (dtlR.trd_cur_inc_tax_amt() != null) ? dtlR.trd_cur_inc_tax_amt().subtract(trdCurTaxAmt) : null;
				MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
				dtlR.trd_cur_amt(amt);
				dtlR.trd_cur_proc_amt(proc_amt);
			}
		}
		// 基準通貨金額情報の設定
		MSBDL_PurcUtil.setBaseCurInfo(dtlR);
		// 納税通貨金額情報の設定
		MSBDL_PurcUtil.setPtaxCurInfo(dtlR);
	}
	/**
	 * 基準単位数量の設定
	 * @param dtlR
	 * @param dtlR
	 */
	protected void completionBaseUnitInfo(Chk01_DtlR dtlR){
		dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
				dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
	}
	
	/**
	 * チェック処理を実行する
	 */
	protected void callThisChk01(MCList<Chk01_DtlR> list) {
		MSBDL_PoSchdListReg.Chk01 chk01 = MSBDL_PoSchdListReg.crtChk01();
		chk01.up0().setAll(list);
		chk01.exec();
		
		list.clear();
		
		list.setAll(chk01.down0());
	}
	/**
	 * 更新処理呼び出し
	 * @param list
	 */
	protected void callPoSchdUpd01(MCList<Chk01_DtlR> list){
		MSBDL_PoSchdRegService.PoSchd_Upd01 poSchdReg = MSBDL_PoSchdRegService.crtPoSchd_Upd01();
		for (Chk01_DtlR r : list) {
			// 補完処理
			Chk01_DtlR dtlR = Chk01_DtlR.create();
			MCRow.copyall(dtlR, r);
			if (!isSame(MCRow.Status.DELETE, r.getStatus())) {
				completion(dtlR);	
			}
			
			// 上り電文設定
			PoSchd_Upd01_DtlR poSchddtlR = PoSchd_Upd01_DtlR.create();
			copy(poSchddtlR, dtlR, createMap_PoSchd_Upd01_DtlR_Chk01_DtlR());
			
			// 発注予定登録サービスの上り電文に追加
			poSchdReg.up0().add(poSchddtlR);
		}
		if (poSchdReg.up0().size() > 0) {
			poSchdReg.exec();
		}
		String[] srcCols = {Chk01_DtlR.$po_schd_no, Chk01_DtlR.$po_schd_src_typ, Chk01_DtlR.$po_schd_src_no};
		String[] destCols = {MST_PO_SCHD_R.$po_schd_no, MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no};
		copyByPegNo(list, destCols, poSchdReg.down0(), srcCols);
	}
	/**
	 * 更新処理呼び出し
	 * @param list
	 */
	protected void callPoSchdUpd04(MCList<Chk03_DtlR> list){
		MSBDL_PoSchdRegService.PoSchd_Upd04 poSchdReg = MSBDL_PoSchdRegService.crtPoSchd_Upd04();
		addAll(poSchdReg.up0(), list, createMap_PoSchd_Upd04_DtlR_Chk03_DtlR());
		poSchdReg.up0().setBooleanNE(PoSchd_Upd04_DtlR.$only_own_upd_flg, true);
		
		if (poSchdReg.up0().size() > 0) {
			poSchdReg.exec();
		}
	}
	
	/** 発注予定登録ＳＶ（新規・更新） */
	protected Map_PoSchd_Upd01_DtlR_Chk01_DtlR<PoSchd_Upd01_DtlR,Chk01_DtlR> createMap_PoSchd_Upd01_DtlR_Chk01_DtlR() {
		return new Map_PoSchd_Upd01_DtlR_Chk01_DtlR<PoSchd_Upd01_DtlR, Chk01_DtlR>();
	}
	public class Map_PoSchd_Upd01_DtlR_Chk01_DtlR<D extends PoSchd_Upd01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_no, Chk01_DtlR.$po_schd_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, Chk01_DtlR.$po_schd_src_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, Chk01_DtlR.$po_schd_src_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cd, Chk01_DtlR.$trd_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_ptn_typ, Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_rsn_cd, Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_sundry_flg, Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_nm, Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_cntct_dpt, Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_cntct_psn, Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_zip_cd, Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr1, Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr2, Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr3, Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr4, Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_tel, Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_fax, Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(PoSchd_Upd01_DtlR.$reg_dt, Chk01_DtlR.$reg_dt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_wg_cd, Chk01_DtlR.$rqst_wg_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_usr_cd, Chk01_DtlR.$purc_usr_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_dpt_cd, Chk01_DtlR.$purc_dpt_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_flg, Chk01_DtlR.$outsrc_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no, Chk01_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$pln_itm_ord_no, Chk01_DtlR.$pln_itm_ord_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_upri_req_typ, Chk01_DtlR.$purc_upri_req_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_cd, Chk01_DtlR.$trd_cur_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$xrate_inpt_flg, Chk01_DtlR.$xrate_inpt_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$xrate, Chk01_DtlR.$xrate);
			addColumnPathMap(PoSchd_Upd01_DtlR.$ptax_xrate, Chk01_DtlR.$ptax_xrate);
			addColumnPathMap(PoSchd_Upd01_DtlR.$ptax_xrate_inpt_flg, Chk01_DtlR.$ptax_xrate_inpt_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_proc_amt, Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_onr_prov_amt, Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_dt, Chk01_DtlR.$po_schd_dt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_rqst_tm, Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_dlv_rqst_tm, Chk01_DtlR.$rqst_dlv_rqst_tm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_avl_rqst_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_lt, Chk01_DtlR.$purc_lt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$drct_dlv_typ, Chk01_DtlR.$drct_dlv_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_chg_typ, Chk01_DtlR.$po_schd_chg_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_upd_stop_flg, Chk01_DtlR.$rqst_upd_stop_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_crrct_flg, Chk01_DtlR.$rqst_crrct_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$split_src_schd_no, Chk01_DtlR.$split_src_schd_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_po_qty, Chk01_DtlR.$base_unit_po_qty);
			addColumnPathMap(PoSchd_Upd01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(PoSchd_Upd01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_cnt_rmrks, Chk01_DtlR.$po_cnt_rmrks);
			addColumnPathMap(PoSchd_Upd01_DtlR.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_lt, Chk01_DtlR.$purc_lt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PoSchd_Upd01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(PoSchd_Upd01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_sppl_cd, Chk01_DtlR.$sppl_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$purc_upri_req_typ, Chk01_DtlR.$purc_upri_req_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(PoSchd_Upd01_DtlR.$add_flg, Chk01_DtlR.$add_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_fr_dpt_cd, Chk01_DtlR.$rqst_fr_dpt_cd);
			addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_fr_usr_cd, Chk01_DtlR.$rqst_fr_usr_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.fr_pnl_flg(true);
			if (!src.dlv_sundry_flg()) {
				dest.dlv_nm(null);
			}
			if (!src.tdlv_sundry_flg()) {
				dest.tdlv_nm(null);
			}
		}
	}
	
	/** 発注予定登録ＳＶ（取消） */
	protected Map_PoSchd_Upd01_DtlR_Chk04_DtlR<PoSchd_Upd01_DtlR,Chk04_DtlR> createMap_PoSchd_Upd01_DtlR_Chk04_DtlR() {
		return new Map_PoSchd_Upd01_DtlR_Chk04_DtlR<PoSchd_Upd01_DtlR, Chk04_DtlR>();
	}
	public class Map_PoSchd_Upd01_DtlR_Chk04_DtlR<D extends PoSchd_Upd01_DtlR, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, Chk04_DtlR.$peg_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$err_flg, Chk04_DtlR.$err_flg);
			addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, Chk04_DtlR.$data_crud_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_no, Chk04_DtlR.$po_schd_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, Chk04_DtlR.$po_schd_src_no);
			addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, Chk04_DtlR.$po_schd_src_typ);
			addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no, Chk04_DtlR.$outsrc_itm_ord_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.fr_pnl_flg(true);
		}
	}
	
	/** 発注予定登録ＳＶ（依頼元訂正ＦＬＧ更新） */
	protected Map_PoSchd_Upd04_DtlR_Chk03_DtlR<PoSchd_Upd04_DtlR,Chk03_DtlR> createMap_PoSchd_Upd04_DtlR_Chk03_DtlR() {
		return new Map_PoSchd_Upd04_DtlR_Chk03_DtlR<PoSchd_Upd04_DtlR, Chk03_DtlR>();
	}
	public class Map_PoSchd_Upd04_DtlR_Chk03_DtlR<D extends PoSchd_Upd04_DtlR, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PoSchd_Upd04_DtlR.$po_schd_no, Chk03_DtlR.$po_schd_no);
			addColumnPathMap(PoSchd_Upd04_DtlR.$rqst_crrct_flg, Chk03_DtlR.$rqst_crrct_flg);
			addColumnPathMap(PoSchd_Upd04_DtlR.$rqst_can_flg, Chk03_DtlR.$rqst_can_flg);
		}
	}

	protected MCMessageList chkDac(MCList<Chk01_DtlR> dtlL){
		// ＷＧ自体取得できない場合は、必須チェックで落とすためメッセージは出さない。
		MCList<Chk01_DtlR> subL = dtlL.subList(new MCRowMatcher<Chk01_DtlR>() {
			public boolean match (Chk01_DtlR m) {
				if (isNull(m.purc_dpt_wg_cd())) {
					return false;
				}
				else {
					return true;
				}
			}
		});
		return checkWritableWgCdDac(subL, Chk01_DtlR.$purc_dpt_wg_cd);
	}
	protected MCMessageList chkDacPo(MCList<MST_PO_SCHD_R> schdL){
		return checkWritableWgCdDac(schdL, MST_PO_SCHD_R.$wg_cd);
	}
	protected Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, Chk01_DtlR.$err_flg);
		}
	}

	//FMCB CUSTOM END
}