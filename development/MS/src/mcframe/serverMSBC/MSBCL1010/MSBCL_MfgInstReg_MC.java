package mcframe.serverMSBC.MSBCL1010;

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
import mcframe.serverMSBC.MSBCL1010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL1010.Query.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverMSBC.MSBCL6040.*;
import mcframe.serverMSBC.MSBCL6090.*;
import mcframe.serverMSBC.MSBCL6110.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverCore.sys.MCSys;

import java.util.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgInstReg_MC extends MSBCL_MfgInstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索対象区分に応じてオーダ、製造指図情報を検索する。<br>
	 */
	public class Srch01 extends MSBCL_MfgInstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}
		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();

			// オペレーションの実装
			if (MSC_PROD_SRCH_TGT_TYP.isITM_ORD_NO(up0().srch_tgt_typ())) {
				srchOrd();
				setDefVal();
			}
			else if (MSC_PROD_SRCH_TGT_TYP.isITM_MFG_INST_NO(up0().srch_tgt_typ())) {
				srchItmMfgInst();
				setDefVal();
			}
			else if (MSC_PROD_SRCH_TGT_TYP.isMFG_INST_NO(up0().srch_tgt_typ())) {
				srchMfgInst();
			}
			setMesFlg();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().addStringColumn("tmp_aprv_usr", mcframe.serverCore.sys.MCSys.user.ID());
			up0().addDateColumn("tmp_today", getToday());
			// 承認種別
			if (isSame(up0().ope(), "4")) {
				up0().addStringColumn("OPE_VAL", "2");
			}
			// 取消種別
			else if (isSame(up0().ope(), "2")) {
				up0().addStringColumn("OPE_VAL", "3");
			}
			else {
				up0().addStringColumn("OPE_VAL", "1");
			}
		}

		/**
		 * 品目オーダＮＯを指定した検索処理
		 */
		protected void srchOrd() {
			// 品目オーダ検索
			executeQuery(down0(), MSBCL1010_MST_ITM_ORDER_S01(), up0());

			if (isNull(down0().itm_ord_no())) {
				return;
			}
			
			// 品目オーダ編集
			editItmOrd();
			
			// 工程オーダ検索
			executeQuery(down1(), MSBCL1010_MST_OPER_ORDER_S01(), down0());
			
			if (down1().isEmpty()) {
				down0().clear();
				return;
			}
			
			// 工程オーダ編集
			editOperOrd();
			
			// 再展開
			reExp();

			// その他下り電文編集
			editDown();
		}
		
		/**
		 * ヘッダコンテナの編集
		 */
		protected void editItmOrd() {
			if (MSC_MFG_MTD_TYP.isINTNL(down0().mfg_mtd_typ())) {
				// 画面の品目詳細マスタのリストロジックで必要な項目
				down0().mfg_flg(true);
				down0().outsrc_flg(false);
				setDefStrLnCd(down0());
			}
			else if (MSC_MFG_MTD_TYP.isEXTNL(down0().mfg_mtd_typ())) {
				down0().mfg_flg(false);
				down0().outsrc_flg(true);
				down0().mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
			}
			// 出来高予定数の設定
			setYieldQty();
		}
		
		/**
		 * 出来高予定数を設定する
		 */
		protected void setYieldQty() {
			if (MSC_MFG_MTD_TYP.isINTNL(down0().mfg_mtd_typ())) {
				if (!isSame(down0().base_unit_ord_qty(), down0().base_unit_inst_qty())) {
					// 残数分の出来高予定数を計算する
					// ※同様の処理が、製造指図一覧登録の検索処理や登録時の残数分の受払予定作成処理にも存在するため、修正の際は注意
					MCNumber sumItmMfgQty = getSumItmMfgInstYieldQty(down0().itm_ord_no());
					MCNumber yieldSchdQty = down0().base_unit_yield_qty().subtract(sumItmMfgQty);
					if (yieldSchdQty.isNegative()) {
						yieldSchdQty = MCNumber.ZERO;
					}
					down0().base_unit_yield_qty(yieldSchdQty);
				}
			}
			else if (MSC_MFG_MTD_TYP.isEXTNL(down0().mfg_mtd_typ())) {
				// 外注の場合、製造指図数と出来高予定数は必ず一致する仕様
				// ※発注数がそのまま入荷予定数となる仕様のため
				down0().base_unit_yield_qty(down0().base_unit_inst_qty());
			}
		}
		
		protected MCNumber getSumItmMfgInstYieldQty(String itmOrdNo) {
			// 同様の処理が、製造指図一覧の検索処理及び、指図分割した場合の残数分の受払予定作成処理にも存在するため、修正する場合は注意
			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t);
			imiL_bldr.setSelect(t.base_unit_yield_qty);
			imiL_bldr.setWhere(t.itm_ord_no.eq(bind("1")), itmOrdNo);
			imiL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL1010_MST_ITM_MFG_INST_S01", imiL, imiL_bldr);
			if (imiL.isEmpty()) {
				return MCNumber.ZERO;
			}
			return imiL.sum(MST_ITM_MFG_INST_R.$base_unit_yield_qty);
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd(Srch01_HdrR hdrR) {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
			cndR.itm_cd(hdrR.itm_cd());
			cndR.itm_sub1(hdrR.itm_sub1());
			cndR.itm_sub2(hdrR.itm_sub2());
			cndR.itm_sub3(hdrR.itm_sub3());
			cndR.loc_cd(hdrR.strg_loc_cd());
			ope.up0().add(cndR);
			ope.exec();
			ope.down0().forEach(downR -> {
				if (isNull(downR.str_ln_cd())) {
					hdrR.strg_str_ln_cd_none_flg(true);
				}
				else {
					hdrR.strg_str_ln_cd(downR.str_ln_cd());
					hdrR.strg_str_ln_nm(downR.str_ln_nm());
				}
			});
		}

		/**
		 * 工程コンテナの編集
		 */
		protected void editOperOrd() {
			// 工程紐付けＮＯの設定
			int cnt = 0;
			for (Srch01_DtlOperR r : down1()) {
				r.peg_no(cnt);
				cnt++;
				r.bkf_flg(down0().bkf_flg());
				r.base_unit_cd(down0().base_unit_cd());
				r.base_unit_nm(down0().base_unit_nm());
				r.base_unit_dec_place(down0().base_unit_dec_place());
				// 工程単位指図数の計算
				calcOperNum(r);
			}
			setYieldOperFlg();
		}
		/**
		 * 出来高計上工程が一件も存在しない場合は、最終工程を出来高計上工程とする
		 * @param gL
		 */
		protected void setYieldOperFlg() {
			MCList<Srch01_DtlOperR> downL = down1().shallowClone();
			if (isNull(downL.getFirst(Srch01_DtlOperR.$yield_oper_flg, true))) {
				// 工程リストより最終工程を特定するソート
				MCSortPolicy sp = new MCSortPolicy();
				sp.add(MCList.SortType.DESC, Srch01_DtlOperR.$disp_seq);
				sp.add(MCList.SortType.DESC, Srch01_DtlOperR.$oper_cd);
				sp.add(MCList.SortType.DESC, Srch01_DtlOperR.$oper_seq);
				downL.sort(sp);

				Srch01_DtlOperR yieldOperR = downL.get(0);
				yieldOperR.yield_oper_flg(true);
				yieldOperR.yield_oper_ratio(1);
			}
		}
		
		/**
		 * 再展開サービスの呼出
		 */
		protected void reExp() {

			setReExpUp();

			reExpSprt04.exec();

			mapDownContainers(RE1);
		}

		/**
		 * 再展開サービスの上り電文をセット
		 * @param res
		 */
		protected void setReExpUp() {
			// 品目オーダのセット
			ReExp_Sprt04_HdrR oUpR = ReExp_Sprt04_HdrR.create();
			copy(oUpR, down0(), createMap_ReExp_Sprt04_HdrR_Srch01_HdrR());
			reExpSprt04.up0().add(oUpR);

			//工程オーダのセット
			addAll(reExpSprt04.up1(), down1(), createMap_ReExp_Sprt04_DtlOperR_Srch01_DtlOperR());
		}
		
		protected Map_ReExp_Sprt04_HdrR_Srch01_HdrR<ReExp_Sprt04_HdrR,Srch01_HdrR> createMap_ReExp_Sprt04_HdrR_Srch01_HdrR() {
			return new Map_ReExp_Sprt04_HdrR_Srch01_HdrR<ReExp_Sprt04_HdrR, Srch01_HdrR>();
		}

		public class Map_ReExp_Sprt04_HdrR_Srch01_HdrR<D extends ReExp_Sprt04_HdrR, S extends Srch01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_cd, Srch01_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_sub1, Srch01_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_sub2, Srch01_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt04_HdrR.$itm_sub3, Srch01_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt04_HdrR.$oper_ptn, Srch01_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt04_HdrR.$bom_ptn, Srch01_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt04_HdrR.$yield_schd_qty, Srch01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt04_HdrR.$strg_loc_cd, Srch01_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$mfg_loc_cd, Srch01_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno1, Srch01_HdrR.$sno1);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno2, Srch01_HdrR.$sno2);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno3, Srch01_HdrR.$sno3);
				addColumnPathMap(ReExp_Sprt04_HdrR.$sno4, Srch01_HdrR.$sno4);
				addColumnPathMap(ReExp_Sprt04_HdrR.$mfg_st_schd_dt, Srch01_HdrR.$st_schd_dt);
				addColumnPathMap(ReExp_Sprt04_HdrR.$strg_str_ln_cd, Srch01_HdrR.$strg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt04_HdrR.$strg_str_ln_nm, Srch01_HdrR.$strg_str_ln_nm);
				addColumnPathMap(ReExp_Sprt04_HdrR.$strg_str_ln_cd_none_flg, Srch01_HdrR.$strg_str_ln_cd_none_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(1);
			}
		}
		
		protected Map_ReExp_Sprt04_DtlOperR_Srch01_DtlOperR<ReExp_Sprt04_DtlOperR,Srch01_DtlOperR> createMap_ReExp_Sprt04_DtlOperR_Srch01_DtlOperR() {
			return new Map_ReExp_Sprt04_DtlOperR_Srch01_DtlOperR<ReExp_Sprt04_DtlOperR, Srch01_DtlOperR>();
		}

		public class Map_ReExp_Sprt04_DtlOperR_Srch01_DtlOperR<D extends ReExp_Sprt04_DtlOperR, S extends Srch01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$peg_no, Srch01_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_cd, Srch01_DtlOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_seq, Srch01_DtlOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_loc_cd, Srch01_DtlOperR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_ptn, Srch01_DtlOperR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_inst_qty, Srch01_DtlOperR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$st_schd_tm, Srch01_DtlOperR.$st_schd_hm);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$end_schd_tm, Srch01_DtlOperR.$end_schd_hm);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$yield_oper_flg, Srch01_DtlOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$yield_oper_ratio, Srch01_DtlOperR.$yield_oper_ratio);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_str_ln_cd, Srch01_DtlOperR.$oper_str_ln_cd);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_str_ln_nm, Srch01_DtlOperR.$oper_str_ln_nm);
				addColumnPathMap(ReExp_Sprt04_DtlOperR.$oper_str_ln_cd_none_flg, Srch01_DtlOperR.$oper_str_ln_cd_none_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(1);
			}
		}
		
		/**
		 * 下り電文の編集
		 */
		protected void editDown() {
			// 製造指図単位区分が"品目単位"だった場合下り電文の対象工程ＦＬＧにTrueをセットする。
			for (Srch01_DtlOperR r : down1()) {
				r.setStatus(MCRow.Status.CREATE);
				if (MAC_MFG_INST_UNIT_TYP.isITM(down0().mfg_inst_unit_typ())) {
					r.tgt_oper_flg(true);
				}
			}
			for (Srch01_DtlInptR r : down2()) {
				r.setStatus(MCRow.Status.CREATE);
				// 工程指図の件数はそこまで多くないことが想定されるためindexkeyは使用していない
				Srch01_DtlOperR operR = down1().getFirst(Srch01_DtlOperR.$peg_no, r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlWkR r : down3()) {
				r.setStatus(MCRow.Status.CREATE);
				Srch01_DtlOperR operR = down1().getFirst(Srch01_DtlOperR.$peg_no, r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlYieldR r : down4()) {
				r.setStatus(MCRow.Status.CREATE);
				Srch01_DtlOperR operR = down1().getFirst(Srch01_DtlOperR.$peg_no, r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlByProdR r : down5()) {
				r.setStatus(MCRow.Status.CREATE);
				Srch01_DtlOperR operR = down1().getFirst(Srch01_DtlOperR.$peg_no, r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}

			// 投入データの編集
			editInptCmn(down2());
		}
		
		/**
		 * 検索直後のデフォルト値設定
		 */
		protected void setDefVal() {
			if (down0().isEmpty()) {
				return;
			}
			// 指図状況区分の初期値は未指図（登録処理内で、指図済みに置き換える）
			down0().mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
			down0().inst_dt(getToday());
		}
		
		/**
		 * 品目製造指図ＮＯを指定した検索処理
		 */
		protected void srchItmMfgInst() {
			// 品目製造指図の検索
			selectItmMfgInst();
			if (down0().isEmpty()) {
				return;
			}
			
			// 工程指図の検索
			selectOperInst();
			if (down1().isEmpty()) {
				down0().clear();
				return;
			}
			
			// 投入予定の検索
			selectInptSchd();
			
			// 工数予定の検索
			selectWkSchd();

			// 出来高予定の検索
			selectYieldSchd();
			
			// 副産品出来高予定の検索
			selectByProdSchd();
		}

		/**
		 * 製造指図ＮＯを指定した検索処理
		 */
		protected void srchMfgInst() {
			
			MCNumber latestRev = getLatestRev();
			
			// 上り電文として指定されなかった場合は、最新リビジョンのデータを参照する
			if (isNull(up0().mfg_inst_rev())) {
				up0().mfg_inst_rev(latestRev);
			}
			
			// 製造指図ＮＯを上り電文コンテナに設定（工程単位製造指図のために必要）
			// ※各種検索SQLのUNIONの前者のSQL＝検索条件で指定された製造指図のデータを取得
			// ※各種検索SQLのUNIONの後者のSQL＝同一品目製造指図に紐付く他の指図または未指図工程のデータを取得
			// という作りになっており、後者のSQLで前者のSQLで取得した製造指図NOのデータを取得しないようにするために使用している
			up0().mfg_inst_no(up0().srch_tgt_no());
			
			// 製造指図の検索
			selectMfgInst();
			if (down0().isEmpty()) {
				return;
			}
			else {
				setLatestFlg(latestRev);
				// 取消種別 かつ 指図承認済以外の場合、製造場所CDでＤＡＣ
				if (isSame(up0().ope(), "2") && !MSC_MFG_APRV_STS_TYP.isINST_ACPT(down0().mfg_aprv_sts_typ())) {
					up0().addStringColumn("OPE_VAL", "1");
				}
			}
			
			// 品目製造指図の検索
			selectItmMfgInst();
			if (down0().isEmpty()) {
				return;
			}
			
			// 工程指図の検索
			selectOperInst();
			if (down1().isEmpty()) {
				down0().clear();
				return;
			}
			
			// 投入予定の検索
			selectInptSchd();
			
			// 工数予定の検索
			selectWkSchd();

			// 出来高予定の検索
			selectYieldSchd();
			
			// 副産品出来高予定の検索
			selectByProdSchd();
			
			// 再展開履歴の検索
			selectReExtHst();
		}
		
		protected void setMesFlg() {
			if (!down1().isEmpty()) {
				setPegNo(down1());
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch02();
				for (Srch01_DtlOperR operR : down1()) {
					SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
					cndR.peg_no(operR.peg_no());
					cndR.loc_cd(down0().mfg_loc_cd());
					cndR.itm_cd(down0().itm_cd());
					cndR.itm_sub1(down0().itm_sub1());
					cndR.itm_sub2(down0().itm_sub2());
					cndR.itm_sub3(down0().itm_sub3());
					cndR.oper_cd(operR.oper_cd());
					cndR.master_dt(getToday());
					boolean firstRow = true;
					for (Srch01_DtlWkR wkR : down3()) {
						// 対象工程に紐づかない工数予定ならスキップ
						if (!isSame(operR.peg_no(), wkR.oper_peg_no())) {
							continue;
						}
						if (firstRow) {
							cndR.wk_cost_cd(wkR.wk_cost_cd());
							firstRow = false;
						}
						else {
							SCMLinkUtil_Srch02_CndR subR = cndR.clone();
							subR.wk_cost_cd(wkR.wk_cost_cd());
							ope.up0().add(subR);
						}
					}
					ope.up0().add(cndR);
				}
				
				ope.exec();
				
				String[] destCols = new String[] {Srch01_DtlOperR.$mes_tgt_flg};
				String[] srcCols = new String[] {SCMLinkUtil_Srch02_CndR.$mes_flg};
				copyByPegNo(down1(), destCols, ope.down0(), srcCols);
			}
		}
		
		protected MCNumber getLatestRev() {
			MST_MFG_INST_R miR = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder miR_bldr = MCQueryApiBuilder.create(miR);
			miR_bldr.setSelect(miR.mfg_inst_rev);
			dbSelectKey("MSBCL1010_MST_MFG_INST_S01", miR, miR_bldr, up0().srch_tgt_no());
			return miR.mfg_inst_rev();
		}
		
		protected void selectMfgInst() {
			MCRow.copyall(down0(), selectSqlMfgInst(up0()));
		}
		
		protected void setLatestFlg(MCNumber latestRev) {
			if (isSame(down0().mfg_inst_rev(), latestRev)) {
				down0().latest_flg(true);
			}
		}
		
		protected void selectItmMfgInst() {
			// 品目製造指図の検索
			Srch01_CndR tmpCndR = Srch01_CndR.create();
			if (MSC_PROD_SRCH_TGT_TYP.isITM_MFG_INST_NO(up0().srch_tgt_typ())) {
				tmpCndR.itm_mfg_inst_no(up0().srch_tgt_no());
			}
			else {
				if (MAC_MFG_INST_UNIT_TYP.isITM(down0().mfg_inst_unit_typ())) {
					tmpCndR.mfg_inst_no(up0().srch_tgt_no());
					tmpCndR.mfg_inst_rev(up0().mfg_inst_rev());
				}
				else {
					// 工程単位製造指図の場合は、初回製造指図ＮＯの最新改訂番号データを取得する
					setKeyToCnd(tmpCndR, down0().itm_mfg_inst_no());
				}
			}
			
			tmpCndR.addStringColumn("OPE_VAL", up0().getStringNE("OPE_VAL"));
			
			Srch01_HdrR tmpResultR = Srch01_HdrR.create();
			executeQuery(tmpResultR, MSBCL1010_MST_ITM_MFG_INST_ALL_R_S01(), tmpCndR);
			if (tmpResultR.isEmpty()) {
				down0().clear();
				return;
			}
			// 取得した品目製造指図データをdown0に設定する
			setItmMfgInstInfo(tmpResultR);
			
			if (MAC_MFG_INST_UNIT_TYP.isOPER(down0().mfg_inst_unit_typ())) {
				// 工程単位製造指図の場合に、品目製造指図ＮＯに紐付く他の製造指図及び未指図工程を取得するために、品目製造指図ＮＯを設定
				up0().itm_mfg_inst_no(tmpResultR.itm_mfg_inst_no());
			}
		}
		
		protected void setKeyToCnd(Srch01_CndR cndR, String itmMfgInstNo) {
			MST_ITM_MFG_INST_R imiR = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder imiR_bldr = MCQueryApiBuilder.create(imiR);
			MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T2");
			imiR_bldr.setSelect(imiR.frst_mfg_inst_no);
			imiR_bldr.addSelect(t2.mfg_inst_rev);
			imiR_bldr.addInnerJoin(t2, bracket( imiR.frst_mfg_inst_no.eq(t2.mfg_inst_no)));
			dbSelectKey("MSBCL1010_MST_ITM_MFG_INST_S02", imiR, imiR_bldr, itmMfgInstNo);
			
			cndR.mfg_inst_no(imiR.frst_mfg_inst_no());
			cndR.mfg_inst_rev(imiR.getNumberNE("MFG_INST_REV"));
		}
		
		protected void setItmMfgInstInfo(Srch01_HdrR tmpResultR) {
			down0().mfg_mtd_typ(tmpResultR.mfg_mtd_typ());
			down0().master_dt(tmpResultR.master_dt());
			down0().itm_cd(tmpResultR.itm_cd());
			down0().itm_sub1(tmpResultR.itm_sub1());
			down0().itm_sub2(tmpResultR.itm_sub2());
			down0().itm_sub3(tmpResultR.itm_sub3());
			down0().itm_nm(tmpResultR.itm_nm());
			down0().lot_mng_typ(tmpResultR.lot_mng_typ());
			down0().lot_no_typ(tmpResultR.lot_no_typ());
			down0().lot_no_ptn_cd(tmpResultR.lot_no_ptn_cd());
			down0().lot_mng_typ(tmpResultR.lot_mng_typ());
			down0().lot_no_typ(tmpResultR.lot_no_typ());
			down0().lot_no_ptn_cd(tmpResultR.lot_no_ptn_cd());
			down0().sublot_mng_typ(tmpResultR.sublot_mng_typ());
			down0().sublot_no_typ(tmpResultR.sublot_no_typ());
			down0().sublot_no_ptn_cd(tmpResultR.sublot_no_ptn_cd());
			down0().sno1_mng_typ(tmpResultR.sno1_mng_typ());
			down0().sno2_mng_typ(tmpResultR.sno2_mng_typ());
			down0().sno3_mng_typ(tmpResultR.sno3_mng_typ());
			down0().sno4_mng_typ(tmpResultR.sno4_mng_typ());
			down0().inpt_itm_add_flg(tmpResultR.inpt_itm_add_flg());
			down0().inpt_itm_del_flg(tmpResultR.inpt_itm_del_flg());
			down0().mfg_loc_cd(tmpResultR.mfg_loc_cd());
			down0().mfg_loc_nm(tmpResultR.mfg_loc_nm());
			down0().mfg_str_ln_tgt_flg(tmpResultR.mfg_str_ln_tgt_flg());
			down0().strg_loc_cd(tmpResultR.strg_loc_cd());
			down0().strg_loc_nm(tmpResultR.strg_loc_nm());
			down0().strg_str_ln_tgt_flg(tmpResultR.strg_str_ln_tgt_flg());
			down0().sppl_cd(tmpResultR.sppl_cd());
			down0().sppl_nm(tmpResultR.sppl_nm());
			down0().bom_ptn(tmpResultR.bom_ptn());
			down0().oper_ptn(tmpResultR.oper_ptn());
			down0().mst_yield_schd_qty(tmpResultR.mst_yield_schd_qty());
			down0().mst_mfg_inst_qty(tmpResultR.mst_mfg_inst_qty());
			down0().mst_fxd_rqmt_qty(tmpResultR.mst_fxd_rqmt_qty());
			down0().lot_issue_typ(tmpResultR.lot_issue_typ());
			down0().ln_stk_flg(tmpResultR.ln_stk_flg());
			down0().base_unit_cd(tmpResultR.base_unit_cd());
			down0().base_unit_nm(tmpResultR.base_unit_nm());
			down0().base_unit_dec_place(tmpResultR.base_unit_dec_place());
			down0().lot_no(tmpResultR.lot_no());
			down0().sublot_no(tmpResultR.sublot_no());
			down0().sno1(tmpResultR.sno1());
			down0().sno2(tmpResultR.sno2());
			down0().sno3(tmpResultR.sno3());
			down0().sno4(tmpResultR.sno4());
			down0().wrk_no(tmpResultR.wrk_no());
			down0().wrk_nm(tmpResultR.wrk_nm());
			down0().mfg_str_ln_cd(tmpResultR.mfg_str_ln_cd());
			down0().mfg_str_ln_nm(tmpResultR.mfg_str_ln_nm());
			down0().strg_str_ln_cd(tmpResultR.strg_str_ln_cd());
			down0().strg_str_ln_nm(tmpResultR.strg_str_ln_nm());
			down0().itm_ord_no(tmpResultR.itm_ord_no());
			down0().unschd_inst_flg(tmpResultR.unschd_inst_flg());
			down0().unschd_act_flg(tmpResultR.unschd_act_flg());
			down0().base_unit_ord_qty(tmpResultR.base_unit_ord_qty());
			down0().base_unit_not_inst_qty(tmpResultR.base_unit_not_inst_qty());
			down0().ord_abort_flg(tmpResultR.ord_abort_flg());
			down0().ord_mfg_st_schd_dt(tmpResultR.ord_mfg_st_schd_dt());
			down0().ord_mfg_end_schd_dt(tmpResultR.ord_mfg_end_schd_dt());
			down0().itm_ord_sts_typ(tmpResultR.itm_ord_sts_typ());
			down0().mfg_loc_wg_cd(tmpResultR.mfg_loc_wg_cd());
			down0().mfg_loc_wg_nm(tmpResultR.mfg_loc_wg_nm());
			if (isNull(down0().inst_po_cnt_rmrks())) {
				down0().inst_po_cnt_rmrks(tmpResultR.inst_po_cnt_rmrks());
			}
			down0().itm_lower_yield(tmpResultR.itm_lower_yield());
			down0().itm_std_yield(tmpResultR.itm_std_yield());
			down0().itm_upper_yield(tmpResultR.itm_upper_yield());
			down0().mfg_loc_site_cd(tmpResultR.mfg_loc_site_cd());
			down0().mfg_loc_site_nm(tmpResultR.mfg_loc_site_nm());
			down0().itm_mfg_inst_sub_char1(tmpResultR.itm_mfg_inst_sub_char1());
			down0().itm_mfg_inst_sub_char2(tmpResultR.itm_mfg_inst_sub_char2());
			down0().itm_mfg_inst_sub_char3(tmpResultR.itm_mfg_inst_sub_char3());
			down0().th_image(tmpResultR.th_image());
			down0().itm_ord_upd_cntr(tmpResultR.itm_ord_upd_cntr());
			down0().itm_mfg_inst_upd_cntr(tmpResultR.itm_mfg_inst_upd_cntr());
			down0().for_scheduler_frozen_flg(tmpResultR.for_scheduler_frozen_flg());
			
			// 工程単位製造指図で品目製造指図ＮＯで検索した場合（製造指図がない場合）
			if (isNull(down0().mfg_inst_no())) {
				down0().itm_mfg_inst_no(tmpResultR.itm_mfg_inst_no());
				down0().base_unit_inst_qty(tmpResultR.base_unit_inst_qty());
				down0().base_unit_yield_qty(tmpResultR.base_unit_yield_qty());
				down0().mfg_inst_unit_typ(tmpResultR.mfg_inst_unit_typ());

			}
		}
		
		protected void selectOperInst() {
			down1().addAll(selectSqlOperInst(up0()));
			if (MSC_PROD_SRCH_TGT_TYP.isITM_MFG_INST_NO(up0().srch_tgt_typ())) {
				String[] key = new String[] {Srch01_DtlOperR.$mfg_inst_no, Srch01_DtlOperR.$oper_abort_flg};
				Comparable<?>[] val = new Comparable<?>[] {null, false};
				MCList<Srch01_DtlOperR> yetOperL = down1().subList(key, val);
				
				if (yetOperL.isEmpty()) {
					// 未指図工程が存在しない場合は、工程をクリアする
					down1().clear();
				}
				else {
					down0().st_schd_dt((MCDate)yetOperL.min(Srch01_DtlOperR.$st_schd_dt));
					down0().end_schd_dt((MCDate)yetOperL.max(Srch01_DtlOperR.$end_schd_dt));
				}
			}
		}
		
		protected void selectInptSchd() {
			down2().addAll(selectSqlInptSchd(up0(), down1()));
		}
		
		protected void selectWkSchd() {
			down3().addAll(selectSqlWkSchd(up0(), down1()));
		}

		protected void selectYieldSchd() {
			down4().addAll(selectSqlYieldSchd(up0(), down1()));
		}
		
		protected void selectByProdSchd() {
			down5().addAll(selectSqlByProdSchd(up0(), down1()));
		}
		
		protected void selectReExtHst() {
			executeQuery(down6(), MSBCL1010_MST_RE_EXT_HST_S01(), up0());
		}
	}
	
	/**
	 * マスタ上で引当対象と設定されているかどうか
	 * @return
	 */
	protected boolean isAllocTgt(Srch01_DtlInptR r) {
		if (MAC_ALLOC_CTL_TYP.isALLOC_INST_NG(r.alloc_ctl_typ())
				|| MAC_ALLOC_CTL_TYP.isALLOC_INST_OK(r.alloc_ctl_typ())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 工程単位指図数の計算
	 * @param down1L
	 */
	protected void calcOperNum(Srch01_DtlOperR r) {
		
		MCNumber operUnitQty = convQtyBaseToOper(r.base_unit_qty(),
				r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
				r.oper_unit_conv_rnd_typ());
		
		if (isNull(operUnitQty)) {
			r.oper_unit_qty(r.base_unit_qty());
			r.oper_unit_cd(r.base_unit_cd());
			r.oper_unit_nm(r.base_unit_nm());
			r.oper_std_qty(1);
			r.oper_conv_qty(1);
			r.oper_unit_dec_place(r.base_unit_dec_place());
			r.oper_unit_conv_rnd_typ(MAC_RND_TYP.RNDUP.value());
		}
		else {
			r.oper_unit_qty(operUnitQty);
		}
	}
	
	protected Srch01_HdrR selectSqlMfgInst(Srch01_CndR cndR) {

		Srch01_HdrR retHdrR = Srch01_HdrR.create();
		executeQuery(retHdrR, MSBCL1010_MST_MFG_INST_ALL_R_S01(), cndR);
		return retHdrR;
	}
	
	/**
	 * 工程指図を検索する
	 * @param cndR 検索条件
	 * @return 工程指図の検索結果
	 */
	protected MCList<Srch01_DtlOperR> selectSqlOperInst(Srch01_CndR cndR) {
		
		MCList<Srch01_DtlOperR> retOperL = MCList.create(Srch01_DtlOperR.class);
		executeQuery(retOperL, MSBCL1010_MST_OPER_INST_ALL_R_S01(), cndR);
		
		setPegNo(retOperL);
		for (Srch01_DtlOperR r : retOperL) {
			if (MSC_PROD_SRCH_TGT_TYP.isITM_MFG_INST_NO(cndR.srch_tgt_typ())) {
				// 未指図工程を新規登録する場合、指図済み工程の対象工程ＦＬＧは全てfalse
				r.tgt_oper_flg(false);
			}
			else if (MSC_PROD_SRCH_TGT_TYP.isMFG_INST_NO(cndR.srch_tgt_typ())) {
				if (isSame(cndR.srch_tgt_no(), r.mfg_inst_no())) {
					// 指図済みデータを検索する場合、検索した製造指図に紐付く工程は対象工程ＦＬＧをtrueとする
					r.tgt_oper_flg(true);
				}
				else {
					r.tgt_oper_flg(false);
				}
			}
			calcOperNum(r);
		}
		return retOperL;
	}
	
	/**
	 * 投入予定を検索する
	 * @param cndR 検索条件
	 * @param operL 工程指図
	 * @return 投入予定の検索結果
	 */
	protected MCList<Srch01_DtlInptR> selectSqlInptSchd(Srch01_CndR cndR, MCList<Srch01_DtlOperR> operL) {
		
		MCList<Srch01_DtlInptR> retInptL = MCList.create(Srch01_DtlInptR.class);
		
		executeQuery(retInptL, MSBCL1010_MST_INPT_SCHD_ALL_R_S01(), cndR);
		
		for (MCList<Srch01_DtlInptR> gL : retInptL.groupList(Srch01_DtlInptR.$oper_inst_no)) {
			Set<MCNumber> bomIdSet = new HashSet<MCNumber>();
			for (Srch01_DtlInptR r : gL) {
				if (bomIdSet.contains(r.bom_id_no())) {
					if (isNull(r.bom_id_no())) {
						r.split_row_flg(false);
					}
					else {
						r.split_row_flg(true);
					}
				}
				else {
					bomIdSet.add(r.bom_id_no());
				}
				// 工程指図の件数はそこまで多くないことが想定されるためindexkeyは使用していない
				Srch01_DtlOperR operR = operL.getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_peg_no(operR.peg_no());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
		}
		editInptCmn(retInptL);
		return retInptL;
	}
	
	/**
	 * 工数予定を検索する
	 * @param cndR 検索条件
	 * @param operL 工程指図
	 * @return 工数予定の検索結果
	 */
	protected MCList<Srch01_DtlWkR> selectSqlWkSchd(Srch01_CndR cndR, MCList<Srch01_DtlOperR> operL) {
		
		MCList<Srch01_DtlWkR> retWkL = MCList.create(Srch01_DtlWkR.class);
		
		executeQuery(retWkL, MSBCL1010_MST_WK_SCHD_ALL_R_S01(), cndR);
		
		for (Srch01_DtlWkR r : retWkL) {
			Srch01_DtlOperR operR = operL.getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
			if (!isNull(operR)) {
				r.tgt_oper_flg(operR.tgt_oper_flg());
				r.oper_peg_no(operR.peg_no());
				r.oper_cd(operR.oper_cd());
				r.oper_nm(operR.oper_nm());
				r.oper_seq(operR.oper_seq());
			}
		}
		return retWkL;
	}

	/**
	 * 出来高予定（出来高）を検索する
	 * @param cndR 検索条件
	 * @param operL 工程指図
	 * @return 出来高予定の検索結果
	 */
	protected MCList<Srch01_DtlYieldR> selectSqlYieldSchd(Srch01_CndR cndR, MCList<Srch01_DtlOperR> operL) {

		MCList<Srch01_DtlYieldR> retYieldL = MCList.create(Srch01_DtlYieldR.class);
		
		executeQuery(retYieldL, MSBCL1010_MST_YIELD_SCHD_ALL_R_S01(), cndR);
		
		for (Srch01_DtlYieldR r : retYieldL) {
			Srch01_DtlOperR operR = operL.getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
			if (!isNull(operR)) {
				r.tgt_oper_flg(operR.tgt_oper_flg());
				r.oper_peg_no(operR.peg_no());
				r.oper_cd(operR.oper_cd());
				r.oper_nm(operR.oper_nm());
				r.oper_seq(operR.oper_seq());
			}
		}
		return retYieldL;
	}
	
	/**
	 * 出来高予定（副産品）を検索する
	 * @param cndR 検索条件
	 * @param operL 工程指図
	 * @return 出来高予定の検索結果
	 */
	protected MCList<Srch01_DtlByProdR> selectSqlByProdSchd(Srch01_CndR cndR, MCList<Srch01_DtlOperR> operL) {

		MCList<Srch01_DtlByProdR> retByProdL = MCList.create(Srch01_DtlByProdR.class);
		
		executeQuery(retByProdL, MSBCL1010_MST_YIELD_SCHD_ALL_R_S02(), cndR);
		
		for (Srch01_DtlByProdR r : retByProdL) {
			Srch01_DtlOperR operR = operL.getFirst(Srch01_DtlOperR.$oper_inst_no, r.oper_inst_no());
			if (!isNull(operR)) {
				r.tgt_oper_flg(operR.tgt_oper_flg());
				r.oper_peg_no(operR.peg_no());
				r.oper_cd(operR.oper_cd());
				r.oper_nm(operR.oper_nm());
				r.oper_seq(operR.oper_seq());
			}
		}
		return retByProdL;
	}

	/**
	 * 投入一覧の編集
	 * @param isL
	 */
	protected void editInptCmn(MCList<Srch01_DtlInptR> isL) {
		createFixedLossItmCache(isL);
		for (Srch01_DtlInptR r : isL) {
			if (isNull(r.inpt_schd_no())) {
				// 新規行
				
				// 指図時ロット指定FLG
				if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
						|| MAC_PROV_TYP.isSS(r.prov_typ())
						|| MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					// 非在庫品・自給品・指図書のみの場合はfalse
					r.inst_lot_fix_flg(false);
				}
				
				
				// ロット指定無しFLG
				if (r.inst_lot_fix_flg()) {
					r.no_lot_fix_flg(false);
				}
				else {
					r.no_lot_fix_flg(true);
				}
				
				// 引当FLG
				if (isAllocTgt(r) && r.tgt_oper_flg()) {
					r.alloc_flg(true);
				}
				
				// ロット提案対象FLG
				if (r.alloc_flg() && !r.no_lot_fix_flg()
						&& (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
								|| !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()))) {
					r.lot_prop_tgt_flg(true);
				}
			}
			MAM_ITM_R itmR = _fixedLossItmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (isNull(itmR.itm_cd())) {
				r.fxd_loss_rsn_none_flg(true);
			}
		}
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _fixedLossItmCache;
	protected void createFixedLossItmCache(MCList<Srch01_DtlInptR> inptL) {
		// 子品目に紐づく固定ロス理由が存在する品目リストをキャッシュ
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_LOSS_RSN_R m2 = MAM_LOSS_RSN_R.create("M2");
		MAM_BIZ_RSN_R m3 = MAM_BIZ_RSN_R.create("M3");
		dbc_bldr.setSelect(t.itm_cd);
		dbc_bldr.addInnerJoin(m2, bracket(t.itm_typ.eq(m2.itm_typ)
				.and(t.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));
		dbc_bldr.addInnerJoin(m3, bracket(m2.loss_rsn_cd.eq(m3.biz_rsn_cd)
				.and(m3.fxd_loss_flg.eq(value(true)))));
		_fixedLossItmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, inptL,
				MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3);
	}
	
	protected String[] getAltKey() {
		return new String[]{
				Srch01_DtlInptR.$oper_peg_no, Srch01_DtlInptR.$alt_grp_cd,
				Srch01_DtlInptR.$alt_grp_seq
		};
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造指図を登録・訂正する。<br>
	 */
	public class Upd01 extends MSBCL_MfgInstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			lotMixChk();
			throwUpdErr();
			callMfgInstRegSrvChk();
			throwUpdErr();
			callMfgInstRegSrvUpd();
		}
		
		protected void editUp() {
			MCNumber hdrPegNo = MCNumber.ZERO;
			up0().peg_no(hdrPegNo);
			up0().upd_cntr_chk_flg(true);
			if (MSC_MFG_STS_TYP.isYET(up0().mfg_sts_typ())) {
				up0().mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				up0().upd_cntr_chk_flg(true);
			}
			
			for (MfgInstReg_Chk01_DtlOperR r : up1()) {
				r.hdr_peg_no(hdrPegNo);
				setOperMfgSts(r);
			}
			for (MfgInstReg_Chk01_DtlInptR r : up2()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgInstReg_Chk01_DtlWkR r : up3()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgInstReg_Chk01_DtlYieldR r : up4()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgInstReg_Chk01_DtlByProdR r : up5()) {
				r.hdr_peg_no(hdrPegNo);
			}
			for (MfgInstReg_Chk01_DtlReExtR r : up6()) {
				r.mfg_inst_no(up0().mfg_inst_no());
				r.hdr_peg_no(hdrPegNo);
				setReExtTyp(r);
			}
			setPegNo(up2(), up3(), up4(), up5(), up6());
			setDispSeq(up2());
			setDispSeq(up3());
			setDispSeq(up4());
			setDispSeq(up5());
		}
		protected void lotMixChk() {
			MCIndexKey idxKey = up1().createIndex(MfgInstReg_Chk01_DtlOperR.$peg_no);
			// 上り電文から行削除ステータスのレコードを除いたリストを作成
			MCList<MfgInstReg_Chk01_DtlInptR> tgtUp2L = MCList.create(MfgInstReg_Chk01_DtlInptR.class);
			tgtUp2L = up2().subList(r -> !isSame(r.getStatus(), MCRow.DELETE));
			
			// 行削除ステータスではない投入レコードに、工程を設定
			for (MfgInstReg_Chk01_DtlInptR r : tgtUp2L) {
				// 工程行から、工程CD、工程連番を設定する。
				MfgInstReg_Chk01_DtlOperR operR = up1().getFirst(idxKey, r.oper_peg_no());
				r.setStringNE("oper_cd", operR.oper_cd());
				r.setNumberNE("oper_seq", operR.oper_seq());
			}
			// 同一工程、同一工程連番の同一品目でロット・サブロット混在可否チェックするためのindexKey
			MCIndexKey lotMixIdxKey = tgtUp2L.createIndex(
					"oper_cd",
					"oper_seq",
					MfgInstReg_Chk01_DtlInptR.$itm_cd,
					MfgInstReg_Chk01_DtlInptR.$itm_sub1,
					MfgInstReg_Chk01_DtlInptR.$itm_sub2,
					MfgInstReg_Chk01_DtlInptR.$itm_sub3);
			
			for (MfgInstReg_Chk01_DtlInptR r : tgtUp2L) {
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				// ロット、サブロット混在（同一工程、同一工程連番内の同一品目）
				MCList<MfgInstReg_Chk01_DtlInptR> subL = tgtUp2L.subList(
						lotMixIdxKey, r.getStringNE("oper_cd"), r.getNumberNE("oper_seq"), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isLotMix(r, subL)) {
					MCMessagePool.add(new MCMessage(r,null,MSBCL1211,dispItm,dispGUIIndex));
				}
			}
		}
		protected boolean isLotMix(MfgInstReg_Chk01_DtlInptR r, MCList<MfgInstReg_Chk01_DtlInptR> subL ) {
			for (MfgInstReg_Chk01_DtlInptR subR : subL) {
				if (isSame(r.peg_no(), subR.peg_no())) {
					continue;
				}
				if (!isSame(r.lot_mix_flg(), subR.lot_mix_flg())) {
					return true;
				}
				if (!isSame(r.sublot_mix_flg(), subR.sublot_mix_flg())) {
					return true;
				}
			}
			return false;
		}
		
		protected void setOperMfgSts(MfgInstReg_Chk01_DtlOperR r) {
			if (!r.tgt_oper_flg()) {
				r.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
			}
			else {
				if (MSC_MFG_STS_TYP.isSAV(up0().mfg_sts_typ())
						|| MSC_MFG_STS_TYP.isORD(up0().mfg_sts_typ())) {
					r.mfg_sts_typ(up0().mfg_sts_typ());
				}
			}
		}
		
		/**
		 * 指図再展開区分の設定
		 * @param r
		 */
		protected void setReExtTyp(MfgInstReg_Chk01_DtlReExtR r) {
			if (r.unneces_flg()) {
				// 不要フラグがオンの場合、指図再展開区分に「不要」を設定
				r.re_ext_typ(MSC_RE_EXT_TYP.UNNECES.value());
			}
			else {
				// 不要フラグがオフで指図再展開区分が「不要」の場合（画面で不要フラグをオンからオフにした場合）、「未展開」を設定
				if (MSC_RE_EXT_TYP.isUNNECES(r.re_ext_typ())) {
					r.re_ext_typ(MSC_RE_EXT_TYP.YET.value());
				}
				// 上記以外は画面からの指図再展開区分そのまま
			}
		}
		
		protected void callMfgInstRegSrvChk() {
			MSBCL_MfgInstRegService.MfgInstReg_Chk01 chk = MSBCL_MfgInstRegService.crtMfgInstReg_Chk01();
			chk.up0().add(up0());
			chk.up1().addAll(up1());
			chk.up2().addAll(up2());
			chk.up3().addAll(up3());
			chk.up4().addAll(up4());
			chk.up5().addAll(up5());
			chk.up6().addAll(up6());
			chk.exec();
			
			MCRow.copyall(up0(), chk.down0().get(0));
			up1().setAll(chk.down1());
			up2().setAll(chk.down2());
			up3().setAll(chk.down3());
			up4().setAll(chk.down4());
			up5().setAll(chk.down5());
			up6().setAll(chk.down6());
		}
		
		protected void callMfgInstRegSrvUpd() {
			// MSBCL1010は画面に合わせるためヘッダコンテナをRowで定義しており、subOpeのマッピングが使えないのでmapperを使用している
			MfgInstReg_Upd01_HdrR srvUp0 = MfgInstReg_Upd01_HdrR.create();
			copy(srvUp0, up0(), createMap_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk01_HdrR());
			miUpd01.up0().add(srvUp0);
			mapUpContainers(MI);
			
			miUpd01.exec();
			
			setDown0();
			mapDownContainers(MI);
			setInptStrLnInfo();
		}
		
		protected void setInptStrLnInfo() {
			for (MfgInstReg_Chk01_DtlInptR r : down2()) {
				if (!isNullOrNullVal(r.inpt_str_ln_cd())) {
					r.inpt_str_ln_nm(getStrLnNm(r.inpt_loc_cd(), r.inpt_str_ln_cd()));
					r.inpt_str_ln_cd_none_flg(false);
				}
				else {
					r.inpt_str_ln_cd_none_flg(true);
				}
			}
		}
		
		protected Map_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk01_HdrR<MfgInstReg_Upd01_HdrR,MfgInstReg_Chk01_HdrR> createMap_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk01_HdrR() {
			return new Map_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk01_HdrR<MfgInstReg_Upd01_HdrR, MfgInstReg_Chk01_HdrR>();
		}

		public class Map_MfgInstReg_Upd01_HdrR_MfgInstReg_Chk01_HdrR<D extends MfgInstReg_Upd01_HdrR, S extends MfgInstReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_data_crud_typ, MfgInstReg_Chk01_HdrR.$mfg_inst_data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_data_crud_typ, MfgInstReg_Chk01_HdrR.$itm_mfg_inst_data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$peg_no, MfgInstReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_mtd_typ, MfgInstReg_Chk01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_sts_typ, MfgInstReg_Chk01_HdrR.$mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$master_dt, MfgInstReg_Chk01_HdrR.$master_dt);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_cd, MfgInstReg_Chk01_HdrR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_sub1, MfgInstReg_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_sub2, MfgInstReg_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_sub3, MfgInstReg_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$lot_mng_typ, MfgInstReg_Chk01_HdrR.$lot_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$lot_no_typ, MfgInstReg_Chk01_HdrR.$lot_no_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$lot_no_ptn_cd, MfgInstReg_Chk01_HdrR.$lot_no_ptn_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sublot_mng_typ, MfgInstReg_Chk01_HdrR.$sublot_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sublot_no_typ, MfgInstReg_Chk01_HdrR.$sublot_no_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sublot_no_ptn_cd, MfgInstReg_Chk01_HdrR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_loc_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sppl_cd, MfgInstReg_Chk01_HdrR.$sppl_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$maker_cd, MfgInstReg_Chk01_HdrR.$maker_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$strg_loc_cd, MfgInstReg_Chk01_HdrR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$bom_ptn, MfgInstReg_Chk01_HdrR.$bom_ptn);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$lot_issue_typ, MfgInstReg_Chk01_HdrR.$lot_issue_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_inst_qty, MfgInstReg_Chk01_HdrR.$base_unit_inst_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_yield_qty, MfgInstReg_Chk01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_cd, MfgInstReg_Chk01_HdrR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_dt, MfgInstReg_Chk01_HdrR.$inst_dt);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_usr_cd, MfgInstReg_Chk01_HdrR.$inst_usr_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_dpt_cd, MfgInstReg_Chk01_HdrR.$inst_dpt_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$rqst_dlv_rqst_tm, MfgInstReg_Chk01_HdrR.$rqst_dlv_rqst_tm);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$st_schd_tm, MfgInstReg_Chk01_HdrR.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$end_schd_tm, MfgInstReg_Chk01_HdrR.$end_schd_tm);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$oper_ptn, MfgInstReg_Chk01_HdrR.$oper_ptn);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$lot_no, MfgInstReg_Chk01_HdrR.$lot_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sublot_no, MfgInstReg_Chk01_HdrR.$sublot_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno1, MfgInstReg_Chk01_HdrR.$sno1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno2, MfgInstReg_Chk01_HdrR.$sno2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno3, MfgInstReg_Chk01_HdrR.$sno3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$sno4, MfgInstReg_Chk01_HdrR.$sno4);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_str_ln_cd, MfgInstReg_Chk01_HdrR.$mfg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$strg_str_ln_cd, MfgInstReg_Chk01_HdrR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_locked_flg, MfgInstReg_Chk01_HdrR.$po_locked_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_abort_flg, MfgInstReg_Chk01_HdrR.$inst_abort_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_rpt_rmrks, MfgInstReg_Chk01_HdrR.$inst_rpt_rmrks);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$intr_rmrks, MfgInstReg_Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_po_cnt_rmrks, MfgInstReg_Chk01_HdrR.$inst_po_cnt_rmrks);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$disp_pd, MfgInstReg_Chk01_HdrR.$disp_pd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_no, MfgInstReg_Chk01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_rev, MfgInstReg_Chk01_HdrR.$mfg_inst_rev);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_prnt_tm, MfgInstReg_Chk01_HdrR.$inst_prnt_tm);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_prnt_flg, MfgInstReg_Chk01_HdrR.$inst_prnt_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_immed_prnt_flg, MfgInstReg_Chk01_HdrR.$inst_immed_prnt_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$chg_list_immed_prnt_flg, MfgInstReg_Chk01_HdrR.$chg_list_immed_prnt_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$xfr_inst_del_enable_flg, MfgInstReg_Chk01_HdrR.$xfr_inst_del_enable_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_no, MfgInstReg_Chk01_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$frst_mfg_inst_no, MfgInstReg_Chk01_HdrR.$frst_mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$io_schd_pr_no, MfgInstReg_Chk01_HdrR.$io_schd_pr_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_ord_no, MfgInstReg_Chk01_HdrR.$itm_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_unit_typ, MfgInstReg_Chk01_HdrR.$mfg_inst_unit_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$unschd_inst_flg, MfgInstReg_Chk01_HdrR.$unschd_inst_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$unschd_act_flg, MfgInstReg_Chk01_HdrR.$unschd_act_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$schd_chg_flg, MfgInstReg_Chk01_HdrR.$schd_chg_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_ord_qty, MfgInstReg_Chk01_HdrR.$base_unit_ord_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$base_unit_not_inst_qty, MfgInstReg_Chk01_HdrR.$base_unit_not_inst_qty);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$ord_abort_flg, MfgInstReg_Chk01_HdrR.$ord_abort_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_loc_wg_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_loc_site_cd, MfgInstReg_Chk01_HdrR.$mfg_loc_site_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_schd_src_typ, MfgInstReg_Chk01_HdrR.$po_schd_src_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_schd_src_no, MfgInstReg_Chk01_HdrR.$po_schd_src_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_schd_data_crud_typ, MfgInstReg_Chk01_HdrR.$po_schd_data_crud_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_lower_yield, MfgInstReg_Chk01_HdrR.$itm_lower_yield);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_std_yield, MfgInstReg_Chk01_HdrR.$itm_std_yield);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_upper_yield, MfgInstReg_Chk01_HdrR.$itm_upper_yield);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$inst_rec_issue_flg, MfgInstReg_Chk01_HdrR.$inst_rec_issue_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_d_no, MfgInstReg_Chk01_HdrR.$po_d_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$po_auto_reg_flg, MfgInstReg_Chk01_HdrR.$po_auto_reg_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_sub_char1, MfgInstReg_Chk01_HdrR.$itm_mfg_inst_sub_char1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_sub_char2, MfgInstReg_Chk01_HdrR.$itm_mfg_inst_sub_char2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$itm_mfg_inst_sub_char3, MfgInstReg_Chk01_HdrR.$itm_mfg_inst_sub_char3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_sub_char1, MfgInstReg_Chk01_HdrR.$mfg_inst_sub_char1);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_sub_char2, MfgInstReg_Chk01_HdrR.$mfg_inst_sub_char2);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_inst_sub_char3, MfgInstReg_Chk01_HdrR.$mfg_inst_sub_char3);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$aprv_flg, MfgInstReg_Chk01_HdrR.$aprv_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$no_mfg_aprv_flg, MfgInstReg_Chk01_HdrR.$no_mfg_aprv_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_aprv_sts_typ, MfgInstReg_Chk01_HdrR.$mfg_aprv_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$mfg_aprv_role_cd, MfgInstReg_Chk01_HdrR.$mfg_aprv_role_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$aprv_dt, MfgInstReg_Chk01_HdrR.$aprv_dt);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$aprv_dpt_cd, MfgInstReg_Chk01_HdrR.$aprv_dpt_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$aprv_usr_cd, MfgInstReg_Chk01_HdrR.$aprv_usr_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$aprv_tm, MfgInstReg_Chk01_HdrR.$aprv_tm);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$aprv_rsn, MfgInstReg_Chk01_HdrR.$aprv_rsn);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_mfg_sts_typ, MfgInstReg_Chk01_HdrR.$old_mfg_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_mfg_aprv_sts_typ, MfgInstReg_Chk01_HdrR.$old_mfg_aprv_sts_typ);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_aprv_flg, MfgInstReg_Chk01_HdrR.$old_aprv_flg);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_mfg_aprv_role_cd, MfgInstReg_Chk01_HdrR.$old_mfg_aprv_role_cd);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_inst_dt, MfgInstReg_Chk01_HdrR.$old_inst_dt);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_lot_no, MfgInstReg_Chk01_HdrR.$old_lot_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_sublot_no, MfgInstReg_Chk01_HdrR.$old_sublot_no);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_bom_ptn, MfgInstReg_Chk01_HdrR.$old_bom_ptn);
				addColumnPathMap(MfgInstReg_Upd01_HdrR.$old_inst_abort_flg, MfgInstReg_Chk01_HdrR.$old_inst_abort_flg);

			}
		}
		
		protected void setDown0() {
			MfgInstReg_Upd01_HdrR srvDown0 = miUpd01.down0().get(0);
			
			up0().lot_no(srvDown0.lot_no());
			up0().sublot_no(srvDown0.sublot_no());
			up0().mfg_inst_no(srvDown0.mfg_inst_no());
			up0().mfg_inst_rev(srvDown0.mfg_inst_rev());
			up0().itm_mfg_inst_no(srvDown0.itm_mfg_inst_no());
			up0().itm_ord_no(srvDown0.itm_ord_no());
			up0().mfg_sts_typ(srvDown0.mfg_sts_typ());
			up0().mfg_sts_typ_nm(srvDown0.mfg_sts_typ_nm());
			
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 在庫または入庫予定から投入品のロットを提案する。<br>
	 */
	public class Sprt01 extends MSBCL_MfgInstReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			lotProp();
			setDown();
		}
		
		protected void editUp() {
			// ロット提案対象の抽出
			MCList<Srch01_DtlInptR> inptL = getLotPropExeList();
			
			// 実際有効成分のクリア
			clearActContFctr(inptL);

			// ロット・サブロットＮＯの設定
			setLotAndSubLotMntTyp(inptL);

			// 投入予定の内容をロット提案サービスの上り電文に設定
			setLotPropSrvUp(inptL);
		}
		
		/**
		 * ロット提案対象の抽出
		 * @return ロット提案対象リスト
		 */
		protected MCList<Srch01_DtlInptR> getLotPropExeList() {
			MCList<Srch01_DtlInptR> retL = MCList.create(Srch01_DtlInptR.class);
			
			// peg_noの発番
			setPegNo(up0());
			
			MCList<Srch01_DtlInptR> upL = up0().clone();
			
			for (Srch01_DtlInptR r : upL) {

				//対象工程ＦＬＧチェック
				if (!r.tgt_oper_flg()) {
					continue;
				}

				//下記を満たすレコードは処理対象外とする
				//・削除行
				//・投入数が０ or NULL→このチェックはロット提案サービスで実施
				//・ロット提案対象がオフ
				//・ロット指定なしフラグがオン
				if (isSame(r.getStatus(), MCRow.DELETE) 
						|| !r.lot_prop_tgt_flg()
						|| r.no_lot_fix_flg()) {
					continue;
				}
				
				retL.add(r);

			}
			return retL;
		}
		
		/**
		 * 有効成分対象で実際有効成分係数が設定されている場合はクリア
		 * @param ロット提案対象リスト
		 */
		protected void clearActContFctr(MCList<Srch01_DtlInptR> inptL) {
			for (Srch01_DtlInptR r : inptL) {
				if(r.cont_fctr_flg() && !isNull(r.act_cont_fctr())){
					r.act_cont_fctr(null);
				}
			}
		}

		/**
		 * ロットＮＯ管理区分・サブロット管理区分をチェックし、<br>
		 * ロット提案サービスを呼ぶ際の上り電文にセットするロットＮＯ・サブロットＮＯを調整
		 * 
		 * @param ロット提案対象リスト
		 */
		protected void setLotAndSubLotMntTyp(MCList<Srch01_DtlInptR> inptL) {
			//ロット提案対象でループ
			for (Srch01_DtlInptR r : inptL) {

				//ロットＮＯ管理しない場合はＮＵＬＬ文字をセットする
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.lot_no(null);
				}

				//サブロットＮＯ管理しない場合はＮＵＬＬ文字をセットする
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.sublot_no(null);
				}
			}
		}
		
		/**
		 * ロット提案対象のリストからロット提案サービスの上り電文を設定
		 * 
		 * @param ロット提案対象リスト
		 */
		protected void setLotPropSrvUp(MCList<Srch01_DtlInptR> inptL) {
			lotPropSprt01.up0().act_flg(false); //実績時フラグはオフ
			lotPropSprt01.up0().exec_prop_btn_flg(true); //ロット提案ボタンから実行フラグはオン
			addAll(lotPropSprt01.up1(), inptL, createMap_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR());
		}

		/**
		 * ロット提案サービスの実行
		 */
		protected void lotProp() {
			lotPropSprt01.exec();
		}

		/**
		 * 下り電文のセット
		 */
		protected void setDown() {
			//通常ロット提案
			MCList<Srch01_DtlInptR> nrmlL = MCList.create(Srch01_DtlInptR.class);
			//代替Ｇでのロット提案
			MCList<Srch01_DtlInptR> altGL = MCList.create(Srch01_DtlInptR.class);

			for (Srch01_DtlInptR upR : up0()) {

				if (isNull(upR.alt_grp_cd()) || upR.alt_itm_fix_flg()) {
					nrmlL.add(upR);
				}
				else {
					altGL.add(upR);
				}
			}

			if (!nrmlL.isEmpty()) {
				setNrmlLotPropRslt(nrmlL);
			}
			if (!altGL.isEmpty()) {
				setAltGLotPropRslt(altGL);
			}
			down0().sort(Srch01_DtlInptR.$disp_seq, Srch01_DtlInptR.$first_gr_dt, Srch01_DtlInptR.$lot_seq);
			setInptStrLnInfo();
		}
		
		protected void setInptStrLnInfo() {
			for (Srch01_DtlInptR r : down0()) {
				if (!isNullOrNullVal(r.inpt_str_ln_cd())) {
					r.inpt_str_ln_nm(getStrLnNm(r.inpt_loc_cd(), r.inpt_str_ln_cd()));
					r.inpt_str_ln_cd_none_flg(false);
				}
				else {
					r.inpt_str_ln_cd_none_flg(true);
				}
			}
		}

		/**
		 * 通常ロット提案結果を下り電文にセットする
		 * @param nrmlL
		 */
		protected void setNrmlLotPropRslt(MCList<Srch01_DtlInptR> nrmlL) {
			MCIndexKey srvUpIdxKey = lotPropSprt01.up1().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			MCIndexKey srvDownIdxKey = lotPropSprt01.down1().createIndex(LotProp_Sprt01_Dtl2R.$peg_no);
			MCIndexKey thisUpIdxKey = up0().createIndex(Srch01_DtlInptR.$peg_no);

			//上り電文でループ
			for (Srch01_DtlInptR r : nrmlL) {

				//ロット提案対象のRowかどうかのチェック
				LotProp_Sprt01_Dtl1R lotPropR = lotPropSprt01.up1().getFirst(srvUpIdxKey, r.peg_no());
				if (isNull(lotPropR)) {
					down0().add(r);
					continue;
				}

				//処理結果から紐付けＮＯが同じものを抽出
				MCList<LotProp_Sprt01_Dtl2R> lotPropRsltL = lotPropSprt01.down1()
						.subList(srvDownIdxKey, r.peg_no());

				//ロット提案対象で提案結果が無かった場合は
				//上り電文のロットＮＯ・サブロットＮＯをクリアし下り電文にセットする
				if (lotPropRsltL.size() == 0) {
					Srch01_DtlInptR lotPropExeR = up0().getFirst(thisUpIdxKey, r.peg_no());
					if (!isNull(lotPropExeR)) {
						r.lot_no(null);
						r.sublot_no(null);

						if (r.cont_fctr_flg() && !isNull(r.act_cont_fctr())) {
							//実際係数をクリア
							r.act_cont_fctr(null);
						}
					}
					down0().add(r);
					continue;
				}

				//ロット提案結果を下り電文に反映
				for (LotProp_Sprt01_Dtl2R rsltR : lotPropRsltL) {

					// １件目の場合
					if (lotPropRsltL.indexOf(rsltR) == 0) {
						setExeRsult(r, rsltR);

						if (isSame(r.getStatus(), MCRow.NONE)) {
							r.setStatus(MCRow.MODIFY);
						}
						down0().add(r);
					}
					// ２件目以降の場合
					else {
						Srch01_DtlInptR newR = r.clone();
						setExeRsult(newR, rsltR);
						down0().add(newR);
					}
				}
			}
		}

		/**
		 * 代替Ｇロット提案結果を下り電文にセットする
		 * @param altGAllL
		 */
		protected void setAltGLotPropRslt(MCList<Srch01_DtlInptR> altGL) {
			String[] gbkeys = new String[]{
					Srch01_DtlInptR.$oper_peg_no, Srch01_DtlInptR.$alt_grp_cd, Srch01_DtlInptR.$alt_grp_seq
			};

			MCIndexKey srvUpIdxKey = lotPropSprt01.up1().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			MCIndexKey srvDownIdxKey = lotPropSprt01.down1().createIndex(LotProp_Sprt01_Dtl2R.$peg_no);

			for (Srch01_DtlInptR gbR : altGL.groupBy(gbkeys)) {

				Comparable[] vals = new Comparable[]{
					gbR.oper_peg_no(), gbR.alt_grp_cd(), gbR.alt_grp_seq()
				};

				MCList<Srch01_DtlInptR> altGsubL
				= altGL.subList(gbkeys, vals);

				//ロット提案結果を下り電文に追加する
				for (Srch01_DtlInptR subR : altGsubL) {

					//ロット提案対象のRowかどうかのチェック
					LotProp_Sprt01_Dtl1R lotPropR = lotPropSprt01.up1().getFirst(srvUpIdxKey, subR.peg_no());
					if (isNull(lotPropR)) {
						down0().add(subR);
						continue;
					}

					//ロット提案結果から紐付けＮＯが同じものを抽出
					MCList<LotProp_Sprt01_Dtl2R> lotPropRsltL = lotPropSprt01.down1()
							.subList(srvDownIdxKey, subR.peg_no());

					//ロット提案結果を下り電文に追加
					for (LotProp_Sprt01_Dtl2R rsltR : lotPropRsltL) {

						// １件目の場合
						if (lotPropRsltL.indexOf(rsltR) == 0) {
							setExeRsult(subR, rsltR);

							if (isSame(subR.getStatus(), MCRow.NONE)) {
								subR.setStatus(MCRow.MODIFY);
							}
							down0().add(subR);
						}
						// ２件目以降の場合
						else {
							Srch01_DtlInptR newR = subR.clone();
							setExeRsult(newR, rsltR);
							down0().add(newR);
						}
					}
				}
			}
		}

		/**
		 * ロット提案結果を下り電文のRowにコピーする
		 * @param dest コピー先
		 * @param src コピー元
		 */
		protected void setExeRsult(Srch01_DtlInptR dest,
				LotProp_Sprt01_Dtl2R src) {
			dest.inpt_loc_cd(src.inpt_loc_cd());
			dest.inpt_str_ln_cd(src.inpt_str_ln_cd());
			dest.no_lot_fix_flg(src.not_lot_fix_flg());
			if (src.not_lot_fix_flg()) {
				// 代替グループのロット提案の結果、提案されなかった品目についてはロット指定無しFLGがtrueになるため、ロット提案対象FLGはfalseにする
				dest.lot_prop_tgt_flg(false);
			}
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			dest.sno1(src.rqst_sno1());
			dest.sno1_null_flg(src.sno1_null_flg());
			dest.sno2(src.rqst_sno2());
			dest.sno2_null_flg(src.sno2_null_flg());
			dest.sno3(src.rqst_sno3());
			dest.sno3_null_flg(src.sno3_null_flg());
			dest.sno4(src.rqst_sno4());
			dest.sno4_null_flg(src.sno4_null_flg());
			dest.alloc_sno1(src.sno1());
			dest.alloc_sno2(src.sno2());
			dest.alloc_sno3(src.sno3());
			dest.alloc_sno4(src.sno4());
			dest.gd_cd(src.gd_cd());
			dest.gd_nm(src.gd_nm());
			dest.ver_no(src.ver_no());
			dest.vld_dt(src.vld_dt());
			dest.first_gr_dt(src.first_gr_dt());
			dest.lot_seq(src.lot_seq());
			dest.base_unit_inpt_qty(src.inpt_qty());
			dest.base_unit_rqmt_qty(src.rqmt_qty());
			dest.base_unit_fxd_rqmt_qty(src.fxd_rqmt_qty());
			dest.base_unit_sum_rqmt_qty(src.base_unit_qty());
			dest.act_cont_fctr(src.act_cont_fctr());
			dest.cont_inpt_qty(src.cont_inpt_qty());
			dest.cont_rqmt_qty(src.cont_rqmt_qty());
			dest.cont_fxd_rqmt_qty(src.cont_fxd_rqmt_qty());
			dest.sum_cont_rqmt_qty(src.cont_qty());
			dest.alt_itm_fix_flg(src.alt_itm_fix_flg());
			dest.alloc_flg(src.alloc_flg());
		}

		/**
		 * 上り電文（投入予定）の内容をロット提案サービス（ロット提案）に設定
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR<LotProp_Sprt01_Dtl1R,Srch01_DtlInptR> createMap_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR() {
			return new Map_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR<LotProp_Sprt01_Dtl1R, Srch01_DtlInptR>();
		}

		public class Map_LotProp_Sprt01_Dtl1R_Srch01_DtlInptR<D extends LotProp_Sprt01_Dtl1R, S extends Srch01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_peg_no, Srch01_DtlInptR.$oper_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$peg_no, Srch01_DtlInptR.$peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_schd_no, Srch01_DtlInptR.$inpt_schd_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$mfg_sts_typ, Srch01_DtlInptR.$mfg_sts_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_dt, Srch01_DtlInptR.$schd_dt); //投入日には投入予定日
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$ver_no, Srch01_DtlInptR.$ver_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_cd, Srch01_DtlInptR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub1, Srch01_DtlInptR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub2, Srch01_DtlInptR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub3, Srch01_DtlInptR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_cd, Srch01_DtlInptR.$alt_grp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_seq, Srch01_DtlInptR.$alt_grp_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_inst_no, Srch01_DtlInptR.$oper_inst_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_qty, Srch01_DtlInptR.$base_unit_alt_qty); //代替元数には基準単位代替元数量
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_typ, Srch01_DtlInptR.$alt_itm_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_alloc_prio, Srch01_DtlInptR.$alt_alloc_prio);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg, Srch01_DtlInptR.$alt_itm_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_loc_cd, Srch01_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd, Srch01_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_cd, Srch01_DtlInptR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_nm, Srch01_DtlInptR.$gd_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_no, Srch01_DtlInptR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_no, Srch01_DtlInptR.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno1_null_flg, Srch01_DtlInptR.$sno1_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno2_null_flg, Srch01_DtlInptR.$sno2_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno3_null_flg, Srch01_DtlInptR.$sno3_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno4_null_flg, Srch01_DtlInptR.$sno4_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_cd, Srch01_DtlInptR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$vld_dt, Srch01_DtlInptR.$vld_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$first_gr_dt, Srch01_DtlInptR.$first_gr_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_seq, Srch01_DtlInptR.$lot_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_qty, Srch01_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqmt_qty, Srch01_DtlInptR.$base_unit_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty, Srch01_DtlInptR.$base_unit_fxd_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_inpt_qty, Srch01_DtlInptR.$cont_inpt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_rqmt_qty, Srch01_DtlInptR.$cont_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fxd_rqmt_qty, Srch01_DtlInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_unit_cd, Srch01_DtlInptR.$cont_fctr_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_flg, Srch01_DtlInptR.$cont_fctr_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_dec_place, Srch01_DtlInptR.$cont_fctr_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_rnd_typ, Srch01_DtlInptR.$cont_fctr_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_mix_flg, Srch01_DtlInptR.$lot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_mix_flg, Srch01_DtlInptR.$sublot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alloc_flg, Srch01_DtlInptR.$alloc_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_dec_place, Srch01_DtlInptR.$base_unit_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_rnd_typ, Srch01_DtlInptR.$base_unit_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$std_cont_fctr, Srch01_DtlInptR.$std_cont_fctr);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$set_stk_str_ln_flg, Srch01_DtlInptR.$set_stk_str_ln_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(MCNumber.ONE); //製造指図は１件のため、１固定

				// 引当手配ＮＯを優先してロット提案する
				dest.rqst_sno1(nvl(src.alloc_sno1(), src.sno1()));
				dest.rqst_sno2(nvl(src.alloc_sno2(), src.sno2()));
				dest.rqst_sno3(nvl(src.alloc_sno3(), src.sno3()));
				dest.rqst_sno4(nvl(src.alloc_sno4(), src.sno4()));

				// 必要数量合計の算出
				dest.base_unit_qty(sum(src.base_unit_rqmt_qty(), src.base_unit_fxd_rqmt_qty()));
				if (src.cont_fctr_flg()) {
					dest.cont_qty(sum(src.cont_rqmt_qty(), src.cont_fxd_rqmt_qty()));
				}
			}
		}

	}

	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 工程指図と各予定を最新のマスタで再展開する<br>
	 */
	public class Sprt02 extends MSBCL_MfgInstReg_MC_A.Sprt02 {
		protected MCList<Srch01_DtlOperR> _operL;
		protected MCList<Srch01_DtlYieldR> _yieldL;
		protected MCList<Srch01_DtlInptR> _inptL;
		protected MCList<Srch01_DtlByProdR> _byProdL;
		protected MCList<Srch01_DtlWkR> _wkL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (isNull(up0())) {
				return;
			}
			// 品目マスタの存在チェック
			chkMamItm();

			// 各種指図・予定テーブルの取得
			getTbl();
			
			// 再展開オペレーションの実行
			reExp();
			
			setMesFlg();
			// 下り電文の設定
			setDown();
		}

		/**
		 * 品目マスタの存在チェック
		 */
		protected void chkMamItm() {
			MAM_ITM_R mamItmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder mamItmL_bldr = MCQueryApiBuilder.create(mamItmL_t);
			MCList<MAM_ITM_R> mamItmL = MCList.create(MAM_ITM_R.class);
			
			mamItmL_bldr.setSelect(mamItmL_bldr.getBaseDbc().getKeyColumn$());
			mamItmL_bldr.setWhere(mamItmL_t.itm_cd.eq(bind("itm_cd")));
			mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub1.eq(bind("itm_sub1")));
			mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub2.eq(bind("itm_sub2")));
			mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBBL1010_MAM_ITM_S01", mamItmL, mamItmL_bldr, up0());
			
			if (mamItmL.isEmpty()) {
				MCAppException ex = new MCAppException(MAUDL0004);
				ex.addCauseMessage(new MCMessage(MAUAL0189,toDispItm(up0().itm_cd(),up0().itm_sub1(),up0().itm_sub2(),up0().itm_sub3()),toDispGUIIndex(MCRow.create())));
				throw ex;
			}
		}

		/**
		 * 各種指図・予定テーブルの取得
		 */
		protected void getTbl() {

			// 工程指図
			_operL = selectOperInst();
			// 出来高予定
			_yieldL = selectYieldSchd(_operL);
			// 投入予定
			_inptL = selectInptSchd(_operL);
			// 副産品予定
			_byProdL = selectByProdSchd(_operL);
			// 工数予定
			_wkL = selectWkSchd(_operL);

			setPegNo(_operL);
			setPegNo(_yieldL);
			setPegNo(_inptL);
			setPegNo(_byProdL);
			setPegNo(_wkL);
		}
		
		/**
		 * 再展開
		 */
		protected void reExp() {
			setSubOpeUp();
			reExpSprt05.exec();
			setSubOpeDown();
		}
		
		/**
		 * サブオペの上りをセット
		 */
		protected void setSubOpeUp() {
			// 製造指図・品目製造指図の内容を上り電文に設定
			ReExp_Sprt05_HdrR hdrR = ReExp_Sprt05_HdrR.create();
			copy(hdrR, up0(), createMap_ReExp_Sprt05_HdrR_Sprt02_HdrR());
			reExpSprt05.up0().add(hdrR);

			// 工程指図
			addAll(reExpSprt05.up1(), _operL, createMap_ReExp_Sprt05_DtlOperR_Srch01_DtlOperR());
			// 工程パタンはヘッダから設定
			reExpSprt05.up1().setString(ReExp_Sprt05_DtlOperR.$oper_ptn, hdrR.oper_ptn());
			// 出来高予定
			addAll(reExpSprt05.up2(), _yieldL, createMap_ReExp_Sprt03_DtlYieldR_Srch01_DtlYieldR());
			// 投入予定
			addAll(reExpSprt05.up3(), _inptL, createMap_ReExp_Sprt01_DtlInptR_Srch01_DtlInptR());
			// 副産品予定
			addAll(reExpSprt05.up4(), _byProdL, createMap_ReExp_Sprt01_DtlByProdR_Srch01_DtlByProdR());
			// 工数予定
			addAll(reExpSprt05.up5(), _wkL, createMap_ReExp_Sprt02_DtlWkR_Srch01_DtlWkR());
		}

		protected void setMesFlg() {
			if (!down0().isEmpty()) {
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch02();
				for (Srch01_DtlOperR operR : down0()) {
					SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
					cndR.peg_no(operR.peg_no());
					cndR.loc_cd(up0().mfg_loc_cd());
					cndR.itm_cd(up0().itm_cd());
					cndR.itm_sub1(up0().itm_sub1());
					cndR.itm_sub2(up0().itm_sub2());
					cndR.itm_sub3(up0().itm_sub3());
					cndR.oper_cd(operR.oper_cd());
					cndR.master_dt(getToday());
					
					boolean firstRow = true;
					for (Srch01_DtlWkR wkR : down2()) {
						// 対象工程に紐づかない工数予定ならスキップ
						if (!isSame(operR.peg_no(), wkR.oper_peg_no())) {
							continue;
						}
						if (firstRow) {
							cndR.wk_cost_cd(wkR.wk_cost_cd());
							firstRow = false;
						}
						else {
							SCMLinkUtil_Srch02_CndR subR = cndR.clone();
							subR.wk_cost_cd(wkR.wk_cost_cd());
							ope.up0().add(subR);
						}
					}
					ope.up0().add(cndR);
				}
				
				ope.exec();
				
				String[] destCols = new String[] {Srch01_DtlOperR.$mes_tgt_flg};
				String[] srcCols = new String[] {SCMLinkUtil_Srch02_CndR.$mes_flg};
				copyByPegNo(down0(), destCols, ope.down0(), srcCols);
			}
		}
		/**
		 * 上り電文から再展開の上り電文を設定（製造指図）
		 * @return
		 */
		protected Map_ReExp_Sprt05_HdrR_Sprt02_HdrR<ReExp_Sprt05_HdrR,Sprt02_HdrR> createMap_ReExp_Sprt05_HdrR_Sprt02_HdrR() {
			return new Map_ReExp_Sprt05_HdrR_Sprt02_HdrR<ReExp_Sprt05_HdrR, Sprt02_HdrR>();
		}

		public class Map_ReExp_Sprt05_HdrR_Sprt02_HdrR<D extends ReExp_Sprt05_HdrR, S extends Sprt02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_HdrR.$wg_cd, Sprt02_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_cd, Sprt02_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub1, Sprt02_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub2, Sprt02_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub3, Sprt02_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt05_HdrR.$oper_ptn, Sprt02_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt05_HdrR.$bom_ptn, Sprt02_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_inst_qty, Sprt02_HdrR.$base_unit_inst_qty);
				addColumnPathMap(ReExp_Sprt05_HdrR.$yield_schd_qty, Sprt02_HdrR.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_loc_cd, Sprt02_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_loc_cd, Sprt02_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno1, Sprt02_HdrR.$sno1);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno2, Sprt02_HdrR.$sno2);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno3, Sprt02_HdrR.$sno3);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno4, Sprt02_HdrR.$sno4);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_st_schd_dt, Sprt02_HdrR.$st_schd_dt);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_end_schd_dt, Sprt02_HdrR.$end_schd_dt);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_ord_no, Sprt02_HdrR.$itm_ord_no);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_inst_no, Sprt02_HdrR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt05_HdrR.$master_dt, Sprt02_HdrR.$master_dt);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_str_ln_cd, Sprt02_HdrR.$strg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_str_ln_nm, Sprt02_HdrR.$strg_str_ln_nm);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_str_ln_cd_none_flg, Sprt02_HdrR.$strg_str_ln_cd_none_flg);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_str_ln_cd, Sprt02_HdrR.$mfg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_str_ln_nm, Sprt02_HdrR.$mfg_str_ln_nm);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_str_ln_cd_none_flg, Sprt02_HdrR.$mfg_str_ln_cd_none_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(MCNumber.ONE); //１件のみのため、１固定
				dest.not_bom_exp_flg(false); //構成展開する
				dest.not_wk_exp_flg(false); //工数展開する
				if (MSC_MFG_MTD_TYP.isINTNL(src.mfg_mtd_typ())) {
					// 内製の場合のオーダ区分は製造
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
				else {
					// 外注の場合のオーダ区分は外注
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				// 手配ＮＯがＮＵＬＬの場合はＮＵＬＬ文字補完
				dest.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				dest.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				dest.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				dest.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
			}
		}

		/**
		 * 各種指図・予定検索時の条件を設定する
		 * @return
		 */
		protected Srch01_CndR getCndR() {
			Srch01_CndR cndR = Srch01_CndR.create();
			cndR.srch_tgt_typ(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.value()); //検索対象区分は「製造指図ＮＯ」固定
			cndR.srch_tgt_no(up0().mfg_inst_no()); //検索対象ＮＯは製造指図ＮＯ
			cndR.mfg_inst_rev(up0().mfg_inst_rev());
			return cndR;
		}
		
		/**
		 * 製造指図ＮＯから製造指図を取得する
		 */
		protected Srch01_HdrR selectMfgInst() {
			return selectSqlMfgInst(getCndR());
		}

		/**
		 * 製造指図ＮＯから工程指図を取得する
		 */
		protected MCList<Srch01_DtlOperR> selectOperInst() {
			return selectSqlOperInst(getCndR());
		}

		/**
		 * 工程指図のテーブルから再展開の上り電文を設定
		 * @return
		 */
		protected Map_ReExp_Sprt05_DtlOperR_Srch01_DtlOperR<ReExp_Sprt05_DtlOperR,Srch01_DtlOperR> createMap_ReExp_Sprt05_DtlOperR_Srch01_DtlOperR() {
			return new Map_ReExp_Sprt05_DtlOperR_Srch01_DtlOperR<ReExp_Sprt05_DtlOperR, Srch01_DtlOperR>();
		}

		public class Map_ReExp_Sprt05_DtlOperR_Srch01_DtlOperR<D extends ReExp_Sprt05_DtlOperR, S extends Srch01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$peg_no, Srch01_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_cd, Srch01_DtlOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_seq, Srch01_DtlOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$base_unit_qty, Srch01_DtlOperR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$yield_oper_flg, Srch01_DtlOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$st_schd_tm, Srch01_DtlOperR.$st_schd_dt);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$end_schd_tm, Srch01_DtlOperR.$end_schd_dt);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_loc_cd, Srch01_DtlOperR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_str_ln_cd, Srch01_DtlOperR.$oper_str_ln_cd);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_str_ln_nm, Srch01_DtlOperR.$oper_str_ln_nm);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_str_ln_cd_none_flg, Srch01_DtlOperR.$oper_str_ln_cd_none_flg);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_std_qty, Srch01_DtlOperR.$oper_std_qty);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_conv_qty, Srch01_DtlOperR.$oper_conv_qty);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$mfg_inst_no, Srch01_DtlOperR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_inst_no, Srch01_DtlOperR.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_lt, Srch01_DtlOperR.$oper_lt);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_lt_add_qty, Srch01_DtlOperR.$oper_lt_add_qty);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_offst_typ, Srch01_DtlOperR.$oper_offst_typ);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_offst, Srch01_DtlOperR.$oper_offst);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_offst_add_qty, Srch01_DtlOperR.$oper_offst_add_qty);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$oper_ptn, Srch01_DtlOperR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt05_DtlOperR.$yield_oper_ratio, Srch01_DtlOperR.$yield_oper_ratio);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(MCNumber.ONE); //単票画面は１固定
			}
		}

		/**
		 * 製造指図ＮＯから出来高予定（出来高）を取得する
		 */
		protected MCList<Srch01_DtlYieldR> selectYieldSchd(MCList<Srch01_DtlOperR> operL) {
			return selectSqlYieldSchd(getCndR(), operL);
		}

		/**
		 * 製造指図ＮＯから投入予定を取得する
		 */
		protected MCList<Srch01_DtlInptR> selectInptSchd(MCList<Srch01_DtlOperR> operL) {
			return selectSqlInptSchd(getCndR(), operL);
		}

		/**
		 * 製造指図ＮＯから工数予定を取得する
		 */
		protected MCList<Srch01_DtlWkR> selectWkSchd(MCList<Srch01_DtlOperR> operL) {
			return selectSqlWkSchd(getCndR(), operL);
		}

		/**
		 * 製造指図ＮＯから出来高予定（副産品）を取得する
		 */
		protected MCList<Srch01_DtlByProdR> selectByProdSchd(MCList<Srch01_DtlOperR> operL) {
			return selectSqlByProdSchd(getCndR(), operL);
		}

		/**
		 * サブオペの下り電文を当オペレーションの下り電文に設定する
		 */
		protected void setSubOpeDown() {
			// 工程
			MCIndexKey idxKey = _operL.createIndex(Srch01_DtlOperR.$peg_no);
			for (ReExp_Sprt05_RsltOperR r : reExpSprt05.down0()) {
				Srch01_DtlOperR addR = Srch01_DtlOperR.create();
				if (isNull(r.oper_inst_no())) {
					// 工程指図ＮＯがnullの場合は再展開結果をそのまま設定（紐つけNOは必ず設定されているため、工程指図NOで判断する）
					copy(addR, r, createMap_Srch01_DtlOperR_ReExp_Sprt05_RsltOperR());
				}
				else {
					addR = _operL.getFirst(idxKey, r.peg_no()).clone();
					if (r.upd_flg()) {
						// 再展開実施対象となった場合、テーブルの値に再展開結果を上書き
						copy(addR, r, createMap_Srch01_DtlOperR_ReExp_Sprt05_RsltOperR());
					}
					else {
						// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
						addR.setAttributes(r);
					}
				}
				down0().add(addR);
			}
			
			// 出来高
			down3().addAll(setSubOpeDownYield(_yieldL, reExpSprt05.down1()));
			// 投入
			down1().addAll(setSubOpeDownInpt(_inptL, reExpSprt05.down2()));
			// 工数
			down2().addAll(setSubOpeDownWk(_wkL, reExpSprt05.down4()));
			// 副産品
			down4().addAll(setSubOpeDownByProd(_byProdL, reExpSprt05.down3()));
		}
		
		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			doCompTime(down0(), false);

			// 下り電文の対象工程ＦＬＧにTrueをセットする。
			for (Srch01_DtlOperR r : down0()) {
				if (MAC_MFG_INST_UNIT_TYP.isITM(up0().mfg_inst_unit_typ())) {
					r.tgt_oper_flg(true);
				}
			}
			for (Srch01_DtlInptR r : down1()) {
				// 工程指図の件数はそこまで多くないことが想定されるためindexkeyは使用していない
				Srch01_DtlOperR operR = down0().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlWkR r : down2()) {
				Srch01_DtlOperR operR = down0().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlYieldR r : down3()) {
				Srch01_DtlOperR operR = down0().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlByProdR r : down4()) {
				Srch01_DtlOperR operR = down0().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}

			// 投入データの編集
			editInptCmn(down1());
			
			doCompStrLnNoneFlg(down0());
			doCompStrLnNoneFlg(down1());
			doCompStrLnNoneFlg(down3());
			doCompStrLnNoneFlg(down4());
		}
	}

	/**
	 * 再展開結果から出来高の下り電文を設定（Sprt02とSprt03で使用）
	 */
	protected MCList<Srch01_DtlYieldR> setSubOpeDownYield(MCList<Srch01_DtlYieldR> tblL, MCList<ReExp_Sprt03_RsltYieldR> rsltL) {
		MCIndexKey idxKey = tblL.createIndex(Srch01_DtlYieldR.$peg_no);
		MCList<Srch01_DtlYieldR> downL = MCList.create(Srch01_DtlYieldR.class);
		
		MCIndexKey operOderIdxKey = tblL.createIndex(Srch01_DtlYieldR.$oper_peg_no);
		for (ReExp_Sprt03_RsltYieldR r : rsltL) {
			// 紐付けＮＯがnullの場合は再展開結果をそのまま設定。null以外の場合はテーブルから設定し、数値、日付項目のみ再展開結果から設定
			Srch01_DtlYieldR addR = Srch01_DtlYieldR.create();

			if (isNull(r.peg_no())) {
				if (tblL.isEmpty()) {
					copy(addR, r, createMap_Srch01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
				}
				else {
					// 登録済みの下り電文に設定されている同一工程行NOのデータに着手中または完了の行データが存在するかチェック
					String sts = (String)tblL.subList(operOderIdxKey, r.oper_peg_no()).max(Srch01_DtlYieldR.$mfg_sts_typ);
					if (!MSC_MFG_STS_TYP.isSTT(sts) &&
							!MSC_MFG_STS_TYP.isCMPL(sts)) {
						copy(addR, r, createMap_Srch01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
					}
				}
			}
			else {
				addR = tblL.getFirst(idxKey, r.peg_no()).clone();
				String sts = (String)tblL.subList(operOderIdxKey, r.oper_peg_no()).max(Srch01_DtlYieldR.$mfg_sts_typ);
				if (!MSC_MFG_STS_TYP.isSTT(sts) &&
						!MSC_MFG_STS_TYP.isCMPL(sts)) {
					// 登録済みの下り電文に設定されている同一工程行NOのデータに着手中または完了の行データが存在しない場合のみ
					addR.setAttributes(r);
					addR.trd_unit_yield_qty(r.trd_unit_qty());
					addR.base_unit_yield_qty(r.base_unit_qty());
					addR.schd_dt(r.yield_schd_dt());
					doCompTime(addR, false);
				}
			}
			if (!addR.isEmpty()) {
				downL.add(addR);
			}
		}
		return downL;
	}
	
	/**
	 * 再展開結果から投入の下り電文を設定（Sprt02とSprt03で使用）
	 */
	protected MCList<Srch01_DtlInptR> setSubOpeDownInpt(MCList<Srch01_DtlInptR> tblL, MCList<ReExp_Sprt01_RsltInptR> rsltL) {

		MCIndexKey idxKey = tblL.createIndex(Srch01_DtlInptR.$peg_no);
		MCList<Srch01_DtlInptR> downL = MCList.create(Srch01_DtlInptR.class);

		// 代替品目指定された品目が存在する代替グループのリストを作成
		MCList<Srch01_DtlInptR> altL = getExistsFixedItmAltGrpL(tblL);
		MCIndexKey altKey = altL.createIndex(Srch01_DtlInptR.$alt_grp_cd, Srch01_DtlInptR.$alt_grp_seq);
		
		for (ReExp_Sprt01_RsltInptR r : rsltL) {
			Srch01_DtlInptR addR = Srch01_DtlInptR.create();
			if (isNull(r.peg_no())) {
				// 紐付けＮＯがnullの場合は再展開結果をそのまま設定
				copy(addR, r, createMap_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Ins());
			}
			else {
				// 紐付けＮＯがnull以外の場合
				addR = tblL.getFirst(idxKey, r.peg_no()).clone();
				if (r.re_exp_flg()) {
					// 再展開実施対象となった場合
					if (isNotFixedAltItm(addR, altL, altKey)) {
						// 代替品目指定されたレコードが存在する代替グループで、自分自身の代替品目指定がオフの場合は何もしない
						// ただし再展開結果として削除されている場合は削除ステータスにしたいので、属性値のみコピーする
						if (r.isStatusDelete()) {
							addR.setAttributes(r);
						}
						// 代替品目指定がオフの場合でも、代替グループ連番が変わっていればその値のみ上書き
						else if (isAltGrpSeqChanged(r, tblL.getFirst(idxKey, r.peg_no()))) {
							copy(addR, r, createMap_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd_AltGrpSeq());
						}
					}
					else {
						// 上記以外の場合、テーブルの値に再展開結果を上書き
						copy(addR, r, createMap_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd());
					}
				}
				else {
					// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
					addR.setAttributes(r);
				}
				doCompTime(addR, false);
			}
			// 再展開結果の引当制御区分が「引当対象外」の場合は、引当フラグは常にオフにする。
			if (MAC_ALLOC_CTL_TYP.isNO_ALLOC(addR.alloc_ctl_typ())) {
				addR.alloc_flg(false);
			}
			downL.add(addR);
		}
		return downL;
	}
	
	/**
	 * 再展開結果から工数の下り電文を設定（Sprt02とSprt03で使用）
	 */
	protected MCList<Srch01_DtlWkR> setSubOpeDownWk(MCList<Srch01_DtlWkR> tblL, MCList<ReExp_Sprt02_RsltWkR> rsltL) {

		MCIndexKey idxKey = tblL.createIndex(Srch01_DtlWkR.$peg_no);
		MCList<Srch01_DtlWkR> downL = MCList.create(Srch01_DtlWkR.class);
		
		for (ReExp_Sprt02_RsltWkR r : rsltL) {
			Srch01_DtlWkR addR = Srch01_DtlWkR.create();
			if (isNull(r.peg_no())) {
				// 紐付けＮＯがnullの場合は再展開結果をそのまま設定
				copy(addR, r, createMap_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Ins());
			}
			else {
				// 紐付けＮＯがnull以外の場合
				addR = tblL.getFirst(idxKey, r.peg_no()).clone();
				if (r.re_exp_flg()) {
					// 再展開実施対象となった場合、テーブルの値に再展開結果を上書き
					copy(addR, r, createMap_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd());
				}
				else {
					// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
					addR.setAttributes(r);
				}
			}
			downL.add(addR);
		}
		return downL;
	}

	/**
	 * 再展開結果から副産品の下り電文を設定（Sprt02とSprt03で使用）
	 */
	protected MCList<Srch01_DtlByProdR> setSubOpeDownByProd(MCList<Srch01_DtlByProdR> tblL, MCList<ReExp_Sprt01_RsltByProdR> rsltL) {

		MCIndexKey idxKey = tblL.createIndex(Srch01_DtlByProdR.$peg_no);
		MCList<Srch01_DtlByProdR> downL = MCList.create(Srch01_DtlByProdR.class);
		
		for (ReExp_Sprt01_RsltByProdR r : rsltL) {
			Srch01_DtlByProdR addR = Srch01_DtlByProdR.create();
			if (isNull(r.peg_no())) {
				// 紐付けＮＯがnullの場合は再展開結果をそのまま設定
				copy(addR, r, createMap_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Ins());
			}
			else {
				// 紐付けＮＯがnull以外の場合
				addR = tblL.getFirst(idxKey, r.peg_no()).clone();
				if (r.re_exp_flg()) {
					// 再展開実施対象となった場合、テーブルの値に再展開結果を上書き
					copy(addR, r, createMap_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd());
				}
				else {
					// 再展開実施対象外となった場合、属性値のみコピー（Rowステータスを設定）
					addR.setAttributes(r);
					doCompTime(addR, false);
				}
			}
			downL.add(addR);
		}
		return downL;
	}
	
	/**
	 * 代替品目指定された品目が存在する代替グループのリストを作成
	 * @param tblL
	 * @return
	 */
	protected MCList<Srch01_DtlInptR> getExistsFixedItmAltGrpL(MCList<Srch01_DtlInptR> tblL) {
		MCList<Srch01_DtlInptR> retL = MCList.create(Srch01_DtlInptR.class);
		
		// 代替品目指定フラグがオンのレコードのみを抽出
		MCList<Srch01_DtlInptR> fixL = tblL.subList(Srch01_DtlInptR.$alt_itm_fix_flg, true);

		// 代替グループＣＤ、代替グループ連番でグループ化
		if (!fixL.isEmpty()) {
			retL = fixL.groupBy(Srch01_DtlInptR.$alt_grp_cd,
					Srch01_DtlInptR.$alt_grp_seq);
		}
		
		return retL;
	}

	/**
	 * 代替品目指定されたレコードが存在する代替グループかつ自分自身の代替品目指定がオフの場合にtrueを返す
	 * @param r
	 * @param altL
	 * @param altKey
	 * @return
	 */
	protected boolean isNotFixedAltItm(Srch01_DtlInptR r, MCList<Srch01_DtlInptR> altL, MCIndexKey altKey) {
		// 代替品目指定がオンの場合はfalse
		if (r.alt_itm_fix_flg()) {
			return false;
		}
		// 代替品目指定された代替のリストが存在しない場合はfalse
		if (altL.isEmpty()) {
			return false;
		}
		// 代替グループＣＤ、代替グループ連番でaltLを参照し、存在しない場合はfalse
		Srch01_DtlInptR altR = altL.getFirst(altKey, r.alt_grp_cd(), r.alt_grp_seq());
		if (isNull(altR)) {
			return false;
		}
		// 上記に該当しなければtrue
		return true;
	}
	
	/**
	 * 再展開前後の代替グループ連番を比較し、異なっている場合はTRUEを返す
	 * @param rsltR 再展開後（展開結果）
	 * @param tblR 再展開前（投入予定テーブル）
	 * @return 異なっている場合はTRUE
	 */
	protected boolean isAltGrpSeqChanged(ReExp_Sprt01_RsltInptR rsltR, Srch01_DtlInptR tblR) {
		if (!rsltR.isStatusModify()) {
			// 更新でなければfalse
			return false;
		}
		if (isSame(rsltR.alt_grp_seq(), tblR.alt_grp_seq())) {
			// 値が同じであればfalse
			return false;
		}
		return true;
	}
	
	/**
	 * 出来高予定のテーブルから製造再展開サービスへのマッピング（Sprt02とSprt03で使用）
	 * @return
	 */
	protected Map_ReExp_Sprt03_DtlYieldR_Srch01_DtlYieldR<ReExp_Sprt03_DtlYieldR,Srch01_DtlYieldR> createMap_ReExp_Sprt03_DtlYieldR_Srch01_DtlYieldR() {
		return new Map_ReExp_Sprt03_DtlYieldR_Srch01_DtlYieldR<ReExp_Sprt03_DtlYieldR, Srch01_DtlYieldR>();
	}

	public class Map_ReExp_Sprt03_DtlYieldR_Srch01_DtlYieldR<D extends ReExp_Sprt03_DtlYieldR, S extends Srch01_DtlYieldR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$peg_no, Srch01_DtlYieldR.$peg_no);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$oper_peg_no, Srch01_DtlYieldR.$oper_peg_no);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$yield_schd_no, Srch01_DtlYieldR.$yield_schd_no);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$mfg_inst_no, Srch01_DtlYieldR.$mfg_inst_no);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$oper_inst_no, Srch01_DtlYieldR.$oper_inst_no);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$base_unit_qty, Srch01_DtlYieldR.$base_unit_yield_qty);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$trd_unit_qty, Srch01_DtlYieldR.$trd_unit_yield_qty);
			addColumnPathMap(ReExp_Sprt03_DtlYieldR.$yield_schd_dt, Srch01_DtlYieldR.$schd_dt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(MCNumber.ONE); //単票画面は１固定
		}
	}

	/**
	 * 投入予定のテーブルから製造再展開へのマッピング（Sprt02とSprt03で使用）
	 * @return
	 */
	protected Map_ReExp_Sprt01_DtlInptR_Srch01_DtlInptR<ReExp_Sprt01_DtlInptR,Srch01_DtlInptR> createMap_ReExp_Sprt01_DtlInptR_Srch01_DtlInptR() {
		return new Map_ReExp_Sprt01_DtlInptR_Srch01_DtlInptR<ReExp_Sprt01_DtlInptR, Srch01_DtlInptR>();
	}

	public class Map_ReExp_Sprt01_DtlInptR_Srch01_DtlInptR<D extends ReExp_Sprt01_DtlInptR, S extends Srch01_DtlInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$peg_no, Srch01_DtlInptR.$peg_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$oper_peg_no, Srch01_DtlInptR.$oper_peg_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$inpt_schd_no, Srch01_DtlInptR.$inpt_schd_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$mfg_inst_no, Srch01_DtlInptR.$mfg_inst_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$oper_inst_no, Srch01_DtlInptR.$oper_inst_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$alt_grp_cd, Srch01_DtlInptR.$alt_grp_cd);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$alt_grp_seq, Srch01_DtlInptR.$alt_grp_seq);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$alt_qty, Srch01_DtlInptR.$base_unit_alt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_cd, Srch01_DtlInptR.$itm_cd);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_sub1, Srch01_DtlInptR.$itm_sub1);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_sub2, Srch01_DtlInptR.$itm_sub2);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_sub3, Srch01_DtlInptR.$itm_sub3);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$inpt_qty, Srch01_DtlInptR.$base_unit_inpt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$rqmt_qty, Srch01_DtlInptR.$base_unit_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$fxd_rqmt_qty, Srch01_DtlInptR.$base_unit_fxd_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$total_rqmt_qty, Srch01_DtlInptR.$base_unit_sum_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$cont_inpt_qty, Srch01_DtlInptR.$cont_inpt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$cont_rqmt_qty, Srch01_DtlInptR.$cont_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$cont_fxd_rqmt_qty, Srch01_DtlInptR.$cont_fxd_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$sum_cont_rqmt_qty, Srch01_DtlInptR.$sum_cont_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$ver_no, Srch01_DtlInptR.$ver_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$itm_seq, Srch01_DtlInptR.$chd_itm_seq);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$in_offst_typ, Srch01_DtlInptR.$in_offst_typ);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$in_offst, Srch01_DtlInptR.$in_offst);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$par_inst_qty, Srch01_DtlInptR.$par_inst_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$chd_inpt_qty, Srch01_DtlInptR.$chd_inpt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$chd_rqmt_qty, Srch01_DtlInptR.$chd_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$fxd_chd_rqmt_qty, Srch01_DtlInptR.$fxd_chd_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$oper_cd, Srch01_DtlInptR.$oper_cd);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$oper_seq, Srch01_DtlInptR.$oper_seq);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$alloc_flg, Srch01_DtlInptR.$alloc_flg);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$lot_no, Srch01_DtlInptR.$lot_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$sublot_no, Srch01_DtlInptR.$sublot_no);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$act_cont_fctr, Srch01_DtlInptR.$act_cont_fctr);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$first_gr_dt, Srch01_DtlInptR.$first_gr_dt);
			addColumnPathMap(ReExp_Sprt01_DtlInptR.$lot_seq, Srch01_DtlInptR.$lot_seq);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(MCNumber.ONE); //単票画面は１固定
		}
	}

	/**
	 * 出来高予定（副産品）のテーブルから製造再展開サービスへのマッピング（Sprt02とSprt03で使用）
	 * @return
	 */
	protected Map_ReExp_Sprt01_DtlByProdR_Srch01_DtlByProdR<ReExp_Sprt01_DtlByProdR,Srch01_DtlByProdR> createMap_ReExp_Sprt01_DtlByProdR_Srch01_DtlByProdR() {
		return new Map_ReExp_Sprt01_DtlByProdR_Srch01_DtlByProdR<ReExp_Sprt01_DtlByProdR, Srch01_DtlByProdR>();
	}

	public class Map_ReExp_Sprt01_DtlByProdR_Srch01_DtlByProdR<D extends ReExp_Sprt01_DtlByProdR, S extends Srch01_DtlByProdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$peg_no, Srch01_DtlByProdR.$peg_no);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$oper_peg_no, Srch01_DtlByProdR.$oper_peg_no);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$yield_schd_no, Srch01_DtlByProdR.$yield_schd_no);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$mfg_inst_no, Srch01_DtlByProdR.$mfg_inst_no);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$oper_inst_no, Srch01_DtlByProdR.$oper_inst_no);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$disp_seq, Srch01_DtlByProdR.$disp_seq);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_cd, Srch01_DtlByProdR.$itm_cd);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_sub1, Srch01_DtlByProdR.$itm_sub1);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_sub2, Srch01_DtlByProdR.$itm_sub2);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$itm_sub3, Srch01_DtlByProdR.$itm_sub3);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$par_inst_qty, Srch01_DtlByProdR.$par_inst_qty);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$chd_inpt_qty, Srch01_DtlByProdR.$chd_inpt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$chd_rqmt_qty, Srch01_DtlByProdR.$chd_rqmt_qty);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$oper_cd, Srch01_DtlByProdR.$oper_cd);
			addColumnPathMap(ReExp_Sprt01_DtlByProdR.$oper_seq, Srch01_DtlByProdR.$oper_seq);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(MCNumber.ONE); //単票画面は１固定
		}
	}

	/**
	 * 工数予定のテーブルから製造再展開サービスへのマッピング（Sprt02とSprt03で使用）
	 * @return
	 */
	protected Map_ReExp_Sprt02_DtlWkR_Srch01_DtlWkR<ReExp_Sprt02_DtlWkR,Srch01_DtlWkR> createMap_ReExp_Sprt02_DtlWkR_Srch01_DtlWkR() {
		return new Map_ReExp_Sprt02_DtlWkR_Srch01_DtlWkR<ReExp_Sprt02_DtlWkR, Srch01_DtlWkR>();
	}

	public class Map_ReExp_Sprt02_DtlWkR_Srch01_DtlWkR<D extends ReExp_Sprt02_DtlWkR, S extends Srch01_DtlWkR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$peg_no, Srch01_DtlWkR.$peg_no);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$oper_peg_no, Srch01_DtlWkR.$oper_peg_no);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$wk_schd_no, Srch01_DtlWkR.$wk_schd_no);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$mfg_inst_no, Srch01_DtlWkR.$mfg_inst_no);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$oper_inst_no, Srch01_DtlWkR.$oper_inst_no);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$wk_cost_cd, Srch01_DtlWkR.$wk_cost_cd);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$mst_wk_cost, Srch01_DtlWkR.$mst_wk_cost);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$mst_fxd_wk_cost, Srch01_DtlWkR.$mst_fxd_wk_cost);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$oper_cd, Srch01_DtlWkR.$oper_cd);
			addColumnPathMap(ReExp_Sprt02_DtlWkR.$oper_seq, Srch01_DtlWkR.$oper_seq);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(MCNumber.ONE); //単票画面は１固定
		}
	}

	protected Map_Srch01_DtlYieldR_ReExp_Sprt03_RsltYieldR<Srch01_DtlYieldR,ReExp_Sprt03_RsltYieldR> createMap_Srch01_DtlYieldR_ReExp_Sprt03_RsltYieldR() {
		return new Map_Srch01_DtlYieldR_ReExp_Sprt03_RsltYieldR<Srch01_DtlYieldR, ReExp_Sprt03_RsltYieldR>();
	}

	public class Map_Srch01_DtlYieldR_ReExp_Sprt03_RsltYieldR<D extends Srch01_DtlYieldR, S extends ReExp_Sprt03_RsltYieldR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlYieldR.$peg_no, ReExp_Sprt03_RsltYieldR.$peg_no);
			addColumnPathMap(Srch01_DtlYieldR.$oper_peg_no, ReExp_Sprt03_RsltYieldR.$oper_peg_no);
			addColumnPathMap(Srch01_DtlYieldR.$trd_unit_cd, ReExp_Sprt03_RsltYieldR.$trd_unit_cd);
			addColumnPathMap(Srch01_DtlYieldR.$trd_unit_nm, ReExp_Sprt03_RsltYieldR.$trd_unit_nm);
			addColumnPathMap(Srch01_DtlYieldR.$trd_unit_yield_qty, ReExp_Sprt03_RsltYieldR.$trd_unit_qty);
			addColumnPathMap(Srch01_DtlYieldR.$trd_unit_dec_place, ReExp_Sprt03_RsltYieldR.$trd_dec_place);
			addColumnPathMap(Srch01_DtlYieldR.$base_unit_conv_rnd_typ, ReExp_Sprt03_RsltYieldR.$base_unit_conv_rnd_typ);
			addColumnPathMap(Srch01_DtlYieldR.$conv_base_qty, ReExp_Sprt03_RsltYieldR.$conv_base_qty);
			addColumnPathMap(Srch01_DtlYieldR.$conv_qty, ReExp_Sprt03_RsltYieldR.$conv_qty);
			addColumnPathMap(Srch01_DtlYieldR.$base_unit_cd, ReExp_Sprt03_RsltYieldR.$base_unit_cd);
			addColumnPathMap(Srch01_DtlYieldR.$base_unit_nm, ReExp_Sprt03_RsltYieldR.$base_unit_nm);
			addColumnPathMap(Srch01_DtlYieldR.$base_unit_yield_qty, ReExp_Sprt03_RsltYieldR.$base_unit_qty);
			addColumnPathMap(Srch01_DtlYieldR.$base_unit_dec_place, ReExp_Sprt03_RsltYieldR.$base_dec_place);
			addColumnPathMap(Srch01_DtlYieldR.$schd_dt, ReExp_Sprt03_RsltYieldR.$yield_schd_dt);
			addColumnPathMap(Srch01_DtlYieldR.$strg_loc_cd, ReExp_Sprt03_RsltYieldR.$strg_loc_cd);
			addColumnPathMap(Srch01_DtlYieldR.$strg_loc_nm, ReExp_Sprt03_RsltYieldR.$strg_loc_nm);
			addColumnPathMap(Srch01_DtlYieldR.$strg_str_ln_tgt_flg, ReExp_Sprt03_RsltYieldR.$strg_str_ln_tgt_flg);
			addColumnPathMap(Srch01_DtlYieldR.$strg_str_ln_cd, ReExp_Sprt03_RsltYieldR.$strg_str_ln_cd);
			addColumnPathMap(Srch01_DtlYieldR.$strg_str_ln_nm, ReExp_Sprt03_RsltYieldR.$strg_str_ln_nm);
			addColumnPathMap(Srch01_DtlYieldR.$strg_str_ln_cd_none_flg, ReExp_Sprt03_RsltYieldR.$strg_str_ln_cd_none_flg);
			addColumnPathMap(Srch01_DtlYieldR.$yield_schd_no, ReExp_Sprt03_RsltYieldR.$yield_schd_no);
			addColumnPathMap(Srch01_DtlYieldR.$mfg_inst_no, ReExp_Sprt03_RsltYieldR.$mfg_inst_no);
			addColumnPathMap(Srch01_DtlYieldR.$oper_inst_no, ReExp_Sprt03_RsltYieldR.$oper_inst_no);
			addColumnPathMap(Srch01_DtlYieldR.$disp_seq, ReExp_Sprt03_RsltYieldR.$disp_seq);
		}
	}

	protected Map_Srch01_DtlOperR_ReExp_Sprt05_RsltOperR<Srch01_DtlOperR,ReExp_Sprt05_RsltOperR> createMap_Srch01_DtlOperR_ReExp_Sprt05_RsltOperR() {
		return new Map_Srch01_DtlOperR_ReExp_Sprt05_RsltOperR<Srch01_DtlOperR, ReExp_Sprt05_RsltOperR>();
	}

	public class Map_Srch01_DtlOperR_ReExp_Sprt05_RsltOperR<D extends Srch01_DtlOperR, S extends ReExp_Sprt05_RsltOperR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlOperR.$peg_no, ReExp_Sprt05_RsltOperR.$peg_no);
			addColumnPathMap(Srch01_DtlOperR.$oper_cd, ReExp_Sprt05_RsltOperR.$oper_cd);
			addColumnPathMap(Srch01_DtlOperR.$oper_nm, ReExp_Sprt05_RsltOperR.$oper_nm);
			addColumnPathMap(Srch01_DtlOperR.$oper_seq, ReExp_Sprt05_RsltOperR.$oper_seq);
			addColumnPathMap(Srch01_DtlOperR.$st_schd_dt, ReExp_Sprt05_RsltOperR.$st_schd_tm);
			addColumnPathMap(Srch01_DtlOperR.$st_schd_hm, ReExp_Sprt05_RsltOperR.$st_schd_tm);
			addColumnPathMap(Srch01_DtlOperR.$end_schd_dt, ReExp_Sprt05_RsltOperR.$end_schd_tm);
			addColumnPathMap(Srch01_DtlOperR.$end_schd_hm, ReExp_Sprt05_RsltOperR.$end_schd_tm);
			addColumnPathMap(Srch01_DtlOperR.$base_unit_qty, ReExp_Sprt05_RsltOperR.$base_unit_qty);
			addColumnPathMap(Srch01_DtlOperR.$base_unit_cd, ReExp_Sprt05_RsltOperR.$base_unit_cd);
			addColumnPathMap(Srch01_DtlOperR.$base_unit_nm, ReExp_Sprt05_RsltOperR.$base_unit_nm);
			addColumnPathMap(Srch01_DtlOperR.$base_unit_dec_place, ReExp_Sprt05_RsltOperR.$base_unit_dec_place);
			addColumnPathMap(Srch01_DtlOperR.$oper_unit_qty, ReExp_Sprt05_RsltOperR.$oper_unit_qty);
			addColumnPathMap(Srch01_DtlOperR.$oper_std_qty, ReExp_Sprt05_RsltOperR.$oper_std_qty);
			addColumnPathMap(Srch01_DtlOperR.$oper_conv_qty, ReExp_Sprt05_RsltOperR.$oper_conv_qty);
			addColumnPathMap(Srch01_DtlOperR.$oper_unit_conv_rnd_typ, ReExp_Sprt05_RsltOperR.$unit_conv_rnd_typ);
			addColumnPathMap(Srch01_DtlOperR.$oper_unit_dec_place, ReExp_Sprt05_RsltOperR.$dec_place);
			addColumnPathMap(Srch01_DtlOperR.$oper_unit_cd, ReExp_Sprt05_RsltOperR.$oper_unit_cd);
			addColumnPathMap(Srch01_DtlOperR.$oper_unit_nm, ReExp_Sprt05_RsltOperR.$oper_unit_nm);
			addColumnPathMap(Srch01_DtlOperR.$oper_loc_cd, ReExp_Sprt05_RsltOperR.$oper_loc_cd);
			addColumnPathMap(Srch01_DtlOperR.$oper_loc_nm, ReExp_Sprt05_RsltOperR.$oper_loc_nm);
			addColumnPathMap(Srch01_DtlOperR.$oper_str_ln_tgt_flg, ReExp_Sprt05_RsltOperR.$oper_str_ln_tgt_flg);
			addColumnPathMap(Srch01_DtlOperR.$oper_str_ln_cd, ReExp_Sprt05_RsltOperR.$oper_str_ln_cd);
			addColumnPathMap(Srch01_DtlOperR.$oper_str_ln_nm, ReExp_Sprt05_RsltOperR.$oper_str_ln_nm);
			addColumnPathMap(Srch01_DtlOperR.$oper_str_ln_cd_none_flg, ReExp_Sprt05_RsltOperR.$oper_str_ln_cd_none_flg);
			addColumnPathMap(Srch01_DtlOperR.$oper_lower_yield, ReExp_Sprt05_RsltOperR.$oper_lower_yield);
			addColumnPathMap(Srch01_DtlOperR.$oper_std_yield, ReExp_Sprt05_RsltOperR.$oper_std_yield);
			addColumnPathMap(Srch01_DtlOperR.$oper_upper_yield, ReExp_Sprt05_RsltOperR.$oper_upper_yield);
			addColumnPathMap(Srch01_DtlOperR.$disp_seq, ReExp_Sprt05_RsltOperR.$disp_seq);
			addColumnPathMap(Srch01_DtlOperR.$bkf_flg, ReExp_Sprt05_RsltOperR.$bkf_flg);
			addColumnPathMap(Srch01_DtlOperR.$wk_cost_calc_flg, ReExp_Sprt05_RsltOperR.$wk_cost_calc_flg);
			addColumnPathMap(Srch01_DtlOperR.$oper_inst_grp, ReExp_Sprt05_RsltOperR.$oper_inst_grp);
			addColumnPathMap(Srch01_DtlOperR.$oper_ord_no, ReExp_Sprt05_RsltOperR.$oper_ord_no);
			addColumnPathMap(Srch01_DtlOperR.$mfg_inst_no, ReExp_Sprt05_RsltOperR.$mfg_inst_no);
			addColumnPathMap(Srch01_DtlOperR.$oper_inst_no, ReExp_Sprt05_RsltOperR.$oper_inst_no);
			addColumnPathMap(Srch01_DtlOperR.$yield_oper_flg, ReExp_Sprt05_RsltOperR.$yield_oper_flg);
			addColumnPathMap(Srch01_DtlOperR.$yield_oper_ratio, ReExp_Sprt05_RsltOperR.$yield_oper_ratio);
			addColumnPathMap(Srch01_DtlOperR.$oper_ptn, ReExp_Sprt05_RsltOperR.$oper_ptn);
			addColumnPathMap(Srch01_DtlOperR.$oper_lt, ReExp_Sprt05_RsltOperR.$oper_lt);
			addColumnPathMap(Srch01_DtlOperR.$oper_lt_add_qty, ReExp_Sprt05_RsltOperR.$oper_lt_add_qty);
			addColumnPathMap(Srch01_DtlOperR.$oper_offst_typ, ReExp_Sprt05_RsltOperR.$oper_offst_typ);
			addColumnPathMap(Srch01_DtlOperR.$oper_offst, ReExp_Sprt05_RsltOperR.$oper_offst);
			addColumnPathMap(Srch01_DtlOperR.$oper_offst_add_qty, ReExp_Sprt05_RsltOperR.$oper_offst_add_qty);
		}
	}

	protected Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Ins<Srch01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Ins() {
		return new Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Ins<Srch01_DtlInptR, ReExp_Sprt01_RsltInptR>();
	}

	public class Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Ins<D extends Srch01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlInptR.$peg_no, ReExp_Sprt01_RsltInptR.$peg_no);
			addColumnPathMap(Srch01_DtlInptR.$oper_peg_no, ReExp_Sprt01_RsltInptR.$oper_peg_no);
			addColumnPathMap(Srch01_DtlInptR.$th_image, ReExp_Sprt01_RsltInptR.$th_image);
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_nm, ReExp_Sprt01_RsltInptR.$alt_grp_nm);
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
			addColumnPathMap(Srch01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
			addColumnPathMap(Srch01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
			addColumnPathMap(Srch01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
			addColumnPathMap(Srch01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
			addColumnPathMap(Srch01_DtlInptR.$itm_nm, ReExp_Sprt01_RsltInptR.$itm_nm);
			addColumnPathMap(Srch01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
			addColumnPathMap(Srch01_DtlInptR.$ver_flg, ReExp_Sprt01_RsltInptR.$ver_flg);
			addColumnPathMap(Srch01_DtlInptR.$lot_mng_typ, ReExp_Sprt01_RsltInptR.$lot_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sublot_mng_typ, ReExp_Sprt01_RsltInptR.$sublot_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno1_mng_typ, ReExp_Sprt01_RsltInptR.$sno1_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno2_mng_typ, ReExp_Sprt01_RsltInptR.$sno2_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno3_mng_typ, ReExp_Sprt01_RsltInptR.$sno3_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno4_mng_typ, ReExp_Sprt01_RsltInptR.$sno4_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_alt_qty, ReExp_Sprt01_RsltInptR.$alt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_inpt_qty, ReExp_Sprt01_RsltInptR.$inpt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_rqmt_qty, ReExp_Sprt01_RsltInptR.$rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_sum_rqmt_qty, ReExp_Sprt01_RsltInptR.$total_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_nm, ReExp_Sprt01_RsltInptR.$base_unit_nm);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_dec_place, ReExp_Sprt01_RsltInptR.$base_dec_place);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_rnd_typ, ReExp_Sprt01_RsltInptR.$base_unit_conv_rnd_typ);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_flg, ReExp_Sprt01_RsltInptR.$cont_fctr_flg);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_rnd_typ, ReExp_Sprt01_RsltInptR.$cont_fctr_rnd_typ);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_dec_place, ReExp_Sprt01_RsltInptR.$cont_fctr_dec_place);
			addColumnPathMap(Srch01_DtlInptR.$act_cont_fctr, ReExp_Sprt01_RsltInptR.$act_cont_fctr);
			addColumnPathMap(Srch01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
			addColumnPathMap(Srch01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$sum_cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$sum_cont_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_unit_cd, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_unit_nm, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_nm);
			addColumnPathMap(Srch01_DtlInptR.$std_cont_fctr, ReExp_Sprt01_RsltInptR.$std_cont_fctr);
			addColumnPathMap(Srch01_DtlInptR.$oper_cd, ReExp_Sprt01_RsltInptR.$oper_cd);
			addColumnPathMap(Srch01_DtlInptR.$oper_seq, ReExp_Sprt01_RsltInptR.$oper_seq);
			addColumnPathMap(Srch01_DtlInptR.$schd_dt, ReExp_Sprt01_RsltInptR.$inpt_schd_dt);
			addColumnPathMap(Srch01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
			addColumnPathMap(Srch01_DtlInptR.$lot_no, ReExp_Sprt01_RsltInptR.$lot_no);
			addColumnPathMap(Srch01_DtlInptR.$sublot_no, ReExp_Sprt01_RsltInptR.$sublot_no);
			addColumnPathMap(Srch01_DtlInptR.$first_gr_dt, ReExp_Sprt01_RsltInptR.$first_gr_dt);
			addColumnPathMap(Srch01_DtlInptR.$lot_seq, ReExp_Sprt01_RsltInptR.$lot_seq);
			addColumnPathMap(Srch01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
			addColumnPathMap(Srch01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
			addColumnPathMap(Srch01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
			addColumnPathMap(Srch01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
			addColumnPathMap(Srch01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
			addColumnPathMap(Srch01_DtlInptR.$inpt_loc_nm, ReExp_Sprt01_RsltInptR.$inpt_loc_nm);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_tgt_flg, ReExp_Sprt01_RsltInptR.$inpt_str_ln_tgt_flg);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_nm, ReExp_Sprt01_RsltInptR.$inpt_str_ln_nm);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_cd_none_flg, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd_none_flg);
			addColumnPathMap(Srch01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
			addColumnPathMap(Srch01_DtlInptR.$gd_nm, ReExp_Sprt01_RsltInptR.$gd_nm);
			addColumnPathMap(Srch01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
			addColumnPathMap(Srch01_DtlInptR.$bkf_typ_nm, ReExp_Sprt01_RsltInptR.$bkf_typ_nm);
			addColumnPathMap(Srch01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
			addColumnPathMap(Srch01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
			addColumnPathMap(Srch01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
			addColumnPathMap(Srch01_DtlInptR.$bom_id_no, ReExp_Sprt01_RsltInptR.$bom_id);
			addColumnPathMap(Srch01_DtlInptR.$chd_itm_seq, ReExp_Sprt01_RsltInptR.$itm_seq);
			addColumnPathMap(Srch01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
			addColumnPathMap(Srch01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
			addColumnPathMap(Srch01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
			addColumnPathMap(Srch01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
			addColumnPathMap(Srch01_DtlInptR.$alloc_ctl_typ, ReExp_Sprt01_RsltInptR.$alloc_ctl_typ);
			addColumnPathMap(Srch01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
			addColumnPathMap(Srch01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
			addColumnPathMap(Srch01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
			addColumnPathMap(Srch01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
			addColumnPathMap(Srch01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
			addColumnPathMap(Srch01_DtlInptR.$stk_mng_typ, ReExp_Sprt01_RsltInptR.$stk_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
			addColumnPathMap(Srch01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
			addColumnPathMap(Srch01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
			addColumnPathMap(Srch01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
			addColumnPathMap(Srch01_DtlInptR.$mfg_inst_no, ReExp_Sprt01_RsltInptR.$mfg_inst_no);
			addColumnPathMap(Srch01_DtlInptR.$oper_inst_no, ReExp_Sprt01_RsltInptR.$oper_inst_no);
			addColumnPathMap(Srch01_DtlInptR.$inpt_schd_no, ReExp_Sprt01_RsltInptR.$inpt_schd_no);
			addColumnPathMap(Srch01_DtlInptR.$mfg_sts_typ, ReExp_Sprt01_RsltInptR.$mfg_sts_typ);
			addColumnPathMap(Srch01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
		}
	}

	protected Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd<Srch01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd() {
		return new Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd<Srch01_DtlInptR, ReExp_Sprt01_RsltInptR>();
	}

	public class Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd<D extends Srch01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlInptR.$th_image, ReExp_Sprt01_RsltInptR.$th_image);
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_nm, ReExp_Sprt01_RsltInptR.$alt_grp_nm);
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
			addColumnPathMap(Srch01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
			addColumnPathMap(Srch01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
			addColumnPathMap(Srch01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
			addColumnPathMap(Srch01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
			addColumnPathMap(Srch01_DtlInptR.$itm_nm, ReExp_Sprt01_RsltInptR.$itm_nm);
			addColumnPathMap(Srch01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
			addColumnPathMap(Srch01_DtlInptR.$ver_flg, ReExp_Sprt01_RsltInptR.$ver_flg);
			addColumnPathMap(Srch01_DtlInptR.$lot_mng_typ, ReExp_Sprt01_RsltInptR.$lot_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sublot_mng_typ, ReExp_Sprt01_RsltInptR.$sublot_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno1_mng_typ, ReExp_Sprt01_RsltInptR.$sno1_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno2_mng_typ, ReExp_Sprt01_RsltInptR.$sno2_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno3_mng_typ, ReExp_Sprt01_RsltInptR.$sno3_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$sno4_mng_typ, ReExp_Sprt01_RsltInptR.$sno4_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_alt_qty, ReExp_Sprt01_RsltInptR.$alt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_inpt_qty, ReExp_Sprt01_RsltInptR.$inpt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_rqmt_qty, ReExp_Sprt01_RsltInptR.$rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_sum_rqmt_qty, ReExp_Sprt01_RsltInptR.$total_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_nm, ReExp_Sprt01_RsltInptR.$base_unit_nm);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_dec_place, ReExp_Sprt01_RsltInptR.$base_dec_place);
			addColumnPathMap(Srch01_DtlInptR.$base_unit_rnd_typ, ReExp_Sprt01_RsltInptR.$base_unit_conv_rnd_typ);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_flg, ReExp_Sprt01_RsltInptR.$cont_fctr_flg);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_rnd_typ, ReExp_Sprt01_RsltInptR.$cont_fctr_rnd_typ);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_dec_place, ReExp_Sprt01_RsltInptR.$cont_fctr_dec_place);
			addColumnPathMap(Srch01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
			addColumnPathMap(Srch01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$sum_cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$sum_cont_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_unit_cd, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd);
			addColumnPathMap(Srch01_DtlInptR.$cont_fctr_unit_nm, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_nm);
			addColumnPathMap(Srch01_DtlInptR.$std_cont_fctr, ReExp_Sprt01_RsltInptR.$std_cont_fctr);
			addColumnPathMap(Srch01_DtlInptR.$oper_cd, ReExp_Sprt01_RsltInptR.$oper_cd);
			addColumnPathMap(Srch01_DtlInptR.$oper_seq, ReExp_Sprt01_RsltInptR.$oper_seq);
			addColumnPathMap(Srch01_DtlInptR.$schd_dt, ReExp_Sprt01_RsltInptR.$inpt_schd_dt);
			addColumnPathMap(Srch01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
			addColumnPathMap(Srch01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
			addColumnPathMap(Srch01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
			addColumnPathMap(Srch01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
			addColumnPathMap(Srch01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
			addColumnPathMap(Srch01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
			addColumnPathMap(Srch01_DtlInptR.$inpt_loc_nm, ReExp_Sprt01_RsltInptR.$inpt_loc_nm);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_tgt_flg, ReExp_Sprt01_RsltInptR.$inpt_str_ln_tgt_flg);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_nm, ReExp_Sprt01_RsltInptR.$inpt_str_ln_nm);
			addColumnPathMap(Srch01_DtlInptR.$inpt_str_ln_cd_none_flg, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd_none_flg);
			addColumnPathMap(Srch01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
			addColumnPathMap(Srch01_DtlInptR.$gd_nm, ReExp_Sprt01_RsltInptR.$gd_nm);
			addColumnPathMap(Srch01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
			addColumnPathMap(Srch01_DtlInptR.$bkf_typ_nm, ReExp_Sprt01_RsltInptR.$bkf_typ_nm);
			addColumnPathMap(Srch01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
			addColumnPathMap(Srch01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
			addColumnPathMap(Srch01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
			addColumnPathMap(Srch01_DtlInptR.$bom_id_no, ReExp_Sprt01_RsltInptR.$bom_id);
			addColumnPathMap(Srch01_DtlInptR.$chd_itm_seq, ReExp_Sprt01_RsltInptR.$itm_seq);
			addColumnPathMap(Srch01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
			addColumnPathMap(Srch01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
			addColumnPathMap(Srch01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
			addColumnPathMap(Srch01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
			addColumnPathMap(Srch01_DtlInptR.$alloc_ctl_typ, ReExp_Sprt01_RsltInptR.$alloc_ctl_typ);
			addColumnPathMap(Srch01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
			addColumnPathMap(Srch01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
			addColumnPathMap(Srch01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
			addColumnPathMap(Srch01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
			addColumnPathMap(Srch01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
			addColumnPathMap(Srch01_DtlInptR.$stk_mng_typ, ReExp_Sprt01_RsltInptR.$stk_mng_typ);
			addColumnPathMap(Srch01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
			addColumnPathMap(Srch01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
			addColumnPathMap(Srch01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
			addColumnPathMap(Srch01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
			addColumnPathMap(Srch01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
		}
	}

	protected Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd_AltGrpSeq<Srch01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd_AltGrpSeq() {
		return new Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd_AltGrpSeq<Srch01_DtlInptR, ReExp_Sprt01_RsltInptR>();
	}

	public class Map_Srch01_DtlInptR_ReExp_Sprt01_RsltInptR_Upd_AltGrpSeq<D extends Srch01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
		}
	}

	protected Map_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Ins<Srch01_DtlWkR,ReExp_Sprt02_RsltWkR> createMap_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Ins() {
		return new Map_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Ins<Srch01_DtlWkR, ReExp_Sprt02_RsltWkR>();
	}

	public class Map_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Ins<D extends Srch01_DtlWkR, S extends ReExp_Sprt02_RsltWkR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlWkR.$peg_no, ReExp_Sprt02_RsltWkR.$peg_no);
			addColumnPathMap(Srch01_DtlWkR.$oper_peg_no, ReExp_Sprt02_RsltWkR.$oper_peg_no);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_cd, ReExp_Sprt02_RsltWkR.$wk_cost_cd);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_nm, ReExp_Sprt02_RsltWkR.$wk_cost_nm);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost, ReExp_Sprt02_RsltWkR.$wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$fxd_wk_cost, ReExp_Sprt02_RsltWkR.$fxd_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$sum_wk_cost, ReExp_Sprt02_RsltWkR.$sum_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_unit_nm, ReExp_Sprt02_RsltWkR.$wk_cost_unit_nm);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_dec_place, ReExp_Sprt02_RsltWkR.$dec_place);
			addColumnPathMap(Srch01_DtlWkR.$oper_cd, ReExp_Sprt02_RsltWkR.$oper_cd);
			addColumnPathMap(Srch01_DtlWkR.$oper_nm, ReExp_Sprt02_RsltWkR.$oper_nm);
			addColumnPathMap(Srch01_DtlWkR.$oper_seq, ReExp_Sprt02_RsltWkR.$oper_seq);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_calc_flg, ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg);
			addColumnPathMap(Srch01_DtlWkR.$mst_wk_cost, ReExp_Sprt02_RsltWkR.$mst_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$mst_fxd_wk_cost, ReExp_Sprt02_RsltWkR.$mst_fxd_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$mfg_inst_no, ReExp_Sprt02_RsltWkR.$mfg_inst_no);
			addColumnPathMap(Srch01_DtlWkR.$oper_inst_no, ReExp_Sprt02_RsltWkR.$oper_inst_no);
			addColumnPathMap(Srch01_DtlWkR.$wk_schd_no, ReExp_Sprt02_RsltWkR.$wk_schd_no);
			addColumnPathMap(Srch01_DtlWkR.$disp_seq, ReExp_Sprt02_RsltWkR.$disp_seq);
		}
	}

	protected Map_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd<Srch01_DtlWkR,ReExp_Sprt02_RsltWkR> createMap_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd() {
		return new Map_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd<Srch01_DtlWkR, ReExp_Sprt02_RsltWkR>();
	}

	public class Map_Srch01_DtlWkR_ReExp_Sprt02_RsltWkR_Upd<D extends Srch01_DtlWkR, S extends ReExp_Sprt02_RsltWkR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_cd, ReExp_Sprt02_RsltWkR.$wk_cost_cd);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_nm, ReExp_Sprt02_RsltWkR.$wk_cost_nm);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost, ReExp_Sprt02_RsltWkR.$wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$fxd_wk_cost, ReExp_Sprt02_RsltWkR.$fxd_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$sum_wk_cost, ReExp_Sprt02_RsltWkR.$sum_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_unit_nm, ReExp_Sprt02_RsltWkR.$wk_cost_unit_nm);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_dec_place, ReExp_Sprt02_RsltWkR.$dec_place);
			addColumnPathMap(Srch01_DtlWkR.$oper_cd, ReExp_Sprt02_RsltWkR.$oper_cd);
			addColumnPathMap(Srch01_DtlWkR.$oper_nm, ReExp_Sprt02_RsltWkR.$oper_nm);
			addColumnPathMap(Srch01_DtlWkR.$oper_seq, ReExp_Sprt02_RsltWkR.$oper_seq);
			addColumnPathMap(Srch01_DtlWkR.$wk_cost_calc_flg, ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg);
			addColumnPathMap(Srch01_DtlWkR.$mst_wk_cost, ReExp_Sprt02_RsltWkR.$mst_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$mst_fxd_wk_cost, ReExp_Sprt02_RsltWkR.$mst_fxd_wk_cost);
			addColumnPathMap(Srch01_DtlWkR.$disp_seq, ReExp_Sprt02_RsltWkR.$disp_seq);
		}
	}

	protected Map_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Ins<Srch01_DtlByProdR,ReExp_Sprt01_RsltByProdR> createMap_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Ins() {
		return new Map_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Ins<Srch01_DtlByProdR, ReExp_Sprt01_RsltByProdR>();
	}

	public class Map_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Ins<D extends Srch01_DtlByProdR, S extends ReExp_Sprt01_RsltByProdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlByProdR.$peg_no, ReExp_Sprt01_RsltByProdR.$peg_no);
			addColumnPathMap(Srch01_DtlByProdR.$oper_peg_no, ReExp_Sprt01_RsltByProdR.$oper_peg_no);
			addColumnPathMap(Srch01_DtlByProdR.$th_image, ReExp_Sprt01_RsltByProdR.$th_image);
			addColumnPathMap(Srch01_DtlByProdR.$itm_cd, ReExp_Sprt01_RsltByProdR.$itm_cd);
			addColumnPathMap(Srch01_DtlByProdR.$itm_sub1, ReExp_Sprt01_RsltByProdR.$itm_sub1);
			addColumnPathMap(Srch01_DtlByProdR.$itm_sub2, ReExp_Sprt01_RsltByProdR.$itm_sub2);
			addColumnPathMap(Srch01_DtlByProdR.$itm_sub3, ReExp_Sprt01_RsltByProdR.$itm_sub3);
			addColumnPathMap(Srch01_DtlByProdR.$itm_nm, ReExp_Sprt01_RsltByProdR.$itm_nm);
			addColumnPathMap(Srch01_DtlByProdR.$lot_mng_typ, ReExp_Sprt01_RsltByProdR.$lot_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$lot_no_typ, ReExp_Sprt01_RsltByProdR.$lot_no_typ);
			addColumnPathMap(Srch01_DtlByProdR.$lot_no_ptn_cd, ReExp_Sprt01_RsltByProdR.$lot_no_ptn_cd);
			addColumnPathMap(Srch01_DtlByProdR.$sublot_mng_typ, ReExp_Sprt01_RsltByProdR.$sublot_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sublot_no_typ, ReExp_Sprt01_RsltByProdR.$sublot_no_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sublot_no_ptn_cd, ReExp_Sprt01_RsltByProdR.$sublot_no_ptn_cd);
			addColumnPathMap(Srch01_DtlByProdR.$sno1_mng_typ, ReExp_Sprt01_RsltByProdR.$sno1_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sno2_mng_typ, ReExp_Sprt01_RsltByProdR.$sno2_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sno3_mng_typ, ReExp_Sprt01_RsltByProdR.$sno3_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sno4_mng_typ, ReExp_Sprt01_RsltByProdR.$sno4_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_cd, ReExp_Sprt01_RsltByProdR.$trd_unit_cd);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_nm, ReExp_Sprt01_RsltByProdR.$trd_unit_nm);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_yield_qty, ReExp_Sprt01_RsltByProdR.$trd_unit_qty);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_dec_place, ReExp_Sprt01_RsltByProdR.$trd_dec_place);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_conv_rnd_typ, ReExp_Sprt01_RsltByProdR.$base_unit_conv_rnd_typ);
			addColumnPathMap(Srch01_DtlByProdR.$conv_base_qty, ReExp_Sprt01_RsltByProdR.$conv_base_qty);
			addColumnPathMap(Srch01_DtlByProdR.$conv_qty, ReExp_Sprt01_RsltByProdR.$conv_qty);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_cd, ReExp_Sprt01_RsltByProdR.$base_unit_cd);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_nm, ReExp_Sprt01_RsltByProdR.$base_unit_nm);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_yield_qty, ReExp_Sprt01_RsltByProdR.$base_unit_qty);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_dec_place, ReExp_Sprt01_RsltByProdR.$base_dec_place);
			addColumnPathMap(Srch01_DtlByProdR.$oper_cd, ReExp_Sprt01_RsltByProdR.$oper_cd);
			addColumnPathMap(Srch01_DtlByProdR.$oper_seq, ReExp_Sprt01_RsltByProdR.$oper_seq);
			addColumnPathMap(Srch01_DtlByProdR.$schd_dt, ReExp_Sprt01_RsltByProdR.$yield_schd_dt);
			addColumnPathMap(Srch01_DtlByProdR.$sno1, ReExp_Sprt01_RsltByProdR.$sno1);
			addColumnPathMap(Srch01_DtlByProdR.$sno2, ReExp_Sprt01_RsltByProdR.$sno2);
			addColumnPathMap(Srch01_DtlByProdR.$sno3, ReExp_Sprt01_RsltByProdR.$sno3);
			addColumnPathMap(Srch01_DtlByProdR.$sno4, ReExp_Sprt01_RsltByProdR.$sno4);
			addColumnPathMap(Srch01_DtlByProdR.$strg_loc_cd, ReExp_Sprt01_RsltByProdR.$strg_loc_cd);
			addColumnPathMap(Srch01_DtlByProdR.$strg_loc_nm, ReExp_Sprt01_RsltByProdR.$strg_loc_nm);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_tgt_flg, ReExp_Sprt01_RsltByProdR.$strg_str_ln_tgt_flg);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_cd, ReExp_Sprt01_RsltByProdR.$strg_str_ln_cd);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_nm, ReExp_Sprt01_RsltByProdR.$strg_str_ln_nm);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_cd_none_flg, ReExp_Sprt01_RsltByProdR.$strg_str_ln_cd_none_flg);
			addColumnPathMap(Srch01_DtlByProdR.$bkf_typ, ReExp_Sprt01_RsltByProdR.$bkf_typ);
			addColumnPathMap(Srch01_DtlByProdR.$par_inst_qty, ReExp_Sprt01_RsltByProdR.$par_inst_qty);
			addColumnPathMap(Srch01_DtlByProdR.$chd_inpt_qty, ReExp_Sprt01_RsltByProdR.$chd_inpt_qty);
			addColumnPathMap(Srch01_DtlByProdR.$chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlByProdR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$fxd_chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlByProdR.$yield_schd_no, ReExp_Sprt01_RsltByProdR.$yield_schd_no);
			addColumnPathMap(Srch01_DtlByProdR.$mfg_inst_no, ReExp_Sprt01_RsltByProdR.$mfg_inst_no);
			addColumnPathMap(Srch01_DtlByProdR.$oper_inst_no, ReExp_Sprt01_RsltByProdR.$oper_inst_no);
			addColumnPathMap(Srch01_DtlByProdR.$disp_seq, ReExp_Sprt01_RsltByProdR.$disp_seq);
		}
	}

	protected Map_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd<Srch01_DtlByProdR,ReExp_Sprt01_RsltByProdR> createMap_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd() {
		return new Map_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd<Srch01_DtlByProdR, ReExp_Sprt01_RsltByProdR>();
	}

	public class Map_Srch01_DtlByProdR_ReExp_Sprt01_RsltByProdR_Upd<D extends Srch01_DtlByProdR, S extends ReExp_Sprt01_RsltByProdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlByProdR.$th_image, ReExp_Sprt01_RsltByProdR.$th_image);
			addColumnPathMap(Srch01_DtlByProdR.$itm_cd, ReExp_Sprt01_RsltByProdR.$itm_cd);
			addColumnPathMap(Srch01_DtlByProdR.$itm_sub1, ReExp_Sprt01_RsltByProdR.$itm_sub1);
			addColumnPathMap(Srch01_DtlByProdR.$itm_sub2, ReExp_Sprt01_RsltByProdR.$itm_sub2);
			addColumnPathMap(Srch01_DtlByProdR.$itm_sub3, ReExp_Sprt01_RsltByProdR.$itm_sub3);
			addColumnPathMap(Srch01_DtlByProdR.$itm_nm, ReExp_Sprt01_RsltByProdR.$itm_nm);
			addColumnPathMap(Srch01_DtlByProdR.$lot_mng_typ, ReExp_Sprt01_RsltByProdR.$lot_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$lot_no_typ, ReExp_Sprt01_RsltByProdR.$lot_no_typ);
			addColumnPathMap(Srch01_DtlByProdR.$lot_no_ptn_cd, ReExp_Sprt01_RsltByProdR.$lot_no_ptn_cd);
			addColumnPathMap(Srch01_DtlByProdR.$sublot_mng_typ, ReExp_Sprt01_RsltByProdR.$sublot_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sublot_no_typ, ReExp_Sprt01_RsltByProdR.$sublot_no_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sublot_no_ptn_cd, ReExp_Sprt01_RsltByProdR.$sublot_no_ptn_cd);
			addColumnPathMap(Srch01_DtlByProdR.$sno1_mng_typ, ReExp_Sprt01_RsltByProdR.$sno1_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sno2_mng_typ, ReExp_Sprt01_RsltByProdR.$sno2_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sno3_mng_typ, ReExp_Sprt01_RsltByProdR.$sno3_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$sno4_mng_typ, ReExp_Sprt01_RsltByProdR.$sno4_mng_typ);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_cd, ReExp_Sprt01_RsltByProdR.$trd_unit_cd);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_nm, ReExp_Sprt01_RsltByProdR.$trd_unit_nm);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_yield_qty, ReExp_Sprt01_RsltByProdR.$trd_unit_qty);
			addColumnPathMap(Srch01_DtlByProdR.$trd_unit_dec_place, ReExp_Sprt01_RsltByProdR.$trd_dec_place);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_conv_rnd_typ, ReExp_Sprt01_RsltByProdR.$base_unit_conv_rnd_typ);
			addColumnPathMap(Srch01_DtlByProdR.$conv_base_qty, ReExp_Sprt01_RsltByProdR.$conv_base_qty);
			addColumnPathMap(Srch01_DtlByProdR.$conv_qty, ReExp_Sprt01_RsltByProdR.$conv_qty);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_cd, ReExp_Sprt01_RsltByProdR.$base_unit_cd);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_nm, ReExp_Sprt01_RsltByProdR.$base_unit_nm);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_yield_qty, ReExp_Sprt01_RsltByProdR.$base_unit_qty);
			addColumnPathMap(Srch01_DtlByProdR.$base_unit_dec_place, ReExp_Sprt01_RsltByProdR.$base_dec_place);
			addColumnPathMap(Srch01_DtlByProdR.$oper_cd, ReExp_Sprt01_RsltByProdR.$oper_cd);
			addColumnPathMap(Srch01_DtlByProdR.$oper_seq, ReExp_Sprt01_RsltByProdR.$oper_seq);
			addColumnPathMap(Srch01_DtlByProdR.$schd_dt, ReExp_Sprt01_RsltByProdR.$yield_schd_dt);
			addColumnPathMap(Srch01_DtlByProdR.$sno1, ReExp_Sprt01_RsltByProdR.$sno1);
			addColumnPathMap(Srch01_DtlByProdR.$sno2, ReExp_Sprt01_RsltByProdR.$sno2);
			addColumnPathMap(Srch01_DtlByProdR.$sno3, ReExp_Sprt01_RsltByProdR.$sno3);
			addColumnPathMap(Srch01_DtlByProdR.$sno4, ReExp_Sprt01_RsltByProdR.$sno4);
			addColumnPathMap(Srch01_DtlByProdR.$strg_loc_cd, ReExp_Sprt01_RsltByProdR.$strg_loc_cd);
			addColumnPathMap(Srch01_DtlByProdR.$strg_loc_nm, ReExp_Sprt01_RsltByProdR.$strg_loc_nm);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_tgt_flg, ReExp_Sprt01_RsltByProdR.$strg_str_ln_tgt_flg);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_cd, ReExp_Sprt01_RsltByProdR.$strg_str_ln_cd);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_nm, ReExp_Sprt01_RsltByProdR.$strg_str_ln_nm);
			addColumnPathMap(Srch01_DtlByProdR.$strg_str_ln_cd_none_flg, ReExp_Sprt01_RsltByProdR.$strg_str_ln_cd_none_flg);
			addColumnPathMap(Srch01_DtlByProdR.$bkf_typ, ReExp_Sprt01_RsltByProdR.$bkf_typ);
			addColumnPathMap(Srch01_DtlByProdR.$par_inst_qty, ReExp_Sprt01_RsltByProdR.$par_inst_qty);
			addColumnPathMap(Srch01_DtlByProdR.$chd_inpt_qty, ReExp_Sprt01_RsltByProdR.$chd_inpt_qty);
			addColumnPathMap(Srch01_DtlByProdR.$chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlByProdR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltByProdR.$fxd_chd_rqmt_qty);
			addColumnPathMap(Srch01_DtlByProdR.$disp_seq, ReExp_Sprt01_RsltByProdR.$disp_seq);
		}
	}

	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 投入予定、工数予定、出来高予定、副産品予定を再展開する。<br>
	 */
	public class Sprt03 extends MSBCL_MfgInstReg_MC_A.Sprt03 {
		/**
		 * 再展開対象外の出来高予定を格納する
		 */
		protected MCList<Srch01_DtlYieldR> _nonTgtYieldL;

		/**
		 * 再展開対象外の投入予定を格納する
		 */
		protected MCList<Srch01_DtlInptR> _nonTgtInptL;

		/**
		 * 再展開対象外の副産品予定を格納する
		 */
		protected MCList<Srch01_DtlByProdR> _nonTgtByProdL;

		/**
		 * 再展開対象外の工数予定を格納する
		 */
		protected MCList<Srch01_DtlWkR> _nonTgtWkL;

		protected MCList<Srch01_DtlYieldR> _yieldL;
		protected MCList<Srch01_DtlInptR> _inptL;
		protected MCList<Srch01_DtlByProdR> _byProdL;
		protected MCList<Srch01_DtlWkR> _wkL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (isNull(up0()) || up1().isEmpty()) {
				return;
			}

			_nonTgtYieldL = MCList.create(Srch01_DtlYieldR.class);
			_nonTgtInptL = MCList.create(Srch01_DtlInptR.class);
			_nonTgtByProdL = MCList.create(Srch01_DtlByProdR.class);
			_nonTgtWkL = MCList.create(Srch01_DtlWkR.class);

			_yieldL = MCList.create(Srch01_DtlYieldR.class);
			_inptL = MCList.create(Srch01_DtlInptR.class);
			_byProdL = MCList.create(Srch01_DtlByProdR.class);
			_wkL = MCList.create(Srch01_DtlWkR.class);

			// 再展開オペレーションの実行
			reExp();
			
			// 下り電文の設定
			setDown();
		}
		
		/**
		 * 再展開
		 */
		protected void reExp() {
			setSubOpeUp();
			reExpSprt06.exec();
			setSubOpeDown();
		}
		
		/**
		 * サブオペの上りをセット
		 */
		protected void setSubOpeUp() {
			// 製造指図・品目製造指図の内容を上り電文に設定
			ReExp_Sprt06_HdrR hdrR = ReExp_Sprt06_HdrR.create();
			copy(hdrR, up0(), createMap_ReExp_Sprt06_HdrR_Sprt03_HdrR());
			reExpSprt06.up0().add(hdrR);

			// 工程指図の内容を上り電文に設定
			up1().setString(Srch01_DtlOperR.$oper_ptn, hdrR.oper_ptn());
			addAll(reExpSprt06.up1(), up1(), createMap_ReExp_Sprt06_DtlOperR_Srch01_DtlOperR());

			// 工程指図ＮＯにインデックスキーを設定
			MCIndexKey operKey = up1().createIndex(Srch01_DtlOperR.$oper_inst_no);
			
			// 出来高予定をテーブルから取得し、上り電文に設定
			for (Srch01_DtlYieldR r : selectYieldSchd()) {
				Srch01_DtlOperR operR = up1().getFirst(operKey, r.oper_inst_no());
				if (isNull(operR)) {
					_nonTgtYieldL.add(r);
				}
				else {
					_yieldL.add(r);
				}
			}
			if (!_yieldL.isEmpty()) {
				setPegNo(_yieldL);
				addAll(reExpSprt06.up2(), _yieldL, createMap_ReExp_Sprt03_DtlYieldR_Srch01_DtlYieldR());
			}
			
			// 投入予定をテーブルから取得し、上り電文に設定
			if (up2().inpt_re_ext_flg()) {
				for (Srch01_DtlInptR r : selectInptSchd()) {
					Srch01_DtlOperR operR = up1().getFirst(operKey, r.oper_inst_no());
					if (isNull(operR)) {
						_nonTgtInptL.add(r);
					}
					else {
						_inptL.add(r);
					}
				}
			}
			else {
				_nonTgtInptL.addAll(selectInptSchd());
			}

			if (!_inptL.isEmpty()) {
				setPegNo(_inptL);
				addAll(reExpSprt06.up3(), _inptL, createMap_ReExp_Sprt01_DtlInptR_Srch01_DtlInptR());
			}

			// 副産品予定をテーブルから取得し、上り電文に設定
			if (up2().byprod_re_ext_flg()) {
				for (Srch01_DtlByProdR r : selectByProdSchd()) {
					Srch01_DtlOperR operR = up1().getFirst(operKey, r.oper_inst_no());
					if (isNull(operR)) {
						_nonTgtByProdL.add(r);
					}
					else {
						_byProdL.add(r);
					}
				}
			}
			else {
				_nonTgtByProdL.addAll(selectByProdSchd());
			}

			if (!_byProdL.isEmpty()) {
				setPegNo(_byProdL);
				addAll(reExpSprt06.up4(), _byProdL, createMap_ReExp_Sprt01_DtlByProdR_Srch01_DtlByProdR());
			}

			// 工数予定をテーブルから取得し、上り電文に設定
			if (up2().wk_re_ext_flg()) {
				for (Srch01_DtlWkR r : selectWkSchd()) {
					Srch01_DtlOperR operR = up1().getFirst(operKey, r.oper_inst_no());
					if (isNull(operR)) {
						_nonTgtWkL.add(r);
					}
					else {
						_wkL.add(r);
					}
				}
			}
			else {
				_nonTgtWkL.addAll(selectWkSchd());
			}

			if (!_wkL.isEmpty()) {
				setPegNo(_wkL);
				addAll(reExpSprt06.up5(), _wkL, createMap_ReExp_Sprt02_DtlWkR_Srch01_DtlWkR());
			}
		}

		/**
		 * 上り電文から再展開の上り電文を設定（製造指図）
		 * @return
		 */
		protected Map_ReExp_Sprt06_HdrR_Sprt03_HdrR<ReExp_Sprt06_HdrR,Sprt03_HdrR> createMap_ReExp_Sprt06_HdrR_Sprt03_HdrR() {
			return new Map_ReExp_Sprt06_HdrR_Sprt03_HdrR<ReExp_Sprt06_HdrR, Sprt03_HdrR>();
		}

		public class Map_ReExp_Sprt06_HdrR_Sprt03_HdrR<D extends ReExp_Sprt06_HdrR, S extends Sprt03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_inst_no, Sprt03_HdrR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_cd, Sprt03_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_sub1, Sprt03_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_sub2, Sprt03_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt06_HdrR.$itm_sub3, Sprt03_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt06_HdrR.$oper_ptn, Sprt03_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt06_HdrR.$bom_ptn, Sprt03_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt06_HdrR.$strg_loc_cd, Sprt03_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_loc_cd, Sprt03_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_st_schd_dt, Sprt03_HdrR.$st_schd_dt);
				addColumnPathMap(ReExp_Sprt06_HdrR.$mfg_inst_qty, Sprt03_HdrR.$base_unit_inst_qty);
				addColumnPathMap(ReExp_Sprt06_HdrR.$yield_schd_qty, Sprt03_HdrR.$base_unit_yield_qty);
				addColumnPathMap(ReExp_Sprt06_HdrR.$strg_str_ln_cd, Sprt03_HdrR.$strg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt06_HdrR.$strg_str_ln_nm, Sprt03_HdrR.$strg_str_ln_nm);
				addColumnPathMap(ReExp_Sprt06_HdrR.$strg_str_ln_cd_none_flg, Sprt03_HdrR.$strg_str_ln_cd_none_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(MCNumber.ONE); //１件のみのため、１固定
				// 手配ＮＯがＮＵＬＬの場合はＮＵＬＬ文字補完
				dest.sno1(nvl(src.sno1(), MAC_STR.NULL_VAL.value()));
				dest.sno2(nvl(src.sno2(), MAC_STR.NULL_VAL.value()));
				dest.sno3(nvl(src.sno3(), MAC_STR.NULL_VAL.value()));
				dest.sno4(nvl(src.sno4(), MAC_STR.NULL_VAL.value()));
				// 品目製造指図ＮＯが設定済の場合は出来高予定の再展開を行わない
				if (isNull(src.itm_mfg_inst_no())) {
					dest.exp_yield_flg(true);
				}
				else {
					dest.exp_yield_flg(false);
				}
			}
		}

		/**
		 * 各種指図・予定検索時の条件を設定する
		 * @return
		 */
		protected Srch01_CndR getCndR() {
			Srch01_CndR cndR = Srch01_CndR.create();
			cndR.srch_tgt_typ(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.value()); //検索対象区分は「製造指図ＮＯ」固定
			cndR.srch_tgt_no(up0().mfg_inst_no()); //検索対象ＮＯは製造指図ＮＯ
			cndR.mfg_inst_no(up0().mfg_inst_no());
			cndR.mfg_inst_rev(up0().mfg_inst_rev());
			cndR.itm_mfg_inst_no(up0().itm_mfg_inst_no());
			return cndR;
		}
		
		/**
		 * 工程指図のテーブルから製造再展開サービス（予定再展開）へのマッピング
		 * @return
		 */
		protected Map_ReExp_Sprt06_DtlOperR_Srch01_DtlOperR<ReExp_Sprt06_DtlOperR,Srch01_DtlOperR> createMap_ReExp_Sprt06_DtlOperR_Srch01_DtlOperR() {
			return new Map_ReExp_Sprt06_DtlOperR_Srch01_DtlOperR<ReExp_Sprt06_DtlOperR, Srch01_DtlOperR>();
		}

		public class Map_ReExp_Sprt06_DtlOperR_Srch01_DtlOperR<D extends ReExp_Sprt06_DtlOperR, S extends Srch01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$tgt_oper_flg, Srch01_DtlOperR.$tgt_oper_flg);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$peg_no, Srch01_DtlOperR.$peg_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_inst_no, Srch01_DtlOperR.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$mfg_inst_no, Srch01_DtlOperR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_cd, Srch01_DtlOperR.$oper_cd);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_seq, Srch01_DtlOperR.$oper_seq);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_loc_cd, Srch01_DtlOperR.$oper_loc_cd);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_ptn, Srch01_DtlOperR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_inst_qty, Srch01_DtlOperR.$base_unit_qty);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$yield_oper_flg, Srch01_DtlOperR.$yield_oper_flg);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$yield_oper_ratio, Srch01_DtlOperR.$yield_oper_ratio);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$st_schd_tm, Srch01_DtlOperR.$st_schd_dt);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$end_schd_tm, Srch01_DtlOperR.$end_schd_dt);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_str_ln_cd, Srch01_DtlOperR.$oper_str_ln_cd);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_str_ln_nm, Srch01_DtlOperR.$oper_str_ln_nm);
				addColumnPathMap(ReExp_Sprt06_DtlOperR.$oper_str_ln_cd_none_flg, Srch01_DtlOperR.$oper_str_ln_cd_none_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(MCNumber.ONE); //単票画面は１固定
				dest.tgt_oper_flg(true); //再展開対象の工程指図のみが上ってくるため、常にtrue
			}
		}
		
		/**
		 * 製造指図ＮＯから出来高予定（出来高）を取得する
		 */
		protected MCList<Srch01_DtlYieldR> selectYieldSchd() {
			return selectSqlYieldSchd(getCndR(), up1());
		}

		/**
		 * 製造指図ＮＯから投入予定を取得する
		 */
		protected MCList<Srch01_DtlInptR> selectInptSchd() {
			return selectSqlInptSchd(getCndR(), up1());
		}

		/**
		 * 製造指図ＮＯから工数予定を取得する
		 */
		protected MCList<Srch01_DtlWkR> selectWkSchd() {
			return selectSqlWkSchd(getCndR(), up1());
		}

		/**
		 * 製造指図ＮＯから出来高予定（副産品）を取得する
		 */
		protected MCList<Srch01_DtlByProdR> selectByProdSchd() {
			return selectSqlByProdSchd(getCndR(), up1());
		}

		/**
		 * サブオペの下り電文を当オペレーションの下り電文に設定する
		 */
		protected void setSubOpeDown() {
			// 出来高
			down2().addAll(setSubOpeDownYield(_yieldL, reExpSprt06.down0()));
			// 投入
			down0().addAll(setSubOpeDownInpt(_inptL, reExpSprt06.down1()));
			// 工数
			down1().addAll(setSubOpeDownWk(_wkL, reExpSprt06.down3()));
			// 副産品
			down3().addAll(setSubOpeDownByProd(_byProdL, reExpSprt06.down2()));
		}
		
		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setBoolean(Srch01_DtlInptR.$tgt_oper_flg, true);

			// 各予定のチェックがオフの場合、再展開結果を下り電文からクリアする
			if (!up2().inpt_re_ext_flg()) {
				down0().clear();
			}
			if (!up2().wk_re_ext_flg()) {
				down1().clear();
			}
			if (!up2().byprod_re_ext_flg()) {
				down3().clear();
			}
			
			doCompStrLnNoneFlg(down0());
			doCompStrLnNoneFlg(down2());
			doCompStrLnNoneFlg(down3());

			for (Srch01_DtlInptR r : down0()) {
				// 工程指図の件数はそこまで多くないことが想定されるためindexkeyは使用していない
				Srch01_DtlOperR operR = up1().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlWkR r : down1()) {
				Srch01_DtlOperR operR = up1().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlYieldR r : down2()) {
				Srch01_DtlOperR operR = up1().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}
			for (Srch01_DtlByProdR r : down3()) {
				Srch01_DtlOperR operR = up1().getFirst(Srch01_DtlOperR.$peg_no,
						r.oper_peg_no());
				if (!isNull(operR)) {
					r.tgt_oper_flg(operR.tgt_oper_flg());
					r.oper_cd(operR.oper_cd());
					r.oper_nm(operR.oper_nm());
					r.oper_seq(operR.oper_seq());
				}
			}

			// 投入データの編集
			editInptCmn(down0());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造指図を取り消しする。<br>
	 */
	public class Del01 extends MSBCL_MfgInstReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callMfgInstReg_Del01();
		}
		

		protected void editUp() {
			up0().peg_no(MCNumber.ZERO);
		}
		
		protected void callMfgInstReg_Del01() {
			MSBCL_MfgInstRegService.MfgInstReg_Del01 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Del01();
			MfgInstReg_Del01_HdrR opeUp1 = ope.up1().createRow();
			copy(opeUp1, up0(), createMap_MfgInstReg_Del01_HdrR_Del01_HdrR());
			ope.up1().add(opeUp1);
			addAll(ope.up2(), up1(), createMap_MfgInstReg_Del01_DtlOperR_Del01_DtlOperR());
			ope.up0().lst_del_flg(false);
			ope.exec();
		}

		protected Map_MfgInstReg_Del01_HdrR_Del01_HdrR<MfgInstReg_Del01_HdrR,Del01_HdrR> createMap_MfgInstReg_Del01_HdrR_Del01_HdrR() {
			return new Map_MfgInstReg_Del01_HdrR_Del01_HdrR<MfgInstReg_Del01_HdrR, Del01_HdrR>();
		}

		public class Map_MfgInstReg_Del01_HdrR_Del01_HdrR<D extends MfgInstReg_Del01_HdrR, S extends Del01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Del01_HdrR.$peg_no, Del01_HdrR.$peg_no);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$mfg_inst_no, Del01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$itm_ord_upd_cntr, Del01_HdrR.$itm_ord_upd_cntr);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$itm_mfg_inst_upd_cntr, Del01_HdrR.$itm_mfg_inst_upd_cntr);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$mfg_inst_upd_cntr, Del01_HdrR.$mfg_inst_upd_cntr);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$xfr_inst_del_enable_flg, Del01_HdrR.$xfr_inst_del_enable_flg);

			}
		}
		protected Map_MfgInstReg_Del01_DtlOperR_Del01_DtlOperR<MfgInstReg_Del01_DtlOperR,Del01_DtlOperR> createMap_MfgInstReg_Del01_DtlOperR_Del01_DtlOperR() {
			return new Map_MfgInstReg_Del01_DtlOperR_Del01_DtlOperR<MfgInstReg_Del01_DtlOperR, Del01_DtlOperR>();
		}

		public class Map_MfgInstReg_Del01_DtlOperR_Del01_DtlOperR<D extends MfgInstReg_Del01_DtlOperR, S extends Del01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Del01_DtlOperR.$oper_inst_no, Del01_DtlOperR.$oper_inst_no);
				addColumnPathMap(MfgInstReg_Del01_DtlOperR.$mes_flg, Del01_DtlOperR.$mes_flg);

			}
		}
	}

	/**
	 * Sprt07オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	public class Sprt07 extends MSBCL_MfgInstReg_MC_A.Sprt07 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callLotIssueSrv();
			setDown();
		}
		
		protected void editUp() {
			up0().peg_no(MCNumber.ONE);
			up0().hdr_peg_no(MCNumber.ONE);
			up0().yield_dt((MCDate)up1().subList(up1R -> !up1R.isStatusDelete()).min(Sprt07_DtlYieldR.$schd_dt));
			up0().yield_dt_label_nm(MAC_NUM_PROC.MFG_YIELD_SCHD_DT.name(getUsrLocale()));
			for (MfgInstActCom_Sprt01_DtlR inptR : up2()) {
				inptR.hdr_peg_no(MCNumber.ONE);
			}
		}
		
		protected void callLotIssueSrv() {
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			o.up0().add(up0());
			o.up1().addAll(up2());
			o.exec();
			up0().lot_no(o.down0().get(0).lot_no());
			up0().sublot_no(o.down0().get(0).sublot_no());
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Sprt08オペレーション.<p>
	 *
	 * 副産品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	public class Sprt08 extends MSBCL_MfgInstReg_MC_A.Sprt08 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callLotIssueSrv();
			setDown();
		}
		
		protected void editUp() {
			int cnt = 0;
			for (MfgInstActCom_Sprt01_HdrR byProdR : up1()) {
				byProdR.peg_no(cnt++);
				byProdR.hdr_peg_no(MCNumber.ONE);
				byProdR.lot_issue_flg(up0().lot_issue_flg());
				byProdR.sublot_issue_flg(up0().sublot_issue_flg());
				byProdR.sppl_cd(up0().sppl_cd());
				byProdR.mfg_loc_cd(up0().mfg_loc_cd());
				byProdR.mfg_loc_wg_cd(up0().mfg_loc_wg_cd());
				byProdR.mfg_loc_site_cd(up0().mfg_loc_site_cd());
				byProdR.yield_dt_label_nm(getLabel(byProdR, MfgInstActCom_Sprt01_HdrR.$yield_dt));
			}
			
			for (MfgInstActCom_Sprt01_DtlR inptR : up2()) {
				inptR.hdr_peg_no(MCNumber.ONE);
			}
		}
		
		protected void callLotIssueSrv() {
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			o.up0().addAll(up1());
			o.up1().addAll(up2());
			o.exec();
			copyByPegNo(up1(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			}, o.down0(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no,
			});
		}
		
		protected void setDown() {
			down0().addAll(up1());
		}
		
	}
	
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 製造指図を承認する。<br>
	 */
	public class Upd02 extends MSBCL_MfgInstReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			
			callMfgInstActComUpd01();

			MCRow.copyall(down0(), up0());
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().peg_no(MCNumber.ZERO);
			up0().aprv_tm(MCDate.now());
		}
		
		/**
		 * 製造指図・実績共通処理サービスの呼出
		 */
		protected void callMfgInstActComUpd01() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd01();
			MfgInstActCom_Chk01_DtlR r = MfgInstActCom_Chk01_DtlR.create();
			
			ope.up0().lst_reg_flg(false);
			ope.up0().mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.INST_ACPT.value());
			copy(r, up0(), createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR());
			ope.up1().add(r);
			ope.exec();
			
			up0().mfg_aprv_sts_typ(ope.down0().get(0).mfg_aprv_sts_typ());
			up0().mfg_aprv_sts_typ_nm(ope.down0().get(0).mfg_aprv_sts_typ_nm());
		}
	}
	
	/**
	 * Del02オペレーション.<p>
	 *
	 * 製造指図の承認を取り消す。<br>
	 */
	public class Del02 extends MSBCL_MfgInstReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callMfgInstActComUpd01();
			
			MCRow.copyall(down0(), up0());
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().peg_no(MCNumber.ZERO);
			up0().aprv_tm(MCDate.now());		
		}
		
		/**
		 * 製造指図・実績共通処理サービスの呼出
		 */
		protected void callMfgInstActComUpd01() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd01();
			MfgInstActCom_Chk01_DtlR r = MfgInstActCom_Chk01_DtlR.create();
			
			ope.up0().lst_reg_flg(false);
			ope.up0().mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.INST_OPN.value());
			copy(r, up0(), createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR());
			ope.up1().add(r);
			ope.exec();
			
			up0().mfg_aprv_sts_typ(ope.down0().get(0).mfg_aprv_sts_typ());
			up0().mfg_aprv_sts_typ_nm(ope.down0().get(0).mfg_aprv_sts_typ_nm());
		}
		
	}
	
	protected Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR,Upd02_DtlR> createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR() {
		return new Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR, Upd02_DtlR>();
	}

	public class Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<D extends MfgInstActCom_Chk01_DtlR, S extends Upd02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$peg_no, Upd02_DtlR.$peg_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_no, Upd02_DtlR.$mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$itm_mfg_inst_no, Upd02_DtlR.$itm_mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dt, Upd02_DtlR.$aprv_dt);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_tm, Upd02_DtlR.$aprv_tm);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dpt_cd, Upd02_DtlR.$aprv_dpt_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_usr_cd, Upd02_DtlR.$aprv_usr_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_rsn, Upd02_DtlR.$aprv_rsn);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_upd_cntr, Upd02_DtlR.$mfg_inst_upd_cntr);
		}
	}
	
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 製造指図書を発行する。<br>
	 */
	public class Prnt01 extends MSBCL_MfgInstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();

			// 製造帳票発行サービスの製造指図書発行
			callMfgRptServicePrnt01();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_DtlR.$peg_no, up0());
		}
		
		/**
		 * 製造指図書を発行する。
		 */
		protected void callMfgRptServicePrnt01() {
			MSBCL_MfgRptService.MfgRpt_Prnt01 prnt = MSBCL_MfgRptService.crtMfgRpt_Prnt01();

			MfgRpt_Prnt01_DtlR prnt01UpR = MfgRpt_Prnt01_DtlR.create();
			copy(prnt01UpR, up0(), createMap_MfgRpt_Prnt01_DtlR_Prnt01_DtlR());
			prnt.up0().add(prnt01UpR);
			
			prnt.exec();

			for(MfgRpt_Prnt01_DtlR r : prnt.down0()) {
				up0().inst_prnt_flg(r.inst_prnt_flg());
				up0().inst_prnt_tm(r.inst_prnt_tm());
				up0().err_flg(r.err_flg());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		protected Map_MfgRpt_Prnt01_DtlR_Prnt01_DtlR<MfgRpt_Prnt01_DtlR,Prnt01_DtlR> createMap_MfgRpt_Prnt01_DtlR_Prnt01_DtlR() {
			return new Map_MfgRpt_Prnt01_DtlR_Prnt01_DtlR<MfgRpt_Prnt01_DtlR, Prnt01_DtlR>();
		}

		public class Map_MfgRpt_Prnt01_DtlR_Prnt01_DtlR<D extends MfgRpt_Prnt01_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$mfg_inst_no, Prnt01_DtlR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$mfg_inst_rev, Prnt01_DtlR.$mfg_inst_rev);
			}
		}
	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * 工程・ＢＯＭマスタ変更リストを発行する。<br>
	 */
	public class Prnt02 extends MSBCL_MfgInstReg_MC_A.Prnt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			editUp();

			// 製造帳票発行サービスの工程・ＢＯＭマスタ変更リスト発行
			callMfgRptServicePrnt03();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt02_DtlR.$peg_no, up0());
		}
		
		/**
		 * 工程・ＢＯＭマスタ変更リストを発行する。
		 */
		protected void callMfgRptServicePrnt03() {
			MSBCL_MfgRptService.MfgRpt_Prnt03 prnt = MSBCL_MfgRptService.crtMfgRpt_Prnt03();

			MfgRpt_Prnt03_DtlR prnt03UpR = MfgRpt_Prnt03_DtlR.create();
			copy(prnt03UpR, up0(), createMap_MfgRpt_Prnt03_DtlR_Prnt02_DtlR());
			prnt.up0().add(prnt03UpR);
			
			prnt.exec();

			for(MfgRpt_Prnt03_DtlR r : prnt.down0()) {
				up0().err_flg(r.err_flg());
			}
		}
		
		protected Map_MfgRpt_Prnt03_DtlR_Prnt02_DtlR<MfgRpt_Prnt03_DtlR,Prnt02_DtlR> createMap_MfgRpt_Prnt03_DtlR_Prnt02_DtlR() {
			return new Map_MfgRpt_Prnt03_DtlR_Prnt02_DtlR<MfgRpt_Prnt03_DtlR, Prnt02_DtlR>();
		}

		public class Map_MfgRpt_Prnt03_DtlR_Prnt02_DtlR<D extends MfgRpt_Prnt03_DtlR, S extends Prnt02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt03_DtlR.$peg_no, Prnt02_DtlR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt03_DtlR.$mfg_inst_no, Prnt02_DtlR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt03_DtlR.$mfg_inst_rev, Prnt02_DtlR.$mfg_inst_rev);
			}
		}
	}
	
	/**
	 * Sprt09オペレーション.<p>
	 *
	 * 納入希望日、製造着手予定日、製造終了予定日を計算する。<br>
	 */
	public class Sprt09 extends MSBCL_MfgInstReg_MC_A.Sprt09 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callCalcSrv();
			setDown();
		}
		
		protected void editUp() {
			up0().peg_no(MCNumber.ONE);
			setUpDt();
		}
		
		protected void setUpDt() {
			Sprt09_HdrR org = up0().clone();
			up0().rqst_dlv_rqst_dt(null);
			up0().end_schd_dt(null);
			up0().st_schd_dt(null);
			
			if (!isNull(org.rqst_dlv_rqst_dt())) {
				up0().rqst_dlv_rqst_dt(org.rqst_dlv_rqst_dt());
			}
			else if (!isNull(org.end_schd_dt())) {
				up0().end_schd_dt(org.end_schd_dt());
			}
			else if (!isNull(org.st_schd_dt())) {
				up0().st_schd_dt(org.st_schd_dt());
			}
		}
		
		protected void callCalcSrv() {
			if (!isCalc()) {
				return;
			}
			
			MSBCL_OrdRegService.Ord_Sprt03 o = MSBCL_OrdRegService.crtOrd_Sprt03();
			Ord_Sprt03_DtlR oUpR = Ord_Sprt03_DtlR.create();
			copy(oUpR, up0(), createMap_Ord_Sprt03_DtlR_Sprt09_HdrR());
			o.up0().add(oUpR);
			o.exec();
			
			if (MSC_MFG_MTD_TYP.isEXTNL(up0().mfg_mtd_typ())) {
				up0().rqst_dlv_rqst_dt(o.down0().get(0).strg_schd_dt());
			}
			up0().st_schd_dt(o.down0().get(0).mfg_st_schd_dt());
			up0().end_schd_dt(o.down0().get(0).mfg_end_schd_dt());
		}
		
		protected boolean isCalc() {
			if (MSC_MFG_MTD_TYP.isINTNL(up0().mfg_mtd_typ())) {
				if (isNull(up0().st_schd_dt()) && isNull(up0().end_schd_dt())) {
					return false;
				}
				return true;
			}
			else if (MSC_MFG_MTD_TYP.isEXTNL(up0().mfg_mtd_typ())) {
				if (isNull(up0().rqst_dlv_rqst_dt()) && isNull(up0().st_schd_dt())
						&& isNull(up0().end_schd_dt())) {
					return false;
				}
				return true;
			}
			return false;
		}
		
		protected Map_Ord_Sprt03_DtlR_Sprt09_HdrR<Ord_Sprt03_DtlR,Sprt09_HdrR> createMap_Ord_Sprt03_DtlR_Sprt09_HdrR() {
			return new Map_Ord_Sprt03_DtlR_Sprt09_HdrR<Ord_Sprt03_DtlR, Sprt09_HdrR>();
		}

		public class Map_Ord_Sprt03_DtlR_Sprt09_HdrR<D extends Ord_Sprt03_DtlR, S extends Sprt09_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, Sprt09_HdrR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, Sprt09_HdrR.$rqst_dlv_rqst_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_st_schd_dt, Sprt09_HdrR.$st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_end_schd_dt, Sprt09_HdrR.$end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, Sprt09_HdrR.$master_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, Sprt09_HdrR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, Sprt09_HdrR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, Sprt09_HdrR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, Sprt09_HdrR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, Sprt09_HdrR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, Sprt09_HdrR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, Sprt09_HdrR.$strg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, Sprt09_HdrR.$base_unit_inst_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_MFG_MTD_TYP.isEXTNL(src.mfg_mtd_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
	}
	
	protected String getStrLnNm(String inpt_loc_cd, String inpt_str_ln_cd) {
		MCList<MAM_STR_LN_R> dbc = MCList.create(MAM_STR_LN_R.class);
		MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.str_ln_nm);
		dbc_bldr.setWhere(value(0).eq(value(0)));
		dbc_bldr.addWhereWithAnd(t.loc_cd.eq(bind("1")), inpt_loc_cd);
		dbc_bldr.addWhereWithAnd(t.str_ln_cd.eq(bind("1")), inpt_str_ln_cd);
		dbSelect("MSBCL1010_MAM_STR_LN_S01", dbc, dbc_bldr);
		if(!isNull(dbc) && !dbc.isEmpty()) {
			return dbc.get(0).str_ln_nm();
		}
		return null;
	}

	//FMCB CUSTOM END
}