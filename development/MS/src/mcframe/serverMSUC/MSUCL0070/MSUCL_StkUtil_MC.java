package mcframe.serverMSUC.MSUCL0070;

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
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_StkUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_StkUtil_MC extends MSUCL_StkUtil_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSUCL_StkUtil> CLAZZ = MSUCL_StkUtil.class;

	/**
	 * インボイスＮＯを発番するとともに、インボイスＮＯテーブルに登録する。
	 * @param args
	 * @param iv_no
	 */
	public static String getNumIv(ElmArgsR args, String iv_no) {
		return object(CLAZZ).getIvNo(args, iv_no);
	}
	/**
	 * インボイスＮＯの発番処理を行います。<br>
	 * 下記の引数を渡してください。それ以外の引数は無効です。<br>
	 * 	co_cd:	co_cd<br>
	 * 	dt:		today
	 * 
	 * @param args 発番処理に必要な要素引数
	 * @param iv_no 引数に指定した場合は指定した番号が返る
	 * @return インボイスＮＯ
	 */
	protected String getIvNo(ElmArgsR args, String iv_no) {
		
		// NULL文字
		if (MAC_STR.isNULL_VAL(iv_no)) {
			throw new MCAppException(args, null, MSBEL0146, iv_no); 
		}
		
		iv_no = isNull(iv_no) ? getNum(MAC_NUM_BIZ_TYP.IV, args) : iv_no;
		
		MST_IV_NO_R r = MST_IV_NO_R.create();
		MST_IV_NO_R t = MST_IV_NO_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r.iv_no(iv_no);
		try {
			dbInsert(createSqlId(LOGIC_ID, t, "I01"), r, r_bldr);
		}
		catch (MCException ex) {
			if (isDupValOnIndex(ex)) {
				throw new MCAppException(args, null, MSBEL0147, iv_no);
			}
			throw ex;
		}
		
		return iv_no;
	}


