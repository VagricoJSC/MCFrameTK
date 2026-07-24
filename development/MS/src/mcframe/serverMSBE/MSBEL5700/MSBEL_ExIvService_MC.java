package mcframe.serverMSBE.MSBEL5700;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5700.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import mcframe.serverMSUC.MSUCL0020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ExIvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ExIvService_MC extends MSBEL_ExIvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ExIv_Upd01オペレーション.<p>
	 *
	 * インボイスにデータを登録する。<br>
	 */
	public class ExIv_Upd01 extends MSBEL_ExIvService_MC_A.ExIv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// キャッシュの初期化
			initCache();

			// 上り電文を編集する
			editUp();

			//表示順の発番
			setDispSeq(up1());

			// インボイスヘッダ、インボイス明細の登録処理
			insExIv(up0(), up1());
		}
		
		protected void initCache() {
			doItmUnitCache(up1());
			doCurXrateCache(up0());
			doSloDCache(up1());
		}

		/**
		 * 上り電文の編集を行う。
		 */
		protected void editUp() {
			editHdrUp();
			editDtlUp();
		}

		/**
		 * ヘッダの上り電文の編集を行う。
		 */
		protected void editHdrUp() {
			up0().iv_mng_no(getStrSeq(MSC_NUM_SYS_TYP.IVMNG));
			up0().iv_no(MAC_STR.NULL_VAL.value());
			up0().iv_rev(0);
			up0().iv_src_typ(MSC_IV_SRC_TYP.RCPT_IV.value());
			up0().dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());

			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			sloL_bldr.setWhere(t.slo_no.eq(bind("slo_no")));
			dbSelect("MSBEL5700_MST_SLO_S01", sloL, sloL_bldr, up1().groupBy(MST_SLO_R.$slo_no));

			MST_SLO_R sloR = sloL.get(0);
			up0().trd_ptn_typ(sloR.trd_ptn_typ());
			up0().ship_rqst_id_typ(MSC_SHIP_RQST_ID_TYP.CST.value());
			up0().ship_rqst_id_cd(sloR.cst_cd());
			up0().sls_basis_typ(sloR.sls_basis_typ());
			up0().via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
			up0().non_cmpl_flg(true);

			up0().trd_cur_cd(sloR.trd_cur_cd());
			up0().ptax_cur_cd(getPtaxCur().cur_cd());
			up0().pre_rcpt_iv_flg(true); //受領インボイス仮登録ＦＬＧ
			
			setXrate(sloL);
			
			if(!up0().dlv_sundry_flg()) {
				//納品先諸口ＦＬＧがが"0"の場合、納品先名をトランに焼かない
				up0().dlv_id_nm(null);
			}
		}
		
		/**
		 * 為替レート指定、為替レート、納税為替レート指定、納税為替レートの設定
		 * @param sloL
		 */
		protected void setXrate(MCList<MST_SLO_R> sloL) {
			MCList<MST_SLO_R> tmpL1 = null;
			MCList<MST_SLO_R> tmpL2 = null;

			//為替レート指定、為替レートの設定
			tmpL1 = sloL.groupBy(MST_SLO_R.$xrate);
			if(tmpL1.size() == 1) {
				up0().xrate(tmpL1.get(0).xrate());
				tmpL2 = sloL.groupBy(MST_SLO_R.$xrate_inpt_flg);
				if(tmpL2.size() == 1) {
					up0().xrate_inpt_flg(tmpL2.get(0).xrate_inpt_flg());
				}
				else {
					up0().xrate_inpt_flg(true);
				}
			}
			else {
				up0().xrate(null);
				up0().xrate_inpt_flg(false);
			}
			
			//納税為替レート指定、納税為替レートの設定
			tmpL1 = sloL.groupBy(MST_SLO_R.$ptax_xrate);
			if(tmpL1.size() == 1) {
				up0().ptax_xrate(tmpL1.get(0).ptax_xrate());
				tmpL2 = sloL.groupBy(MST_SLO_R.$ptax_xrate_inpt_flg);
				if(tmpL2.size() == 1) {
					up0().ptax_xrate_inpt_flg(tmpL2.get(0).ptax_xrate_inpt_flg());
				}
				else {
					up0().ptax_xrate_inpt_flg(true);
				}
			}
			else {
				up0().ptax_xrate(null);
				up0().ptax_xrate_inpt_flg(false);
			}
		}
		
		/**
		 * 明細の上り電文の編集を行う。
		 */
		protected void editDtlUp() {
			doSeqCache(MSC_NUM_SYS_TYP.IVD, up1().size());
			for(MST_IV_D_R up1R : up1()){
				up1R.iv_d_no(getStrSeq(MSC_NUM_SYS_TYP.IVD));
				up1R.iv_mng_no(up0().iv_mng_no());
				up1R.iv_rev(up0().iv_rev());
			
				MST_SLO_D_R slo_dR = _sloDCache.get(up1R.slo_d_no());
				copy(up1R, slo_dR, createMap_MST_IV_D_R_MST_SLO_D_R());
				setBaseUnitInfo(up1R, slo_dR);
				convTrdUnit(up1R, slo_dR);
			}
			calcAmt();
		}

		/**
		 * インボイスヘッダ、インボイス明細を登録する
		 * 
		 * @param hR
		 * @param dL
		 */
		protected void insExIv(ExIv_HdrR hR, MCList<MST_IV_D_R> dL) {

			//インボイスヘッダを登録する
			MST_IV_R hR2 = hR.iv();
			dbInsertEx("MSBEL5700_MST_IV_I01", hR2, MCQueryApiBuilder.create(MST_IV_R.create("T")));
			
			
			//インボイス明細を登録する
			dbInsertEx("MSBEL5700_MST_IV_D_I01", dL, MCQueryApiBuilder.create(MST_IV_D_R.create("T")));
		}
		
		/**
		 * 基準単位情報の設定
		 * 
		 * @param up1R
		 * @param slo_dR
		 */
		protected void setBaseUnitInfo(MST_IV_D_R up1R, MST_SLO_D_R slo_dR) {
			
			up1R.base_unit_cd(slo_dR.base_unit_cd());
			if(isSame(up1R.trd_unit_cd(), up1R.base_unit_cd())) {
				up1R.base_unit_qty(up1R.trd_unit_qty());
			}
			else {
				MAVM_ITM_UNIT_R up1R_itmUnitR = _itmUnitCache.get(
						up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(),
						up1R.trd_unit_cd());
				
				up1R.base_unit_qty(
						convToBaseUnit(up1R.trd_unit_qty(),
								up1R_itmUnitR.conv_base_qty(),
								up1R_itmUnitR.conv_qty(),
								slo_dR.getNumberNE("base_unit_dec_place"),
								slo_dR.getStringNE("base_unit_rnd_typ")));
			}
		}
		
		/**
		 * 取引単位ＣＤ、取引単位数量の換算
		 * 
		 * @param up1R
		 * @param slo_dR
		 */
		protected void convTrdUnit(MST_IV_D_R up1R, MST_SLO_D_R slo_dR) {
			
			// 受注時の取引単位を維持できる場合は維持する。維持できない場合は受領インボイスの単位・数量とする
			if(!isSame(up1R.trd_unit_cd(), slo_dR.trd_unit_cd())) {
				
				MCNumber convQty = rvrsBaseUnitConv(up1R.base_unit_qty(),
						slo_dR.getNumberNE("trd_unit_conv_base_qty"), slo_dR.getNumberNE("trd_unit_conv_qty"),
						slo_dR.getNumberNE("trd_unit_dec_place"), slo_dR.getStringNE("trd_unit_rnd_typ"));
				MCNumber baseUnitQty = convToBaseUnit(convQty,
						slo_dR.getNumberNE("trd_unit_conv_base_qty"), slo_dR.getNumberNE("trd_unit_conv_qty"),
						slo_dR.getNumberNE("base_unit_dec_place"), slo_dR.getStringNE("base_unit_rnd_typ"));
				if (isSame(up1R.base_unit_qty(), baseUnitQty)) {
					up1R.trd_unit_cd(slo_dR.trd_unit_cd());
					up1R.trd_unit_qty(convQty);
				}
			}
		}
		
		/**
		 * 金額を計算して設定する
		 */
		protected void calcAmt() {
			
			// 共通ユーティリティを用いて予定金額をベースに算出
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			up1().addNumberColumn("peg_no");
			setPegNo(up1());

			for (MST_IV_D_R dR : up1()) {

				ConvQtyAmtUtil_Calc01_HdrR opeHdr = ope.up0().createRow();
				copy(opeHdr, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R());
				ope.up0().add(opeHdr);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtl = ope.up1().createRow();
				copy(opeDtl, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_MST_IV_D_R());
				ope.up1().add(opeDtl);

			}

			ope.exec();

			String[] destCols = new String[] {
					MST_IV_D_R.$trd_cur_upri, MST_IV_D_R.$trd_cur_dscnt_amt,
					MST_IV_D_R.$trd_cur_amt, MST_IV_D_R.$trd_cur_tax_amt, MST_IV_D_R.$wtax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};

			copyByPegNo(up1(), destCols, ope.down0(), srcCols);

			// 納税通貨金額の算出
			if (!isNull(getPtaxCur().cur_cd())) {
				for (MST_IV_D_R r : up1()) {
					r.ptax_cur_amt(convCur(r.trd_cur_amt(), up0().ptax_xrate(), getPtaxCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				}
			}
			
			// インボイス表記金額
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 opeIv = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (MST_IV_D_R dR : up1()) {

				if(!isNull(dR.trd_cur_upri()) && !dR.trd_cur_upri().isZero()) {
					dR.iv_upri(dR.trd_cur_upri());
					dR.iv_amt(dR.trd_cur_amt());
					continue;
				}

				ConvQtyAmtUtil_Calc01_HdrR opeHdrIv = opeIv.up0().createRow();
				copy(opeHdrIv, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R_Iv());
				opeIv.up0().add(opeHdrIv);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtlIv = opeIv.up1().createRow();
				copy(opeDtlIv, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_MST_IV_D_R());
				opeIv.up1().add(opeDtlIv);
			}
			opeIv.exec();

			String[] destIvCols = new String[] {
					MST_IV_D_R.$iv_upri, 
					MST_IV_D_R.$iv_amt
			};
			String[] srcIvCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
			};
			copyByPegNo(up1(), destIvCols, opeIv.down0(), srcIvCols);
		}


		protected Map_MST_IV_D_R_MST_SLO_D_R<MST_IV_D_R,MST_SLO_D_R> createMap_MST_IV_D_R_MST_SLO_D_R() {
			return new Map_MST_IV_D_R_MST_SLO_D_R<MST_IV_D_R, MST_SLO_D_R>();
		}

		public class Map_MST_IV_D_R_MST_SLO_D_R<D extends MST_IV_D_R, S extends MST_SLO_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				//コピー元は受注ヘッダ項目
				addColumnPathMap(MST_IV_D_R.$cst_po_no, MST_SLO_R.$cst_po_no);
				addColumnPathMap(MST_IV_D_R.$trd_cd, MST_SLO_R.$trd_cd);
				addColumnPathMap(MST_IV_D_R.$sls_dpt_cd, MST_SLO_R.$sls_dpt_cd);
				addColumnPathMap(MST_IV_D_R.$sls_usr_cd, MST_SLO_R.$sls_usr_cd);
				addColumnPathMap(MST_IV_D_R.$ar_dpt_cd, MST_SLO_R.$ar_dpt_cd);
				addColumnPathMap(MST_IV_D_R.$trd_rmrks, MST_SLO_R.$trd_rmrks);

				//コピー元は受注明細項目
				addColumnPathMap(MST_IV_D_R.$cst_po_d_no, MST_SLO_D_R.$cst_po_d_no);
				addColumnPathMap(MST_IV_D_R.$iv_itm_nm, MST_SLO_D_R.$iv_itm_nm);
				addColumnPathMap(MST_IV_D_R.$cst_itm_cd, MST_SLO_D_R.$cst_itm_cd);
				addColumnPathMap(MST_IV_D_R.$cst_itm_nm, MST_SLO_D_R.$cst_itm_nm);
				addColumnPathMap(MST_IV_D_R.$gd_cd, MST_SLO_D_R.$gd_cd);
				addColumnPathMap(MST_IV_D_R.$trd_cur_upri, MST_SLO_D_R.$trd_cur_upri);
				addColumnPathMap(MST_IV_D_R.$iv_upri, MST_SLO_D_R.$iv_upri);
				addColumnPathMap(MST_IV_D_R.$sundry_itm_flg, MST_SLO_D_R.$sundry_itm_flg);
				addColumnPathMap(MST_IV_D_R.$tax_cd, MST_SLO_D_R.$tax_cd);
				addColumnPathMap(MST_IV_D_R.$wtax_rate, MST_SLO_D_R.$wtax_rate);
				addColumnPathMap(MST_IV_D_R.$cntry_org_cd, MST_SLO_D_R.$cntry_org_cd);
				addColumnPathMap(MST_IV_D_R.$rsn_cd, MST_SLO_D_R.$sls_rsn_cd);
				addColumnPathMap(MST_IV_D_R.$bd_dpt_cd, MST_SLO_D_R.$bd_dpt_cd);
				addColumnPathMap(MST_IV_D_R.$dlv_rqst_tm, MST_SLO_D_R.$dlv_rqst_tm);
				addColumnPathMap(MST_IV_D_R.$dscnt_rsn_cd, MST_SLO_D_R.$dscnt_rsn_cd);
				addColumnPathMap(MST_IV_D_R.$trd_d_rmrks, MST_SLO_D_R.$trd_d_rmrks);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if(!src.sundry_itm_flg()) {
					dest.itm_nm(null);
					dest.iv_itm_nm(null);
				}
			}
		}

		// キャッシュ関連
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _curXrateCache = null;
		protected FXUCL_MCDbcCache<MST_SLO_D_R> _sloDCache = null;

		// 品目単位マスタ
		protected void doItmUnitCache(MCList<MST_IV_D_R> dL) {
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.conv_qty, t.conv_base_qty);
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, dL, 
					MAVM_ITM_UNIT_R.$itm_cd, 
					MAVM_ITM_UNIT_R.$itm_sub1, 
					MAVM_ITM_UNIT_R.$itm_sub2, 
					MAVM_ITM_UNIT_R.$itm_sub3,
					MST_IV_D_R.$trd_unit_cd);
		}

		// 為替レートマスタ
		protected void doCurXrateCache(ExIv_HdrR hR) {
			MAM_CUR_XRATE_R t = MAM_CUR_XRATE_R.create("T");
			MAM_CUR_XRATE_R bindR = null;
			MCList<MAM_CUR_XRATE_R> bindL = MCList.create(MAM_CUR_XRATE_R.class);

			bindR = MAM_CUR_XRATE_R.create();
			bindR.fr_cur_cd(hR.trd_cur_cd());
			bindR.to_cur_cd(hR.ptax_cur_cd());
			bindR.xrate_cd(getCo().sls_xrate_cd());
			bindL.add(bindR);

			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.xrate);
			_curXrateCache = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(dbc_bldr, bindL, MAM_CUR_XRATE_R.$fr_cur_cd, MAM_CUR_XRATE_R.$to_cur_cd, MAM_CUR_XRATE_R.$xrate_cd);
		}

		// 受注
		protected void doSloDCache(MCList<MST_IV_D_R> bindL) {
			MST_SLO_R t1 = MST_SLO_R.create("T1");
			MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			MAM_CUR_R m3 = MAM_CUR_R.create("M3");
			MAM_BP_R m4 = MAM_BP_R.create("M4");
			MAM_TAX_R m5 = MAM_TAX_R.create("M5");
			
			MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc.addBooleanColumn("inc_tax_flg");

			dbc_bldr.addSelect(t1.trd_cd);		//取引ＣＤ
			dbc_bldr.addSelect(t1.cst_po_no);	//得意先注文ＮＯ
			dbc_bldr.addSelect(t1.sls_dpt_cd);	//売上部門ＣＤ
			dbc_bldr.addSelect(t1.sls_usr_cd);	//売上担当者ＣＤ
			dbc_bldr.addSelect(t1.ar_dpt_cd);	//債権部門ＣＤ
			dbc_bldr.addSelect(t1.trd_rmrks);	//取引備考
			dbc_bldr.addSelect(t1.trd_cur_cd);		//取引通貨ＣＤ
			dbc_bldr.addSelect(m1.dec_place.as("trd_unit_dec_place"));  // 取引単位小数部有効桁数
			dbc_bldr.addSelect(m1.conv_base_qty.as("trd_unit_conv_base_qty"));  // 取引単位分母数量
			dbc_bldr.addSelect(m1.conv_qty.as("trd_unit_conv_qty"));  //  取引単位換算数量
			dbc_bldr.addSelect(m1.rnd_typ.as("trd_unit_rnd_typ"));  // 取引単位換算数量
			dbc_bldr.addSelect(m2.dec_place.as("base_unit_dec_place"));
			dbc_bldr.addSelect(m2.rnd_typ.as("base_unit_rnd_typ"));
			dbc_bldr.addSelect(m3.upri_dec_place.as("trd_cur_upri_dec_place"));
			dbc_bldr.addSelect(m3.amt_dec_place.as("trd_cur_amt_dec_place"));
			dbc_bldr.addSelect(m4.sls_amt_rnd_typ);
			dbc_bldr.addSelect(m4.sls_tax_rnd_typ);
			dbc_bldr.addSelect(m5.inc_tax_flg);
			dbc_bldr.addSelect(m5.tax_rate);

			dbc_bldr.addInnerJoin(t1, t.slo_no.eq(t1.slo_no));
			dbc_bldr.addLeftOuterJoin(m1, t.itm_cd.eq(m1.itm_cd).and(t.itm_sub1.eq(m1.itm_sub1)).and(t.itm_sub2.eq(m1.itm_sub2)).and(t.itm_sub3.eq(m1.itm_sub3)).and(t.trd_unit_cd.eq(m1.unit_cd)));
			dbc_bldr.addLeftOuterJoin(m2, t.itm_cd.eq(m2.itm_cd).and(t.itm_sub1.eq(m2.itm_sub1)).and(t.itm_sub2.eq(m2.itm_sub2)).and(t.itm_sub3.eq(m2.itm_sub3)));
			dbc_bldr.addLeftOuterJoin(m3, t1.trd_cur_cd.eq(m3.cur_cd));
			dbc_bldr.addLeftOuterJoin(m4, t1.cst_cd.eq(m4.bp_cd));
			dbc_bldr.addLeftOuterJoin(m5, t.tax_cd.eq(m5.tax_cd));
			dbc_bldr.addWhereWithAnd(t.slo_d_no.eq(bind("slo_d_no")));

			_sloDCache = new FXUCL_MCDbcCache<MST_SLO_D_R>(dbc, dbc_bldr, bindL, MST_IV_D_R.$slo_d_no);
		}

		/**
		 * 上り電文 -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R<ConvQtyAmtUtil_Calc01_HdrR, MST_IV_D_R> createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R<ConvQtyAmtUtil_Calc01_HdrR, MST_IV_D_R>();
		}
	
		public class Map_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends MST_IV_D_R>
				extends MCRowMapper<D, S> {

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.peg_no(src.getNumber("peg_no"));
				MST_SLO_D_R slo_dR = _sloDCache.get(src.slo_d_no());
				dest.trd_cur_cd(slo_dR.getStringNE("trd_cur_cd"));
				dest.amt_dec_place(slo_dR.getNumberNE("trd_cur_amt_dec_place"));
				dest.upri_dec_place(slo_dR.getNumberNE("trd_cur_upri_dec_place"));
				dest.amt_rnd_typ(slo_dR.getStringNE("sls_amt_rnd_typ"));
				dest.tax_rnd_typ(slo_dR.getStringNE("sls_tax_rnd_typ"));
				dest.trd_unit_cd(slo_dR.trd_unit_cd());
				dest.trd_unit_qty(slo_dR.trd_unit_qty());
				dest.trd_cur_upri(slo_dR.trd_cur_upri());
				dest.trd_cur_dscnt_amt(slo_dR.trd_cur_dscnt_amt());
				dest.trd_cur_amt(slo_dR.trd_cur_amt());
				dest.trd_cur_tax_amt(slo_dR.trd_cur_tax_amt());
				dest.trd_cur_inc_tax_amt(slo_dR.trd_cur_amt().add(slo_dR.trd_cur_tax_amt()));
				dest.base_unit_dec_place(slo_dR.getNumberNE("base_unit_dec_place"));
				dest.base_unit_rnd_typ(slo_dR.getStringNE("base_unit_rnd_typ"));
				dest.trd_unit_conv_qty(slo_dR.getNumberNE("trd_unit_conv_qty"));
				dest.trd_unit_conv_base_qty(slo_dR.getNumberNE("trd_unit_conv_base_qty"));
				dest.tax_rate(slo_dR.getNumberNE("tax_rate"));
				dest.inc_tax_flg(slo_dR.getBooleanNE("inc_tax_flg"));

			}
		}
				
		/**
		 * 上り電文(MST_IV_D_R) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R_Iv<ConvQtyAmtUtil_Calc01_HdrR, MST_IV_D_R> createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R_Iv() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R_Iv<ConvQtyAmtUtil_Calc01_HdrR, MST_IV_D_R>();
		}
	
		public class Map_ConvQtyAmtUtil_Calc01_HdrR_MST_IV_D_R_Iv<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends MST_IV_D_R>
				extends MCRowMapper<D, S> {
	
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// 取引通貨単価とインボイス単価が異なるのは、取引通貨単価が0（無償）の場合であり、この場合は値引額の指定はない
				// インボイス金額は税抜金額なので、税に関する項目は設定しない。

				dest.peg_no(src.getNumber("peg_no"));
				MST_SLO_D_R slo_dR = _sloDCache.get(src.slo_d_no());
				dest.trd_cur_cd(slo_dR.getStringNE("trd_cur_cd"));
				dest.amt_dec_place(slo_dR.getNumberNE("trd_cur_amt_dec_place"));
				dest.upri_dec_place(slo_dR.getNumberNE("trd_cur_upri_dec_place"));
				dest.amt_rnd_typ(slo_dR.getStringNE("sls_amt_rnd_typ"));
				dest.tax_rnd_typ(slo_dR.getStringNE("sls_tax_rnd_typ"));
				dest.trd_unit_cd(slo_dR.trd_unit_cd());
				dest.trd_unit_qty(slo_dR.trd_unit_qty());
				dest.trd_cur_upri(slo_dR.iv_upri());
				dest.trd_cur_amt(slo_dR.iv_amt());
				dest.base_unit_dec_place(slo_dR.getNumberNE("base_unit_dec_place"));
				dest.base_unit_rnd_typ(slo_dR.getStringNE("base_unit_rnd_typ"));
				dest.trd_unit_conv_qty(slo_dR.getNumberNE("trd_unit_conv_qty"));
				dest.trd_unit_conv_base_qty(slo_dR.getNumberNE("trd_unit_conv_base_qty"));
				dest.wtax_rate(slo_dR.wtax_rate());

			}

		}

		/**
		 * 上り電文(MST_IV_D_R) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_MST_IV_D_R<ConvQtyAmtUtil_Calc01_Dtl1R, MST_IV_D_R> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_MST_IV_D_R() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_MST_IV_D_R<ConvQtyAmtUtil_Calc01_Dtl1R, MST_IV_D_R>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_MST_IV_D_R<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends MST_IV_D_R>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, MST_IV_D_R.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, MST_IV_D_R.$trd_unit_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.hdr_peg_no(src.getNumber("peg_no"));
				dest.peg_no(src.getNumber("peg_no"));

				MAVM_ITM_UNIT_R up1R_itmUnitR = _itmUnitCache.get(
						src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
						src.trd_unit_cd());
				dest.trd_unit_conv_qty(up1R_itmUnitR.conv_qty());
				dest.trd_unit_conv_base_qty(up1R_itmUnitR.conv_base_qty());

			}

		}

	}
	/**
	 * ExIv_Chk01オペレーション.<p>
	 *
	 * 削除対象のインボイスをチェックする。<br>
	 */
	public class ExIv_Chk01 extends MSBEL_ExIvService_MC_A.ExIv_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chkProgress());
			MCMessagePool.addAll(msgL);
			setDown();
		}
		
		protected MCMessageList chkProgress() {
			MST_IV_R t = MST_IV_R.create("T");
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
			ivL_bldr.setSelect(t.iv_no);
			ivL_bldr.addWhereWithAnd(t.rcpt_iv_mng_no.eq(bind("1")).and(t.pre_rcpt_iv_flg.eq(value(false))), up0().rcpt_iv_mng_no());
			int cnt = dbSelectForUpdate("MSBEL5700_MST_IV_S01", ivL, ivL_bldr);
			
			if(cnt > 0) {
				msgL.add(new MCMessage(MSBEL0086, ivL.get(0).iv_no()));
				up0().err_flg(true);
			}
			
			return msgL;
		}
		
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * ExIv_Del01オペレーション.<p>
	 *
	 * インボイスからデータを削除する。<br>
	 */
	public class ExIv_Del01 extends MSBEL_ExIvService_MC_A.ExIv_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MST_IV_R t1 = MST_IV_R.create("T1");
			MST_IV_R dbc_h = MST_IV_R.create();
			MCQueryApiBuilder dbc_h_bldr = MCQueryApiBuilder.create(t1);
			dbc_h_bldr.setSelect(t1.iv_mng_no);
			dbc_h_bldr.addWhereWithAnd(t1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			dbSelect("MSBEL5700_MST_IV_S02", dbc_h, dbc_h_bldr, up0());
			
			MST_IV_D_R t2 = MST_IV_D_R.create("T2");
			MCList<MST_IV_D_R> dbc_d = MCList.create(MST_IV_D_R.class);
			MCQueryApiBuilder dbc_d_bldr = MCQueryApiBuilder.create(t2);
			dbc_d_bldr.setSelect(t2.iv_d_no);
			dbc_d_bldr.addWhereWithAnd(t2.iv_mng_no.eq(bind("iv_mng_no")));
			dbSelect("MSBEL5700_MST_IV_D_S01", dbc_d, dbc_d_bldr, dbc_h);

			//インボイスヘッダを削除する
			dbDeleteKey("MSBEL5700_MST_IV_D01", dbc_h, dbc_h_bldr);
			
			//インボイス明細を削除する
			dbDeleteKey("MSBEL5700_MST_IV_D_D01", dbc_d, dbc_d_bldr);
		}
	}

	//FMCB CUSTOM END
}