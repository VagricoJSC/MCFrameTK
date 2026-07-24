package mcframe.serverMSLA.MSLAL5060;

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
import static mcframe.serverMSLA.MSLAL5060.Query.*;
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverPFUD.PFUDL0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_AccptSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_AccptSendIfService_MC extends MSLAL_AccptSendIfService_MC_A{
	//FMCB CUSTOM START
	/** 検収送信対象のリスト */
	protected MCList<MST_ACCPT_SEND_IF_R> _accptSendIfL = MCList.create(MST_ACCPT_SEND_IF_R.class);
	/** 納入場所 */
	protected static final String IN_TO_LOC_CD = "in_to_loc_cd";
	/** マスタ比較基準日 */
	protected static final String BASE_DT = "base_dt";
	/** 仕入実績明細連番 */
	protected static final String PURC_ACT_D_SEQ = "purc_act_d_seq";
	
	/**
	 * AccptSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の検収情報をＩＦテーブルに書き込む<br>
	 */
	public class AccptSendIf_Upd01 extends MSLAL_AccptSendIfService_MC_A.AccptSendIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 初期処理
			initProc();
			// 検収情報の取得
			srchSendInfo();
			// 検収送信ＩＦの作成
			createSendInfo();
			//　ＥＳＢ送受信ＩＦ作成 
			callESBSendCtrl();
			registAttachedFormSrv();
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			//　検索結果格納準備
			_accptSendIfL.addStringColumn(IN_TO_LOC_CD);
			_accptSendIfL.addDateColumn(BASE_DT);
			_accptSendIfL.addNumberColumn(PURC_ACT_D_SEQ);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_cd);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_nm);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_zip_cd);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_addr1);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_addr2);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_addr3);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_addr4);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_cntct_dpt);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_cntct_psn);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_tel);
			_accptSendIfL.addStringColumn(MST_PO_D_R.$dlv_fax);
			_accptSendIfL.addStringColumn(MAM_BP_R.$prnt_lcl_cd);
			_accptSendIfL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			// 送信対象の絞り込み
			getTrgtL();
			// ワークを作成
			insWk();
		}
		/**
		 * 送信対象の絞り込み（上り電文から送信対象外を取り除く）
		 */
		protected void getTrgtL() {
			// ＥＤＩ制御マスタとの比較条件が上ってこなかった場合は補完する
			MCList<AccptSendIf_Upd01_DtlR> subL = up0().subList(new MCRowMatcher<AccptSendIf_Upd01_DtlR>() {
				@Override
				public boolean match(AccptSendIf_Upd01_DtlR row) {
					if (isNull(row.sppl_cd())) {
						return true;
					}
					else if (isNull(row.purc_dt())) {
						return true;
					}
					return false;
				}
			});
			FXUCL_MCDbcCache<MST_PURC_ACT_R> cachePurcActL = new FXUCL_MCDbcCache<MST_PURC_ACT_R>(
				MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), subL, AccptSendIf_Upd01_DtlR.$purc_act_no, AccptSendIf_Upd01_DtlR.$purc_act_seq);
			for (AccptSendIf_Upd01_DtlR r : subL) {
				MST_PURC_ACT_R purcActR = cachePurcActL.get(r.purc_act_no(), r.purc_act_seq());
				if (isNull(r.purc_dt())) {
					r.purc_dt(purcActR.purc_dt());
				}
				if (isNull(r.sppl_cd())) {
					r.sppl_cd(purcActR.sppl_cd());	
				}
			}
			
			up0().addStringColumn("if_proc_typ", MAC_IF_PROC_TYP.ACCPT_SEND.value());
			
			FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R> cacheEdiCtlL = new FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R>(
				MCQueryApiBuilder.create(MAM_EDI_IF_CTL_R.create("T")), up0(), AccptSendIf_Upd01_DtlR.$sppl_cd, "if_proc_typ");
			
			MCList<AccptSendIf_Upd01_DtlR> trgtL = MCList.create(AccptSendIf_Upd01_DtlR.class); 
			
			for (MCList<AccptSendIf_Upd01_DtlR> grpL : up0().groupList(AccptSendIf_Upd01_DtlR.$purc_act_no)) {
				AccptSendIf_Upd01_DtlR baseR = grpL.get(0);
				
				// マスタを参照し送信対象であるかを判定
				MAM_EDI_IF_CTL_R ediCtrlR = cacheEdiCtlL.get(baseR.purc_dt(), baseR.sppl_cd(), MAC_IF_PROC_TYP.ACCPT_SEND.value());
				if (!ediCtrlR.isEmpty() && !ediCtrlR.del_flg()) {
					trgtL.addAll(grpL);
				}
			}
			
			// 送信対象外を除外
			up0().setAll(trgtL);
		}
		
		/**
		 * ワークの作成
		 * 上り電文をワークに登録する
		 */
		protected void insWk() {
			MCList<MST_PURC_ACT_R> wkL = MCList.create(MST_PURC_ACT_R.class);
			MCList<AccptSendIf_Upd01_DtlR> tmpL = up0().groupBy(AccptSendIf_Upd01_DtlR.$purc_act_no, AccptSendIf_Upd01_DtlR.$purc_act_seq);
			for (AccptSendIf_Upd01_DtlR r : tmpL) {
				MST_PURC_ACT_R wkR = MST_PURC_ACT_R.create();
				wkR.purc_act_no(r.purc_act_no());
				wkR.purc_act_seq(r.purc_act_seq());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T"));
			dbWkDelete("MSLAL5060_MSW_PURC_ACT_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5060_MSW_PURC_ACT_I01", wkL, wkL_bldr.getBaseDbc());
		}
		
		/**
		 * 検収情報の取得
		 */
		protected void srchSendInfo() { 
			// 未着仕入後の入荷情報も取得したいため、仕入実績受払の粒度で仕入情報を取得
			executeQuery(_accptSendIfL, MSLAL5060_MST_PURC_ACT_S01());
			// 粒度を仕入実績明細にする
			bndl();
			// パフォーマンスのため、マスタ情報はＤＢコンテナで補完する
			cmpl();
		}
		
		/**
		 * 送信情報の粒度を仕入実績明細にする
		 */
		protected void bndl() {
			MCList<MST_ACCPT_SEND_IF_R> ifL = MCList.create(MST_ACCPT_SEND_IF_R.class);
			for(MCList<MST_ACCPT_SEND_IF_R> grpL : _accptSendIfL.groupList(MST_ACCPT_SEND_IF_R.$purc_act_d_no)) {
				MCSortPolicy p = new MCSortPolicy();
				p.add(SortType.DESC, MST_ACCPT_SEND_IF_R.$purc_act_rev);
				grpL.sort(p);
				MST_ACCPT_SEND_IF_R baseR = grpL.get(0);
				int cnt = grpL.size();
				// 場所
				if (!isSame(cnt, grpL.subList(IN_TO_LOC_CD, baseR.getStringNE(IN_TO_LOC_CD)).size())) {
					baseR.setStringNE(IN_TO_LOC_CD, null);
				}
				//　業者ロットＮＯ 
				if (!isSame(cnt, grpL.subList(MST_ACCPT_SEND_IF_R.$bp_lot_no, baseR.bp_lot_no()).size())) {
					baseR.bp_lot_no(null);
				}
				// 業者納品書ＮＯ
				if (!isSame(cnt, grpL.subList(MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no, baseR.bp_dlv_slip_no()).size())) {
					baseR.bp_dlv_slip_no(null);
				}
				// 業者納品書明細ＮＯ
				if (!isSame(cnt, grpL.subList(MST_ACCPT_SEND_IF_R.$bp_dlv_slip_lno, baseR.bp_dlv_slip_lno()).size())) {
					baseR.bp_dlv_slip_lno(null);
				}
				if (!isNull(baseR.po_d_no()) || !isNull(baseR.bp_dlv_slip_no())) {
					ifL.add(baseR);
				}
			}
			_accptSendIfL.setAll(ifL);
		}
		
		/**
		 * マスタ情報を補完する
		 */
		protected void cmpl() {
			// キャッシュ作成
			createCache();
			// 場所住所の補完
			cmplInToIdAddr();
			// 補完処理
			for (MST_ACCPT_SEND_IF_R r : _accptSendIfL) {
				// 場所の補完
				cmplInToIdInfo(r);
				// 工場・物流倉庫の補完
				cmplSiteInfo(r);
				// 直送先の補完
				cmplDrctDlvInfo(r);
				// 税情報の補完
				cmplTaxInfo(r);
				// 品名の補完
				cmplItmInfo(r);
				// その他の補完
				cmplOtherInfo(r);
			}
		}
		
		/**
		 * 場所情報の補完
		 * @param r
		 */
		protected void cmplInToIdInfo(MST_ACCPT_SEND_IF_R r) {
			String prntLclCd = r.getStringNE(MAM_BP_R.$prnt_lcl_cd);
			String inToLocCd = r.getStringNE(IN_TO_LOC_CD);
			String dlvCd = r.getStringNE(MST_PO_D_R.$dlv_cd);
			String tdlvCd = r.getStringNE(MST_PO_D_R.$tdlv_cd);
			
			MAM_LOC_R locR = _cacheLoc.get(inToLocCd);
			r.in_to_cntry_cd(locR.cntry_cd());
			
			if (isNull(dlvCd)) {
				// 仕入直送でない場合
				r.in_to_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
				r.in_to_id_cd(inToLocCd);
				MAM_LOC_LCL_R locLclR = _cacheLocLcl.get(inToLocCd, prntLclCd);
				if (!isNull(locLclR.loc_nm())) {
					r.in_to_nm(locLclR.loc_nm());	
				}
				else {
					r.in_to_nm(locR.loc_nm());	
				}
			}
			else {
				// 仕入直送の場合
				r.in_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());
				r.in_to_id_cd(dlvCd);
				String dlvNm = r.getStringNE(MST_PO_D_R.$dlv_nm);
				MAM_BP_R dlvR = _cacheBp.get(dlvCd);
				if (isNull(dlvNm)) {
					if (isNull(prntLclCd)) {
						r.in_to_nm(dlvR.bp_nm());	
					}
					else {
						MAM_BP_LCL_R dlvLclR = _cacheBpLcl.get(dlvCd, prntLclCd);
						r.in_to_nm(dlvLclR.bp_nm());
					}
				}
				else {
					r.in_to_nm(dlvNm);
				}
				r.in_to_cntry_cd(dlvR.cntry_cd());
				r.in_to_zip_cd(r.getStringNE(MST_PO_D_R.$dlv_zip_cd));
				r.in_to_addr1(r.getStringNE(MST_PO_D_R.$dlv_addr1));
				r.in_to_addr2(r.getStringNE(MST_PO_D_R.$dlv_addr2));
				r.in_to_addr3(r.getStringNE(MST_PO_D_R.$dlv_addr3));
				r.in_to_addr4(r.getStringNE(MST_PO_D_R.$dlv_addr4));
				r.in_to_cntct_dpt(r.getStringNE(MST_PO_D_R.$dlv_cntct_dpt));
				r.in_to_cntct_psn(r.getStringNE(MST_PO_D_R.$dlv_cntct_psn));
				r.in_to_tel(r.getStringNE(MST_PO_D_R.$dlv_tel));
				r.in_to_fax(r.getStringNE(MST_PO_D_R.$dlv_fax));
				MAM_BP_R tdlvR = _cacheBp.get(tdlvCd);
				MAM_BP_LCL_R tdlvLclR = _cacheBpLcl.get(tdlvCd, prntLclCd);
				if (isNull(r.tdlv_nm())) {
					if (!isNull(tdlvLclR.bp_nm())) {
						r.tdlv_nm(tdlvLclR.bp_nm());
					}
					else {
						r.tdlv_nm(tdlvR.bp_nm());
					}
				}
				r.tdlv_cntry_cd(tdlvR.cntry_cd());
			}
		}
		
		/**
		 * 工場物流倉庫の保管
		 * @param r
		 */
		protected void cmplSiteInfo(MST_ACCPT_SEND_IF_R r) {
			String prntLclCd = r.getStringNE(MAM_BP_R.$prnt_lcl_cd);
			String inToLocCd = r.getStringNE(IN_TO_LOC_CD);
			
			MAM_LOC_R locR = _cacheLoc.get(inToLocCd);
			r.site_cd(locR.site_cd());
			MAM_SITE_LCL_R siteLclR = _cacheSiteLcl.get(locR.site_cd(), prntLclCd);
			if (!isNull(siteLclR.site_nm())) {
				r.site_nm(siteLclR.site_nm());
			}
			else {
				MAM_SITE_R siteR = _cacheSite.get(locR.site_cd());
				r.site_nm(siteR.site_nm());
			}
		}
		
		/**
		 * 直送先の補完
		 * @param r
		 */
		protected void cmplDrctDlvInfo(MST_ACCPT_SEND_IF_R r) {
			String prntLclCd = r.getStringNE(MAM_BP_R.$prnt_lcl_cd);
			String inToLocCd = r.getStringNE(IN_TO_LOC_CD);
			
			MAM_LOC_R locR = _cacheLoc.get(inToLocCd);
			if (!isNull(locR.sppl_cd()) || MSC_SHIP_TO_ID_TYP.isDLV(r.in_to_id_typ())) {
				// 納入場所が直送であるか、仕入直送の場合
				r.drct_dlv_flg(true);
			}
			else {
				r.drct_dlv_flg(false);
			}
			
			if (!isNull(locR.sppl_cd())) {
				// 納入場所が直送の場合
				r.drct_dlv_flg(true);
				r.drct_dlv_bp_cd(locR.sppl_cd());
				
				MAM_BP_R bpR = _cacheBp.get(locR.sppl_cd());
				r.drct_dlv_cntry_cd(bpR.cntry_cd());
				MAM_BP_LCL_R bpLclR = _cacheBpLcl.get(locR.sppl_cd(), prntLclCd);
				if (!isNull(bpLclR.bp_nm())) {
					r.drct_dlv_bp_nm(bpLclR.bp_nm());
				}
				else {
					r.drct_dlv_bp_nm(bpR.bp_nm());	
				}
			}
		}
		
		/**
		 * 税情報補完
		 * @param r
		 */
		protected void cmplTaxInfo (MST_ACCPT_SEND_IF_R r) {
			String prntLclCd = r.getStringNE(MAM_BP_R.$prnt_lcl_cd);
			
			MAM_TAX_R taxR = _cacheTax.get(r.tax_cd());
			r.tax_typ(taxR.tax_typ());
			r.tax_rate(taxR.tax_rate());
			r.inc_tax_flg(taxR.inc_tax_flg());
			MAM_TAX_LCL_R taxLclR = _cacheTaxLcl.get(r.tax_cd(), prntLclCd);
			if (!isNull(taxLclR.tax_nm())) {
				r.tax_nm(taxLclR.tax_nm());
			}
			else {
				r.tax_nm(taxR.tax_nm());
			}
		}
		
		/**
		 * 品目情報の補完
		 * @param r
		 */
		protected void cmplItmInfo (MST_ACCPT_SEND_IF_R r) {
			String prntLclCd = r.getStringNE(MAM_BP_R.$prnt_lcl_cd);
			MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAM_ITM_LCL_R itmLclR = _cacheItmLcl.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), prntLclCd);
			if (!r.sundry_itm_flg()) {
				// 諸口品でない場合はマスタから補完
				if (!isNull(itmLclR.itm_nm())) {
					r.itm_nm(itmLclR.itm_nm());
				}
				else {
					r.itm_nm(itmR.itm_nm());
				}

				if (r.iv_flg()) {
					r.iv_itm_nm(r.itm_nm());	
				}
			}
		}
		
		/**
		 * その他補完
		 */
		protected void cmplOtherInfo (MST_ACCPT_SEND_IF_R r) {
			String prntLclCd = r.getStringNE(MAM_BP_R.$prnt_lcl_cd);
			// 会社情報の設定
			r.cntry_cd(getCo().cntry_cd());
			
			// WG
			MAM_DPT_R dptR = _cacheDpt.get(r.purc_dt(), r.purc_dpt_cd());
			r.wg_cd(dptR.wg_cd());
			
			// 名称補完
			MAM_DPT_LCL_R dptLclR = _cacheDptLcl.get(r.purc_dt(), r.purc_dpt_cd(), prntLclCd);	
			MAM_USR_LCL_R usrLclR = _cacheUsrLcl.get(r.purc_usr_cd(), prntLclCd);
			MAM_TTERM_LCL_R tterm1LclR = _cacheTtermLcl.get(r.tterm_cd1(), prntLclCd);
			MAM_TTERM_LCL_R tterm2LclR = _cacheTtermLcl.get(r.tterm_cd2(), prntLclCd);
			MAM_TTERM_LCL_R tterm3LclR = _cacheTtermLcl.get(r.tterm_cd3(), prntLclCd);
			MAM_UNIT_LCL_R unitLclR = _cacheUnitLcl.get(r.trd_unit_cd(), prntLclCd);
			MAM_BIZ_RSN_LCL_R bizRsnLclR = _cacheBizRsnLcl.get(r.dscnt_rsn_cd(), prntLclCd);
			
			if (!isNull(dptLclR.dpt_nm())) {
				r.purc_dpt_nm(dptLclR.dpt_nm());
			}
			else {
				r.purc_dpt_nm(dptR.dpt_nm());
			}
			
			if (!isNull(usrLclR.usr_nm())) {
				r.purc_usr_nm(usrLclR.usr_nm());
			}
			else {
				MAM_USR_R usrR = _cacheUsr.get(r.purc_usr_cd());
				r.purc_usr_nm(usrR.usr_nm());
			}
			
			if (!isNull(tterm1LclR.tterm_nm())) {
				r.tterm_nm1(tterm1LclR.tterm_nm());
			}
			else {
				MAM_TTERM_R tterm1R = _cacheTterm.get(r.tterm_cd1());
				r.tterm_nm1(tterm1R.tterm_nm());
			}
			
			if (!isNull(tterm2LclR.tterm_nm())) {
				r.tterm_nm2(tterm2LclR.tterm_nm());
			}
			else {
				MAM_TTERM_R tterm2R = _cacheTterm.get(r.tterm_cd2());
				r.tterm_nm2(tterm2R.tterm_nm());
			}
			
			if (!isNull(tterm3LclR.tterm_nm())) {
				r.tterm_nm3(tterm3LclR.tterm_nm());
			}
			else {
				MAM_TTERM_R tterm3R = _cacheTterm.get(r.tterm_cd3());
				r.tterm_nm3(tterm3R.tterm_nm());
			}
			
			if (!isNull(unitLclR.unit_nm())) {
				r.trd_unit_nm(unitLclR.unit_nm());
			}
			else {
				MAM_UNIT_R unitR = _cacheUnit.get(r.trd_unit_cd());
				r.trd_unit_nm(unitR.unit_nm());
			}
			
			if (!isNull(bizRsnLclR.biz_rsn_nm())) {
				r.dscnt_rsn_nm(bizRsnLclR.biz_rsn_nm());
			}
			else {
				MAM_BIZ_RSN_R bizRsnR = _cacheBizRsn.get(r.dscnt_rsn_cd());
				r.dscnt_rsn_nm(bizRsnR.biz_rsn_nm());
			}
			
			// null補完
			convNullValToNull(r);
		}
		
		/**
		 * null補完
		 * @param r
		 */
		protected void convNullValToNull(MST_ACCPT_SEND_IF_R r) {
			if (!r.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg)) {
				r.itm_sub1(nullValToNull(r.itm_sub1()));
				r.itm_sub2(nullValToNull(r.itm_sub2()));
				r.itm_sub3(nullValToNull(r.itm_sub3()));
				r.sno1(nullValToNull(r.sno1()));
				r.sno2(nullValToNull(r.sno2()));
				r.sno3(nullValToNull(r.sno3()));
				r.sno4(nullValToNull(r.sno4()));
			}
		}

		/**
		 * キャッシュ作成
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_LCL_R> _cacheDptLcl;
		protected FXUCL_MCDbcCache<MAM_USR_R> _cacheUsr;
		protected FXUCL_MCDbcCache<MAM_USR_LCL_R> _cacheUsrLcl;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;
		protected FXUCL_MCDbcCache<MAM_LOC_LCL_R> _cacheLocLcl;
		protected FXUCL_MCDbcCache<MAM_SITE_R> _cacheSite;
		protected FXUCL_MCDbcCache<MAM_SITE_LCL_R> _cacheSiteLcl;
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCache<MAM_BP_LCL_R> _cacheBpLcl;
		protected FXUCL_MCDbcCache<MAM_TTERM_R> _cacheTterm;
		protected FXUCL_MCDbcCache<MAM_TTERM_LCL_R> _cacheTtermLcl;
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl;
		protected FXUCL_MCDbcCache<MAM_UNIT_R> _cacheUnit;
		protected FXUCL_MCDbcCache<MAM_UNIT_LCL_R> _cacheUnitLcl;
		protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _cacheBizRsn;
		protected FXUCL_MCDbcCache<MAM_BIZ_RSN_LCL_R> _cacheBizRsnLcl;
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax;
		protected FXUCL_MCDbcCache<MAM_TAX_LCL_R> _cacheTaxLcl;
		protected void createCache() {
			// 部門
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$purc_dpt_cd);
			_cacheDptLcl = new FXUCL_MCDbcCacheStEnd<MAM_DPT_LCL_R>(MCQueryApiBuilder.create(MAM_DPT_LCL_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$purc_dpt_cd, MAM_BP_R.$prnt_lcl_cd);
			
			// 担当者
			_cacheUsr = new FXUCL_MCDbcCache<MAM_USR_R>(MCQueryApiBuilder.create(MAM_USR_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$purc_usr_cd);
			_cacheUsrLcl = new FXUCL_MCDbcCache<MAM_USR_LCL_R>(MCQueryApiBuilder.create(MAM_USR_LCL_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$purc_usr_cd, MAM_BP_R.$prnt_lcl_cd);
			
			// 場所
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(locL, MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
					_accptSendIfL, IN_TO_LOC_CD);
			_cacheLocLcl = new FXUCL_MCDbcCache<MAM_LOC_LCL_R>(MCQueryApiBuilder.create(MAM_LOC_LCL_R.create("T")),
					_accptSendIfL, IN_TO_LOC_CD, MAM_BP_R.$prnt_lcl_cd);
			
			// 工場・物流倉庫
			_cacheSite = new FXUCL_MCDbcCache<MAM_SITE_R>(MCQueryApiBuilder.create(MAM_SITE_R.create("T")),
					locL, MAM_LOC_R.$site_cd);
			_cacheSiteLcl = new FXUCL_MCDbcCache<MAM_SITE_LCL_R>(MCQueryApiBuilder.create(MAM_SITE_LCL_R.create("T")),
					locL, MAM_LOC_R.$site_cd, MAM_LOC_R.$prnt_lcl_cd);
			
			MCList<MAM_BP_R> bpBindL = MCList.create(MAM_BP_R.class);
			MCList<MAM_BP_LCL_R> bpLclBindL = MCList.create(MAM_BP_LCL_R.class);
			MCList<MAM_TTERM_R> ttermBindL = MCList.create(MAM_TTERM_R.class);
			MCList<MAM_TTERM_LCL_R> ttermLclBindL = MCList.create(MAM_TTERM_LCL_R.class);
			for (MST_ACCPT_SEND_IF_R accptSendIfR: _accptSendIfL) {
				MAM_BP_R bpR1 = MAM_BP_R.create();
				bpR1.bp_cd(accptSendIfR.sppl_cd());
				bpBindL.add(bpR1);
				
				MAM_BP_R bpR2 = MAM_BP_R.create();
				bpR2.bp_cd(accptSendIfR.getStringNE(MST_PO_D_R.$dlv_cd));
				bpBindL.add(bpR2);
				
				MAM_BP_R bpR3 = MAM_BP_R.create();
				bpR3.bp_cd(accptSendIfR.tdlv_cd());
				bpBindL.add(bpR3);

				MAM_BP_LCL_R bpLclR1 = MAM_BP_LCL_R.create();
				bpLclR1.bp_cd(accptSendIfR.getStringNE(MST_PO_D_R.$dlv_cd));
				bpLclR1.lcl_cd(accptSendIfR.getStringNE(MAM_BP_R.$prnt_lcl_cd));
				bpLclBindL.add(bpLclR1);
				
				MAM_BP_LCL_R bpLclR2 = MAM_BP_LCL_R.create();
				bpLclR2.bp_cd(accptSendIfR.tdlv_cd());
				bpLclR2.lcl_cd(accptSendIfR.getStringNE(MAM_BP_R.$prnt_lcl_cd));
				bpLclBindL.add(bpLclR2);

				MAM_TTERM_R ttermR1 = MAM_TTERM_R.create();
				ttermR1.tterm_cd(accptSendIfR.tterm_cd1());
				ttermBindL.add(ttermR1);
				
				MAM_TTERM_R ttermR2 = MAM_TTERM_R.create();
				ttermR2.tterm_cd(accptSendIfR.tterm_cd2());
				ttermBindL.add(ttermR2);

				MAM_TTERM_R ttermR3 = MAM_TTERM_R.create();
				ttermR3.tterm_cd(accptSendIfR.tterm_cd3());
				ttermBindL.add(ttermR3);
				
				MAM_TTERM_LCL_R ttermLclR1 = MAM_TTERM_LCL_R.create();
				ttermLclR1.tterm_cd(accptSendIfR.tterm_cd1());
				ttermLclR1.lcl_cd(accptSendIfR.getStringNE(MAM_BP_R.$prnt_lcl_cd));
				ttermLclBindL.add(ttermLclR1);
				
				MAM_TTERM_LCL_R ttermLclR2 = MAM_TTERM_LCL_R.create();
				ttermLclR1.tterm_cd(accptSendIfR.tterm_cd2());
				ttermLclR2.lcl_cd(accptSendIfR.getStringNE(MAM_BP_R.$prnt_lcl_cd));
				ttermLclBindL.add(ttermLclR2);

				MAM_TTERM_LCL_R ttermLclR3 = MAM_TTERM_LCL_R.create();
				ttermLclR1.tterm_cd(accptSendIfR.tterm_cd3());
				ttermLclR3.lcl_cd(accptSendIfR.getStringNE(MAM_BP_R.$prnt_lcl_cd));
				ttermLclBindL.add(ttermLclR3);
			}
			for (MAM_LOC_R locR: locL) {
				MAM_BP_LCL_R r = MAM_BP_LCL_R.create();
				r.bp_cd(locR.sppl_cd());
				r.lcl_cd(locR.prnt_lcl_cd());
				bpLclBindL.add(r);
			}
			// 取引先
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					bpBindL, MAM_BP_R.$bp_cd);
			_cacheBpLcl = new FXUCL_MCDbcCache<MAM_BP_LCL_R>(MCQueryApiBuilder.create(MAM_BP_LCL_R.create("T")),
					bpLclBindL, MAM_BP_LCL_R.$bp_cd, MAM_BP_LCL_R.$lcl_cd);
			
			// 取引条件
			_cacheTterm = new FXUCL_MCDbcCache<MAM_TTERM_R>(MCQueryApiBuilder.create(MAM_TTERM_R.create("T")),
					ttermBindL, MAM_TTERM_R.$tterm_cd);
			_cacheTtermLcl = new FXUCL_MCDbcCache<MAM_TTERM_LCL_R>(MCQueryApiBuilder.create(MAM_TTERM_LCL_R.create("T")),
					ttermLclBindL, MAM_TTERM_LCL_R.$tterm_cd, MAM_TTERM_LCL_R.$lcl_cd);
			
			// 品目
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$itm_cd, MST_ACCPT_SEND_IF_R.$itm_sub1, MST_ACCPT_SEND_IF_R.$itm_sub2, MST_ACCPT_SEND_IF_R.$itm_sub3);
			_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(MCQueryApiBuilder.create(MAM_ITM_LCL_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$itm_cd, MST_ACCPT_SEND_IF_R.$itm_sub1, MST_ACCPT_SEND_IF_R.$itm_sub2, MST_ACCPT_SEND_IF_R.$itm_sub3, MAM_BP_R.$prnt_lcl_cd);
			
			// 単位
			_cacheUnit = new FXUCL_MCDbcCache<MAM_UNIT_R>(MCQueryApiBuilder.create(MAM_UNIT_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$trd_unit_cd);
			_cacheUnitLcl = new FXUCL_MCDbcCache<MAM_UNIT_LCL_R>(MCQueryApiBuilder.create(MAM_UNIT_LCL_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$trd_unit_cd, MAM_BP_R.$prnt_lcl_cd);
			
			// 業務理由
			_cacheBizRsn = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(MCQueryApiBuilder.create(MAM_BIZ_RSN_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$dscnt_rsn_cd);
			_cacheBizRsnLcl = new FXUCL_MCDbcCache<MAM_BIZ_RSN_LCL_R>(MCQueryApiBuilder.create(MAM_BIZ_RSN_LCL_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$dscnt_rsn_cd, MAM_BP_R.$prnt_lcl_cd);
			
			// 税
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$tax_cd);
			_cacheTaxLcl = new FXUCL_MCDbcCache<MAM_TAX_LCL_R>(MCQueryApiBuilder.create(MAM_TAX_LCL_R.create("T")),
					_accptSendIfL, MST_ACCPT_SEND_IF_R.$tax_cd, MAM_BP_R.$prnt_lcl_cd);
		}
		
		/**
		 * 納入場所住所の補完
		 */
		protected void cmplInToIdAddr() {
			String locAddrTypAddr1 = "loc_addr_typ_addr1";
			String locAddrTypAddr2 = "loc_addr_typ_addr2";
			String locAddrTypAddr3 = "loc_addr_typ_addr3";
			String locAddrTypAddr4 = "loc_addr_typ_addr4";
			String locAddrTypTel = "loc_addr_typ_tel";
			String locAddrTypFax = "loc_addr_typ_fax";
			
			_accptSendIfL.addStringColumn(locAddrTypAddr1, MAC_LOC_ADDR_TYP.ADDR1.value());
			_accptSendIfL.addStringColumn(locAddrTypAddr2, MAC_LOC_ADDR_TYP.ADDR2.value());
			_accptSendIfL.addStringColumn(locAddrTypAddr3, MAC_LOC_ADDR_TYP.ADDR3.value());
			_accptSendIfL.addStringColumn(locAddrTypAddr4, MAC_LOC_ADDR_TYP.ADDR4.value());
			_accptSendIfL.addStringColumn(locAddrTypTel, MAC_LOC_ADDR_TYP.TEL.value());
			_accptSendIfL.addStringColumn(locAddrTypFax, MAC_LOC_ADDR_TYP.FAX.value());
			
			MCList<MST_ACCPT_SEND_IF_R> tmpL = _accptSendIfL.subList(MST_PO_D_R.$dlv_cd, null);
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "01"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR"), MST_ACCPT_SEND_IF_R.$in_to_addr1, tmpL, IN_TO_LOC_CD, BASE_DT, locAddrTypAddr1, MAM_BP_R.$prnt_lcl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "02"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR"), MST_ACCPT_SEND_IF_R.$in_to_addr2, tmpL, IN_TO_LOC_CD, BASE_DT, locAddrTypAddr2, MAM_BP_R.$prnt_lcl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "03"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR"), MST_ACCPT_SEND_IF_R.$in_to_addr3, tmpL, IN_TO_LOC_CD, BASE_DT, locAddrTypAddr3, MAM_BP_R.$prnt_lcl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "04"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR"), MST_ACCPT_SEND_IF_R.$in_to_addr4, tmpL, IN_TO_LOC_CD, BASE_DT, locAddrTypAddr4, MAM_BP_R.$prnt_lcl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "05"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR"), MST_ACCPT_SEND_IF_R.$in_to_tel, tmpL, IN_TO_LOC_CD, BASE_DT, locAddrTypTel, MAM_BP_R.$prnt_lcl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_LOC_ADDR", "06"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_LOC_ADDR"), MST_ACCPT_SEND_IF_R.$in_to_fax, tmpL, IN_TO_LOC_CD, BASE_DT, locAddrTypFax, MAM_BP_R.$prnt_lcl_cd);
		}
		
		/**
		 * 検収送信ＩＦの作成
		 */
		protected void createSendInfo() {
			// データ更新区分の判定
			editDataCrudTyp();
			// データの加工
			editData();
			// 登録
			MCQueryApiBuilder accptSendIfL_bldr = MCQueryApiBuilder.create(MST_ACCPT_SEND_IF_R.create("T"));
			dbInsert("MSLAL5060_MST_ACCPT_SEND_IF_I01", _accptSendIfL, accptSendIfL_bldr);
		}
		
		/**
		 * データ更新区分の判定
		 */
		protected void editDataCrudTyp() {
			// 更新対象取得用インデックス
			MCIndexKey idxIfL = _accptSendIfL.createIndex(MST_ACCPT_SEND_IF_R.$purc_act_d_no, PURC_ACT_D_SEQ);
			
			// 前回送信対象を取得する
			MCList<MST_ACCPT_SEND_IF_R> tmpL = MCList.create(MST_ACCPT_SEND_IF_R.class);
			MST_ACCPT_SEND_IF_R t = MST_ACCPT_SEND_IF_R.create("T");
			MCQueryApiBuilder tmpL_bldr = MCQueryApiBuilder.create(t);
			tmpL_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
			tmpL_bldr.addConstWhereWithAnd(
					bracket(t.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.CRT.value()))
							.or(t.data_crud_typ.eq(value(MAC_DATA_CRUD_TYP.UPD.value())))));
			dbSelect("MSLAL5060_MST_ACCPT_SEND_IF_S01", tmpL, tmpL_bldr, up0(), null);
			MCList<MST_ACCPT_SEND_IF_R> preIfL = MCList.create(MST_ACCPT_SEND_IF_R.class);
			for (MCList<MST_ACCPT_SEND_IF_R> grpL : tmpL.groupList(MST_ACCPT_SEND_IF_R.$purc_act_no)) {
				// 各ヘッダごとに、前回送信内容を取得する
				preIfL.addAll(grpL.subList(MST_ACCPT_SEND_IF_R.$purc_act_rev, grpL.max(MST_ACCPT_SEND_IF_R.$purc_act_rev)));
			}
			
			preIfL.addBooleanColumn("checked", false);
			MCIndexKey idxPreIfL1 = preIfL.createIndex(MST_ACCPT_SEND_IF_R.$purc_act_d_no);
			MCIndexKey idxPreIfL2 = preIfL.createIndex("checked");
			
			for (AccptSendIf_Upd01_DtlR r : up0()) {
				MST_ACCPT_SEND_IF_R trgtR = _accptSendIfL.getFirst(idxIfL, r.purc_act_d_no(), r.purc_act_d_seq());
				if (isNull(trgtR)) {
					continue;
				}
				MST_ACCPT_SEND_IF_R tmpR = preIfL.getFirst(idxPreIfL1, r.purc_act_d_no());
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					trgtR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					trgtR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					if (!isNull(tmpR)) {
						tmpR.setBooleanNE("checked", true);
					}
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					trgtR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					if (!isNull(tmpR)) {
						tmpR.setBooleanNE("checked", true);	
					}
				}
			}
			
			// 前回送信していた内容が、今回更新されていない場合は、前回送信した内容を取消で送信する
			MCList<MST_ACCPT_SEND_IF_R> delIfL = preIfL.subList(idxPreIfL2, false);
			delIfL.setStringNE(MST_ACCPT_SEND_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			_accptSendIfL.addAll(delIfL);
		}
		
		/**
		 * データの加工
		 */
		protected void editData() {
			MCIndexKey idxIfL = _accptSendIfL.createIndex(MST_ACCPT_SEND_IF_R.$purc_act_no);
			
			// 赤伝計上日を設定するため、前回更新した仕入実績情報を取得
			MCList<MST_PURC_ACT_R> tmpL = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder tmpL_bldr = MCQueryApiBuilder.create(t);
			tmpL_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
			tmpL_bldr.addConstWhereWithAnd(
					t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())));
			dbSelect("MSLAL5060_MST_PURC_ACT_S01", tmpL, tmpL_bldr, _accptSendIfL, null);
			// 伝票更新時は、前回の更新情報から赤伝計上日を補完し、取消時は今回の更新情報から補完するため、最後に更新された取消レコードを取得する。
			MCList<MST_PURC_ACT_R> prePurcActL = MCList.create(MST_PURC_ACT_R.class);
			for (MCList<MST_PURC_ACT_R> grpL : tmpL.groupList(MST_PURC_ACT_R.$purc_act_no)) {
				MST_PURC_ACT_R r = grpL.getFirst(MST_PURC_ACT_R.$purc_act_rev, grpL.max(MST_PURC_ACT_R.$purc_act_rev));
				prePurcActL.add(r);
			}
			
			MCIndexKey idxPrePurcActL = prePurcActL.createIndex(MST_PURC_ACT_R.$purc_act_no);
			
			// データＮＯを発番
			MCList<MST_ACCPT_SEND_IF_R>[] ivGrpL = _accptSendIfL.subList(MST_ACCPT_SEND_IF_R.$iv_flg, true).groupList(MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no);
			MCList<MST_ACCPT_SEND_IF_R>[] notIvgrpL = _accptSendIfL.subList(MST_ACCPT_SEND_IF_R.$iv_flg, false).groupList(MST_ACCPT_SEND_IF_R.$purc_act_no);
			
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, ivGrpL.length + notIvgrpL.length);
			doSeqCache(MSC_NUM_SYS_TYP.ACCPTSENDIF, _accptSendIfL.size());
			
			setDataNo(ivGrpL);
			setDataNo(notIvgrpL);
			
			for (MCList<MST_ACCPT_SEND_IF_R> grpL : _accptSendIfL.groupList(MST_ACCPT_SEND_IF_R.$purc_act_no)) {
				String purcActNo = grpL.get(0).purc_act_no();
				MST_PURC_ACT_R purcActR = prePurcActL.getFirst(idxPrePurcActL, purcActNo);
				
				for (MST_ACCPT_SEND_IF_R accptSendIfR : _accptSendIfL.subList(idxIfL, purcActNo)) {
					// データ行ＮＯの発番
					accptSendIfR.data_lno(getSequence(MSC_NUM_SYS_TYP.ACCPTSENDIF.value()));
					// ＰＧ実行状況区分の設定
					accptSendIfR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					
					if (!MAC_DATA_CRUD_TYP.isCRT(accptSendIfR.data_crud_typ())) {
						// 赤伝の補完
						accptSendIfR.red_slip_ac_dt(purcActR.ac_dt());
						accptSendIfR.red_slip_ac_ym(purcActR.ac_ym());
					}
				}
			}
		}
		/**
		 * データＮＯを設定します
		 * @param grpL
		 */
		protected void setDataNo(MCList<MST_ACCPT_SEND_IF_R>[] grpL) {
			for (MCList<MST_ACCPT_SEND_IF_R> tmpL : grpL) {
				// データＮＯを設定
				MCNumber dNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				tmpL.setNumberNE(MST_ACCPT_SEND_IF_R.$data_no, dNo);
			}
		}
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			PFBZL_SendRecvIfCtrl.Ins01 o = PFBZL_SendRecvIfCtrl.crtIns01();
			o.up0();
			addAll(o.up0(), _accptSendIfL.groupBy(MST_ACCPT_SEND_IF_R.$data_no, MST_PO_SEND_IF_R.$ext_sys_cd), createMap_DtlR_MST_ACCPT_SEND_IF_R());
			o.exec();
		}
		protected Map_DtlR_MST_ACCPT_SEND_IF_R<DtlR,MST_ACCPT_SEND_IF_R> createMap_DtlR_MST_ACCPT_SEND_IF_R() {
			return new Map_DtlR_MST_ACCPT_SEND_IF_R<DtlR, MST_ACCPT_SEND_IF_R>();
		}

		public class Map_DtlR_MST_ACCPT_SEND_IF_R<D extends DtlR, S extends MST_ACCPT_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_ACCPT_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_ACCPT_SEND_IF_R.$ext_sys_cd);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.ACCPT_SEND.value());
			}
		}
	}
	/***
	 * 添付帳票登録サービスを呼び出す。
	 */
	protected void registAttachedFormSrv() {

		MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
		MBBCL_AttachService.Attach_Del01 opAttcDel = MBBCL_AttachService.crtAttach_Del01();
		opAttc.up1().upd_cntr_chk_flg(false);
		
		// インボイス対象と非対象のリストに分ける
		MCList<MST_ACCPT_SEND_IF_R> ifIVL = _accptSendIfL.subList(MST_ACCPT_SEND_IF_R.$iv_flg, true);
		MCList<MST_ACCPT_SEND_IF_R> ifNotIVL = _accptSendIfL.subList(MST_ACCPT_SEND_IF_R.$iv_flg, false);
		
		// インボイス対象の処理
		if (ifIVL.size() > 0) {
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no);
			policy.sum(MST_ACCPT_SEND_IF_R.$trd_cur_amt, MST_ACCPT_SEND_IF_R.$trd_cur_tax_amt);
			MCList<MST_ACCPT_SEND_IF_R> regGrpL = ifIVL.groupBy(policy);
			MCIndexKey idxkey = ifIVL.createIndex(MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no);
			MCIndexKey idxkey2 = ifIVL.createIndex(MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no, MST_ACCPT_SEND_IF_R.$data_crud_typ);
			
			// 全明細削除(ヘッダ削除時)のDEL01呼出
			for (MST_ACCPT_SEND_IF_R r : regGrpL) {
				MCList<MST_ACCPT_SEND_IF_R> delBefL = ifIVL.subList(idxkey, r.bp_dlv_slip_no());
				MCList<MST_ACCPT_SEND_IF_R> delAftL = ifIVL.subList(idxkey2, r.bp_dlv_slip_no(),
						MAC_DATA_CRUD_TYP.DEL.value());

				if (delBefL.size() == delAftL.size()) {
					Attach_Chk02_DtlR attcUp = Attach_Chk02_DtlR.create();
					attcUp.biz_typ(MAC_BIZ_TYP.PURC_ACCPT_EDI.value());
					attcUp.report_id("MSLAR0060");
					attcUp.biz_key1(delBefL.get(0).purc_act_no());
					attcUp.biz_key2(delBefL.get(0).purc_act_rev().toString());
					opAttcDel.up0().add(attcUp);
				}
			}
			
			// Upd01呼出
			for (MST_ACCPT_SEND_IF_R r : regGrpL) {
				
				MST_ACCPT_SEND_IF_R firstR = ifIVL.getFirst(idxkey, r.bp_dlv_slip_no());
				MCNumber trdAmtSum = new MCNumber(0);
				MCList<MST_ACCPT_SEND_IF_R> datalnoL = ifIVL.subList(idxkey,
						firstR.bp_dlv_slip_no());
				
				for (MST_ACCPT_SEND_IF_R sr : datalnoL) {
					//up2電文(data_lno単位)
					Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
					up2.biz_typ(MAC_BIZ_TYP.PURC_ACCPT_EDI.value());
					up2.biz_key1(firstR.purc_act_no());
					up2.biz_key2(firstR.purc_act_rev().toString());
					up2.report_id("MSLAR0060");
					up2.data_lno(sr.data_lno());
					opAttc.up2().add(up2);

					// 削除以外の金額サマリ
					if (!MAC_DATA_CRUD_TYP.isDEL(sr.data_crud_typ())) {
						if (!isNull(sr.trd_cur_amt()) && !isNull(sr.trd_cur_tax_amt())) {
							trdAmtSum = trdAmtSum.add(sr.trd_cur_amt().add(sr.trd_cur_tax_amt()));
						}
					}
				}

				//up0電文
				Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
				up.biz_typ(MAC_BIZ_TYP.PURC_ACCPT_EDI.value());
				up.biz_key1(firstR.purc_act_no());
				up.biz_key2(firstR.purc_act_rev().toString());
				up.report_id("MSLAR0060");
				up.amt(trdAmtSum);
				up.dt(firstR.purc_dt());
				up.bp_cd(firstR.sppl_cd());
				up.cur_cd(firstR.trd_cur_cd());
				up.wg_cd(firstR.wg_cd());
				up.purc_dpt_cd(firstR.purc_dpt_cd());
				up.cntry_cd(firstR.cntry_cd());
				up.tterm_cd1(firstR.tterm_cd1());
				up.tterm_cd2(firstR.tterm_cd2());
				up.tterm_cd3(firstR.tterm_cd3());
				up.if_proc_typ(MAC_IF_PROC_TYP.ACCPT_SEND.value());
				opAttc.up0().add(up);
			}
		}

		// インボイス非対象の処理
		if (ifNotIVL.size() > 0) {
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_ACCPT_SEND_IF_R.$purc_act_no);
			policy.sum(MST_ACCPT_SEND_IF_R.$trd_cur_amt, MST_ACCPT_SEND_IF_R.$trd_cur_tax_amt);
			MCList<MST_ACCPT_SEND_IF_R> regGrpL = ifNotIVL.groupBy(policy);
			MCIndexKey idxkey = ifNotIVL.createIndex(MST_ACCPT_SEND_IF_R.$purc_act_no);
			MCIndexKey idxkey2 = ifNotIVL.createIndex(MST_ACCPT_SEND_IF_R.$po_no, MST_ACCPT_SEND_IF_R.$data_crud_typ);
			
			// 全明細削除(ヘッダ削除時)のDEL01呼出
			for (MST_ACCPT_SEND_IF_R r : regGrpL) {
				MCList<MST_ACCPT_SEND_IF_R> delBefL = ifNotIVL.subList(idxkey, r.purc_act_no());
				MCList<MST_ACCPT_SEND_IF_R> delAftL = ifNotIVL.subList(idxkey2, r.purc_act_no(),
						MAC_DATA_CRUD_TYP.DEL.value());

				if (delBefL.size() == delAftL.size()) {
					Attach_Chk02_DtlR attcUp = Attach_Chk02_DtlR.create();
					attcUp.biz_typ(MAC_BIZ_TYP.PURC_ACCPT_EDI.value());
					attcUp.report_id("MSLAR0060");
					attcUp.biz_key1(delBefL.get(0).purc_act_no());
					attcUp.biz_key2(delBefL.get(0).purc_act_rev().toString());
					opAttcDel.up0().add(attcUp);
				}
			}
			
			// Upd01呼出
			for (MST_ACCPT_SEND_IF_R r : regGrpL) {
				
				MST_ACCPT_SEND_IF_R firstR = ifNotIVL.getFirst(idxkey, r.purc_act_no());
				MCNumber trdAmtSum = new MCNumber(0);
				MCList<MST_ACCPT_SEND_IF_R> datalnoL = ifNotIVL.subList(idxkey,
						firstR.purc_act_no());
				
				for (MST_ACCPT_SEND_IF_R sr : datalnoL) {
					//up2電文(data_lno単位)
					Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
					up2.biz_typ(MAC_BIZ_TYP.PURC_ACCPT_EDI.value());
					up2.biz_key1(firstR.purc_act_no());
					up2.biz_key2(firstR.purc_act_rev().toString());
					up2.report_id("MSLAR0060");
					up2.data_lno(sr.data_lno());
					opAttc.up2().add(up2);

					// 削除以外の金額サマリ
					if (!MAC_DATA_CRUD_TYP.isDEL(sr.data_crud_typ())) {
						trdAmtSum = trdAmtSum.add(sr.trd_cur_amt().add(sr.trd_cur_tax_amt()));
					}
				}
				
				//up0電文
				Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
				up.biz_typ(MAC_BIZ_TYP.PURC_ACCPT_EDI.value());
				up.biz_key1(firstR.purc_act_no());
				up.biz_key2(firstR.purc_act_rev().toString());
				up.report_id("MSLAR0060");
				up.amt(trdAmtSum);
				up.dt(firstR.purc_dt());
				up.bp_cd(firstR.sppl_cd());
				up.cur_cd(firstR.trd_cur_cd());
				up.wg_cd(firstR.wg_cd());
				up.purc_dpt_cd(firstR.purc_dpt_cd());
				up.cntry_cd(firstR.cntry_cd());
				up.tterm_cd1(firstR.tterm_cd1());
				up.tterm_cd2(firstR.tterm_cd2());
				up.tterm_cd3(firstR.tterm_cd3());
				up.if_proc_typ(MAC_IF_PROC_TYP.ACCPT_SEND.value());
				opAttc.up0().add(up);
			}
		}

		if (opAttc.up0().size() > 0) {
			opAttc.exec();
		}
		if (opAttcDel.up0().size() > 0) {
			opAttcDel.exec();
		}
	}

	//FMCB CUSTOM END
}