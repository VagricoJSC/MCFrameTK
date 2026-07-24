package mcframe.serverMSBE.MSBEL0100;

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
import static mcframe.serverMSBE.MSBEL0100.Query.*;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IoRecSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IoRecSrch_MC extends MSBEL_IoRecSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目、ロット、サブロット、工場・物流倉庫ごとに、入出庫の実績を日付順に照会する。<br>
	 */
	public class Srch01 extends MSBEL_IoRecSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			//医薬オプションライセンスがある環境でしか検索できないようにする
			if (!mcframe.serverCore.login.MCUserAuthAgent
					.usableProduct(mcframe.commonCore.login.MCAuth.PROD_MEDICINE)) {
				return;
			}

			MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
			dbWkDelete("MSBEL0100_MSW_LOT_D01", lotL_bldr.getBaseDbc());

			editUp();

			insMswLotKey();

			srch();

			dbWkDelete("MSBEL0100_MSW_LOT_D02", lotL_bldr.getBaseDbc());
		}

		protected void editUp() {
			// 伝票実績日時の時分を無視して検索するために、
			// 伝票実績日ＴＯを23:59:59にする。
			if (!isNull(up0().act_dt_to())) {
				up0().act_dt_to(up0().act_dt_to().addDay(1).addSecond(-1));
			}

			// 移動・移送用の上り電文編集
			// 検索モードが工場・物流
			if (isSame(up0().srch_mode(), "1")) {
				up0().srch_site_xfr("1");
			}
			// 検索モードが場所取引先
			else if (isSame(up0().srch_mode(), "2")) {
				up0().srch_sppl_xfr("1");
			}
			// 検索モードが場所
			else if (isSame(up0().srch_mode(), "3")) {
				up0().srch_loc_xfr("1");
			}
		}

		/**
		 * ワークテーブルにinsert
		 */
		protected void insMswLotKey() {
			
			executeUpdate(MSBEL0100_MSW_LOT_KEY_I01(), up0());
			
		}

		protected void srch() {

			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);

			executeQuery(list, MSBEL0100_MST_IO_ACT_S01(), up0());

			if (list.isEmpty()) {
				return;
			}

			// 検査実績
			MCList<Srch01_RsltR> inspL = MCList.create(Srch01_RsltR.class);
			executeQuery(inspL, MSBEL0100_MST_INSP_ACT_S01());
			MCIndexKey idxkey = inspL.createIndex(Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3, Srch01_RsltR.$lot_no,
					Srch01_RsltR.$lot_tbl_sublot_no, Srch01_RsltR.$site_cd);

			int peg_no = 0; // ロットテーブルと入出庫明細テーブルを紐付ける番号
			for (MCList<Srch01_RsltR> gL : list.groupList(getGrpCols())) {
				if (isSlipDtInc(gL)) {					
					// ロットテーブルの編集
					Srch01_LotR down0R = Srch01_LotR.create();
					copy(down0R, gL.get(0), createMap_Srch01_LotR_Srch01_RsltR());
										
					for (String col : getGrpRemoveCols()) {
						if (MCDataType.BOOLEAN.equals(down0R.getDataType(col))) {
							down0R.setBoolean(col, false);
						}
						else {
							down0R.setString(col, null);
						}
					}
					
					down0R.peg_no(peg_no);
					
					// 検査実績の取得
					setInsp(inspL, down0R, idxkey);
					
					down0().add(down0R);
					
					// 入出庫明細テーブルの編集
					down1().addAll(editDtl(gL, peg_no));

					peg_no++;
				}
			}
			
			//ソート処理
			down0().sort(getOrderByCols());
		}

		/**
		 * 伝票実績日が検索条件の範囲に含まれているかどうか
		 * @return
		 */
		protected boolean isSlipDtInc(MCList<Srch01_RsltR> gL) {
			// 伝票実績日の検索条件は、MSBEL0100_MSW_LOT_KEY_I01で評価しているが
			// 工場・物流単位や場所取引先単位で表示した場合、表示対象外となる
			// 払出等の受払実績も加味しているため、ここで再度評価を行う。
			if (gL.isEmpty()) {
				return false;
			}
			gL.sort(SortType.ASC, Srch01_RsltR.$act_dt);
			MCDate min = gL.get(0).act_dt();
			MCDate max = gL.get(gL.size() - 1).act_dt();
			if (!isNull(up0().act_dt_fr())) {
				if (up0().act_dt_fr().gt(max)) {
					return false;
				}
			}
			if (!isNull(up0().act_dt_to())) {
				if (up0().act_dt_to().lt(min)) {
					return false;
				}
			}
			return true;
		}

		/**
		 * グループ化対象のカラムを返す
		 * @return
		 */
		protected String[] getGrpCols() {
			String[] cols = Srch01_LotR.colnames();
			// Srch01_Rslt,Srch01_Lotのカラム名が同じ前提の処理
			return MCCollectionUtil.remove(cols, new String[0], getGrpRemoveCols());
		}

		protected String[] getGrpRemoveCols() {
			if (isSame(up0().srch_mode(), "1")) {
				// グループ化対象のカラムから、場所取引先、場所、棚･ラインを除く
				return new String[] {

						Srch01_LotR.$loc_sppl_cd, Srch01_LotR.$loc_sppl_nm,
						Srch01_LotR.$loc_cd, Srch01_LotR.$loc_nm, Srch01_LotR.$str_ln_cd,
						Srch01_LotR.$str_ln_nm, Srch01_LotR.$str_ln_cd_none_flg
				};
			}
			else if (isSame(up0().srch_mode(), "2")) {
				// グループ化対象のカラムから、場所、棚・ラインを除く
				return new String[] {
						Srch01_LotR.$loc_cd, Srch01_LotR.$loc_nm, Srch01_LotR.$str_ln_cd,
						Srch01_LotR.$str_ln_nm, Srch01_LotR.$str_ln_cd_none_flg
				};
			}
			else if (isSame(up0().srch_mode(), "3")) {
				// グループ化対象のカラムから、棚・ラインを除く
				return new String[] {
						Srch01_LotR.$str_ln_cd, Srch01_LotR.$str_ln_nm,
						Srch01_LotR.$str_ln_cd_none_flg
				};
			}
			else {
				return new String[] {};
			}
		}
		
		/**
		 * ロット枠のソート順項目
		 * @return
		 */
		protected String[] getOrderByCols() {
			// 工場・物流倉庫、品目、枝番１、枝番２、枝番３、ロットＮＯ、サブロットＮＯ
			return new String[] {
					Srch01_LotR.$site_cd, Srch01_LotR.$itm_cd,
					Srch01_LotR.$itm_sub1, Srch01_LotR.$itm_sub2, Srch01_LotR.$itm_sub3,
					Srch01_LotR.$lot_no, Srch01_LotR.$lot_tbl_sublot_no
			};
		}
		

		protected Map_Srch01_LotR_Srch01_RsltR<Srch01_LotR, Srch01_RsltR> createMap_Srch01_LotR_Srch01_RsltR() {
			return new Map_Srch01_LotR_Srch01_RsltR<Srch01_LotR, Srch01_RsltR>();
		}

		public class Map_Srch01_LotR_Srch01_RsltR<D extends Srch01_LotR, S extends Srch01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.itm_nm(src.itm_nm());
				dest.sublot_mng_typ(src.sublot_mng_typ());
				dest.ver_no(src.ver_no());
				dest.lot_no(src.lot_no());
				dest.lot_tbl_sublot_no(src.lot_tbl_sublot_no());
				dest.bp_lot_no(src.bp_lot_no());
				dest.first_gr_dt(src.first_gr_dt());
				dest.vld_dt(src.vld_dt());
				dest.lmt_dt(src.lmt_dt());
				dest.site_cd(src.site_cd());
				dest.site_nm(src.site_nm());
				dest.loc_sppl_cd(src.loc_sppl_cd());
				dest.loc_sppl_nm(src.loc_sppl_nm());
				dest.loc_cd(src.loc_cd());
				dest.loc_nm(src.loc_nm());
				dest.str_ln_cd(src.str_ln_cd());
				dest.str_ln_nm(src.str_ln_nm());
				dest.str_ln_cd_none_flg(src.str_ln_cd_none_flg());
			}
		}

		/**
		 * 検査実績関連情報のセット
		 */
		protected void setInsp(MCList<Srch01_RsltR> inspL, Srch01_LotR down0R, MCIndexKey idxkey) {
			
			MCList<Srch01_RsltR> inspSubL = inspL.subList(idxkey, down0R.itm_cd(),
					down0R.itm_sub1(), down0R.itm_sub2(), down0R.itm_sub3(),
					down0R.lot_no(), down0R.lot_tbl_sublot_no(), down0R.site_cd());
			
			// 最新の検査結果を取得する。
			// 判定日、終了日、検査ＮＯの降順でソート
			inspSubL.sort(MCList.SortType.DESC, Srch01_RsltR.$judg_dt, Srch01_RsltR.$end_dt, Srch01_RsltR.$insp_no);

			if (!inspSubL.isEmpty()) {
				Srch01_RsltR inspR = inspSubL.get(0);
				down0R.insp_cnt(inspSubL.size());
				down0R.insp_no(inspR.insp_no());
				down0R.st_dt(inspR.st_dt());
				down0R.st_hm(inspR.st_hm());
				down0R.end_dt(inspR.end_dt());
				down0R.end_hm(inspR.end_hm());
				down0R.quality_typ(inspR.quality_typ());
				down0R.judg_dt(inspR.judg_dt());
				down0R.insp_judg_rslt_typ(inspR.insp_judg_rslt_typ());
			}
						
		}
		
		/**
		 * 入出庫実績の編集
		 */
		protected MCList<Srch01_RsltR> editDtl(MCList<Srch01_RsltR> dtlL, int peg_no) {
			MCList<Srch01_RsltR> actL = MCList.create(Srch01_RsltR.class);
			
			// 出荷後、未売上の在庫の返品を受けた場合の入出庫実績の編集
			
			// 取引パタンが出荷返品かどうか
			MCList<Srch01_RsltR> shipRtnL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : dtlL) {
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					shipRtnL.add(r);
				}
				else {
					actL.add(r);
				}
			}
			
			// 出荷元（＝出荷後未売上の在庫が存在している場所、棚・ライン）と返品先（＝返品を受けて入荷した場所、棚・ライン）が同じか異なるかで表示する内容を変える
			// １．同じ場合
			//  「出荷返品入庫」が入ったgL
			//  このとき表示対象は「出荷返品入庫」
			// ２．異なる場合
			//  ２－１．異なる工場・物流倉庫の場所に返品された場合（検索モードは問わない）
			//   「出荷返品入庫」、「移動・移送出庫」が入ったgLと、「移動・移送入庫」が入ったgL
			//   このとき表示対象は「移動・移送入庫」（「出荷返品入庫」と「移動・移送出庫」は表示対象外）
			//  ２－２．同じ工場・物流倉庫で異なる場所に返品された場合（検索モード：工場・物流倉庫、場所取引先）
			//   「出荷返品入庫」、「移動・移送出庫」、「移動・移送入庫」が入ったgL
			//   このとき表示対象は「移動・移送入庫」（「出荷返品入庫」と「移動・移送出庫」は表示対象外）
			//  ２－３．同じ工場・物流倉庫で異なる場所に返品された場合（検索モード：場所、棚・ライン）
			//   ２－１と同じ
			//  ２－４．同じ工場・物流倉庫、場所で異なる棚・ラインに返品された場合（検索モード：棚・ライン以外）
			//   ２－２と同じ
			//  ２－４．同じ工場・物流倉庫、場所で異なる棚・ラインに返品された場合（検索モード：棚・ライン）
			//   ２－１と同じ
			for (MCList<Srch01_RsltR> gL : shipRtnL
							.groupList(Srch01_RsltR.$act_d_no)) {
				MCIndexKey idxkey = gL.createIndex(Srch01_RsltR.$io_act_typ);
				Srch01_RsltR xfrGrR = gL.getFirst(idxkey, MSC_IO_ACT_TYP.XFR_GR.value());
				Srch01_RsltR xfrGiR = gL.getFirst(idxkey, MSC_IO_ACT_TYP.XFR_GI.value());

				// 「移動・移送入庫」があれば「移動・移送入庫」の受払を表示
				if (!isNull(xfrGrR)) {
					actL.add(xfrGrR);
				}
				// 「移動・移送入庫」も「移動・移送出庫」もなければ「出荷返品入庫」しかないため、1行目の受払を表示
				else if (isNull(xfrGiR)) {
					actL.add(gL.get(0));					
				}
			}

			MCNumber stkQty = MCNumber.ZERO;
			int srt_no = 0;
			actL.sort(Srch01_RsltR.$act_dt, Srch01_RsltR.$io_typ, Srch01_RsltR.$slip_no);
			for (Srch01_RsltR r : actL) {

				if (MSC_IO_TYP.isGR(r.io_typ())) {
					stkQty = stkQty.add(r.base_unit_gr_qty());
				}
				else if (MSC_IO_TYP.isGI(r.io_typ())) {
					stkQty = stkQty.subtract(r.base_unit_gi_qty());
				}
				r.base_unit_qty(stkQty);
				r.peg_no(peg_no);
				r.srt_no(srt_no);
				srt_no ++;
				
			}

			return actL;
		}

	}

	//FMCB CUSTOM END
}