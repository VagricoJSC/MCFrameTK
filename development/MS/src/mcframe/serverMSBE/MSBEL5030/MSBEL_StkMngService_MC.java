package mcframe.serverMSBE.MSBEL5030;

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
import mcframe.commonCore.meta.MCMeta;
import static mcframe.serverMSBE.MSBEL5030.Query.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBD.MSBDL5050.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkMngService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkMngService_MC extends MSBEL_StkMngService_MC_A{
	//FMCB CUSTOM START
	// 定数
	protected static final String _isINS = "is_ins";
	protected static final String _isUPD = "is_upd";
	protected static final String _orgBqty = "org_base_unit_qty";
	protected static final String _orgPqty = "org_pack_stk_qty";
	protected static final String _isMinus = "FCBBC0065";
	protected static final String _isOverflow = "FCBBC0064";
	protected static final String _minusStk = "minus_stk_flg";

	/**
	 * Stk_Upd01オペレーション.<p>
	 *
	 * 受払実績に基づいて現状在庫・月次在庫を更新します。<br>
	 */
	public class Stk_Upd01 extends MSBEL_StkMngService_MC_A.Stk_Upd01 {
		protected MCList<MST_STK_R> _ins_stkL;
		protected MCList<MST_STK_R> _upd_stkL;
		protected MCList<MST_STK_R> _del_stkL;
		protected MCList<MST_MLY_STK_DTL_R> _ins_mstkL;
		protected MCList<MST_MLY_STK_DTL_R> _upd_mstkL;
		protected MCList<MST_MLY_STK_DTL_R> _del_mstkL;
		MCMessageList _msgList;
		
		protected MCList<MST_STK_R> _insp_stkL;
		protected MCList<MST_STK_R> _purc_stkL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 初期化
			initVar();
			
			// 前処理
			// 上り電文を更新用に加工する（月次受払用）
			MCGroupByPolicy gp_m = getGroupPolicy_m();
			MCList<Stk_Upd01_DtlR> sum_up_m = up0().groupBy(gp_m);

			// 上り電文を更新用に加工する（現状在庫用）
			for (Stk_Upd01_DtlR row : up0()) {
				// 出庫の場合は数量の符号を反転
				if (MSC_IO_TYP.isGI(MSC_IO_ACT_TYP.io_typ(row.io_act_typ()))) {
					row.pack_unit_qty(row.pack_unit_qty().negate());
					row.base_unit_qty(row.base_unit_qty().negate());
				}
			}
			MCGroupByPolicy gp = getGroupPolicy();
			MCList<Stk_Upd01_DtlR> sum_up = up0().groupBy(gp);

			// 現状在庫更新リスト作成
			makeSTKList(sum_up);
			
			if (_msgList.size() > 0) {
				setError(_msgList);
			}

			// 指定の受払区分の更新リスト作成
			makeMLY_STK_DTLList(sum_up_m);

			// 月末在庫の更新リスト作成
			makeEND_STK_DTLList(sum_up_m);

			if (_msgList.size() > 0) {
				setError(_msgList);
			}
			
			// データベース更新
			updSTK();
			updMLY_STK_DTL();

			// 検査受払予定更新
			updInspSchd();

			// 購買受払予定更新
			updTranIns();
		}

		/**
		 * 初期化
		 * <p>
		 */
		protected void initVar() {
			_ins_stkL = MCList.create(MST_STK_R.class);
			_upd_stkL = MCList.create(MST_STK_R.class);
			_del_stkL = MCList.create(MST_STK_R.class);
			_insp_stkL = MCList.create(MST_STK_R.class);
			_purc_stkL = MCList.create(MST_STK_R.class);
			_ins_mstkL = MCList.create(MST_MLY_STK_DTL_R.class);
			_upd_mstkL = MCList.create(MST_MLY_STK_DTL_R.class);
			_del_mstkL = MCList.create(MST_MLY_STK_DTL_R.class);

			_msgList = new MCMessageList();
		}

		/**
		 * 現状在庫の更新リスト作成
		 * <p>
		 */
		protected void makeSTKList(MCList<Stk_Upd01_DtlR> sum_up) {

			// 処理対象を検索(ロック)
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);

			insStkWk(sum_up);
			executeQuery(stkL, MSBEL5030_MST_STK_S01());

			MCIndexKey index = stkL.createIndex(stkL.createRow().getKeyColumn());

			// キー項目でソート
			sum_up.sort(stkL.createRow().getKeyColumn());

			for (Stk_Upd01_DtlR row : sum_up) {
				// 0なら更新しない
				if (row.pack_unit_qty().isZero() && row.base_unit_qty().isZero()) {
					continue;
				}

				// 引数を条件に在庫テーブル（キャッシュ）を検索
				MST_STK_R stkR = stkL.getFirst(index, getVals(row, stkL.createRow().getKeyColumn()));

				// レコードが存在しなければInsert
				if (isNull(stkR)) {
					stkR = MST_STK_R.create();

					copy(stkR, row, createMap_MST_STK_R_Stk_Upd01_DtlR());

					// 数量のチェック
					chkMeta(stkR, row.minus_stk_flg());

					// 挿入リスト
					_ins_stkL.add(stkR);
				}
				// レコードが存在すればUpdate
				else {
					// 数量計算
					MCNumber bfrBaseUnitQty = stkR.base_unit_qty();
					stkR.pack_unit_qty(stkR.pack_unit_qty().add(row.pack_unit_qty()));
					stkR.base_unit_qty(stkR.base_unit_qty().add(row.base_unit_qty()));
					// 数量が０となる場合は削除
					if (stkR.pack_unit_qty().isZero() && stkR.base_unit_qty().isZero()) {
						// 削除リスト
						_del_stkL.add(stkR);
					}
					else {
						// 数量のチェック
						// ※数量が増えるor変わらない場合は、マイナス在庫を許可する（一度マイナス在庫が発生した後に、一部数量のみ入庫が行われた際にエラーとしないようにする考慮）
						if (stkR.base_unit_qty().gte(bfrBaseUnitQty)) {
							chkMeta(stkR, true);
						}
						else {
							chkMeta(stkR, row.minus_stk_flg());
						}

						// 更新リスト
						_upd_stkL.add(stkR);
					}
				}
			}
			
			MCList<MST_STK_R> tmpStkL = MCList.create(MST_STK_R.class);
			addAll(tmpStkL, sum_up, createMap_MST_STK_R_Stk_Upd01_DtlR());
			for(MST_STK_R stkR : tmpStkL) {
				// 検査予定登録サービス呼び出し対象リストに追加しておく
				// 在庫検査区分が検査済でない
				if (!MSC_STK_INSP_TYP.isFIN(stkR.stk_insp_typ())) {
					_insp_stkL.add(stkR);
				}

				// 購買受払予定サービス呼び出し対象リストに追加しておく
				// 在庫識別区分が仕入検収前
				// 確定ＮＯ区分が仕入実績受払ＮＯ

				// 引数を条件に在庫テーブル（キャッシュ）を検索
				MST_STK_R tmpStkR = stkL.getFirst(index, getVals(stkR, stkL.createRow().getKeyColumn()));
				if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stkR.stk_id_typ()) || MSC_FIX_NO_TYP.isPURC_ACT_IO_NO(stkR.fix_no_typ())) {
					if (isNull(tmpStkR)) {
						_purc_stkL.add(stkR);
					}
					else {
						_purc_stkL.add(tmpStkR);
					}
				}
			}
		}

		/**
		 * 月次受払在庫の更新リスト作成
		 * <p>
		 */
		protected void makeMLY_STK_DTLList(MCList<Stk_Upd01_DtlR> sum_up_m) {

			// 処理対象を検索(ロック)
			MCList<MST_MLY_STK_DTL_R> mstkL = MCList.create(MST_MLY_STK_DTL_R.class);

			insMlyStkWk(sum_up_m);
			executeQuery(mstkL, MSBEL5030_MST_MLY_STK_DTL_S01());

			MCIndexKey index = mstkL.createIndex(mstkL.createRow().getKeyColumn());

			// キー項目でソート
			sum_up_m.sort(mstkL.createRow().getKeyColumn());

			for (Stk_Upd01_DtlR row : sum_up_m) {
				// 0なら更新しない
				if (row.pack_unit_qty().isZero() && row.base_unit_qty().isZero()) {
					continue;
				}

				// 引数を条件にテーブル（キャッシュ）を検索
				MST_MLY_STK_DTL_R mstkR = mstkL.getFirst(index, getVals(row, mstkL.createRow().getKeyColumn()));

				// レコードが存在しなければInsert
				if (isNull(mstkR)) {
					mstkR = MST_MLY_STK_DTL_R.create();

					copy(mstkR, row, createMap_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR());

					// 数量チェック
					chkMeta(mstkR, row.minus_stk_flg());

					// 挿入リスト
					_ins_mstkL.add(mstkR);
				}
				// レコードが存在すればUpdate
				else {
					// 数量計算
					mstkR.pack_unit_qty(mstkR.pack_unit_qty().add(row.pack_unit_qty()));
					mstkR.base_unit_qty(mstkR.base_unit_qty().add(row.base_unit_qty()));

					// 数量が０となる場合は削除
					if (mstkR.pack_unit_qty().isZero() && mstkR.base_unit_qty().isZero()) {
						// 削除リスト
						_del_mstkL.add(mstkR);
					}
					else {
						// 数量チェック
						chkMeta(mstkR, row.minus_stk_flg());

						// 更新リスト
						_upd_mstkL.add(mstkR);
					}
				}
			}
		}

		/**
		 * 月末在庫の更新リスト作成
		 * <p>
		 */
		protected void makeEND_STK_DTLList(MCList<Stk_Upd01_DtlR> sum_up_m) {
			MCList<MST_MLY_STK_DTL_R> estkL = MCList.create(MST_MLY_STK_DTL_R.class);
			MST_MLY_STK_DTL_R estkR = MST_MLY_STK_DTL_R.create();
			MST_MLY_STK_DTL_R pre_estkR = MST_MLY_STK_DTL_R.create();
			String[] inYmKey = getSortKey_m();
			String[] exYmKey = getCmpCols_m();

			// 前処理
			for (Stk_Upd01_DtlR row : sum_up_m) {
				// 0なら処理しない
				if (row.pack_unit_qty().isZero() && row.base_unit_qty().isZero()) {
					continue;
				}

				// 出庫の場合は符号を反転
				if (MSC_IO_TYP.isGI(MSC_IO_ACT_TYP.io_typ(row.io_act_typ()))) {
					row.pack_unit_qty(row.pack_unit_qty().negate());
					row.base_unit_qty(row.base_unit_qty().negate());
				}
			}
			sum_up_m.setString(Stk_Upd01_DtlR.$io_act_typ, MSC_IO_ACT_TYP.END_STK.value());
			MCGroupByPolicy gp_m = getGroupPolicy_m();
			MCList<Stk_Upd01_DtlR> sum_up2 = sum_up_m.groupBy(gp_m);

			// 処理対象を検索(ロック)
			insMlyStkWk(sum_up2);
			executeQuery(estkL, MSBEL5030_MST_MLY_STK_DTL_S02());

			estkL = estkL.groupBy(estkL.getNameArray());
			estkL.addBooleanColumn(_isINS, false);
			estkL.addBooleanColumn(_isUPD, false);
			estkL.addBooleanColumn(_minusStk, false);
			for (MST_MLY_STK_DTL_R r : estkL) {
				r.addNumberColumn(_orgBqty, r.base_unit_qty());
				r.addNumberColumn(_orgPqty, r.pack_unit_qty());
			}

			// データ作成処理
			sum_up2.sort(inYmKey);
			for (Stk_Upd01_DtlR row : sum_up2) {
				// 更新対象となる在庫リストを抽出する
				MCList<MST_MLY_STK_DTL_R> subL = estkL.subList(exYmKey, getVals(row, exYmKey));
				
				if (isNull(subL)) {
					// 在庫なし
					insMlyStkL(estkL, row);
				}
				else {
					subL.sort(SortType.ASC, MST_MLY_STK_DTL_R.$ac_ym);
					MCDate minYm = (MCDate) subL.min(MST_MLY_STK_DTL_R.$ac_ym);
					MCDate maxYm = (MCDate) subL.max(MST_MLY_STK_DTL_R.$ac_ym);
					
					// 在庫リストから当月レコードを抽出する
					estkR = subL.getFirst(MST_MLY_STK_DTL_R.$ac_ym, row.ac_ym());
					if (isNull(estkR)) {
						// 当月がない場合は過去にさかのぼる
						Stk_Upd01_DtlR p_row = row.clone();
						p_row.ac_ym(p_row.ac_ym().addMonth(-1));
						pre_estkR = null;
						while (p_row.ac_ym().gte(minYm)) {
							pre_estkR = subL.getFirst(MST_MLY_STK_DTL_R.$ac_ym, p_row.ac_ym());
							if (!isNull(pre_estkR)) break;
							p_row.ac_ym(p_row.ac_ym().addMonth(-1));
						}							

						// 直近の過去レコードの数量が0の場合はないものとして扱う
						if (!isNull(pre_estkR) && pre_estkR.base_unit_qty().isZero() && pre_estkR.pack_unit_qty().isZero()) {
							pre_estkR = null;
						}

						if (isNull(pre_estkR)) {
							// 過去レコードが見つからない場合は当月を追加
							insMlyStkL(estkL, row);
						}
						else {
							// 見つかった場合はその月の翌月から当月まで追加
							p_row.ac_ym(p_row.ac_ym().addMonth(1));
							p_row.base_unit_qty(pre_estkR.base_unit_qty());
							p_row.pack_unit_qty(pre_estkR.pack_unit_qty());
							while (p_row.ac_ym().lte(row.ac_ym())) {
								if (isSame(p_row.ac_ym(), row.ac_ym())) {
									// 当月分は差分を考慮
									p_row.base_unit_qty(p_row.base_unit_qty().add(row.base_unit_qty()));
									p_row.pack_unit_qty(p_row.pack_unit_qty().add(row.pack_unit_qty()));
								}
								insMlyStkL(estkL, p_row);
								p_row.ac_ym(p_row.ac_ym().addMonth(1));
							}
						}
					}
					else {
						// 当月が見つかった場合は更新
						updMlyStkR(estkR, row);
					}
					
					// 次月以降の処理
					Stk_Upd01_DtlR f_row = row.clone();
					f_row.ac_ym(f_row.ac_ym().addMonth(1));
					while (f_row.ac_ym().lte(maxYm)) {
						estkR = subL.getFirst(MST_MLY_STK_DTL_R.$ac_ym, f_row.ac_ym());
						if (isNull(estkR)) {
							insMlyStkL(estkL, f_row);
						}
						else {
							updMlyStkR(estkR, row);
						}
						f_row.ac_ym(f_row.ac_ym().addMonth(1));
					}
				}
			}

			// 更新リスト追加
			MCList<MST_MLY_STK_DTL_R> ins_estkL = MCList.create(MST_MLY_STK_DTL_R.class);
			MCList<MST_MLY_STK_DTL_R> upd_estkL = MCList.create(MST_MLY_STK_DTL_R.class);

			ins_estkL = estkL.subList(_isINS, true);
			upd_estkL = estkL.subList(new String[]{_isINS, _isUPD}, new Comparable[]{false, true});
			
			if (!isNull(ins_estkL)) {
				ins_estkL.sort(inYmKey);
				for (MST_MLY_STK_DTL_R r : ins_estkL) {
					chkMeta(r, r.getBooleanNE(_minusStk));
				}
				_ins_mstkL.addAll(ins_estkL);
			}
			if (!isNull(upd_estkL)) {
				upd_estkL.sort(inYmKey);
				for (MST_MLY_STK_DTL_R r : upd_estkL) {
					chkMeta(r, r.getBooleanNE(_minusStk));
				}
				_upd_mstkL.addAll(upd_estkL);
			}
		}

		/**
		 * 月次在庫リストにレコードを追加する
		 * <p>
		 */
		protected void insMlyStkL(MCList<MST_MLY_STK_DTL_R> mstkL, Stk_Upd01_DtlR row) {
			MST_MLY_STK_DTL_R mstkR = MST_MLY_STK_DTL_R.create();
			copy(mstkR, row, createMap_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR());
			mstkR.addBooleanColumn(_isINS, true);
			mstkR.addBooleanColumn(_minusStk, row.minus_stk_flg());
			mstkL.add(mstkR);
		}

		/**
		 * 月次在庫リストの数量を変更する
		 * <p>
		 */
		protected void updMlyStkR(MST_MLY_STK_DTL_R mstkR, Stk_Upd01_DtlR row) {
			MCNumber bfrBaseUnitQty = mstkR.base_unit_qty();
			mstkR.base_unit_qty(mstkR.base_unit_qty().add(row.base_unit_qty()));
			mstkR.pack_unit_qty(mstkR.pack_unit_qty().add(row.pack_unit_qty()));
			if (isSame(mstkR.base_unit_qty(), mstkR.getNumberNE(_orgBqty))
					&& isSame(mstkR.pack_unit_qty(), mstkR.getNumberNE(_orgPqty))) {
				mstkR.setBooleanNE(_isUPD, false);
			}
			else {
				mstkR.setBooleanNE(_isUPD, true);
			}
			
			// 数量が増えるor変わらない場合は、マイナス在庫を許可する（一度マイナス在庫が発生した後に、一部数量のみ入庫が行われた際にエラーとしないようにする考慮）
			if (mstkR.base_unit_qty().gte(bfrBaseUnitQty)) {
				mstkR.setBooleanNE(_minusStk, true);
			}
			else {
				mstkR.setBooleanNE(_minusStk, row.minus_stk_flg());
			}
		}

		/**
		 * 現状在庫ワークに処理対象を登録する
		 * @param sum_up
		 */
		protected void insStkWk(MCList<Stk_Upd01_DtlR> sum_up) {
			MCList<MST_STK_R> insWkL = MCList.create(MST_STK_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_STK_R.create("T"));
			
			dbWkDelete("MSBEL5030_MSW_STK_D01", insWkL_bldr.getBaseDbc());

			addAll(insWkL, sum_up, createMap_MST_STK_R_Stk_Upd01_DtlR());
			dbWkInsert("MSBEL5030_MSW_STK_I01", insWkL, insWkL_bldr.getBaseDbc());
			MSW_STK_KEY_R S0 = MSW_STK_KEY_R.create("T");
			MCMainQuery q = sql("MSBEL5030_MSW_STK_KEY_S01")
				.mainQuery()
				.select(S0.itm_cd)
				.from(S0);
			q.executeQuery(insWkL);
		}
		/**
		 * 月次受払在庫ワークに処理対象を登録する
		 * @param sum_up_m
		 */
		protected void insMlyStkWk(MCList<Stk_Upd01_DtlR> sum_up_m) {
			MCList<MST_MLY_STK_DTL_R> insWkL = MCList.create(MST_MLY_STK_DTL_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_MLY_STK_DTL_R.create("T"));
			
			dbWkDelete("MSBEL5030_MSW_MLY_STK_DTL_D01", insWkL_bldr.getBaseDbc());

			addAll(insWkL, sum_up_m, createMap_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR());
			dbWkInsert("MSBEL5030_MSW_MLY_STK_DTL_I01", insWkL, insWkL_bldr.getBaseDbc());
		}
		/**
		 * 現状在庫ワークに処理対象を登録する
		 * @param bindL
		 */
		protected void insStkWk2(MCList<MST_STK_R> bindL) {
			MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MST_STK_R.create("T"));
			dbWkDelete("MSBEL5030_MSW_STK_D02", bindL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5030_MSW_STK_I02", bindL, bindL_bldr.getBaseDbc());
		}

		/**
		 * 現状在庫データベースを更新する
		 * <p>
		 */
		protected void updSTK() {
			MST_STK_R stkL_t = MST_STK_R.create("T");
			MCQueryApiBuilder upd_stkL_bldr = MCQueryApiBuilder.create(stkL_t);
			upd_stkL_bldr.setSet(stkL_t.pack_unit_qty, stkL_t.base_unit_qty);

			if (!isNull(_ins_stkL)) dbInsertEx("MSBEL5030_MST_STK_I01", _ins_stkL,
					MCQueryApiBuilder.create(stkL_t), MSBEL0033);
			if (!isNull(_upd_stkL)) dbUpdateKey("MSBEL5030_MST_STK_U01", _upd_stkL, upd_stkL_bldr);
			if (!isNull(_del_stkL)) dbDeleteKey("MSBEL5030_MST_STK_D01", _del_stkL,
					MCQueryApiBuilder.create(stkL_t));
		}
		/**
		 * 月次受払在庫データベースを更新する
		 * <p>
		 */
		protected void updMLY_STK_DTL() {
			MST_MLY_STK_DTL_R mstkL_t = MST_MLY_STK_DTL_R.create("T");
			MCQueryApiBuilder upd_mstkL_bldr = MCQueryApiBuilder.create(mstkL_t);
			upd_mstkL_bldr.setSet(mstkL_t.pack_unit_qty, mstkL_t.base_unit_qty);
			
			if (!isNull(_ins_mstkL)) dbInsertEx("MSBEL5030_MST_MLY_STK_DTL_I01",
					_ins_mstkL, MCQueryApiBuilder.create(mstkL_t), MSBEL0033);
			if (!isNull(_upd_mstkL)) dbUpdateKey("MSBEL5030_MST_MLY_STK_DTL_U01", _upd_mstkL, upd_mstkL_bldr);
			if (!isNull(_del_mstkL)) dbDeleteKey("MSBEL5030_MST_MLY_STK_DTL_D01",
					_del_mstkL, MCQueryApiBuilder.create(mstkL_t));
		}

		/**
		 * 検査受払予定更新
		 * <p>
		 */
		protected void updInspSchd() {
			MCList<MST_STK_R> bindL = MCList.create(MST_STK_R.class);
			MCList<MST_STK_R> inspL = MCList.create(MST_STK_R.class);
			
			if (_insp_stkL.isEmpty()) return;

			// 検査予定登録サービス呼び出し対象リストから確定ＮＯ区分、確定ＮＯを抽出する
			bindL = _insp_stkL.groupBy(MST_STK_R.$fix_no_typ, MST_STK_R.$fix_no);

			// 確定ＮＯ区分、確定ＮＯを条件に現状在庫を検索する
			insStkWk2(bindL);
			executeQuery(inspL, MSBEL5030_MST_STK_S02());
			
			// 削除した分を追加しておく
			for(MST_STK_R r : _insp_stkL) {
				if(MCNumber.ZERO.gte(r.pack_unit_qty())) {
					r.pack_unit_qty(MCNumber.ZERO);
					r.base_unit_qty(MCNumber.ZERO);
					inspL.add(r);
				}
			}
			
			// Mapping
			MSBFL_InspSchdService.InspSchd_Upd04 o = MSBFL_InspSchdService.crtInspSchd_Upd04();
			addAll(o.up0(), inspL, createMap_InspSchd_Upd04_CndR_MST_STK_R());

			// Call
			o.exec();
		}

		/**
		 * 購買受払予定更新
		 * <p>
		 */
		protected void updTranIns() {
			MCList<MST_STK_R> bindL = MCList.create(MST_STK_R.class);
			MCList<MST_STK_R> purcL = MCList.create(MST_STK_R.class);

			if (_purc_stkL.isEmpty()) return;

			// 購買受払予定サービス呼び出し対象リストから確定ＮＯ区分、確定ＮＯを抽出する
			bindL = _purc_stkL.groupBy(MST_STK_R.$fix_no_typ, MST_STK_R.$fix_no);

			// 確定ＮＯ区分、確定ＮＯを条件に現状在庫を検索する
			insStkWk2(bindL);
			executeQuery(purcL, MSBEL5030_MST_STK_S02());
			
			// 削除した分を追加しておく
			for(MST_STK_R r : _purc_stkL) {
				if(MCNumber.ZERO.gte(r.pack_unit_qty())) {
					r.pack_unit_qty(MCNumber.ZERO);
					r.base_unit_qty(MCNumber.ZERO);
					purcL.add(r);
				}
			}
			
			// Mapping
			MSBDL_PurcIoSchdRegService.PurcIoSchd_Upd01 o = MSBDL_PurcIoSchdRegService.crtPurcIoSchd_Upd01();
			addAll(o.up0(), purcL, createMap_PurcIoSchd_Upd01_DtlR_MST_STK_R());

			// Call
			o.exec();
		}

		/**
		 * グループポリシーを取得する（現状在庫）
		 * <p>
		 */
		protected MCGroupByPolicy getGroupPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(
					Stk_Upd01_DtlR.$itm_cd,
					Stk_Upd01_DtlR.$itm_sub1,
					Stk_Upd01_DtlR.$itm_sub2,
					Stk_Upd01_DtlR.$itm_sub3,
					Stk_Upd01_DtlR.$loc_cd,
					Stk_Upd01_DtlR.$str_ln_cd,
					Stk_Upd01_DtlR.$stk_arrv_bp_cd,
					Stk_Upd01_DtlR.$lot_no,
					Stk_Upd01_DtlR.$sublot_no,
					Stk_Upd01_DtlR.$sno1,
					Stk_Upd01_DtlR.$sno2,
					Stk_Upd01_DtlR.$sno3,
					Stk_Upd01_DtlR.$sno4,
					Stk_Upd01_DtlR.$fix_no_typ,
					Stk_Upd01_DtlR.$fix_no,
					Stk_Upd01_DtlR.$pack_unit_cd,
					Stk_Upd01_DtlR.$gd_cd,
					Stk_Upd01_DtlR.$in_xfr_typ,
					Stk_Upd01_DtlR.$quality_typ,
					Stk_Upd01_DtlR.$asst_typ,
					Stk_Upd01_DtlR.$stk_insp_typ,
					Stk_Upd01_DtlR.$stk_id_typ,
					Stk_Upd01_DtlR.$stk_bp_cd
			);
			gp.sum(Stk_Upd01_DtlR.$pack_unit_qty, Stk_Upd01_DtlR.$base_unit_qty);
			gp.max(Stk_Upd01_DtlR.$minus_stk_flg);
			return gp;
		}
		/**
		 * グループポリシーを取得する（月次受払在庫）
		 * <p>
		 */
		protected MCGroupByPolicy getGroupPolicy_m() {
			MCGroupByPolicy gp_m = new MCGroupByPolicy(getSortKey_m());
			gp_m.sum(Stk_Upd01_DtlR.$pack_unit_qty, Stk_Upd01_DtlR.$base_unit_qty);
			gp_m.max(Stk_Upd01_DtlR.$minus_stk_flg);
			return gp_m;
		}
		/**
		 * ソートキーを取得する（月次受払在庫）
		 * <p>
		 */
		protected String[] getSortKey_m() {
			return new String[]{
					Stk_Upd01_DtlR.$itm_cd,
					Stk_Upd01_DtlR.$itm_sub1,
					Stk_Upd01_DtlR.$itm_sub2,
					Stk_Upd01_DtlR.$itm_sub3,
					Stk_Upd01_DtlR.$loc_cd,
					Stk_Upd01_DtlR.$str_ln_cd,
					Stk_Upd01_DtlR.$stk_arrv_bp_cd,
					Stk_Upd01_DtlR.$lot_no,
					Stk_Upd01_DtlR.$sublot_no,
					Stk_Upd01_DtlR.$sno1,
					Stk_Upd01_DtlR.$sno2,
					Stk_Upd01_DtlR.$sno3,
					Stk_Upd01_DtlR.$sno4,
					Stk_Upd01_DtlR.$fix_no_typ,
					Stk_Upd01_DtlR.$fix_no,
					Stk_Upd01_DtlR.$pack_unit_cd,
					Stk_Upd01_DtlR.$gd_cd,
					Stk_Upd01_DtlR.$in_xfr_typ,
					Stk_Upd01_DtlR.$quality_typ,
					Stk_Upd01_DtlR.$asst_typ,
					Stk_Upd01_DtlR.$stk_insp_typ,
					Stk_Upd01_DtlR.$stk_id_typ,
					Stk_Upd01_DtlR.$stk_bp_cd,
					Stk_Upd01_DtlR.$io_act_typ,
					Stk_Upd01_DtlR.$ac_ym
			};
		}
		/**
		 * 比較カラムを取得する（月次受払在庫）
		 * <p>
		 */
		protected String[] getCmpCols_m() {
			return new String[]{
					Stk_Upd01_DtlR.$itm_cd,
					Stk_Upd01_DtlR.$itm_sub1,
					Stk_Upd01_DtlR.$itm_sub2,
					Stk_Upd01_DtlR.$itm_sub3,
					Stk_Upd01_DtlR.$loc_cd,
					Stk_Upd01_DtlR.$str_ln_cd,
					Stk_Upd01_DtlR.$stk_arrv_bp_cd,
					Stk_Upd01_DtlR.$lot_no,
					Stk_Upd01_DtlR.$sublot_no,
					Stk_Upd01_DtlR.$sno1,
					Stk_Upd01_DtlR.$sno2,
					Stk_Upd01_DtlR.$sno3,
					Stk_Upd01_DtlR.$sno4,
					Stk_Upd01_DtlR.$fix_no_typ,
					Stk_Upd01_DtlR.$fix_no,
					Stk_Upd01_DtlR.$pack_unit_cd,
					Stk_Upd01_DtlR.$gd_cd,
					Stk_Upd01_DtlR.$in_xfr_typ,
					Stk_Upd01_DtlR.$quality_typ,
					Stk_Upd01_DtlR.$asst_typ,
					Stk_Upd01_DtlR.$stk_insp_typ,
					Stk_Upd01_DtlR.$stk_id_typ,
					Stk_Upd01_DtlR.$stk_bp_cd,
					Stk_Upd01_DtlR.$io_act_typ
			};
		}

		/**
		 * 更新対象の数値をメタ情報と比較する（現状在庫）
		 * <p>
		 */
		protected void chkMeta(MST_STK_R dbc, boolean minus_stk_flg) {

			MCMessageList mp = dbc.validate(MST_STK_R.$pack_unit_qty);
			if(mp != null && mp.size() > 0) {
				MCMeta meta = dbc.getMeta(MST_STK_R.$pack_unit_qty);
				int length = meta.length();
				int scale = meta.scale();
				length -= scale;

				for (MCMessage msg : mp) {
					// マイナス数量
					if (isSame(msg.getID(), _isMinus) && !minus_stk_flg) {
						MCMessage aMsg = new MCMessage(
								dbc,
								null,
								MSBEL0034,
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty());
						_msgList.add(aMsg);
						return;
					}
					// 桁あふれ
					if (isSame(msg.getID(), _isOverflow)) {
						throw new MCAppException(dbc, null, MSBEL0036, 
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty(), length, scale);
					}
				}
			}
			MCMessageList mb = dbc.validate(MST_STK_R.$base_unit_qty);
			if(mb != null && mb.size() > 0) {
				MCMeta meta = dbc.getMeta(MST_STK_R.$base_unit_qty);
				int length = meta.length();
				int scale = meta.scale();
				length -= scale;

				for (MCMessage msg : mb) {
					// マイナス数量
					if (isSame(msg.getID(), _isMinus) && !minus_stk_flg) {
						MCMessage aMsg = new MCMessage(
								dbc,
								null,
								MSBEL0034,
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty());
						_msgList.add(aMsg);
						return;
					}
					// 桁あふれ
					if (isSame(msg.getID(), _isOverflow)) {
						throw new MCAppException(dbc, null, MSBEL0036, 
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty(), length, scale);
					}
				}
			}
		}
		/**
		 * 更新対象の数値をメタ情報と比較する（月次受払在庫）
		 * <p>
		 */
		protected void chkMeta(MST_MLY_STK_DTL_R dbc, boolean minus_stk_flg) {

			MCMessageList mp = dbc.validate(MST_MLY_STK_DTL_R.$pack_unit_qty);
			if(mp != null && mp.size() > 0) {
				MCMeta meta = dbc.getMeta(MST_MLY_STK_DTL_R.$pack_unit_qty);
				int length = meta.length();
				int scale = meta.scale();
				length -= scale;

				for (MCMessage msg : mp) {
					// マイナス数量
					if (MSC_IO_ACT_TYP.isEND_STK(dbc.io_act_typ()) && isSame(msg.getID(), _isMinus) && !minus_stk_flg) {
						MCMessage aMsg = new MCMessage(
								dbc,
								null,
								MSBEL0035,
								toYMString(dbc.ac_ym()), dbc.io_act_typ(),
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty());
						_msgList.add(aMsg);
						return;
					}
					// 桁あふれ
					if (isSame(msg.getID(), _isOverflow)) {
						throw new MCAppException(dbc, null, MSBEL0037,
								toYMString(dbc.ac_ym()), dbc.io_act_typ(),
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty(), length, scale);
					}
				}
			}
			MCMessageList mb = dbc.validate(MST_MLY_STK_DTL_R.$base_unit_qty);
			if(mb != null && mb.size() > 0) {
				MCMeta meta = dbc.getMeta(MST_MLY_STK_DTL_R.$base_unit_qty);
				int length = meta.length();
				int scale = meta.scale();
				length -= scale;

				for (MCMessage msg : mb) {
					// マイナス数量
					if (MSC_IO_ACT_TYP.isEND_STK(dbc.io_act_typ()) && isSame(msg.getID(), _isMinus) && !minus_stk_flg) {
						MCMessage aMsg = new MCMessage(
								dbc,
								null,
								MSBEL0035,
								toYMString(dbc.ac_ym()), dbc.io_act_typ(),
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty());
						_msgList.add(aMsg);
						return;
					}
					// 桁あふれ
					if (isSame(msg.getID(), _isOverflow)) {
						throw new MCAppException(dbc, null, MSBEL0037,
								toYMString(dbc.ac_ym()), dbc.io_act_typ(),
								toDispItm(dbc.itm_cd(), dbc.itm_sub1(), dbc.itm_sub2(), dbc.itm_sub3()),
								dbc.loc_cd(), dbc.str_ln_cd(), dbc.stk_arrv_bp_cd(),
								dbc.lot_no(), dbc.sublot_no(),
								toDispSno(dbc.sno1(), dbc.sno2(), dbc.sno3(), dbc.sno4()),
								dbc.fix_no_typ(), dbc.fix_no(),
								dbc.pack_unit_cd(), dbc.gd_cd(),
								dbc.in_xfr_typ(), dbc.quality_typ(), dbc.asst_typ(),
								dbc.stk_insp_typ(), dbc.stk_id_typ(), dbc.stk_bp_cd(),
								dbc.pack_unit_qty(), dbc.base_unit_qty(), length, scale);
					}
				}
			}
		}
	}

	/**
	 * ロウの値を配列に変換する
	 * <p>
	 */
	@SuppressWarnings("unchecked")
	protected Comparable[] getVals(MCRow row, String[] keys) {
		Comparable[] vals = new Comparable[keys.length];
		int i = 0;
		for (String col : keys) {
			vals[i] = row.getValueNE(col);
			i++;
		}
		return vals;
	}

	/**
	 * 現状在庫へのマッピング
	 * <p>
	 */
	protected Map_MST_STK_R_Stk_Upd01_DtlR<MST_STK_R,Stk_Upd01_DtlR> createMap_MST_STK_R_Stk_Upd01_DtlR() {
		return new Map_MST_STK_R_Stk_Upd01_DtlR<MST_STK_R, Stk_Upd01_DtlR>();
	}

	public class Map_MST_STK_R_Stk_Upd01_DtlR<D extends MST_STK_R, S extends Stk_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STK_R.$itm_cd, Stk_Upd01_DtlR.$itm_cd);
			addColumnPathMap(MST_STK_R.$itm_sub1, Stk_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(MST_STK_R.$itm_sub2, Stk_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(MST_STK_R.$itm_sub3, Stk_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(MST_STK_R.$loc_cd, Stk_Upd01_DtlR.$loc_cd);
			addColumnPathMap(MST_STK_R.$str_ln_cd, Stk_Upd01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_STK_R.$stk_arrv_bp_cd, Stk_Upd01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(MST_STK_R.$lot_no, Stk_Upd01_DtlR.$lot_no);
			addColumnPathMap(MST_STK_R.$sublot_no, Stk_Upd01_DtlR.$sublot_no);
			addColumnPathMap(MST_STK_R.$sno1, Stk_Upd01_DtlR.$sno1);
			addColumnPathMap(MST_STK_R.$sno2, Stk_Upd01_DtlR.$sno2);
			addColumnPathMap(MST_STK_R.$sno3, Stk_Upd01_DtlR.$sno3);
			addColumnPathMap(MST_STK_R.$sno4, Stk_Upd01_DtlR.$sno4);
			addColumnPathMap(MST_STK_R.$fix_no_typ, Stk_Upd01_DtlR.$fix_no_typ);
			addColumnPathMap(MST_STK_R.$fix_no, Stk_Upd01_DtlR.$fix_no);
			addColumnPathMap(MST_STK_R.$pack_unit_cd, Stk_Upd01_DtlR.$pack_unit_cd);
			addColumnPathMap(MST_STK_R.$gd_cd, Stk_Upd01_DtlR.$gd_cd);
			addColumnPathMap(MST_STK_R.$in_xfr_typ, Stk_Upd01_DtlR.$in_xfr_typ);
			addColumnPathMap(MST_STK_R.$quality_typ, Stk_Upd01_DtlR.$quality_typ);
			addColumnPathMap(MST_STK_R.$asst_typ, Stk_Upd01_DtlR.$asst_typ);
			addColumnPathMap(MST_STK_R.$stk_insp_typ, Stk_Upd01_DtlR.$stk_insp_typ);
			addColumnPathMap(MST_STK_R.$stk_id_typ, Stk_Upd01_DtlR.$stk_id_typ);
			addColumnPathMap(MST_STK_R.$stk_bp_cd, Stk_Upd01_DtlR.$stk_bp_cd);
			addColumnPathMap(MST_STK_R.$pack_unit_qty, Stk_Upd01_DtlR.$pack_unit_qty);
			addColumnPathMap(MST_STK_R.$base_unit_qty, Stk_Upd01_DtlR.$base_unit_qty);

		}
	}
	/**
	 * 月次受払在庫へのマッピング
	 * <p>
	 */
	protected Map_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR<MST_MLY_STK_DTL_R,Stk_Upd01_DtlR> createMap_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR() {
		return new Map_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR<MST_MLY_STK_DTL_R, Stk_Upd01_DtlR>();
	}

	public class Map_MST_MLY_STK_DTL_R_Stk_Upd01_DtlR<D extends MST_MLY_STK_DTL_R, S extends Stk_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_MLY_STK_DTL_R.$ac_ym, Stk_Upd01_DtlR.$ac_ym);
			addColumnPathMap(MST_MLY_STK_DTL_R.$io_act_typ, Stk_Upd01_DtlR.$io_act_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$itm_cd, Stk_Upd01_DtlR.$itm_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$itm_sub1, Stk_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(MST_MLY_STK_DTL_R.$itm_sub2, Stk_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(MST_MLY_STK_DTL_R.$itm_sub3, Stk_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(MST_MLY_STK_DTL_R.$loc_cd, Stk_Upd01_DtlR.$loc_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$str_ln_cd, Stk_Upd01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$stk_arrv_bp_cd, Stk_Upd01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$lot_no, Stk_Upd01_DtlR.$lot_no);
			addColumnPathMap(MST_MLY_STK_DTL_R.$sublot_no, Stk_Upd01_DtlR.$sublot_no);
			addColumnPathMap(MST_MLY_STK_DTL_R.$sno1, Stk_Upd01_DtlR.$sno1);
			addColumnPathMap(MST_MLY_STK_DTL_R.$sno2, Stk_Upd01_DtlR.$sno2);
			addColumnPathMap(MST_MLY_STK_DTL_R.$sno3, Stk_Upd01_DtlR.$sno3);
			addColumnPathMap(MST_MLY_STK_DTL_R.$sno4, Stk_Upd01_DtlR.$sno4);
			addColumnPathMap(MST_MLY_STK_DTL_R.$fix_no_typ, Stk_Upd01_DtlR.$fix_no_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$fix_no, Stk_Upd01_DtlR.$fix_no);
			addColumnPathMap(MST_MLY_STK_DTL_R.$pack_unit_cd, Stk_Upd01_DtlR.$pack_unit_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$gd_cd, Stk_Upd01_DtlR.$gd_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$in_xfr_typ, Stk_Upd01_DtlR.$in_xfr_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$quality_typ, Stk_Upd01_DtlR.$quality_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$asst_typ, Stk_Upd01_DtlR.$asst_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$stk_insp_typ, Stk_Upd01_DtlR.$stk_insp_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$stk_id_typ, Stk_Upd01_DtlR.$stk_id_typ);
			addColumnPathMap(MST_MLY_STK_DTL_R.$stk_bp_cd, Stk_Upd01_DtlR.$stk_bp_cd);
			addColumnPathMap(MST_MLY_STK_DTL_R.$pack_unit_qty, Stk_Upd01_DtlR.$pack_unit_qty);
			addColumnPathMap(MST_MLY_STK_DTL_R.$base_unit_qty, Stk_Upd01_DtlR.$base_unit_qty);

		}
	}

	/**
	 * 検査受払更新へのマッピング
	 * <p>
	 */
	protected Map_InspSchd_Upd04_CndR_MST_STK_R<InspSchd_Upd04_CndR,MST_STK_R> createMap_InspSchd_Upd04_CndR_MST_STK_R() {
		return new Map_InspSchd_Upd04_CndR_MST_STK_R<InspSchd_Upd04_CndR, MST_STK_R>();
	}

	public class Map_InspSchd_Upd04_CndR_MST_STK_R<D extends InspSchd_Upd04_CndR, S extends MST_STK_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Upd04_CndR.$fix_no_typ, MST_STK_R.$fix_no_typ);
			addColumnPathMap(InspSchd_Upd04_CndR.$fix_no, MST_STK_R.$fix_no);
			addColumnPathMap(InspSchd_Upd04_CndR.$itm_cd, MST_STK_R.$itm_cd);
			addColumnPathMap(InspSchd_Upd04_CndR.$itm_sub1, MST_STK_R.$itm_sub1);
			addColumnPathMap(InspSchd_Upd04_CndR.$itm_sub2, MST_STK_R.$itm_sub2);
			addColumnPathMap(InspSchd_Upd04_CndR.$itm_sub3, MST_STK_R.$itm_sub3);
			addColumnPathMap(InspSchd_Upd04_CndR.$lot_no, MST_STK_R.$lot_no);
			addColumnPathMap(InspSchd_Upd04_CndR.$sublot_no, MST_STK_R.$sublot_no);
			addColumnPathMap(InspSchd_Upd04_CndR.$sno1, MST_STK_R.$sno1);
			addColumnPathMap(InspSchd_Upd04_CndR.$sno2, MST_STK_R.$sno2);
			addColumnPathMap(InspSchd_Upd04_CndR.$sno3, MST_STK_R.$sno3);
			addColumnPathMap(InspSchd_Upd04_CndR.$sno4, MST_STK_R.$sno4);
			addColumnPathMap(InspSchd_Upd04_CndR.$loc_cd, MST_STK_R.$loc_cd);
			addColumnPathMap(InspSchd_Upd04_CndR.$str_ln_cd, MST_STK_R.$str_ln_cd);
			addColumnPathMap(InspSchd_Upd04_CndR.$pack_unit_qty, MST_STK_R.$pack_unit_qty);
			addColumnPathMap(InspSchd_Upd04_CndR.$pack_unit_cd, MST_STK_R.$pack_unit_cd);
			addColumnPathMap(InspSchd_Upd04_CndR.$base_unit_qty, MST_STK_R.$base_unit_qty);
			addColumnPathMap(InspSchd_Upd04_CndR.$gd_cd, MST_STK_R.$gd_cd);
			addColumnPathMap(InspSchd_Upd04_CndR.$quality_typ, MST_STK_R.$quality_typ);
			addColumnPathMap(InspSchd_Upd04_CndR.$asst_typ, MST_STK_R.$asst_typ);
			addColumnPathMap(InspSchd_Upd04_CndR.$stk_arrv_bp_cd, MST_STK_R.$stk_arrv_bp_cd);
			addColumnPathMap(InspSchd_Upd04_CndR.$stk_insp_typ, MST_STK_R.$stk_insp_typ);
			addColumnPathMap(InspSchd_Upd04_CndR.$stk_id_typ, MST_STK_R.$stk_id_typ);
			addColumnPathMap(InspSchd_Upd04_CndR.$stk_bp_cd, MST_STK_R.$stk_bp_cd);

		}
	}

	/**
	 * 購買受払予定へのマッピング
	 * <p>
	 */
	protected Map_PurcIoSchd_Upd01_DtlR_MST_STK_R<PurcIoSchd_Upd01_DtlR,MST_STK_R> createMap_PurcIoSchd_Upd01_DtlR_MST_STK_R() {
		return new Map_PurcIoSchd_Upd01_DtlR_MST_STK_R<PurcIoSchd_Upd01_DtlR, MST_STK_R>();
	}

	public class Map_PurcIoSchd_Upd01_DtlR_MST_STK_R<D extends PurcIoSchd_Upd01_DtlR, S extends MST_STK_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$fix_no_typ, MST_STK_R.$fix_no_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$fix_no, MST_STK_R.$fix_no);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_cd, MST_STK_R.$itm_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_sub1, MST_STK_R.$itm_sub1);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_sub2, MST_STK_R.$itm_sub2);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$itm_sub3, MST_STK_R.$itm_sub3);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$lot_no, MST_STK_R.$lot_no);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sublot_no, MST_STK_R.$sublot_no);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno1, MST_STK_R.$sno1);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno2, MST_STK_R.$sno2);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno3, MST_STK_R.$sno3);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$sno4, MST_STK_R.$sno4);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$loc_cd, MST_STK_R.$loc_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$str_ln_cd, MST_STK_R.$str_ln_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$pack_unit_qty, MST_STK_R.$pack_unit_qty);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$pack_unit_cd, MST_STK_R.$pack_unit_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$base_unit_qty, MST_STK_R.$base_unit_qty);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$gd_cd, MST_STK_R.$gd_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$quality_typ, MST_STK_R.$quality_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$asst_typ, MST_STK_R.$asst_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_arrv_bp_cd, MST_STK_R.$stk_arrv_bp_cd);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_insp_typ, MST_STK_R.$stk_insp_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_id_typ, MST_STK_R.$stk_id_typ);
			addColumnPathMap(PurcIoSchd_Upd01_DtlR.$stk_bp_cd, MST_STK_R.$stk_bp_cd);

		}
	}

	protected void setError(MCMessageList msgList){
		int i = 0;
		MCAppException ex = new MCAppException(msgList.get(0));
		for (MCMessage aMsg : msgList) {
			if (i > 0) {
				ex.addCauseMessage(aMsg);
			}
			i++;
		}
		throw ex;
	}
	/**
	 * Stk_Upd02オペレーション.<p>
	 *
	 * 指定月の月次受払在庫から翌月の月次受払在庫を作成します。<br>
	 */
	public class Stk_Upd02 extends MSBEL_StkMngService_MC_A.Stk_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 締月の月末在庫を取得する（数量0とすでに翌月に存在する場合は除く）
			MCList<MST_MLY_STK_DTL_R> mstkL = MCList.create(MST_MLY_STK_DTL_R.class);
			executeQuery(mstkL, MSBEL5030_MST_MLY_STK_DTL_S03(), up0());

			if (!mstkL.isEmpty()) {
				mstkL.setDate(MST_MLY_STK_DTL_R.$ac_ym, up0().ac_ym().addMonth(1));
				dbInsertEx("MSBEL5030_MST_MLY_STK_DTL_I02", mstkL,
						MCQueryApiBuilder.create(MST_MLY_STK_DTL_R.create("T")), MSBEL0033);
			}
		}
	}

	//FMCB CUSTOM END
}