// 出荷関連
	/**
	 * 出荷関連の受払予定区分を取得する
	 * 
	 * @param trdPtnTyp	取引パタン区分
	 * @Param stkIdTyp	在庫識別区分
	 * @param isShip	出荷済か(出荷済の場合trueを設定する)
	 * @param isEx	輸出取引か(輸出取引の場合trueを設定する)
	 */
	public static String getIoSchdTypForShip(
		String trdPtnTyp, String stkIdTyp, boolean isShip, boolean isEx) {
		return object(CLAZZ)._getIoSchdTypForShip(trdPtnTyp, stkIdTyp, isShip, isEx);
	}
	protected String _getIoSchdTypForShip(
		String trdPtnTyp, String stkIdTyp, boolean isShip, boolean isEx) {

		if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)) {
			// 預りの場合は「出荷」
			if (MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
				return MSC_IO_SCHD_TYP.SHIP_OUT.value();
			}
			return MSC_IO_SCHD_TYP.SLS.value();
		}
		else if (MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp)) {
			return MSC_IO_SCHD_TYP.SHIP_OUT.value();
		}
		else {
			// 輸出＆未出荷
			if (isEx && !isShip) {
				return MSC_IO_SCHD_TYP.SHIP_OUT_EX.value();
			}
			else {
				if (MAC_TRD_PTN_TYP.isXFR(trdPtnTyp)) {
					return MSC_IO_SCHD_TYP.XFR_GI.value();
				}
				else if (MAC_TRD_PTN_TYP.isXFR_RTN(trdPtnTyp)) {
					return MSC_IO_SCHD_TYP.XFR_RTN_GI.value();
				}
				else if (MAC_TRD_PTN_TYP.isPROV(trdPtnTyp)) {
					return MSC_IO_SCHD_TYP.XFR_GI_PROV.value();
				}
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp)) {
					return MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value();
				}
			}
		}
		return null;
	}

	/**
	 * 出荷関連の受払予定状況区分を取得する
	 * 
	 * @param trdPtnTyp			取引パタン区分
	 * @param dlvInstRcptNo	出荷予定.納入指示受領NO
	 * @param sloPrmsNo			出荷予定.受注納期回答NO
	 * @param purcDdlvFlg		仕入直送か(仕入直送の場合trueを設定する)
	 * @param isInst					指図済みか(指図済の場合trueを設定する)
	 * @param isShip				出荷済か(出荷済の場合trueを設定する)
	 * @param isIvShip				IV出荷済か(IV出荷済の場合trueを設定する)
	 * @param stkIdTyp			在庫識別区分
	 * @return
	 */
	public static String getIoSchdStsTypForShip(
		String trdPtnTyp, String dlvInstRcptNo, String sloPrmsNo, boolean purcDdlvFlg,
 		boolean isInst, boolean isShip, boolean isIvShip) {
		return getIoSchdStsTypForShip(
			trdPtnTyp, dlvInstRcptNo, sloPrmsNo, purcDdlvFlg, isInst, isShip, isIvShip, null);
	}
	public static String getIoSchdStsTypForShip(
		String trdPtnTyp, String dlvInstRcptNo, String sloPrmsNo, boolean purcDdlvFlg,
 		boolean isInst, boolean isShip, boolean isIvShip, String stkIdTyp) {
		return object(CLAZZ)._getIoSchdStsTypForShip(
			trdPtnTyp, dlvInstRcptNo, sloPrmsNo, purcDdlvFlg, isInst, isShip, isIvShip, stkIdTyp);
	}
	protected String _getIoSchdStsTypForShip(
		String trdPtnTyp,String dlvInstRcptNo, String sloPrmsNo, boolean purcDdlvFlg,
 		boolean isInst, boolean isShip, boolean isIvShip, String stkIdTyp) {
		if (isIvShip) {
			// インボイス出荷実績あり＝「輸出済」
			return MSC_IO_SCHD_STS_TYP.EX.value();
		}
		else if (isShip) {
			// 出荷実績あり＝「出荷済」
			return MSC_IO_SCHD_STS_TYP.SHIP.value();
		}
		else if (isInst) {
			// 出荷指図あり＝「指図済」
			return MSC_IO_SCHD_STS_TYP.ORD.value();
		}
		else if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)) {
			if (MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
				// 預り＝「予定」
				return MSC_IO_SCHD_STS_TYP.SCHD.value(); 
			}
			else if (isNull(dlvInstRcptNo) && isNull(sloPrmsNo)) {
				// ※当サービスでは「受注直送」の受払予定は扱わない
				// 納入指示受領NO、および納期回答NOが設定されていない＝「受注」
				return purcDdlvFlg ?
					MSC_IO_SCHD_STS_TYP.DDLV_SLO.value() : MSC_IO_SCHD_STS_TYP.SLO.value();
			}
			else if (!isNull(sloPrmsNo)) {
				// 納期回答NOあり＝「納期回答」
				return MSC_IO_SCHD_STS_TYP.PRMS.value();
			}
			else {
				// 納入指示受領NOあり＝「納入指示」
				return MSC_IO_SCHD_STS_TYP.DLV_INST.value();
			}
		}
		else {
			// 上記以外＝「予定」
			return MSC_IO_SCHD_STS_TYP.SCHD.value(); 
		}
	}

	// 移動関連
	/**
	 * 移動関連の受払予定区分を取得する。
	 * @param trd_ptn_typ
	 * @return
	 */
	public static String getIoSchdTypForMove(String trd_ptn_typ) {
		if(isSame(trd_ptn_typ, MAC_TRD_PTN_TYP.XFR.value())) {
			return MSC_IO_SCHD_TYP.MOVE_GI.value();
		}
		else if(isSame(trd_ptn_typ, MAC_TRD_PTN_TYP.XFR_RTN.value())) {
			return MSC_IO_SCHD_TYP.MOVE_RTN_GI.value();
		}
		else if(isSame(trd_ptn_typ, MAC_TRD_PTN_TYP.PROV.value())) {
			return MSC_IO_SCHD_TYP.MOVE_GI_PROV.value();
		}
		else if(isSame(trd_ptn_typ, MAC_TRD_PTN_TYP.PROV_RTN.value())) {
			return MSC_IO_SCHD_TYP.MOVE_RTN_GI_PROV.value();
		} 
		return null;
	}

	/**
	 * 出庫場所の発注先と入庫場所の発注先から
	 * 利用可能な在庫識別区分か確認する。
	 * @param row 確認する値が格納されたMCRow
	 * @param gi_loc_cd_col 出庫場所ＣＤのカラム
	 * @param gi_sppl_cd_col 出庫場所発注先ＣＤのカラム
	 * @param gr_loc_cd_col 入庫場所ＣＤのカラム
	 * @param gr_sppl_cd_col 入庫場所発注先ＣＤのカラム
	 * @param iv_trd_flg_col インボイス取引フラグのカラム nullの場合falseとみなします(移動での利用を想定)。
	 * @param stk_id_typ_col 在庫識別区分のカラム
	 * @param xfr_act_flg 移動実績フラグ
	 * @param ship_act_flg 出荷実績フラグ
	 * @return メッセージリスト
	 */
	public static MCMessageList checkStkUtilStkIdTyp(
			MCRow row,
			String gi_loc_cd_col,
			String gi_sppl_cd_col,
			String gr_loc_cd_col,
			String gr_sppl_cd_col,
			String iv_trd_flg_col,
			String stk_id_typ_col,
			boolean xfr_act_flg,
			boolean ship_act_flg) {
		return object(CLAZZ)._checkStkUtilStkIdTyp(
				row,
				gi_loc_cd_col,
				gi_sppl_cd_col,
				gr_loc_cd_col,
				gr_sppl_cd_col,
				iv_trd_flg_col,
				stk_id_typ_col,
				xfr_act_flg,
				ship_act_flg);
	}

	protected MCMessageList _checkStkUtilStkIdTyp(
			MCRow row,
			String gi_loc_cd_col,
			String gi_sppl_cd_col,
			String gr_loc_cd_col,
			String gr_sppl_cd_col,
			String iv_trd_flg_col,
			String stk_id_typ_col,
			boolean xfr_act_flg,
			boolean ship_act_flg) {
		MCMessageList list = new MCMessageList();
		String gi_loc_cd = row.getStringNE(gi_loc_cd_col);
		String gi_sppl_cd = row.getStringNE(gi_sppl_cd_col);
		String gr_loc_cd = row.getStringNE(gr_loc_cd_col);
		String gr_sppl_cd = row.getStringNE(gr_sppl_cd_col);
		String stk_id_typ = row.getStringNE(stk_id_typ_col);
		boolean iv_trd_flg = isNull(iv_trd_flg_col) ? false : row.getBoolean(iv_trd_flg_col);

		// インボイス取引対象である
		if (iv_trd_flg == true) {
			//　自社 to 自社
			if (isNull(gi_sppl_cd) && isNull(gr_sppl_cd)) {
				if (!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
						&& !MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
						&& !MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
						&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)) {
					list.add(new MCMessage(row, null, MSBEL0044,
							gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
				}
			}
			//　自社 to 外注
			else if (isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
				if (!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
						&& !MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
						&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)) {
					list.add(new MCMessage(row, null, MSBEL0165,
							gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
				}
			}
			//　外注 to 外注
			else if (!isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
				if (!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
						&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
						&& !MSC_STK_ID_TYP.isONR_PROV(stk_id_typ)) {
					list.add(new MCMessage(row, null, MSBEL0043,
							gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
				}
			}
		}
		// インボイス取引対象でない
		else {
			// 自社 to 自社
			if (isNull(gi_sppl_cd) && isNull(gr_sppl_cd)) {
				if(xfr_act_flg == true) {
					if(!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
							&& !MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
							&& !MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
							&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
							&& !MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stk_id_typ)
							&& !MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stk_id_typ)) {
						list.add(new MCMessage(row, null, MSBEL0340,
								gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
						}
				}
				else if(ship_act_flg == true) {
					if(!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
							&& !MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
							&& !MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
							&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
							&& !MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stk_id_typ)
							&& !MSC_STK_ID_TYP.isCSTSTK(stk_id_typ)) {
						list.add(new MCMessage(row, null, MSBEL0341,
								gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
					}
				}
				else {
					if(!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
							&& !MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
							&& !MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
							&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)) {
						list.add(new MCMessage(row, null, MSBEL0040,
								gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
					}
				}
			}
			// 自社 to 外注
			else if (isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
				if(!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
						&& !MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
						&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)) {
					list.add(new MCMessage(row, null, MSBEL0042,
							gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
				}					
			}
			// 外注 to 自社
			else if (!isNull(gi_sppl_cd) && isNull(gr_sppl_cd)) {
				if(!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
						&& !MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
						&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
						&& !MSC_STK_ID_TYP.isONR_PROV(stk_id_typ)) {
					list.add(new MCMessage(row, null, MSBEL0041,
							gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
				}
			}
			// 外注 to 外注 (同一発注先かどうかによらず)
			else if (!isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
				if(!MSC_STK_ID_TYP.isCOSTK(stk_id_typ)
						&& !MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
						&& !MSC_STK_ID_TYP.isONR_PROV(stk_id_typ)) {
					list.add(new MCMessage(row, null, MSBEL0043,
							gi_loc_cd, gr_loc_cd, stk_id_typ, toDispGUIIndex(row)));
				}					
			}
		}
		return list;
	}

	/**
	 * 有償支給先ＦＬＧと資産管理区分から
	 * 利用可能な支給区分か確認する。
	 * @param row 確認する値が格納されたMCRow
	 * @param itm_cd_col 品目ＣＤのカラム
	 * @param itm_sub1_col 枝番１カラム
	 * @param itm_sub2_col 枝番２のカラム
	 * @param itm_sub3_col 枝番３のカラム
	 * @param prsppl_cd_col 支給先のカラム
	 * @param onr_prsppl_flg_col 有償支給先ＦＬＧのカラム
	 * @param asset_mng_typ_col 資産管理区分のカラム
	 * @param prov_typ_col 支給区分のカラム
	 * @return メッセージリスト
	 */
	public static MCMessageList checkStkUtilProvTyp(
			MCRow row,
			String itm_cd_col,
			String itm_sub1_col,
			String itm_sub2_col,
			String itm_sub3_col,
			String prsppl_cd_col,
			String onr_prsppl_flg_col,
			String asset_mng_typ_col,
			String prov_typ_col) {
		return object(CLAZZ)._checkStkUtilProvTyp(
				row,
				itm_cd_col,
				itm_sub1_col,
				itm_sub2_col,
				itm_sub3_col,
				prsppl_cd_col,
				onr_prsppl_flg_col,
				asset_mng_typ_col,
				prov_typ_col);
	}

	protected MCMessageList _checkStkUtilProvTyp(
			MCRow row,
			String itm_cd_col,
			String itm_sub1_col,
			String itm_sub2_col,
			String itm_sub3_col,
			String prsppl_cd_col,
			String onr_prsppl_flg_col,
			String asset_mng_typ_col,
			String prov_typ_col) {
		MCMessageList list = new MCMessageList();
		String itm_cd = row.getStringNE(itm_cd_col);
		String itm_sub1 = row.getStringNE(itm_sub1_col);
		String itm_sub2 = row.getStringNE(itm_sub2_col);
		String itm_sub3 = row.getStringNE(itm_sub3_col);
		String prsppl_cd = row.getStringNE(prsppl_cd_col);
		boolean onr_prsppl_flg = row.getBooleanNE(onr_prsppl_flg_col);
		String asset_mng_typ = row.getStringNE(asset_mng_typ_col);
		String prov_typ = row.getStringNE(prov_typ_col);

		if(MAC_PROV_TYP.isSS(prov_typ)) {
			list.add(new MCMessage(row, null, MSBEL0221, toDispGUIIndex(row)));
		}
		else if(MAC_PROV_TYP.isONR_PROV(prov_typ)) {
			if(!onr_prsppl_flg) {
				list.add(new MCMessage(row, null, MSBEL0270, prsppl_cd, toDispGUIIndex(row)));
			}
			if(!MAC_ASSET_MNG_TYP.isMNG(asset_mng_typ)) {				
				list.add(new MCMessage(row, null, MSBEL0271,
						toDispItm(itm_cd, itm_sub1, itm_sub2, itm_sub3),
						asset_mng_typ,
						toDispGUIIndex(row)));
			}
		}
		return list;
	}

	/**
	 * 取引パタン区分と出庫場所、入庫場所の関係を確認する。
	 * @param row 確認する値が格納されたMCRow
	 * @param trd_cd_col 取引ＣＤのカラム
	 * @param trd_ptn_typ_col 取引パタン区分のカラム
	 * @param gi_loc_cd_col 出庫場所のカラム
	 * @param gi_sppl_cd_col 出庫場所の発注先ＣＤのカラム
	 * @param gr_loc_cd_col 入庫場所のカラム
	 * @param gr_sppl_cd_col 入庫場所の発注先ＣＤのカラム
	 * @return メッセージリスト
	 */
	public static MCMessageList checkStkUtilTrdPtnTypAndGiGrLoc(
			MCRow row,
			String trd_cd_col,
			String trd_ptn_typ_col,
			String gi_loc_cd_col,
			String gi_sppl_cd_col,
			String gr_loc_cd_col,
			String gr_sppl_cd_col) {
		return object(CLAZZ)._checkStkUtilTrdPtnTypAndGiGrLoc(
				row,
				trd_cd_col,
				trd_ptn_typ_col,
				gi_loc_cd_col,
				gi_sppl_cd_col,
				gr_loc_cd_col,
				gr_sppl_cd_col);
	}

	protected MCMessageList _checkStkUtilTrdPtnTypAndGiGrLoc(
			MCRow row,
			String trd_cd_col,
			String trd_ptn_typ_col,
			String gi_loc_cd_col,
			String gi_sppl_cd_col,
			String gr_loc_cd_col,
			String gr_sppl_cd_col) {
		MCMessageList list = new MCMessageList();
		String trd_cd = row.getStringNE(trd_cd_col);
		String trd_ptn_typ = row.getStringNE(trd_ptn_typ_col);
		String gi_loc_cd = row.getStringNE(gi_loc_cd_col);
		String gi_sppl_cd = row.getStringNE(gi_sppl_cd_col);
		String gr_loc_cd = row.getStringNE(gr_loc_cd_col);
		String gr_sppl_cd = row.getStringNE(gr_sppl_cd_col);

		if(MAC_TRD_PTN_TYP.isXFR(trd_ptn_typ)
				|| MAC_TRD_PTN_TYP.isXFR_RTN(trd_ptn_typ)) {
			if(!isNullAnd(gi_sppl_cd, gr_sppl_cd)) {
				list.add(new MCMessage(
						row,
						null,
						MSBEL0272,
						trd_cd,
						trd_ptn_typ,
						gi_loc_cd,
						gr_loc_cd,
						toDispGUIIndex(row)));
			}
		}
		else if(MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ)) {
			if(isNull(gr_sppl_cd)) {
				list.add(new MCMessage(
						row,
						null,
						MSBEL0273,
						trd_cd,
						trd_ptn_typ,
						gr_loc_cd,
						toDispGUIIndex(row)));
			}
		}
		else if(MAC_TRD_PTN_TYP.isPROV_RTN(trd_ptn_typ)) {
			if(isNull(gi_loc_cd)) {
				list.add(new MCMessage(
						row,
						null,
						MSBEL0278,
						toDispGUIIndex(row)));
			}
			else if(isNull(gi_sppl_cd)) {
				list.add(new MCMessage(
						row,
						null,
						MSBEL0274,
						trd_cd,
						trd_ptn_typ,
						gi_loc_cd,
						toDispGUIIndex(row)));
			}
		}
		return list;
	}

	/**
	 * 取引パタン区分が支給の場合、良品区分が良品であることの確認。
	 * @param row 確認する値が格納されたMCRow
	 * @param trd_cd_col 取引ＣＤのカラム
	 * @param trd_ptn_typ_col 取引パタン区分のカラム
	 * @param quality_typ_col 良品区分のカラム
	 * @return メッセージリスト
	 */
	public static MCMessageList checkStkUtilQualityTyp(
			MCRow row,
			String trd_cd_col,
			String trd_ptn_typ_col,
			String quality_typ_col) {
		return object(CLAZZ)._checkStkUtilQualityTyp(
				row,
				trd_cd_col,
				trd_ptn_typ_col,
				quality_typ_col);
	}

	protected MCMessageList _checkStkUtilQualityTyp(
			MCRow row,
			String trd_cd_col,
			String trd_ptn_typ_col,
			String quality_typ_col) {
		MCMessageList list = new MCMessageList();
		String trd_cd = row.getStringNE(trd_cd_col);
		String trd_ptn_typ = row.getStringNE(trd_ptn_typ_col);
		String quality_typ = row.getStringNE(quality_typ_col);

		if(MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ)
				&& !MAC_QUALITY_TYP.isGOOD(quality_typ)) {
			list.add(new MCMessage(
					row,
					null,
					MSBEL0277,
					trd_cd,
					trd_ptn_typ,
					quality_typ,
					toDispGUIIndex(row)));
		}
		return list;
	}

	// 他勘定出庫関連
	/**
	 * 他勘定出庫関連の受払予定区分を取得する。
	 * @param trd_ptn_typ
	 * @return
	 */
	public static String getIoSchdTypForAcXfr(String trd_ptn_typ) {
		if(isSame(trd_ptn_typ, MAC_TRD_PTN_TYP.STK_OTH_GI.value())) {
			return MSC_IO_SCHD_TYP.ACXFR_GI.value();
		} else if(isSame(trd_ptn_typ, MAC_TRD_PTN_TYP.SCRP.value())) {
			return MSC_IO_SCHD_TYP.SCRP.value();
		} 
		return null;
	}

	// 在庫チェック
	/**
	 * 在庫発生時における、下記区分値の組み合わせの妥当性をチェックする<br>
	 * ・在庫識別区分<br>
	 * ・積送品区分<br>
	 * ・在庫検査区分<br>
	 * ・良品区分<br>
	 * ・在庫取引先（なしor発注先or得意先）<br>
	 * ・確定ＮＯ区分あるいは確定ＮＯＦＬＧ<br>
	 * ・在庫着荷先（なしor発注先or納品先）<br>
	 * ・場所（社内or外注）<br>
	 * 
	 * @param r			上記値を含むrow
	 * @return	OKの場合true<br>
	 * 			組み合わせが不可、値が取得できない場合はfalse
	 */
	public static boolean chkStkPtn(MCRow r) {
		return object(CLAZZ)._chkStkPtn(r);
	}
	protected boolean _chkStkPtn(MCRow r) {
		Comparable[] obj = init(r);
		
		int a, b;
		boolean ng = false;
		for (Comparable[] pat_r : _patterns) {
			int i = 0;
			for (Comparable val : pat_r) {
				ng = false;
				switch (i) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 5:
					case 7:
						if (!isSame(obj[i], val)) {ng = true;}
						break;
					case 4:
					case 6:
						a = (int) val;
						b = (int) obj[i];
						if ((b & a) != a) {ng = true;}
						break;
				}
				if (ng) break;
				i++;
			}
			if (!ng) return true;
		}
		return false;
	}
	
	/**
	 * 初期設定
	 */
	protected Comparable[] init(MCRow r) {
		String stk_id_typ = r.getStringNE(MST_STK_R.$stk_id_typ);
		String in_xfr_typ = r.getStringNE(MST_STK_R.$in_xfr_typ);
		String stk_insp_typ = r.getStringNE(MST_STK_R.$stk_insp_typ);
		String quality_typ = r.getStringNE(MST_STK_R.$quality_typ);
		int stk_bp_typ = setBpTyp(r.getStringNE(MST_STK_R.$stk_bp_cd));
		String fix_no_typ = r.getStringNE(MST_STK_R.$fix_no_typ);
		boolean fix_no_flg;
		if (!isNull(fix_no_typ)) {
			fix_no_flg = !MSC_FIX_NO_TYP.isNON(fix_no_typ);
		}
		else {
			fix_no_flg = r.getBooleanNE("fix_no_flg");
		}
		int stk_arrv_bp_typ = setBpTyp(r.getStringNE(MST_STK_R.$stk_arrv_bp_cd));
		String loc_typ = setLocTyp(r.getStringNE(MST_STK_R.$loc_cd));
		
		return new Comparable[] {stk_id_typ, in_xfr_typ, stk_insp_typ, quality_typ, stk_bp_typ, fix_no_flg, stk_arrv_bp_typ, loc_typ};
	}
	
	protected static final String _in = "in";
	protected static final String _out = "out";
	protected static final int _null = 1;
	protected static final int _sppl = 2;
	protected static final int _cst = 4;
	protected static final int _dlv = 8;
	protected static final int _tdlv = 16;
	
	protected static final Comparable[][] _patterns =
			new Comparable[][] {
		{"1", "1", "1", "1", _null, true, _sppl, _out},
		{"1", "1", "1", "1", _null, true, _null, _in},
		{"1", "1", "1", "2", _null, true, _null, _in},
		{"1", "1", "1", "3", _null, true, _sppl, _out},
		{"1", "1", "1", "3", _null, true, _null, _in},
		{"1", "1", "1", "4", _null, true, _sppl, _out},
		{"1", "1", "1", "4", _null, true, _null, _in},
		{"1", "1", "2", "1", _null, true, _sppl, _out},
		{"1", "1", "2", "1", _null, true, _null, _in},
		{"1", "1", "2", "2", _null, true, _null, _in},
		{"1", "1", "2", "3", _null, true, _sppl, _out},
		{"1", "1", "2", "3", _null, true, _null, _in},
		{"1", "1", "2", "4", _null, true, _sppl, _out},
		{"1", "1", "2", "4", _null, true, _null, _in},
		{"1", "1", "3", "1", _null, true, _sppl, _out},
		{"1", "1", "3", "1", _null, true, _null, _in},
		{"1", "1", "3", "2", _null, true, _null, _in},
		{"1", "1", "3", "3", _null, true, _sppl, _out},
		{"1", "1", "3", "3", _null, true, _null, _in},
		{"1", "1", "3", "4", _null, true, _sppl, _out},
		{"1", "1", "3", "4", _null, true, _null, _in},
		{"1", "1", "4", "1", _null, false, _null, _in},
		{"1", "1", "4", "1", _null, false, _tdlv, _in},
		{"1", "1", "4", "1", _null, false, _dlv, _in},
		{"1", "1", "4", "1", _null, false, _sppl, _out},
		{"1", "1", "4", "1", _null, true, _dlv, _in},
		{"1", "1", "4", "1", _null, true, _dlv, _in},
		{"1", "1", "4", "2", _null, false, _null, _in},
		{"1", "1", "4", "3", _null, false, _null, _in},
		{"1", "1", "4", "3", _null, false, _sppl, _out},
		{"1", "1", "4", "4", _null, false, _null, _in},
		{"1", "1", "4", "4", _null, false, _sppl, _out},
		{"1", "2", "4", "1", _null, false, _null, _in},
		{"1", "2", "4", "1", _sppl, true, _null, _in},
		{"1", "2", "4", "1", _sppl, true, _null, _out},
		{"1", "2", "4", "4", _null, false, _null, _in},
		{"2", "1", "4", "1", _cst, false, _null, _in},
		{"3", "1", "4", "1", _cst, false, _null, _in},
		{"4", "1", "1", "1", _sppl, true, _null, _in},
		{"4", "1", "1", "3", _sppl, true, _null, _in},
		{"4", "1", "1", "4", _sppl, true, _null, _in},
		{"4", "1", "2", "1", _sppl, true, _null, _in},
		{"4", "1", "2", "3", _sppl, true, _null, _in},
		{"4", "1", "2", "4", _sppl, true, _null, _in},
		{"4", "1", "3", "1", _sppl, true, _null, _in},
		{"4", "1", "3", "3", _sppl, true, _null, _in},
		{"4", "1", "3", "4", _sppl, true, _null, _in},
		{"4", "1", "4", "1", _sppl, false, _null, _in},
		{"4", "1", "4", "3", _sppl, false, _null, _in},
		{"4", "1", "4", "4", _sppl, false, _null, _in},
		{"5", "1", "1", "1", _sppl, true, _null, _in},
		{"5", "1", "1", "1", _sppl, true, _sppl, _out},
		{"5", "1", "1", "3", _sppl, true, _null, _in},
		{"5", "1", "1", "3", _sppl, true, _sppl, _out},
		{"5", "1", "1", "4", _sppl, true, _null, _in},
		{"5", "1", "1", "4", _sppl, true, _sppl, _out},
		{"5", "1", "2", "1", _sppl, true, _null, _in},
		{"5", "1", "2", "1", _sppl, true, _sppl, _out},
		{"5", "1", "2", "3", _sppl, true, _null, _in},
		{"5", "1", "2", "3", _sppl, true, _sppl, _out},
		{"5", "1", "2", "4", _sppl, true, _null, _in},
		{"5", "1", "2", "4", _sppl, true, _sppl, _out},
		{"5", "1", "3", "1", _sppl, true, _null, _in},
		{"5", "1", "3", "1", _sppl, true, _sppl, _out},
		{"5", "1", "3", "3", _sppl, true, _null, _in},
		{"5", "1", "3", "3", _sppl, true, _sppl, _out},
		{"5", "1", "3", "4", _sppl, true, _null, _in},
		{"5", "1", "3", "4", _sppl, true, _sppl, _out},
		{"5", "1", "4", "1", _sppl, true, _null, _in},
		{"5", "1", "4", "1", _sppl, true, _sppl, _out},
		{"5", "1", "4", "3", _sppl, true, _null, _in},
		{"5", "1", "4", "3", _sppl, true, _sppl, _out},
		{"5", "1", "4", "4", _sppl, true, _null, _in},
		{"5", "1", "4", "4", _sppl, true, _sppl, _out},
		{"6", "1", "1", "1", _sppl, true, _null, _in},
		{"6", "1", "1", "1", _sppl, true, _sppl, _out},
		{"6", "1", "1", "3", _sppl, true, _null, _in},
		{"6", "1", "1", "3", _sppl, true, _sppl, _out},
		{"6", "1", "1", "4", _sppl, true, _null, _in},
		{"6", "1", "1", "4", _sppl, true, _sppl, _out},
		{"6", "1", "2", "1", _sppl, true, _null, _in},
		{"6", "1", "2", "1", _sppl, true, _sppl, _out},
		{"6", "1", "2", "3", _sppl, true, _null, _in},
		{"6", "1", "2", "3", _sppl, true, _sppl, _out},
		{"6", "1", "2", "4", _sppl, true, _null, _in},
		{"6", "1", "2", "4", _sppl, true, _sppl, _out},
		{"6", "1", "3", "1", _sppl, true, _null, _in},
		{"6", "1", "3", "1", _sppl, true, _sppl, _out},
		{"6", "1", "3", "3", _sppl, true, _null, _in},
		{"6", "1", "3", "3", _sppl, true, _sppl, _out},
		{"6", "1", "3", "4", _sppl, true, _null, _in},
		{"6", "1", "3", "4", _sppl, true, _sppl, _out},
		{"6", "1", "4", "1", _sppl, false, _null, _in},
		{"6", "1", "4", "1", _sppl, false, _sppl, _out},
		{"6", "1", "4", "3", _sppl, false, _null, _in},
		{"6", "1", "4", "3", _sppl, false, _sppl, _out},
		{"6", "1", "4", "4", _sppl, false, _null, _in},
		{"6", "1", "4", "4", _sppl, false, _sppl, _out},
		{"7", "1", "1", "1", _sppl, true, _null, _in},
		{"7", "1", "1", "3", _sppl, true, _null, _in},
		{"7", "1", "1", "4", _sppl, true, _null, _in},
		{"7", "1", "2", "1", _sppl, true, _null, _in},
		{"7", "1", "2", "3", _sppl, true, _null, _in},
		{"7", "1", "2", "4", _sppl, true, _null, _in},
		{"7", "1", "3", "1", _sppl, true, _null, _in},
		{"7", "1", "3", "3", _sppl, true, _null, _in},
		{"7", "1", "3", "4", _sppl, true, _null, _in},
		{"7", "1", "4", "1", _sppl, false, _null, _in},
		{"7", "1", "4", "3", _sppl, false, _null, _in},
		{"7", "1", "4", "4", _sppl, false, _null, _in},
		{"7", "1", "4", "1", _sppl, false, _sppl, _out},
		{"8", "1", "4", "1", _sppl, false, _sppl, _out}
	};

	/**
	 * 場所が社内か外注か
	 */
	protected String setLocTyp(String loc_cd) {
		MAM_LOC_R locR = getLoc(loc_cd);
		if (isNull(locR.sppl_cd())) {
			return _in;
		}
			return _out;
	}

	/**
	 * 取引先の種類により値をセットする
	 */
	protected int setBpTyp(String bp_cd) {
		if (MAC_STR.isNULL_VAL(bp_cd)) return _null;
		MAM_BP_R bpR = getBp(bp_cd);
		int ret = 0;
		if (bpR.sppl_flg()) ret = ret + _sppl;
		if (bpR.cst_flg()) ret = ret + _cst;
		if (bpR.dlv_flg()) ret = ret + _dlv;
		if (bpR.tdlv_flg()) ret = ret + _tdlv;
		return ret;
	}


	// キャッシュ
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
	protected void _initBpCache(MCList<?> dtlL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL,
				MAM_BP_R.$bp_cd);
	}
	protected static void initBpCache(MCList<?> dtlL) {
		object(CLAZZ)._initBpCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAM_BP_R> getBpCache() {
		if (object(CLAZZ)._bpCache == null) {
			initBpCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._bpCache;
	}
	protected static MAM_BP_R getBp(String bp_cd) {
		return getBpCache().get(bp_cd);
	}

	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void _initLocCache(MCList<?> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL,
				MAM_LOC_R.$loc_cd);
	}
	protected static void initLocCache(MCList<?> dtlL) {
		object(CLAZZ)._initLocCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		if (object(CLAZZ)._locCache == null) {
			initLocCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._locCache;
	}
	protected static MAM_LOC_R getLoc(String loc_cd) {
		return getLocCache().get(loc_cd);
	}
	//FMCB CUSTOM END
}