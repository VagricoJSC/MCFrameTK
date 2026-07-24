package mcframe.serverMSBC.MSBCL6020;

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
import mcframe.serverMSBC.MSBCL6020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSUC.MSUCL0030.*;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.commonFXUC.FXUCC0030.IfDivideInSeqInfo;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import java.math.RoundingMode;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_ReExpService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_ReExpService_MC extends MSBCL_ReExpService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ReExp_Sprt01オペレーション.<p>
	 * 構成展開<p>
	 * 
	 * 製造品の情報を元に構成展開を行い、投入品、副産品の情報を取得する。
	 * 当サービスの再展開オペレーション（Sprt04,05,06）から呼ばれる。
	 */
	public class ReExp_Sprt01 extends MSBCL_ReExpService_MC_A.ReExp_Sprt01 {
		
		// 構成展開結果を一時的に格納するためのリスト。このリストと投入予定、出来高予定（副産品）のテーブルを比較し、結果を下り電文に格納する
		protected MCList<ReExp_Sprt01_RsltInptR> _inptRsltL;
		protected MCList<ReExp_Sprt01_RsltByProdR> _byProdRsltL;

		// 取引先マスタの通貨コードを保持するためのキャッシュ
		FXUCL_Cache<MAM_BP_R> _bpCache;
		// 場所マスタの場所名を保持するためのキャッシュ（副産品の格納場所名取得に使用）
		FXUCL_Cache<MAM_LOC_R> _locCache;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (up0().isEmpty()) {
				return;
			}

			// キャッシュの設定
			setCache();

			// オーダ登録サービスの構成展開を実行
			callExpBom();
			
			// 投入実績の存在チェック
			srchInptAct();

			// 出来高実績の存在チェック
			srchYieldAct();

			// 登録済の投入予定との比較
			compRegedInpt();
			
			// 登録済の出来高予定との比較
			compRegedYield();
			
			// 下り電文の設定
			setDown();
		}
		
		/**
		 * キャッシュを設定する。
		 */
		protected void setCache() {
			
			_bpCache = new FXUCL_Cache<MAM_BP_R>();
			_bpCache.setFixMaxCacheSize(-1);

			// 製造場所ＣＤを条件として、取引先マスタから通貨コードを取得

			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R t1 = MAM_LOC_R.create("T1");
			bpL_bldr.setSelect(t.cur_cd);
			bpL_bldr.addSelect(t.bp_cd);
			bpL_bldr.addSelect(t1.loc_cd);
			bpL_bldr.addInnerJoin(t1, t.bp_cd.eq(t1.sppl_cd));
			bpL_bldr.setWhere(t1.loc_cd.eq(bind("mfg_loc_cd")));
			dbSelect("MSBCL6020_MAM_BP_S01", bpL, bpL_bldr,
					up0().groupBy(ReExp_Sprt01_HdrR.$mfg_loc_cd));
			
			for (MAM_BP_R r : bpL) {
				_bpCache.putCache(new String[] {
						r.getStringNE(MAM_LOC_R.$loc_cd)
				}, r);
			}
			
			_locCache = new FXUCL_Cache<MAM_LOC_R>();
			_locCache.setFixMaxCacheSize(-1);

			// 格納場所ＣＤを条件として、場所マスタから場所名を取得

			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R locL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(locL_t);
			locL_bldr.setSelect(locL_t.loc_cd);
			locL_bldr.addSelect(locL_t.loc_nm);
			locL_bldr.addSelect(locL_t.str_ln_tgt_flg);
			locL_bldr.setWhere(locL_t.loc_cd.eq(bind("strg_loc_cd")));
			dbSelect("MSBCL6020_MAM_LOC_S01", locL, locL_bldr,
					up0().groupBy(ReExp_Sprt01_HdrR.$strg_loc_cd));
			
			for (MAM_LOC_R r : locL) {
				_locCache.putCache(new String[] {
						r.loc_cd()
				}, r);
			}
		}
		
		/**
		 * オーダ登録サービスの構成展開を実行する。
		 */
		protected void callExpBom() {

			// 構成展開の実行
			MSBCL_OrdRegService.Ord_Sprt02 ord = MSBCL_OrdRegService.crtOrd_Sprt02();
			ord.up0().inst_exp_flg(true); //指図時展開ＦＬＧはオン
			ord.up0().get_prov_upri_flg(true); //支給単価取得ＦＬＧはオン
			addAll(ord.up1(), up0(), createMap_Ord_Sprt02_DtlR_ReExp_Sprt01_HdrR());
			ord.exec();
			
			MCList<Ord_Sprt02_RsltR> inptL = MCList.create(Ord_Sprt02_RsltR.class); //投入予定
			MCList<Ord_Sprt02_RsltR> byProdL = MCList.create(Ord_Sprt02_RsltR.class); //副産品予定

			for (Ord_Sprt02_RsltR r : ord.down0()) {

				// 副産品ＦＬＧにより、展開結果を投入予定と副産品予定に分ける
				MAM_BP_R bpR = _bpCache.getCache(r.loc_cd());
				if (r.byprod_flg()) {
					if (isNull(bpR) || isNull(bpR.bp_cd())) {
						byProdL.add(r);
					}
				}
				else {
					inptL.add(r);
				}
			}
			
			// 投入予定の下り電文設定
			setDown0(inptL);

			// 副産品予定の下り電文設定
			setDown1(byProdL);
		}

		/**
		 * 当オペレーションの製造指図の上り電文からオーダ登録サービスの構成展開の上り電文へのへのマッパー
		 * @return
		 */
		protected Map_Ord_Sprt02_DtlR_ReExp_Sprt01_HdrR<Ord_Sprt02_DtlR,ReExp_Sprt01_HdrR> createMap_Ord_Sprt02_DtlR_ReExp_Sprt01_HdrR() {
			return new Map_Ord_Sprt02_DtlR_ReExp_Sprt01_HdrR<Ord_Sprt02_DtlR, ReExp_Sprt01_HdrR>();
		}

		public class Map_Ord_Sprt02_DtlR_ReExp_Sprt01_HdrR<D extends Ord_Sprt02_DtlR, S extends ReExp_Sprt01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt02_DtlR.$peg_no, ReExp_Sprt01_HdrR.$oper_peg_no); //紐付けＮＯには工程紐付けＮＯを設定
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, ReExp_Sprt01_HdrR.$itm_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, ReExp_Sprt01_HdrR.$itm_sub1);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, ReExp_Sprt01_HdrR.$itm_sub2);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, ReExp_Sprt01_HdrR.$itm_sub3);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, ReExp_Sprt01_HdrR.$oper_loc_cd); //製造場所には工程場所を設定
				addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, ReExp_Sprt01_HdrR.$bom_ptn);
				addColumnPathMap(Ord_Sprt02_DtlR.$oper_cd, ReExp_Sprt01_HdrR.$oper_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$oper_seq, ReExp_Sprt01_HdrR.$oper_seq);
				addColumnPathMap(Ord_Sprt02_DtlR.$inst_qty, ReExp_Sprt01_HdrR.$oper_inst_qty);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_st_schd_dt, ReExp_Sprt01_HdrR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$st_schd_tm, ReExp_Sprt01_HdrR.$st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$end_schd_tm, ReExp_Sprt01_HdrR.$end_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno1, ReExp_Sprt01_HdrR.$sno1);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno2, ReExp_Sprt01_HdrR.$sno2);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno3, ReExp_Sprt01_HdrR.$sno3);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno4, ReExp_Sprt01_HdrR.$sno4);
				addColumnPathMap(Ord_Sprt02_DtlR.$cur_cd, ReExp_Sprt01_HdrR.$cur_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (isNull(src.cur_cd())) {
					MAM_BP_R bpR = _bpCache.getCache(src.mfg_loc_cd());
					if (!isNull(bpR)) {
						dest.cur_cd(bpR.cur_cd());
					}
				}
				else {
					dest.cur_cd(src.cur_cd());
				}
			}
		}

		/**
		 * 展開結果から投入予定の下り電文を設定する
		 * @param rsltL 展開結果
		 */
		protected void setDown0(MCList<Ord_Sprt02_RsltR> rsltL) {
			
			_inptRsltL = MCList.create(ReExp_Sprt01_RsltInptR.class);
			
			if (rsltL.isEmpty()) {
				return;
			}
			
			// 展開結果から投入予定を設定
			MCList<ReExp_Sprt01_RsltInptR> inptL = MCList.create(ReExp_Sprt01_RsltInptR.class);
			addAll(inptL, rsltL, createMap_ReExp_Sprt01_RsltInptR_Ord_Sprt02_RsltR());
			
			// 製造指図・工程指図の情報を設定する
			MCIndexKey idxKey = up0().createIndex(ReExp_Sprt01_HdrR.$oper_peg_no);
			for (ReExp_Sprt01_RsltInptR r : inptL) {
				ReExp_Sprt01_HdrR hdrR = up0().getFirst(idxKey, r.oper_peg_no());
				if (!isNull(hdrR)) {
					r.hdr_peg_no(hdrR.hdr_peg_no());
					r.oper_peg_no(hdrR.oper_peg_no());
					r.mfg_inst_no(hdrR.mfg_inst_no());
					r.oper_inst_no(hdrR.oper_inst_no());
					r.oper_cd(hdrR.oper_cd());
					r.oper_seq(hdrR.oper_seq());
					if (isSame(r.inpt_loc_cd(), hdrR.oper_loc_cd())) {
						r.inpt_str_ln_cd(hdrR.oper_str_ln_cd());
						r.inpt_str_ln_nm(hdrR.oper_str_ln_nm());
						r.inpt_str_ln_cd_none_flg(hdrR.oper_str_ln_cd_none_flg());
					}
					else {
						if (r.inpt_str_ln_tgt_flg() && isNull(r.inpt_str_ln_cd())) {
							r.inpt_str_ln_cd(MAC_STR.NULL_VAL.value());
						}
					}
				}
			}
			_inptRsltL.addAll(inptL);
			// 展開結果の再展開実施フラグをオンにする
			_inptRsltL.setBoolean(ReExp_Sprt01_RsltInptR.$re_exp_flg, true);
		}
		
		/**
		 * オーダ登録サービスの構成展開の下り電文から当オペレーションの投入予定の下り電文へのへのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt01_RsltInptR_Ord_Sprt02_RsltR<ReExp_Sprt01_RsltInptR,Ord_Sprt02_RsltR> createMap_ReExp_Sprt01_RsltInptR_Ord_Sprt02_RsltR() {
			return new Map_ReExp_Sprt01_RsltInptR_Ord_Sprt02_RsltR<ReExp_Sprt01_RsltInptR, Ord_Sprt02_RsltR>();
		}

		public class Map_ReExp_Sprt01_RsltInptR_Ord_Sprt02_RsltR<D extends ReExp_Sprt01_RsltInptR, S extends Ord_Sprt02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$oper_peg_no, Ord_Sprt02_RsltR.$peg_no);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$disp_seq, Ord_Sprt02_RsltR.$disp_seq);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_grp_nm, Ord_Sprt02_RsltR.$alt_grp_nm);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_grp_seq, Ord_Sprt02_RsltR.$alt_grp_seq);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_qty, Ord_Sprt02_RsltR.$alt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$itm_nm, Ord_Sprt02_RsltR.$itm_nm);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$th_image, Ord_Sprt02_RsltR.$th_image);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_qty, Ord_Sprt02_RsltR.$inpt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$rqmt_qty, Ord_Sprt02_RsltR.$loss_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty, Ord_Sprt02_RsltR.$fxd_chd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$io_schd_rqmt_qty, Ord_Sprt02_RsltR.$rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$base_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$base_unit_nm, Ord_Sprt02_RsltR.$unit_nm);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$base_dec_place, Ord_Sprt02_RsltR.$dec_place);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$base_unit_conv_rnd_typ, Ord_Sprt02_RsltR.$unit_conv_rnd_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$std_cont_fctr, Ord_Sprt02_RsltR.$std_cont_fctr);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_fctr_flg, Ord_Sprt02_RsltR.$cont_fctr_flg);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_fctr_rnd_typ, Ord_Sprt02_RsltR.$cont_fctr_rnd_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_fctr_dec_place, Ord_Sprt02_RsltR.$cont_fctr_dec_place);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd, Ord_Sprt02_RsltR.$cont_fctr_unit_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_fctr_unit_nm, Ord_Sprt02_RsltR.$cont_fctr_unit_nm);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_schd_dt, Ord_Sprt02_RsltR.$schd_in_dt);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_loc_cd, Ord_Sprt02_RsltR.$loc_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_loc_nm, Ord_Sprt02_RsltR.$loc_nm);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_str_ln_tgt_flg, Ord_Sprt02_RsltR.$str_ln_tgt_flg);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$gd_cd, Ord_Sprt02_RsltR.$gd_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$gd_nm, Ord_Sprt02_RsltR.$gd_nm);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg, Ord_Sprt02_RsltR.$inst_lot_fix_flg);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$ver_no, Ord_Sprt02_RsltR.$ver_no);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$bom_id, Ord_Sprt02_RsltR.$bom_id);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$itm_seq, Ord_Sprt02_RsltR.$itm_seq);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$bkf_typ, Ord_Sprt02_RsltR.$bkf_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$main_itm_flg, Ord_Sprt02_RsltR.$main_itm_flg);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$bom_memo1, Ord_Sprt02_RsltR.$memo1);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$bom_memo2, Ord_Sprt02_RsltR.$memo2);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$bom_memo3, Ord_Sprt02_RsltR.$memo3);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alloc_ctl_typ, Ord_Sprt02_RsltR.$alloc_ctl_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_ctl_typ, Ord_Sprt02_RsltR.$inpt_ctl_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$in_offst_typ, Ord_Sprt02_RsltR.$in_offst_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$in_offst, Ord_Sprt02_RsltR.$in_offst);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$stk_mng_typ, Ord_Sprt02_RsltR.$stk_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$prov_typ, Ord_Sprt02_RsltR.$prov_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$prov_upri, Ord_Sprt02_RsltR.$prov_upri);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$prov_cur_cd, Ord_Sprt02_RsltR.$prov_cur_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_alloc_prio, Ord_Sprt02_RsltR.$alt_alloc_prio);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$alt_itm_ratio, Ord_Sprt02_RsltR.$alt_itm_ratio);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$par_inst_qty, Ord_Sprt02_RsltR.$par_inst_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$chd_inpt_qty, Ord_Sprt02_RsltR.$chd_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$chd_rqmt_qty, Ord_Sprt02_RsltR.$chd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty, Ord_Sprt02_RsltR.$fxd_chd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$yield_calc_flg, Ord_Sprt02_RsltR.$yield_calc_flg);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$lot_mng_typ, Ord_Sprt02_RsltR.$lot_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$lot_no_typ, Ord_Sprt02_RsltR.$lot_no_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$lot_no_ptn_cd, Ord_Sprt02_RsltR.$lot_no_ptn_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sublot_mng_typ, Ord_Sprt02_RsltR.$sublot_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sublot_no_typ, Ord_Sprt02_RsltR.$sublot_no_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sublot_no_ptn_cd, Ord_Sprt02_RsltR.$sublot_no_ptn_cd);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sno1_mng_typ, Ord_Sprt02_RsltR.$sno1_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sno2_mng_typ, Ord_Sprt02_RsltR.$sno2_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sno3_mng_typ, Ord_Sprt02_RsltR.$sno3_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sno4_mng_typ, Ord_Sprt02_RsltR.$sno4_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$ver_flg, Ord_Sprt02_RsltR.$ver_flg);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty, Ord_Sprt02_RsltR.$fxd_rqmt_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {

				// 必要数量合計を算出する
				dest.total_rqmt_qty(sum(dest.rqmt_qty(), dest.fxd_rqmt_qty()));

				// 有効成分（投入数量）～有効成分（必要数量合計）を算出する
				dest.cont_inpt_qty(convToContFctrUnit(dest.inpt_qty(),
						src.std_cont_fctr(), src.cont_fctr_dec_place(),
						src.cont_fctr_rnd_typ()));
				dest.cont_rqmt_qty(convToContFctrUnit(dest.rqmt_qty(),
						src.std_cont_fctr(), src.cont_fctr_dec_place(),
						src.cont_fctr_rnd_typ()));
				dest.cont_fxd_rqmt_qty(convToContFctrUnit(dest.fxd_rqmt_qty(),
						src.std_cont_fctr(), src.cont_fctr_dec_place(),
						src.cont_fctr_rnd_typ()));
				dest.sum_cont_rqmt_qty(convToContFctrUnit(dest.total_rqmt_qty(),
						src.std_cont_fctr(), src.cont_fctr_dec_place(),
						src.cont_fctr_rnd_typ()));
				
				// 手配区分が展開またはＮＵＬＬ可展開の場合、手配ＮＯを設定する
				// 手配区分がＮＵＬＬ可展開の場合、手配ＮＯ無し可ＦＬＧをオンにする
				dest.sno1_null_flg(false);
				if (MAC_SNO_TYP.isEXTND(src.sno_typ1()) || MAC_SNO_TYP.isEXTND_NULL((src.sno_typ1()))) {
					dest.sno1(src.sno1());
					if(MAC_SNO_TYP.isEXTND_NULL((src.sno_typ1()))){
						dest.sno1_null_flg(true);
					}
				}
				else {
					dest.sno1(MAC_STR.NULL_VAL.value());
				}

				dest.sno2_null_flg(false);
				if (MAC_SNO_TYP.isEXTND(src.sno_typ2()) || MAC_SNO_TYP.isEXTND_NULL((src.sno_typ2()))) {
					dest.sno2(src.sno2());
					if(MAC_SNO_TYP.isEXTND_NULL((src.sno_typ2()))){
						dest.sno2_null_flg(true);
					}
				}
				else {
					dest.sno2(MAC_STR.NULL_VAL.value());
				}
				
				dest.sno3_null_flg(false);
				if (MAC_SNO_TYP.isEXTND(src.sno_typ3()) || MAC_SNO_TYP.isEXTND_NULL((src.sno_typ3()))) {
					dest.sno3(src.sno3());
					if(MAC_SNO_TYP.isEXTND_NULL((src.sno_typ3()))){
						dest.sno3_null_flg(true);
					}
				}
				else {
					dest.sno3(MAC_STR.NULL_VAL.value());
				}
				dest.sno4_null_flg(false);
				if (MAC_SNO_TYP.isEXTND(src.sno_typ4()) || MAC_SNO_TYP.isEXTND_NULL((src.sno_typ4()))) {
					dest.sno4(src.sno4());
					if(MAC_SNO_TYP.isEXTND_NULL((src.sno_typ4()))){
						dest.sno4_null_flg(true);
					}
				}
				else {
					dest.sno4(MAC_STR.NULL_VAL.value());
				}
				
				dest.lot_mix_flg(src.lot_mix_flg());
				dest.sublot_mix_flg(src.sublot_mix_flg());
				
			}
		}

		/**
		 * 展開結果から副産品予定の下り電文を設定する
		 * @param rsltL 展開結果
		 */
		protected void setDown1(MCList<Ord_Sprt02_RsltR> rsltL) {

			_byProdRsltL = MCList.create(ReExp_Sprt01_RsltByProdR.class);

			if (rsltL.isEmpty()) {
				return;
			}
			
			MCList<ReExp_Sprt01_RsltByProdR> byProdL = MCList.create(ReExp_Sprt01_RsltByProdR.class);
			addAll(byProdL, rsltL, createMap_ReExp_Sprt01_RsltByProdR_Ord_Sprt02_RsltR());
			
			// 製造指図・工程指図の情報を設定する
			MCIndexKey idxKey = up0().createIndex(ReExp_Sprt01_HdrR.$oper_peg_no);
			for (ReExp_Sprt01_RsltByProdR r : byProdL) {
				ReExp_Sprt01_HdrR hdrR = up0().getFirst(idxKey, r.oper_peg_no());
				if (!isNull(hdrR)) {
					r.hdr_peg_no(hdrR.hdr_peg_no());
					r.oper_peg_no(hdrR.oper_peg_no());
					r.mfg_inst_no(hdrR.mfg_inst_no());
					r.oper_inst_no(hdrR.oper_inst_no());
					r.oper_cd(hdrR.oper_cd());
					r.oper_seq(hdrR.oper_seq());
					r.strg_loc_cd(hdrR.strg_loc_cd());
					MAM_LOC_R locR = _locCache.getCache(hdrR.strg_loc_cd());
					r.strg_loc_nm(locR.loc_nm());
					r.strg_str_ln_tgt_flg(locR.str_ln_tgt_flg());
					r.strg_str_ln_cd(hdrR.strg_str_ln_cd());
					r.strg_str_ln_nm(hdrR.strg_str_ln_nm());
					r.strg_str_ln_cd_none_flg(hdrR.strg_str_ln_cd_none_flg());
				}
			}
			_byProdRsltL.addAll(byProdL);
			// 展開結果の再展開実施フラグをオンにする
			_byProdRsltL.setBoolean(ReExp_Sprt01_RsltByProdR.$re_exp_flg, true);
		}
		
		/**
		 * オーダ登録サービスの構成展開の下り電文から当オペレーションの副産品予定の下り電文へのへのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt01_RsltByProdR_Ord_Sprt02_RsltR<ReExp_Sprt01_RsltByProdR,Ord_Sprt02_RsltR> createMap_ReExp_Sprt01_RsltByProdR_Ord_Sprt02_RsltR() {
			return new Map_ReExp_Sprt01_RsltByProdR_Ord_Sprt02_RsltR<ReExp_Sprt01_RsltByProdR, Ord_Sprt02_RsltR>();
		}

		public class Map_ReExp_Sprt01_RsltByProdR_Ord_Sprt02_RsltR<D extends ReExp_Sprt01_RsltByProdR, S extends Ord_Sprt02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$oper_peg_no, Ord_Sprt02_RsltR.$peg_no);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$disp_seq, Ord_Sprt02_RsltR.$disp_seq);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$itm_nm, Ord_Sprt02_RsltR.$itm_nm);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$th_image, Ord_Sprt02_RsltR.$th_image);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$lot_mng_typ, Ord_Sprt02_RsltR.$lot_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$lot_no_typ, Ord_Sprt02_RsltR.$lot_no_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$lot_no_ptn_cd, Ord_Sprt02_RsltR.$lot_no_ptn_cd);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sublot_mng_typ, Ord_Sprt02_RsltR.$sublot_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sublot_no_typ, Ord_Sprt02_RsltR.$sublot_no_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sublot_no_ptn_cd, Ord_Sprt02_RsltR.$sublot_no_ptn_cd);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno1_mng_typ, Ord_Sprt02_RsltR.$sno1_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno2_mng_typ, Ord_Sprt02_RsltR.$sno2_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno3_mng_typ, Ord_Sprt02_RsltR.$sno3_mng_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno4_mng_typ, Ord_Sprt02_RsltR.$sno4_mng_typ);
				// 取引単位には基準単位と同値を設定
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$trd_unit_qty, Ord_Sprt02_RsltR.$inpt_qty); //副産品は投入数量＝必要数量のため、投入数量を設定
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$trd_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$trd_unit_nm, Ord_Sprt02_RsltR.$unit_nm);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$trd_dec_place, Ord_Sprt02_RsltR.$dec_place);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$trd_unit_conv_rnd_typ, Ord_Sprt02_RsltR.$unit_conv_rnd_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$base_unit_qty, Ord_Sprt02_RsltR.$inpt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$base_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$base_unit_nm, Ord_Sprt02_RsltR.$unit_nm);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$base_dec_place, Ord_Sprt02_RsltR.$dec_place);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$base_unit_conv_rnd_typ, Ord_Sprt02_RsltR.$unit_conv_rnd_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$yield_schd_dt, Ord_Sprt02_RsltR.$schd_in_dt);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno1, Ord_Sprt02_RsltR.$sno1);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno2, Ord_Sprt02_RsltR.$sno2);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno3, Ord_Sprt02_RsltR.$sno3);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$sno4, Ord_Sprt02_RsltR.$sno4);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$bkf_typ, Ord_Sprt02_RsltR.$bkf_typ);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$par_inst_qty, Ord_Sprt02_RsltR.$par_inst_qty);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$chd_inpt_qty, Ord_Sprt02_RsltR.$chd_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$chd_rqmt_qty, Ord_Sprt02_RsltR.$chd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$fxd_chd_rqmt_qty, Ord_Sprt02_RsltR.$fxd_chd_rqmt_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				// 基準単位からの換算の場合、換算基準数量、換算数量は１固定
				dest.conv_base_qty(1);
				dest.conv_qty(1);
			}
		}
		
		/**
		 * 投入実績が存在するかどうか確認する
		 */
		protected void srchInptAct() {

			// 投入実績をキャッシュ
			FXUCL_Cache<MST_INPT_ACT_R> cache = new FXUCL_Cache<MST_INPT_ACT_R>();
			cache.setFixMaxCacheSize(-1);

			MCList<MST_INPT_ACT_R> dbL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.inpt_schd_no, t.inpt_act_no);
			dbL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			dbSelect("MSBCL6020_MST_INPT_ACT_S01", dbL, dbL_bldr, up1());

			for (MST_INPT_ACT_R r : dbL) {
				cache.putCache(new String[] {
						r.getStringNE(MST_INPT_ACT_R.$inpt_schd_no)
				}, r);
			}

			// 上り電文（投入予定の検索結果）の実績ありフラグを設定
			for (ReExp_Sprt01_DtlInptR r : up1()) {
				MST_INPT_ACT_R actR = cache.getCache(r.inpt_schd_no());
				r.act_flg(!isNull(actR));
			}
		}
		
		/**
		 * 出来高実績（副産品）が存在するかどうか確認する
		 */
		protected void srchYieldAct() {
			
			// 出来高実績をキャッシュ
			FXUCL_Cache<MST_YIELD_ACT_R> cache = new FXUCL_Cache<MST_YIELD_ACT_R>();
			cache.setFixMaxCacheSize(-1);

			MCList<MST_YIELD_ACT_R> dbL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.yield_schd_no, t.yield_act_no);
			dbL_bldr.setWhere(t.yield_schd_no.eq(bind("yield_schd_no")));
			dbL_bldr.addWhereWithAnd(t.yield_typ.eq(bind("1")), MAC_YIELD_TYP.BYPROD.value());
			dbSelect("MSBCL6020_MST_YIELD_ACT_S01", dbL, dbL_bldr, up2());

			for (MST_YIELD_ACT_R r : dbL) {
				cache.putCache(new String[] {
						r.getStringNE(MST_YIELD_ACT_R.$yield_schd_no)
				}, r);
			}

			// 上り電文（出来高予定の検索結果）の実績ありフラグを設定
			for (ReExp_Sprt01_DtlByProdR r : up2()) {
				MST_YIELD_ACT_R actR = cache.getCache(r.yield_schd_no());
				r.act_flg(!isNull(actR));
			}
		}
		
		/**
		 * 登録済の投入予定と比較し、下り電文を編集する
		 */
		protected void compRegedInpt() {

			MCList<ReExp_Sprt01_RsltInptR> rsltL = MCList.create(ReExp_Sprt01_RsltInptR.class); //製造指図済（製造指図ＮＯあり）
			MCList<ReExp_Sprt01_RsltInptR> notInstRsltL = MCList.create(ReExp_Sprt01_RsltInptR.class); //製造指図前（製造指図ＮＯなし）

			// 展開結果を製造指図ＮＯが設定されている行、されていない行に分別
			for (ReExp_Sprt01_RsltInptR r : _inptRsltL) {
				if (isNull(r.oper_inst_no())) {
					// 製造指図前
					notInstRsltL.add(r);
				}
				else {
					// 製造指図済
					rsltL.add(r);
				}
			}
			
			// 製造指図前の行については、下り電文のすべての行のROWステータスに「新規作成」を設定し、下り電文に追加
			if (!notInstRsltL.isEmpty()) {
				notInstRsltL.setStatus(MCRow.Status.CREATE);
				down0().addAll(notInstRsltL);
			}
			
			// ヘッダの工程紐付けＮＯから投入の展開結果を抽出するためのインデックスキー
			MCIndexKey operPegKey = rsltL.createIndex(ReExp_Sprt01_RsltInptR.$oper_peg_no);
			
			// ヘッダの工程指図ＮＯから投入予定のテーブルを抽出するためのインデックスキー
			MCIndexKey operNoKey = up1().createIndex(ReExp_Sprt01_DtlInptR.$oper_inst_no);
			
			// ヘッダ（製造・工程情報）を元にループ
			for (ReExp_Sprt01_HdrR hdrR : up0()) {
				
				// ヘッダの工程紐付けＮＯから投入の展開結果を抽出
				MCList<ReExp_Sprt01_RsltInptR> rsltOperL = rsltL.subList(operPegKey, hdrR.oper_peg_no());

				// ヘッダに工程指図ＮＯが設定されていない場合は新規追加された展開結果と判断し、新規行として下り電文に追加
				if (!rsltOperL.isEmpty() && isNull(hdrR.oper_inst_no())) {
					rsltOperL.setStatus(MCRow.Status.CREATE);
					down0().addAll(rsltOperL);
					continue;
				}

				// 工程指図ＮＯで投入予定を取得
				MCList<ReExp_Sprt01_DtlInptR> tblOperL = up1().subList(operNoKey, hdrR.oper_inst_no());
				
				// 投入予定から工程ＣＤ、工程連番、品目ＣＤ、枝番１～３、版ＮＯ、代替グループＣＤ、代替グループ連番、同一子品目連番でマッチングするためのキー

				// 代替品かつ版管理品
				MCIndexKey matchVerAltKey = tblOperL.createIndex(
						ReExp_Sprt01_DtlInptR.$oper_cd, ReExp_Sprt01_DtlInptR.$oper_seq,
						ReExp_Sprt01_DtlInptR.$itm_cd, ReExp_Sprt01_DtlInptR.$itm_sub1,
						ReExp_Sprt01_DtlInptR.$itm_sub2, ReExp_Sprt01_DtlInptR.$itm_sub3,
						ReExp_Sprt01_DtlInptR.$ver_no, ReExp_Sprt01_DtlInptR.$alt_grp_cd,
						ReExp_Sprt01_DtlInptR.$itm_seq);

				// 代替品
				MCIndexKey matchAltKey = tblOperL.createIndex(
						ReExp_Sprt01_DtlInptR.$oper_cd, ReExp_Sprt01_DtlInptR.$oper_seq,
						ReExp_Sprt01_DtlInptR.$itm_cd, ReExp_Sprt01_DtlInptR.$itm_sub1,
						ReExp_Sprt01_DtlInptR.$itm_sub2, ReExp_Sprt01_DtlInptR.$itm_sub3,
						ReExp_Sprt01_DtlInptR.$alt_grp_cd,
						ReExp_Sprt01_DtlInptR.$itm_seq);

				// 版管理品
				MCIndexKey matchVerKey = tblOperL.createIndex(
						ReExp_Sprt01_DtlInptR.$oper_cd, ReExp_Sprt01_DtlInptR.$oper_seq,
						ReExp_Sprt01_DtlInptR.$itm_cd, ReExp_Sprt01_DtlInptR.$itm_sub1,
						ReExp_Sprt01_DtlInptR.$itm_sub2, ReExp_Sprt01_DtlInptR.$itm_sub3,
						ReExp_Sprt01_DtlInptR.$ver_no, ReExp_Sprt01_DtlInptR.$itm_seq);

				// 上記以外
				MCIndexKey matchKey = tblOperL.createIndex(
						ReExp_Sprt01_DtlInptR.$oper_cd, ReExp_Sprt01_DtlInptR.$oper_seq,
						ReExp_Sprt01_DtlInptR.$itm_cd, ReExp_Sprt01_DtlInptR.$itm_sub1,
						ReExp_Sprt01_DtlInptR.$itm_sub2, ReExp_Sprt01_DtlInptR.$itm_sub3,
						ReExp_Sprt01_DtlInptR.$itm_seq);

				// 展開結果を元に投入予定を比較
				for (ReExp_Sprt01_RsltInptR rsltR : rsltOperL) {
	
					// 工程ＣＤ、工程連番、品目ＣＤ、枝番１～３、代替グループＣＤ、同一子品目連番でマッチングフラグがオフのレコードを抽出
					// 代替Ｇ連番は再展開結果と投入予定が同一になることが保証されていないため、マッチングには使用しない。
					// 同一代替グループＣＤ内に複数の代替Ｇ連番が存在する場合は、マッチングせずに全件削除／新規追加する。
					MCList<ReExp_Sprt01_DtlInptR> tblL = MCList.create(ReExp_Sprt01_DtlInptR.class);

					if (!isNull(rsltR.alt_grp_cd()) && !isNull(rsltR.ver_no())) {
						// 代替品かつ版管理品
						tblL = tblOperL.subList(matchVerAltKey, rsltR.oper_cd(),
								rsltR.oper_seq(), rsltR.itm_cd(), rsltR.itm_sub1(),
								rsltR.itm_sub2(), rsltR.itm_sub3(), rsltR.ver_no(),
								rsltR.alt_grp_cd(), rsltR.itm_seq());
					}
					else if (!isNull(rsltR.alt_grp_cd())) {
						// 代替品
						tblL = tblOperL.subList(matchAltKey,
								rsltR.oper_cd(), rsltR.oper_seq(), rsltR.itm_cd(),
								rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3(),
								rsltR.alt_grp_cd(), rsltR.itm_seq());
					}
					else if (!isNull(rsltR.ver_no())) {
						// 版管理品
						tblL = tblOperL.subList(matchVerKey, rsltR.oper_cd(),
								rsltR.oper_seq(), rsltR.itm_cd(), rsltR.itm_sub1(),
								rsltR.itm_sub2(), rsltR.itm_sub3(), rsltR.ver_no(),
								rsltR.itm_seq());
					}
					else {
						// 上記以外
						tblL = tblOperL.subList(matchKey,
								rsltR.oper_cd(), rsltR.oper_seq(), rsltR.itm_cd(),
								rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3(),
								rsltR.itm_seq());
					}
					
					MCIndexKey tblKey = tblL.createIndex(ReExp_Sprt01_DtlInptR.$act_flg);
					
					// 該当する投入予定のテーブルが存在しない場合、またはtblLに代替Ｇ連番が混在する場合、追加ステータスで下り電文に追加
					if (tblL.isEmpty() || isAltGrpSeqMix(tblL)) {
						if (isAddCrtR(tblL, rsltR)) {
							rsltR.setStatus(MCRow.Status.CREATE);
							down0().add(rsltR);
						}
						continue;
					}

					// テーブルに対して展開結果マッチングフラグをオンにする
					tblL.setBoolean(ReExp_Sprt01_DtlInptR.$match_flg, true);

					// 該当する投入予定のテーブルの１件目を取得
					ReExp_Sprt01_DtlInptR tblR = tblL.get(0);

					// テーブルから実績登録済のレコードを抽出し、投入実績の有無を判断する
					ReExp_Sprt01_DtlInptR actR = tblL.getFirst(tblKey, true);

					if (!isNull(actR)) {
						// 投入実績が発生している場合、展開結果を反映せず、元のテーブルの値を下り電文に追加
						tblL.setStatus(MCRow.Status.NONE);
						addAll(down0(), tblL, createMap_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR());

						// マスタ項目が不一致の場合は実績登録済で展開できなかった旨をインフォメーションとして戻す
						if (!compInptCol(tblR, rsltR)) {
							MCMessagePool.add(new MCMessage(tblR, null, MSBCL1047, 
									toDispItm(tblR.itm_cd(), tblR.itm_sub1(), tblR.itm_sub2(), tblR.itm_sub3()), toDispGUIIndex(tblR)));
						}
						continue;
					}

					// 展開結果の数量項目を投入予定の各行に案分
					divideInptQty(tblL, rsltR);
					
					// 投入実績が発生していない場合、展開結果を下り電文に追加
					for (ReExp_Sprt01_DtlInptR r : tblL) {
						ReExp_Sprt01_RsltInptR addR = rsltR.clone();
						// 紐付けＮＯ、上記で案分した数量項目のみ投入予定から設定
						copy(addR, r, createMap_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR_Qty());
						addR.setStatus(MCRow.Status.MODIFY);
						down0().add(addR);
					}
				}
			}

			// 展開結果マッチングフラグがオフの投入予定を抽出
			MCList<ReExp_Sprt01_DtlInptR> unmatchedL = up1().subList(ReExp_Sprt01_DtlInptR.$match_flg, false);

			if (!unmatchedL.isEmpty()) {
				// 実績あり／なしで仕分け
				MCList<ReExp_Sprt01_DtlInptR> actL = unmatchedL.subList(ReExp_Sprt01_DtlInptR.$act_flg, true);
				MCList<ReExp_Sprt01_DtlInptR> instL = unmatchedL.subList(ReExp_Sprt01_DtlInptR.$act_flg, false);

				if (!actL.isEmpty()) {
					// 実績ありの場合はメッセージを表示して、元のテーブルの値をそのまま追加
					for (ReExp_Sprt01_DtlInptR r : actL) {
						MCMessagePool.add(new MCMessage(r, null, MSBCL1047, 
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
					MCList<ReExp_Sprt01_RsltInptR> noneL = MCList.create(ReExp_Sprt01_RsltInptR.class);
					addAll(noneL, actL, createMap_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR());
					noneL.setStatus(MCRow.Status.NONE);
					down0().addAll(noneL);
				}
				
				if (!instL.isEmpty()) {
					// 実績なしの場合は削除
					MCList<ReExp_Sprt01_RsltInptR> delL = MCList.create(ReExp_Sprt01_RsltInptR.class);
					addAll(delL, instL, createMap_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR());
					delL.setStatus(MCRow.Status.DELETE);
					down0().addAll(delL);
				}
			}
		}

		/**
		 * テーブルと展開結果のマスタ項目を比較し、すべて一致する場合はtrue、不一致がある場合はfalseを返す
		 * 
		 * @param tblR テーブル
		 * @param rsltR 展開結果
		 * @return
		 */
		protected boolean compInptCol(ReExp_Sprt01_DtlInptR tblR, ReExp_Sprt01_RsltInptR rsltR) {
			if (!isSame(tblR.par_inst_qty(), rsltR.par_inst_qty())) {return false;}
			if (!isSame(tblR.chd_inpt_qty(), rsltR.chd_inpt_qty())) {return false;}
			if (!isSame(tblR.chd_rqmt_qty(), rsltR.chd_rqmt_qty())) {return false;}
			if (!isSame(tblR.fxd_chd_rqmt_qty(), rsltR.fxd_chd_rqmt_qty())) {return false;}
			if (!isSame(tblR.alt_qty(), rsltR.alt_qty())) {return false;}
			if (!isSame(tblR.in_offst_typ(), rsltR.in_offst_typ())) {return false;}
			if (!isSame(tblR.in_offst(), rsltR.in_offst())) {return false;}
			return true;
		}

		/**
		 * 構成展開結果の数量を、投入予定の各行に案分する。ロット割れなどでマッチングキーが同一の行が複数存在する場合を考慮した処理
		 * @param tblL 投入予定のリスト（呼出元で最古入庫日、ロットシーケンス順にソートされていることが前提）
		 * @param totalQty 案分対象の数量
		 * @param colName 案分結果を格納するカラム名
		 */
		protected void divideInptQty(MCList<ReExp_Sprt01_DtlInptR> tblL, MCNumber totalQty, String colName) {
			
			// 案分対象の数量の割り当て
           	IfDivideInSeqInfo<ReExp_Sprt01_DtlInptR> info = FXUCC_Divide.inSeq(tblL, totalQty, colName, colName);

           	if(info.remainder().gt(0)) {
				// ロットＮＯが指定されていない、または引当がオフのレコードを抽出
				MCList<ReExp_Sprt01_DtlInptR> subL = tblL.subList(r -> isNull(r.lot_no()) || !r.alloc_flg());
				ReExp_Sprt01_DtlInptR tblR = ReExp_Sprt01_DtlInptR.create();
				if (subL.isEmpty()) {
					// 存在しない場合、tblLの最終レコード（最古入庫日が最大のレコード）を抽出
					tblR = tblL.get(tblL.size()-1);
				}
				else {
					// 存在する場合、subLの最終レコード（最古入庫日が最大のレコード）を抽出
					tblR = subL.get(subL.size()-1);
				}
				tblR.setNumber(colName, sum(nvl(tblR.getNumber(colName), MCNumber.ZERO), info.remainder()));
           	}
		}
		
		/**
		 * 構成展開結果の数量を、投入予定の各行に案分する。ロット割れなどでマッチングキーが同一の行が複数存在する場合を考慮した処理
		 * @param tblL 投入予定のリスト
		 * @param rsltR 構成展開結果の行
		 */
		protected void divideInptQty(MCList<ReExp_Sprt01_DtlInptR> tblL, ReExp_Sprt01_RsltInptR rsltR) {
			
			// 最古入庫日、ロットシーケンス順にソート
			tblL.sort(ReExp_Sprt01_DtlInptR.$first_gr_dt, ReExp_Sprt01_DtlInptR.$lot_seq);

			if (rsltR.cont_fctr_flg()) {
				// 有効成分（投入数量）
				divideInptQty(tblL, rsltR.cont_inpt_qty(), ReExp_Sprt01_DtlInptR.$cont_inpt_qty);
				// 有効成分（必要数量）
				divideInptQty(tblL, rsltR.cont_rqmt_qty(), ReExp_Sprt01_DtlInptR.$cont_rqmt_qty);
				// 有効成分（固定必要数量）
				divideInptQty(tblL, rsltR.cont_fxd_rqmt_qty(), ReExp_Sprt01_DtlInptR.$cont_fxd_rqmt_qty);
				// 有効成分（必要数量合計）
				divideInptQty(tblL, rsltR.sum_cont_rqmt_qty(), ReExp_Sprt01_DtlInptR.$sum_cont_rqmt_qty);

				// 必要数量合計の算出、有効成分から基準単位への変換
				for (ReExp_Sprt01_DtlInptR r : tblL) {
					// 投入数量
					r.inpt_qty(convToBaseUnitFromContFctrUnit(r.cont_inpt_qty(),
							nvl(r.act_cont_fctr(), rsltR.std_cont_fctr()),
							rsltR.base_dec_place(), rsltR.base_unit_conv_rnd_typ()));					
					// 必要数量
					r.rqmt_qty(convToBaseUnitFromContFctrUnit(r.cont_rqmt_qty(),
							nvl(r.act_cont_fctr(), rsltR.std_cont_fctr()),
							rsltR.base_dec_place(), rsltR.base_unit_conv_rnd_typ()));					
					// 固定必要数量
					r.fxd_rqmt_qty(convToBaseUnitFromContFctrUnit(r.cont_fxd_rqmt_qty(),
							nvl(r.act_cont_fctr(), rsltR.std_cont_fctr()),
							rsltR.base_dec_place(), rsltR.base_unit_conv_rnd_typ()));					
					// 必要数量合計
					r.total_rqmt_qty(convToBaseUnitFromContFctrUnit(r.sum_cont_rqmt_qty(),
							nvl(r.act_cont_fctr(), rsltR.std_cont_fctr()),
							rsltR.base_dec_place(), rsltR.base_unit_conv_rnd_typ()));					
				}
			}
			else {
				// 投入数量
				divideInptQty(tblL, rsltR.inpt_qty(), ReExp_Sprt01_DtlInptR.$inpt_qty);
				// 必要数量
				divideInptQty(tblL, rsltR.rqmt_qty(), ReExp_Sprt01_DtlInptR.$rqmt_qty);
				// 固定必要数量
				divideInptQty(tblL, rsltR.fxd_rqmt_qty(), ReExp_Sprt01_DtlInptR.$fxd_rqmt_qty);
				// 必要数量合計
				divideInptQty(tblL, rsltR.total_rqmt_qty(), ReExp_Sprt01_DtlInptR.$total_rqmt_qty);
			}
		}

		/**
		 * tblL内に複数の代替Ｇ連番が混在する場合はtrueを返す
		 * @param tblL
		 * @return
		 */
		protected boolean isAltGrpSeqMix(MCList<ReExp_Sprt01_DtlInptR> tblL) {
			MCList<ReExp_Sprt01_DtlInptR> subL = tblL.groupBy(ReExp_Sprt01_DtlInptR.$alt_grp_seq);
			if (subL.size() > 1) {
				return true;
			}
			return false;
		}
		
		protected boolean isAddCrtR(MCList<ReExp_Sprt01_DtlInptR> tblL, ReExp_Sprt01_RsltInptR rsltR) {
			if (tblL.isEmpty()) {
				return true;
			}
			
			MCIndexKey tblActTgtKey = tblL.createIndex(
					ReExp_Sprt01_DtlInptR.$mfg_inst_no, ReExp_Sprt01_DtlInptR.$oper_inst_no,
					ReExp_Sprt01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_DtlInptR.$alt_grp_seq,
					ReExp_Sprt01_DtlInptR.$itm_cd, ReExp_Sprt01_DtlInptR.$itm_sub1,
					ReExp_Sprt01_DtlInptR.$itm_sub2, ReExp_Sprt01_DtlInptR.$itm_sub3,
					ReExp_Sprt01_DtlInptR.$ver_no, ReExp_Sprt01_DtlInptR.$act_flg);
			
			ReExp_Sprt01_DtlInptR actR = tblL.getFirst(
					tblActTgtKey,
					rsltR.mfg_inst_no(), rsltR.oper_inst_no(),
					rsltR.alt_grp_cd(), rsltR.alt_grp_seq(),
					rsltR.itm_cd(), rsltR.itm_sub1(),
					rsltR.itm_sub2(), rsltR.itm_sub3(),
					rsltR.ver_no(), true);
			
			if (isNull(actR)) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 投入予定のテーブルから展開結果へのマッピング
		 * @return
		 */
		protected Map_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR<ReExp_Sprt01_RsltInptR,ReExp_Sprt01_DtlInptR> createMap_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR() {
			return new Map_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR<ReExp_Sprt01_RsltInptR, ReExp_Sprt01_DtlInptR>();
		}

		public class Map_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR<D extends ReExp_Sprt01_RsltInptR, S extends ReExp_Sprt01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$peg_no, ReExp_Sprt01_DtlInptR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.re_exp_flg(false);
			}
		}

		/**
		 * 投入予定のテーブルから展開結果へのマッピング（数量更新）
		 * @return
		 */
		protected Map_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR_Qty<ReExp_Sprt01_RsltInptR,ReExp_Sprt01_DtlInptR> createMap_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR_Qty() {
			return new Map_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR_Qty<ReExp_Sprt01_RsltInptR, ReExp_Sprt01_DtlInptR>();
		}

		public class Map_ReExp_Sprt01_RsltInptR_ReExp_Sprt01_DtlInptR_Qty<D extends ReExp_Sprt01_RsltInptR, S extends ReExp_Sprt01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$peg_no, ReExp_Sprt01_DtlInptR.$peg_no);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$inpt_qty, ReExp_Sprt01_DtlInptR.$inpt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$rqmt_qty, ReExp_Sprt01_DtlInptR.$rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty, ReExp_Sprt01_DtlInptR.$fxd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$total_rqmt_qty, ReExp_Sprt01_DtlInptR.$total_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_inpt_qty, ReExp_Sprt01_DtlInptR.$cont_inpt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_rqmt_qty, ReExp_Sprt01_DtlInptR.$cont_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_DtlInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(ReExp_Sprt01_RsltInptR.$sum_cont_rqmt_qty, ReExp_Sprt01_DtlInptR.$sum_cont_rqmt_qty);
			}
		}

		/**
		 * 登録済の出来高予定と比較し、下り電文を編集する
		 */
		protected void compRegedYield() {

			MCList<ReExp_Sprt01_RsltByProdR> rsltL = MCList.create(ReExp_Sprt01_RsltByProdR.class); //製造指図済（製造指図ＮＯあり）
			MCList<ReExp_Sprt01_RsltByProdR> notInstRsltL = MCList.create(ReExp_Sprt01_RsltByProdR.class); //製造指図前（製造指図ＮＯなし）
			
			// 展開結果を製造指図ＮＯが設定されている行、されていない行に分別
			for (ReExp_Sprt01_RsltByProdR r : _byProdRsltL) {
				if (isNull(r.oper_inst_no())) {
					// 製造指図前
					notInstRsltL.add(r);
				}
				else {
					// 製造指図済
					rsltL.add(r);
				}
			}
			
			// 製造指図前の行については、下り電文のすべての行のROWステータスに「新規作成」を設定し、下り電文に追加
			if (!notInstRsltL.isEmpty()) {
				notInstRsltL.setStatus(MCRow.Status.CREATE);
				down1().addAll(notInstRsltL);
			}
			
			// ヘッダの工程紐付けＮＯから副産品の展開結果を抽出するためのインデックスキー
			MCIndexKey operPegKey = rsltL.createIndex(ReExp_Sprt01_RsltByProdR.$oper_peg_no);
			
			// ヘッダの工程指図ＮＯから副産品予定のテーブルを抽出するためのインデックスキー
			MCIndexKey operNoKey = up2().createIndex(ReExp_Sprt01_DtlByProdR.$oper_inst_no);
			
			// ヘッダ（製造・工程情報）を元にループ
			for (ReExp_Sprt01_HdrR hdrR : up0()) {
				
				// ヘッダの工程紐付けＮＯから副産品の展開結果を抽出
				MCList<ReExp_Sprt01_RsltByProdR> rsltOperL = rsltL.subList(operPegKey, hdrR.oper_peg_no());

				// ヘッダに工程指図ＮＯが設定されていない場合は新規追加された展開結果と判断し、新規行として下り電文に追加
				if (!rsltOperL.isEmpty() && isNull(hdrR.oper_inst_no())) {
					rsltOperL.setStatus(MCRow.Status.CREATE);
					down1().addAll(rsltOperL);
					continue;
				}
				
				// 工程指図ＮＯで副産品予定を取得
				MCList<ReExp_Sprt01_DtlByProdR> tblOperL = up2().subList(operNoKey, hdrR.oper_inst_no());

				// 副産品予定から工程ＣＤ、工程連番、品目ＣＤ、枝番１～３でマッチングするためのキー
				MCIndexKey matchKey = tblOperL.createIndex(
						ReExp_Sprt01_DtlByProdR.$oper_cd,
						ReExp_Sprt01_DtlByProdR.$oper_seq,
						ReExp_Sprt01_DtlByProdR.$itm_cd,
						ReExp_Sprt01_DtlByProdR.$itm_sub1,
						ReExp_Sprt01_DtlByProdR.$itm_sub2,
						ReExp_Sprt01_DtlByProdR.$itm_sub3);
				
				// 展開結果を元に副産品予定を比較
				for (ReExp_Sprt01_RsltByProdR rsltR : rsltOperL) {

					// 工程ＣＤ、工程連番、品目ＣＤ、枝番１～３でマッチング
					MCList<ReExp_Sprt01_DtlByProdR> tblL = tblOperL.subList(matchKey,
							rsltR.oper_cd(), rsltR.oper_seq(), rsltR.itm_cd(),
							rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3());
					MCIndexKey tblKey = tblL.createIndex(ReExp_Sprt01_DtlByProdR.$act_flg);
					
					// 該当する副産品予定のテーブルが存在しない場合、追加ステータスで下り電文に追加
					if (tblL.isEmpty()) {
						rsltR.setStatus(MCRow.Status.CREATE);
						down1().add(rsltR);
						continue;
					}

					// テーブルに対して展開結果マッチングフラグをオンにする
					tblL.setBoolean(ReExp_Sprt01_DtlByProdR.$match_flg, true);

					// 該当する副産品予定のテーブルの１件目を取得
					ReExp_Sprt01_DtlByProdR tblR = tblL.get(0);

					// テーブルから実績登録済のレコードを抽出し、工数実績の有無を判断する
					ReExp_Sprt01_DtlByProdR actR = tblL.getFirst(tblKey, true);

					if (!isNull(actR)) {
						// 副産品実績が発生している場合、展開結果を反映せず、元のテーブルの値を下り電文に追加
						tblL.setStatus(MCRow.Status.NONE);
						addAll(down1(), tblL, createMap_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR());

						// マスタ項目が不一致の場合は実績登録済で展開できなかった旨をインフォメーションとして戻す
						if (!compYieldCol(tblR, rsltR)) {
							MCMessagePool.add(new MCMessage(tblR, null, MSBCL1048,
									toDispItm(tblR.itm_cd(), tblR.itm_sub1(),
											tblR.itm_sub2(), tblR.itm_sub3()),
									toDispGUIIndex(tblR)));
						}
						continue;
					}

					// 副産品実績が発生していない場合、展開結果を下り電文に追加
					// 更新は１件目に対してのみ実施
					rsltR.setAttributes(tblR);
					rsltR.peg_no(tblR.peg_no());
					rsltR.setStatus(MCRow.Status.MODIFY);
					down1().add(rsltR);

					// ２件目以降は削除
					for (ReExp_Sprt01_DtlByProdR r : tblL) {
						if (tblL.indexOf(r) > 0) {
							r.setStatus(MCRow.Status.DELETE);
							ReExp_Sprt01_RsltByProdR delR = ReExp_Sprt01_RsltByProdR.create();
							copy(delR, r, createMap_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR());
							down1().add(delR);
						}
					}
				}
			}

			// 展開結果マッチングフラグがオフの副産品予定を抽出
			MCList<ReExp_Sprt01_DtlByProdR> unmatchedL = up2().subList(ReExp_Sprt01_DtlByProdR.$match_flg, false);

			if (!unmatchedL.isEmpty()) {
				// 実績あり／なしで仕分け
				MCList<ReExp_Sprt01_DtlByProdR> actL = unmatchedL.subList(ReExp_Sprt01_DtlByProdR.$act_flg, true);
				MCList<ReExp_Sprt01_DtlByProdR> instL = unmatchedL.subList(ReExp_Sprt01_DtlByProdR.$act_flg, false);

				if (!actL.isEmpty()) {
					// 実績ありの場合はメッセージを表示して、元のテーブルの値をそのまま追加
					for (ReExp_Sprt01_DtlByProdR r : actL) {
						MCMessagePool.add(new MCMessage(r, null,
								MSBCL1048, toDispItm(r.itm_cd(), r.itm_sub1(),
										r.itm_sub2(), r.itm_sub3()),
								toDispGUIIndex(r)));
					}
					MCList<ReExp_Sprt01_RsltByProdR> noneL = MCList.create(ReExp_Sprt01_RsltByProdR.class);
					addAll(noneL, actL, createMap_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR());
					noneL.setStatus(MCRow.Status.NONE);
					down1().addAll(noneL);
				}
				
				if (!instL.isEmpty()) {
					// 実績なしの場合は削除
					MCList<ReExp_Sprt01_RsltByProdR> delL = MCList.create(ReExp_Sprt01_RsltByProdR.class);
					addAll(delL, instL, createMap_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR());
					delL.setStatus(MCRow.Status.DELETE);
					down1().addAll(delL);
				}
			}
		}

		/**
		 * テーブルと展開結果のマスタ項目を比較し、すべて一致する場合はtrue、不一致がある場合はfalseを返す
		 * 
		 * @param tblR テーブル
		 * @param rsltR 展開結果
		 * @return
		 */
		protected boolean compYieldCol(ReExp_Sprt01_DtlByProdR tblR, ReExp_Sprt01_RsltByProdR rsltR) {
			if (!isSame(tblR.par_inst_qty(), rsltR.par_inst_qty())) {return false;}
			if (!isSame(tblR.chd_inpt_qty(), rsltR.chd_inpt_qty())) {return false;}
			if (!isSame(tblR.chd_rqmt_qty(), rsltR.chd_rqmt_qty())) {return false;}
			return true;
		}
		
		/**
		 * 出来高予定のテーブルから展開結果へのマッピング
		 * @return
		 */
		protected Map_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR<ReExp_Sprt01_RsltByProdR,ReExp_Sprt01_DtlByProdR> createMap_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR() {
			return new Map_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR<ReExp_Sprt01_RsltByProdR, ReExp_Sprt01_DtlByProdR>();
		}

		public class Map_ReExp_Sprt01_RsltByProdR_ReExp_Sprt01_DtlByProdR<D extends ReExp_Sprt01_RsltByProdR, S extends ReExp_Sprt01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt01_RsltByProdR.$peg_no, ReExp_Sprt01_DtlByProdR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.re_exp_flg(false);
			}
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {

			// 投入予定の引当制御区分
			setAllocCtlTyp();
			
			// ヘッダ紐付けＮＯ、工程紐付けＮＯ、表示順でソート　※工程紐付けＮＯは工順になっているため、工順＋表示順でソートされる
			// ※投入の場合は、代替グループ、代替グループ連番もソート列に追加する
			down0().sort(ReExp_Sprt01_RsltInptR.$hdr_peg_no,
					ReExp_Sprt01_RsltInptR.$oper_peg_no, ReExp_Sprt01_RsltInptR.$disp_seq,
					ReExp_Sprt01_RsltInptR.$alt_grp_cd,
					ReExp_Sprt01_RsltInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$itm_cd);
			down1().sort(ReExp_Sprt01_RsltByProdR.$hdr_peg_no,
					ReExp_Sprt01_RsltByProdR.$oper_peg_no,
					ReExp_Sprt01_RsltByProdR.$disp_seq, ReExp_Sprt01_RsltByProdR.$itm_cd);
		}
		
		/**
		 * 引当制御区分の設定
		 */
		protected void setAllocCtlTyp() {
			for ( ReExp_Sprt01_RsltInptR r : down0()) {
				// 非在庫品、自給品、指図書のみ品は引当対象外とする
				if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
						|| MAC_PROV_TYP.isSS(r.prov_typ())
						|| MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					r.alloc_ctl_typ(MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
				}
			}
		}
	}

	/**
	 * ReExp_Sprt02オペレーション.<p>
	 * 工数展開<p>
	 * 
	 * 製造品の情報を元に工数展開を行い、工数の情報を取得する。
	 * 製造指図登録画面の工数再展開ボタン押下時または再展開（Sprt04,05,06）から呼ばれる。
	 */
	public class ReExp_Sprt02 extends MSBCL_ReExpService_MC_A.ReExp_Sprt02 {

		// 工程工数マスタ、工数管理マスタをキャッシュしておくためのリスト
		protected MCList<MAM_OPER_WK_COST_R> _operWkCostL;
		
		// 工数展開結果を一時的に格納するためのリスト。このリストと工数予定のテーブルを比較し、結果を下り電文に格納する
		protected MCList<ReExp_Sprt02_RsltWkR> _rsltL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			if (up0().isEmpty()) {
				return;
			}
			
			// 工程工数マスタの検索
			srchOperWkCost();

			// 工数展開
			expWk();
			
			// 工数実績の存在チェック
			srchWkAct();

			// 登録済の工数予定との比較
			compRegedWk();
			
			// 下り電文の設定
			setDown();
		}

		/**
		 * 工程工数マスタを取得する
		 */
		protected void srchOperWkCost() {

			// 上り電文を品目ＣＤ、枝番１～３、製造場所ＣＤ、工程パタンでグループ化
			String[] gbStr = new String[] {
					ReExp_Sprt02_HdrR.$itm_cd, ReExp_Sprt02_HdrR.$itm_sub1,
					ReExp_Sprt02_HdrR.$itm_sub2, ReExp_Sprt02_HdrR.$itm_sub3,
					ReExp_Sprt02_HdrR.$mfg_loc_cd, ReExp_Sprt02_HdrR.$oper_ptn
			};
			MCList<ReExp_Sprt02_HdrR> gbL = up0().groupBy(gbStr);

			// グループ化した項目を条件として工程工数マスタ、工数管理マスタを取得
			MAM_WK_COST_R m1 = MAM_WK_COST_R.create("M1");
			MAM_OPER_R m2 = MAM_OPER_R.create("M2");
			_operWkCostL = MCList.create(MAM_OPER_WK_COST_R.class);
			MAM_OPER_WK_COST_R t = MAM_OPER_WK_COST_R.create("T");
			MCQueryApiBuilder operWkCostL_bldr = MCQueryApiBuilder.create(t);
			operWkCostL_bldr.addSelect(m1.wk_cost_nm);
			operWkCostL_bldr.addSelect(m1.wk_cost_unit_nm);
			operWkCostL_bldr.addSelect(m1.dec_place);
			operWkCostL_bldr.addSelect(m1.rnd_typ);
			operWkCostL_bldr.addSelect(m2.oper_nm);
			operWkCostL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			operWkCostL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			operWkCostL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			operWkCostL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			operWkCostL_bldr.addWhereWithAnd(t.loc_cd.eq(bind("mfg_loc_cd"))
					.or(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))));
			operWkCostL_bldr.addWhereWithAnd(t.oper_ptn.eq(bind("oper_ptn")));
			operWkCostL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			operWkCostL_bldr.addLeftOuterJoin(m1, m1.wk_cost_cd.eq(t.wk_cost_cd));
			operWkCostL_bldr.addLeftOuterJoin(m2, m2.oper_cd.eq(t.oper_cd));
			operWkCostL_bldr.setOrderByAsc(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.loc_cd, t.oper_ptn, t.oper_cd, t.oper_seq, t.wk_cost_cd);
			dbSelect("MSBCL6020_MAM_OPER_WK_COST_S01", _operWkCostL, operWkCostL_bldr, gbL);
		}

		
		/**
		 * 工数を展開して工数予定を作成する
		 */
		protected void expWk() {
			
			_rsltL = MCList.create(ReExp_Sprt02_RsltWkR.class);

			for (ReExp_Sprt02_HdrR r : up0()) {
				
				// キャッシュからマスタを取得
				MCIndexKey idxKey = _operWkCostL.createIndex(MAM_OPER_WK_COST_R.$itm_cd,
						MAM_OPER_WK_COST_R.$itm_sub1, MAM_OPER_WK_COST_R.$itm_sub2,
						MAM_OPER_WK_COST_R.$itm_sub3, MAM_OPER_WK_COST_R.$loc_cd,
						MAM_OPER_WK_COST_R.$oper_ptn, MAM_OPER_WK_COST_R.$oper_cd,
						MAM_OPER_WK_COST_R.$oper_seq);
				MCList<MAM_OPER_WK_COST_R> operWkCostL = removeOutOfRange(
						_operWkCostL.subList(idxKey, r.itm_cd(), r.itm_sub1(),
								r.itm_sub2(), r.itm_sub3(), r.mfg_loc_cd(), r.oper_ptn(),
								r.oper_cd(), r.oper_seq()),
						r.mfg_st_schd_dt());
				
				if (operWkCostL.isEmpty()) {
					// 製造場所をNULL文字にして再取得
					operWkCostL = removeOutOfRange(
							_operWkCostL.subList(idxKey, r.itm_cd(), r.itm_sub1(),
									r.itm_sub2(), r.itm_sub3(), MAC_STR.NULL_VAL.value(), r.oper_ptn(),
									r.oper_cd(), r.oper_seq()),
							r.mfg_st_schd_dt());
				}
				if (operWkCostL.isEmpty()) {
					continue;
				}
				
				// マスタから工数予定へマッピング
				MCList<ReExp_Sprt02_RsltWkR> wkInstL = MCList.create(ReExp_Sprt02_RsltWkR.class);
				addAll(wkInstL, operWkCostL, createMap_ReExp_Sprt02_RsltWkR_MAM_OPER_WK_COST_R());
				
				// 工数を計算
				calcWkCostQty(wkInstL, r);
				
				// 上り電文からセット
				wkInstL.setNumber(ReExp_Sprt02_RsltWkR.$hdr_peg_no, r.hdr_peg_no()); //製造紐付けＮＯ
				wkInstL.setNumber(ReExp_Sprt02_RsltWkR.$oper_peg_no, r.oper_peg_no()); //工程紐付けＮＯ
				wkInstL.setString(ReExp_Sprt02_RsltWkR.$mfg_inst_no, r.mfg_inst_no()); //製造指図ＮＯ
				wkInstL.setString(ReExp_Sprt02_RsltWkR.$oper_inst_no, r.oper_inst_no()); //工程指図ＮＯ
				wkInstL.setString(ReExp_Sprt02_RsltWkR.$oper_cd, r.oper_cd()); //工程ＣＤ
				wkInstL.setNumber(ReExp_Sprt02_RsltWkR.$oper_seq, r.oper_seq()); //工程連番

				// 構成展開結果のリストへ設定
				_rsltL.addAll(wkInstL);
			}
			// 展開結果の再展開実施フラグをオンにする
			_rsltL.setBoolean(ReExp_Sprt02_RsltWkR.$re_exp_flg, true);
		}
		
		protected MCList<MAM_OPER_WK_COST_R> removeOutOfRange(
				MCList<MAM_OPER_WK_COST_R> tmpL, MCDate stSchdDt) {
			MCList<MAM_OPER_WK_COST_R> ret = MCList
					.create(MAM_OPER_WK_COST_R.class);
			for (MAM_OPER_WK_COST_R tmpR : tmpL) {
				if (tmpR.st_dt().lte(stSchdDt) && tmpR.end_dt().gte(stSchdDt)) {
					ret.add(tmpR);
				}
			}
			return ret;
		}
		
		/**
		 * 工程工数マスタと工程の数量から工数を算出する
		 * @param wkL 工数予定
		 * @param operR 工程指図
		 */
		protected void calcWkCostQty(MCList<ReExp_Sprt02_RsltWkR> wkL, ReExp_Sprt02_HdrR operR) {
			for (ReExp_Sprt02_RsltWkR wkR : wkL) {
				if (!isNull(wkR.dec_place())) {
					// 予定工数（数量依存）＝（数量×マスタ工数（数量依存）÷基準数）
					wkR.wk_cost(operR.oper_inst_qty().multiply(wkR.mst_wk_cost()).divide(
							wkR.base_qty(), wkR.dec_place().intValue(),
							MAC_RND_TYP.toMC(wkR.rnd_typ())));
					// 予定工数合計＝予定工数（数量依存）＋工数（固定）
					wkR.sum_wk_cost(wkR.wk_cost().add(wkR.fxd_wk_cost()));
				}
			}
		}

		/**
		 * 工数実績が存在するかどうか確認する
		 */
		protected void srchWkAct() {

			// 工数実績をキャッシュ
			FXUCL_Cache<MST_WK_ACT_R> cache = new FXUCL_Cache<MST_WK_ACT_R>();
			cache.setFixMaxCacheSize(-1);

			MCList<MST_WK_ACT_R> dbL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.wk_schd_no, t.wk_act_no);
			dbL_bldr.setWhere(t.wk_schd_no.eq(bind("wk_schd_no")));
			dbSelect("MSBCL6020_MST_WK_ACT_S01", dbL, dbL_bldr, up1());

			for (MST_WK_ACT_R r : dbL) {
				cache.putCache(new String[] {
						r.getStringNE(MST_WK_ACT_R.$wk_schd_no)
				}, r);
			}

			// 上り電文（工数予定の検索結果）の実績ありフラグを設定
			for (ReExp_Sprt02_DtlWkR r : up1()) {
				MST_WK_ACT_R actR = cache.getCache(r.wk_schd_no());
				r.act_flg(!isNull(actR));
			}
		}
		
		/**
		 * 登録済の工数予定と比較し、下り電文を編集する
		 */
		protected void compRegedWk() {

			MCList<ReExp_Sprt02_RsltWkR> rsltL = MCList.create(ReExp_Sprt02_RsltWkR.class); //製造指図済（製造指図ＮＯあり）
			MCList<ReExp_Sprt02_RsltWkR> notInstRsltL = MCList.create(ReExp_Sprt02_RsltWkR.class); //製造指図前（製造指図ＮＯなし）

			// 展開結果を製造指図ＮＯが設定されている行、されていない行に分別
			for (ReExp_Sprt02_RsltWkR r : _rsltL) {
				if (isNull(r.oper_inst_no())) {
					// 製造指図前
					notInstRsltL.add(r);
				}
				else {
					// 製造指図済
					rsltL.add(r);
				}
			}
			
			// 製造指図前の行については、下り電文のすべての行のROWステータスに「新規作成」を設定し、下り電文に追加
			if (!notInstRsltL.isEmpty()) {
				notInstRsltL.setStatus(MCRow.Status.CREATE);
				down0().addAll(notInstRsltL);
			}
			
			// ヘッダの工程紐付けＮＯから工数の展開結果を抽出するためのインデックスキー
			MCIndexKey operPegKey = rsltL.createIndex(ReExp_Sprt02_RsltWkR.$oper_peg_no);
			
			// ヘッダの工程指図ＮＯから工数予定のテーブルを抽出するためのインデックスキー
			MCIndexKey operNoKey = up1().createIndex(ReExp_Sprt02_DtlWkR.$oper_inst_no);
			
			// ヘッダ（製造・工程情報）を元にループ
			for (ReExp_Sprt02_HdrR hdrR : up0()) {
				
				// ヘッダの工程紐付けＮＯから工数の展開結果を抽出
				MCList<ReExp_Sprt02_RsltWkR> rsltOperL = rsltL.subList(operPegKey, hdrR.oper_peg_no());

				// ヘッダに工程指図ＮＯが設定されていない場合は新規追加された展開結果と判断し、新規行として下り電文に追加
				if (!rsltOperL.isEmpty() && isNull(hdrR.oper_inst_no())) {
					rsltOperL.setStatus(MCRow.Status.CREATE);
					down0().addAll(rsltOperL);
					continue;
				}

				// 工程指図ＮＯで工数予定を取得
				MCList<ReExp_Sprt02_DtlWkR> tblOperL = up1().subList(operNoKey, hdrR.oper_inst_no());
				
				// 工数予定から工程ＣＤ、工程連番、工数管理ＣＤでマッチングするためのキー
				MCIndexKey matchKey = tblOperL.createIndex(ReExp_Sprt02_DtlWkR.$oper_cd,
						ReExp_Sprt02_DtlWkR.$oper_seq, ReExp_Sprt02_DtlWkR.$wk_cost_cd);

				// 展開結果を元に工数予定を比較
				for (ReExp_Sprt02_RsltWkR rsltR : rsltOperL) {
	
					// 工程ＣＤ、工程連番、工数管理ＣＤでマッチング
					MCList<ReExp_Sprt02_DtlWkR> tblL = tblOperL.subList(matchKey,
							rsltR.oper_cd(), rsltR.oper_seq(), rsltR.wk_cost_cd());
					MCIndexKey tblKey = tblL.createIndex(ReExp_Sprt02_DtlWkR.$act_flg);
					
					// 該当する工数予定のテーブルが存在しない場合、追加ステータスで下り電文に追加
					if (tblL.isEmpty()) {
						rsltR.setStatus(MCRow.Status.CREATE);
						down0().add(rsltR);
						continue;
					}

					// テーブルに対して展開結果マッチングフラグをオンにする
					tblL.setBoolean(ReExp_Sprt02_DtlWkR.$match_flg, true);

					// 該当する工数予定のテーブルの１件目を取得
					ReExp_Sprt02_DtlWkR tblR = tblL.get(0);

					// テーブルから実績登録済のレコードを抽出し、工数実績の有無を判断する
					ReExp_Sprt02_DtlWkR actR = tblL.getFirst(tblKey, true);

					if (!isNull(actR)) {
						// 工数実績が発生している場合、展開結果を反映せず、元のテーブルの値を下り電文に追加
						tblL.setStatus(MCRow.Status.NONE);
						addAll(down0(), tblL, createMap_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR());

						// マスタ項目が不一致の場合、実績登録済で展開できなかった旨をインフォメーションとして戻す
						if (!compWkCol(tblR, rsltR)) {
							MCMessagePool.add(new MCMessage(tblR, null, MSBCL1049,
									tblR.wk_cost_cd(), toDispGUIIndex(tblR)));
						}
						continue;
					}

					// 工数実績が発生していない場合、展開結果を下り電文に設定
					// 更新は１件目に対してのみ実施
					rsltR.setAttributes(tblR);
					rsltR.peg_no(tblR.peg_no());
					rsltR.setStatus(MCRow.Status.MODIFY);
					down0().add(rsltR);

					// ２件目以降は削除
					for (ReExp_Sprt02_DtlWkR r : tblL) {
						if (tblL.indexOf(r) > 0) {
							r.setStatus(MCRow.Status.DELETE);
							ReExp_Sprt02_RsltWkR delR = ReExp_Sprt02_RsltWkR.create();
							copy(delR, r, createMap_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR());
							down0().add(delR);
						}
					}
				}
			}

			// 展開結果マッチングフラグがオフの工数予定を抽出
			MCList<ReExp_Sprt02_DtlWkR> unmatchedL = up1().subList(ReExp_Sprt02_DtlWkR.$match_flg, false);

			if (!unmatchedL.isEmpty()) {
				// 実績あり／なしで仕分け
				MCList<ReExp_Sprt02_DtlWkR> actL = unmatchedL.subList(ReExp_Sprt02_DtlWkR.$act_flg, true);
				MCList<ReExp_Sprt02_DtlWkR> instL = unmatchedL.subList(ReExp_Sprt02_DtlWkR.$act_flg, false);

				if (!actL.isEmpty()) {
					// 実績ありの場合はメッセージを表示して、元のテーブルの値をそのまま追加
					for (ReExp_Sprt02_DtlWkR r : actL) {
						MCMessagePool.add(new MCMessage(r, null, MSBCL1049, r.wk_cost_cd(),
								toDispGUIIndex(r)));
					}
					MCList<ReExp_Sprt02_RsltWkR> noneL = MCList.create(ReExp_Sprt02_RsltWkR.class);
					addAll(noneL, actL, createMap_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR());
					noneL.setStatus(MCRow.Status.NONE);
					down0().addAll(noneL);
				}
				
				if (!instL.isEmpty()) {
					// 実績なしの場合は削除
					MCList<ReExp_Sprt02_RsltWkR> delL = MCList.create(ReExp_Sprt02_RsltWkR.class);
					addAll(delL, instL, createMap_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR());
					delL.setStatus(MCRow.Status.DELETE);
					down0().addAll(delL);
				}
			}
		}

		/**
		 * テーブルと展開結果のマスタ項目を比較し、すべて一致する場合はtrue、不一致がある場合はfalseを返す
		 * 
		 * @param tblR テーブル
		 * @param rsltR 展開結果
		 * @return
		 */
		protected boolean compWkCol(ReExp_Sprt02_DtlWkR tblR, ReExp_Sprt02_RsltWkR rsltR) {
			if (!isSame(tblR.mst_wk_cost(), rsltR.mst_wk_cost())) {return false;}
			if (!isSame(tblR.mst_fxd_wk_cost(), rsltR.mst_fxd_wk_cost())) {return false;}
			return true;
		}
		
		/**
		 * 上り電文（工数予定の検索結果）から下り電文（工数展開結果）へのマッピング
		 * @return
		 */
		protected Map_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR<ReExp_Sprt02_RsltWkR,ReExp_Sprt02_DtlWkR> createMap_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR() {
			return new Map_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR<ReExp_Sprt02_RsltWkR, ReExp_Sprt02_DtlWkR>();
		}

		public class Map_ReExp_Sprt02_RsltWkR_ReExp_Sprt02_DtlWkR<D extends ReExp_Sprt02_RsltWkR, S extends ReExp_Sprt02_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// 工数予定の検索結果を下り電文に使用する場合、再展開フラグをオフにする。
				// 再展開フラグがオフの場合、呼出元（製造指図登録）は自分で保持している工数予定ＮＯ検索結果をそのまま使用するため、紐付けＮＯ以外の値を設定する必要はない。
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$peg_no, ReExp_Sprt02_DtlWkR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.re_exp_flg(false);
			}
		}

		/**
		 * 工程工数マスタから工数予定の下り電文へのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt02_RsltWkR_MAM_OPER_WK_COST_R<ReExp_Sprt02_RsltWkR,MAM_OPER_WK_COST_R> createMap_ReExp_Sprt02_RsltWkR_MAM_OPER_WK_COST_R() {
			return new Map_ReExp_Sprt02_RsltWkR_MAM_OPER_WK_COST_R<ReExp_Sprt02_RsltWkR, MAM_OPER_WK_COST_R>();
		}

		public class Map_ReExp_Sprt02_RsltWkR_MAM_OPER_WK_COST_R<D extends ReExp_Sprt02_RsltWkR, S extends MAM_OPER_WK_COST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$wk_cost_cd, MAM_OPER_WK_COST_R.$wk_cost_cd);
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg, MAM_OPER_WK_COST_R.$wk_cost_calc_flg);
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$fxd_wk_cost, MAM_OPER_WK_COST_R.$fxd_wk_cost);
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$mst_fxd_wk_cost, MAM_OPER_WK_COST_R.$fxd_wk_cost);
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$mst_wk_cost, MAM_OPER_WK_COST_R.$wk_cost);
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$base_qty, MAM_OPER_WK_COST_R.$base_qty);
				addColumnPathMap(ReExp_Sprt02_RsltWkR.$disp_seq, MAM_OPER_WK_COST_R.$disp_seq);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.wk_cost_nm(src.getStringNE("WK_COST_NM"));
				dest.wk_cost_unit_nm(src.getStringNE("WK_COST_UNIT_NM"));
				dest.dec_place(src.getNumberNE("DEC_PLACE"));
				dest.rnd_typ(src.getStringNE("RND_TYP"));
				dest.oper_nm(src.getStringNE("OPER_NM"));
			}
		}
		
		protected void setDown() {
			
			// ヘッダ紐付けＮＯ、工程紐付けＮＯ、表示順でソート　※工程紐付けＮＯは工順になっているため、工順＋表示順でソートされる
			down0().sort(ReExp_Sprt02_RsltWkR.$hdr_peg_no,
					ReExp_Sprt02_RsltWkR.$oper_peg_no, ReExp_Sprt02_RsltWkR.$disp_seq,
					ReExp_Sprt02_RsltWkR.$wk_cost_cd);
		}
	}

	/**
	 * ReExp_Sprt03オペレーション.<p>
	 * 出来高予定作成<p>
	 * 
	 * 製造品、出来高計上工程の情報を元に出来高予定の情報を取得する。
	 * 再展開（Sprt04,05,06）から呼ばれる。
	 */
	public class ReExp_Sprt03 extends MSBCL_ReExpService_MC_A.ReExp_Sprt03 {
		
		protected MCList<MAM_ITM_R> _itmL;
		protected MCIndexKey _itmKey;
		protected MCList<MAM_LOC_R> _locL;
		protected MCIndexKey _locKey;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 上り電文の工程指図から出来高工程ＦＬＧがオンの工程を抽出
			MCList<ReExp_Sprt03_DtlOperR> operL = up1().subList(ReExp_Sprt03_DtlOperR.$yield_oper_flg, true);
			
			if (operL.isEmpty()) {
				// 対象が存在しない場合、検索結果をそのまま下り電文に設定して終了
				setDownNoTgt();
				return;
			}
			
			// 上り電文の製造指図・品目製造指図の品目情報（名称、基準数量など）を取得
			getItmL();
			
			// 上り電文の製造指図・品目製造指図の製造場所情報（名称、棚・ライン対象ＦＬＧ）を取得
			getLocL();
			
			// 数量を出来高工程に案分
			divideQty(operL);
			
			// 下り電文の設定
			setDown(operL);
		}

		/**
		 * 上り電文の製造指図・品目製造指図の品目情報（名称、基準数量など）を取得する
		 */
		protected void getItmL() {

			// 品目、枝番１～３で上り電文の製造指図・品目製造指図をグループ化
			MCList<ReExp_Sprt03_HdrR> gbL = up0().groupBy(ReExp_Sprt03_HdrR.$itm_cd,
					ReExp_Sprt03_HdrR.$itm_sub1, ReExp_Sprt03_HdrR.$itm_sub2,
					ReExp_Sprt03_HdrR.$itm_sub3);

			// 品目マスタ等の検索
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAM_UNIT_R m2 = MAM_UNIT_R.create("M2");
			MAVM_ITM_UNIT_R m3 = MAVM_ITM_UNIT_R.create("M3");
			_itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.itm_nm,
					t.dec_place,
					t.rnd_typ,
					t.unit_cd,
					t.mfg_unit_cd);
			
			itmL_bldr.addSelect(m1.unit_nm.as("base_unit_nm"));
			itmL_bldr.addSelect(m2.unit_nm.as("trd_unit_nm"));
			itmL_bldr.addSelect(m3.dec_place.as("trd_dec_place"));
			itmL_bldr.addSelect(m3.rnd_typ.as("trd_rnd_typ"));
			itmL_bldr.addSelect(m3.conv_base_qty);
			itmL_bldr.addSelect(m3.conv_qty);
			
			itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmL_bldr.addLeftOuterJoin(m1, m1.unit_cd.eq(t.unit_cd));
			itmL_bldr.addLeftOuterJoin(m2, m2.unit_cd.eq(t.mfg_unit_cd));
			itmL_bldr.addLeftOuterJoin(m3, m3.itm_cd.eq(t.itm_cd)
					.and(m3.itm_sub1.eq(t.itm_sub1))
					.and(m3.itm_sub2.eq(t.itm_sub2))
					.and(m3.itm_sub3.eq(t.itm_sub3))
					.and(m3.unit_cd.eq(t.mfg_unit_cd)));
			setDelFlgCtl(false);
			dbSelect("MSBCL6020_MAM_ITM_S01", _itmL, itmL_bldr, gbL);
			setDelFlgCtl(true);
			_itmKey = _itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
					MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		/**
		 * 論理削除フラグ制御のオン・オフを設定します。<p>
		 * @param flg 論理削除フラグ制御のオン・オフ<p>
		 */
		protected void setDelFlgCtl(boolean flg) {
			MCRow r = MCRow.create();
			sql(createSqlId("MSBCL6020", "MAPA_CONTEXT$F_GET_DEL_FLG_CTL", "MSBCL_ReExpService_setDelFlgCtl"))
			.mainQuery().select(
					MABCFunction.MAPA_CONTEXT$F_GET_DEL_FLG_CTL().as("del_flg_ctl")
					).executeQuery(r);
			r.setString("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
			String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
			execProc(createSqlId("MSBCL6020", procid, "MSBCL_ReExpService_setDelFlgCtl")
					, procid, r, ":del_flg_ctl");
		}
		
		/**
		 * 上り電文の製造指図・品目製造指図の格納場所情報（名称、棚・ライン対象ＦＬＧ）を取得
		 */

		protected void getLocL() {

			// 格納場所で上り電文の製造指図・品目製造指図をグループ化
			MCList<ReExp_Sprt03_HdrR> gbL = up0().groupBy(ReExp_Sprt03_HdrR.$strg_loc_cd);

			// 場所マスタの検索
			_locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.loc_nm, t.str_ln_tgt_flg);
			locL_bldr.setWhere(t.loc_cd.eq(bind("strg_loc_cd")));
			dbSelect("MSBCL6020_MAM_LOC_S02", _locL, locL_bldr, gbL);
			_locKey = _locL.createIndex(MAM_LOC_R.$loc_cd);
		}
		
		/**
		 * 数量を出来高工程に案分する
		 * @param operL
		 */
		protected void divideQty(MCList<ReExp_Sprt03_DtlOperR> operL) {

			MCList<ReExp_Sprt03_DtlOperR> tgtOperL = MCList.create(ReExp_Sprt03_DtlOperR.class);

			// operLから削除行を除外する
			for (ReExp_Sprt03_DtlOperR r : operL) {
				if (!isSame(MCRow.Status.DELETE, r.getStatus())) {
					tgtOperL.add(r);
				}
			}
			
			// 上り電文の製造指図・品目製造指図の単位で、紐付く工程指図の案分処理を行う
			MCIndexKey idxKey = tgtOperL.createIndex(ReExp_Sprt03_DtlOperR.$hdr_peg_no);
			for (ReExp_Sprt03_HdrR mfgR : up0()) {
				
				// 品目情報（有効桁数など）をキャッシュから取得
				MAM_ITM_R itmR = _itmL.getFirst(_itmKey, mfgR.itm_cd(), mfgR.itm_sub1(), mfgR.itm_sub2(), mfgR.itm_sub3());

				// 工程指図を紐付けＮＯで抽出
				MCList<ReExp_Sprt03_DtlOperR> operSubL = tgtOperL.subList(idxKey, mfgR.peg_no());
				
				if (operSubL.isEmpty()) {
					continue;
				}
				//案分処理１：出来高工程比率に応じた案分
				//工程ＣＤ、工程連番でGroupBy
				MCList<ReExp_Sprt03_DtlOperR> gbL = operSubL.groupBy(
						ReExp_Sprt03_DtlOperR.$oper_cd, ReExp_Sprt03_DtlOperR.$oper_seq,
						ReExp_Sprt03_DtlOperR.$yield_oper_ratio);

				//指図数案分
				FXUCC_Divide.prop(gbL, mfgR.yield_schd_qty(),
						itmR.dec_place().intValue(),
						ReExp_Sprt03_DtlOperR.$yield_oper_ratio,
						ReExp_Sprt03_DtlOperR.$yield_schd_qty);

				MCIndexKey idxSubKey = operSubL.createIndex(ReExp_Sprt03_DtlOperR.$oper_cd, ReExp_Sprt03_DtlOperR.$oper_seq);
				for(ReExp_Sprt03_DtlOperR gbR : gbL){
					
					// 紐付けＮＯで抽出した工程指図を、工程ＣＤ、工程連番でさらに抽出
					MCList<ReExp_Sprt03_DtlOperR> subL = operSubL.subList(idxSubKey,
							gbR.oper_cd(), gbR.oper_seq());

					MCNumber yieldSchdQty = null;
					if (!isNull(mfgR.mfg_inst_qty())) {
						MCNumber operQtySum = subL.sum(ReExp_Sprt03_DtlOperR.$oper_inst_qty);
						yieldSchdQty = gbR.yield_schd_qty().multiply(operQtySum).divide(
								mfgR.mfg_inst_qty(), itmR.dec_place().intValue(),
								MAC_RND_TYP.RNDUP.toMC());
					}
					else {
						yieldSchdQty = gbR.yield_schd_qty();
					}
					if(subL.size() == 1){
						ReExp_Sprt03_DtlOperR subR = subL.get(0);
						subR.yield_schd_qty(yieldSchdQty);
					}
					else if(subL.size() > 1){

						//案分処理２：工程指図数に応じた案分
						//指図数案分
						FXUCC_Divide.prop(subL, yieldSchdQty,
								itmR.dec_place().intValue(),
								ReExp_Sprt03_DtlOperR.$oper_inst_qty,
								ReExp_Sprt03_DtlOperR.$yield_schd_qty);
					}
				}
			}
		}

		/**
		 * 出来高予定作成対象の工程が存在しない場合の下り電文を検索結果から設定する
		 */
		protected void setDownNoTgt() {
			addAll(down0(), up2(), createMap_ReExp_Sprt03_RsltYieldR_ReExp_Sprt03_DtlYieldR());
			down0().setStatus(MCRow.Status.NONE);
		}
		
		/**
		 * 下り電文（出来高予定）を設定する
		 * @param operL
		 */
		protected void setDown(MCList<ReExp_Sprt03_DtlOperR> operL) {
			
			// 上り電文の出来高予定（検索結果）が設定されている場合、ROWステータスに「削除」を設定し、下り電文に設定
			if (!up2().isEmpty()) {
				MCList<ReExp_Sprt03_RsltYieldR> tblL = MCList.create(ReExp_Sprt03_RsltYieldR.class);
				addAll(tblL, up2(), createMap_ReExp_Sprt03_RsltYieldR_ReExp_Sprt03_DtlYieldR());
				tblL.setStatus(MCRow.Status.DELETE);
				down0().addAll(tblL);
			}
			
			// 上り電文の製造指図・品目製造指図の単位で、紐付く工程指図から出来高予定を作成する
			// operLから削除行を除外する
			MCList<ReExp_Sprt03_DtlOperR> dltList = operL.subList(MCRow.Status.DELETE);
			operL.removeAll(dltList);
			
			MCIndexKey idxKey = operL.createIndex(ReExp_Sprt03_DtlOperR.$hdr_peg_no);
			MCList<ReExp_Sprt03_HdrR> errMfgL = MCList.create(ReExp_Sprt03_HdrR.class);
			for (ReExp_Sprt03_HdrR mfgR : up0()) {
				
				// 品目情報（有効桁数など）をキャッシュから取得
				MAM_ITM_R itmR = _itmL.getFirst(_itmKey, mfgR.itm_cd(), mfgR.itm_sub1(), mfgR.itm_sub2(), mfgR.itm_sub3());

				// 格納場所情報をキャッシュから取得
				MAM_LOC_R locR = _locL.getFirst(_locKey, mfgR.strg_loc_cd());

				// キャッシュから格納場所ＣＤに該当する場所が取得できなかった場合にエラー
				if (isNull(locR)) {
					errMfgL.add(mfgR);
					continue;
				}
				// 工程指図を紐付けＮＯで抽出
				MCList<ReExp_Sprt03_DtlOperR> operSubL = operL.subList(idxKey, mfgR.peg_no());
				
				// 工程紐付けＮＯでソート
				operSubL.sort(SortType.ASC, ReExp_Sprt03_DtlOperR.$peg_no);
				
				int dispSeq = 1;
				for (ReExp_Sprt03_DtlOperR operSubR : operSubL) {
					
					// 出来高予定の作成
					ReExp_Sprt03_RsltYieldR yieldR = ReExp_Sprt03_RsltYieldR.create();
					
					// 入力となるRowが複数ありマッパーが使用できないため、工程指図の属性を出来高予定に設定
					yieldR.setAttributes(operSubR);
					
					yieldR.hdr_peg_no(operSubR.hdr_peg_no());
					yieldR.oper_peg_no(operSubR.peg_no());
					yieldR.base_unit_cd(itmR.unit_cd());
					yieldR.base_unit_nm(itmR.getStringNE("BASE_UNIT_NM"));
					yieldR.base_dec_place(itmR.dec_place());
					yieldR.base_unit_qty(operSubR.yield_schd_qty()); //基準単位数量には案分結果を設定
					yieldR.base_unit_conv_rnd_typ(itmR.rnd_typ());
					yieldR.conv_base_qty(itmR.getNumberNE("CONV_BASE_QTY"));
					yieldR.conv_qty(itmR.getNumberNE("CONV_QTY"));
					yieldR.strg_loc_cd(mfgR.strg_loc_cd());
					yieldR.strg_loc_nm(locR.loc_nm());
					yieldR.strg_str_ln_tgt_flg(locR.str_ln_tgt_flg());
					yieldR.strg_str_ln_cd(mfgR.strg_str_ln_cd());
					yieldR.strg_str_ln_nm(mfgR.strg_str_ln_nm());
					yieldR.strg_str_ln_cd_none_flg(mfgR.strg_str_ln_cd_none_flg());
					yieldR.yield_schd_dt(operSubR.end_schd_dt()); //出来高予定日には製造終了予定日
					yieldR.itm_cd(mfgR.itm_cd());
					yieldR.itm_sub1(mfgR.itm_sub1());
					yieldR.itm_sub2(mfgR.itm_sub2());
					yieldR.itm_sub3(mfgR.itm_sub3());
					yieldR.itm_nm(itmR.itm_nm());
					yieldR.disp_seq(dispSeq); //表示順に連番を設定（工程紐付けＮＯ順）

					// 品目マスタに製造単位ＣＤが設定され、品目単位マスタが存在する場合は製造単位を取引単位とする
					if (!isNull(itmR.mfg_unit_cd()) && !isNull(itmR.getNumberNE("CONV_BASE_QTY"))) {

						yieldR.trd_unit_cd(itmR.mfg_unit_cd());
						yieldR.trd_unit_nm(itmR.getStringNE("TRD_UNIT_NM"));
						yieldR.trd_dec_place(itmR.getNumberNE("TRD_DEC_PLACE"));

						// 基準単位を取引単位に変換
						MCNumber trdQty = rvrsBaseUnitConv(yieldR.base_unit_qty(),
								itmR.getNumberNE("CONV_BASE_QTY"),
								itmR.getNumberNE("CONV_QTY"),
								itmR.getNumberNE("TRD_DEC_PLACE"),
								itmR.getStringNE("TRD_RND_TYP"));

						// 取引単位から基準単位へ再変換
						MCNumber baseQty = convToBaseUnit(trdQty,
								itmR.getNumberNE("CONV_BASE_QTY"),
								itmR.getNumberNE("CONV_QTY"), itmR.dec_place(),
								itmR.rnd_typ());
						
						// 再変換した基準単位数が元の基準単位数と一致する場合は端数が発生しなかったとみなし、変換ＯＫとする
						if (isSame(yieldR.base_unit_qty(), baseQty)) {
							yieldR.trd_unit_qty(trdQty);
						}
						else {
							// 不一致の場合は端数が発生したとみなし、取引単位＝基準単位とする
							yieldR.trd_unit_cd(yieldR.base_unit_cd());
							yieldR.trd_unit_nm(yieldR.base_unit_nm());
							yieldR.trd_dec_place(yieldR.base_dec_place());
							yieldR.trd_unit_qty(yieldR.base_unit_qty());
						}
						
					}
					else {
						// 上記以外は取引単位＝基準単位とする
						yieldR.trd_unit_cd(yieldR.base_unit_cd());
						yieldR.trd_unit_nm(yieldR.base_unit_nm());
						yieldR.trd_dec_place(yieldR.base_dec_place());
						yieldR.trd_unit_qty(yieldR.base_unit_qty());
					}

					// 表示順を設定
					dispSeq++;
					
					// ROWステータスは「新規作成」
					yieldR.setStatus(MCRow.Status.CREATE);
					
					down0().add(yieldR);
				}
				
			}

			if (!errMfgL.isEmpty()) {
				MCList<ReExp_Sprt03_HdrR> errMfgList = errMfgL
						.groupByNE(ReExp_Sprt03_HdrR.$strg_loc_cd);
				MCMessageList msgL = new MCMessageList();

				for (ReExp_Sprt03_HdrR r : errMfgList) {
					msgL.add(new MCMessage(r, null, MAUAL0057, r.strg_loc_cd()));
				}
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}

			// ヘッダ紐付けＮＯ、工程紐付けＮＯ、表示順でソート　※工程紐付けＮＯは工順になっているため、工順＋表示順でソートされる
			down0().sort(ReExp_Sprt03_RsltYieldR.$hdr_peg_no,
					ReExp_Sprt03_RsltYieldR.$oper_peg_no,
					ReExp_Sprt03_RsltYieldR.$disp_seq);
		}

		/**
		 * 上り電文の出来高予定（展開結果）から下り電文へのへのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt03_RsltYieldR_ReExp_Sprt03_DtlYieldR<ReExp_Sprt03_RsltYieldR,ReExp_Sprt03_DtlYieldR> createMap_ReExp_Sprt03_RsltYieldR_ReExp_Sprt03_DtlYieldR() {
			return new Map_ReExp_Sprt03_RsltYieldR_ReExp_Sprt03_DtlYieldR<ReExp_Sprt03_RsltYieldR, ReExp_Sprt03_DtlYieldR>();
		}

		public class Map_ReExp_Sprt03_RsltYieldR_ReExp_Sprt03_DtlYieldR<D extends ReExp_Sprt03_RsltYieldR, S extends ReExp_Sprt03_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$hdr_peg_no, ReExp_Sprt03_DtlYieldR.$hdr_peg_no);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$oper_peg_no, ReExp_Sprt03_DtlYieldR.$oper_peg_no);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$peg_no, ReExp_Sprt03_DtlYieldR.$peg_no);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$yield_schd_no, ReExp_Sprt03_DtlYieldR.$yield_schd_no);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$mfg_inst_no, ReExp_Sprt03_DtlYieldR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$oper_inst_no, ReExp_Sprt03_DtlYieldR.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$base_unit_qty, ReExp_Sprt03_DtlYieldR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$trd_unit_qty, ReExp_Sprt03_DtlYieldR.$trd_unit_qty);
				addColumnPathMap(ReExp_Sprt03_RsltYieldR.$yield_schd_dt, ReExp_Sprt03_DtlYieldR.$yield_schd_dt);
			}
		}
	}

	/**
	 * ReExp_Sprt04オペレーション.<p>
	 * 再展開（工程展開なし）<p>
	 *
	 * 製造品、工程の情報を元に構成展開（Sprt01）、工数展開（Sprt02）、出来高予定作成（Sprt03）を実行する。
	 * 製造指図登録画面の検索ボタン押下時に呼ばれる。（新規種別で品目オーダから展開する場合）
	 */
	public class ReExp_Sprt04 extends MSBCL_ReExpService_MC_A.ReExp_Sprt04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 構成展開
			callReExpSprt01();

			// 工数展開
			callReExpSprt02();

			// 出来高予定作成
			callReExpSprt03();
		}
		
		/**
		 * 構成展開オペレーションを実行する。
		 */
		protected void callReExpSprt01() {
			// 品目情報をup0、工程情報をup1から取得し、Sprt01構成展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。

			// 品目情報に対するループ
			MCIndexKey idxKey = up1().createIndex(ReExp_Sprt04_DtlOperR.$hdr_peg_no);
			for (ReExp_Sprt04_HdrR hdrR : up0()) {

				// 紐付けＮＯで工程情報を抽出
				MCList<ReExp_Sprt04_DtlOperR> operL = up1().subList(idxKey, hdrR.peg_no());
				for (ReExp_Sprt04_DtlOperR operR : operL) {
					
					ReExp_Sprt01_HdrR upR = so01.up0().createRow();
					upR.setAttributes(hdrR);
					upR.hdr_peg_no(hdrR.peg_no());
					upR.oper_peg_no(operR.peg_no());
					upR.itm_cd(hdrR.itm_cd());
					upR.itm_sub1(hdrR.itm_sub1());
					upR.itm_sub2(hdrR.itm_sub2());
					upR.itm_sub3(hdrR.itm_sub3());
					upR.mfg_loc_cd(hdrR.mfg_loc_cd());
					upR.bom_ptn(hdrR.bom_ptn());
					upR.oper_cd(operR.oper_cd());
					upR.oper_seq(operR.oper_seq());
					upR.oper_loc_cd(operR.oper_loc_cd());
					upR.oper_inst_qty(operR.oper_inst_qty());
					upR.mfg_st_schd_dt(hdrR.mfg_st_schd_dt());
					upR.st_schd_dt(operR.st_schd_tm());
					upR.end_schd_dt(operR.end_schd_tm());
					upR.sno1(hdrR.sno1());
					upR.sno2(hdrR.sno2());
					upR.sno3(hdrR.sno3());
					upR.sno4(hdrR.sno4());
					upR.cur_cd(hdrR.cur_cd());
					upR.oper_str_ln_cd(operR.oper_str_ln_cd());
					upR.oper_str_ln_nm(operR.oper_str_ln_nm());
					upR.oper_str_ln_cd_none_flg(operR.oper_str_ln_cd_none_flg());
					upR.strg_loc_cd(hdrR.strg_loc_cd());
					upR.strg_str_ln_cd(hdrR.strg_str_ln_cd());
					upR.strg_str_ln_nm(hdrR.strg_str_ln_nm());
					upR.strg_str_ln_cd_none_flg(hdrR.strg_str_ln_cd_none_flg());

					so01.up0().add(upR);
				}
			}
			so01.exec();
			mapDownContainers(RE1);
		}
		
		/**
		 * 工数展開オペレーションを実行する。
		 */
		protected void callReExpSprt02() {
			// 品目情報をup0、工程情報をup1から取得し、Sprt02工数展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。

			// 品目情報に対するループ
			MCIndexKey idxKey = up1().createIndex(ReExp_Sprt04_DtlOperR.$hdr_peg_no);
			for (ReExp_Sprt04_HdrR hdrR : up0()) {

				// 紐付けＮＯで工程情報を抽出
				MCList<ReExp_Sprt04_DtlOperR> operL = up1().subList(idxKey, hdrR.peg_no());
				for (ReExp_Sprt04_DtlOperR operR : operL) {
					
					ReExp_Sprt02_HdrR upR = so02.up0().createRow();
					upR.setAttributes(hdrR);
					upR.hdr_peg_no(hdrR.peg_no());
					upR.oper_peg_no(operR.peg_no());
					upR.itm_cd(hdrR.itm_cd());
					upR.itm_sub1(hdrR.itm_sub1());
					upR.itm_sub2(hdrR.itm_sub2());
					upR.itm_sub3(hdrR.itm_sub3());
					upR.mfg_loc_cd(hdrR.mfg_loc_cd());
					upR.oper_ptn(operR.oper_ptn());
					upR.oper_cd(operR.oper_cd());
					upR.oper_seq(operR.oper_seq());
					upR.oper_inst_qty(operR.oper_inst_qty());
					upR.mfg_st_schd_dt(hdrR.mfg_st_schd_dt());

					so02.up0().add(upR);
				}
			}
			so02.exec();
			mapDownContainers(RE2);
		}
		
		/**
		 * 出来高予定作成オペレーションを実行する。
		 */
		protected void callReExpSprt03() {
			mapUpContainers(RE3);
			so03.exec();
			mapDownContainers(RE3);
		}
	}

	/**
	 * ReExp_Sprt05オペレーション.<p>
	 * 再展開（工程展開あり）
	 *
	 * 製造品の情報を元に工程オーダを展開し、構成展開（Sprt01）、工数展開（Sprt02）、出来高予定作成（Sprt03）を実行する。
	 * 製造指図登録画面の再展開ボタン押下時に呼ばれる。（計画外製造指図または指図変更）
	 */
	public class ReExp_Sprt05 extends MSBCL_ReExpService_MC_A.ReExp_Sprt05 {

		// 工程オーダ展開結果を一時的に格納するためのリスト。このリストと工程指図のテーブルを比較し、結果を下り電文に格納する
		protected MCList<ReExp_Sprt05_RsltOperR> _operRsltL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 上り電文の設定
			editUp();

			// オーダ登録サービスの工程オーダ展開
			callExpOper();
			
			// 工程実績の存在チェック
			srchOperAct();

			// 登録済の工程指図との比較
			compRegedOper();
			
			// 構成展開
			callReExpSprt01();

			// 工数展開
			callReExpSprt02();

			// 出来高予定作成
			callReExpSprt03();
		}
		
		/**
		 * 上り電文の設定
		 */
		protected void editUp() {
			
			// 品目マスタから基準単位の情報を取得
			setBaseUnit();
			
			// 製造指図から登録済の製造状況区分を取得
			setMfgSts();
		}
		
		/**
		 * 品目マスタから基準単位の情報を取得
		 */
		protected void setBaseUnit() {
			
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			
			itmL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.unit_cd, t.dec_place);
			itmL_bldr.addSelect(m1.unit_nm);
			itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmL_bldr.addLeftOuterJoin(m1, m1.unit_cd.eq(t.unit_cd));
			dbSelect("MSBCL6020_MAM_ITM_S02", itmL, itmL_bldr, up0());
			MCIndexKey itmKey = itmL.createIndex(MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
					MAM_ITM_R.$itm_sub3);

			for (ReExp_Sprt05_HdrR r : up0()) {
				MCList<MAM_ITM_R> itmSubL = itmL.subList(itmKey, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.base_unit_cd(itmSubL.get(0).unit_cd());
				r.base_unit_dec_place(itmSubL.get(0).dec_place());
				r.base_unit_nm(itmSubL.get(0).getStringNE("UNIT_NM"));
			}
		}

		/**
		 * 製造指図から登録済の製造状況区分を取得
		 */
		protected void setMfgSts() {

			MCList<MSVT_MFG_INST_PR_R> prL = MCList.create(MSVT_MFG_INST_PR_R.class);
			MSVT_MFG_INST_PR_R t = MSVT_MFG_INST_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
			prL_bldr.setSelect(t.mfg_inst_no, t.mfg_sts_typ);
			dbSelectKey("MSBCL6020_MSVT_MFG_INST_PR_S01", prL, prL_bldr, up0());
			MCIndexKey prKey = prL.createIndex(MSVT_MFG_INST_PR_R.$mfg_inst_no);

			for (ReExp_Sprt05_HdrR r : up0()) {
				MCList<MSVT_MFG_INST_PR_R> prSubL = prL.subList(prKey, r.mfg_inst_no());
				if (!isNull(prSubL)) {
					r.mfg_sts_typ(prSubL.get(0).mfg_sts_typ());
				}
			}
		}

		/**
		 * オーダ登録サービスの工程オーダ展開を実行する。
		 */
		protected void callExpOper() {
			
			_operRsltL = MCList.create(ReExp_Sprt05_RsltOperR.class);

			// 工程オーダＮＯの取得用に工程オーダ情報を検索する
			MCList<MST_OPER_ORDER_R> operOrdL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder operOrdL_bldr = MCQueryApiBuilder.create(t);
			
			operOrdL_bldr.setSelect(t.oper_ord_no, t.itm_ord_no, t.oper_cd, t.oper_seq);
			operOrdL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
			dbSelect("MSBCL6020_MST_OPER_ORDER_S01", operOrdL, operOrdL_bldr, up0());
			MCIndexKey operOrdKey = operOrdL.createIndex(MST_OPER_ORDER_R.$itm_ord_no,
					MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq);
			
			// オーダ登録サービスの工程オーダ展開を実行
			MCList<Ord_Sprt01_RsltR> ordLsltL = MCList.create(Ord_Sprt01_RsltR.class);
			mapUpContainers(RE4);
			so04.exec();
			ordLsltL.addAll(so04.down0());

			// ヘッダ紐付けＮＯ、表示順でソート
			ordLsltL.sort(SortType.ASC, Ord_Sprt01_RsltR.$peg_no, Ord_Sprt01_RsltR.$disp_seq);

			// サービスの戻り値を元に、工程指図を作成する
			addAll(_operRsltL, ordLsltL, createMap_ReExp_Sprt05_RsltOperR_Ord_Sprt01_RsltR());
			MCIndexKey idxKey = _operRsltL.createIndex(ReExp_Sprt05_DtlOperR.$hdr_peg_no);

			// 工程紐付きＮＯの発番
			setPegNo(ReExp_Sprt05_DtlOperR.$peg_no, _operRsltL);
			
			// 上り電文のヘッダ紐付けＮＯ単位に以下の処理を実施
			for (ReExp_Sprt05_HdrR pegR : up0()) {
				
				MCList<ReExp_Sprt05_RsltOperR> subL = _operRsltL.subList(idxKey, pegR.peg_no());
				
				for (ReExp_Sprt05_RsltOperR r : subL) {
					// 基準単位ＣＤ、基準単位名、基準単位小数部有効桁数を上り電文から設定
					r.base_unit_cd(pegR.base_unit_cd());
					r.base_unit_nm(pegR.base_unit_nm());
					r.base_unit_dec_place(pegR.base_unit_dec_place());

					// 製造指図ＮＯを設定する
					if (!isNull(pegR.mfg_inst_no())) {
						r.mfg_inst_no(pegR.mfg_inst_no());
					}
					
					// 工程ＣＤ、工程連番で工程オーダとのマッチングを行い、マッチした場合は工程オーダＮＯを設定する
					// 複数存在した場合は、工程オーダＮＯの小さい値を採用
					MCList<MST_OPER_ORDER_R> tmpL = operOrdL.subList(operOrdKey, pegR.itm_ord_no(), r.oper_cd(), r.oper_seq());
					if (!tmpL.isEmpty()) {
						r.oper_ord_no(tmpL.get(0).oper_ord_no());
					}

					// 生産管理ユーティリティの工程単位変換を呼び出す
					MCNumber operQty = MSUCL_ProdUtil.convQtyBaseToOper(r.base_unit_qty(), r.oper_conv_qty(), r.oper_std_qty(), r.dec_place(), r.unit_conv_rnd_typ());
					
					if (isNull(operQty)) {
						// 工程単位変換が不可能の場合、工程単位に基準単位を設定
						r.oper_unit_qty(r.base_unit_qty());
						r.oper_unit_cd(r.base_unit_cd());
						r.oper_unit_nm(r.base_unit_nm());
						r.oper_std_qty(1);
						r.oper_conv_qty(1);
						r.dec_place(r.base_unit_dec_place());
					}
					else {
						r.oper_unit_qty(operQty);
					}
					
					if (MSC_ITM_ORD_TYP.isMFG(pegR.itm_ord_typ())) {
						r.wk_cost_calc_flg(true); //内製の場合、自動工数計算ＦＬＧは常にオン
					}
				}
			}
		}

		/**
		 * オーダ登録サービスの工程オーダ展開の下り電文から再展開（工程展開あり）の下り電文へのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt05_RsltOperR_Ord_Sprt01_RsltR<ReExp_Sprt05_RsltOperR,Ord_Sprt01_RsltR> createMap_ReExp_Sprt05_RsltOperR_Ord_Sprt01_RsltR() {
			return new Map_ReExp_Sprt05_RsltOperR_Ord_Sprt01_RsltR<ReExp_Sprt05_RsltOperR, Ord_Sprt01_RsltR>();
		}

		public class Map_ReExp_Sprt05_RsltOperR_Ord_Sprt01_RsltR<D extends ReExp_Sprt05_RsltOperR, S extends Ord_Sprt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$hdr_peg_no, Ord_Sprt01_RsltR.$peg_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_cd, Ord_Sprt01_RsltR.$oper_cd);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_nm, Ord_Sprt01_RsltR.$oper_nm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_seq, Ord_Sprt01_RsltR.$oper_seq);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$disp_seq, Ord_Sprt01_RsltR.$disp_seq);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$base_unit_qty, Ord_Sprt01_RsltR.$oper_schd_qty); //基準単位数量に工程指図予定数量を設定
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_unit_cd, Ord_Sprt01_RsltR.$oper_unit_cd);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_unit_nm, Ord_Sprt01_RsltR.$oper_unit_nm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$yield_oper_flg, Ord_Sprt01_RsltR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$st_schd_tm, Ord_Sprt01_RsltR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$end_schd_tm, Ord_Sprt01_RsltR.$end_schd_tm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_loc_cd, Ord_Sprt01_RsltR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_loc_nm, Ord_Sprt01_RsltR.$oper_loc_nm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_str_ln_tgt_flg, Ord_Sprt01_RsltR.$oper_str_ln_tgt_flg);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_ptn, Ord_Sprt01_RsltR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$bkf_flg, Ord_Sprt01_RsltR.$bkf_flg);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_inst_grp, Ord_Sprt01_RsltR.$oper_inst_grp);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$wip_rate, Ord_Sprt01_RsltR.$wip_rate);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_std_qty, Ord_Sprt01_RsltR.$oper_std_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_conv_qty, Ord_Sprt01_RsltR.$oper_conv_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_lower_yield, Ord_Sprt01_RsltR.$oper_lower_yield);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_std_yield, Ord_Sprt01_RsltR.$oper_std_yield);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_upper_yield, Ord_Sprt01_RsltR.$oper_upper_yield);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_lt, Ord_Sprt01_RsltR.$mst_oper_lt);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_lt_add_qty, Ord_Sprt01_RsltR.$oper_lt_add_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_offst_typ, Ord_Sprt01_RsltR.$oper_offst_typ);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_offst, Ord_Sprt01_RsltR.$mst_oper_offst);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_offst_add_qty, Ord_Sprt01_RsltR.$oper_offst_add_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$dec_place, Ord_Sprt01_RsltR.$dec_place);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$unit_conv_rnd_typ, Ord_Sprt01_RsltR.$unit_conv_rnd_typ);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$yield_oper_ratio, Ord_Sprt01_RsltR.$yield_oper_ratio);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$lmt_fr_dt_flg, Ord_Sprt01_RsltR.$lmt_fr_dt_flg);
			}
		}

		/**
		 * 工程実績が存在するかどうか確認する
		 */

		protected void srchOperAct() {

			// 工程実績をキャッシュ
			FXUCL_Cache<MST_OPER_ACT_R> cache = new FXUCL_Cache<MST_OPER_ACT_R>();
			cache.setFixMaxCacheSize(-1);

			MCList<MST_OPER_ACT_R> dbL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.oper_inst_no, t.oper_act_no);
			dbL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			dbSelect("MSBCL6020_MST_OPER_ACT_S01", dbL, dbL_bldr, up1());

			for (MST_OPER_ACT_R r : dbL) {
				cache.putCache(new String[] {
						r.getStringNE(MST_OPER_ACT_R.$oper_inst_no)
				}, r);
			}

			// 上り電文（工程指図の検索結果）の実績ありフラグを設定
			for (ReExp_Sprt05_DtlOperR r : up1()) {
				MST_OPER_ACT_R actR = cache.getCache(r.oper_inst_no());
				r.act_flg(!isNull(actR));
			}
		}

		/**
		 * 登録済の工程指図と比較し、下り電文を編集する
		 */
		protected void compRegedOper() {

			MCList<ReExp_Sprt05_RsltOperR> rsltL = MCList.create(ReExp_Sprt05_RsltOperR.class); //製造指図済（製造指図ＮＯあり）
			MCList<ReExp_Sprt05_RsltOperR> notInstRsltL = MCList.create(ReExp_Sprt05_RsltOperR.class); //製造指図前（製造指図ＮＯなし）

			// 展開結果の紐付けＮＯからヘッダを取得するためのインデックスキー
			MCIndexKey hdrKey = up0().createIndex(ReExp_Sprt05_HdrR.$peg_no);
			
			// 展開結果を製造指図ＮＯが設定されている行、されていない行に分別
			for (ReExp_Sprt05_RsltOperR r : _operRsltL) {
				if (isNull(r.mfg_inst_no())) {
					// 製造指図前
					notInstRsltL.add(r);
				}
				else {
					// 製造指図済
					rsltL.add(r);
				}
				ReExp_Sprt05_HdrR hdrR = up0().getFirst(hdrKey, r.hdr_peg_no());
				if (isSame(r.oper_loc_cd(), hdrR.mfg_loc_cd())) {
					r.oper_str_ln_cd(hdrR.mfg_str_ln_cd());
					r.oper_str_ln_nm(hdrR.mfg_str_ln_nm());
					r.oper_str_ln_cd_none_flg(hdrR.mfg_str_ln_cd_none_flg());
				}
				else {
					if (r.oper_str_ln_tgt_flg() && isNull(r.oper_str_ln_cd())) {
						r.oper_str_ln_cd(MAC_STR.NULL_VAL.value());
					}
				}
			}
			
			// 製造指図前の行については、下り電文のすべての行のROWステータスに「新規作成」を設定し、下り電文に追加
			if (!notInstRsltL.isEmpty()) {
				notInstRsltL.setStatus(MCRow.Status.CREATE);
				notInstRsltL.setBoolean(ReExp_Sprt05_RsltOperR.$upd_flg, true);
				down0().addAll(notInstRsltL);
			}
			
			// 製造指図済の行が存在しない場合、処理を終了
			if (rsltL.isEmpty()) {
				return;
			}
			
			// 展開結果の製造指図ＮＯをグループ化
			MCList<ReExp_Sprt05_RsltOperR> mfgL = rsltL.groupBy(ReExp_Sprt05_RsltOperR.$mfg_inst_no);

			// 工程指図（全件）から製造指図ＮＯでレコードを抽出するためのインデックスキー
			MCIndexKey schdKey = up1().createIndex(ReExp_Sprt05_DtlOperR.$mfg_inst_no);

			// 展開結果から製造指図ＮＯでレコードを抽出するためのインデックスキー
			MCIndexKey mfgKey = rsltL.createIndex(ReExp_Sprt05_RsltOperR.$mfg_inst_no);
			
			// 追加行に設定するため、工程peg_noの最大値＋１を取得
			int pegNo = ((MCNumber) up1().max(ReExp_Sprt05_DtlOperR.$peg_no)).intValue() + 1;

			// 製造指図ＮＯ単位に展開結果、工程指図を抽出して比較
			for (ReExp_Sprt05_RsltOperR mfgR : mfgL) {
				
				// 製造指図ＮＯで工程指図を取得
				MCList<ReExp_Sprt05_DtlOperR> schdSubL = up1().subList(schdKey, mfgR.mfg_inst_no());

				// 製造指図ＮＯで展開結果を取得
				MCList<ReExp_Sprt05_RsltOperR> rsltSubL = rsltL.subList(mfgKey, mfgR.mfg_inst_no());

				// 工程指図から工程ＣＤ、工程連番でレコードを抽出するためのインデックスキーを定義
				MCIndexKey schdSubKey = schdSubL.createIndex(
						ReExp_Sprt05_DtlOperR.$oper_cd, ReExp_Sprt05_DtlOperR.$oper_seq);

				// 展開結果を元に工程指図を比較
				for (ReExp_Sprt05_RsltOperR rsltR : rsltSubL) {

					// 下り電文に設定するリスト
					MCList<ReExp_Sprt05_RsltOperR> down0L = MCList.create(ReExp_Sprt05_RsltOperR.class);
					
					// 工程ＣＤ、工程連番でマッチング
					MCList<ReExp_Sprt05_DtlOperR> tblL = schdSubL.subList(schdSubKey,
							rsltR.oper_cd(), rsltR.oper_seq());
					MCIndexKey tblKey = tblL.createIndex(ReExp_Sprt05_DtlOperR.$act_flg);
					
					if (tblL.isEmpty()) {
						// 該当する工程指図のテーブルが存在しない場合、追加ステータスで下り電文に追加
						rsltR.setStatus(MCRow.Status.CREATE);
						rsltR.peg_no(pegNo++);
						rsltR.upd_flg(true);
						down0L.add(rsltR);
					}
					else {
						// 該当する工程指図のテーブルが存在する場合、テーブルに対して展開結果マッチングフラグをオンにする
						tblL.setBoolean(ReExp_Sprt05_DtlOperR.$match_flg, true);
						// 対象の工程指図が複数件存在する場合、１件目を取得
						ReExp_Sprt05_DtlOperR tblR = tblL.get(0);

						// 工程実績の有無を判断する
						ReExp_Sprt05_DtlOperR actR = tblL.getFirst(tblKey, true);
						if (isNull(actR)) {
							// 工程実績が発生していない場合、更新は１件目に対してのみ実施
							tblR.setStatus(MCRow.Status.MODIFY);
							copy(rsltR, tblR, createMap_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR_ForUpd());
							rsltR.upd_flg(true);
							down0L.add(rsltR);
							
							// ２件目以降は削除
							int i = 1;
							for (ReExp_Sprt05_DtlOperR r : tblL) {
								if (i > 1) {
									ReExp_Sprt05_RsltOperR delR = ReExp_Sprt05_RsltOperR.create();
									copy(delR, r, createMap_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR());
									delR.setStatus(MCRow.Status.DELETE);
									delR.upd_flg(false);
									down0L.add(delR);
								}
								i++;
							}
						}
						else {
							// 工程実績が発生している場合、展開結果を反映せず、元のテーブルの値を下り電文に追加
							MCList<ReExp_Sprt05_RsltOperR> RsltFromTblL = MCList.create(ReExp_Sprt05_RsltOperR.class);
							addAll(RsltFromTblL, tblL, createMap_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR());
							RsltFromTblL.setStatus(MCRow.Status.NONE);
							RsltFromTblL.setBoolean(ReExp_Sprt05_RsltOperR.$upd_flg, false);
							down0L.addAll(RsltFromTblL);

							// マスタ項目が不一致の場合はインフォメーションを出力する
							if (!compOperCol(tblR, rsltR)) {
								MCMessagePool.add(new MCMessage(rsltR, null, MSBCL1046,
										rsltR.oper_cd(), toDispGUIIndex(rsltR)));
							}
						}
					}
					down0().addAll(down0L);
				}
				
				// 展開結果マッチングフラグがオフの工程指図を削除
				MCList<ReExp_Sprt05_DtlOperR> delL = schdSubL.subList(ReExp_Sprt05_DtlOperR.$match_flg, false);
				for (ReExp_Sprt05_DtlOperR delR : delL) {
					ReExp_Sprt05_RsltOperR addR = ReExp_Sprt05_RsltOperR.create();
					addR.upd_flg(false);
					copy(addR, delR, createMap_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR());
					if (delR.act_flg()) {
						MCMessagePool.add(new MCMessage(addR, null, MSBCL1046, addR.oper_cd(), toDispGUIIndex(addR)));
						addR.setStatus(MCRow.Status.NONE);
					}
					else {
						addR.setStatus(MCRow.Status.DELETE);
					}
					down0().add(addR);
				}
			}
		}

		/**
		 * ・デフォルト工程の場合true
		 * ・デフォルト工程以外の場合、テーブルと展開結果のマスタ項目を比較し、すべて一致する場合はtrue、不一致がある場合はfalseを返す
		 * 
		 * @param tblR テーブル
		 * @param rsltR 展開結果
		 * @return
		 */
		protected boolean compOperCol(ReExp_Sprt05_DtlOperR tblR, ReExp_Sprt05_RsltOperR rsltR) {
			if (MAC_STR.isNULL_VAL(tblR.oper_cd())) {
				return true;
			}
			
			if (!isSame(tblR.yield_oper_flg(), rsltR.yield_oper_flg())) {
				return false;
			}
			if (!isSame(tblR.oper_lt(), rsltR.oper_lt())) {
				return false;
			}
			if (!isSame(tblR.oper_lt_add_qty(), rsltR.oper_lt_add_qty())) {
				return false;
			}
			if (!isSame(tblR.oper_offst_typ(), rsltR.oper_offst_typ())) {
				return false;
			}
			if (!isSame(tblR.oper_offst(), rsltR.oper_offst())) {
				return false;
			}
			if (!isSame(tblR.oper_offst_add_qty(), rsltR.oper_offst_add_qty())) {
				return false;
			}
			if (!isSame(tblR.oper_std_qty(), rsltR.oper_std_qty())) {
				return false;
			}
			if (!isSame(tblR.oper_conv_qty(), rsltR.oper_conv_qty())) {
				return false;
			}
			if (!isSame(tblR.oper_seq(), rsltR.oper_seq())) {
				return false;
			}
			return true;
		}

		/**
		 * 工程指図のテーブルから下り電文へのマッピング（更新用）
		 * @return
		 */
		protected Map_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR_ForUpd<ReExp_Sprt05_RsltOperR,ReExp_Sprt05_DtlOperR> createMap_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR_ForUpd() {
			return new Map_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR_ForUpd<ReExp_Sprt05_RsltOperR, ReExp_Sprt05_DtlOperR>();
		}

		public class Map_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR_ForUpd<D extends ReExp_Sprt05_RsltOperR, S extends ReExp_Sprt05_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$peg_no, ReExp_Sprt05_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$hdr_peg_no, ReExp_Sprt05_DtlOperR.$hdr_peg_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$mfg_inst_no, ReExp_Sprt05_DtlOperR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_inst_no, ReExp_Sprt05_DtlOperR.$oper_inst_no);
			}
		}
		
		/**
		 * 工程指図のテーブルから下り電文へのマッピング（NONEまたは削除行用）
		 * @return
		 */
		protected Map_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR<ReExp_Sprt05_RsltOperR,ReExp_Sprt05_DtlOperR> createMap_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR() {
			return new Map_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR<ReExp_Sprt05_RsltOperR, ReExp_Sprt05_DtlOperR>();
		}

		public class Map_ReExp_Sprt05_RsltOperR_ReExp_Sprt05_DtlOperR<D extends ReExp_Sprt05_RsltOperR, S extends ReExp_Sprt05_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$peg_no, ReExp_Sprt05_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$hdr_peg_no, ReExp_Sprt05_DtlOperR.$hdr_peg_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_cd, ReExp_Sprt05_DtlOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_seq, ReExp_Sprt05_DtlOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$base_unit_qty, ReExp_Sprt05_DtlOperR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$yield_oper_flg, ReExp_Sprt05_DtlOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$st_schd_tm, ReExp_Sprt05_DtlOperR.$st_schd_tm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$end_schd_tm, ReExp_Sprt05_DtlOperR.$end_schd_tm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_loc_cd, ReExp_Sprt05_DtlOperR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_str_ln_cd, ReExp_Sprt05_DtlOperR.$oper_str_ln_cd);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_str_ln_nm, ReExp_Sprt05_DtlOperR.$oper_str_ln_nm);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_str_ln_cd_none_flg, ReExp_Sprt05_DtlOperR.$oper_str_ln_cd_none_flg);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_std_qty, ReExp_Sprt05_DtlOperR.$oper_std_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_conv_qty, ReExp_Sprt05_DtlOperR.$oper_conv_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_lt, ReExp_Sprt05_DtlOperR.$oper_lt);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_lt_add_qty, ReExp_Sprt05_DtlOperR.$oper_lt_add_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_offst_typ, ReExp_Sprt05_DtlOperR.$oper_offst_typ);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_offst, ReExp_Sprt05_DtlOperR.$oper_offst);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_offst_add_qty, ReExp_Sprt05_DtlOperR.$oper_offst_add_qty);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$mfg_inst_no, ReExp_Sprt05_DtlOperR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_inst_no, ReExp_Sprt05_DtlOperR.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$oper_ptn, ReExp_Sprt05_DtlOperR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt05_RsltOperR.$yield_oper_ratio, ReExp_Sprt05_DtlOperR.$yield_oper_ratio);
			}
		}

		/**
		 * 構成展開オペレーションを実行する。
		 */
		protected void callReExpSprt01() {
			// 品目情報をup0、工程情報をup1から取得し、Sprt01構成展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。
			
			// 品目情報に対するループ
			for (ReExp_Sprt05_HdrR itmR : up0()) {
				
				// 構成展開しないＦＬＧのチェック
				if (itmR.not_bom_exp_flg()) {
					continue;
				}

				// 紐付けＮＯで工程情報を抽出
				MCList<ReExp_Sprt05_RsltOperR> operL = down0().subList(ReExp_Sprt05_DtlOperR.$hdr_peg_no, itmR.peg_no());
				for (ReExp_Sprt05_RsltOperR operR : operL) {
					
					// 削除ステータスの行は処理対象外
					if (isSame(MCRow.Status.DELETE, operR.getStatus())) {
						continue;
					}
					// 行追加した行（工程連番がNULL）は処理対象外
					if (isNull(operR.oper_seq())) {
						continue;
					}
					
					ReExp_Sprt01_HdrR upR = so01.up0().createRow();
					upR.setAttributes(itmR);
					upR.hdr_peg_no(operR.hdr_peg_no());
					upR.oper_peg_no(operR.peg_no());
					upR.mfg_inst_no(itmR.mfg_inst_no());
					upR.oper_inst_no(operR.oper_inst_no());
					upR.itm_cd(itmR.itm_cd());
					upR.itm_sub1(itmR.itm_sub1());
					upR.itm_sub2(itmR.itm_sub2());
					upR.itm_sub3(itmR.itm_sub3());
					upR.mfg_loc_cd(itmR.mfg_loc_cd());
					upR.bom_ptn(itmR.bom_ptn());
					upR.oper_cd(operR.oper_cd());
					upR.oper_seq(operR.oper_seq());
					upR.oper_loc_cd(operR.oper_loc_cd());
					upR.oper_inst_qty(operR.base_unit_qty());
					upR.mfg_st_schd_dt(itmR.mfg_st_schd_dt());
					upR.st_schd_dt(operR.st_schd_tm());
					upR.end_schd_dt(operR.end_schd_tm());
					upR.sno1(itmR.sno1());
					upR.sno2(itmR.sno2());
					upR.sno3(itmR.sno3());
					upR.sno4(itmR.sno4());
					upR.cur_cd(itmR.cur_cd());
					upR.oper_str_ln_cd(operR.oper_str_ln_cd());
					upR.oper_str_ln_nm(operR.oper_str_ln_nm());
					upR.oper_str_ln_cd_none_flg(operR.oper_str_ln_cd_none_flg());
					upR.strg_loc_cd(itmR.strg_loc_cd());
					upR.strg_str_ln_cd(itmR.strg_str_ln_cd());
					upR.strg_str_ln_nm(itmR.strg_str_ln_nm());
					upR.strg_str_ln_cd_none_flg(itmR.strg_str_ln_cd_none_flg());

					so01.up0().add(upR);
				}
			}
			mapUpContainers(RE1);
			so01.exec();
			mapDownContainers(RE1);
		}
		
		/**
		 * 工数展開オペレーションを実行する。
		 */
		protected void callReExpSprt02() {
			// 品目情報をup0、工程情報をup1から取得し、Sprt02工数展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。

			// 品目情報に対するループ
			for (ReExp_Sprt05_HdrR itmR : up0()) {

				// 工数展開しないＦＬＧのチェック
				if (itmR.not_wk_exp_flg()) {
					continue;
				}

				// 紐付けＮＯで工程情報を抽出
				MCList<ReExp_Sprt05_RsltOperR> operL = down0().subList(ReExp_Sprt05_DtlOperR.$hdr_peg_no, itmR.peg_no());
				for (ReExp_Sprt05_RsltOperR operR : operL) {
					
					// 削除ステータスの行は処理対象外
					if (isSame(MCRow.Status.DELETE, operR.getStatus())) {
						continue;
					}
					
					ReExp_Sprt02_HdrR upR = so02.up0().createRow();
					upR.setAttributes(itmR);
					upR.hdr_peg_no(operR.hdr_peg_no());
					upR.oper_peg_no(operR.peg_no());
					upR.mfg_inst_no(itmR.mfg_inst_no());
					upR.oper_inst_no(operR.oper_inst_no());
					upR.itm_cd(itmR.itm_cd());
					upR.itm_sub1(itmR.itm_sub1());
					upR.itm_sub2(itmR.itm_sub2());
					upR.itm_sub3(itmR.itm_sub3());
					upR.mfg_loc_cd(itmR.mfg_loc_cd());
					upR.oper_ptn(operR.oper_ptn());
					upR.oper_cd(operR.oper_cd());
					upR.oper_seq(operR.oper_seq());
					upR.oper_inst_qty(operR.base_unit_qty());
					upR.mfg_st_schd_dt(itmR.mfg_st_schd_dt());

					so02.up0().add(upR);
				}
			}
			mapUpContainers(RE2);
			so02.exec();
			mapDownContainers(RE2);
		}
		
		/**
		 * 出来高予定作成オペレーションを実行する。
		 */
		protected void callReExpSprt03() {
			// 工程情報をdown0から取得し、Sprt03出来高予定作成を実行する。
			for (MCList<ReExp_Sprt05_RsltOperR> grpL : down0().groupList(ReExp_Sprt05_RsltOperR.$hdr_peg_no)) {
				// 同一hdr_peg_noの行の中にupd_flgがtrueのものが存在するか
				ReExp_Sprt05_RsltOperR r = grpL.getFirst(ReExp_Sprt05_RsltOperR.$upd_flg, true);
				if (!isNull(r)) {
					// upd_flgがtrueのものが存在する場合、同一hdr_peg_noのレコードをすべて対象とする
					// ※出来高計上工程をすべて対象としないと、出来高計上比率での計算ができなくなるため
					addAll(so03.up1(), grpL, createMap_ReExp_Sprt03_DtlOperR_ReExp_Sprt05_RsltOperR());
				}
			}

			mapUpContainers(RE3);
			so03.exec();
			mapDownContainers(RE3);
		}

		/**
		 * 再展開（工程展開あり）の製造指図上り電文から出来高予定作成の上り電文へのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt03_HdrR_ReExp_Sprt05_HdrR<ReExp_Sprt03_HdrR,ReExp_Sprt05_HdrR> createMap_ReExp_Sprt03_HdrR_ReExp_Sprt05_HdrR() {
			return new Map_ReExp_Sprt03_HdrR_ReExp_Sprt05_HdrR<ReExp_Sprt03_HdrR, ReExp_Sprt05_HdrR>();
		}

		public class Map_ReExp_Sprt03_HdrR_ReExp_Sprt05_HdrR<D extends ReExp_Sprt03_HdrR, S extends ReExp_Sprt05_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt03_HdrR.$peg_no, ReExp_Sprt05_HdrR.$peg_no);
				addColumnPathMap(ReExp_Sprt03_HdrR.$itm_cd, ReExp_Sprt05_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt03_HdrR.$itm_sub1, ReExp_Sprt05_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt03_HdrR.$itm_sub2, ReExp_Sprt05_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt03_HdrR.$itm_sub3, ReExp_Sprt05_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt03_HdrR.$yield_schd_qty, ReExp_Sprt05_HdrR.$yield_schd_qty);
				addColumnPathMap(ReExp_Sprt03_HdrR.$strg_loc_cd, ReExp_Sprt05_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt03_HdrR.$strg_str_ln_cd, ReExp_Sprt05_HdrR.$strg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt03_HdrR.$strg_str_ln_nm, ReExp_Sprt05_HdrR.$strg_str_ln_nm);
				addColumnPathMap(ReExp_Sprt03_HdrR.$strg_str_ln_cd_none_flg, ReExp_Sprt05_HdrR.$strg_str_ln_cd_none_flg);
			}
		}

		/**
		 * 再展開（工程展開あり）の工程指図の下り電文から出来高予定作成の上り電文へのマッパー
		 * @return
		 */
		protected Map_ReExp_Sprt03_DtlOperR_ReExp_Sprt05_RsltOperR<ReExp_Sprt03_DtlOperR,ReExp_Sprt05_RsltOperR> createMap_ReExp_Sprt03_DtlOperR_ReExp_Sprt05_RsltOperR() {
			return new Map_ReExp_Sprt03_DtlOperR_ReExp_Sprt05_RsltOperR<ReExp_Sprt03_DtlOperR, ReExp_Sprt05_RsltOperR>();
		}

		public class Map_ReExp_Sprt03_DtlOperR_ReExp_Sprt05_RsltOperR<D extends ReExp_Sprt03_DtlOperR, S extends ReExp_Sprt05_RsltOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$peg_no, ReExp_Sprt05_RsltOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$hdr_peg_no, ReExp_Sprt05_RsltOperR.$hdr_peg_no);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$oper_cd, ReExp_Sprt05_RsltOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$oper_seq, ReExp_Sprt05_RsltOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$yield_oper_flg, ReExp_Sprt05_RsltOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$yield_oper_ratio, ReExp_Sprt05_RsltOperR.$yield_oper_ratio);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$end_schd_dt, ReExp_Sprt05_RsltOperR.$end_schd_tm);
				addColumnPathMap(ReExp_Sprt03_DtlOperR.$oper_inst_qty, ReExp_Sprt05_RsltOperR.$base_unit_qty);
			}
		}
	}

	/**
	 * ReExp_Sprt06オペレーション.<p>
	 * 予定再展開<p>
	 * 
	 * 製造品、工程の情報を元に構成展開（Sprt01）、工数展開（Sprt02）、出来高予定作成（Sprt03）を実行する。
	 * Sprt04と同等の機能だが、Sprt04は製造指図に紐付くすべての工程を対象にするのに対し、当オペレーションは指定された工程のみを対象とする。
	 * 製造指図登録画面の予定再展開ボタン押下時に実行される。
	 */
	public class ReExp_Sprt06 extends MSBCL_ReExpService_MC_A.ReExp_Sprt06 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文の設定
			editUp();
			
			// 構成展開
			callReExpSprt01();

			// 工数展開
			callReExpSprt02();

			// 出来高予定作成
			callReExpSprt03();
		}

		/**
		 * 上り電文に紐付けＮＯを設定する
		 */
		protected void editUp() {
			
			// 工程コンテナをヘッダ紐づけＮＯでサブリストするためのインデックスキー
			MCIndexKey operKey = up1().createIndex(ReExp_Sprt06_DtlOperR.$hdr_peg_no);
			
			// 出来高・投入・副産品・工数コンテナを工程指図ＮＯでサブリストするためのインデックスキー
			MCIndexKey yieldKey = up2().createIndex(ReExp_Sprt03_DtlYieldR.$oper_inst_no);
			MCIndexKey inptKey = up3().createIndex(ReExp_Sprt01_DtlInptR.$oper_inst_no);
			MCIndexKey byProdKey = up4().createIndex(ReExp_Sprt01_DtlByProdR.$oper_inst_no);
			MCIndexKey wkKey = up5().createIndex(ReExp_Sprt02_DtlWkR.$oper_inst_no);

			// 設定した紐付けＮＯを各コンテナに紐付け
			for (ReExp_Sprt06_HdrR hdrR : up0()) {
				MCList<ReExp_Sprt06_DtlOperR> operL = up1().subList(operKey, hdrR.peg_no());
				
				for (ReExp_Sprt06_DtlOperR operR : operL) {
					MCList<ReExp_Sprt03_DtlYieldR> yieldL = up2().subList(yieldKey, operR.oper_inst_no());
					MCList<ReExp_Sprt01_DtlInptR> inptL = up3().subList(inptKey, operR.oper_inst_no());
					MCList<ReExp_Sprt01_DtlByProdR> byProdL = up4().subList(byProdKey, operR.oper_inst_no());
					MCList<ReExp_Sprt02_DtlWkR> wkL = up5().subList(wkKey, operR.oper_inst_no());
					
					yieldL.setNumber(ReExp_Sprt03_RsltYieldR.$hdr_peg_no, operR.peg_no());
					inptL.setNumber(ReExp_Sprt01_RsltInptR.$hdr_peg_no, operR.peg_no());
					byProdL.setNumber(ReExp_Sprt01_RsltByProdR.$hdr_peg_no, operR.peg_no());
					wkL.setNumber(ReExp_Sprt02_RsltWkR.$hdr_peg_no, operR.peg_no());
				}
			}
		}
		
		/**
		 * 構成展開オペレーションを実行する。
		 */
		protected void callReExpSprt01() {
			// 品目情報をup0、工程情報をup1から取得し、Sprt01構成展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。
			// Sprt04と異なり、工程情報は対象工程のみ処理対象とする。（up1()には画面処理で再展開対象の一覧のみが格納されている）
			
			// 品目情報に対するループ
			MCIndexKey idxKey = up1().createIndex(ReExp_Sprt06_DtlOperR.$hdr_peg_no);
			for (ReExp_Sprt06_HdrR itmR : up0()) {

				// 紐付けＮＯで工程情報を抽出
				MCList<ReExp_Sprt06_DtlOperR> operL = up1().subList(idxKey, itmR.peg_no());
				for (ReExp_Sprt06_DtlOperR operR : operL) {
					
					ReExp_Sprt01_HdrR upR = so01.up0().createRow();
					upR.setAttributes(itmR);
					upR.hdr_peg_no(operR.hdr_peg_no());
					upR.oper_peg_no(operR.peg_no());
					upR.mfg_inst_no(itmR.mfg_inst_no());
					upR.oper_inst_no(operR.oper_inst_no());
					upR.itm_cd(itmR.itm_cd());
					upR.itm_sub1(itmR.itm_sub1());
					upR.itm_sub2(itmR.itm_sub2());
					upR.itm_sub3(itmR.itm_sub3());
					upR.mfg_loc_cd(itmR.mfg_loc_cd());
					upR.bom_ptn(itmR.bom_ptn());
					upR.oper_cd(operR.oper_cd());
					upR.oper_seq(operR.oper_seq());
					upR.oper_inst_qty(operR.oper_inst_qty());
					upR.oper_loc_cd(operR.oper_loc_cd());
					upR.mfg_st_schd_dt(itmR.mfg_st_schd_dt());
					upR.st_schd_dt(operR.st_schd_tm());
					upR.end_schd_dt(operR.end_schd_tm());
					upR.sno1(itmR.sno1());
					upR.sno2(itmR.sno2());
					upR.sno3(itmR.sno3());
					upR.sno4(itmR.sno4());
					upR.cur_cd(itmR.cur_cd());
					upR.oper_str_ln_cd(operR.oper_str_ln_cd());
					upR.oper_str_ln_nm(operR.oper_str_ln_nm());
					upR.oper_str_ln_cd_none_flg(operR.oper_str_ln_cd_none_flg());
					upR.strg_loc_cd(itmR.strg_loc_cd());
					upR.strg_str_ln_cd(itmR.strg_str_ln_cd());
					upR.strg_str_ln_nm(itmR.strg_str_ln_nm());
					upR.strg_str_ln_cd_none_flg(itmR.strg_str_ln_cd_none_flg());

					so01.up0().add(upR);
				}
			}
			mapUpContainers(RE1);
			so01.exec();
			mapDownContainers(RE1);
		}
		
		/**
		 * 工数展開オペレーションを実行する。
		 */
		protected void callReExpSprt02() {
			// 品目情報をup0、工程情報をup1から取得し、Sprt02工数展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。

			// Sprt04と異なり、工程情報は対象工程のみ処理対象とする。
			MCList<ReExp_Sprt06_DtlOperR> tgtOperL = up1().subList(ReExp_Sprt06_DtlOperR.$tgt_oper_flg, true);

			// 品目情報に対するループ
			MCIndexKey idxKey = tgtOperL.createIndex(ReExp_Sprt06_DtlOperR.$hdr_peg_no);
			for (ReExp_Sprt06_HdrR itmR : up0()) {

				// 紐付けＮＯで工程情報を抽出
				MCList<ReExp_Sprt06_DtlOperR> operL = tgtOperL.subList(idxKey, itmR.peg_no());
				for (ReExp_Sprt06_DtlOperR operR : operL) {
					
					ReExp_Sprt02_HdrR upR = so02.up0().createRow();
					upR.setAttributes(itmR);
					upR.hdr_peg_no(operR.hdr_peg_no());
					upR.oper_peg_no(operR.peg_no());
					upR.itm_cd(itmR.itm_cd());
					upR.mfg_inst_no(itmR.mfg_inst_no());
					upR.oper_inst_no(operR.oper_inst_no());
					upR.itm_cd(itmR.itm_cd());
					upR.itm_sub1(itmR.itm_sub1());
					upR.itm_sub2(itmR.itm_sub2());
					upR.itm_sub3(itmR.itm_sub3());
					upR.mfg_loc_cd(itmR.mfg_loc_cd());
					upR.oper_ptn(operR.oper_ptn());
					upR.oper_cd(operR.oper_cd());
					upR.oper_seq(operR.oper_seq());
					upR.oper_inst_qty(operR.oper_inst_qty());
					upR.mfg_st_schd_dt(itmR.mfg_st_schd_dt());

					so02.up0().add(upR);
				}
				mapUpContainers(RE2);
				so02.exec();
				mapDownContainers(RE2);
			}
		}

		/**
		 * 出来高予定作成オペレーションを実行する。
		 */
		protected void callReExpSprt03() {
			mapUpContainers(RE3);
			so03.exec();
			mapDownContainers(RE3);
		}
	}

	//FMCB CUSTOM END
}