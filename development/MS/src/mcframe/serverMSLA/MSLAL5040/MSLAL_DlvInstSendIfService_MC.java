package mcframe.serverMSLA.MSLAL5040;

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
import static mcframe.serverMSLA.MSLAL5040.Query.*;
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverPFUD.PFUDL0030.*;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_DlvInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_DlvInstSendIfService_MC extends MSLAL_DlvInstSendIfService_MC_A{
	//FMCB CUSTOM START
	/** 納入指示送信対象となる発注情報のリスト */
	protected MCList<MST_PO_D_R> _poDL = MCList.create(MST_PO_D_R.class);
	/** 納入指示送信対象のリスト */
	protected MCList<MST_DLV_INST_SEND_IF_R> _dlvInstSendIfL = MCList.create(MST_DLV_INST_SEND_IF_R.class);
	
	/**
	 * DlvInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の納入指示情報をＩＦテーブルに書き込む<br>
	 */
	public class DlvInstSendIf_Upd01 extends MSLAL_DlvInstSendIfService_MC_A.DlvInstSendIf_Upd01 {
		/** 品目単位マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit = null;
		protected void iniItmUnitCache(MCList<MST_PO_D_R> dtlL) {
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
					dtlL, MST_PO_D_R.$itm_cd, MST_PO_D_R.$itm_sub1, MST_PO_D_R.$itm_sub2,
					MST_PO_D_R.$itm_sub3, MST_PO_D_R.$trd_unit_cd);
		}
		
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
		protected MCList<MST_RCPT_IV_D_R> _cacheRcptIvDL = null;
		protected MCIndexKey _cacheRcptIvDDlvInstKey = null;
		protected void initRcptIvDCache(MCList<MST_PO_D_R> dtlL) {
			_cacheRcptIvDL = MCList.create(MST_RCPT_IV_D_R.class);
			MST_RCPT_IV_D_R RCPTIVD = MST_RCPT_IV_D_R.create("RCPTIVD");
			MCQueryApiBuilder cacheRcptIvDLBldr = MCQueryApiBuilder.create(RCPTIVD);
			MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
			
			_cacheRcptIvDL.addNumberColumn("dlv_inst_base_unit_qty");
			cacheRcptIvDLBldr.addSelect(nvl(DLVINSTD.base_unit_qty, value(0)).as("dlv_inst_base_unit_qty"));
			cacheRcptIvDLBldr.addLeftOuterJoin(DLVINSTD, bracket(RCPTIVD.ref_dlv_inst_d_no.eq(DLVINSTD.dlv_inst_d_no)));
			cacheRcptIvDLBldr.setWhere(createWhere(RCPTIVD, MST_RCPT_IV_D_R.$po_d_no));
			
			dbSelect("MSBDL5040_MST_RCPT_IV_D_S01", _cacheRcptIvDL, cacheRcptIvDLBldr, dtlL.distinctNE(MST_PO_D_R.$po_d_no));
			_cacheRcptIvDDlvInstKey = _cacheRcptIvDL.createIndex(MST_RCPT_IV_D_R.$ref_dlv_inst_d_no);
		}
		protected MCList<MST_RCPT_IV_D_R> getRcptIvDCacheByDlvInstDNo(String dlvInstDNo) {
			return _cacheRcptIvDL.subList(_cacheRcptIvDDlvInstKey, dlvInstDNo);
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 初期処理
			initProc();
			
			// 発注明細情報の取得
			srchPoDInfo();
			if (isNull(_poDL)) {
				return;
			}
			
			// ワークテーブル登録
			crtPoDWrk();
			
			// 納入指示情報の取得
			srchDlvInstInfo();
			
			// 送信対象リストの作成
			makeIfTgtL();
			
			// 送信対象リストの補完
			cmplIfTgtL();
			
			// 納入指示送信ＩＦ登録
			insIFData();
			
			// ＥＳＢ送受信ＩＦ作成 
			callESBSendCtrl();
			
			// ワークテーブル削除
			delWk();
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			// 発注明細検索結果格納準備
			_poDL.addStringColumn(MAM_EDI_IF_CTL_R.$ext_sys_cd);
			_poDL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			_poDL.addStringColumn(MST_PO_R.$sppl_cd);
			_poDL.addStringColumn("sppl_nm");
			_poDL.addStringColumn("sppl_cntry_cd");
			_poDL.addStringColumn(MAM_CO_R.$co_nm);
			_poDL.addStringColumn(MAM_CO_R.$cntry_cd);
			
			// 納入指示検索結果格納準備
			_dlvInstSendIfL.addBooleanColumn("rcpt_iv_cmpl_flg");
			_dlvInstSendIfL.addBooleanColumn("non_purc_flg");
			_dlvInstSendIfL.addBooleanColumn("purc_cmpl_flg");
			_dlvInstSendIfL.addBooleanColumn("arr_skip_flg");
			_dlvInstSendIfL.addBooleanColumn("arr_cmpl_flg");
		}
		
		/**
		 * 発注明細情報の取得
		 */
		protected void srchPoDInfo() {
			executeQuery(_poDL, MSLAL5040_MST_PO_D_S01(), up0());
		}
		
		/**
		 * 送信対象となる発注明細ＮＯをワークに登録
		 */
		protected void crtPoDWrk() {
			MCList<MST_PO_D_R> wkL = MCList.create(MST_PO_D_R.class);
			for (DlvInstSendIf_Upd01_DtlR r : up0()) {
				wkL.add().po_d_no(r.po_d_no());
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSLAL5020_MSW_PO_D_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5020_MSW_PO_D_I01", wkL, wkL_bldr.getBaseDbc());
		}
		
		/**
		 * 納入指示情報の取得
		 */
		protected void srchDlvInstInfo() {
			iniItmUnitCache(_poDL);
			initRcptIvDCache(_poDL);
			// EDI送信対象となる納入指示情報を取得
			executeQuery(_dlvInstSendIfL, MSLAL5040_MST_DLV_INST_S01());
		}
		
		/**
		 * 送信対象リストの作成
		 */
		protected void makeIfTgtL() {
			MCIndexKey upPoDIdx = up0().createIndex(DlvInstSendIf_Upd01_DtlR.$po_d_no);
			MCList<MST_DLV_INST_SEND_IF_R> tmpL = MCList.create(MST_DLV_INST_SEND_IF_R.class);
			_dlvInstSendIfL.sort(MST_DLV_INST_SEND_IF_R.$po_d_no, MST_DLV_INST_SEND_IF_R.$po_d_no);
			
			for (MST_DLV_INST_SEND_IF_R r : _dlvInstSendIfL) {
				DlvInstSendIf_Upd01_DtlR upPoDR = up0().getFirst(upPoDIdx, r.po_d_no());
				
				MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDCacheByDlvInstDNo(r.dlv_inst_d_no());
				if (isNotTgtR(upPoDR, r, rcptIvDL)) {
					continue;
				}
				//納入指示可能数を計算（＝入荷予定反映可能数）
				MCNumber subtractQty = MCNumber.ZERO;
				// 残数分
				if ((r.getNumberNE("arr_qty").add(r.getNumberNE("arr_abort_qty")).gt(r.getNumberNE("purc_act_qty").add(r.getNumberNE("accpt_dfct_qty").add(r.getNumberNE("purc_abort_qty")))))) {
					subtractQty = subtractQty.add(r.getNumberNE("arr_qty").add(r.getNumberNE("arr_abort_qty")));
				}
				else {
					subtractQty = subtractQty.add(r.getNumberNE("purc_act_qty").add(r.getNumberNE("accpt_dfct_qty").add(r.getNumberNE("purc_abort_qty"))));
				}
				MCNumber remQty = r.getNumberNE("base_unit_qty").subtract(subtractQty);
				
				MAVM_ITM_UNIT_R itmUnitR = getItmUnit(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				MCNumber trdUnitQty = rvrsBaseUnitConv(
						remQty, itmUnitR.conv_base_qty(),
						itmUnitR.conv_qty(), itmUnitR.dec_place(),
						itmUnitR.rnd_typ(), false);
				if (!isNull(trdUnitQty)) {
					r.trd_unit_qty(trdUnitQty);
				}
				else {
					r.trd_unit_qty(remQty);
				}
				
				tmpL.add(r);
			}
			
			// 削除データの追加
			MCList<DlvInstSendIf_Upd01_DtlR> delUpL = up0().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (!isNull(tmpL)) {
				MCList<MST_DLV_INST_SEND_IF_R> tmp1L = tmpL.clone();
				MCIndexKey poDIdx = tmp1L.createIndex(MST_DLV_INST_SEND_IF_R.$po_d_no);
				for (MCList<DlvInstSendIf_Upd01_DtlR> upL : delUpL.groupList(DlvInstSendIf_Upd01_DtlR.$po_d_no)) {
					DlvInstSendIf_Upd01_DtlR upR = upL.get(0);
					MST_DLV_INST_SEND_IF_R delUpR = tmp1L.getFirst(poDIdx, upR.po_d_no());
					if (!isNull(delUpR)) {
						continue;
					}
					
					MST_DLV_INST_SEND_IF_R delR = MST_DLV_INST_SEND_IF_R.create();
					delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					delR.po_d_no(upR.po_d_no());
					tmpL.add(delR);
				}
			}
			else {
				for (MCList<DlvInstSendIf_Upd01_DtlR> upL : delUpL.groupList(DlvInstSendIf_Upd01_DtlR.$po_d_no)) {
					DlvInstSendIf_Upd01_DtlR upR = upL.get(0);
					MST_DLV_INST_SEND_IF_R delR = MST_DLV_INST_SEND_IF_R.create();
					delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					delR.po_d_no(upR.po_d_no());
					tmpL.add(delR);
				}
			}
			tmpL.sort(MST_DLV_INST_SEND_IF_R.$po_d_no, MST_DLV_INST_SEND_IF_R.$dlv_inst_no, MST_DLV_INST_SEND_IF_R.$dlv_inst_rev, MST_DLV_INST_SEND_IF_R.$dlv_inst_d_no);
			_dlvInstSendIfL = tmpL;
		}
		
		/**
		 * 送信対象外か判断
		 */
		protected boolean isNotTgtR(DlvInstSendIf_Upd01_DtlR upR, MST_DLV_INST_SEND_IF_R r, MCList<MST_RCPT_IV_D_R> rcptIvDL) {
			
			Boolean rcptIvCmplFlg = false;
			if (!isNull(rcptIvDL) && isSame(r.getNumberNE("base_unit_qty"), rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty))) {
				rcptIvCmplFlg = true;
			}
			// 受領インボイス登録済、打切済、完了の場合、対象行は送信不可
			if ((!isNull(r.getStringNE("rcpt_iv_no")) && rcptIvCmplFlg) || (!isNull(r.getNumberNE("arr_abort_qty")) && !r.getNumberNE("arr_abort_qty").isZero())
					|| (!isNull(r.getNumberNE("purc_abort_qty")) && !r.getNumberNE("purc_abort_qty").isZero())
					|| (!r.getBooleanNE("non_purc_flg") && r.getBooleanNE("purc_cmpl_flg")) || (!r.getBooleanNE("arr_skip_flg") && r.getBooleanNE("arr_cmpl_flg"))){
				return true;
			}
			return false;
		}
		
		/**
		 * 送信対象リストの補完
		 */
		protected void cmplIfTgtL() {
			
			// データＮＯ発番（キャッシュ）
			makeDataNo();
			
			MCIndexKey upIdx = up0().createIndex(DlvInstSendIf_Upd01_DtlR.$dlv_inst_no);
			MCIndexKey poDIdx = _poDL.createIndex(MST_PO_D_R.$po_d_no);
			
			for (MCList<MST_DLV_INST_SEND_IF_R>grpL : _dlvInstSendIfL.groupList(MST_DLV_INST_SEND_IF_R.$po_d_no)) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value()); 
				for (MST_DLV_INST_SEND_IF_R r : grpL) {
					r.data_no(dataNo);
					r.data_lno(getSequence(MSC_NUM_SYS_TYP.DLVINSTSENDIF.value()));
					// データ更新区分の補完（削除については補完済）
					if (isNull(r.data_crud_typ())) {
						DlvInstSendIf_Upd01_DtlR upR = up0().getFirst(upIdx, r.dlv_inst_no());
						if (!isNull(upR)) {
							r.data_crud_typ(upR.data_crud_typ());
						}
						else {
							r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						}
					}
					r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					
					// 発注明細情報から補完
					_poDL.sort(SortType.DESC, MST_PO_D_R.$po_d_no, MST_PO_D_R.$po_d_no, MST_PO_D_R.$po_rev);
					MST_PO_D_R poDR = _poDL.getFirst(poDIdx, r.po_d_no());
					r.setBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg, poDR.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg));
					r.ext_sys_cd(poDR.getStringNE(MAM_EDI_IF_CTL_R.$ext_sys_cd));
					r.po_no(poDR.po_no());
					r.po_rev(poDR.po_rev());
					r.sppl_cd(poDR.getStringNE(MST_PO_R.$sppl_cd));
					r.sppl_nm(poDR.getStringNE("sppl_nm"));
					r.sppl_cntry_cd(poDR.getStringNE("sppl_cntry_cd"));
					r.itm_cd(poDR.itm_cd());
					r.itm_sub1(poDR.itm_sub1());
					r.itm_sub2(poDR.itm_sub2());
					r.itm_sub3(poDR.itm_sub3());
					convNullValToNull(r);
					r.sundry_itm_flg(poDR.sundry_itm_flg());
					r.itm_nm(poDR.itm_nm());
					r.iv_itm_nm(poDR.iv_itm_nm());
					r.sppl_itm_cd(poDR.sppl_itm_cd());
					r.sppl_itm_nm(poDR.sppl_itm_nm());
					r.co_nm(poDR.getStringNE(MAM_CO_R.$co_nm));
					r.cntry_cd(poDR.getStringNE(MAM_CO_R.$cntry_cd));
				}
			}
		}
		
		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_dlvInstSendIfL.groupBy(MST_DLV_INST_SEND_IF_R.$po_d_no).size());
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.DLVINSTSENDIF, _dlvInstSendIfL.size());
		}
		
		/**
		 * null補完
		 * @param r
		 */
		protected void convNullValToNull(MST_DLV_INST_SEND_IF_R r) {
			if (!r.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg)) {
				r.itm_sub1(nullValToNull(r.itm_sub1()));
				r.itm_sub2(nullValToNull(r.itm_sub2()));
				r.itm_sub3(nullValToNull(r.itm_sub3()));
			}
		}
		
		protected void insIFData() {
			MCQueryApiBuilder sendIfInsL_bldr = MCQueryApiBuilder.create(MST_DLV_INST_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL5040_MST_DLV_INST_SEND_IF_I01", _dlvInstSendIfL, sendIfInsL_bldr);
		}
		
		/**
		 * ワークテーブル削除
		 */
		protected void delWk() {
			MCQueryApiBuilder dbcL1_bldr = MCQueryApiBuilder.create(MST_DLV_INST_R.create("T"));
			dbWkDelete("MSLAL5020_MSW_DLV_INST_D01", dbcL1_bldr.getBaseDbc());
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			PFBZL_SendRecvIfCtrl.Ins01 o = PFBZL_SendRecvIfCtrl.crtIns01();
			o.up0();
			addAll(o.up0(), _dlvInstSendIfL.groupBy(MST_DLV_INST_SEND_IF_R.$data_no, MST_DLV_INST_SEND_IF_R.$ext_sys_cd), createMap_DtlR_MST_DLV_INST_SEND_IF_R());
			o.exec();
		}
		
		protected Map_DtlR_MST_DLV_INST_SEND_IF_R<DtlR,MST_DLV_INST_SEND_IF_R> createMap_DtlR_MST_DLV_INST_SEND_IF_R() {
			return new Map_DtlR_MST_DLV_INST_SEND_IF_R<DtlR, MST_DLV_INST_SEND_IF_R>();
		}
		
		public class Map_DtlR_MST_DLV_INST_SEND_IF_R<D extends DtlR, S extends MST_DLV_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_DLV_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_DLV_INST_SEND_IF_R.$ext_sys_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.DLV_INST_SEND.value());
			}
		}
	}

	//FMCB CUSTOM END
}