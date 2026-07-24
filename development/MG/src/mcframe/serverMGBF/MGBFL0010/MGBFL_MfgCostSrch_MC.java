package mcframe.serverMGBF.MGBFL0010;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMGBF.MGBFL0010.Query.*;
import mcframe.commonMGBF.MGBFC0010.MGBFC_ProdCostSrch;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MfgCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MfgCostSrch_MC extends MGBFL_MfgCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_MfgCostSrch_MC_A.Srch01 {
		// 集計対象のカラム名
		protected String[] _sumColNames = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}

		protected void editUp() {
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0010_MGT_ACC_TOP_S01(), up0());
			if (0 == down0().size()) {
				return;
			}

			// 後処理
			afterSrch();
		}

		protected void afterSrch() {
			for (Srch01_RsltR r : down0()) {
				// 合計項目の計算(月初仕掛＋発生)
				r.ttl(r.st_wip_cost().add(r.inst_cost()));
				// 完成項目の計算(月初仕掛＋発生－月末仕掛)
				r.comp_cost(r.st_wip_cost().add(r.inst_cost()).subtract(r.end_wip_cost()));
				
				r.act_upri(calcUnit(r.ttl(), nvl(r.qty(), MCNumber.ZERO), Srch01_RsltR.act_upri_META.scale()));
			}

			// 合計行を追加
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames());
			Srch01_RsltR sumRow = down0().groupBy(policy).get(0);
			for (String nm : getSumColNames()) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			down0().add(sumRow);
		}

		/**
		 * 集計対象のカラム名の配列を返す
		 */
		protected String[] getSumColNames() {
			if (_sumColNames == null) {
				_sumColNames = new String[] {
						Srch01_RsltR.$st_wip_cost, Srch01_RsltR.$end_wip_cost,
						Srch01_RsltR.$inst_cost, Srch01_RsltR.$comp_cost
				};
			}
			return _sumColNames;
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 製造原価を検索する<br>
	 */
	public class Srch02 extends MGBFL_MfgCostSrch_MC_A.Srch02 {
		// 集計対象のカラム名
		protected String[] _sumColNamesComp = null;
		protected String[] _sumColNamesSubTtl = null;
		protected String[] _sumColNamesTtlDown1 = null;
		protected String[] _sumColNamesTtlDown2 = null;

		protected String[] _clearColumns = null;
		protected String[] _clearAcColumns = null;
		protected String[] _clearColumnsCompRow = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			srch();
		}

		protected void srch() {
			// 合計の検索
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0010_MGT_ACC_TOP_S02(), up0());
			if (down0().isEmpty()) {
				return;
			}

			// 自レベル、下位レベルの検索
			addDynamicBind(up0(), down1());
			executeQuery(down1(), MGBFL0010_MGT_ACC_TOP_S03(), up0());
			addDynamicBind(up0(), down2());
			executeQuery(down2(), MGBFL0010_MGT_ACC_TOP_S04(), up0());
			
			// 後処理
			afterSrch();
		}

		protected void afterSrch() {
			afterDown0();
			afterDown1();
			afterDown2();
		}

		protected void afterDown0() {
			for (Srch02_RsltR r : down0()) {
				if (MGC_CALC_REC_TYP.isINST(r.calc_rec_typ())) {
					r.clear(clearColumns());
					r.clear(clearAcColumns());
				}
			}
		}

		protected void afterDown1() {
			if (isNull(down1())) {
				return ;
			}
			clearInstCompColumns(down1());
			calcTtlRow(down1(), true);
		}

		protected void afterDown2() {
			if (isNull(down2())) {
				return ;
			}
			clearInstCompColumns(down2());
			calcTtlRow(down2(), false);
		}

		protected void clearInstCompColumns(MCList<Srch02_RsltR> down) {
			for(Srch02_RsltR r : down) {
				if(MGC_CALC_REC_TYP.isCOMP(r.calc_rec_typ())) {
					r.clear(clearColumnsCompRow());
				}
				else if(MGC_CALC_REC_TYP.isINST(r.calc_rec_typ())) {
					r.clear(clearColumns());
				}
			}
		}

		/**
		 * 数量（進捗度）を計算する
		 * @param down
		 */
		protected void calcQtyPer(MCList<Srch02_RsltR> down) {
			for(Srch02_RsltR r : down) {
				if (!isNull(r.qty()) && !isNull(r.per())) {
					r.qty_per(r.qty().multiply(r.per()).divide(100));
				}
			}
		}

		/**
		 * 完成行の費目別金額を設定する
		 * @param down
		 */
		protected void calcCompRow(MCList<Srch02_RsltR> down) {
			setSumColNamesComp();

			MCList<Srch02_RsltR> rslt = MCList.create(Srch02_RsltR.class);
			MCList<Srch02_RsltR>[] listArray = down.groupList(Srch02_RsltR.$ym);
			Srch02_RsltR lastEndWipR = Srch02_RsltR.create();

			for (MCList<Srch02_RsltR> list : listArray) {
				Srch02_RsltR stWipR = Srch02_RsltR.create();
				Srch02_RsltR instR = Srch02_RsltR.create();
				Srch02_RsltR endWipR = Srch02_RsltR.create();
				Srch02_RsltR compR = list.getFirst(Srch02_RsltR.$calc_rec_typ,
						MGC_CALC_REC_TYP.COMP.value());

				// 完成行が複数の場合に使用する
				MCNumber qty = MCNumber.ZERO;
				boolean compRowsFlg = false;

				// 完成行の計算元が存在するか
				boolean calcCompFlg = false;
				for (int i = 0; i < list.size(); i++) {
					Srch02_RsltR row = list.get(i);

					// 前月末仕掛を月初仕掛扱いにする
					if (isSame(lastEndWipR.ym(), row.ym().addMonth(-1))) {
						copy(stWipR, lastEndWipR, createMap_Srch02_RsltR_Srch02_RsltR());
						lastEndWipR.clear();
					}

					// 費目別金額計算用に複製する
					if (MGC_CALC_REC_TYP.isST_WIP(row.calc_rec_typ())) {
						calcCompFlg = true;
						copy(stWipR, row, createMap_Srch02_RsltR_Srch02_RsltR());
					}
					else if (MGC_CALC_REC_TYP.isINST(row.calc_rec_typ())) {
						calcCompFlg = true;
						copy(instR, row, createMap_Srch02_RsltR_Srch02_RsltR());
					}
					else if (MGC_CALC_REC_TYP.isCOMP(row.calc_rec_typ())) {
						qty = qty.add(row.qty());
						// 完成行計算対象が存在しない場合は、その完成行を削除する
						if (!calcCompFlg) {
							list.remove(i);
							// リストサイズが変更になるため、削除した分を引き算する
							i = i - 1;
							continue;
						}
						// 完成行が複数の場合は、その２行目以降を削除する
						if (compRowsFlg) {
							list.remove(i);
							// リストサイズが変更になるため、削除した分を引き算する
							i = i - 1;
							continue;
						}
						compRowsFlg = true;
					}
					else if (MGC_CALC_REC_TYP.isEND_WIP(row.calc_rec_typ())) {
						calcCompFlg = true;
						copy(endWipR, row, createMap_Srch02_RsltR_Srch02_RsltR());

						// 前月末仕掛として保持させる
						copy(lastEndWipR, endWipR, createMap_Srch02_RsltR_Srch02_RsltR());
					}
				}

				// 完成行が存在しない OR 完成行計算対象行が存在しない場合は、後続の処理を行わない
				// 前月末仕掛の情報が必要なので、それを保持した後に判定する
				if (isNull(compR) || !calcCompFlg) {
					rslt.addAll(list);
					continue;
				}

				// 複数行存在する完成行の合計数量
				compR.qty(qty);
				for (String nm : _sumColNamesComp) {
					// 計算対象行の費目金額がNULLの場合、計算時にエラーが発生する
					if (isNull(stWipR.getValueNE(nm))) {
						stWipR.setValue(nm, MCNumber.ZERO);
					}
					if (isNull(instR.getValueNE(nm))) {
						instR.setValue(nm, MCNumber.ZERO);
					}
					if (isNull(endWipR.getValueNE(nm))) {
						endWipR.setValue(nm, MCNumber.ZERO);
					}

					// 完成項目の計算（月初仕掛（前月末仕掛）＋発生－月末仕掛）
					MCNumber expnsAmt = stWipR.getNumber(nm).add(instR.getNumber(nm))
							.subtract(endWipR.getNumber(nm));

					if (!isNull(compR) && !isSame(expnsAmt, MCNumber.ZERO)) {
						compR.setValue(nm, expnsAmt);
					}
				}

				rslt.addAll(list);
			}
			down.setAll(rslt);
		}

		/**
		 * 小計（月初仕掛（前月末仕掛）＋発生）行と、合計（完成＋月末仕掛）行を作成する
		 * @param down
		 * @param isDown1
		 */
		protected void calcTtlRow(MCList<Srch02_RsltR> down, boolean isDown1) {
			setSumColNamesSubTtl();

			// 集計対象カラム名をセットする。自レベルと下位レベルで対象カラムが異なる。
			if (isDown1) {
				setSumColNamesTtlDown1();
			}
			else {
				setSumColNamesTtlDown2();
			}

			// 完成行の費目金額を計算する
			calcCompRow(down);
			if (isNull(down)) {
				return;
			}

			// 合計行に単位を出力させるための前準備
			MCGroupByPolicy unitPlcy = new MCGroupByPolicy();
			unitPlcy.addKey(Srch02_RsltR.$unit_cd, Srch02_RsltR.$unit_nm, Srch02_RsltR.$dec_place);
			Srch02_RsltR unitR = down.groupBy(unitPlcy).get(0);

			// 年月・合計行計算グループ単位で行を挟み込む
			MCList<Srch02_RsltR> rslt = MCList.create(Srch02_RsltR.class);
			MCList<Srch02_RsltR>[] listArray = down.groupList(Srch02_RsltR.$ym,
					Srch02_RsltR.$ttl_grp);
			Srch02_RsltR lastEndWipR = Srch02_RsltR.create();

			for (MCList<Srch02_RsltR> list : listArray) {
				MCGroupByPolicy policy = new MCGroupByPolicy();

				// 前月の月末仕掛行を計算に含めるため、仮追加する
				if (MGC_CALC_REC_TYP.isEND_WIP(lastEndWipR.calc_rec_typ())) {
					list.add(lastEndWipR);
				}

				if (list.get(0).ttl_grp().intValue() == 1) {
					// 小計行
					policy.sum(_sumColNamesSubTtl);
				}
				else {
					// 合計行
					if (isDown1) {
						calcQtyPer(down);
						policy.sum(_sumColNamesTtlDown1);
					}
					else {
						policy.sum(_sumColNamesTtlDown2);
					}
				}

				Srch02_RsltR sumRow = list.groupBy(policy).get(0);
				Srch02_RsltR r = list.get(0);

				// 仮追加した行を削除する
				if (MGC_CALC_REC_TYP.isEND_WIP(lastEndWipR.calc_rec_typ())) {
					list.remove(list.size() - 1);
				}

				rslt.addAll(list);

				
				if (r.ttl_grp().intValue() == 1) {
					// 行の色設定のための値設定
					sumRow.calc_rec_seq(MGBFC_ProdCostSrch.SUBTTL_SEQ);
					// 小計行
					for (String nm : _sumColNamesSubTtl) {
						if (isNull(sumRow.getValueNE(nm))) {
							sumRow.setValue(nm, MCNumber.ZERO);
						}
					}
				}
				else {
					// 行の色設定のための値設定
					sumRow.calc_rec_seq(MGBFC_ProdCostSrch.TTL_SEQ);
					// 単位を出力させる
					sumRow.unit_cd(unitR.unit_cd());
					sumRow.unit_nm(unitR.unit_nm());
					sumRow.dec_place(unitR.dec_place());

					// 合計行
					if (isDown1) {
						for (String nm : _sumColNamesTtlDown1) {
							if (isNull(sumRow.getValueNE(nm))) {
								sumRow.setValue(nm, MCNumber.ZERO);
							}
						}
					}
					else {
						for (String nm : _sumColNamesTtlDown2) {
							if (isNull(sumRow.getValueNE(nm))) {
								sumRow.setValue(nm, MCNumber.ZERO);
							}
						}
					}
				}
				rslt.add(sumRow);

				// 最終行を取得する。
				// 前月の月末仕掛行以外の場合は使用されない
				lastEndWipR = list.get(list.size() - 1);
			}
			down.setAll(rslt);
		}

		/**
		 * 完成行集計対象のカラム名の配列を作成
		 */
		protected void setSumColNamesComp() {
			_sumColNamesComp = new String[getExpnsAllColNames().size() + 3];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNamesComp[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNamesComp[getExpnsAllColNames().size()] = Srch02_RsltR.$ttl;
			_sumColNamesComp[getExpnsAllColNames().size() + 1] = Srch02_RsltR.$var_cost;
			_sumColNamesComp[getExpnsAllColNames().size() + 2] = Srch02_RsltR.$fxd_cost;
		}

		/**
		 * 小計行集計対象のカラム名の配列を作成
		 */
		protected void setSumColNamesSubTtl() {
			_sumColNamesSubTtl = new String[getExpnsAllColNames().size() + 3];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNamesSubTtl[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNamesSubTtl[getExpnsAllColNames().size()] = Srch02_RsltR.$ttl;
			_sumColNamesSubTtl[getExpnsAllColNames().size() + 1] = Srch02_RsltR.$var_cost;
			_sumColNamesSubTtl[getExpnsAllColNames().size() + 2] = Srch02_RsltR.$fxd_cost;
		}

		/**
		 * 自レベルの合計行集計対象のカラム名の配列を作成
		 */
		protected void setSumColNamesTtlDown1() {
			_sumColNamesTtlDown1 = new String[getExpnsAllColNames().size() + 4];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNamesTtlDown1[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNamesTtlDown1[getExpnsAllColNames().size()] = Srch02_RsltR.$qty_per;
			_sumColNamesTtlDown1[getExpnsAllColNames().size() + 1] = Srch02_RsltR.$ttl;
			_sumColNamesTtlDown1[getExpnsAllColNames().size() + 2] = Srch02_RsltR.$var_cost;
			_sumColNamesTtlDown1[getExpnsAllColNames().size() + 3] = Srch02_RsltR.$fxd_cost;
		}

		/**
		 * 下位レベルの合計行集計対象のカラム名の配列を作成
		 */
		protected void setSumColNamesTtlDown2() {
			_sumColNamesTtlDown2 = new String[getExpnsAllColNames().size() + 4];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNamesTtlDown2[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNamesTtlDown2[getExpnsAllColNames().size()] = Srch02_RsltR.$qty;
			_sumColNamesTtlDown2[getExpnsAllColNames().size() + 1] = Srch02_RsltR.$ttl;
			_sumColNamesTtlDown2[getExpnsAllColNames().size() + 2] = Srch02_RsltR.$var_cost;
			_sumColNamesTtlDown2[getExpnsAllColNames().size() + 3] = Srch02_RsltR.$fxd_cost;
		}

		protected String[] clearColumns() {
			if (_clearColumns == null) {
				_clearColumns = new String[] {
						Srch02_RsltR.$lot_no, Srch02_RsltR.$sublot_no,
						Srch02_RsltR.$sno1, Srch02_RsltR.$sno2, Srch02_RsltR.$sno3, Srch02_RsltR.$sno4,
						Srch02_RsltR.$loc_cd, Srch02_RsltR.$loc_nm, Srch02_RsltR.$str_ln_cd,
						Srch02_RsltR.$str_ln_nm, Srch02_RsltR.$oper_cd,
						Srch02_RsltR.$oper_nm, Srch02_RsltR.$qty, Srch02_RsltR.$per,
						Srch02_RsltR.$unit_cd, Srch02_RsltR.$unit_nm
				};
			}
			return _clearColumns;
		}

		protected String[] clearAcColumns() {
			if (_clearAcColumns == null) {
				_clearAcColumns = new String[] {
						Srch02_RsltR.$ac_slip_typ, Srch02_RsltR.$ac_rsn_cd,
						Srch02_RsltR.$ac_rsn_nm
				};
			}
			return _clearAcColumns;
		}

		protected String[] clearColumnsCompRow() {
			if (_clearColumnsCompRow == null) {
				_clearColumnsCompRow = new String[] {
						Srch02_RsltR.$lot_no, Srch02_RsltR.$sublot_no,
						Srch02_RsltR.$sno1, Srch02_RsltR.$sno2, Srch02_RsltR.$sno3, Srch02_RsltR.$sno4,
						Srch02_RsltR.$loc_cd,Srch02_RsltR.$loc_nm, Srch02_RsltR.$str_ln_cd,
						Srch02_RsltR.$str_ln_nm, Srch02_RsltR.$oper_act_no,
						Srch02_RsltR.$oper_cd, Srch02_RsltR.$oper_nm
				};
			}
			return _clearColumnsCompRow;
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.act_cost"
		};
		return stringArray;
	}

	// Mapper
	// Srch02_RsltR ←　Srch02_RsltR
	protected Map_Srch02_RsltR_Srch02_RsltR<Srch02_RsltR,Srch02_RsltR> createMap_Srch02_RsltR_Srch02_RsltR() {
		return new Map_Srch02_RsltR_Srch02_RsltR<Srch02_RsltR, Srch02_RsltR>();
	}

	public class Map_Srch02_RsltR_Srch02_RsltR<D extends Srch02_RsltR, S extends Srch02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch02_RsltR.$ttl_grp, Srch02_RsltR.$ttl_grp);
			addColumnPathMap(Srch02_RsltR.$ym, Srch02_RsltR.$ym);
			addColumnPathMap(Srch02_RsltR.$calc_rec_seq, Srch02_RsltR.$calc_rec_seq);
			addColumnPathMap(Srch02_RsltR.$calc_rec_typ, Srch02_RsltR.$calc_rec_typ);
			addColumnPathMap(Srch02_RsltR.$lot_no, Srch02_RsltR.$lot_no);
			addColumnPathMap(Srch02_RsltR.$sublot_no, Srch02_RsltR.$sublot_no);
			addColumnPathMap(Srch02_RsltR.$sno1, Srch02_RsltR.$sno1);
			addColumnPathMap(Srch02_RsltR.$sno2, Srch02_RsltR.$sno2);
			addColumnPathMap(Srch02_RsltR.$sno3, Srch02_RsltR.$sno3);
			addColumnPathMap(Srch02_RsltR.$sno4, Srch02_RsltR.$sno4);
			addColumnPathMap(Srch02_RsltR.$loc_cd, Srch02_RsltR.$loc_cd);
			addColumnPathMap(Srch02_RsltR.$loc_nm, Srch02_RsltR.$loc_nm);
			addColumnPathMap(Srch02_RsltR.$str_ln_cd, Srch02_RsltR.$str_ln_cd);
			addColumnPathMap(Srch02_RsltR.$str_ln_nm, Srch02_RsltR.$str_ln_nm);
			addColumnPathMap(Srch02_RsltR.$oper_act_no, Srch02_RsltR.$oper_act_no);
			addColumnPathMap(Srch02_RsltR.$oper_cd, Srch02_RsltR.$oper_cd);
			addColumnPathMap(Srch02_RsltR.$oper_nm, Srch02_RsltR.$oper_nm);
			addColumnPathMap(Srch02_RsltR.$ac_slip_typ, Srch02_RsltR.$ac_slip_typ);
			addColumnPathMap(Srch02_RsltR.$ac_rsn_cd, Srch02_RsltR.$ac_rsn_cd);
			addColumnPathMap(Srch02_RsltR.$ac_rsn_nm, Srch02_RsltR.$ac_rsn_nm);
			addColumnPathMap(Srch02_RsltR.$act_upri, Srch02_RsltR.$act_upri);
			addColumnPathMap(Srch02_RsltR.$qty, Srch02_RsltR.$qty);
			addColumnPathMap(Srch02_RsltR.$unit_cd, Srch02_RsltR.$unit_cd);
			addColumnPathMap(Srch02_RsltR.$unit_nm, Srch02_RsltR.$unit_nm);
			addColumnPathMap(Srch02_RsltR.$dec_place, Srch02_RsltR.$dec_place);
			addColumnPathMap(Srch02_RsltR.$per, Srch02_RsltR.$per);
			addColumnPathMap(Srch02_RsltR.$qty_per, Srch02_RsltR.$qty_per);
			addColumnPathMap(Srch02_RsltR.$ttl, Srch02_RsltR.$ttl);
			addColumnPathMap(Srch02_RsltR.$var_cost, Srch02_RsltR.$var_cost);
			addColumnPathMap(Srch02_RsltR.$fxd_cost, Srch02_RsltR.$fxd_cost);
			addColumnPathMap(Srch02_RsltR.$col_000, Srch02_RsltR.$col_000);
			addColumnPathMap(Srch02_RsltR.$col_001, Srch02_RsltR.$col_001);
			addColumnPathMap(Srch02_RsltR.$col_002, Srch02_RsltR.$col_002);
			addColumnPathMap(Srch02_RsltR.$col_003, Srch02_RsltR.$col_003);
			addColumnPathMap(Srch02_RsltR.$col_004, Srch02_RsltR.$col_004);
			addColumnPathMap(Srch02_RsltR.$col_005, Srch02_RsltR.$col_005);
			addColumnPathMap(Srch02_RsltR.$col_006, Srch02_RsltR.$col_006);
			addColumnPathMap(Srch02_RsltR.$col_007, Srch02_RsltR.$col_007);
			addColumnPathMap(Srch02_RsltR.$col_008, Srch02_RsltR.$col_008);
			addColumnPathMap(Srch02_RsltR.$col_009, Srch02_RsltR.$col_009);
			addColumnPathMap(Srch02_RsltR.$col_010, Srch02_RsltR.$col_010);
			addColumnPathMap(Srch02_RsltR.$col_011, Srch02_RsltR.$col_011);
			addColumnPathMap(Srch02_RsltR.$col_012, Srch02_RsltR.$col_012);
			addColumnPathMap(Srch02_RsltR.$col_013, Srch02_RsltR.$col_013);
			addColumnPathMap(Srch02_RsltR.$col_014, Srch02_RsltR.$col_014);
			addColumnPathMap(Srch02_RsltR.$col_015, Srch02_RsltR.$col_015);
			addColumnPathMap(Srch02_RsltR.$col_016, Srch02_RsltR.$col_016);
			addColumnPathMap(Srch02_RsltR.$col_017, Srch02_RsltR.$col_017);
			addColumnPathMap(Srch02_RsltR.$col_018, Srch02_RsltR.$col_018);
			addColumnPathMap(Srch02_RsltR.$col_019, Srch02_RsltR.$col_019);
			addColumnPathMap(Srch02_RsltR.$col_020, Srch02_RsltR.$col_020);
			addColumnPathMap(Srch02_RsltR.$col_021, Srch02_RsltR.$col_021);
			addColumnPathMap(Srch02_RsltR.$col_022, Srch02_RsltR.$col_022);
			addColumnPathMap(Srch02_RsltR.$col_023, Srch02_RsltR.$col_023);
			addColumnPathMap(Srch02_RsltR.$col_024, Srch02_RsltR.$col_024);
			addColumnPathMap(Srch02_RsltR.$col_025, Srch02_RsltR.$col_025);
			addColumnPathMap(Srch02_RsltR.$col_026, Srch02_RsltR.$col_026);
			addColumnPathMap(Srch02_RsltR.$col_027, Srch02_RsltR.$col_027);
			addColumnPathMap(Srch02_RsltR.$col_028, Srch02_RsltR.$col_028);
			addColumnPathMap(Srch02_RsltR.$col_029, Srch02_RsltR.$col_029);
			addColumnPathMap(Srch02_RsltR.$col_030, Srch02_RsltR.$col_030);
			addColumnPathMap(Srch02_RsltR.$col_031, Srch02_RsltR.$col_031);
			addColumnPathMap(Srch02_RsltR.$col_032, Srch02_RsltR.$col_032);
			addColumnPathMap(Srch02_RsltR.$col_033, Srch02_RsltR.$col_033);
			addColumnPathMap(Srch02_RsltR.$col_034, Srch02_RsltR.$col_034);
			addColumnPathMap(Srch02_RsltR.$col_035, Srch02_RsltR.$col_035);
			addColumnPathMap(Srch02_RsltR.$col_036, Srch02_RsltR.$col_036);
			addColumnPathMap(Srch02_RsltR.$col_037, Srch02_RsltR.$col_037);
			addColumnPathMap(Srch02_RsltR.$col_038, Srch02_RsltR.$col_038);
			addColumnPathMap(Srch02_RsltR.$col_039, Srch02_RsltR.$col_039);
			addColumnPathMap(Srch02_RsltR.$col_040, Srch02_RsltR.$col_040);
			addColumnPathMap(Srch02_RsltR.$col_041, Srch02_RsltR.$col_041);
			addColumnPathMap(Srch02_RsltR.$col_042, Srch02_RsltR.$col_042);
			addColumnPathMap(Srch02_RsltR.$col_043, Srch02_RsltR.$col_043);
			addColumnPathMap(Srch02_RsltR.$col_044, Srch02_RsltR.$col_044);
			addColumnPathMap(Srch02_RsltR.$col_045, Srch02_RsltR.$col_045);
			addColumnPathMap(Srch02_RsltR.$col_046, Srch02_RsltR.$col_046);
			addColumnPathMap(Srch02_RsltR.$col_047, Srch02_RsltR.$col_047);
			addColumnPathMap(Srch02_RsltR.$col_048, Srch02_RsltR.$col_048);
			addColumnPathMap(Srch02_RsltR.$col_049, Srch02_RsltR.$col_049);
			addColumnPathMap(Srch02_RsltR.$col_050, Srch02_RsltR.$col_050);
			addColumnPathMap(Srch02_RsltR.$col_051, Srch02_RsltR.$col_051);
			addColumnPathMap(Srch02_RsltR.$col_052, Srch02_RsltR.$col_052);
			addColumnPathMap(Srch02_RsltR.$col_053, Srch02_RsltR.$col_053);
			addColumnPathMap(Srch02_RsltR.$col_054, Srch02_RsltR.$col_054);
			addColumnPathMap(Srch02_RsltR.$col_055, Srch02_RsltR.$col_055);
			addColumnPathMap(Srch02_RsltR.$col_056, Srch02_RsltR.$col_056);
			addColumnPathMap(Srch02_RsltR.$col_057, Srch02_RsltR.$col_057);
			addColumnPathMap(Srch02_RsltR.$col_058, Srch02_RsltR.$col_058);
			addColumnPathMap(Srch02_RsltR.$col_059, Srch02_RsltR.$col_059);
			addColumnPathMap(Srch02_RsltR.$col_060, Srch02_RsltR.$col_060);
			addColumnPathMap(Srch02_RsltR.$col_061, Srch02_RsltR.$col_061);
			addColumnPathMap(Srch02_RsltR.$col_062, Srch02_RsltR.$col_062);
			addColumnPathMap(Srch02_RsltR.$col_063, Srch02_RsltR.$col_063);
			addColumnPathMap(Srch02_RsltR.$col_064, Srch02_RsltR.$col_064);
			addColumnPathMap(Srch02_RsltR.$col_065, Srch02_RsltR.$col_065);
			addColumnPathMap(Srch02_RsltR.$col_066, Srch02_RsltR.$col_066);
			addColumnPathMap(Srch02_RsltR.$col_067, Srch02_RsltR.$col_067);
			addColumnPathMap(Srch02_RsltR.$col_068, Srch02_RsltR.$col_068);
			addColumnPathMap(Srch02_RsltR.$col_069, Srch02_RsltR.$col_069);
			addColumnPathMap(Srch02_RsltR.$col_070, Srch02_RsltR.$col_070);
			addColumnPathMap(Srch02_RsltR.$col_071, Srch02_RsltR.$col_071);
			addColumnPathMap(Srch02_RsltR.$col_072, Srch02_RsltR.$col_072);
			addColumnPathMap(Srch02_RsltR.$col_073, Srch02_RsltR.$col_073);
			addColumnPathMap(Srch02_RsltR.$col_074, Srch02_RsltR.$col_074);
			addColumnPathMap(Srch02_RsltR.$col_075, Srch02_RsltR.$col_075);
			addColumnPathMap(Srch02_RsltR.$col_076, Srch02_RsltR.$col_076);
			addColumnPathMap(Srch02_RsltR.$col_077, Srch02_RsltR.$col_077);
			addColumnPathMap(Srch02_RsltR.$col_078, Srch02_RsltR.$col_078);
			addColumnPathMap(Srch02_RsltR.$col_079, Srch02_RsltR.$col_079);
			addColumnPathMap(Srch02_RsltR.$col_080, Srch02_RsltR.$col_080);
			addColumnPathMap(Srch02_RsltR.$col_081, Srch02_RsltR.$col_081);
			addColumnPathMap(Srch02_RsltR.$col_082, Srch02_RsltR.$col_082);
			addColumnPathMap(Srch02_RsltR.$col_083, Srch02_RsltR.$col_083);
			addColumnPathMap(Srch02_RsltR.$col_084, Srch02_RsltR.$col_084);
			addColumnPathMap(Srch02_RsltR.$col_085, Srch02_RsltR.$col_085);
			addColumnPathMap(Srch02_RsltR.$col_086, Srch02_RsltR.$col_086);
			addColumnPathMap(Srch02_RsltR.$col_087, Srch02_RsltR.$col_087);
			addColumnPathMap(Srch02_RsltR.$col_088, Srch02_RsltR.$col_088);
			addColumnPathMap(Srch02_RsltR.$col_089, Srch02_RsltR.$col_089);
			addColumnPathMap(Srch02_RsltR.$col_090, Srch02_RsltR.$col_090);
			addColumnPathMap(Srch02_RsltR.$col_091, Srch02_RsltR.$col_091);
			addColumnPathMap(Srch02_RsltR.$col_092, Srch02_RsltR.$col_092);
			addColumnPathMap(Srch02_RsltR.$col_093, Srch02_RsltR.$col_093);
			addColumnPathMap(Srch02_RsltR.$col_094, Srch02_RsltR.$col_094);
			addColumnPathMap(Srch02_RsltR.$col_095, Srch02_RsltR.$col_095);
			addColumnPathMap(Srch02_RsltR.$col_096, Srch02_RsltR.$col_096);
			addColumnPathMap(Srch02_RsltR.$col_097, Srch02_RsltR.$col_097);
			addColumnPathMap(Srch02_RsltR.$col_098, Srch02_RsltR.$col_098);
			addColumnPathMap(Srch02_RsltR.$col_099, Srch02_RsltR.$col_099);
		}
	}

	//FMCB CUSTOM END
}