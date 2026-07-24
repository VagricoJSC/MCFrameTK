package mcframe.serverMSBE.MSBEL6600;

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
import mcframe.serverMSBE.MSBEL6600.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL6600.Query.*;
import static mcframe.serverMAUC.MAUCL0080.MAUCL_StdUpriUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMABC.MABCL5010.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StktkActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StktkActService_MC extends MSBEL_StktkActService_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSBEL_StktkActService> CLAZZ = MSBEL_StktkActService.class;

	// キャッシュ
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void _initLocCache(MCList<?> dtlL) {
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(
				MCQueryApiBuilder.create(MAM_LOC_R.create("T")), dtlL,MAM_LOC_R.$loc_cd);
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


	/**
	 * StktkAct_Srch01オペレーション.<p>
	 *
	 * 実棚情報を検索します。<br>
	 */
	public class StktkAct_Srch01 extends MSBEL_StktkActService_MC_A.StktkAct_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			MCQueryPlan sql = MSBEL6600_MST_STKTK_ACT_S01();
			
			// 実棚入力可能のみ
			up0().addStringColumn("only_enable_true", toTrueStr(up0().only_enable_flg()));
			// 入力済データ含む
			up0().addStringColumn("inc_entrd_true", toTrueStr(up0().inc_entrd_flg()));
			// 棚卸中のみ
			if (up0().only_stktk_flg()) {
				up0().addStringColumn("only_stktk_true", MSC_STKTK_STS_TYP.STKTK_ST.value());
			}
			// 実棚差異数量ありのみ
			if (up0().only_diff_flg()) {
				up0().addNumberColumn("only_diff_true", MCNumber.ZERO);
			}
			// 他社資産除く
			if (up0().only_own_flg()) {
				up0().addStringColumn("only_own_true", MSC_STK_ID_TYP.COSTK.value());
			}
			// 納品先・配送先在庫を除く
			up0().addStringColumn("only_int_true", toTrueStr(up0().only_int_flg()));
			
			searchForDL(sql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			
			MCList<StktkAct_Srch01_RsltR> dwndL = down0().subList("stktk_amt_flg", true);
			dwndL.addStringColumn("stk_std_upri_typ", getCo().stk_std_upri_typ());
			getStdCostL(StktkAct_Srch01_RsltR.$std_upri, dwndL, StktkAct_Srch01_RsltR.$itm_cd, StktkAct_Srch01_RsltR.$itm_sub1, StktkAct_Srch01_RsltR.$itm_sub2, StktkAct_Srch01_RsltR.$itm_sub3, StktkAct_Srch01_RsltR.$stktk_base_dt, StktkAct_Srch01_RsltR.$wg_cd, "stk_std_upri_typ");
			
			for (StktkAct_Srch01_RsltR r : down0()) {
				// 理論在庫初期表示がオフかつ実棚入力済ＦＬＧがオフの場合、実棚数量と実棚差異数量を表示しない
				if (!r.stktk_tor_disp_flg() && !r.act_input_flg()) {
					r.trd_unit_qty(null);
					r.act_diff_qty(null);
				}
				// 実棚基準単位数量を求める
				r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));

				// 棚卸金額出力がオンの場合、標準単価、標準原価、棚差金額を表示する
				if (r.stktk_amt_flg()) {
					r.std_cost(getAmt(r.std_upri(), r.base_unit_qty(), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
					r.act_diff_cost(getAmt(r.std_upri(), convToBaseUnit(r.act_diff_qty(), r.trd_unit_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
					r.base_cur_cd(getCo().base_cur_cd());
					r.upri_dec_place(getBaseCur().upri_dec_place());
					r.amt_dec_place(getCo().stk_amt_dec_place());
					
					
				}
			}
		}
	}

	/**
	 * StktkAct_Chk01オペレーション.<p>
	 *
	 * 実棚情報更新オペレーション実施前に事前チェックを行います。<br>
	 */
	public class StktkAct_Chk01 extends MSBEL_StktkActService_MC_A.StktkAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chk());
			
			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, StktkAct_Chk01_DtlR.$itm_nm)) {
					if (row.getBoolean(StktkAct_Chk01_DtlR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<StktkAct_Chk01_DtlR> noErrL = getChkList(up0());
			MCList<SundryItm_Chk01_DtlR> siL = MCList.create(SundryItm_Chk01_DtlR.class);
			MCList<Lot_Chk03_CndR> lotL = MCList.create(Lot_Chk03_CndR.class);

			// 上り電文中に同一キーの情報が複数ないこと　→実装仕様書の記述で実施

			for (StktkAct_Chk01_DtlR r : noErrL) {
				// 棚卸制御情報が取得できない場合
				// 循環棚卸かつ品目指定されている場合、その指定されている品目以外は不可
				if (isNull(r.stktk_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBEL0096, toYMDString(r.stktk_base_dt()), r.loc_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
				}

				// 棚卸状況区分が棚卸中であること
				else if (!MSC_STKTK_STS_TYP.isSTKTK_ST(r.stktk_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBEL0097, toDispGUIIndex(r)));
				}

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 在庫識別区分がVMIでないこと
					if (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0098, toDispGUIIndex(r)));
					}

					// 在庫識別区分が返品検収前、仕入検収前、自給品、預り、検収不良でないこと
					else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0099, toDispGUIIndex(r)));
					}
					else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0100, toDispGUIIndex(r)));
					}
					else if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0183, toDispGUIIndex(r)));
					}
					else if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0297, toDispGUIIndex(r)));
					}
					else if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0298, toDispGUIIndex(r)));
					}

					// 積送品区分が積送中でないこと
					if (MSC_IN_XFR_TYP.isIN_XFR(r.in_xfr_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0101, toDispGUIIndex(r)));
					}

					// 在庫着荷先が設定されている場合
					if (!isNullOrNullVal(r.stk_arrv_bp_cd())) {
						// 確定ＮＯＦＬＧがオンでないこと
						if (r.fix_no_flg() && (isNull(r.sppl_cd()) || !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()))) {
							msgL.add(new MCMessage(r, null, MSBEL0184, toDispGUIIndex(r)));
						}
						// 確定ＮＯＦＬＧがオフなら貸出在庫棚卸対象ＦＬＧがオフでないこと
						else if (!r.cnsgn_stktk_flg() && isNull(getLoc(r.loc_cd()).sppl_cd())) {
							msgL.add(new MCMessage(r, null, MSBEL0185, toDispGUIIndex(r)));
						}
					}
					
					// 在庫識別区分が無償受給、着荷先なし、外注場所は不可
					if (MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
							&& !isNull(getLoc(r.loc_cd()).sppl_cd())
							&& isNullOrNullVal(r.stk_arrv_bp_cd())) {
						msgL.add(new MCMessage(r, null, MSBEL0330, toDispGUIIndex(r)));
					}
					
					// 理論在庫数量がマイナスでないこと
					if (!isNull(r.tor_qty()) && r.tor_qty().isNegative()) {
						msgL.add(new MCMessage(r, null, MSBEL0329, toDispGUIIndex(r)));
					}
					// 理論在庫数がマイナスでない場合は、実棚数量>=0であること
					else {
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$trd_unit_qty, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
					}

					// 数量必須チェック（棚卸対象かどうかが先）
					if (r.use_diff_flg()) {
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$act_diff_qty, new FXUCL_RequiredValidater()));
					}
					else {
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
					}
					// 小数部有効桁数チェック
					if (r.use_diff_flg() && !isNull(r.act_diff_qty())) {
						msgL.addAll(checkDecPlace(r, StktkAct_Chk01_DtlR.$trd_unit_dec_place, StktkAct_Chk01_DtlR.$act_diff_qty));
					}
					if (!r.use_diff_flg() && !isNull(r.trd_unit_qty())) {
						msgL.addAll(checkDecPlace(r, StktkAct_Chk01_DtlR.$trd_unit_dec_place, StktkAct_Chk01_DtlR.$trd_unit_qty));
					}

					// ロットＮＯ
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						r.lot_no(MAC_STR.NULL_VAL.value());
					}
					else if (isNull(r.trd_unit_qty()) || !r.trd_unit_qty().isZero()) {
						r.lot_no(nullValToNull(r.lot_no()));
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$lot_no, new FXUCL_RequiredValidater()));
					}
					// サブロットＮＯ
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						r.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else if (isNull(r.trd_unit_qty()) || !r.trd_unit_qty().isZero()) {
						r.sublot_no(nullValToNull(r.sublot_no()));
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$sublot_no, new FXUCL_RequiredValidater()));
					}
					// 手配ＮＯ１
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
						r.sno1(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						r.sno1(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ()) && (isNull(r.trd_unit_qty()) || !r.trd_unit_qty().isZero())) {
						r.sno1(nullValToNull(r.sno1()));
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$sno1, new FXUCL_RequiredValidater()));
					}
					// 手配ＮＯ２
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
						r.sno2(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						r.sno2(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ()) && (isNull(r.trd_unit_qty()) || !r.trd_unit_qty().isZero())) {
						r.sno2(nullValToNull(r.sno2()));
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$sno2, new FXUCL_RequiredValidater()));
					}
					// 手配ＮＯ３
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
						r.sno3(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						r.sno3(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ()) && (isNull(r.trd_unit_qty()) || !r.trd_unit_qty().isZero())) {
						r.sno3(nullValToNull(r.sno3()));
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$sno3, new FXUCL_RequiredValidater()));
					}
					// 手配ＮＯ４
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
						r.sno4(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						r.sno4(MAC_STR.NULL_VAL.value());
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ()) && (isNull(r.trd_unit_qty()) || !r.trd_unit_qty().isZero())) {
						r.sno4(nullValToNull(r.sno4()));
						msgL.addAll(check(r, StktkAct_Chk01_DtlR.$sno4, new FXUCL_RequiredValidater()));
					}
				}

				// 諸口品の場合、品名が諸口品マスタと矛盾しないこと（新規のみ）
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && r.sundry_itm_flg()) {
					SundryItm_Chk01_DtlR siR = SundryItm_Chk01_DtlR.create();
					copy(siR, r, createMap_SundryItm_Chk01_DtlR_StktkAct_Chk01_DtlR());
					siL.add(siR);
				}

				// ロット作成ＦＬＧがオフの場合、ロット情報が存在すること（新規のみ）
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && !r.lot_make_flg()) {
					Lot_Chk03_CndR lotR = Lot_Chk03_CndR.create();
					copy(lotR, r, createMap_Lot_Chk03_CndR_StktkAct_Chk01_DtlR());
					lotL.add(lotR);
				}
				
				// 組み合わせの妥当性チェック（新規のみ）
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && !chkStkPtn(r)) {
					msgL.add(new MCMessage(r, null, MSBEL0187, toDispGUIIndex(r)));
				}
				
				// ロット入力不可チェック
				if (r.not_new_lot_flg() && r.lot_make_flg()) {
					msgL.add(new MCMessage(r, null, MSBEL0311, toDispGUIIndex(r)));
				}
			}
			
			// 諸口品チェック
			if (!siL.isEmpty()) {
				MABCL_SundryItmRegService.SundryItm_Chk01 o = MABCL_SundryItmRegService.crtSundryItm_Chk01();
				o.up0().setAll(siL);
				o.exec();
				copyErrFlg(up0(), o.down0());
			}
			
			// ロットチェック
			if (!lotL.isEmpty()) {
				MSBFL_LotService.Lot_Chk03 lo = MSBFL_LotService.crtLot_Chk03();
				lo.up0().setAll(lotL);
				lo.exec();
				copyErrFlg(up0(), lo.down0());
				copyByPegNo(
					up0(), new String[]{StktkAct_Chk01_DtlR.$ver_no},
					lo.down0(), new String[]{Lot_Chk03_CndR.$ver_no});
			}

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * StktkAct_Chk02オペレーション.<p>
	 *
	 * 実棚情報取消オペレーション実施前に事前チェックを行います。<br>
	 */
	public class StktkAct_Chk02 extends MSBEL_StktkActService_MC_A.StktkAct_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chk());
			
			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			
			setDown();
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCList<StktkAct_Chk01_DtlR> noErrL = getChkList(up0());
			MCMessageList msgL = new MCMessageList();

			for (StktkAct_Chk01_DtlR r : noErrL) {
				// 棚卸状況区分が棚卸中であること
				if (!MSC_STKTK_STS_TYP.isSTKTK_ST(r.stktk_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBEL0097, toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * StktkAct_Upd01オペレーション.<p>
	 *
	 * 入力された実棚数量を元に、実棚情報を登録します。<br>
	 */
	public class StktkAct_Upd01 extends MSBEL_StktkActService_MC_A.StktkAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			MCList<MST_STKTK_ACT_R> insL = MCList.create(MST_STKTK_ACT_R.class);
			MCList<MST_STKTK_ACT_R> updL = MCList.create(MST_STKTK_ACT_R.class);
			MCList<SundryItm_Upd01_DtlR> siL = MCList.create(SundryItm_Upd01_DtlR.class);
			
			for (StktkAct_Chk01_DtlR r : up0()) {
				MST_STKTK_ACT_R actR = MST_STKTK_ACT_R.create();
				copy(actR, r, createMap_MST_STKTK_ACT_R_StktkAct_Chk01_DtlR());

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(actR);
					
					// 諸口品追加
					if (r.sundry_itm_flg()) {
						SundryItm_Upd01_DtlR siR = SundryItm_Upd01_DtlR.create();
						copy(siR, r, createMap_SundryItm_Upd01_DtlR_StktkAct_Chk01_DtlR());
						siL.add(siR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(actR);
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T"));
				dbInsertEx("MSBEL6600_MST_STKTK_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_STKTK_ACT_R updL_t = MST_STKTK_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(updL_t.trd_unit_qty, updL_t.act_diff_qty,
						updL_t.act_input_flg, updL_t.use_diff_flg,
						updL_t.stktk_act_rmrks, updL_t.intr_rmrks,
						updL_t.sub_char1, updL_t.sub_char2, updL_t.sub_char3);
				dbUpdateKey("MSBEL6600_MST_STKTK_ACT_U01", updL, updL_bldr);
			}
			
			// 諸口品マスタ追加
			if (!siL.isEmpty()) {
				MABCL_SundryItmRegService.SundryItm_Upd01 o = MABCL_SundryItmRegService.crtSundryItm_Upd01();
				o.up0().setAll(siL);
				o.exec();
			}
			
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * StktkAct_Del01オペレーション.<p>
	 *
	 * 実棚数量の入力を取り消します。<br>
	 */
	public class StktkAct_Del01 extends MSBEL_StktkActService_MC_A.StktkAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			MCList<MST_STKTK_ACT_R> delL = MCList.create(MST_STKTK_ACT_R.class);
			MCList<MST_STKTK_ACT_R> updL = MCList.create(MST_STKTK_ACT_R.class);
			
			for (StktkAct_Chk01_DtlR r : up0()) {
				MST_STKTK_ACT_R actR = MST_STKTK_ACT_R.create();
				copy(actR, r, createMap_MST_STKTK_ACT_R_StktkAct_Chk01_DtlR());
				if (isNull(r.tor_qty())) {
					// 理論在庫数量がnull（追加行）は削除
					delL.add(actR);
				}
				else {
					actR.trd_unit_qty(r.tor_qty());
					actR.act_diff_qty(MCNumber.ZERO);
					actR.act_input_flg(false);
					actR.use_diff_flg(false);
					updL.add(actR);
				}
			}

			if (!updL.isEmpty()) {
				MST_STKTK_ACT_R t1 = MST_STKTK_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t1);

				updL_bldr.setSet(t1.trd_unit_qty, t1.act_diff_qty,
						t1.act_input_flg, t1.use_diff_flg);
				dbUpdateKey("MSBEL6600_MST_STKTK_ACT_U02", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T"));
				dbDeleteKey("MSBEL6600_MST_STKTK_ACT_D01", delL, delL_bldr);
			}
			
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	protected Map_MST_STKTK_ACT_R_StktkAct_Chk01_DtlR<MST_STKTK_ACT_R,StktkAct_Chk01_DtlR> createMap_MST_STKTK_ACT_R_StktkAct_Chk01_DtlR() {
		return new Map_MST_STKTK_ACT_R_StktkAct_Chk01_DtlR<MST_STKTK_ACT_R, StktkAct_Chk01_DtlR>();
	}

	public class Map_MST_STKTK_ACT_R_StktkAct_Chk01_DtlR<D extends MST_STKTK_ACT_R, S extends StktkAct_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STKTK_ACT_R.$itm_cd, StktkAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$itm_sub1, StktkAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_STKTK_ACT_R.$itm_sub2, StktkAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_STKTK_ACT_R.$itm_sub3, StktkAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_STKTK_ACT_R.$loc_cd, StktkAct_Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$str_ln_cd, StktkAct_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$stk_arrv_bp_cd, StktkAct_Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$lot_no, StktkAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(MST_STKTK_ACT_R.$sublot_no, StktkAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(MST_STKTK_ACT_R.$sno1, StktkAct_Chk01_DtlR.$sno1);
			addColumnPathMap(MST_STKTK_ACT_R.$sno2, StktkAct_Chk01_DtlR.$sno2);
			addColumnPathMap(MST_STKTK_ACT_R.$sno3, StktkAct_Chk01_DtlR.$sno3);
			addColumnPathMap(MST_STKTK_ACT_R.$sno4, StktkAct_Chk01_DtlR.$sno4);
			addColumnPathMap(MST_STKTK_ACT_R.$fix_no_flg, StktkAct_Chk01_DtlR.$fix_no_flg);
			addColumnPathMap(MST_STKTK_ACT_R.$trd_unit_cd, StktkAct_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$gd_cd, StktkAct_Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$in_xfr_typ, StktkAct_Chk01_DtlR.$in_xfr_typ);
			addColumnPathMap(MST_STKTK_ACT_R.$quality_typ, StktkAct_Chk01_DtlR.$quality_typ);
			addColumnPathMap(MST_STKTK_ACT_R.$stk_insp_typ, StktkAct_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(MST_STKTK_ACT_R.$stk_id_typ, StktkAct_Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(MST_STKTK_ACT_R.$stk_bp_cd, StktkAct_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(MST_STKTK_ACT_R.$stktk_base_dt, StktkAct_Chk01_DtlR.$stktk_base_dt);
//			addColumnPathMap(MST_STKTK_ACT_R.$keep_data_flg, );
			addColumnPathMap(MST_STKTK_ACT_R.$wg_cd, StktkAct_Chk01_DtlR.$wg_cd);
//			addColumnPathMap(MST_STKTK_ACT_R.$tor_qty, StktkAct_Chk01_DtlR.$tor_qty);
			addColumnPathMap(MST_STKTK_ACT_R.$trd_unit_qty, StktkAct_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_STKTK_ACT_R.$act_diff_qty, StktkAct_Chk01_DtlR.$act_diff_qty);
			addColumnPathMap(MST_STKTK_ACT_R.$act_input_flg, StktkAct_Chk01_DtlR.$act_input_flg);
			addColumnPathMap(MST_STKTK_ACT_R.$use_diff_flg, StktkAct_Chk01_DtlR.$use_diff_flg);
			addColumnPathMap(MST_STKTK_ACT_R.$stktk_act_rmrks, StktkAct_Chk01_DtlR.$stktk_act_rmrks);
			addColumnPathMap(MST_STKTK_ACT_R.$intr_rmrks, StktkAct_Chk01_DtlR.$intr_rmrks);
//			addColumnPathMap(MST_STKTK_ACT_R.$stktk_act_no, );
			addColumnPathMap(MST_STKTK_ACT_R.$stktk_itm_spc_flg, StktkAct_Chk01_DtlR.$stktk_itm_spc_flg);
			addColumnPathMap(MST_STKTK_ACT_R.$sub_char1, StktkAct_Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_STKTK_ACT_R.$sub_char2, StktkAct_Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_STKTK_ACT_R.$sub_char3, StktkAct_Chk01_DtlR.$sub_char3);
//			addColumnPathMap(MST_STKTK_ACT_R.$ins_usr_id, StktkAct_Chk01_DtlR.$ins_usr_id);
//			addColumnPathMap(MST_STKTK_ACT_R.$ins_usr_nm, StktkAct_Chk01_DtlR.$ins_usr_nm);
//			addColumnPathMap(MST_STKTK_ACT_R.$ins_ts, StktkAct_Chk01_DtlR.$ins_ts);
//			addColumnPathMap(MST_STKTK_ACT_R.$ins_func_id, StktkAct_Chk01_DtlR.$ins_func_id);
//			addColumnPathMap(MST_STKTK_ACT_R.$upd_cntr, );
//			addColumnPathMap(MST_STKTK_ACT_R.$upd_usr_id, StktkAct_Chk01_DtlR.$upd_usr_id);
//			addColumnPathMap(MST_STKTK_ACT_R.$upd_usr_nm, StktkAct_Chk01_DtlR.$upd_usr_nm);
//			addColumnPathMap(MST_STKTK_ACT_R.$upd_func_id, StktkAct_Chk01_DtlR.$upd_func_id);
//			addColumnPathMap(MST_STKTK_ACT_R.$upd_srv_req_no, StktkAct_Chk01_DtlR.$upd_srv_req_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// 保持データＦＬＧはオフ
			dest.keep_data_flg(false);
			dest.stktk_act_no(MAC_STR.NULL_VAL.value());
		}
	}

	protected Map_SundryItm_Chk01_DtlR_StktkAct_Chk01_DtlR<SundryItm_Chk01_DtlR,StktkAct_Chk01_DtlR> createMap_SundryItm_Chk01_DtlR_StktkAct_Chk01_DtlR() {
		return new Map_SundryItm_Chk01_DtlR_StktkAct_Chk01_DtlR<SundryItm_Chk01_DtlR, StktkAct_Chk01_DtlR>();
	}

	public class Map_SundryItm_Chk01_DtlR_StktkAct_Chk01_DtlR<D extends SundryItm_Chk01_DtlR, S extends StktkAct_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, StktkAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, StktkAct_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, StktkAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, StktkAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, StktkAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, StktkAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, StktkAct_Chk01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, StktkAct_Chk01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, StktkAct_Chk01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, StktkAct_Chk01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, StktkAct_Chk01_DtlR.$itm_nm);
			addColumnPathMap(SundryItm_Chk01_DtlR.$err_flg, StktkAct_Chk01_DtlR.$err_flg);

		}
	}

	protected Map_SundryItm_Upd01_DtlR_StktkAct_Chk01_DtlR<SundryItm_Upd01_DtlR,StktkAct_Chk01_DtlR> createMap_SundryItm_Upd01_DtlR_StktkAct_Chk01_DtlR() {
		return new Map_SundryItm_Upd01_DtlR_StktkAct_Chk01_DtlR<SundryItm_Upd01_DtlR, StktkAct_Chk01_DtlR>();
	}

	public class Map_SundryItm_Upd01_DtlR_StktkAct_Chk01_DtlR<D extends SundryItm_Upd01_DtlR, S extends StktkAct_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, StktkAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, StktkAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, StktkAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, StktkAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, StktkAct_Chk01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, StktkAct_Chk01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, StktkAct_Chk01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, StktkAct_Chk01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, StktkAct_Chk01_DtlR.$itm_nm);

		}
	}

	protected Map_Lot_Chk03_CndR_StktkAct_Chk01_DtlR<Lot_Chk03_CndR,StktkAct_Chk01_DtlR> createMap_Lot_Chk03_CndR_StktkAct_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_StktkAct_Chk01_DtlR<Lot_Chk03_CndR, StktkAct_Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_StktkAct_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends StktkAct_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, StktkAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, StktkAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, StktkAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, StktkAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, StktkAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, StktkAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, StktkAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, StktkAct_Chk01_DtlR.$err_flg);

		}
	}

	//FMCB CUSTOM END
}