package mcframe.serverMSLA.MSLAL7520;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverCore.resource.MCConst;
import mcframe.commonCore.util.MCDataConvUtil.JSON;
import mcframe.serverCore.requester.MCSimpleRequester;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.commonMSLA.MSLAR7520.DtlR;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_GAPoSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_GAPoSendConvService_MC extends MSLAL_GAPoSendConvService_MC_A{
	//FMCB CUSTOM START
	// キャッシュ用
	protected static final Class<MSLAL_GAPoSendConvService> CLAZZ = MSLAL_GAPoSendConvService.class;

	// GAのAPI群
	protected static final String[] REQ_TYPE_SAVE;
	protected static final String[] REQ_TYPE_SRCH;
	protected static final String[] REQ_TYPE_DEL;
	protected static final String[] REQ_TYPE_CLOSE;
	protected static final String[] REQ_TYPE_CLOSE_RET;
	static {
		REQ_TYPE_SAVE = new String[]{"1", "/save"};
	 	REQ_TYPE_SRCH = new String[]{"2", "list"};
	 	REQ_TYPE_DEL = new String[]{"3", "/delete"};
	 	REQ_TYPE_CLOSE = new String[]{"4", "/close/detail"};
	 	REQ_TYPE_CLOSE_RET = new String[]{"5", "/close/detail/cancel/noneedstatus"};
	};
	
	/**
	 * GA側のクローズステータス
	 */
	protected static final String GA_CLOSE_STS = "4";
	
	/**
	 * GAPoSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class GAPoSendConv_Conv01 extends MSLAL_GAPoSendConvService_MC_A.GAPoSendConv_Conv01 {
		/**
		 * 送信エラーフラグ
		 */
		protected String _$snd_to_err_flg = "snd_to_err_flg";
		/**
		 * 更新前検索エラーフラグ（結果結果なし）
		 */
		protected String _$upd_srch_err_flg = "upd_srch_err_flg";
		/**
		 * 送信IFリスト
		 */
		protected MCList<?> _ifL = null;
		/**
		 * 打切リスト
		 */
		protected MCList<MCRow> _abortIfL = null;
		/**
		 * 打切リ戻しスト
		 */
		protected MCList<MCRow> _abortRetIfL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_PO_SEND_IF_R.class);
		}
		
		@Override
		protected void sendRequest(MCList<?> ifL) {
			addErrColumn(ifL);
			bfrSendRequest(ifL);
			super.sendRequest(ifL);
			aftrSendRequest(ifL);
		}
		
		@Override
		protected String sendRequestSub(MCSimpleRequester req, String url, MCList<?> ifL) {
			java.util.function.Function<MCList<?>, Boolean> isDel = (lst) -> {
				for (MCRow r : lst) {
					if (!isCancel(r)) {
						return false;
					}
				}
				return true;
			};

			initBpCache(ifL);
			initGAMappingCols();

			_abortIfL = MCList.create(MCRow.class);
			_abortRetIfL = MCList.create(MCRow.class);
			int limit = getSendLimitSize();
			MCList<MCRow> saveL[] = new MCList[]{
				MCList.create(MCRow.class),		// 取消
				MCList.create(MCRow.class),		// 登録・訂正
			};
			
			MCList<?>[] reqGrp = ifL.groupList(getHdrGrpKey());
			for (int i=0; i<reqGrp.length; i++) {
				MCList<?> reqL = reqGrp[i];
				if (isDel.apply(reqL)) {
					// 取消分
					saveL[0].addAll(reqL);
				}
				else {
					
					for (MCRow r : reqL.subList(r->!isCancel(r))) {
						saveL[1].add(r);
					}
				}

				// 取消分の送信
				if (!saveL[0].isEmpty()) {
					if (limit > 0 && saveL[0].distinctNE(getHdrGrpKey()).size() >= limit || i == reqGrp.length - 1) {
						for (MCList<?> lst : saveL[0].groupList(getHdrGrpKey())) {
							// 取消は事前に検索する必要あり（検索のレスポンスが必要）
							String res = sendRequestSrch(req, url, lst);
							if (!isNull(res)) {
								preRequestDel(res, lst);
							}
						}
						
						sendRequestDel(req, url, saveL[0]);
						saveL[0].clear();
					}
				}
				// 登録・訂正分の送信
				if (!saveL[1].isEmpty()) {
					if (limit > 0 && saveL[1].distinctNE(getHdrGrpKey()).size() >= limit || i == reqGrp.length - 1) {
						
						for (MCList<?> lst : saveL[1].groupList(getHdrGrpKey())) {
							// 事前に検索し、客先注文Noが存在する場合、取得した伝票No.を設定する。
							String res = sendRequestSrch(req, url, lst);
							if (!isNull(res)) {
								preRequestSave(res, lst);
							}
						}
						if (!isSame(sum(_abortIfL.size(), _abortRetIfL.size()), saveL[1].size())) {
							sendRequestSave(req, url, saveL[1]);
							saveL[1].clear();
						}
					}
				}
				// 打切分の送信
				if (!_abortIfL.isEmpty()) {
					
					if (limit > 0 && _abortIfL.distinctNE(getHdrGrpKey()).size() >= limit || i == reqGrp.length - 1) {
						
						sendRequestCloseDetail(req, url, _abortIfL);
						_abortIfL.clear();
					}
				}
				// 打切戻し分の送信
				if (!_abortRetIfL.isEmpty()) {
					
					if (limit > 0 && _abortRetIfL.distinctNE(getHdrGrpKey()).size() >= limit || i == reqGrp.length - 1) {
						
						sendRequestCloseDetailRet(req, url, _abortRetIfL);
						_abortRetIfL.clear();
					}
				}
			}
			
			// 戻り値は使用していないっぽいのでnullを返す
			return null;
		}
		
		/**
		 * ヘッダのグループ化項目を返す。
		 * @return ヘッダのグループ化項目
		 */
		protected String[] getHdrGrpKey() {
			return new String[] {
					MST_PO_SEND_IF_R.$po_no
			};
		}
		
		/**
		 * リクエスト前処理
		 * @param ifL 送信ＩＦリスト
		 */
		protected void bfrSendRequest(MCList<?> ifL) {
			setLogKey(ifL);
		}
		
		/**
		 * 一時カラムを追加
		 * @param ifL 送信ＩＦリスト
		 */
		protected void addErrColumn(MCList<?> ifL) {
			
			ifL.addBooleanColumn(_$snd_to_err_flg, false);
			ifL.addBooleanColumn(_$upd_srch_err_flg, false);
		}
		
		/**
		 *  バッチログに必要なキーを設定する
		 * @param ifL 送信ＩＦリスト
		 */
		protected void setLogKey(MCList<?> ifL) {
			saveMessagePool();
			MCMessagePool.clear();
			
			getBatchLogger().setLogKey(
					ifL,
					MST_PO_SEND_IF_R.$batch_log_no,
					MST_PO_SEND_IF_R.$log_sub_key1,
					MST_PO_SEND_IF_R.$log_sub_key2
				);
			
			for (MCRow r : ifL) {
				// ＩＦデータとバッチログを紐付ける
				r.setParamIndex(r.getNumberNE(MST_PO_SEND_IF_R.$log_sub_key1).intValue());
				r.setParamRowIndex(r.getNumberNE(MST_PO_SEND_IF_R.$log_sub_key2).intValue());
			}
		}
		
		/**
		 * リクエスト後処理
		 * @param ifL 送信ＩＦリスト
		 */
		protected void aftrSendRequest(MCList<?> ifL) {
			addMsgPool();
			setIf(ifL);
			updIf(ifL);
		}
		
		/**
		 * 連携先でエラーが発生したことを通知するメッセージを追加する
		 */
		protected void addMsgPool() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			rollbackMessagePool();
			
			if (msgL.size() > 0) {
				getBatchLogger().writeDataLog(msgL);
				
				// GAでエラーがあったことを通知するためのメッセージ
				MCList<MCRow> lst = MCList.create(MCRow.class);
				for (MCMessage msg : msgL) {
					lst.add(msg.getCauseRow());
				}
				lst.distinctNE("po_no").forEach(r -> {
					MCMessagePool.add(
						r, null,
						MSLAL0703,
						r.getNumberNE("data_no"), r.getStringNE("po_no")
					);
				});
			}
		}
		
		/**
		 * 送信ＩＦリストを保持する。
		 * @param ifL 送信ＩＦリスト
		 */
		protected void setIf(MCList<?> ifL) {
			_ifL = ifL;
		}
		
		protected void updIf(MCList<?> ifL) {
			
			MST_PO_SEND_IF_R t = MST_PO_SEND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			dbUpdateKey("MSLAL7520_MST_PO_SEND_IF_U01", ifL, bldr);
		}
		
		@Override
		protected void setDown0(MCList<SdrvDtlR> ifL, boolean isErr) {
			super.setDown0(ifL, isErr);
			
			if (isNull(_ifL)) {
				return;
			}
			
			MCList<?> errL = _ifL.subList(r -> r.getBooleanNE(_$snd_to_err_flg));
			if (errL.isEmpty()) {
				return;
			}
			
			MCIndexKey idxkey = ifL.createIndex(SdrvDtlR.$data_no);
			
			errL.forEach(errR -> {
				ifL.subList(idxkey, errR.getNumberNE(MST_PO_SEND_IF_R.$data_no)).setString(
						PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_CONV_ERR.value());
			});
		}
		
		/**
		 * GAに連携する項目のマッピング情報をキャッシュ
		 */
		protected Map<String, String> _gaMappingCols;
		protected void initGAMappingCols() {
			_gaMappingCols = new LinkedHashMap<>();
		}
		
		/**
		 * GAのAPI「save」の送信上限数を取得する。
		 * @return 送信上限数
		 */
		protected int getSendLimitSize() {
			// 複数発注をまとめず発注単位に送信する
			// 複数送信したうちのひとつでもエラーがあった場合、すべての発注がエラー扱いになるので
			return MCConst.app.getInteger("MS.MSLAL7520.send_size", 1);
		}
		
		/**
		 * GAのAPI 「search」を実行する。
		 * @param req 通信リクエスタ
		 * @param url リクエストURL
		 * @param ifL 送信ＩＦリスト
		 * @return リクエストの下り電文
		 */
		protected String sendRequestSrch(MCSimpleRequester req, String url, MCList<?> ifL) {
			// 検索は発注単位
			String srchUrl =  url.replaceFirst("/mcframe", "/report") + REQ_TYPE_SRCH[1];
			MCList<?> reqL = ifL.distinctNE(MST_PO_SEND_IF_R.$po_no);
			String res = req.request(srchUrl, getRequestBody(REQ_TYPE_SRCH[0], reqL));
			
			if (checkResponse(REQ_TYPE_SRCH[0], res, ifL)) {
				
				MCList<?> errL = ifL.subList(r -> r.getBooleanNE(_$upd_srch_err_flg));
				if (!errL.isEmpty()) {
					return null;
				}
				
				return res;
			}
			
			return null;
		}
		
		/**
		 * GAのAPI呼出のリクエストを取得する。
		 * @param reqTyp リクエストタイプ
		 * @param ifL 送信ＩＦリスト
		 * @return JSON形式に変換した文字列
		 */
		protected String getRequestBody(String reqTyp, MCList<?> ifL) {
			Map<String, Object> map = new LinkedHashMap<>();

			setRequestBodyCmn(map, ifL.get(0));
			
			if (isSame(reqTyp, REQ_TYPE_SAVE[0])) {
				setRequestBodySave(ifL, map);
			}
			else if (isSame(reqTyp, REQ_TYPE_SRCH[0])) {
				setRequestBodySrch(ifL, map);
			}
			else if (isSame(reqTyp, REQ_TYPE_DEL[0])) {
				setRequestBodyDel(ifL, map);
			}
			else if (isSame(reqTyp, REQ_TYPE_CLOSE[0])) {
				setRequestBodyCloseDetail(ifL, map);
			}
			else if (isSame(reqTyp, REQ_TYPE_CLOSE_RET[0])) {
				setRequestBodyCloseDetail(ifL, map);
			}

			return PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ()).toJson(map);
		}
		
		/**
		 * GAのAPI呼出のリクエストを設定する。
		 * @param map マップ
		 */
		protected void setRequestBodyCmn(Map<String, Object> map, MCRow ifR) {
			Map<String, String>  cmnMap = getGaParmMap(ifR);
			map.put("Company", cmnMap.get("COMPANY"));
			map.put("Lang", cmnMap.get("LANG"));
			map.put("UserID", cmnMap.get("USER"));
			map.put("Password", nvl(cmnMap.get("PASSWD"),""));
			map.put("UserKey", cmnMap.get("USERKEY"));
		}
		
		/**
		 * GAのAPI「save」のリクエストを設定する。
		 * @param ifL 送信ＩＦリスト
		 * @param map  マップ
		 */
		protected void setRequestBodySave(MCList<?> ifL, Map<String, Object> map) {
			java.util.function.BiFunction<String, Comparable<?>, LinkedHashMap<String, Object>> f = (key, val) -> {
				LinkedHashMap<String, Object> mp = new LinkedHashMap<>();
				mp.put("fieldName", key);
				mp.put("fieldID", key);
				mp.put("value", isNull(val) ? "" : val.toString());
				return mp;
			};
			
			MCList<DtlR> dtlL = getSaveData(ifL);
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (int i=0; i<dtlL.size(); i++) {

				List<LinkedHashMap<String, Object>> flds = new ArrayList<>();
				for (String col : dtlL.getColumnPathArray()) {
					flds.add(f.apply(col,  dtlL.get(i).getValue(col)));
				}

				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("lineNo", i + 1);
				m.put("values", flds.toArray());
				arr.add(m);
			}
			map.put("Data", arr.toArray());
		}
		
		/**
		 * ＩＦデータをGA項目にマッピングする。
		 * @param ifL 送信ＩＦリスト
		 * @return GAのデータリスト
		 */
		protected MCList<DtlR> getSaveData(MCList<?> ifL) {
			
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			ifL.sort(MST_PO_SEND_IF_R.$po_no);
			addAll(dtlL, ifL, new DtlR_MST_PO_SEND_IF_R());
			return dtlL;
		}
		
		public class DtlR_MST_PO_SEND_IF_R<D extends DtlR, S extends MST_PO_SEND_IF_R> extends MCRowMapper<D, S> {
			int rowNo = 1;
			String befPoNO = null;
			@Override
			protected void valueCopy(D dest, S src) {
				dest.inpDate(src.po_dt().toString("yyyy/MM/dd"));
				dest.voucherNo(src.getStringNE("voucherNo"));
				dest.customerNo(src.po_no());
				dest.succeedVoucherNo(src.po_no());
				dest.correspType(1);	// 1：取引先
				dest.customerCode(src.if_co_cd());
				dest.delivToCode(src.if_in_to_id_cd());
				dest.deptCode(null);
				dest.inchargeCode(null);
				dest.ar_PatternCode(null);
				dest.currencyCode(src.if_trd_cur_cd());
				dest.rateTypeCode(null);
				dest.rate(null);
				dest.forCondition(1);	//1：一部
				if (MAC_TAX_CALC_TYP.isLINE(getBpCache(src.sppl_cd()).purc_tax_calc_typ())) {
					dest.taxableCode(null);
					dest.taxType(2);		// 2：対象外
				}
				else {
					dest.taxableCode(src.if_tax_cd());
					// 課税または免税（免税は課税0%として扱う）
					if (MAC_TAX_TYP.isTAX_ABL(src.tax_typ()) || MAC_TAX_TYP.isEX_XMPT(src.tax_typ())) {
						dest.taxType(src.inc_tax_flg() ? 0 : 1);
					}
					else {
						dest.taxType(2);		// 2：対象外
					}
				}
				dest.header_DescriptCode(null);
				dest.header_DescriptName(null);
				dest.postpadColor(null);
				dest.postpadText(null);
				dest.settleMethod(null);
				dest.bankAcct_Own(null);
				dest.paymentTerms(null);
				dest.dueDate(null);
				dest.fileName(null);
				dest.header_UserMaster(null);
				dest.header_UserText(null);
				dest.header_FlexMaster1(null);
				dest.header_FlexMaster2(null);
				dest.header_FlexCode1(null);
				dest.header_FlexCode2(null);
				dest.header_FlexText1(null);
				dest.header_FlexText2(null);
				dest.header_FlexText3(null);
				dest.header_FlexText4(null);
				dest.header_FlexText5(null);
				dest.header_FlexDate(null);
				dest.remarks1(null);
				dest.remarks2(null);
				dest.remarks3(null);
				dest.remarks4(null);
				dest.remarks5(null);
				dest.remarks6(null);
				dest.remarks7(null);
				dest.remarks8(null);
				dest.remarks9(null);
				dest.remarks10(null);
				dest.remarks11(null);
				dest.remarks12(null);
				dest.remarks13(null);
				dest.remarks14(null);
				dest.remarks15(null);
				dest.remarks16(null);
				dest.remarks17(null);
				dest.remarks18(null);
				dest.remarks19(null);
				dest.remarks20(null);
				dest.remarks21(null);
				dest.remarks22(null);
				dest.remarks23(null);
				dest.remarks24(null);
				dest.remarks25(null);
				dest.remarks26(null);
				dest.remarks27(null);
				dest.remarks28(null);
				dest.remarks29(null);
				dest.remarks30(null);
				if (!isSame(befPoNO, src.po_no())) {
					// 発注NOごとに１から連番
					rowNo = 1;
				}
				befPoNO = src.po_no();
				dest.rowNo(rowNo++);
				dest.detailType(null);	
				dest.detail_DeptCode(null);
				dest.warehouse(null);
				dest.locationCode(null);
				dest.goodsGroup(null);
				dest.goodsCode(src.if_itm_cd());
				dest.chargesCode(null);
				dest.unitType(1);	//1：荷姿単位計上
				if (!isSame(src.if_itm_cd(), "S0001")) {
					dest.packingUnitCode(src.if_trd_unit_cd());
					dest.packingUnitPrice(src.trd_cur_upri());
					dest.packingUnitQty(src.trd_unit_qty());
				}
				dest.unitPrice(src.trd_cur_upri());
				dest.qty(src.trd_unit_qty());
				dest.corresp_Goods(null);
				
				if (!isNull(dest.taxableCode())) {
					dest.detail_TaxableCode(null);
					dest.detail_TaxType(2);		// 2：対象外
				}
				else {
					dest.detail_TaxableCode(src.if_tax_cd());
					// 課税または免税（免税は課税0%として扱う）
					if (MAC_TAX_TYP.isTAX_ABL(src.tax_typ()) || MAC_TAX_TYP.isEX_XMPT(src.tax_typ())) {
						dest.detail_TaxType(src.inc_tax_flg() ? 0 : 1);
					}
					else {
						dest.detail_TaxType(2);		// 2：対象外
					}
				}

				dest.inpAmount_Fc(sum(src.trd_cur_tax_amt(), src.trd_cur_amt()));
				dest.taxAmount_Fc(src.trd_cur_tax_amt());
				dest.taxableAmount_Fc(src.trd_cur_amt());
				dest.inpAmount_Sc(null);
				dest.taxAmount_Sc(null);
				dest.taxableAmount_Sc(null);
				dest.preshippingDate(null);
				dest.delivDate(src.dlv_rqst_tm().toString("yyyy/MM/dd"));
				dest.detail_Descript_Code(null);
				dest.detail_Descript_Name(null);
				dest.detail_UserMaster1(null);
				dest.detail_UserMaster2(null);
				dest.detail_UserMaster3(null);
				dest.detail_UserMaster4(null);
				dest.detail_UserMaster5(null);
				dest.detail_UserCode(null);
				dest.detail_UserText(null);
				dest.detail_UserDate(null);
				dest.detail_UserQty(null);
				dest.detail_FlexMaster(null);
				dest.detail_FlexCode(src.po_d_no());
				dest.detail_FlexText1(null);
				dest.detail_FlexText2(null);
				dest.detail_FlexDate(null);
				dest.sub_Descript_Code(null);
				dest.sub_Descript_Name(null);
				dest.sub_UserMaster1(null);
				dest.sub_UserMaster2(null);
				dest.sub_UserMaster1(null);
				dest.sub_UserMaster2(null);
				dest.sub_UserMaster3(null);
				dest.sub_UserMaster4(null);
				dest.sub_UserMaster5(null);
				dest.sub_UserCode(null);
				dest.sub_UserText(null);
				dest.sub_UserDate(null);
				dest.sub_UserQty(null);
				dest.spriceCode(null);
				dest.spriceIndex(null);
				
				// リソース設定に従って、GA項目にマッピングする
				_gaMappingCols.entrySet().forEach(e -> {
					dest.setValueNE(e.getKey(), src.getValueNE(e.getValue()));
				});
			}
		}
		
		/**
		 * GAのAPI「search」のリクエストを設定する。
		 * @param ifL 送信ＩＦリスト
		 * @param map  マップ
		 */
		protected void setRequestBodySrch(MCList<?> ifL, Map<String, Object> map) {
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (MCRow r : ifL) {
				MST_PO_SEND_IF_R ifR = MST_PO_SEND_IF_R.class.cast(r);
				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("fromInpDate", ifR.po_dt().toString("yyyy/MM/dd"));
				m.put("toInpDate", m.get("fromInpDate"));
				m.put("customerNo", ifR.po_no());
				m.put("correspType", "1"); // １：取引先
				m.put("fromCorresp", ifR.if_co_cd());
				m.put("toCorresp", ifR.if_co_cd());
				m.put("others", new String[] {"1"}); // 明細項目出力
				m.put("outputType", new String[] {"1"}); // 完全一致のみ出力
				m.put("approveStatus", "2"); //  承認区分 2：全部
				m.put("voucherPublish", "2"); // 伝票発行区分 2：全部
				
				arr.add(m);
			}
			map.put("Data", arr.toArray());
		}
		
		/**
		 * GAのAPI「delete」のリクエストを設定する。
		 * @param ifL 送信ＩＦリスト
		 * @param map  マップ
		 */
		protected void setRequestBodyDel(MCList<?> ifL, Map<String, Object> map) {
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (MCRow r : ifL) {
				MST_PO_SEND_IF_R ifR = MST_PO_SEND_IF_R.class.cast(r);
				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("voucherNo", ifR.getStringNE("voucherNo"));
				m.put("internalNo", ifR.getStringNE("internalNo"));
				m.put("changeCount", ifR.getStringNE("changeCount"));
				arr.add(m);
			}
			map.put("Data", arr.toArray());
		}
		
		/**
		 * GAのAPI「close/detail」のリクエストを設定する。
		 * @param ifL 送信ＩＦリスト
		 * @param map  マップ
		 */
		protected void setRequestBodyCloseDetail(MCList<?> ifL, Map<String, Object> map) {
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (MCRow r : ifL) {
				MST_PO_SEND_IF_R ifR = MST_PO_SEND_IF_R.class.cast(r);
				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("voucherNo", ifR.getStringNE("voucherNo"));
				m.put("rowNo", ifR.getStringNE("rowNo"));
				arr.add(m);
			}
			map.put("Data", arr.toArray());
		}
		
		/**
		 * GAのAPIのレスポンスをチェックする。
		 * @param reqTyp  リクエストタイプ
		 * @param resb APIのリスポンス
		 * @param ifL 送信ＩＦリスト
		 * @return true：エラー（警告）なし ／ false：エラー（警告）あり
		 */
		protected boolean checkResponse(String reqTyp, String resb, MCList<?> ifL) {

			JSON jsonConverter = PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ());
			Map<String, Object> response = jsonConverter.toMap(resb);

			// GAステータス
			MCNumber status = response.get("Status") == null ? null: MCNumber.valueOf(response.get("Status").toString());

			boolean ret = true;
			if (isSame(reqTyp, REQ_TYPE_SAVE[0])) {
				ret = checkResponseSave(status, response, ifL);
			}
			else if (isSame(reqTyp, REQ_TYPE_SRCH[0])) {
				ret = checkResponseSrch(status, response, ifL);
			}
			else if (isSame(reqTyp, REQ_TYPE_DEL[0])) {
				ret = checkResponseDel(status, response, ifL);
			}
			else if (isSame(reqTyp, REQ_TYPE_CLOSE[0])) {
				ret = checkResponseCloseDetail(status, response, ifL);
			}
			else if (isSame(reqTyp, REQ_TYPE_CLOSE_RET[0])) {
				ret = checkResponseCloseDetail(status, response, ifL);
			}
			
			if (!ret) {
				// 他の発注のエラーに巻き込まれて反映できなかった発注の扱い
				// 発注内の明細すべてにメッセージを紐付け、エラーにする。
				MCIndexKey idx = ifL.createIndex(
					MST_PO_SEND_IF_R.$po_no, _$snd_to_err_flg
				);
				for (MCList<?> lst : ifL.groupList(MST_PO_SEND_IF_R.$po_no)) {
					MST_PO_SEND_IF_R ifR = MST_PO_SEND_IF_R.class.cast(lst.get(0));
					
					// 発注内に送信先エラーが含まれていない発注のみ対象
					if (isNull(ifL.getFirst(idx, ifR.po_no(), true))) {
						for (MCRow r : lst) {
							ifR = MST_PO_SEND_IF_R.class.cast(r);
							MCMessagePool.add(
								ifR, null,
								MSLAL0705,
								ifR.data_no(), ifR.po_no()
							);
							ifR.setBooleanNE(_$snd_to_err_flg, true);
						}
					}
				}
			}
			
			// true：エラー（警告）なし ／ false：エラー（警告）あり
			return ret;
		}
		
		/**
		 * GAのAPI「save」のレスポンスをチェックする。
		 * @param status GAステータス
		 * @param response GAのリスポンス
		 * @param ifL 送信ＩＦリスト
		 * @return true：エラー（警告）なし ／ false：エラー（警告）あり
		 */
		protected boolean checkResponseSave(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if ( !(isNull(status) || !status.isZero()) ) {
				return true;	// エラー（警告）なし
			}
			
			List<Map<String, String>> res = new ArrayList<>();
			if (response.containsKey("SaveStatusDetail")) {
				res.addAll(convToMap(response.get("SaveStatusDetail")));
			}
			
			// レスポンス解析後のマップのキー項目は小文字で統一する（convToMap のキー項目は小文字で統一されているので）
			for (Map<String, String> m : res) {
				if (!m.containsKey("errordetail")) {
					continue;
				}
					
				// 以下のようなメッセージが対象（他にもある）
				// ErrorDetail: "必須項目のため、入力が必要です｡（E001007）"
				// ErrorDetail: "存在しないコードが入力されています｡（E001014）"
				StringBuffer msg = new StringBuffer(m.get("errordetail").toString());
				if (m.containsKey("itemname")) {
					msg.append(System.lineSeparator());
					msg.append("ItemName:" + m.get("itemname"));
				}

				// メッセージに紐付けるロウを特定する
				// メッセージに行情報がなかったり、あっても不正な場合は全てのロウを紐付ける
				MCList<MCRow> bindL = MCList.create(MCRow.class);
				MCNumber idx = null;
				try {
					if (m.containsKey("recordkey")) {
						// RecordKey: "Row = 1"
						idx = MCNumber.valueOf(m.get("recordkey").split("=")[1].trim());
						bindL.add(ifL.get(idx.intValue() - 1));
					}
				}
				finally {
					if (isNull(idx)) {
						bindL.addAll(ifL);
					}
				}
				
				bindL.forEach(bindR -> {
					MCMessagePool.add(bindR, null, MSLAL0704, msg);
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				});
			}
			
			if (response.containsKey("Message")) {
				ifL.forEach(bindR -> {
					MCMessagePool.add(bindR, null, MSLAL0704, response.get("Message").toString());
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				});
			}
			
			MCIndexKey idx = ifL.createIndex(MST_PO_SEND_IF_R.$po_no, _$snd_to_err_flg);
			
			for (MCList<?> subL : ifL.groupList(MST_PO_SEND_IF_R.$po_no)) {
				MST_PO_SEND_IF_R ifR = MST_PO_SEND_IF_R.class.cast(subL.get(0));
				
				if (!isNull(ifL.getFirst(idx, ifR.po_no(), true))) {
					subL.forEach(r-> {
						if (!r.getBooleanNE(_$snd_to_err_flg)) {
							MCMessagePool.add(
									r, null,
									MSLAL0729,
									r.getNumberNE("data_no"),
									r.getNumberNE("data_lno"),
									r.getStringNE("po_no")
								);
							r.setBooleanNE(_$snd_to_err_flg, true);
						}
					});
				}
			}
			
			return false;	// エラー（警告）あり
		}

		/**
		 * GAのAPI「search」のレスポンスをチェックする。
		 * @param status GAステータス
		 * @param response GAのリスポンス
		 * @param ifL 送信ＩＦリスト
		 * @return true：エラー（警告）なし ／ false：エラー（警告）あり
		 */
		protected boolean checkResponseSrch(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if (!response.containsKey("Message")) {
				return true;	// エラー（警告）なし
			}
			
			ifL.forEach(bindR -> {
				if (isCancel(bindR)) {
					// Message: "設定されたデータは存在しません｡（E001000）"
					MCMessagePool.add(bindR, null, MSLAL0704, response.get("Message").toString());
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				}
				else {
					bindR.setBooleanNE(_$upd_srch_err_flg, true);
				}
			});
			
			MCList<?> errL = ifL.subList(r -> r.getBooleanNE(_$snd_to_err_flg));
			
			return errL.isEmpty();	// エラー（警告）あり
		}
		
		/**
		 * GAのAPI「delete」のレスポンスをチェックする
		 */
		protected boolean checkResponseDel(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if ( !(isNull(status) || !status.isZero()) ) {
				return true;	// エラー（警告）なし
			}
			
			List<Map<String, String>> res = new ArrayList<>();
			if (response.containsKey("StatusDetail")) {
				res.addAll(convToMap(response.get("StatusDetail")));
			}
			
			// レスポンス解析後のマップのキー項目は小文字で統一する（convToMap のキー項目は小文字で統一されているので）
			for (Map<String, String> m : res) {
				if (!m.containsKey("message")) {
					continue;
				}
				
				StringBuffer msg = new StringBuffer(m.get("message").toString());
				if (m.containsKey("itemname")) {
					msg.append(System.lineSeparator());
					msg.append("ItemName:" + m.get("itemname"));
				}
				ifL.forEach(bindR -> {
					MCMessagePool.add(bindR, null, MSLAL0704, msg);
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				});
			}
			
			if (response.containsKey("Message")) {
				ifL.forEach(bindR -> {
					// { "Message": "この伝票No.は登録されていません｡（E001245）}
					MCMessagePool.add(bindR, null, MSLAL0704, response.get("Message").toString());
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				});
			}
			
			return false;	// エラー（警告）あり
		}
		
		/**
		 * GAのAPI「close/detail」のレスポンスをチェックする
		 */
		protected boolean checkResponseCloseDetail(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if ( !(isNull(status) || !status.isZero()) ) {
				return true;	// エラー（警告）なし
			}
			
			List<Map<String, String>> res = new ArrayList<>();
			if (response.containsKey("StatusDetail")) {
				res.addAll(convToMap(response.get("StatusDetail")));
			}
			
			// レスポンス解析後のマップのキー項目は小文字で統一する（convToMap のキー項目は小文字で統一されているので）
			for (Map<String, String> m : res) {
				if (!m.containsKey("message")) {
					continue;
				}
				
				StringBuffer msg = new StringBuffer(m.get("message").toString());
				if (m.containsKey("itemname")) {
					msg.append(System.lineSeparator());
					msg.append("ItemName:" + m.get("itemname"));
				}
				ifL.forEach(bindR -> {
					MCMessagePool.add(bindR, null, MSLAL0704, msg);
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				});
			}
			
			if (response.containsKey("Message")) {
				ifL.forEach(bindR -> {
					//  {"Message": "設定されたデータは存在しません｡（E001000）}
					MCMessagePool.add(bindR, null, MSLAL0704, response.get("Message").toString());
					bindR.setBooleanNE(_$snd_to_err_flg, true);
				});
			}
			
			return false;	// エラー（警告）あり
		}
		
		/**
		 * GAのAPI「delete」を実行する。
		 * @param req 通信リクエスタ
		 * @param url リクエストURL
		 * @param ifL 送信ＩＦリスト
		 * @return GAの送信結果
		 */
		protected String sendRequestDel(MCSimpleRequester req, String url, MCList<?> ifL) {
			MCList<?> ifDelL = ifL.subList(r -> !isNull(r.getStringNE("internalNo")));
			if (ifDelL.isEmpty()) {
				return null;
			}
			// 取消は発注単位
			String delUrl =  url.replaceFirst("/mcframe", "") + REQ_TYPE_DEL[1];
			MCList<?> reqL = ifDelL.distinctNE(MST_PO_SEND_IF_R.$po_no);
			String res = req.request(delUrl, getRequestBody(REQ_TYPE_DEL[0], reqL));

			checkResponse(REQ_TYPE_DEL[0], res, ifDelL);
			return res;
		}
		
		/**
		 * GAのAPI「save」を実行する。
		 * @param req 通信リクエスタ
		 * @param url リクエストURL
		 * @param ifL 送信ＩＦリスト
		 * @return GAの送信結果
		 */
		protected String sendRequestSave(MCSimpleRequester req, String url, MCList<?> ifL) {
			// 登録・訂正は明細単位
			String saveUrl = url + REQ_TYPE_SAVE[1];
			String res = req.request(saveUrl, getRequestBody(REQ_TYPE_SAVE[0], ifL));
			checkResponse(REQ_TYPE_SAVE[0], res, ifL);
			return res;
		}
		
		/**
		 * GAのAPI「close/detail」を実行する。
		 * @param req 通信リクエスタ
		 * @param url リクエストURL
		 * @param ifL 送信ＩＦリスト
		 * @return GAの送信結果
		 */
		protected String sendRequestCloseDetail(MCSimpleRequester req, String url, MCList<?> ifL) {
			// 打切は明細単位
			String closeDetailUrl = url.replaceFirst("/mcframe", "") + REQ_TYPE_CLOSE[1];
			String res = req.request(closeDetailUrl, getRequestBody(REQ_TYPE_CLOSE[0], ifL));
			checkResponse(REQ_TYPE_CLOSE[0], res, ifL);
			return res;
		}
		
		/**
		 * GAのAPI「close/detail/cancel/noneedstatus」を実行する。
		 * @param req 通信リクエスタ
		 * @param url リクエストURL
		 * @param ifL 送信ＩＦリスト
		 * @return GAの送信結果
		 */
		protected String sendRequestCloseDetailRet(MCSimpleRequester req, String url, MCList<?> ifL) {
			// 打切は明細単位
			String closeDetailRetUrl = url.replaceFirst("/mcframe", "") + REQ_TYPE_CLOSE_RET[1];
			String res = req.request(closeDetailRetUrl, getRequestBody(REQ_TYPE_CLOSE_RET[0], ifL));
			checkResponse(REQ_TYPE_CLOSE_RET[0], res, ifL);
			return res;
		}
		
		/**
		 * GAのAPI「delete」の前処理。
		 * @param resb GAのAPI「search」の結果
		 * @param ifL 送信ＩＦリスト
		 */
		protected void preRequestDel(String resb, MCList<?> ifL) {
			JSON jsonConverter = PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ());
			Map<String, Object> response = jsonConverter.toMap(resb);

			MCIndexKey idx = ifL.createIndex(MST_PO_SEND_IF_R.$po_no);

			// search のレスポンスから、取消に必要な項目を取得する
			// convToMapのキー項目はすべて小文字なので、小文字でgetする
			List<Map<String, String>> res = convToMap(response.get("Data"));
			for (Map<String, String> map : res) {
				for (MCRow r : ifL.subList(idx, map.get("customerno"))) {
					r.setStringNE("voucherNo", map.get("voucherno"));
					r.setStringNE("internalNo", map.get("header_internalno"));
					r.setStringNE("changeCount", map.get("header_changecount"));
				}
			}
		}
		
		/**
		 * GAのAPI「save」の前処理。
		 * @param resb GAのAPI「search」の結果
		 * @param ifL 送信ＩＦリスト
		 */
		protected void preRequestSave(String resb, MCList<?> ifL) {
			JSON jsonConverter = PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ());
			Map<String, Object> response = jsonConverter.toMap(resb);

			MCIndexKey idx = ifL.createIndex(MST_PO_SEND_IF_R.$po_no);
			MCIndexKey dtlIdx = ifL.createIndex(MST_PO_SEND_IF_R.$po_d_no);

			// search のレスポンスから、更新に必要な項目を取得する
			// convToMapのキー項目はすべて小文字なので、小文字でgetする
			List<Map<String, String>> res = convToMap(response.get("Data"));
			for (Map<String, String> map : res) {
				for (MCRow r : ifL.subList(idx, map.get("customerno"))) {
					r.setStringNE("voucherNo", map.get("voucherno"));
				}
				for (MCRow r : ifL.subList(dtlIdx, map.get("detail_flexcode"))) {
					r.setStringNE("rowNo", map.get("rowno"));
					if (r.getBooleanNE(MST_PO_SEND_IF_R.$abort_flg) && !isSame(map.get("detail_status") , GA_CLOSE_STS)) {
						_abortIfL.add(r);
					}
					if (!r.getBooleanNE(MST_PO_SEND_IF_R.$abort_flg) && isSame(map.get("detail_status") , GA_CLOSE_STS)) {
						_abortRetIfL.add(r);
					}
				}
			}
		}
		
		/**
		 * GAのAPI呼出の共通パラメータを取得する。
		 * @param ifR 送信IFデータ
		 * @return GAのAPI呼出の共通パラメータ
		 */
		protected Map<String, String> getGaParmMap(MCRow ifR) {
			
			MAM_EXT_SYS_USR_R sysUserR = getExtSysUsrNE(ifR.getStringNE(MST_PO_SEND_IF_R.$ext_sys_cd), mcframe.serverCore.sys.MCSys.user.ID());
			if(sysUserR == null) {
				sysUserR = MAM_EXT_SYS_USR_R.create();
			}
			String company = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR1, up0().get(0).if_proc_typ());
			String userKey = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR2, up0().get(0).if_proc_typ());
			Map<String, String> gaParmMap = new HashMap<>();
			gaParmMap.put("LANG", nvl(sysUserR.ext_sys_str1(), "ja-JP"));
			gaParmMap.put("USER", sysUserR.ext_sys_usr_cd());
			gaParmMap.put("PASSWD", sysUserR.ext_sys_pass());
			gaParmMap.put("USERKEY", userKey);
			gaParmMap.put("COMPANY", company);
			
			return gaParmMap;
		}
		
		/**
		 * 取消を判定する（打切を取消とみなす）。
		 * @param ifR 送信IFデータ
		 * @return データ更新区分が「削除」の場合、trueを返す
		 */
		protected boolean isCancel(MCRow ifR) {
			return MAC_DATA_CRUD_TYP.isDEL(ifR.getStringNE(MST_PO_SEND_IF_R.$data_crud_typ));
		}
	}

	/**
	 * 取引先マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
	protected void initBpCache(MCList<?> cndL) {
		object(CLAZZ)._bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(
			MCQueryApiBuilder.create(
				MAM_BP_R.create("T")),
				cndL,
				MST_PO_SEND_IF_R.$sppl_cd
			);
	}
	protected MAM_BP_R getBpCache(String bpCd) {
		return object(CLAZZ)._bpCache.get(bpCd);
	}
	
	/** 小文字キーのMapに変換する */
	protected List<Map<String, String>> convToMap(Object data) {
		List<Map<String, Object>> srcMap = (List<Map<String, Object>>)data;
		List<Map<String, String>> destMap = new ArrayList<>();

		for(Map<String, Object> map: srcMap) {
			Map<String, String> m = new LinkedHashMap<>();
			map.entrySet().forEach(r -> m.put(r.getKey().toLowerCase(), r.getValue() == null ? null : r.getValue().toString()));
			destMap.add(m);
		}
		return destMap;
	}

	//FMCB CUSTOM END
}