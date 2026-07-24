package mcframe.serverMSBB.MSBBL1330;

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
import mcframe.serverMSBB.MSBBL1330.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR;
import mcframe.serverMABS.MABSL5010.*;
import mcframe.serverMSBF.MSBFL5210.MSBFL_LotService;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import static mcframe.serverMSBB.MSBBL1330.Query.*;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;

import java.util.Map;
import java.util.HashSet;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsRetSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsRetSchdReg_MC extends MSBBL_SlsRetSchdReg_MC_A{
	//FMCB CUSTOM START
	
	protected static final Class<MSBBL_SlsRetSchdReg> CLAZZ = MSBBL_SlsRetSchdReg.class;

	protected MCList<Chk01_IoR> _chk01IoL = MCList.create(Chk01_IoR.class);
	protected MCList<Chk01_IoR> _chk02IoL = MCList.create(Chk01_IoR.class);

	
	protected static void initChk01IoL(MCList<Chk01_IoR> ioL) {
		object(CLAZZ)._initChk01IoL(ioL);
	}
	
	protected void _initChk01IoL(MCList<Chk01_IoR> ioL) {
		_chk01IoL.addAll(ioL);
	}
	
	protected static MCList<Chk01_IoR> getChk01IoL() {
		return object(CLAZZ)._chk01IoL;
	}
	
	protected static void initChk02IoL(MCList<Chk01_IoR> ioL) {
		object(CLAZZ)._initChk02IoL(ioL);
	}
	
	protected void _initChk02IoL(MCList<Chk01_IoR> ioL) {
		_chk02IoL.addAll(ioL);
	}
	
	protected static MCList<Chk01_IoR> getChk02IoL() {
		return object(CLAZZ)._chk02IoL;
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 納品書ＮＯから出荷実績または売上実績情報を検索します。<br>
	 */
	public class Srch01 extends MSBBL_SlsRetSchdReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();
			
			if (MSC_SLS_SRCH_TGT_TYP.isSHIP_DLV_SLIP_NO(up0().srch_tgt_typ())) {
				
				int cnt = srchHdr();
				if (isSame(cnt, 0)) {
					return;
				}
				setTrd();

				int cnt2 = srchDtl();
				if (isSame(cnt2, 0)) {
					down0().clear();
					down1().clear();
					return;
				}

				int cnt3 = srchIo();
				
				if (isSame(cnt3, 0)) {
					down0().clear();
					down1().clear();
					down2().clear();
					return;
				}				
				setDown();
			}
			else if (MSC_SLS_SRCH_TGT_TYP.isSLS_DLV_SLIP_NO(up0().srch_tgt_typ()) && existsSlsAct()) {
				// 売上実績が存在する場合は、売上実績を元に取得する（Srch03Opeを呼び出す）

				MSBBL_SlsRetSchdReg.Srch03 ope = MSBBL_SlsRetSchdReg.crtSrch03();

				copyall(ope.up0(), up0());
				ope.up0().srch_tgt_no(up0().getStringNE(MST_SLS_ACT_R.$sls_act_no));
				ope.exec();
				copyall(down0(), ope.down0());
				down1().setAll(ope.down1());
				down2().setAll(ope.down2());
			}

		}

		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		/**
		 * 	検索対象の納品書ＮＯの売上実績が存在するか判定する
		 * @return
		 */
		protected boolean existsSlsAct() {
			MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsAct_bldr = MCQueryApiBuilder.create(slsAct);
			slsAct_bldr.setSelect(slsAct.sls_act_no);
			slsAct_bldr.setWhere(slsAct.dlv_slip_no.eq(bind("srch_tgt_no")), up0());
			slsAct_bldr.addWhereWithAnd(slsAct.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			int cnt = dbSelect("MSBBL1330_MST_SLS_ACT_S01", slsAct, slsAct_bldr);
			if (cnt > 0) {
				// 売上実績NOを一時カラムに格納
				up0().setStringNE(MST_SLS_ACT_R.$sls_act_no, slsAct.sls_act_no());
				return true;
			}
			return false;
		}

		protected int srchHdr() {
			up0().addDateColumn("today", getToday());
			return executeQuery(down0(), MSBBL1330_DLV_SLIP_S01(), up0());
		}

		protected int srchDtl() {
			return executeQuery(down1(), MSBBL1330_DLV_SLIP_D_S01(), down0());
		}

		protected int srchIo() {
			return executeQuery(down2(), MSBBL1330_SHIP_PR_S01(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			setIo2DtlL();

			setVmiInfo();
		}

		/**
		 * 	下り電文の編集
		 * 	<p>
		 * 	詳細の取引単位、取引数量の設定（基準単位数量から換算可能か判定する）<br>
		 * 	詳細の数量のサマリを明細の取引数量に設定する<br>
		 * 	明細の表示順を設定
		 * 	</p>
		 */
		protected void setDown() {

			// 1.詳細の取引数量、取引単位の設定
			for (Srch01_IoR ioR : down2()) {

				// 基準単位数量が取引単位に換算可能な場合は、取引単位ＣＤ、取引数量を設定
				// 換算不可の場合は、基準単位、基準単位数を取引単位ＣＤ、取引単位数量に設定する
				// なお、Rowの取引単位ＣＤ（名）には、初期値として出荷実績明細の取引単位ＣＤ（名）が設定済である
				MCNumber conv_qty = rvrsBaseUnitConvAndChk(ioR.base_unit_qty(),
						ioR.trd_unit_conv_base_qty(), ioR.trd_unit_conv_qty(),
						ioR.trd_unit_dec_place(),
						ioR.trd_unit_rnd_typ(),
						ioR.base_unit_dec_place(), ioR.base_unit_rnd_typ());
				if (!isNull(conv_qty)) {
					// 換算可能な場合
					ioR.trd_unit_qty(conv_qty);
				}
				else {
					// 変換不可の場合
					ioR.trd_unit_qty(ioR.base_unit_qty());
					ioR.trd_unit_cd(ioR.base_unit_cd());
					ioR.trd_unit_nm(ioR.base_unit_nm());
				}
			}

			// 2.明細の数量、単位の設定
			MCList<Srch01_DtlR> retDtlL = down1().createInstance();
			MCIndexKey idxKey = down2().createIndex(Srch01_DtlR.$ref_dlv_slip_d_no);
			for (Srch01_DtlR dtlR : down1()) {
				MCList<Srch01_IoR> chdL = down2().subList(idxKey, 
						dtlR.ref_dlv_slip_d_no());

				// 詳細のリストは基準単位数が0の行は取得対象外としている
				//　また、詳細が存在しない明細行も対象外とする
				if (!isNull(chdL) && !chdL.isEmpty()) {

					retDtlL.add(dtlR);

					// 詳細の基準単位数の合計を取得
					MCNumber sum_base_unit_qty = chdL.sum(Srch01_IoR.$base_unit_qty);

					// 取引単位に換算する
					MCNumber conv_qty = rvrsBaseUnitConvAndChk(sum_base_unit_qty,
							dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
							dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(),
							dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ());
					if (!isNull(conv_qty)) {
						// 換算可能な場合
						dtlR.trd_unit_qty(conv_qty);
					}
					else {
						// 換算不可の場合は基準単位数量を設定
						dtlR.trd_unit_qty(sum_base_unit_qty);
						dtlR.trd_unit_cd(dtlR.base_unit_cd());
						dtlR.trd_unit_nm(dtlR.base_unit_nm());
					}
					dtlR.base_unit_qty(sum_base_unit_qty);
				}
			}

			// 3.表示順の再設定
			int i = 1;
			retDtlL.sort(Srch01_DtlR.$dlv_slip_d_no);
			for (Srch01_DtlR dtlR : retDtlL) {
				dtlR.disp_seq(i++);
			}
			
			// 4.配送先の設定
			if (!down0().cst_iv_flg()) {
				down1().setString(Srch01_DtlR.$tdlv_cd, null);
				down1().setString(Srch01_DtlR.$tdlv_nm, null);
			}
			
			// 5.取引パタン区分の設定
			down0().trd_ptn_typ(MAC_TRD_PTN_TYP.SHIP_RTN.value());

			down1().setAll(retDtlL);
			
			// 6.明細行IDの設定
			setDtlRowId();
		}
		
		/**
		 * 納品書ＮＯ検索での貸出出荷用の設定
		 */
		protected void setVmiInfo() {
			if (!isNull(down1()) && down1().get(0).vmi_flg()) {
				down0().vmi_flg(true);
				for (Srch01_DtlR dtlR : down1()) {
					if (dtlR.vmi_flg()) {
						dtlR.cnsgn_gd_cd(dtlR.gd_cd());
						dtlR.cnsgn_gd_nm(dtlR.gd_nm());
						dtlR.cnsgn_loc_cd(dtlR.loc_cd());
						dtlR.cnsgn_loc_nm(dtlR.loc_nm());
						dtlR.cnsgn_str_ln_cd(dtlR.str_ln_cd());
						dtlR.cnsgn_str_ln_nm(dtlR.str_ln_nm());
						dtlR.cnsgn_str_ln_cd_none_flg(dtlR.str_ln_cd_none_flg());
					}
				}
				for (Srch01_IoR ioR : down2()) {
					ioR.cnsgn_gd_cd(ioR.gd_cd());
					ioR.cnsgn_gd_nm(ioR.gd_nm());
					ioR.cnsgn_loc_cd(ioR.loc_cd());
					ioR.cnsgn_loc_nm(ioR.loc_nm());
					ioR.cnsgn_str_ln_cd(ioR.str_ln_cd());
					ioR.cnsgn_str_ln_nm(ioR.str_ln_nm());
					ioR.cnsgn_str_ln_cd_none_flg(ioR.str_ln_cd_none_flg());
				}
			}
		}

		/**
		 * 	基準単位数量から別の単位の数量へ換算する<br>
		 * 	ただし換算不可能な場合はnullを返却する<br>
		 * 	換算可能かどうかの判断は換算結果と、換算結果を逆換算した結果が同じ値となること<br>
		 * @param r
		 * @return
		 */
		protected MCNumber rvrsBaseUnitConvAndChk(MCNumber qty, MCNumber toDmnQty,
				MCNumber toConvQty, MCNumber toDecPlace, String toUnitConvRndTyp,
				MCNumber frDecPlace, String frUnitConvRndTyp) {

			// 基準単位数量から入力単位数量への換算
			MCNumber calcNum = rvrsBaseUnitConv(qty, toDmnQty, toConvQty, toDecPlace,
					toUnitConvRndTyp);

			// 入力単位数量から基準単位数量への再計算
			MCNumber reCalcNum = convToBaseUnit(calcNum, toDmnQty, toConvQty, frDecPlace,
					frUnitConvRndTyp);

			if (isSame(qty, reCalcNum)) {
				// 変換ＯＫ
				return calcNum;
			}
			return null;
		}
		
		/**
		 * 	明細行IDの設定<br>
		 * {@link Srch03#setDtlRowId()}
		 */
		protected void setDtlRowId() {

			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$ref_dlv_slip_d_no);
			int i = 1;
			for (Srch01_DtlR r : down1()) {
				r.dtl_row_id(i);
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.dlv_slip_d_no());
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, i);
				i++;
			}
		}

		/**
		 * 紐づく詳細行の項目値がユニークの場合、値を明細にセットする<br>
		 * 対象項目は格付、場所、棚・ライン
		 */
		protected void setIo2DtlL() {

			MCIndexKey idxkey = down2().createIndex(Srch01_IoR.$dtl_row_id);
			for (Srch01_DtlR dtlR : down1()) {

				MCList<Srch01_IoR> ioL = down2().subList(idxkey,
						dtlR.toArray(Srch01_DtlR.$dtl_row_id));

				Srch01_IoR ioR = ioL.get(0);

				if (ioL.groupList(Srch01_IoR.$gd_cd).length == 1) {
					dtlR.gd_cd(ioR.gd_cd());
					dtlR.gd_nm(ioR.gd_nm());
				}

				if (ioL.groupList(Srch01_IoR.$loc_cd).length == 1) {
					dtlR.loc_cd(ioR.loc_cd());
					dtlR.loc_nm(ioR.loc_nm());
				}

				if (ioL.groupList(Srch01_IoR.$str_ln_cd).length == 1) {
					dtlR.str_ln_cd(ioR.str_ln_cd());
					dtlR.str_ln_nm(ioR.str_ln_nm());
					dtlR.str_ln_tgt_flg(ioR.str_ln_tgt_flg());
				}
			}

		}

		protected void setTrd() {
			
			String trdCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_UTIL$F_GET_DEF_TRD_CD", "01"),
					MAPA_UTIL$F_GET_DEF_TRD_CD(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())));
			MAM_TRD_R db = MAM_TRD_R.create("T");
			dbSelectKey("MSBBL1330_MAM_TRD_S01", db, MCQueryApiBuilder.create(db), trdCd);
			
			down0().trd_cd(db.trd_cd());
			down0().trd_nm(db.trd_nm());
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 売上実績情報を検索します。<br>
	 */
	public class Srch03 extends MSBBL_SlsRetSchdReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();
			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			
			setTrd();

			int cnt2 = srchDtl();
			if (isSame(cnt2, 0)) {
				down0().clear();
				down1().clear();
				return;
			}

			int cnt3 = srchIo();
			
			if (isSame(cnt3, 0)) {
				down0().clear();
				down1().clear();
				down2().clear();
			}
		}

		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}
		
		
		protected void setTrd() {
			
			String trdCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_UTIL$F_GET_DEF_TRD_CD", "02"),
					MAPA_UTIL$F_GET_DEF_TRD_CD(value(MAC_TRD_PTN_TYP.SLS_RTN.value())));
			MAM_TRD_R db = MAM_TRD_R.create("T");
			dbSelectKey("MSBBL1330_MAM_TRD_S02", db, MCQueryApiBuilder.create(db), trdCd);
			
			down0().trd_cd(db.trd_cd());
			down0().trd_nm(db.trd_nm());
		}

		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1330_SLS_ACT_S01(), up0());
		}

		protected int srchDtl() {
			return executeQuery(down1(), MSBBL1330_SLS_ACT_D_S01(), up0());
		}

		protected int srchIo() {
			return executeQuery(down2(), MSBBL1330_SLS_ACT_IO_S01(), up0());
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			if (down0().isEmpty()) {
				return;
			}
			
			// 取引パタン区分の設定
			down0().trd_ptn_typ(MAC_TRD_PTN_TYP.SLS_RTN.value());

			// 明細行IDの設定
			setDtlRowId();
			
			setCurUpriAmt(down0(), down1());
			
			calcProfRate(down0(), down1());
		}

		/**
		 * 	明細行IDの設定
		 * <p>
		 * 	明細と詳細の紐付けのキー情報は<br>
		 * 	Srch01の場合は、納品伝票明細NO<br>
		 * 	Srch03の場合は、参照売上明細NO<br>
		 * 	Srch04の場合は、入荷進捗NOとなる。<br>
		 * 	一応紐付けキー情報はクライアントへ送信しているが、今のところ不使用
		 * 	(以降はdtl_row_idで紐付ける)
		 * </p>
		 */
		protected void setDtlRowId() {

			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$ref_sls_act_d_no);
			int i = 1;
			for (Srch01_DtlR r : down1()) {
				r.dtl_row_id(i);
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.ref_sls_act_d_no());
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, i);
				i++;
			}
		}
	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 * 売上返品予定情報を検索します。<br>
	 */
	public class Srch04 extends MSBBL_SlsRetSchdReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {

			super.doSearchMain();

			editCnd();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}

			int cnt2 = srchDtl();
			if (isSame(cnt2, 0)) {
				down0().clear();
				down1().clear();
				return;
			}
			
			int cnt3 = srchIo();
			
			if (isSame(cnt3, 0)) {
				down0().clear();
				down1().clear();
				down2().clear();
			}

		}

		protected void editCnd() {
			up0().setDateNE("today", getToday());
		}

		protected int srchHdr() {
			return executeQuery(down0(), MSBBL1330_SLS_RET_SCHD_S01(), up0());
		}

		protected int srchDtl() {
			return executeQuery(down1(), MSBBL1330_SLS_RET_SCHD_D_S01(), up0());
		}

		protected int srchIo() {
			return executeQuery(down2(), MSBBL1330_ARR_SCHD_S01(), up0());
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(down0().trd_ptn_typ())) {
				if (down1().get(0).vmi_flg()) {
					down0().vmi_flg(true);
				}
				
				down0().trd_cur_cd(null);
				down0().trd_cur_nm(null);
				down0().trd_cur_amt_dec_place(null);
				down0().trd_cur_upri_dec_place(null);
				down0().ptax_cur_cd(null);
				down0().ptax_cur_nm(null);
				down0().ptax_cur_amt_dec_place(null);
				down0().ptax_cur_upri_dec_place(null);
				down0().base_cur_cd(null);
				down0().base_cur_nm(null);
				down0().base_cur_amt_dec_place(null);
				down0().base_cur_upri_dec_place(null);
			}

			// 明細行IDの設定
			setDtlRowId();
			
			setCurUpriAmt(down0(), down1());
			
			calcProfRate(down0(), down1());
		}

		/**
		 * 	明細行IDの設定<br>
		 * {@link Srch03#setDtlRowId()}
		 */
		protected void setDtlRowId() {

			MCIndexKey idxKey = down2().createIndex(Srch01_IoR.$arr_pr_no);
			int i = 1;
			for (Srch01_DtlR r : down1()) {
				r.dtl_row_id(i);
				MCList<Srch01_IoR> ioL = down2().subList(idxKey, r.arr_pr_no());
				ioL.setNumberNE(Srch01_IoR.$dtl_row_id, i);
				i++;
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上返品予定情報を新規登録します。<br>
	 */
	public class Ins01 extends MSBBL_SlsRetSchdReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェックOpeの呼出
			callThisChk01();
			throwUpdErr();

			// インボイス取引対象の場合、インボイスNOの登録
			setUpIvNo(chk01_down0);

			// 売上返品予定の登録
			ins();

			// 	入荷予定サービスの呼出
			callArrSchdSvUpd01();

			setDown();

		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			setPegNo(up2());
			up0().setStatus(Status.CREATE);
			
		}
		
		@Override
		protected void doEditDown(MCContainer container) {
			super.doEditDown(container);
		}
		
		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
		}

		protected void setDown() {
			MCRow.copyall(down0(), chk01_down0);
			down1().addAll(chk01_down1);
			down1().setStringNE(Chk01_DtlR.$sret_schd_sts_typ,
					MSC_SRET_SCHD_STS_TYP.NON_ARR.value());
			down2().addAll(chk01_down2);
		}

		/**
		 * 	売上返品予定情報の登録
		 */
		protected void ins() {

			setSeq();

			MST_SLS_RET_SCHD_R insR = MST_SLS_RET_SCHD_R.create("T");
			copy(insR, chk01_down0, createMap_MST_SLS_RET_SCHD_R_Chk01_HdrR());

			MCList<MST_SLS_RET_SCHD_D_R> insL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			addAll(insL, chk01_down1, createMap_MST_SLS_RET_SCHD_D_R_Chk01_DtlR());

			dbInsert("MSBBL1330_MST_SLS_RET_SCHD_I01", insR, MCQueryApiBuilder.create(insR));
			dbInsert("MSBBL1330_MST_SLS_RET_SCHD_D_I01", insL,
					MCQueryApiBuilder.create(MST_SLS_RET_SCHD_D_R.create("T")));
		}

		/**
		 * 管理ＮＯの発番
		 */
		protected void setSeq() {

			// 売上返品予定ＮＯの発番
			ElmArgsR elm = ElmArgsR.create();
			elm.dpt_cd(up0().sls_dpt_cd());
			elm.co_cd(getCo().co_cd());
			elm.bp_cd(up0().cst_cd());
			elm.wg_cd(chk01_down0.wg_cd());
			elm.trd_cd(up0().trd_cd());
			elm.dt(up0().reg_dt());
			String sls_ret_schd_no = getNum(MAC_NUM_BIZ_TYP.SLSRETSCHD, elm);

			chk01_down0.sls_ret_schd_no(sls_ret_schd_no);

			for (Chk01_DtlR r : chk01_down1) {
				// 売上返品予定NO
				r.sls_ret_schd_no(sls_ret_schd_no);
				// 売上予定明細NO
				r.sls_ret_schd_d_no(getStrSeq(MSC_NUM_SYS_TYP.SLSRETSCHDD));
				// 受払進捗管理NO
				r.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			}
		}

		/**
		 * 	入荷予定サービスの呼出
		 */
		protected void callArrSchdSvUpd01() {

			MSBEL_ArrSchdService.ArrSchd_Upd01 ope = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			addAll(ope.up0(), chk01_down1, createMap_ArrPr_DtlR_Chk01_DtlR(chk01_down0));
			addAll(ope.up1(), chk01_down2, createMap_ArrSchd_DtlR_Chk01_IoR(chk01_down0, chk01_down1));

			ope.exec();
			copyByPegNo(chk01_down1, down1CopyCols, ope.down0(), down1CopyCols);
			copyByPegNo(chk01_down2, ope.down0(), Chk01_IoR.$peg_no, down2CopyCols, ArrSchd_DtlR.$peg_d_no, down2CopyCols);
		}

		protected String[] down1CopyCols = {
			Chk01_DtlR.$arr_pr_no,
			Chk01_DtlR.$io_schd_pr_no
		};
		
		protected String[] down2CopyCols = {
				Chk01_IoR.$arr_schd_no
		};
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上返品予定情報を訂正します。<br>
	 */
	public class Upd01 extends MSBBL_SlsRetSchdReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェックOpeの呼出
			callThisChk01();
			throwUpdErr();

			// インボイス取引対象の場合、インボイスNOの登録
			setUpIvNo(chk01_down0);

			// 売上返品予定の更新
			upd();

			// 	入荷予定サービスの呼出
			callArrSchdSv();
			
			// 売上返品予定の完了ＦＬＧの更新
			updCompFlg();

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			setPegNo(up2());
		}

		/**
		 * 	Chk01オペレーションの呼出
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
		}

		protected void setDown() {
			MCRow.copyall(down0(), chk01_down0);
			down1().addAll(chk01_down1);
			down2().addAll(chk01_down2);
		}

		protected void upd() {

			MST_SLS_RET_SCHD_R hdr = MST_SLS_RET_SCHD_R.create("T");
			copy(hdr, chk01_down0, createMap_MST_SLS_RET_SCHD_R_Chk01_HdrR());
			
			// 新規行に管理ＮＯを採番
			setSeq(chk01_down1.subList(MCRow.CREATE));

			MCList<MST_SLS_RET_SCHD_D_R> insL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			MCList<MST_SLS_RET_SCHD_D_R> updL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			MCList<MST_SLS_RET_SCHD_D_R> delL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			addAll(insL, chk01_down1.subList(MCRow.CREATE),
					createMap_MST_SLS_RET_SCHD_D_R_Chk01_DtlR());
			addAll(updL, chk01_down1.subList(MCRow.MODIFY, MCRow.NONE),
					createMap_MST_SLS_RET_SCHD_D_R_Chk01_DtlR());
			addAll(delL, chk01_down1.subList(MCRow.DELETE),
					createMap_MST_SLS_RET_SCHD_D_R_Chk01_DtlR());

			dbUpdateKey("MSBBL1330_MST_SLS_RET_SCHD_U01", hdr, MCQueryApiBuilder.create(hdr));
			dbInsert("MSBBL1330_MST_SLS_RET_SCHD_D_I02", insL,
					MCQueryApiBuilder.create(MST_SLS_RET_SCHD_D_R.create("T")));
			dbUpdateKey("MSBBL1330_MST_SLS_RET_SCHD_D_U01", updL,
					MCQueryApiBuilder.create(MST_SLS_RET_SCHD_D_R.create("T")));
			dbDeleteKey("MSBBL1330_MST_SLS_RET_SCHD_D_D01", delL,
					MCQueryApiBuilder.create(MST_SLS_RET_SCHD_D_R.create("T")));
		}
		
		/**
		 * 入荷進捗の情報を基づき、売上返品予定の完了ＦＬＧを更新する。
		 */
		protected void updCompFlg() {
			
			MCList<MST_SLS_RET_SCHD_D_R> slsRetSchdDL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			
			MCList<MST_ARR_PR_R> arrPrL = getArrPrL();
			MCIndexKey idxkey = arrPrL.createIndex(MST_ARR_PR_R.$sls_ret_schd_d_no);
			
			MST_SLS_RET_SCHD_D_R updR = null;
			for (Chk01_DtlR dtlR : chk01_down1) {
				
				if (dtlR.isStatusDelete()) {
					continue;
				}
				
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(idxkey, dtlR.sls_ret_schd_d_no());
				
				if (isNull(arrPrR) || arrPrR.isEmpty()) {
					continue;
				}
				
				updR = MST_SLS_RET_SCHD_D_R.create();
				
				updR.sls_ret_schd_d_no(dtlR.sls_ret_schd_d_no());
				
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(chk01_down0.trd_ptn_typ()) || dtlR.vmi_flg() ) {
					// 出荷返品または貸出の場合は、入荷が完了した場合に完了にする。
					
					if (arrPrR.arr_cmpl_flg()) {
						updR.cmpl_flg(true);
					}
					else {
						updR.cmpl_flg(false);
					}
				}
				else if (MAC_TRD_PTN_TYP.isSLS_RTN(chk01_down0.trd_ptn_typ())) {
					// 売上返品の場合は、入荷完了かつ売上返品完了した場合に完了にする。
					
					if (arrPrR.arr_cmpl_flg() && arrPrR.sls_ret_cmpl_flg()) {
						updR.cmpl_flg(true);
					}
					else {
						updR.cmpl_flg(false);
					}
				}
				
				slsRetSchdDL.add(updR);
			}

			MST_SLS_RET_SCHD_D_R t = MST_SLS_RET_SCHD_D_R.create("T");
			MCQueryApiBuilder slsRetSchdDL_bldr = MCQueryApiBuilder.create(t);
			slsRetSchdDL_bldr.setSet(t.cmpl_flg);
			dbUpdateKey("MSBBL1330_MST_SLS_RET_SCHD_D_U02", slsRetSchdDL, slsRetSchdDL_bldr);
		}
		
		/**
		 * 売上返品予定に紐付く入荷進捗を取得する。
		 * @return 出荷進捗
		 */
		protected MCList<MST_ARR_PR_R> getArrPrL() {
			
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setSelect(t.sls_ret_schd_d_no, t.arr_cmpl_flg, t.sls_ret_cmpl_flg);
			dbSelectColumn("MSBBL1330_MST_ARR_PR_S01", arrPrL, arrPrL_bldr,
					MST_ARR_PR_R.$sls_ret_schd_d_no, chk01_down1.groupBy(Chk01_DtlR.$sls_ret_schd_d_no),
					Chk01_DtlR.$sls_ret_schd_d_no);
			
			return arrPrL;
		}

		/**
		 * 	入荷予定サービスの呼出
		 */
		protected void callArrSchdSv() {

			MCList<Chk01_IoR> callUpd01L = MCList.create(Chk01_IoR.class); // MSBEL5900.ArrSchd_Upd01呼出対象リスト
			MCList<Chk01_IoR> callUpd01AbrtL = MCList.create(Chk01_IoR.class); // MSBEL5900.ArrSchd_Upd01呼出対象リスト（打切）
			MCList<Chk01_IoR> callUpd02L = MCList.create(Chk01_IoR.class); // MSBEL5900.ArrSchd_Upd02呼出対象リスト
			MCList<Chk01_IoR> callUpd03L = MCList.create(Chk01_IoR.class); // MSBEL5900.ArrSchd_Upd03呼出対象リスト

			MCIndexKey idxIo = chk01_down2.createIndex(Chk01_IoR.$peg_no);
			MCIndexKey idxDtl = chk01_down1.createIndex(Chk01_DtlR.$dtl_row_id);

			// チェック処理での MSBEL5900.ArrSchd_Chk01の呼出対象のレコードを抽出
			for (Chk01_IoR r : getChk01IoL()){
				Chk01_IoR tgtIoR =  chk01_down2.getFirst(idxIo, r.peg_no());
				
				if (!isNull(tgtIoR)) {
					// 詳細に対応する明細を取得
					Chk01_DtlR parDtlR = chk01_down1.getFirst(idxDtl, tgtIoR.dtl_row_id());
					
					// 打切の変更の場合はMSBEL5900.ArrSchd_Upd01呼出対象リスト（打切）に設定
					if (!isSame(parDtlR.abort_flg(), parDtlR.old_abort_flg())) {
						callUpd01AbrtL.add(tgtIoR);
					}
					// それ以外はMSBEL5900.ArrSchd_Upd01呼出対象リストに設定
					else {
						callUpd01L.add(tgtIoR);
					}
				}
			}
			
			
			// チェック処理での MSBEL5900.ArrSchd_Chk02の呼出対象のレコードを抽出
			for (Chk01_IoR r : getChk02IoL()){
				Chk01_IoR tgtIoR =  chk01_down2.getFirst(idxIo, r.peg_no());
				
				if (!isNull(tgtIoR)) {
					callUpd02L.add(tgtIoR);
				}
			}
			
			// 売上返品打切の更新対象の抽出
			// 明細の打切ＦＬＧがオフ、詳細の売上返品打切ＦＬＧがオンまたはオンからオフに変わった明細行の抽出
			// 詳細の売上返品打切ＦＬＧがオンのリストを抽出
			MCList<Chk01_DtlR> targetDtlL = chk01_down1.subList(MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
			MCList<Chk01_IoR> targetIoL = chk01_down2.subList(MCRow.CREATE, MCRow.MODIFY);
			// 明細の打切ＦＬＧがオフのリストを抽出
			MCList<Chk01_DtlR> dtlAbortOffL = targetDtlL.subList(Chk01_DtlR.$abort_flg, false);
			// 明細の打切ＦＬＧがオフの詳細のリストを抽出
			MCList<Chk01_IoR> dtlAbortOffIoL = getChildIoL(targetIoL, dtlAbortOffL);
			MCList<Chk01_IoR> ioSretSchdAbrtOn = dtlAbortOffIoL.subList(
					Chk01_IoR.$sls_ret_schd_abort_flg, true);
			// 詳細の売上返品打切ＦＬＧがオンからオフに変わったリストを抽出
			MCList<Chk01_IoR> ioSretSchdAbrtChgL = chk01_down2.subList(new String[] {
					Chk01_IoR.$sls_ret_schd_abort_flg,
					Chk01_IoR.$old_sls_ret_schd_abort_flg
			}, new Comparable<?>[] {
					false, true
			});
			callUpd03L.addAll(ioSretSchdAbrtOn);
			callUpd03L.addAll(ioSretSchdAbrtChgL);

			// MSBEL5900.ArrSchd_Upd01の呼出（打切以外）
			callArrSchdSvUpd01(callUpd01L);

			// MSBEL5900.ArrSchd_Upd01の呼出（打切）
			callArrSchdSvUpd01Abrt(callUpd01AbrtL);

			// MSBEL5900.ArrSchd_Upd02の呼出
			callArrSchdSvUpd02(callUpd02L);

			// MSBEL5900.ArrSchd_Upd03の呼出
			callArrSchdSvUpd03(callUpd03L);

		}

		/**
		 * 管理ＮＯの発番
		 */
		protected void setSeq(MCList<Chk01_DtlR> insL) {

			for (Chk01_DtlR r : insL) {
				// 売上返品予定NO
				r.sls_ret_schd_no(chk01_down0.sls_ret_schd_no());
				// 売上予定明細NO
				r.sls_ret_schd_d_no(getStrSeq(MSC_NUM_SYS_TYP.SLSRETSCHDD));
				// 受払進捗管理NO
				r.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			}
		}

		protected void callArrSchdSvUpd01(MCList<Chk01_IoR> ioL) {
			MSBEL_ArrSchdService.ArrSchd_Upd01 ope = MSBEL_ArrSchdService
					.crtArrSchd_Upd01();

			if (!ioL.isEmpty()) {
				// 詳細リストが紐づく明細リストを取得
				MCList<Chk01_DtlR> dtlL = getParDtlL(chk01_down1, ioL);

				addAll(ope.up0(), dtlL, createMap_ArrPr_DtlR_Chk01_DtlR(chk01_down0));
				addAll(ope.up1(), ioL,
						createMap_ArrSchd_DtlR_Chk01_IoR(chk01_down0, dtlL));
				for (MCRow arrPrR : ope.up0().innerRowList("arr_pr")){
					if (isNull(arrPrR.getNumberNE("arr_schd_abort_qty"))){
						arrPrR.setNumberNE("arr_schd_abort_qty", 0);
					}
					if (isNull(arrPrR.getNumberNE("purc_schd_abort_qty"))){
						arrPrR.setNumberNE("purc_schd_abort_qty", 0);
					}
					if (isNull(arrPrR.getNumberNE("sls_ret_schd_abort_qty"))){
						arrPrR.setNumberNE("sls_ret_schd_abort_qty", 0);
					}
				}				
				ope.exec();

				String[] downCopyCols = {
					Chk01_IoR.$arr_schd_no
				};
				
				copyByPegNo(ioL, ope.down0(), Chk01_IoR.$peg_no, downCopyCols, ArrSchd_DtlR.$peg_d_no, downCopyCols);
			}
		}

		protected void callArrSchdSvUpd01Abrt(MCList<Chk01_IoR> ioL) {
			MSBEL_ArrSchdService.ArrSchd_Upd01 ope = MSBEL_ArrSchdService
					.crtArrSchd_Upd01();

			if (!ioL.isEmpty()) {
				// 詳細リストが紐づく明細リストを取得
				MCList<Chk01_DtlR> dtlL = getParDtlL(chk01_down1, ioL);

				addAll(ope.up0(), dtlL, createMap_ArrPr_DtlR_Chk01_DtlR_forUpd01Abrt());
				addAll(ope.up1(), ioL, createMap_ArrSchd_DtlR_Chk01_IoR_forUpd01Abrt(dtlL));
				ope.up0();

				ope.exec();
			}
		}

		protected void callArrSchdSvUpd02(MCList<Chk01_IoR> ioL) {

			if (!ioL.isEmpty()) {
				MSBEL_ArrSchdService.ArrSchd_Upd02 ope = MSBEL_ArrSchdService
						.crtArrSchd_Upd02();

				addAll(ope.up0(), ioL, createMap_ArrSchd_DtlR_Chk01_IoR_forUpd02());
				ope.exec();
			}
		}

		protected void callArrSchdSvUpd03(MCList<Chk01_IoR> ioL) {

			if (!ioL.isEmpty()) {
				MSBEL_ArrSchdService.ArrSchd_Upd03 ope = MSBEL_ArrSchdService
						.crtArrSchd_Upd03();

				addAll(ope.up0(), ioL, createMap_ArrSchd_DtlR_Chk01_IoR_forUpd03());
				ope.exec();
			}
		}

		protected Map_ArrPr_DtlR_Chk01_DtlR_forUpd01Abrt<ArrPr_DtlR, Chk01_DtlR> createMap_ArrPr_DtlR_Chk01_DtlR_forUpd01Abrt() {
			return new Map_ArrPr_DtlR_Chk01_DtlR_forUpd01Abrt<ArrPr_DtlR, Chk01_DtlR>();
		}

		public class Map_ArrPr_DtlR_Chk01_DtlR_forUpd01Abrt<D extends ArrPr_DtlR, S extends Chk01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrPr_DtlR.$arr_pr_no, Chk01_DtlR.$arr_pr_no);
				addColumnPathMap(ArrPr_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
				addColumnPathMap(ArrPr_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}

		protected Map_ArrSchd_DtlR_Chk01_IoR_forUpd01Abrt<ArrSchd_DtlR, Chk01_IoR> createMap_ArrSchd_DtlR_Chk01_IoR_forUpd01Abrt(MCList<Chk01_DtlR> dtlL) {
			return new Map_ArrSchd_DtlR_Chk01_IoR_forUpd01Abrt<ArrSchd_DtlR, Chk01_IoR>(dtlL);
		}

		public class Map_ArrSchd_DtlR_Chk01_IoR_forUpd01Abrt<D extends ArrSchd_DtlR, S extends Chk01_IoR>
				extends MCRowMapper<D, S> {
			MCList<Chk01_DtlR> _dtlL;
			MCIndexKey _idxKey;

			public Map_ArrSchd_DtlR_Chk01_IoR_forUpd01Abrt(MCList<Chk01_DtlR> dtlL) {
				_dtlL = dtlL;
				_idxKey = _dtlL.createIndex(Chk01_DtlR.$dtl_row_id);
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk01_IoR.$arr_schd_no);
				addColumnPathMap(ArrSchd_DtlR.$abort_flg, Chk01_IoR.$abort_flg);
				addColumnPathMap(ArrSchd_DtlR.$sls_ret_schd_abort_flg,
						Chk01_IoR.$sls_ret_schd_abort_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				Chk01_DtlR dtlR = _dtlL.getFirst(_idxKey, src.dtl_row_id());
				dest.peg_no(dtlR.peg_no());
			}
		}

		protected Map_ArrSchd_DtlR_Chk01_IoR_forUpd02<ArrSchd_DtlR, Chk01_IoR> createMap_ArrSchd_DtlR_Chk01_IoR_forUpd02() {
			return new Map_ArrSchd_DtlR_Chk01_IoR_forUpd02<ArrSchd_DtlR, Chk01_IoR>();
		}

		public class Map_ArrSchd_DtlR_Chk01_IoR_forUpd02<D extends ArrSchd_DtlR, S extends Chk01_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$peg_no, Chk01_IoR.$peg_no);
				addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk01_IoR.$arr_schd_no);
				addColumnPathMap(ArrSchd_DtlR.$abort_flg, Chk01_IoR.$abort_flg);
				addColumnPathMap(ArrSchd_DtlR.$lot_no, Chk01_IoR.$lot_no);
				addColumnPathMap(ArrSchd_DtlR.$sublot_no, Chk01_IoR.$sublot_no);
			}
		}

		protected Map_ArrSchd_DtlR_Chk01_IoR_forUpd03<ArrSchd_DtlR, Chk01_IoR> createMap_ArrSchd_DtlR_Chk01_IoR_forUpd03() {
			return new Map_ArrSchd_DtlR_Chk01_IoR_forUpd03<ArrSchd_DtlR, Chk01_IoR>();
		}

		public class Map_ArrSchd_DtlR_Chk01_IoR_forUpd03<D extends ArrSchd_DtlR, S extends Chk01_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk01_IoR.$arr_schd_no);
				addColumnPathMap(ArrSchd_DtlR.$sls_ret_schd_abort_flg, Chk01_IoR.$sls_ret_schd_abort_flg);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上予定情報を取り消しします。<br>
	 */
	public class Del01 extends MSBBL_SlsRetSchdReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェックOpeの呼出
			callThisChk02();

			throwCanErr();

			// 売上返品予定の削除
			del();

			// インボイス取引対象の場合、インボイスNOの削除
			delIvNo(chk02_down0);

			// 	入荷予定サービスの呼出
			callArrSchdSv();

			setDown();

		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			setPegNo(up2());
		}

		/**
		 * 	Chk02オペレーションの呼出
		 */
		protected void callThisChk02() {
			mapUpContainers(CALL_OPE);
			chk02.call();
		}

		protected void del() {
			MCList<MST_SLS_RET_SCHD_D_R> delL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			MST_SLS_RET_SCHD_D_R delL_t = MST_SLS_RET_SCHD_D_R.create("T");
			MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(delL_t);
			delL_bldr.setWhere(delL_t.sls_ret_schd_no.eq(bind("sls_ret_schd_no")), up0());
			dbSelect("MSBBL1330_MST_SLS_RET_SCHD_D_S01", delL, delL_bldr);

			MST_SLS_RET_SCHD_R delR = MST_SLS_RET_SCHD_R.create("T");
			delR.sls_ret_schd_no(up0().sls_ret_schd_no());
			dbDeleteKey("MSBBL1330_MST_SLS_RET_SCHD_D01", delR, MCQueryApiBuilder.create(delR));
			dbDeleteKey("MSBBL1330_MST_SLS_RET_SCHD_D_D02", delL, delL_bldr);
		}

		protected void setDown() {
			// 何もしない
		}

		protected void delIvNo(Chk02_HdrR hdr) {
			//得意先がインボイス取引対象の場合			
			if (!isNullOrNullVal(hdr.iv_no())) {
				MST_IV_NO_R ivR = MST_IV_NO_R.create("T");
				MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(ivR);
				ivR.iv_no(hdr.iv_no());
				dbDeleteKey("MSBBL1330_MST_IV_NO_D01", ivR, ivR_bldr);
			}
		}

		/**
		 * 	入荷予定サービスの呼出
		 */
		protected void callArrSchdSv() {

			MSBEL_ArrSchdService.ArrSchd_Upd01 ope = MSBEL_ArrSchdService
					.crtArrSchd_Upd01();
			addAll(ope.up0(), chk02_down1, createMap_ArrPr_DtlR_Chk02_DtlR());
			addAll(ope.up1(), chk02_down2, createMap_ArrSchd_DtlR_Chk02_IoR());
			ope.exec();

		}

		protected Map_ArrPr_DtlR_Chk02_DtlR<ArrPr_DtlR, Chk02_DtlR> createMap_ArrPr_DtlR_Chk02_DtlR() {
			return new Map_ArrPr_DtlR_Chk02_DtlR<ArrPr_DtlR, Chk02_DtlR>();
		}

		public class Map_ArrPr_DtlR_Chk02_DtlR<D extends ArrPr_DtlR, S extends Chk02_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrPr_DtlR.$arr_pr_no, Chk02_DtlR.$arr_pr_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		protected Map_ArrSchd_DtlR_Chk02_IoR<ArrSchd_DtlR, Chk02_IoR> createMap_ArrSchd_DtlR_Chk02_IoR() {
			return new Map_ArrSchd_DtlR_Chk02_IoR<ArrSchd_DtlR, Chk02_IoR>();
		}

		public class Map_ArrSchd_DtlR_Chk02_IoR<D extends ArrSchd_DtlR, S extends Chk02_IoR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk02_IoR.$arr_schd_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上返品予定情報を新規登録・訂正前チェックをします。<br>
	 */
	public class Chk01 extends MSBBL_SlsRetSchdReg_MC_A.Chk01 {

		MST_SLS_RET_SCHD_R _slsRetSchd;

		MCList<MST_SLS_RET_SCHD_D_R> _slsRetSchdDL;

		Chk01_HdrR _oldHdrR;
		
		MCList<Chk01_DtlR> _oldDtlL;
		
		MCList<Chk01_IoR> _oldIoL;
		
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				// 入荷予定サービス更新前チェック
				chkArrSchdSv();
			}

			
			setDown();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
			down2().addAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			// 補完処理
			compHdrBase();
			compDtlBase();
			compIoBase();

			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().sls_ret_schd_no())) {

				_slsRetSchd = MST_SLS_RET_SCHD_R.create("T");
				dbSelectKeyForUpdateNoWait("MSBBL1330_MST_SLS_RET_SCHD_S01", _slsRetSchd,
						MCQueryApiBuilder.create(_slsRetSchd), up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _slsRetSchd));

				// 明細の排他ロック獲得(更新カウンタチェックはしない)
				_slsRetSchdDL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
				MST_SLS_RET_SCHD_D_R slsRetSchdDL_t = MST_SLS_RET_SCHD_D_R.create("T");
				MCQueryApiBuilder slsRetSchdDL_bldr = MCQueryApiBuilder.create(slsRetSchdDL_t);
				slsRetSchdDL_bldr.setWhere(slsRetSchdDL_t.sls_ret_schd_no.eq(bind("sls_ret_schd_no")), up0());
				dbSelectForUpdate("MSBBL1330_MST_SLS_RET_SCHD_D_S02", _slsRetSchdDL, slsRetSchdDL_bldr);
				
				MCIndexKey slsRetSchdIdx = _slsRetSchdDL.createIndex(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_d_no);
				_slsRetSchdDL.addStringColumn(MST_ARR_PR_R.$arr_pr_no);
				
				// 入荷進捗の更新カウンタチェック
				for (Chk01_DtlR dtlR : up1()) {
					if (!isNull(dtlR.arr_pr_no())) {
						MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("T");
						dbSelectKeyForUpdateNoWait("MSBBL1330_MST_ARR_PR_S02", arrPrR,
								MCQueryApiBuilder.create(arrPrR), dtlR);
						msgL.addAll(checkUpdCntrNE(dtlR, Chk01_DtlR.$arr_pr_upd_cntr, arrPrR));
						MST_SLS_RET_SCHD_D_R slsRetSchdDR = _slsRetSchdDL.getFirst(slsRetSchdIdx, arrPrR.sls_ret_schd_d_no());
						if (!isNull(slsRetSchdDR)) {
							slsRetSchdDR.setString(MST_ARR_PR_R.$arr_pr_no, arrPrR.arr_pr_no());
						}
					}
				}
			}

			return msgL;
		}

		/**
		 * 詳細0件チェックのユーティリティメソッド
		 * <p>明細に紐づく詳細行が1件以上存在すること</p>
		 * @param dtlL
		 * @param ioL
		 * @return
		 */
		protected MCMessageList checkAtLeastOneIo(MCList<Chk01_DtlR> dtlL,
				MCList<Chk01_IoR> ioL) {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey idxkey = ioL.createIndex(Chk01_IoR.$dtl_row_id);
			for (Chk01_DtlR parDtl : dtlL) {
				MCList<Chk01_IoR> chdIoL = createChk01_IoL();
				if (parDtl.isStatusDelete()) {
					chdIoL = up2().subList(idxkey, parDtl.toArray(Chk01_DtlR.$dtl_row_id)).subList(DELETE);
				}
				else {
					chdIoL = up2().subList(idxkey, parDtl.toArray(Chk01_DtlR.$dtl_row_id)).subList(CREATE, MODIFY, NONE);
				}
				if (chdIoL.isEmpty()) {
					msgL.add(new mcframe.commonCore.notice.MCMessage(parDtl, null,
							MAUDL0012, toDispGUIIndex(parDtl)));
				}
			}
			return msgL;
		}

		/**
		 * 	ヘッダ情報の補完処理(定型チェック実施前)
		 */
		protected void compHdrBase() {
			if (!isNull(_slsRetSchd)) {
				// 更新前のインボイスＮＯを取得
				up0().old_iv_no(_slsRetSchd.iv_no());
			}
		}

		/**
		 * 	明細情報の補完処理(定型チェック実施前)
		 */
		protected void compDtlBase() {

		}

		/**
		 * 	詳細情報の保管処理(定型チェック実施前)
		 * <li>
		 * 	LIST_LOGIC定型処理で品目単位マスタのチェック前に明細から品目情報をコピーする
		 * </li>
		 */
		protected void compIoBase() {

			MCIndexKey idxKey = up2().createIndex(Chk01_IoR.$dtl_row_id);
			for (Chk01_DtlR r : up1()) {
				MCList<Chk01_IoR> ioL = up2().subList(idxKey, r.dtl_row_id()).subList(CREATE, MODIFY, NONE);
				for (Chk01_IoR r2 : ioL) {
					r2.itm_cd(r.itm_cd());
					r2.itm_sub1(r.itm_sub1());
					r2.itm_sub2(r.itm_sub2());
					r2.itm_sub3(r.itm_sub3());
					r2.ver_no(r.ver_no());
					
					// null文字の補完
					if (!isNull(r.loc_cd()) && isNull(r.str_ln_cd())) {
						r.str_ln_cd(MAC_STR.NULL_VAL.value());
					}
					if (r.vmi_flg()) {
						if (!isNull(r.cnsgn_loc_cd()) && isNull(r.cnsgn_str_ln_cd())) {
							r.cnsgn_str_ln_cd(MAC_STR.NULL_VAL.value());
						}
					}
				}
			}
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			if (hasErrFlgOn(up0(), up1(), up2())) {
				return msgL;
			}
			
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * <p>新規については既存処理でチェック。訂正と、訂正の行削除についてのみチェックを行う。</p>
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> chkTgtL= up1().subList(MODIFY, DELETE);
			
			if (!isNull(chkTgtL)) {
				MCList<MAM_ITM_R> mamItmL = searchMamItm(_slsRetSchdDL);
				
				MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
				MCIndexKey slsRetSchdDIdx = _slsRetSchdDL.createIndex(Chk02_DtlR.$arr_pr_no);
				
				for (Chk01_DtlR chkTgtR : chkTgtL) {
					MST_SLS_RET_SCHD_D_R slsRetSchdDR = MST_SLS_RET_SCHD_D_R.create();
					slsRetSchdDR = _slsRetSchdDL.getFirst(slsRetSchdDIdx, chkTgtR.arr_pr_no());
					
					if (chkTgtR.isStatusDelete()
							|| !(isSame(chkTgtR.itm_cd(), slsRetSchdDR.itm_cd())
							&& isSame(chkTgtR.itm_sub1(), slsRetSchdDR.itm_sub1())
							&& isSame(chkTgtR.itm_sub2(), slsRetSchdDR.itm_sub2())
							&& isSame(chkTgtR.itm_sub3(), slsRetSchdDR.itm_sub3()))){
						if (isNull(mamItmL.getFirst(mamItmIdx, slsRetSchdDR.itm_cd(), slsRetSchdDR.itm_sub1(), slsRetSchdDR.itm_sub2(), slsRetSchdDR.itm_sub3()))) {
							String itmInfo = toDispItm(slsRetSchdDR.itm_cd(), slsRetSchdDR.itm_sub1(), slsRetSchdDR.itm_sub2(), slsRetSchdDR.itm_sub3());
							msgL.add(new MCMessage(chkTgtR, null, MAUAL0189, itmInfo, toDispGUIIndex(chkTgtR)));
						}
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// ブロックにエラーがある場合、定型チェックがスキップされリストロジックから補完されない
			// そのまま続行すると、補完値ありきで実装しているためNullPointerが発生する
			if (hasErrFlgOn(up0(), up1(), up2())) {
				return msgL;
			}
			
			// DAC更新権限チェック
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$sls_dpt_cd));
			
			// 訂正前の売上部門に対してDAC更新権限チェック
			if (!isNull(up0().sls_ret_schd_no()) && !isNull(_slsRetSchd) && !isSame(up0().sls_dpt_cd(), _slsRetSchd.sls_dpt_cd())) {
				msgL.addAll(checkWritableDptCdDac(_slsRetSchd, MST_SLS_RET_SCHD_R .$sls_dpt_cd));
			}

			// 条件付き必須チェック
			msgL.addAll(checkReqSub());

			// 条件付き存在チェック
			msgL.addAll(checkExistsSub());
			
			// 有効明細行数チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			// 補完処理
			compHdrSub();
			compDtlSub();
			compIoSub();

			// 固有チェック
			msgL.addAll(checkOther());

			return msgL;
		}

		/**
		 * 	条件付き必須チェック
		 * @return
		 */
		protected MCMessageList checkReqSub() {
			MCMessageList msgL = new MCMessageList();

			// インボイスＮＯ
			// 売上返品かつインボイス取引ＦＬＧがオンで自動ＦＬＧがオフの場合は必須
			if (MAC_TRD_PTN_TYP.isSLS_RTN(up0().trd_ptn_typ()) && up0().cst_iv_flg() && !up0().num_flg()) {
				msgL.addAll(check(up0(), Chk01_HdrR.$iv_no, new FXUCL_RequiredValidater()));
			}
			
			if (MAC_TRD_PTN_TYP.isSLS_RTN(up0().trd_ptn_typ())) {
				// 債権部門
				msgL.addAll(check(up0(), Chk01_HdrR.$ar_dpt_cd, new FXUCL_RequiredValidater()));
				
				// 取引通貨
				msgL.addAll(check(up0(), Chk01_HdrR.$trd_cur_cd, new FXUCL_RequiredValidater()));	
				// 為替レート
				msgL.addAll(check(up0(), Chk01_HdrR.$xrate, new FXUCL_RequiredValidater()));
				// 納税通貨が設定されている場合
				if (!isNull(getCo().ptax_cur_cd())) {
					// 納税レート
					msgL.addAll(check(up0(), Chk01_HdrR.$ptax_xrate, new FXUCL_RequiredValidater()));
				}
			}

			for (Chk01_DtlR r : up1().subList(CREATE, MODIFY, NONE)) {

				// 品名
				// 諸口品ＦＬＧがオンの場合必須
				if (r.sundry_itm_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$itm_nm,
							new FXUCL_RequiredValidater()));
				}

				// インボイス表記品名
				// インボイス取引ＦＬＧがオンで諸口品ＦＬＧがオンの場合必須
				if (up0().cst_iv_flg() && r.sundry_itm_flg() && MAC_TRD_PTN_TYP.isSLS_RTN(up0().trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$iv_itm_nm,
							new FXUCL_RequiredValidater()));
				}

				// 納品先名・郵便番号・住所1
				// 納品先諸口ＦＬＧがオンの場合必須
				if (r.dlv_sundry_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$dlv_nm,
							new FXUCL_RequiredValidater()));

				}

				// 値引理由
				// 値引額が指定時は必須
				if (!isNull(r.trd_cur_dscnt_amt())) {
					msgL.addAll(check(r, Chk01_DtlR.$dscnt_rsn_cd,
							new FXUCL_RequiredValidater()));
				}

				// 負担部門
				// 売上返品で返品理由の販売田勘定ＦＬＧがオフの場合必須
				if (MAC_TRD_PTN_TYP.isSLS_RTN(up0().trd_ptn_typ())) {
					if (r.sls_acxfr_flg()) {
						msgL.addAll(check(r, Chk01_DtlR.$bd_dpt_cd,
								new FXUCL_RequiredValidater()));
					}
					
					//　取引通貨単価
					msgL.addAll(check(r, Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
					
					//　税
					msgL.addAll(check(r, Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
				}
				
			}
			
			for (Chk01_IoR r : up2().subList(CREATE, MODIFY, NONE)) {
				Chk01_DtlR par = getParDtlR(up1(), r);
				if (!MAC_STK_MNG_TYP.isNOT_MNG(par.stk_mng_typ())) {
					msgL.addAll(check(r, Chk01_IoR.$gd_cd,	new FXUCL_RequiredValidater()));
				}
				// 貸出の場合
				if (up0().vmi_flg()) {
					// 貸出格付
					msgL.addAll(check(r, Chk01_IoR.$cnsgn_gd_cd, new FXUCL_RequiredValidater()));
					// 貸出場所
					msgL.addAll(check(r, Chk01_IoR.$cnsgn_loc_cd, new FXUCL_RequiredValidater()));
				}
			}

			return msgL;
		}

		/**
		 * 	条件付き存在チェック
		 * @return
		 */
		protected MCMessageList checkExistsSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> chkDtlL = up1().subList(CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> chkIoL = up2().subList(CREATE, MODIFY, NONE);
			MCList<MCRow> lotChkL = MCList.create(MCRow.class);
			MCList<MCRow> lotChkIoL = MCList.create(MCRow.class);

			for (Chk01_DtlR r : chkDtlL) {

				// 売上返品予定明細ＮＯ
				if (!isNull(r.sls_ret_schd_d_no()) && !isNull(_slsRetSchd)) {

					MCIndexKey idxKey = _slsRetSchdDL
							.createIndex(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_d_no);

					if (!_slsRetSchdDL.contains(idxKey, r.sls_ret_schd_d_no())) {
						msgL.addAll(getRecordNotFoundMsg("MS", "MST_SLS_RET_SCHD_D",
								idxKey.getKeys(), new String[] {
									r.sls_ret_schd_d_no()
								}, r));
					}
				}

				// 返品理由
				// 売上返品以外、または、単価がゼロ以外の場合、販売他勘定FLG='0'
				if (!MAC_TRD_PTN_TYP.isSLS_RTN(up0().trd_ptn_typ())
						|| (!isNull(r.trd_cur_upri()) && !r.trd_cur_upri().isZero())) {
					MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
					int cnt = execDbCount("MSBBL1330_MAM_BIZ_RSN_S01", t, t.sls_acxfr_flg.eq(value(false))
							.and(t.biz_rsn_cd.eq(bind("ret_rsn_cd"))), r);
					if (cnt <= 0) {
						msgL.addAll(getRecordNotFoundMsg("MA", "MAM_BIZ_RSN",
								new String[] {Chk01_DtlR.$ret_rsn_cd}, new String[] {r.ret_rsn_cd()}, r));
					}
				}

				// 参照納品書ＮＯ、参照納品書明細ＮＯ
				if (!isNullAnd(r.ref_dlv_slip_no(), r.ref_dlv_slip_d_no())) {
					if (selectCountRefDlvSlip(r) <= 0) {
						msgL.addAll(getRecordNotFoundMsg("MS", "MST_DLV_SLIP_D",
								new String[] {
										Chk01_DtlR.$ref_dlv_slip_no,
										Chk01_DtlR.$ref_dlv_slip_d_no
								}, new String[] {
										r.ref_dlv_slip_no(), r.ref_dlv_slip_d_no()
								}, r));
					}
				}

				// 参照売上実績ＮＯ、参照売上実績明細ＮＯ
				if (!isNullAnd(r.ref_sls_act_no(), r.ref_sls_act_d_no())) {
					if (selectCountRefSlsAct(r) <= 0) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$ref_sls_act_d_no,
								MSBBL0049, r.ref_sls_act_no(), r.ref_sls_act_seq(), r
										.ref_sls_act_d_no(), r.ref_sls_act_d_seq()));
					}
				}

				// ロット・サブロットチェック
				if (!isNullOrNullVal(r.lot_no())) {
					lotChkL.add(r);
				}
			}

			for (Chk01_IoR r : chkIoL) {
				// ロット・サブロットチェック
				if (!isNullOrNullVal(r.lot_no())) {
					lotChkIoL.add(r);
				}
			}

			// ロット・サブロットチェックはサービス呼出にて行う
			callLotSvChk03(lotChkL, lotChkIoL);

			return msgL;
		}
		
		
		protected MCMessageList checkIVTrd(){
			MCMessageList msgL = new MCMessageList();
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(up0().trd_ptn_typ()) && 
					up0().cst_iv_flg()){
				MCList<Chk01_DtlR> dtlL = up1().subList(CREATE, MODIFY, NONE);				
				MCList<MST_SHIP_ACT_D_R> saL = getShipRetLForIV(dtlL);
				MCIndexKey idx = saL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);
				for (Chk01_DtlR r : dtlL) {
					if (isNull(r.ref_dlv_slip_d_no())) {
						continue;
					}
					
					MCList<MST_SHIP_ACT_D_R> lst = saL.subList(idx, r.ref_dlv_slip_d_no());
					if (r.base_unit_qty().gt(lst.sum("retQty"))) {
						msgL.add(new MCMessage(r, null, MSBBL0302, lst.sum("retQty"), toDispGUIIndex(r)));
					}
				}
				//インボイス単位出荷チェック
				//出荷実績トランにＩ／Ｖ ＮＯが設定されている場合が、インボイス出荷単位です。
				String dlvSlipNo = "";
				for (Chk01_DtlR r : dtlL) {
					if (!isNull(r.ref_dlv_slip_no())) {
						dlvSlipNo = r.ref_dlv_slip_no();
						break;
					}					
				}
				//納品書ＮＯを元にIV＿NOを取得する。				
				if (!isSame(dlvSlipNo, "")){
					MCList<MST_DLV_SLIP_D_R> dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
					MST_DLV_SLIP_D_R dlvSlipDL_t = MST_DLV_SLIP_D_R.create("T");
					MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(dlvSlipDL_t);
					MST_SHIP_ACT_D_R dlvSlipDL_t2 = MST_SHIP_ACT_D_R.create("T2");
					MST_SHIP_ACT_R dlvSlipDL_t3 = MST_SHIP_ACT_R.create("T3");
					dlvSlipDL_bldr.addInnerJoin(dlvSlipDL_t2,
							bracket(dlvSlipDL_t.dlv_slip_d_no.eq(dlvSlipDL_t2.dlv_slip_d_no)
									.and(dlvSlipDL_t.dlv_slip_no.eq(dlvSlipDL_t2.dlv_slip_no))
									.and(dlvSlipDL_t.dlv_slip_seq.eq(dlvSlipDL_t2.dlv_slip_seq))
									.and(dlvSlipDL_t2.can_flg.eq(value(false)))));
					dlvSlipDL_bldr.addInnerJoin(dlvSlipDL_t3, bracket(
							dlvSlipDL_t2.ship_act_no.eq(dlvSlipDL_t3.ship_act_no)));
					dlvSlipDL_bldr.addSelect(dlvSlipDL_t3.iv_no);
					dlvSlipDL_bldr.setWhere(dlvSlipDL_t.dlv_slip_no.eq(bind("1")), dlvSlipNo);
					dbSelect("MSBBL1330_MST_DLV_SLIP_D_S02", dlvSlipDL, dlvSlipDL_bldr);
					
					boolean isError = false;
					for (MST_DLV_SLIP_D_R dlvSlipDR : dlvSlipDL){
						if (!isNull(dlvSlipDR.getStringNE("iv_no"))){
							MCList<Chk01_DtlR> upSubL = dtlL.subList(Chk01_DtlR.$ref_dlv_slip_d_no, dlvSlipDR.dlv_slip_d_no());
							if (isNull(upSubL) || upSubL.isEmpty()){
								isError = true;
							}
							else {
								Chk01_DtlR checkR = upSubL.get(0);
								if (!isSame(dlvSlipDR.trd_unit_cd(),checkR.trd_unit_cd())
										|| !isSame(dlvSlipDR.trd_unit_qty(),checkR.trd_unit_qty())){
									isError = true;
								}
								//インボイス単位出荷の場合は、入荷予定（下段）の打切は認めない
								if (checkR.abort_flg()){
									//「インボイス単位出荷に対する出荷返品予定は打切できません。{1}」
									msgL.add(new MCMessage(MSBBL0249, toDispGUIIndex(checkR)));	
								}
							}
						}
					}
					if (isError){
						msgL.add(new MCMessage(MSBBL0248, dlvSlipDL.get(0).getStringNE("iv_no")));
					}
				}
			}
			return msgL;
		}

		/**
		 * 固有チェック
		 * 	<p>
		 * 	補完処理後に実施される
		 * 	</p>
		 * @return
		 */
		protected MCMessageList checkOther() {
			MCMessageList msgL = new MCMessageList();

			Chk01_HdrR hdr = up0();
			MCList<Chk01_DtlR> dtlL = up1().subList(CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> ioL = up2().subList(CREATE, MODIFY, NONE);

			// インボイスＮＯチェック（登録済チェック）
			// インボイス取引対象で自動ＦＬＧがオフ、 新規登録時、または更新時でインボイスＮＯが変更され場合
			// 同一インボイスＮＯが存在しないこと
			if (hdr.cst_iv_flg() && !hdr.num_flg() && !isNull(hdr.iv_no())) {
				if (!isSame(up0().iv_no(), up0().old_iv_no())) {
					MST_IV_NO_R t = MST_IV_NO_R.create("T");
					int cnt = execDbCountKey("MSBBL1330_MST_IV_NO_S01", t, up0());
					if (cnt > 0) {
						msgL.add(new MCMessage(hdr, Chk01_HdrR.$iv_no, MSBBL0071));
					}
				}
			}

			// インボイスＮＯチェック（自動時チェック）
			// インボイス取引対象で自動ＦＬＧがオンの場合にインボイスＮＯが入力されている
			if (hdr.cst_iv_flg()) {
				if (hdr.num_flg() && !isNull(hdr.iv_no())) {
					msgL.add(new MCMessage(hdr, Chk01_HdrR.$iv_no, MSBBL0072));
				}
			}

			// 物流Ｇ混在チェック
			// 明細・詳細で指定した場所の物流グループＣＤが異なるものが含まれている場合
			msgL.addAll(checkLgGrpMix(dtlL, ioL));
			
			// 入荷予定サービス用チェック
			msgL.addAll(checkBeforeSrv(hdr, dtlL, up2()));
			//インボイス単位出荷チェック,インボイス登録の取消チェック
			msgL.addAll(checkIVTrd());

			//出荷返品の場合だけ、売上予定から基準単位数量と基準単位売上数量を取得
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(hdr.trd_ptn_typ())){
				MST_SLS_SCHD_R slsSchd = MST_SLS_SCHD_R.create("SLS_SCHD");
				MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchd);
				slsSchdL_bldr.setSelect(slsSchd.base_unit_qty);
				slsSchdL_bldr.addSelect(slsSchd.base_unit_sls_qty);
				slsSchdL_bldr.addSelect(slsSchd.dlv_slip_d_no);
				slsSchdL_bldr.setWhere(slsSchd.dlv_slip_d_no.eq(bind("ref_dlv_slip_d_no")));
				dbSelect("MSBBL1330_MST_SLS_SCHD_S01", slsSchdL, slsSchdL_bldr, dtlL);
			}
			MCIndexKey slsSchdKey = slsSchdL.createIndex(MST_SLS_SCHD_R.$dlv_slip_d_no);

			MCMessageList tmpMsgL = new MCMessageList();
			for (Chk01_DtlR r : dtlL) {

				// 仕向先ＣＤ２チェック
				// 仕向先ＣＤ１が未入力で仕向先ＣＤ２が入力されている
				if (isNull(r.dest_cd1()) & !isNull(r.dest_cd2())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$dest_cd2, MSBBL0074));
				}

				// 仕向先ＣＤ３チェック
				// 仕向先ＣＤ２が未入力で仕向先ＣＤ２が入力されている
				if (isNull(r.dest_cd1()) & !isNull(r.dest_cd2())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$dest_cd3, MSBBL0075));
				}

				// 出荷返品数量上限チェック（インボイスＮＯ紐付なし）
				// 出荷返品のうちインボイスＮＯが指定されていない場合、数量の上限は出荷実績登録している数量まで
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(hdr.trd_ptn_typ()) && isNull(hdr.iv_no())
						&& !isNull(r.base_unit_qty()) && !isNull(r.ref_dlv_slip_d_no())) {
					if (r.base_unit_qty().gt(getShipActQty(r))) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0077));
					}
					else {
						//入力数量の上限は未売上数量まで
						MST_SLS_SCHD_R slsSchdR = slsSchdL.getFirst(slsSchdKey, r.ref_dlv_slip_d_no());
						if(!isNull(slsSchdR) && !isNull(slsSchdR.base_unit_qty()) && !isNull(slsSchdR.base_unit_sls_qty())) {
							MCNumber notSlsQty = slsSchdR.base_unit_qty().subtract(slsSchdR.base_unit_sls_qty());
							if(r.base_unit_qty().gt(notSlsQty)) {
								msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0514, r.base_unit_qty(), notSlsQty));
							}
						}
					}
				}

				// 以下、	明細・詳細相違チェック
				MCList<Chk01_DtlR> parL = MCList.create(Chk01_DtlR.class);
				parL.add(r);
				// 明細に紐づく詳細のリストを取得
				MCList<Chk01_IoR> chdL = getChildIoL(ioL, parL);
				if (chdL.isEmpty()) {
					continue;
				}

				// 数量 
				// 明細の数量と詳細の数量（合計）が異なる場合※基準単位換算
				if (!isSame(r.base_unit_qty(), chdL.sum(Chk01_DtlR.$base_unit_qty))) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBBL0079));
				}

				// 手配ＮＯ１～４
				tmpMsgL.clear();
				tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno1, Chk01_IoR.$sno1, chdL));
				if (tmpMsgL.size() > 0) {
					msgL.addAll(tmpMsgL);
				}
				if (tmpMsgL.size() == 0) {
					tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno2, Chk01_IoR.$sno2, chdL));
					if (tmpMsgL.size() > 0) {
						msgL.addAll(tmpMsgL);
					}
				}
				if (tmpMsgL.size() == 0) {
					tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno3, Chk01_IoR.$sno3, chdL));
					if (tmpMsgL.size() > 0) {
						msgL.addAll(tmpMsgL);
					}
				}
				if (tmpMsgL.size() == 0) {
					tmpMsgL.addAll(checkSno(r, Chk01_DtlR.$sno4, Chk01_IoR.$sno4, chdL));
					if (tmpMsgL.size() > 0) {
						msgL.addAll(tmpMsgL);
					}
				}

				// ロットＮＯ
				// 明細のロットが入力されている場合に、詳細のロットと異なる場合
				if (!isNullOrNullVal(r.lot_no())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$lot_no)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$lot_no, MSBBL0081));
					}
				}

				// サブロットＮＯ
				// 明細のサブロットが入力されている場合に、詳細のサブロットと異なる場合
				if (!isNullOrNullVal(r.sublot_no())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$sublot_no)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$sublot_no, MSBBL0082));
					}
				}

				// 場所ＣＤ
				// 明細の場所が入力されている場合に、詳細の場所と異なる場合
				if (!isNull(r.loc_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$loc_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$loc_cd, MSBBL0083));
					}
				}

				// 棚・ライン
				if (!isNullOrNullVal(r.str_ln_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$str_ln_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$str_ln_cd, MSBBL0084));
					}
				}

				// 格付
				// 詳細の格付と異なる場合
				if (!isNull(r.gd_cd())) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(chdL.get(0).stk_mng_typ()) && !isSameParChild(r, chdL, Chk01_DtlR.$gd_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$gd_cd, MSBBL0085));
					}
				}
				
				// 貸出格付
				// 詳細の貸出格付と異なる場合
				if (!isNull(r.cnsgn_gd_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$cnsgn_gd_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$cnsgn_gd_cd, MSBBL0239));
					}
				}
				
				// 貸出場所
				if (!isNull(r.cnsgn_loc_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$cnsgn_loc_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$cnsgn_loc_cd, MSBBL0265));
					}
				}
				
				// 貸出棚・ライン
				if (!isNullOrNullVal(r.cnsgn_str_ln_cd())) {
					if (!isSameParChild(r, chdL, Chk01_DtlR.$cnsgn_str_ln_cd)) {
						msgL.add(new MCMessage(r, Chk01_DtlR.$cnsgn_str_ln_cd, MSBBL0266));
					}
				}
			}

			return msgL;
		}

		/**
		 * 手配ＮＯ１～４の値が明細(親)と詳細(子)で同一値か判定する
		 * @param r
		 * @param tgtSnoDtl
		 * @param tgtSnoIo
		 * @param chdL
		 * @return
		 */
		protected MCMessageList checkSno(Chk01_DtlR r, String tgtSnoDtl, String tgtSnoIo, MCList<Chk01_IoR> chdL) {
			MCMessageList msgL = new MCMessageList();
			String sno = r.getStringNE(tgtSnoDtl);
			if (!isNullOrNullVal(sno)) {
				for (Chk01_IoR chd : chdL) {
					if (!(isSame(sno, chd.getStringNE(tgtSnoIo)) || isNullOrNullVal(chd.getStringNE(tgtSnoIo)))) {
						msgL.add(new MCMessage(r, tgtSnoDtl, MSBBL0080));
						break;
					}
				}
			}
			return msgL;
		}

		/**
		 * 	指定カラムの値が明細(親)と詳細(子)で同一値か判定する
		 * <p>
		 * 	明細と詳細は1:Ｎの関係であるが、指定カラムの値が明細・詳細ともにすべて同一値の場合はtrue<br>
		 * 	上記以外の場合はfalseを返す
		 * </p>
		 * @param par
		 * @param chdL
		 * @param col
		 * @return
		 */
		protected boolean isSameParChild(Chk01_DtlR par, MCList<Chk01_IoR> chdL,
				String col) {

			if (!par.contains(col) || !chdL.get(0).contains(col)) {
				return false;
			}

			for (Chk01_IoR chd : chdL) {
				if (!isSame(par.getValue(col), chd.getValue(col))) {
					return false;
				}
			}

			return true;
		}

		/**
		 * 	参照納品伝票の件数を取得する
		 * <p>
		 * 	参照納品書ＮＯ、参照納品書明細ＮＯ、<br>
		 * 	伝票状況：「新規」の条件で納品伝票ヘッダと納品伝票明細の件数を取得する
		 * </p>
		 * @param dtlR
		 * @return
		 */
		protected int selectCountRefDlvSlip(Chk01_DtlR dtlR) {
			MST_DLV_SLIP_R dlvSlip = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dlvSlip_bldr = MCQueryApiBuilder.create(dlvSlip);
			MST_DLV_SLIP_D_R t2 = MST_DLV_SLIP_D_R.create("T2");
			dlvSlip_bldr.addInnerJoin(t2, bracket( dlvSlip.dlv_slip_no.eq(t2.dlv_slip_no)
											.and(dlvSlip.dlv_slip_seq.eq(t2.dlv_slip_seq))));
			dlvSlip_bldr.setWhere(dlvSlip.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())));
			dlvSlip_bldr.addWhereWithAnd(dlvSlip.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())));
			dlvSlip_bldr.addWhereWithAnd(dlvSlip.dlv_slip_no.eq(bind("ref_dlv_slip_no")), dtlR);
			dlvSlip_bldr.addWhereWithAnd(t2.dlv_slip_d_no.eq(bind("ref_dlv_slip_d_no")), dtlR);
			MCList<MST_DLV_SLIP_R> rlstL = MCList.create(MST_DLV_SLIP_R.class);
			return dbSelect("MSBBL1330_MST_DLV_SLIP_S01", rlstL, dlvSlip_bldr);
		}

		/**
		 * 	参照売上実績情報の件数を取得する
		 * <p>
		 * 	参照売上実績ＮＯ、参照売上実績明細ＮＯ、参照売上実績連番、参照売上実績明細連番、<br>
		 * 	伝票状況：「新規」の条件で売上実績ヘッダと売上実績明細の件数を取得する
		 * </p>
		 * @param dtlR
		 * @return
		 */
		protected int selectCountRefSlsAct(Chk01_DtlR dtlR) {
			MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsAct_bldr = MCQueryApiBuilder.create(slsAct);
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			slsAct_bldr.addInnerJoin(t2, bracket( slsAct.sls_act_no.eq(t2.sls_act_no)
											.and(slsAct.sls_act_seq.eq(t2.sls_act_seq))));
			slsAct_bldr.setWhere(slsAct.sls_act_no.eq(bind("ref_sls_act_no")), dtlR);
			slsAct_bldr.addWhereWithAnd(slsAct.sls_act_seq.eq(bind("ref_sls_act_seq")), dtlR);
			slsAct_bldr.addWhereWithAnd(t2.sls_act_d_no.eq(bind("ref_sls_act_d_no")), dtlR);
			slsAct_bldr.addWhereWithAnd(t2.sls_act_d_seq.eq(bind("ref_sls_act_d_seq")), dtlR);
			slsAct_bldr.addWhereWithAnd(slsAct.slip_sts_typ.in( value(MAC_SLIP_STS_TYP.CRT.value()), value(MAC_SLIP_STS_TYP.DIS.value())));
			return dbSelect("MSBBL1330_MST_SLS_ACT_S02", slsAct, slsAct_bldr);
		}


		/**
		 * 	出荷実績数量を取得する
		 * @param dtlR
		 * @return
		 */
		protected MCNumber getShipActQty(Chk01_DtlR dtlR) {
			MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(t);
			shipActDL_bldr.setSelect(t.base_unit_qty);
			shipActDL_bldr.setWhere(t.dlv_slip_d_no.eq(bind("ref_dlv_slip_d_no")));
			shipActDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBBL1330_MST_SHIP_ACT_D_S01", shipActDL, shipActDL_bldr, dtlR);
			return shipActDL.sum(MST_SHIP_ACT_D_R.$base_unit_qty);
		}

		/**
		 * ヘッダ情報の補完処理(定型チェック実施後)
		 */
		protected void compHdrSub() {
			// 同時計上ＦＬＧ
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(up0().trd_ptn_typ())) {
				up0().sync_flg(true);
			}
		}

		/**
		 * 	明細情報補完処理(定型チェック実施後)
		 */
		protected void compDtlSub() {
			
			_oldDtlL = getOldDtlL(up1().subList(MODIFY, NONE));
			
			MCIndexKey idxKey = _oldDtlL.createIndex(Chk01_DtlR.$sls_ret_schd_d_no);
			int i = 1;
			for (Chk01_DtlR r : up1().subList(CREATE, MODIFY, NONE)) {
				// 基準単位数量
				r.base_unit_qty(getBaseUnitQty(r));

				// 取引通貨金額、取引通貨税額取得
				calcAmt(up0(), r);

				// 表示順
				r.disp_seq(i++);
				
				// 入荷数量
				Chk01_DtlR oldDtlR = _oldDtlL.getFirst(idxKey, r.sls_ret_schd_d_no());
				if (!isNull(oldDtlR)) {
					r.arr_qty(oldDtlR.arr_qty());
					r.cmpl_flg(oldDtlR.cmpl_flg());
				}
			}
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = getSundryItm(up1());
			
			MCIndexKey idxkey = sundryItmL.createIndex(MAM_SUNDRY_ITM_R.$itm_cd,
					MAM_SUNDRY_ITM_R.$itm_sub1,
					MAM_SUNDRY_ITM_R.$itm_sub2,
					MAM_SUNDRY_ITM_R.$itm_sub3,
					MAM_SUNDRY_ITM_R.$sno1,
					MAM_SUNDRY_ITM_R.$sno2,
					MAM_SUNDRY_ITM_R.$sno3,
					MAM_SUNDRY_ITM_R.$sno4);
			
			MAM_SUNDRY_ITM_R sundryItmR = null;
			
			for (Chk01_DtlR r : up1()) {
				
				if (r.sundry_itm_flg() && MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						
					sundryItmR = sundryItmL.getFirst(idxkey, 
							r.itm_cd(), 
							r.itm_sub1(), 
							r.itm_sub2(), 
							r.itm_sub3(), 
							r.sno1(),
							r.sno2(), 
							r.sno3(), 
							r.sno4());
					
					if (!isNull(sundryItmR) && !sundryItmR.isEmpty()) {
						r.itm_nm(sundryItmR.itm_nm());
					}
					else {
						throw new MCAppException(
								MSBBL0251, 
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), 
								toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), 
								toDispGUIIndex(r));
					}
				}
			}
		}
		
		/**
		 * 諸口品マスタを取得する。
		 * @param dtlL 売上値引明細
		 * @return 諸口品マスタ
		 */
		protected MCList<MAM_SUNDRY_ITM_R> getSundryItm(MCList<Chk01_DtlR> dtlL) {
			
			MCList<MAM_SUNDRY_ITM_R> bindL = MCList.create(MAM_SUNDRY_ITM_R.class);
			
			MCIndexKey idxkey = dtlL.createIndex(Chk01_DtlR.$sundry_itm_flg, Chk01_DtlR.$stk_mng_typ);
			
			setAll(bindL, dtlL.subList(idxkey, true, MAC_STK_MNG_TYP.MNG.value()), createMap_MAM_SUNDRY_ITM_R_Chk01_DtlR());
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = MCList.create(MAM_SUNDRY_ITM_R.class);
			
			if (!bindL.isEmpty()) {
				MCQueryApiBuilder sundryItmL_bldr = MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"));
				sundryItmL_bldr.setSelectAll();
				dbSelectKey("MSBBL1330_MAM_SUNDRY_ITM_S01", sundryItmL, sundryItmL_bldr, bindL);
			}
			
			return sundryItmL;
		}

		/**
		 * 	詳細情報の補完処理(定型チェック実施後)
		 */
		protected void compIoSub() {
			
			MCList<Chk01_DtlR> dtlL = up1().subList(CREATE, MODIFY, NONE);
			MCList<Chk01_IoR> ioL = up2().subList(CREATE, MODIFY, NONE);
			
			_oldIoL = getOldIoL(up2().subList(MODIFY, NONE));
			MCIndexKey idxKey = _oldIoL.createIndex(Chk01_IoR.$arr_schd_no);
			
			for (Chk01_DtlR parDtlR : dtlL) {
				MCList<Chk01_DtlR> parL = MCList.create(Chk01_DtlR.class);
				parL.add(parDtlR);
				for (Chk01_IoR chdIoR : getChildIoL(ioL, parL)) {
					chdIoR.base_unit_cd(parDtlR.base_unit_cd());
					chdIoR.base_unit_dec_place(parDtlR.base_unit_dec_place());
					chdIoR.base_unit_rnd_typ(parDtlR.base_unit_rnd_typ());
					
					// 在庫管理区分
					chdIoR.stk_mng_typ(parDtlR.stk_mng_typ());
				
					// 基準単位数量
					chdIoR.base_unit_qty(getBaseUnitQty(chdIoR));
				
					// 入荷数量
					Chk01_IoR oldIoR = _oldIoL.getFirst(idxKey, chdIoR.arr_schd_no());
					if (!isNull(oldIoR)) {
						chdIoR.arr_qty(oldIoR.arr_qty());
						chdIoR.old_abort_flg(oldIoR.old_abort_flg());
						chdIoR.old_sls_ret_schd_abort_flg(oldIoR.old_sls_ret_schd_abort_flg());
					}
				}
			}
		}
		
		/**
		 * 更新前の明細を取得する。
		 * @param ioL
		 * @return
		 */
		protected MCList<Chk01_DtlR> getOldDtlL(MCList<Chk01_DtlR> DtlL) {
			MCList<Chk01_DtlR> oldDtlL = MCList.create(Chk01_DtlR.class);

			MCList<MST_SLS_RET_SCHD_D_R> arrSchdDL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			arrSchdDL.addNumberColumn("arr_qty");
			MST_SLS_RET_SCHD_D_R t = MST_SLS_RET_SCHD_D_R.create("T");
			MCQueryApiBuilder arrSchdDL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_PR_R arr_pr = MST_ARR_PR_R.create("ARR_PR");
			arrSchdDL_bldr.addSelect(arr_pr.arr_qty);
			arrSchdDL_bldr.addLeftOuterJoin(arr_pr,
					bracket(t.sls_ret_schd_d_no.eq(arr_pr.sls_ret_schd_d_no)));
			dbSelectKey("MSBBL1330_MST_SLS_RET_SCHD_D_S04", arrSchdDL, arrSchdDL_bldr, DtlL);
			
			setAll(oldDtlL, arrSchdDL, createMap_Chk01_DtlR_MST_SLS_RET_SCHD_D_R());
			
			return oldDtlL;
		}
		
		/**
		 * 更新前の詳細を取得する。
		 * @param ioL
		 * @return
		 */
		protected MCList<Chk01_IoR> getOldIoL(MCList<Chk01_IoR> ioL) {
			MCList<Chk01_IoR> oldIoL = MCList.create(Chk01_IoR.class);

			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			dbSelectKey("MSBBL1330_MST_ARR_SCHD_S01", arrSchdL,
					MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")), ioL);

			setAll(oldIoL, arrSchdL, createMap_Chk01_IoR_MST_ARR_SCHD_R());
			
			return oldIoL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 明細の納品先の適用日にヘッダの登録日を設定
			ListLogicBind dlvBind = getListLogicBind(up1(), Chk01_DtlR.$dlv_cd);
			dlvBind.putBind(MAUAC_List.BpCols.$i_dt, up0().reg_dt());
			
			// 明細の負担部門の適用日にヘッダの登録日を設定
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0().reg_dt());
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 1)) {
				if (isDlvCols(column)) {
					if (row.getBoolean(Chk01_DtlR.$dlv_sundry_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		protected boolean isDlvCols(String column) {
			return isSame(column, Chk01_DtlR.$dlv_zip_cd)
				|| isSame(column, Chk01_DtlR.$dlv_addr1)
				|| isSame(column, Chk01_DtlR.$dlv_addr2)
				|| isSame(column, Chk01_DtlR.$dlv_addr3)
				|| isSame(column, Chk01_DtlR.$dlv_addr4)
				|| isSame(column, Chk01_DtlR.$dlv_tel)
				|| isSame(column, Chk01_DtlR.$dlv_fax)
				|| isSame(column, Chk01_DtlR.$dlv_cntct_dpt)
				|| isSame(column, Chk01_DtlR.$dlv_cntct_psn);
		}

		/**
		 * 	入荷予定サービス更新前チェック
		 * <p>
		 * 	<li>明細、詳細の修正はなくヘッダのみの修正で、入荷予定に影響のしない項目変更の場合<br>
		 *		入荷実績のある詳細で更新しない行の場合<br>
		 * 		サービス呼び出しなし</li>
 		 * 	<li>新規登録、上記以外のヘッダ修正の場合<br>
 		 * 		明細、詳細の追加、削除の場合<br>
 		 * 		明細、詳細の更新で入荷実績のない行の修正の場合<br>
		 * 		入荷予定サービスの更新（入荷進捗・予定）前チェックを行う(MSBEL5900.ArrSchd_Chk01)</li>
		 * 	<li>入荷実績のある詳細に対して打切ＦＬＧを変更した場合<br>
		 * 		入荷予定サービスの更新（予定・実績）前チェックを行う(MSBEL5900.ArrSchd_Chk02)</li>
		 * </p>
		 * @return
		 */
		protected void chkArrSchdSv() {
			MCList<Chk01_HdrR> notErrHdrL = getChkList(up0());
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1());
			
			if (notErrHdrL.isEmpty()) {
				return;
			}
			Chk01_HdrR notErrHdrR = notErrHdrL.get(0);
			
			// 新規行、更新行、削除行を取得
			MCList<Chk01_DtlR> chkDtlL = notErrDtlL.subList(CREATE, DELETE, MODIFY);
			MCList<Chk01_IoR> chkIoL = up2().subList(CREATE, DELETE, MODIFY);
			
			MCList<Chk01_IoR> chk01IoL = MCList.create(Chk01_IoR.class);
			MCList<Chk01_IoR> chk02IoL = MCList.create(Chk01_IoR.class);
			
			
			// 明細、詳細の修正はなくヘッダのみの修正で、入荷予定に影響のする項目は変更していないの場合
			if (chkDtlL.size() == 0 && chkIoL.size() == 0 && !isCngHdrForArrSchdSv(notErrHdrR, _oldHdrR)) {
				return;
			}
			
			// 新規登録、訂正でヘッダ修正した場合
			if (notErrHdrR.isStatusCreate() || isCngHdrForArrSchdSv(notErrHdrR, _oldHdrR)) {
				// 明細にぶら下がる詳細リストを取得
				chk01IoL.addAll(getChildIoL(up2(), notErrDtlL));
			}
			// 訂正でヘッダ修正していない場合
			else {
				// 明細の新規行、削除行、更新行（全数打切を含む）は Chk01で処理する。
				chk01IoL.addAll(getChildIoL(up2(), chkDtlL));
				
				
				// 明細の変更なし行は、詳細で判断する。
				MCList<Chk01_DtlR> nonDtlL = notErrDtlL.subList(NONE);
				for (Chk01_IoR r : getChildIoL(up2(), nonDtlL)) {
					// 新規行、削除行はCnk01で処理する。
					if (r.isStatusCreate() || r.isStatusDelete()) {
						chk01IoL.add(r);
					}
					else if (r.isStatusModify()) {
						// 入荷実績のない行の更新はChk01で処理する。
						if (r.arr_qty().isZero()) {
							chk01IoL.add(r);
						}
						// 入荷実績のある行の更新（詳細の打切ＦＬＧを変更する。残数打切）はChk02で処理する。
						else {
							chk02IoL.add(r);
						}
					}
					
					// 明細、詳細で変更のない場合は、サービスの呼び出し対象外
				
				}
			}
			
			if (!chk01IoL.isEmpty()) {
				// 入荷予定サービスの更新（入荷進捗・予定）前チェックの呼出
				callArrSchdSvChk01(chk01IoL);
				initChk01IoL(chk01IoL);
			}
			
			if (!chk02IoL.isEmpty()) {
				// 入荷予定サービス.更新（予定・実績）前チェックの呼出
				callArrSchdSvChk02(chk02IoL);
				initChk02IoL(chk02IoL);
			}
		}
		
		/**
		 * 更新前のヘッダ情報の取得
		 * 
		 * @return
		 */
		protected Chk01_HdrR getOldHdr(Chk01_HdrR hdrR) {
			Chk01_HdrR oldHdrR = Chk01_HdrR.create();

			MST_SLS_RET_SCHD_R slsRetSchdR = MST_SLS_RET_SCHD_R.create("T");
			dbSelectKey("MSBBL1330_MST_SLS_RET_SCHD_S02", slsRetSchdR,
					MCQueryApiBuilder.create(slsRetSchdR), hdrR);

			if (isNull(slsRetSchdR)) {
				return oldHdrR;
			}
			copy(oldHdrR, slsRetSchdR, createMap_Chk01_HdrR_MST_SLS_RET_SCHD_R());
			
			return oldHdrR;
		}
		
		/**
		 * 入荷予定に影響のする項目を変更したかの判定
		 * 
		 * @return
		 */
		protected boolean isCngHdrForArrSchdSv(Chk01_HdrR hdrR, Chk01_HdrR oldHdrR) {
			String[] cols = new String[] {
					Chk01_HdrR.$cst_cd, Chk01_HdrR.$sls_dpt_cd, Chk01_HdrR.$sls_usr_cd,
					Chk01_HdrR.$sls_ret_schd_dt, Chk01_HdrR.$trd_rmrks,Chk01_HdrR.$intr_rmrks, 
					Chk01_HdrR.$sync_flg
			};
			
			if (isNull(oldHdrR)) {
				return true;
			}
			
			if (isColSame(hdrR, oldHdrR, cols)) {
					return false;
			}
			return true;
		}

		/**
		 * 	入荷予定サービス.更新（入荷進捗・予定）前チェック(MSBEL5900.ArrSchd_Chk01)の呼出
		 * @param ioL
		 */
		protected void callArrSchdSvChk01(MCList<Chk01_IoR> ioL) {
			MSBEL_ArrSchdService.ArrSchd_Chk01 ope = MSBEL_ArrSchdService
					.crtArrSchd_Chk01();
			addAll(ope.up0(), ioL, createMap_ArrSchd_DtlR_Chk01_IoR(up0()));
			ope.exec();

		}

		/**
		 * 入荷予定サービス.更新（予定・実績）前チェック(MSBEL5900.ArrSchd_Upd02)の呼出
		 * @param ioL
		 */
		protected void callArrSchdSvChk02(MCList<Chk01_IoR> ioL) {
			MSBEL_ArrSchdService.ArrSchd_Chk02 ope = MSBEL_ArrSchdService
					.crtArrSchd_Chk02();
			addAll(ope.up0(), ioL, createMap_ArrSchd_DtlR_Chk01_IoR(up0()));

			// Mapperが共用なので不要項目はクリアする
			String[] clearCols = {
					ArrSchd_DtlR.$data_crud_typ, ArrSchd_DtlR.$trd_ptn_typ
			};
			ope.up0().clear(clearCols);
			ope.exec();

		}

		protected Map_ArrSchd_DtlR_Chk01_IoR<ArrSchd_DtlR, Chk01_IoR> createMap_ArrSchd_DtlR_Chk01_IoR(
				Chk01_HdrR hdr) {
			return new Map_ArrSchd_DtlR_Chk01_IoR<ArrSchd_DtlR, Chk01_IoR>(hdr);
		}

		public class Map_ArrSchd_DtlR_Chk01_IoR<D extends ArrSchd_DtlR, S extends Chk01_IoR>
				extends MCRowMapper<D, S> {

			Chk01_HdrR _hdr;

			public Map_ArrSchd_DtlR_Chk01_IoR(Chk01_HdrR hdr) {
				_hdr = hdr;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$peg_no, Chk01_IoR.$peg_no);
				addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk01_IoR.$arr_schd_no);
				addColumnPathMap(ArrSchd_DtlR.$abort_flg, Chk01_IoR.$abort_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(getDataCrudTyp(src).value());
				dest.trd_ptn_typ(_hdr.trd_ptn_typ());
				dest.arr_schd_tm(_hdr.sls_ret_schd_dt());
			}

			protected MAC_DATA_CRUD_TYP getDataCrudTyp(Chk01_IoR src) {
				if (src.isStatusCreate()) {
					return MAC_DATA_CRUD_TYP.CRT;
				}
				else if (src.isStatusDelete()) {
					return MAC_DATA_CRUD_TYP.DEL;
				}
				return MAC_DATA_CRUD_TYP.UPD;
			}
		}

		/**
		 * 	ロット（サブロット）存在チェック
		 * <p>
		 * 	MSBFL_LotService.Lot_Chk03サービスを呼び出してチェックを行う
		 * </p>
		 * @param dtlL
		 */
		protected void callLotSvChk03(MCList<MCRow> chkL, MCList<MCRow> chkIoL) {

			MSBFL_LotService.Lot_Chk03 ope1 = MSBFL_LotService.crtLot_Chk03();
			addAll(ope1.up0(), chkL, createMap_Lot_Chk03_CndR_MCRow());
			ope1.exec();
			copyErrFlg(chkL, ope1.down0());

			if (!hasErrFlgOn(ope1.down0())) {
				MSBFL_LotService.Lot_Chk03 ope2 = MSBFL_LotService.crtLot_Chk03();
				addAll(ope2.up0(), chkIoL, createMap_Lot_Chk03_CndR_MCRow());
				ope2.exec();
				copyErrFlg(chkIoL, ope2.down0());
			}
			
		}

		protected Map_Lot_Chk03_CndR_MCRow<Lot_Chk03_CndR, MCRow> createMap_Lot_Chk03_CndR_MCRow() {
			return new Map_Lot_Chk03_CndR_MCRow<Lot_Chk03_CndR, MCRow>();
		}

		public class Map_Lot_Chk03_CndR_MCRow<D extends Lot_Chk03_CndR, S extends MCRow>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$sublot_no);
			}
		}

		/**
		 * 	取引先マスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;

		/**
		 * 取引先マスタの取得
		 * @param cst_cd
		 * @return
		 */
		protected MAM_BP_R getBpCache(String cst_cd) {
			return _cacheBp.get(cst_cd);
		}

		protected void crtBpCache(MCList<Chk01_DtlR> dtlL) {
			_cacheBp = null;
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), dtlL,
					Chk01_DtlR.$dest_cd1);
		}

		/**
		 * 	物流グループＣＤ混在チェック
		 * <p>
		 * 	明細・詳細で指定した場所の物流グループＣＤがすべて同一かチェックする
		 * </p>
		 * @return
		 */
		protected MCMessageList checkLgGrpMix(MCList<Chk01_DtlR> dtlL,
				MCList<Chk01_IoR> ioL) {

			MCMessageList msgL = new MCMessageList();
			HashSet<String> lgGrpCdSet = new HashSet<String>();
			crtLocCache(dtlL);

			for (Chk01_DtlR r : dtlL.groupBy(Chk01_DtlR.$loc_cd)) {
				if (!isNull(r.loc_cd())) {
					MAM_LOC_R loc = getLocCache(r.loc_cd());
					lgGrpCdSet.add(loc.lg_grp_cd());
				}
			}

			for (Chk01_IoR r : ioL.groupBy(Chk01_IoR.$loc_cd)) {
				if (!isNull(r.loc_cd())) {
					MAM_LOC_R loc = getLocCache(r.loc_cd());
					lgGrpCdSet.add(loc.lg_grp_cd());
				}
			}

			if (lgGrpCdSet.size() > 1) {
				// MSBBL0078: 物流グループＣＤが異なる場所を混在させることはできません。\n同一の物流グループＣＤとなる場所を指定してください。
				msgL.add(new MCMessage(up0(), null, MSBBL0078));
			}

			return msgL;
		}
		
		/**
		 * 	入荷予定サービス呼出前チェック
		 * </p>
		 * @return
		 */
		protected MCMessageList checkBeforeSrv(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL,
				MCList<Chk01_IoR> ioL) {

			MCMessageList msgL = new MCMessageList();

			_oldHdrR = getOldHdr(hdr);
			
			for (Chk01_DtlR dtlR : dtlL) {
				MCList<Chk01_DtlR> parL = MCList.create(Chk01_DtlR.class);
				parL.add(dtlR);
				// 明細に紐づく詳細のリストを取得
				MCList<Chk01_IoR> childIoL = getChildIoL(ioL, parL);
				
				// 明細行で入庫数量>0 の場合、明細行の変更、詳細行に打切以外の変更、詳細行（新規、削除）、ヘッダの修正がある場合、エラー
				if (nvl(dtlR.arr_qty(), new MCNumber(0)).isPositive()) {
					if (isCngHdrForArrSchdSv(hdr, _oldHdrR) || dtlR.isStatusModify() || childIoL.subList(CREATE, DELETE).size() > 0 || isCngIo(childIoL, _oldIoL)) {
						msgL.add(new MCMessage(dtlR, null, MSBBL0186, toDispGUIIndex(dtlR)));
					}
				}
				
				// 詳細行で打切ＦＬＧが変更されている場合、その他（打切ＦＬＧ以外の修正、新規行、削除行）の修正がある場合はエラー
				if (isAbortCngIo(childIoL, _oldIoL)) {
					msgL.add(new MCMessage(dtlR, null, MSBBL0187, toDispGUIIndex(dtlR)));
				}
			}
			
			MCIndexKey idxKey = dtlL.createIndex(Chk01_DtlR.$dtl_row_id);
			for (Chk01_IoR ioR : ioL) {
				MCList<Chk01_DtlR> tmpDtlL = dtlL.subList(idxKey, ioR.dtl_row_id());
				// 詳細行で、入庫数量＝０の場合、打切ＦＬＧがオンの場合エラー
				if (nvl(ioR.arr_qty(), new MCNumber(0)).isZero() && ioR.abort_flg() && !tmpDtlL.get(0).abort_flg()) {
					msgL.add(new MCMessage(ioR, null, MSBBL0188, toDispGUIIndex(ioR)));
				}

			}
			
			return msgL;
		}
		
		/**
		 * 詳細行で打切ＦＬＧが変更されている場合、その他（打切ＦＬＧ以外の修正、新規行、削除行）の修正があるか判定
		 * @param ioL
		 * @return
		 */
		protected boolean isAbortCngIo(MCList<Chk01_IoR> ioL, MCList<Chk01_IoR> oldIoL) {
			
			MCIndexKey idxKey = oldIoL.createIndex(Chk01_IoR.$arr_schd_no);
			for (Chk01_IoR ioR : ioL) {
				Chk01_IoR oldIoR = oldIoL.getFirst(idxKey, ioR.arr_schd_no());
				
				if (isNull(oldIoR)) {
					continue;
				}
				
				if (!isSame(ioR.abort_flg(), oldIoR.abort_flg())) {
					
					if (ioL.subList(CREATE, DELETE).size() > 0 || isCngIo(ioL, oldIoL)) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			return false;
		}
		
		/**
		 * 詳細行に打切以外の変更があるか判定
		 * @param ioL
		 * @return
		 */
		protected boolean isCngIo(MCList<Chk01_IoR> ioL, MCList<Chk01_IoR> oldIoL) {
			
			String[] cols = new String[] {
					Chk01_IoR.$trd_unit_cd, Chk01_IoR.$trd_unit_qty, Chk01_IoR.$gd_cd,
					Chk01_IoR.$loc_cd, Chk01_IoR.$str_ln_cd, Chk01_IoR.$lot_no,
					Chk01_IoR.$sublot_no, Chk01_IoR.$sno1, Chk01_IoR.$sno2,
					Chk01_IoR.$sno3, Chk01_IoR.$sno4, Chk01_IoR.$arr_cnt_rmrks,
					Chk01_IoR.$intr_rmrks, Chk01_IoR.$sub_char1, Chk01_IoR.$sub_char2,
					Chk01_IoR.$sub_char3
			};
			
			
			MCIndexKey idxKey = oldIoL.createIndex(Chk01_IoR.$arr_schd_no);
			for (Chk01_IoR ioR : ioL) {
				Chk01_IoR oldIoR = oldIoL.getFirst(idxKey, ioR.arr_schd_no());
				if (!isColSame(ioR, oldIoR, cols)) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 	場所マスタキャッシュ
		 */
		FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;

		/**
		 *場所マスタの取得
		 * @param cst_cd
		 * @return
		 */
		protected MAM_LOC_R getLocCache(String loc_cd) {
			return _cacheLoc.get(loc_cd);
		}

		protected void crtLocCache(MCList<Chk01_DtlR> dtlL) {
			_cacheLoc = null;
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
					MCQueryApiBuilder.create(MAM_LOC_R.create("T")), dtlL,
					Chk01_DtlR.$loc_cd);
		}
		
		// Mapper
		protected Map_Chk01_IoR_MST_ARR_SCHD_R<Chk01_IoR,MST_ARR_SCHD_R> createMap_Chk01_IoR_MST_ARR_SCHD_R() {
			return new Map_Chk01_IoR_MST_ARR_SCHD_R<Chk01_IoR, MST_ARR_SCHD_R>();
		}

		public class Map_Chk01_IoR_MST_ARR_SCHD_R<D extends Chk01_IoR, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(Chk01_IoR.$arr_schd_no, MST_ARR_SCHD_R.$arr_schd_no);
				addColumnPathMap(Chk01_IoR.$old_abort_flg, MST_ARR_SCHD_R.$abort_flg);
				addColumnPathMap(Chk01_IoR.$old_sls_ret_schd_abort_flg, MST_ARR_SCHD_R.$sls_ret_schd_abort_flg);
				addColumnPathMap(Chk01_IoR.$trd_unit_cd, MST_ARR_SCHD_R.$trd_unit_cd);
				addColumnPathMap(Chk01_IoR.$trd_unit_qty, MST_ARR_SCHD_R.$trd_unit_qty);
				addColumnPathMap(Chk01_IoR.$gd_cd, MST_ARR_SCHD_R.$gd_cd);
				addColumnPathMap(Chk01_IoR.$loc_cd, MST_ARR_SCHD_R.$arr_loc_cd);
				addColumnPathMap(Chk01_IoR.$str_ln_cd, MST_ARR_SCHD_R.$str_ln_cd);
				addColumnPathMap(Chk01_IoR.$lot_no, MST_ARR_SCHD_R.$lot_no);
				addColumnPathMap(Chk01_IoR.$sublot_no, MST_ARR_SCHD_R.$sublot_no);
				addColumnPathMap(Chk01_IoR.$arr_qty, MST_ARR_SCHD_R.$arr_qty);
				addColumnPathMap(Chk01_IoR.$sno1, MST_ARR_SCHD_R.$sno1);
				addColumnPathMap(Chk01_IoR.$sno2, MST_ARR_SCHD_R.$sno2);
				addColumnPathMap(Chk01_IoR.$sno3, MST_ARR_SCHD_R.$sno3);
				addColumnPathMap(Chk01_IoR.$sno4, MST_ARR_SCHD_R.$sno4);
				addColumnPathMap(Chk01_IoR.$arr_cnt_rmrks, MST_ARR_SCHD_R.$arr_cnt_rmrks);
				addColumnPathMap(Chk01_IoR.$intr_rmrks, MST_ARR_SCHD_R.$intr_rmrks);
				addColumnPathMap(Chk01_IoR.$sub_char1, MST_ARR_SCHD_R.$sub_char1);
				addColumnPathMap(Chk01_IoR.$sub_char2, MST_ARR_SCHD_R.$sub_char2);
				addColumnPathMap(Chk01_IoR.$sub_char3, MST_ARR_SCHD_R.$sub_char3);

			}
		}
		
		// Mapper
		protected Map_Chk01_HdrR_MST_SLS_RET_SCHD_R<Chk01_HdrR,MST_SLS_RET_SCHD_R> createMap_Chk01_HdrR_MST_SLS_RET_SCHD_R() {
			return new Map_Chk01_HdrR_MST_SLS_RET_SCHD_R<Chk01_HdrR, MST_SLS_RET_SCHD_R>();
		}

		public class Map_Chk01_HdrR_MST_SLS_RET_SCHD_R<D extends Chk01_HdrR, S extends MST_SLS_RET_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$cst_cd, MST_SLS_RET_SCHD_R.$cst_cd);
				addColumnPathMap(Chk01_HdrR.$sls_usr_cd, MST_SLS_RET_SCHD_R.$sls_usr_cd);
				addColumnPathMap(Chk01_HdrR.$sls_dpt_cd, MST_SLS_RET_SCHD_R.$sls_dpt_cd);
				addColumnPathMap(Chk01_HdrR.$sls_ret_schd_dt, MST_SLS_RET_SCHD_R.$sls_ret_schd_dt);
				addColumnPathMap(Chk01_HdrR.$trd_rmrks, MST_SLS_RET_SCHD_R.$trd_rmrks);
				addColumnPathMap(Chk01_HdrR.$intr_rmrks, MST_SLS_RET_SCHD_R.$intr_rmrks);
				addColumnPathMap(Chk01_HdrR.$sync_flg, MST_SLS_RET_SCHD_R.$sync_flg);
			}
		}
		
		// Mapper
		protected Map_Chk01_DtlR_MST_SLS_RET_SCHD_D_R<Chk01_DtlR,MST_SLS_RET_SCHD_D_R> createMap_Chk01_DtlR_MST_SLS_RET_SCHD_D_R() {
			return new Map_Chk01_DtlR_MST_SLS_RET_SCHD_D_R<Chk01_DtlR, MST_SLS_RET_SCHD_D_R>();
		}

		public class Map_Chk01_DtlR_MST_SLS_RET_SCHD_D_R<D extends Chk01_DtlR, S extends MST_SLS_RET_SCHD_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$sls_ret_schd_d_no, MST_SLS_RET_SCHD_D_R.$sls_ret_schd_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.arr_qty(src.getNumberNE("arr_qty"));
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上返品予定情報を取消前チェックをします。<br>
	 */
	public class Chk02 extends MSBBL_SlsRetSchdReg_MC_A.Chk02 {

		MST_SLS_RET_SCHD_R _slsRetSchd;

		MCList<MST_SLS_RET_SCHD_D_R> _slsRetSchdDL;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				// 入荷予定サービス更新前チェック
				chkArrSchdSv();
			}

			
			setDown();
		}
		
		/**
		 * 	入荷予定サービス削除前チェック
		 * @return
		 */
		protected void chkArrSchdSv() {
			MCList<Chk02_HdrR> notErrHdrL = getChkList(up0());
			MCList<Chk02_IoR> notErrIoL = getChkList(up2());
			
			if (notErrHdrL.isEmpty()) {
				return;
			}
	
			MSBEL_ArrSchdService.ArrSchd_Chk01 ope = MSBEL_ArrSchdService
					.crtArrSchd_Chk01();
			
			addAll(ope.up0(), notErrIoL, createMap_ArrSchd_DtlR_Chk02_IoR());
			ope.exec();
		}
		
		/**
		 * 	明細リストが紐づく詳細リストを抽出する
		 * <p>
		 * 	srcDtlLのdtl_row_idの値が同じリストをsrcIoLから抽出します。<br>
		 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
		 * <p>
		 * @param srcIolL
		 * @param srcDtlL
		 * @return
		 */
		protected MCList<Chk02_IoR> getChildIoL(MCList<Chk02_IoR> srcIoL,
				MCList<Chk02_DtlR> srcDtlL) {

			if (srcDtlL.isEmpty() || srcIoL.isEmpty()) {
				return MCList.create(Chk02_IoR.class);
			}

			MCIndexKey idxKey = srcIoL.createIndex(Chk02_DtlR.$dtl_row_id);
			MCNumber[] keyVals = srcDtlL.getNumberNE(Chk02_IoR.$dtl_row_id).toArray(
					new MCNumber[] {});
			return srcIoL.subList(idxKey, keyVals);
		}
			
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
			down2().addAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());
			
			compHdrBase();
			return msgL;
		}
		
		/**
		 * 	ヘッダ情報の補完処理(定型チェック実施前)
		 */
		protected void compHdrBase() {
			if (!isNull(_slsRetSchd)) {
				// 更新前のインボイスＮＯを取得
				up0().iv_no(_slsRetSchd.iv_no());
			}
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			if (hasErrFlgOn(up0(), up1(), up2())) {
				return msgL;
			}
			
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> mamItmL = searchMamItm(_slsRetSchdDL);
			
			MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
			MCIndexKey slsRetSchdDIdx = _slsRetSchdDL.createIndex(Chk02_DtlR.$arr_pr_no);
			
			for (Chk02_DtlR up1R : up1()) {
				MST_SLS_RET_SCHD_D_R slsRetSchdDR = MST_SLS_RET_SCHD_D_R.create();
				slsRetSchdDR = _slsRetSchdDL.getFirst(slsRetSchdDIdx, up1R.arr_pr_no());
				
				if (isNull(mamItmL.getFirst(mamItmIdx, slsRetSchdDR.itm_cd(), slsRetSchdDR.itm_sub1(), slsRetSchdDR.itm_sub2(), slsRetSchdDR.itm_sub3()))) {
					String itmInfo = toDispItm(slsRetSchdDR.itm_cd(), slsRetSchdDR.itm_sub1(), slsRetSchdDR.itm_sub2(), slsRetSchdDR.itm_sub3());
					msgL.add(new MCMessage(up1R, null, MAUAL0189, itmInfo, toDispGUIIndex(up1R)));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// DAC更新権限チェック
			msgL.addAll(checkWritableDptCdDac(_slsRetSchd, MST_SLS_RET_SCHD_R.$sls_dpt_cd));

			// 打切存在チェック
			msgL.addAll(chkAbortExists());
			
			// 有効明細行数チェック
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(checkAtLeastOneIo(up1(), up2()));

			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			_slsRetSchd = MST_SLS_RET_SCHD_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBBL1330_MST_SLS_RET_SCHD_S03", _slsRetSchd,
					MCQueryApiBuilder.create(_slsRetSchd), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$upd_cntr, _slsRetSchd));

			// 一応明細の排他ロック獲得(更新カウンタチェックはしない)
			_slsRetSchdDL = MCList.create(MST_SLS_RET_SCHD_D_R.class);
			MST_SLS_RET_SCHD_D_R slsRetSchdDL_t = MST_SLS_RET_SCHD_D_R.create("T");
			MCQueryApiBuilder slsRetSchdDL_bldr = MCQueryApiBuilder.create(slsRetSchdDL_t);

			slsRetSchdDL_bldr.setWhere(slsRetSchdDL_t.sls_ret_schd_no.eq(bind("sls_ret_schd_no")), up0());
			dbSelectForUpdate("MSBBL1330_MST_SLS_RET_SCHD_D_S05", _slsRetSchdDL, slsRetSchdDL_bldr);

			if (!msgL.isEmpty()) {
				return msgL;
			}
			
			MCIndexKey slsRetSchdIdx = _slsRetSchdDL.createIndex(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_d_no);
			_slsRetSchdDL.addStringColumn(MST_ARR_PR_R.$arr_pr_no);
			
			// 入荷進捗の更新カウンタチェック
			for (Chk02_DtlR dtlR : up1()) {
				if (!isNull(dtlR.arr_pr_no())) {
					MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("T");
					dbSelectKeyForUpdateNoWait("MSBBL1330_MST_ARR_PR_S03", arrPrR,
							MCQueryApiBuilder.create(arrPrR), dtlR);
					msgL.addAll(checkUpdCntrNE(dtlR, Chk02_DtlR.$arr_pr_upd_cntr, arrPrR));
					MST_SLS_RET_SCHD_D_R slsRetSchdDR = _slsRetSchdDL.getFirst(slsRetSchdIdx, arrPrR.sls_ret_schd_d_no());
					slsRetSchdDR.setString(MST_ARR_PR_R.$arr_pr_no, arrPrR.arr_pr_no());
				}
			}

			return msgL;
		}
		
		/**
		 * 詳細0件チェックのユーティリティメソッド
		 * <p>明細に紐づく詳細行が1件以上存在すること</p>
		 * @param dtlL
		 * @param ioL
		 * @return
		 */
		protected MCMessageList checkAtLeastOneIo(MCList<Chk02_DtlR> dtlL,
				MCList<Chk02_IoR> ioL) {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey idxkey = ioL.createIndex(Chk02_IoR.$dtl_row_id);
			for (Chk02_DtlR parDtl : dtlL) {
				MCList<Chk02_IoR> chdIoL = ioL.subList(idxkey,
						parDtl.toArray(Chk02_DtlR.$dtl_row_id));
				if (chdIoL.isEmpty()) {
					msgL.add(new mcframe.commonCore.notice.MCMessage(parDtl, null,
							MAUDL0012, toDispGUIIndex(parDtl)));
				}
			}
			return msgL;
		}

		/**
		 * 	打切存在チェック
		 * <p>
		 * 	打切ＦＬＧがオンの明細、あるいは打切ＦＬＧ、売上返品打切ＦＬＧがオンの詳細が一行でも存在している場合はエラーとする
		 * </p>
		 * @return
		 */
		protected MCMessageList chkAbortExists() {

			MCMessageList msgL = new MCMessageList();

			// 打切ＦＬＧがオンの明細をチェック
			MST_SLS_RET_SCHD_D_R chkR = _slsRetSchdDL.getFirst(
					MST_SLS_RET_SCHD_D_R.$abort_flg, true);

			if (!isNull(chkR)) {
				// MSBBL0070:打切となった明細・詳細がある場合、取消することはできません。\n打切を解除した後に取消を行ってください。
				msgL.add(new MCMessage(up0(), null, MSBBL0070));
			}
			else {
				// 打切ＦＬＧ、または売上返品打切ＦＬＧがオンの詳細（入荷予定）をチェック
				MCList<Srch01_IoR> chkL = MCList.create(Srch01_IoR.class);
				executeQuery(chkL, MSBBL1330_ARR_SCHD_S01(), up0());
				for (Srch01_IoR r : chkL) {
					if (r.abort_flg() || r.sls_ret_schd_abort_flg()) {
						// MSBBL0070:打切となった明細・詳細がある場合、取消することはできません。\n打切を解除した後に取消を行ってください。
						msgL.add(new MCMessage(up0(), null, MSBBL0070));
						break;
					}
				}
			}
			return msgL;
		}
		
		
		protected Map_ArrSchd_DtlR_Chk02_IoR<ArrSchd_DtlR,Chk02_IoR> createMap_ArrSchd_DtlR_Chk02_IoR() {
			return new Map_ArrSchd_DtlR_Chk02_IoR<ArrSchd_DtlR, Chk02_IoR>();
		}
		public class Map_ArrSchd_DtlR_Chk02_IoR<D extends ArrSchd_DtlR, S extends Chk02_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.arr_schd_no(src.arr_schd_no());
				dest.peg_no(src.peg_no());
			}
		}
	}
	
	/**
	 * 取引通貨金額、基準通貨金額、納税通貨金額を設定する。
	 * @param hdr 受注ヘッダ
	 * @param dtlL 受注明細
	 */
	protected void setCurUpriAmt(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL) {
		
		for (Srch01_DtlR dtlR : dtlL) {
			// 基準通貨に換算
			dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), hdr.xrate(),
					hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_dscnt_amt(convToBaseCur(dtlR.trd_cur_dscnt_amt(), hdr.xrate(),
					hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			
			// 納税通貨に換算
			if (!isNull(hdr.ptax_cur_cd())) {
				dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), hdr.ptax_xrate(),
						hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_dscnt_amt(convToBaseCur(dtlR.trd_cur_dscnt_amt(), hdr.ptax_xrate(),
						hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}

		hdr.trd_cur_amt(dtlL.sum(Srch01_DtlR.$trd_cur_amt));
		hdr.trd_cur_inc_tax_amt(dtlL.sum(Srch01_DtlR.$trd_cur_inc_tax_amt));
	}
	
	/**
	 * 粗利率に関連する項目を設定する。
	 * @param hdr 受注ヘッダ
	 * @param dtlL 受注明細
	 */
	protected void calcProfRate(Srch01_HdrR hdr, MCList<Srch01_DtlR> dtlL) {
		
		MCNumber trdCurAmt = null;
		MCNumber ttlAmt = null;
		MCNumber ttlAmtNoCost = null;
		MCNumber baseCurTtlAmt = null;
		MCNumber costAmt = null;
		MCNumber trdCurIncTaxAmt = null;
		
		for (Srch01_DtlR dtlR : dtlL) {
			
			if (isNull(dtlR.trd_cur_amt())) {
				continue;
			}
			
			if (dtlR.dscnt_itm_flg()) {
				
				trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_amt());
				trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_inc_tax_amt());
			}
			else {
				
				trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
				trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).add(dtlR.trd_cur_inc_tax_amt());
				if (!isNull(dtlR.cost_upri())) {
					
					ttlAmt = nvl(ttlAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
					baseCurTtlAmt = nvl(baseCurTtlAmt, MCNumber.ZERO).add(dtlR.base_cur_amt());
					costAmt = nvl(costAmt, MCNumber.ZERO).add(dtlR.cost_amt());
				}
			}
			
			dtlR.prof_rate(MSUCL_SlsUtil.getProfRate(dtlR.base_cur_amt(), dtlR.cost_amt()));
		}
		
		if (!isNull(trdCurAmt)) {
			ttlAmtNoCost = trdCurAmt.subtract(nvl(ttlAmt, MCNumber.ZERO));
		}
		
		hdr.trd_cur_amt(trdCurAmt);
		hdr.trd_cur_inc_tax_amt(trdCurIncTaxAmt);
		hdr.ttl_amt(ttlAmt);
		hdr.ttl_amt_no_cost(ttlAmtNoCost);
		hdr.prof_rate(MSUCL_SlsUtil.getProfRate(baseCurTtlAmt, costAmt));
	}

	protected MCNumber getBaseUnitQty(Chk01_DtlR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	protected MCNumber getBaseUnitQty(Chk01_IoR r) {

		return convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(),
				r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ());
	}

	protected void calcAmt(Chk01_HdrR hdr, Chk01_DtlR dtl) {
		
		MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
				dtl.trd_cur_upri(), 
				dtl.trd_unit_qty(),
				dtl.tax_rate(), 
				dtl.inc_tax_flg(), 
				hdr.trd_cur_amt_dec_place(),
				hdr.sls_amt_rnd_typ(), 
				hdr.sls_tax_rnd_typ(),
				dtl.trd_cur_dscnt_amt());

		dtl.trd_cur_amt(amtR.getNumber("amt"));
		dtl.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
		
		// 源泉税額の算出
		dtl.wtax_amt(getTaxAmt(dtl.trd_cur_amt(), dtl.wtax_rate(), hdr.trd_cur_amt_dec_place(), getCo().wtax_rnd_typ()));
	}


	/**
	 * インボイスＮＯ設定
	 * 
	 * @param hdrR
	 */
	protected void setUpIvNo(Chk01_HdrR hdrR) {
		if (!hdrR.cst_iv_flg()) {
			return;
		}
		if (!MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
			return;
		}
		
		String iv_no = hdrR.iv_no();
		String old_iv_no = hdrR.old_iv_no();
		boolean delIvFlg = false;
		
		// 新規登録時
		if (hdrR.isStatusCreate()) {
			if (hdrR.num_flg()) {
				ElmArgsR elm = ElmArgsR.create();
				elm.co_cd(getCo().co_cd());
				elm.dt(getToday());
				
				iv_no = getNumIv(elm, null);
			}
			else {
				if (isNullOrNullVal(hdrR.iv_no())) {
					iv_no = MAC_STR.NULL_VAL.value();
				}
				MST_IV_NO_R tmpIvR = MST_IV_NO_R.create("T");
				MCQueryApiBuilder tmpIvR_bldr = MCQueryApiBuilder.create(tmpIvR);
				tmpIvR_bldr.setSelect(tmpIvR.iv_no);
				tmpIvR_bldr.setWhere(tmpIvR.iv_no.eq(bind("1")), hdrR.iv_no());
				int rsltCnt = dbSelect("MSBBL1330_MST_IV_NO_S02", tmpIvR, tmpIvR_bldr);
				if (rsltCnt == 0) {
					getNumIv(null, hdrR.iv_no());
				}
			}
		}
		
		// 更新時
		else {
			if (hdrR.num_flg()) {
				ElmArgsR elm = ElmArgsR.create();
				elm.co_cd(getCo().co_cd());
				elm.dt(getToday());
				
				iv_no = getNumIv(elm, null);
			}
			if (!isNullOrNullVal(iv_no)) {
				if (!isSame(old_iv_no, iv_no)) {
					if (!hdrR.num_flg()) {
						if (!isNullOrNullVal(hdrR.iv_no())) {
							getNumIv(null, iv_no);
						}
					}
					delIvFlg = true;
				}
			}
			
			// 更新時、不要になったインボイスＮＯを削除する
			if (delIvFlg) {
				if (!isNullOrNullVal(old_iv_no)) {
					MST_IV_NO_R ivR = MST_IV_NO_R.create("T");
					ivR.iv_no(old_iv_no);
					dbDeleteKey("MSBBL1330_MST_IV_NO_D02", ivR, MCQueryApiBuilder.create(ivR));
				}
			}
		}
		hdrR.iv_no(iv_no);
	}

	protected Map_MST_SLS_RET_SCHD_R_Chk01_HdrR<MST_SLS_RET_SCHD_R, Chk01_HdrR> createMap_MST_SLS_RET_SCHD_R_Chk01_HdrR() {
		return new Map_MST_SLS_RET_SCHD_R_Chk01_HdrR<MST_SLS_RET_SCHD_R, Chk01_HdrR>();
	}

	public class Map_MST_SLS_RET_SCHD_R_Chk01_HdrR<D extends MST_SLS_RET_SCHD_R, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sls_ret_schd_no,
					Chk01_HdrR.$sls_ret_schd_no);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$cst_cd, Chk01_HdrR.$cst_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sls_dpt_cd, Chk01_HdrR.$sls_dpt_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sls_usr_cd, Chk01_HdrR.$sls_usr_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$reg_dt, Chk01_HdrR.$reg_dt);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sls_ret_schd_dt,
					Chk01_HdrR.$sls_ret_schd_dt);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$cst_po_no, Chk01_HdrR.$cst_po_no);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$xrate_inpt_flg,
					Chk01_HdrR.$xrate_inpt_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$ptax_xrate_inpt_flg,
					Chk01_HdrR.$ptax_xrate_inpt_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$ar_dpt_cd, Chk01_HdrR.$ar_dpt_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$iv_no, Chk01_HdrR.$iv_no);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$ref_iv_no, Chk01_HdrR.$ref_iv_no);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$rcv_schd_dt, Chk01_HdrR.$rcv_schd_dt);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sync_flg, Chk01_HdrR.$sync_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_SLS_RET_SCHD_R.$sub_char3, Chk01_HdrR.$sub_char3);
		}
	}

	protected Map_MST_SLS_RET_SCHD_D_R_Chk01_DtlR<MST_SLS_RET_SCHD_D_R, Chk01_DtlR> createMap_MST_SLS_RET_SCHD_D_R_Chk01_DtlR() {
		return new Map_MST_SLS_RET_SCHD_D_R_Chk01_DtlR<MST_SLS_RET_SCHD_D_R, Chk01_DtlR>();
	}

	public class Map_MST_SLS_RET_SCHD_D_R_Chk01_DtlR<D extends MST_SLS_RET_SCHD_D_R, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_d_no,
					Chk01_DtlR.$sls_ret_schd_d_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sls_ret_schd_no,
					Chk01_DtlR.$sls_ret_schd_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_sundry_flg,
					Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_cntct_dpt,
					Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_cntct_psn,
					Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sret_fr_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$dest_cd1, Chk01_DtlR.$dest_cd1);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$dest_cd2, Chk01_DtlR.$dest_cd2);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$dest_cd3, Chk01_DtlR.$dest_cd3);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sundry_itm_flg,
					Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cnsgn_gd_cd, Chk01_DtlR.$cnsgn_gd_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$base_unit_qty,
					Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$upri_not_tgt_flg,
					Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_cur_dscnt_amt,
					Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cnsgn_loc_cd, Chk01_DtlR.$cnsgn_loc_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cnsgn_str_ln_cd, Chk01_DtlR.$cnsgn_str_ln_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$vmi_flg, Chk01_DtlR.$vmi_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$tax_fix_flg, Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_cur_tax_amt,
					Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cost_upri, Chk01_DtlR.$cost_upri);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$arr_cnt_rmrks,
					Chk01_DtlR.$arr_cnt_rmrks);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$bill_crryovr_times,
					Chk01_DtlR.$bill_crryovr_times);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ret_rsn_cd, Chk01_DtlR.$ret_rsn_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$wtax_amt, Chk01_DtlR.$wtax_amt);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cntry_org_cd, Chk01_DtlR.$cntry_org_cd);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ref_dlv_slip_no,
					Chk01_DtlR.$ref_dlv_slip_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ref_dlv_slip_d_no,
					Chk01_DtlR.$ref_dlv_slip_d_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ref_sls_act_no,
					Chk01_DtlR.$ref_sls_act_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ref_sls_act_seq,
					Chk01_DtlR.$ref_sls_act_seq);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ref_sls_act_d_no,
					Chk01_DtlR.$ref_sls_act_d_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$ref_sls_act_d_seq,
					Chk01_DtlR.$ref_sls_act_d_seq);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$base_sls_ac_dt,
					Chk01_DtlR.$base_sls_ac_dt);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$io_schd_pr_no,
					Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(MST_SLS_RET_SCHD_D_R.$cmpl_flg, Chk01_DtlR.$cmpl_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.cmpl_flg(false);
			dest.base_unit_abort_qty(MCNumber.ZERO);
			dest.cost_amt(MSUCL_SlsUtil.getCostAmt(src.cost_upri(), src.base_unit_qty(), getBaseCur().amt_dec_place())); //原価金額
			
			if (src.dlv_sundry_flg()) {
				dest.sret_fr_nm(src.dlv_nm());
			}
			if (src.sundry_itm_flg()) {
				dest.itm_nm(src.itm_nm());
				dest.iv_itm_nm(src.iv_itm_nm());
			}
		}
	}

	protected Map_ArrPr_DtlR_Chk01_DtlR<ArrPr_DtlR, Chk01_DtlR> createMap_ArrPr_DtlR_Chk01_DtlR(
			Chk01_HdrR hdr) {
		return new Map_ArrPr_DtlR_Chk01_DtlR<ArrPr_DtlR, Chk01_DtlR>(hdr);
	}

	public class Map_ArrPr_DtlR_Chk01_DtlR<D extends ArrPr_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {

		Chk01_HdrR _hdr;

		public Map_ArrPr_DtlR_Chk01_DtlR(Chk01_HdrR hdr) {
			_hdr = hdr;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrPr_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(ArrPr_DtlR.$arr_pr_no, Chk01_DtlR.$arr_pr_no);
			addColumnPathMap(ArrPr_DtlR.$sls_ret_schd_d_no, Chk01_DtlR.$sls_ret_schd_d_no);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(ArrPr_DtlR.$rsn_cd, Chk01_DtlR.$ret_rsn_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(ArrPr_DtlR.$arr_cnt_rmrks, Chk01_DtlR.$arr_cnt_rmrks);
			addColumnPathMap(ArrPr_DtlR.$sret_fr_cd, Chk01_DtlR.$dlv_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(getDataCrudTyp(src).value());
			dest.trd_cd(_hdr.trd_cd());
			dest.trd_ptn_typ(_hdr.trd_ptn_typ());
			dest.rqst_dpt_cd(_hdr.sls_dpt_cd());
			dest.rqst_wg_cd(_hdr.wg_cd());
			dest.rqst_usr_cd(_hdr.sls_usr_cd());
			dest.cst_cd(_hdr.cst_cd());
			if (!isNull(src.bd_dpt_cd())) {
				dest.bd_wg_cd(getBdWgCd(src.bd_dpt_cd()));
			}

			// 出荷返品時の設定項目
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(_hdr.trd_ptn_typ())) {
				if (!src.vmi_flg()) {
					dest.ret_dlv_slip_d_no(src.ref_dlv_slip_d_no());
				}
				if (isNull(src.tdlv_cd()) || (_hdr.cst_iv_flg() && src.vmi_flg())) {
					dest.ret_stk_arrv_bp_cd(src.dlv_cd());
				}
				else {
					dest.ret_stk_arrv_bp_cd(src.tdlv_cd());
				}
			}

			dest.abort_flg(false);
			dest.purc_ddlv_flg(false);
			dest.arr_schd_refl_flg(false);
		}
		
		protected String getBdWgCd(String bd_dpt_cd) {
			MAM_DPT_R dptR = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(dptR);
			dptR_bldr.setSelect(dptR.wg_cd);
			dptR_bldr.setWhere(dptR.dpt_cd.eq(bind("1")), bd_dpt_cd);
			dptR_bldr.addWhereWithAnd(dptR.bd_dpt_flg.eq(value(true)));
			dptR_bldr.addWhereWithAnd(bind("1").between(dptR.st_dt, dptR.end_dt), getToday());
			dbSelect("MSBBL1330_MAM_DPT_S01", dptR, dptR_bldr);
			if (isNull(dptR)) {
				return null;
			}
			return dptR.wg_cd();
		}

		protected MAC_DATA_CRUD_TYP getDataCrudTyp(Chk01_DtlR src) {
			if (src.isStatusCreate()) {
				return MAC_DATA_CRUD_TYP.CRT;
			}
			else if (src.isStatusDelete()) {
				return MAC_DATA_CRUD_TYP.DEL;
			}
			return MAC_DATA_CRUD_TYP.UPD;
		}

	}

	protected Map_ArrSchd_DtlR_Chk01_IoR<ArrSchd_DtlR, Chk01_IoR> createMap_ArrSchd_DtlR_Chk01_IoR(
			Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL) {
		return new Map_ArrSchd_DtlR_Chk01_IoR<ArrSchd_DtlR, Chk01_IoR>(hdr, dtlL);
	}

	public class Map_ArrSchd_DtlR_Chk01_IoR<D extends ArrSchd_DtlR, S extends Chk01_IoR>
			extends MCRowMapper<D, S> {

		Chk01_HdrR _hdr;

		MCList<Chk01_DtlR> _dtlL;

		MCIndexKey _idxKey;

		public Map_ArrSchd_DtlR_Chk01_IoR(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL) {
			_hdr = hdr;
			_dtlL = dtlL;
			_idxKey = _dtlL.createIndex(Chk01_DtlR.$dtl_row_id);
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Chk01_IoR.$arr_schd_no);
			addColumnPathMap(ArrSchd_DtlR.$wg_cd, Chk01_IoR.$wg_cd);
			addColumnPathMap(ArrSchd_DtlR.$sno1, Chk01_IoR.$sno1);
			addColumnPathMap(ArrSchd_DtlR.$sno2, Chk01_IoR.$sno2);
			addColumnPathMap(ArrSchd_DtlR.$sno3, Chk01_IoR.$sno3);
			addColumnPathMap(ArrSchd_DtlR.$sno4, Chk01_IoR.$sno4);
			addColumnPathMap(ArrSchd_DtlR.$lot_no, Chk01_IoR.$lot_no);
			addColumnPathMap(ArrSchd_DtlR.$sublot_no, Chk01_IoR.$sublot_no);
			addColumnPathMap(ArrSchd_DtlR.$gd_cd, Chk01_IoR.$gd_cd);
			addColumnPathMap(ArrSchd_DtlR.$arr_loc_cd, Chk01_IoR.$loc_cd);
			addColumnPathMap(ArrSchd_DtlR.$str_ln_cd, Chk01_IoR.$str_ln_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_qty, Chk01_IoR.$trd_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_cd, Chk01_IoR.$trd_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, Chk01_IoR.$base_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_cd, Chk01_IoR.$base_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$arr_cnt_rmrks, Chk01_IoR.$arr_cnt_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$sub_char1, Chk01_IoR.$sub_char1);
			addColumnPathMap(ArrSchd_DtlR.$sub_char2, Chk01_IoR.$sub_char2);
			addColumnPathMap(ArrSchd_DtlR.$sub_char3, Chk01_IoR.$sub_char3);
			addColumnPathMap(ArrSchd_DtlR.$ret_gd_cd, Chk01_IoR.$cnsgn_gd_cd);
			addColumnPathMap(ArrSchd_DtlR.$ret_loc_cd, Chk01_IoR.$cnsgn_loc_cd);
			addColumnPathMap(ArrSchd_DtlR.$ret_str_ln_cd, Chk01_IoR.$cnsgn_str_ln_cd);
			addColumnPathMap(ArrSchd_DtlR.$intr_rmrks, Chk01_IoR.$intr_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$peg_d_no, Chk01_IoR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			Chk01_DtlR dtl = _dtlL.getFirst(_idxKey, src.dtl_row_id());
			dest.peg_no(dtl.peg_no());
			dest.data_crud_typ(getDataCrudTyp(src).value());
			dest.arr_pr_no(dtl.arr_pr_no());
			if (!dtl.vmi_flg()) {
				dest.dlv_slip_no(dtl.ref_dlv_slip_no());
			}
			dest.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
			dest.arr_schd_tm(_hdr.sls_ret_schd_dt());
			dest.itm_cd(dtl.itm_cd());
			dest.itm_sub1(dtl.itm_sub1());
			dest.itm_sub2(dtl.itm_sub2());
			dest.itm_sub3(dtl.itm_sub3());
			dest.itm_nm(dtl.sundry_itm_flg() ? dtl.itm_nm() : null);
			dest.sundry_itm_flg(dtl.sundry_itm_flg());
			dest.ver_no(dtl.ver_no());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			dest.abort_flg(MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ()) ? false : src
					.abort_flg());
			dest.sls_ret_schd_abort_flg(MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ()) ? false
					: src.sls_ret_schd_abort_flg());
			dest.sync_flg(_hdr.sync_flg());
			dest.io_schd_pr_no(dtl.io_schd_pr_no());
			dest.accpt_schd_dt(_hdr.sls_ret_schd_dt());
			
			if (dtl.vmi_flg()) {
				dest.ret_loc_cd(src.cnsgn_loc_cd());
				dest.ret_str_ln_cd(src.cnsgn_str_ln_cd());
			}
		}

		protected MAC_DATA_CRUD_TYP getDataCrudTyp(Chk01_IoR src) {
			if (src.isStatusCreate()) {
				return MAC_DATA_CRUD_TYP.CRT;
			}
			else if (src.isStatusDelete()) {
				return MAC_DATA_CRUD_TYP.DEL;
			}
			return MAC_DATA_CRUD_TYP.UPD;
		}

	}
			
	/**
	 * 	詳細に紐づく明細を抽出する
	 * <p>
	 * 	dtl_row_idの値が同じ明細を抽出します。<br>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param srcDtlL
	 * @param srcIoL
	 * @return
	 */
	protected Chk01_DtlR getParDtlR(MCList<Chk01_DtlR> srcDtlL, Chk01_IoR srcIoR) {
		if (srcDtlL.isEmpty() || isNull(srcIoR)) {
			return Chk01_DtlR.create();
		}
		
		Chk01_DtlR dtlR = Chk01_DtlR.create();
		MCIndexKey idxKey = srcDtlL.createIndex(Chk01_DtlR.$dtl_row_id);
		
		dtlR = srcDtlL.getFirst(idxKey, srcIoR.dtl_row_id());
	
		return dtlR;
	}

	/**
	 * 	詳細リストが紐づく明細リストを抽出する
	 * <p>
	 * 	srcIoLのdtl_row_idの値が同じリストをsrcDtlLから抽出します。<br>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param srcDtlL
	 * @param srcIoL
	 * @return
	 */
	protected MCList<Chk01_DtlR> getParDtlL(MCList<Chk01_DtlR> srcDtlL,
			MCList<Chk01_IoR> srcIoL) {

		if (srcDtlL.isEmpty() || srcIoL.isEmpty()) {
			return MCList.create(Chk01_DtlR.class);
		}
		
		MCList<Chk01_IoR> grL = srcIoL.groupBy(Chk01_IoR.$dtl_row_id);
		MCList<Chk01_DtlR> dtlL = MCList.create(Chk01_DtlR.class);

		MCIndexKey idxKey = srcDtlL.createIndex(Chk01_DtlR.$dtl_row_id);
		MCNumber[] keyVals = grL.getNumberNE(Chk01_IoR.$dtl_row_id).toArray(
				new MCNumber[] {});
		
		for (MCNumber keyVal : keyVals) {
			dtlL.addAll(srcDtlL.subList(idxKey, keyVal));
		}
		
		return dtlL;
	}

	/**
	 * 	明細リストが紐づく詳細リストを抽出する
	 * <p>
	 * 	srcDtlLのdtl_row_idの値が同じリストをsrcIoLから抽出します。<br>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param srcIolL
	 * @param srcDtlL
	 * @return
	 */
	protected MCList<Chk01_IoR> getChildIoL(MCList<Chk01_IoR> srcIoL,
			MCList<Chk01_DtlR> srcDtlL) {

		if (srcDtlL.isEmpty() || srcIoL.isEmpty()) {
			return MCList.create(Chk01_IoR.class);
		}

		MCIndexKey idxKey = srcIoL.createIndex(Chk01_DtlR.$dtl_row_id);
		
		MCList<Chk01_IoR> tmp = MCList.create(Chk01_IoR.class);
		for (Chk01_DtlR srcDtlR : srcDtlL) {
			tmp.addAll(srcIoL.subList(idxKey, srcDtlR.dtl_row_id()));
		}
		
		return tmp;
	}

	/**
	 * 自動発番対象の場合インボイスＮＯを発番して設定する
	 * @param hdr
	 */
	protected void setIvNo(Chk01_HdrR hdr) {
		if (hdr.num_flg()) {
			ElmArgsR elm = ElmArgsR.create();
			elm.co_cd(getCo().co_cd());
			elm.dt(getToday());
			hdr.iv_no(getNumIv(elm, null));
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を再取得します。<br>
	 */
	public class Sprt01 extends MSBBL_SlsRetSchdReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callSlsUpriSvSprt01();
			setDown();
		}

		/**
		 * 	単価再取得サービスの呼出
		 */
		protected void callSlsUpriSvSprt01() {

			mapUpContainers(CALL_OPE);

			sprt01.exec();

			// mapDownContaiersを呼ぶと属性(呼出元のGUIIndex)が上書きされるため呼ばない
			String[] destCols = new String[] {
				Sprt01_DtlR.$sls_upri, Sprt01_DtlR.$interim_flg
			};
			String[] srcCols = new String[] {
				SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg
			};
			copyByPegNo(up0(), destCols, sprt01.down0(), srcCols);
		}

		@Override
		protected void up_CALL_OPE(MCList<SlsUpri_Sprt01_DtlR> dest0_0,
				MCList<Sprt01_DtlR> src_Sprt01_Dtl) {

			setPegNo(up0());
			super.up_CALL_OPE(dest0_0, src_Sprt01_Dtl);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$sls_upri_flg, true);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}
	
	protected Map_MAM_SUNDRY_ITM_R_Chk01_DtlR<MAM_SUNDRY_ITM_R,Chk01_DtlR> createMap_MAM_SUNDRY_ITM_R_Chk01_DtlR() {
		return new Map_MAM_SUNDRY_ITM_R_Chk01_DtlR<MAM_SUNDRY_ITM_R, Chk01_DtlR>();
	}

	public class Map_MAM_SUNDRY_ITM_R_Chk01_DtlR<D extends MAM_SUNDRY_ITM_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno4, Chk01_DtlR.$sno4);
		}
	}

	/**
	 * 品目マスタ取得
	 * @param bindL 取得対象の品目情報を持ったリスト
	 * @return mamItmL 品目マスタの取得結果リスト
	 */
	protected MCList<MAM_ITM_R> searchMamItm(MCList<MST_SLS_RET_SCHD_D_R> bindL) {
		MAM_ITM_R mamItmL_t = MAM_ITM_R.create("T");
		MCQueryApiBuilder mamItmL_bldr = MCQueryApiBuilder.create(mamItmL_t);
		MCList<MAM_ITM_R> mamItmL = MCList.create(MAM_ITM_R.class);
		
		mamItmL_bldr.setSelect(mamItmL_bldr.getBaseDbc().getKeyColumn$());
		mamItmL_bldr.setWhere(mamItmL_t.itm_cd.eq(bind("itm_cd")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub1.eq(bind("itm_sub1")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub2.eq(bind("itm_sub2")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBBL1330_MAM_ITM_S01", mamItmL, mamItmL_bldr, bindL);
		return mamItmL;
	}

	/**
	 * 納品書明細を元に出荷予定を特定し、その出荷予定に対する出荷実績明細を取得する
	 * 
	 * @param lst	「ref_dlv_slip_d_no」を項目に持つリストを指定する
	 * @return 項目「retQty」に、出荷実績明細の数量のうち「返品できる数量」が設定されたリスト
	 */
	protected MCList<MST_SHIP_ACT_D_R> getShipRetLForIV(MCList<? extends MCRow> lst) {
		
		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MST_IV_SHIP_ACT_D_R S1W = MST_IV_SHIP_ACT_D_R.create("W");
		MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
		MST_SHIP_ALLOC_STS_R t4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MST_SHIP_ACT_D_R t5 = MST_SHIP_ACT_D_R.create("T5");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn(MST_SHIP_SCHD_R.$ship_schd_no);
		dbc.addStringColumn(MST_IV_SHIP_ACT_D_R.$iv_ship_act_d_no);
		dbc.addNumberColumn(MST_SHIP_SCHD_R.$iv_schd_qty);
		dbc_bldr.setDistinct();	// 出荷予定：出荷引当状況＝１：Ｎ、もしくは出荷引当状況：出荷実績明細＝１：Ｎの時、出荷予定が重複する
		dbc_bldr.setSelect(t.ship_act_d_no, t.dlv_slip_d_no, t.base_unit_qty,
				t.ship_ret_qty, t3.ship_schd_no, t3.iv_schd_qty,
				bracket(subQuery()
						.select(min(S1W.iv_ship_act_d_no))
						.from(S1W)
						.where(S1W.ship_act_d_no.eq(t.ship_act_d_no)))
						.as("iv_ship_act_d_no"));
		dbc_bldr.addInnerJoin(t2, bracket(t2.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		dbc_bldr.addInnerJoin(t3, bracket(t3.ship_schd_no.eq(t2.ship_schd_no)));
		dbc_bldr.addInnerJoin(t4, bracket(t4.ship_schd_no.eq(t3.ship_schd_no)));
		dbc_bldr.addInnerJoin(t5, bracket(t5.ship_alloc_sts_no.eq(t4.ship_alloc_sts_no)
				.and(t5.can_flg.eq(value(false)))));
		dbc_bldr.setWhere(t5.dlv_slip_d_no.eq(bind("ref_dlv_slip_d_no")));
		dbc_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBBL1330_MST_SHIP_ACT_D_S02", dbc, dbc_bldr, lst.groupBy("ref_dlv_slip_d_no"), null);
		
		dbc.addNumberColumn("retQty");
		dbc.forEach(r -> r.setNumber("retQty", r.base_unit_qty().subtract(r.ship_ret_qty())));
		
		for (MCList<MST_SHIP_ACT_D_R> grp : dbc.groupList(MST_SHIP_SCHD_R.$ship_schd_no)) {
			MCNumber ivQty = grp.get(0).getNumber(MST_SHIP_SCHD_R.$iv_schd_qty);
			if (!ivQty.isPositive()) {
				continue;
			}
			
			// インボイス数を出荷実績明細の数量で消し込む
			// 消し込みできない分が「返品できる数量（retQty）」
			grp.sort(MST_IV_SHIP_ACT_D_R.$iv_ship_act_d_no, MST_SHIP_ACT_D_R.$ship_act_d_no);
			for (MST_SHIP_ACT_D_R r : grp) {
				MCNumber qty = r.base_unit_qty().subtract(r.ship_ret_qty());
				if (ivQty.gte(qty)) {
					r.setNumber("retQty", MCNumber.ZERO);
				}
				else {
					r.setNumber("retQty", qty.subtract(ivQty));
				}
				ivQty = ivQty.subtract(qty);
				if (!ivQty.isPositive()) {
					break;
				}
			}
		}
		if (dbc.isEmpty()) {
			dbc.setAll(getShipRetLForUplndIV(lst));
		}
		return dbc;
	}
	/**
	 * 返品元納品書明細を元に出荷実績明細の返品できる数量を取得する（インボイス取引対象計画外出荷）。
	 * @param lst	「ret_dlv_slip_d_no」を項目に持つリストを指定する
	 * @return 項目「retQty」に、出荷実績明細の数量のうち「返品できる数量」が設定されたリスト
	 */
	protected MCList<MST_SHIP_ACT_D_R> getShipRetLForUplndIV(MCList<? extends MCRow> lst) {
		
		MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MCTempView wIvShipActMap = createTempView("WIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		
		MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActD);
		
		shipActDL_bldr.setSelect( shipActD.ship_act_d_no, shipActD.dlv_slip_d_no,
				shipActD.base_unit_qty.subtract(shipActD.ship_ret_qty).subtract(nvl(wIvShipActMap.pr("iv_qty"), value(0))).as("retQty"));
		shipActDL_bldr.addLeftOuterJoin(subQuery()
				.select(
						ivShipActMap.ship_act_d_no,
						sum(ivShipActMap.base_unit_qty).as("iv_qty")
					).from(ivShipActMap)
					.groupBy(ivShipActMap.ship_act_d_no)
					.view(wIvShipActMap) ,shipActD.ship_act_d_no.eq(wIvShipActMap.pr(ivShipActMap.ship_act_d_no)));
		shipActDL_bldr.setWhere(shipActD.dlv_slip_d_no.eq(bind("ref_dlv_slip_d_no")));
		
		dbSelect("MSBBL1330_MST_IV_SHIP_ACT_MAP_S01", shipActDL, shipActDL_bldr, lst);
		
		return shipActDL;
	}

	//FMCB CUSTOM END
}