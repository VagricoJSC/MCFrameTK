package mcframe.clientMGBF.MGBFP0490;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MlyItmCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MlyItmCostSrch_MC extends MGBFP_MlyItmCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(col_xx)の桁数 */
	protected int _SCALE = 3;

	/** 可変カラムの数 */
	protected int _dtl_col_num = 0;

	protected int _dtl_col_num2 = 0;

	protected int _dtl_col_num3 = 0;

	protected int _dtl_col_num4 = 0;

	protected int _dtl_col_num5 = 0;

	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();

	protected MGUCP_VHConverter<Rslt2R, DispRslt2R> _vh2 = new MGUCP_VHConverter<Rslt2R, DispRslt2R>();

	protected MGUCP_VHConverter<Rslt3R, DispRslt3R> _vh3 = new MGUCP_VHConverter<Rslt3R, DispRslt3R>();

	protected MGUCP_VHConverter<Rslt4R, DispRslt4R> _vh4 = new MGUCP_VHConverter<Rslt4R, DispRslt4R>();

	protected MGUCP_VHConverter<Rslt5R, DispRslt5R> _vh5 = new MGUCP_VHConverter<Rslt5R, DispRslt5R>();

	/** １カラムグループあたりの要素数*/
	protected int _elmNum2 = 7;

	protected int _elmNum3 = 7;

	protected int _elmNum4 = 3;

	protected int _elmNum5 = 3;

	/** 集計対象のカラム名*/
	protected String[] _sumColNames2 = null;

	protected String[] _sumColNames3 = null;

	protected String[] _sumColNames4 = null;

	protected String[] _sumColNames5 = null;

	/** 小数部有効桁のデフォルト値*/
	protected int _defAddDispDigit = 2;

	/** 単価を取得する際にdivideに渡すスケール値*/
	protected int _baseUnitDigit = 16;

	/** 色 */
	protected Color _expnsSrchRsltColor = getExpnsSrchRsltColor(this);

	protected Color _allTtlColor = getAllTtlColor(this);

	protected Color _moneyDiffColor = getMoneyDiffColor(this);

	/** MCLabelリソースのリソースキー*/
	protected static final String COST = "cost";

	protected static final String BASE = "base";

	protected static final String DIM = "dim";

	protected static final String WT = "wt";

	protected static final String CONTS = "conts";

	protected static final String BASE_UNIT = "base_unit";

	protected static final String DIM_UNIT = "dim_unit";

	protected static final String WT_UNIT = "wt_unit";

	protected static final String CONTS_UNIT = "conts_unit";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MlyItmCostSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_MlyItmCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0490_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0490_Srch01Caller<P extends MGBFP_MlyItmCostSrch, B extends MG_MGBFL0490_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0490_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkTermM(Cnd_ym_fr, Cnd_ym_to, 60));
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getDispRsltL());
			addDownContainer(getDispRslt2L());
			addDownContainer(getDispRslt3L());
			addDownContainer(getDispRslt4L());
			addDownContainer(getDispRslt5L());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();

			initVhInfo();
			initVhInfo2();
			initVhInfo3();
			initVhInfo4();
			initVhInfo5();
		}

		@Override
		protected void showReplaceSub() {
			// 項目情報設定
			_vh.initColGroup(DispRsltTable, getRsltL());
			_vh2.initColGroup(DispRslt2Table, getRslt2L());
			_vh3.initColGroup(DispRslt3Table, getRslt3L());
			_vh4.initColGroup(DispRslt4Table, getRslt4L());
			_vh5.initColGroup(DispRslt5Table, getRslt5L());

			// 年月情報(横展開のキー)を作成
			MCList<RsltR> ymList = _vh.createElmListForYM(getCndR().ym_fr(),
					getCndR().ym_to());

			// カラム情報作成
			_vh.initColInfo(_SCALE, ymList.size(), ymList, 0, _dtl_col_num);
			_vh2.initColInfo(_SCALE, ymList.size() * _elmNum2, ymList, 0, _dtl_col_num2);
			_vh3.initColInfo(_SCALE, ymList.size() * _elmNum3, ymList, 0, _dtl_col_num3);
			_vh4.initColInfo(_SCALE, ymList.size() * _elmNum4, ymList, 0, _dtl_col_num4);
			_vh5.initColInfo(_SCALE, ymList.size() * _elmNum5, ymList, 0, _dtl_col_num5);

			setHeaderLabel(ymList);

			_vh.setReadOnlyStatus();
			_vh2.setReadOnlyStatus();
			_vh3.setReadOnlyStatus();
			_vh4.setReadOnlyStatus();
			_vh5.setReadOnlyStatus();

			// 変換前の編集
			editDtl();

			// 縦横変換
			_vh.createHList(bridge.down0());
			_vh2.createHList(bridge.down3());
			_vh3.createHList(bridge.down4());
			_vh4.createHList(bridge.down5());
			_vh5.createHList(bridge.down6());

			// 合計計算
			_vh.calcElmColTtlAll(DispRsltR.$ttl);
			editDispRslt();

			setAddDigit();
		}

		protected void setHeaderLabel(MCList<RsltR> l) {
			MCColumnGroup[] cg02 = DispRslt2Table.getAllColumnGroups();
			MCColumnGroup[] cg03 = DispRslt3Table.getAllColumnGroups();
			MCColumnGroup[] cg04 = DispRslt4Table.getAllColumnGroups();
			MCColumnGroup[] cg05 = DispRslt5Table.getAllColumnGroups();

			for (int j = 0; j < l.size(); j++) {
				MCColumnConfig conf = _vh.getConfs()[j];
				String lbl = toYMHeaderLabel(panel, l.get(j).ym());
				String msg = toYMHeaderMessage(panel, l.get(j).ym());
				conf.setHeaderName(lbl);
				conf.setHeaderMessage(msg);
				cg02[j].setHeaderName(lbl);
				cg03[j].setHeaderName(lbl);
				cg04[j].setHeaderName(lbl);
				cg05[j].setHeaderName(lbl);
				cg02[j].setHeaderMessage(msg);
				cg03[j].setHeaderMessage(msg);
				cg04[j].setHeaderMessage(msg);
				cg05[j].setHeaderMessage(msg);
			}
		}

		protected void editDtl() {
			MCList<RsltR> l = MCList.create(RsltR.create());

			String[] qtyKey = getKeys();
			MCIndexKey qtyIdx = bridge.down1().createIndex(qtyKey);
			for (int i = 0; i < bridge.down0().size(); i++) {
				RsltR r = bridge.down0().get(i);
				// 数量は別で取得しているので横展開用の非表示リストに追加する
				Comparable<?>[] qtyBind = new Comparable[qtyKey.length];
				for (int j = 0; j < qtyKey.length; j++) {
					qtyBind[j] = r.getValueNE(qtyKey[j]);
				}
				QtyR qtyR = bridge.down1().getFirst(qtyIdx, qtyBind);

				// 原価
				RsltR costR = r.clone();
				setRsltR(costR, r.act_cost(), 1, COST, null, null, null);
				l.add(costR);
				// 基準単位
				RsltR baseR = r.clone();
				setRsltR(baseR, qtyR.qty(), 2, BASE, qtyR.unit_cd(), qtyR.unit_nm(),
						qtyR.dec_place());
				l.add(baseR);
				// 容積
				RsltR dimR = r.clone();
				setRsltR(dimR, qtyR.dim(), 3, DIM, qtyR.dim_unit_cd(), qtyR.dim_unit_nm(),
						qtyR.dim_dec_place());
				l.add(dimR);
				// 重量
				RsltR wtR = r.clone();
				setRsltR(wtR, qtyR.wt(), 4, WT, qtyR.wt_unit_cd(), qtyR.wt_unit_nm(),
						qtyR.wt_dec_place());
				l.add(wtR);
				// 入り目
				RsltR contsR = r.clone();
				setRsltR(contsR, qtyR.conts(), 5, CONTS, qtyR.conts_unit_cd(),
						qtyR.conts_unit_nm(), qtyR.conts_dec_place());
				l.add(contsR);
				// 基準単位単価
				RsltR base_unitR = r.clone();
				setRsltR(base_unitR,
						calcUpri(r.act_cost(), qtyR.qty(), getCostUnitDispDigit(panel)),
						6, BASE_UNIT, qtyR.unit_cd(), qtyR.unit_nm(), qtyR.dec_place());
				l.add(base_unitR);
				// 容積単価
				RsltR dim_unitR = r.clone();
				setRsltR(dim_unitR,
						calcUpri(r.act_cost(), qtyR.dim(), getCostUnitDispDigit(panel)),
						7, DIM_UNIT, qtyR.dim_unit_cd(), qtyR.dim_unit_nm(),
						qtyR.dim_dec_place());
				l.add(dim_unitR);
				// 重量単価
				RsltR wt_unitR = r.clone();
				setRsltR(wt_unitR,
						calcUpri(r.act_cost(), qtyR.wt(), getCostUnitDispDigit(panel)), 8,
						WT_UNIT, qtyR.wt_unit_cd(), qtyR.wt_unit_nm(),
						qtyR.wt_dec_place());
				l.add(wt_unitR);
				// 入り目単価
				RsltR conts_unitR = r.clone();
				setRsltR(conts_unitR,
						calcUpri(r.act_cost(), qtyR.conts(), getCostUnitDispDigit(panel)),
						9, CONTS_UNIT, qtyR.conts_unit_cd(), qtyR.conts_unit_nm(),
						qtyR.conts_dec_place());
				l.add(conts_unitR);
			}
			bridge.down0().setAll(l);
			// 投入一覧
			for (int i = 0; i < bridge.down3().size(); i++) {
				Rslt2R r = bridge.down3().get(i);
				r.unit(calcUpri(r.act_cost(), r.qty(), getCostUnitDispDigit(panel)));

				Comparable<?>[] qtyBind = new Comparable[qtyKey.length];
				for (int j = 0; j < qtyKey.length; j++) {
					qtyBind[j] = r.getValueNE(qtyKey[j]);
				}
				QtyR qtyR = bridge.down1().getFirst(qtyIdx, qtyBind);
				if (!isNull(qtyR)) {
					r.base_qty(calcUpri(r.qty(), qtyR.qty(), _baseUnitDigit));
					r.base_unit(calcUpri(r.act_cost(), qtyR.qty(), _baseUnitDigit));
				}
			}
			// 工数一覧
			for (int i = 0; i < bridge.down4().size(); i++) {
				Rslt3R r = bridge.down4().get(i);
				r.unit(calcUpri(r.act_cost(), r.qty(), getCostUnitDispDigit(panel)));

				Comparable<?>[] qtyBind = new Comparable[qtyKey.length];
				for (int j = 0; j < qtyKey.length; j++) {
					qtyBind[j] = r.getValueNE(qtyKey[j]);
				}
				QtyR qtyR = bridge.down1().getFirst(qtyIdx, qtyBind);
				if (!isNull(qtyR)) {
					r.base_qty(calcUpri(r.qty(), qtyR.qty(), _baseUnitDigit));
					r.base_unit(calcUpri(r.act_cost(), qtyR.qty(), _baseUnitDigit));
				}
			}
			// 外注一覧
			for (int i = 0; i < bridge.down5().size(); i++) {
				Rslt4R r = bridge.down5().get(i);
				Comparable<?>[] qtyBind = new Comparable[qtyKey.length];
				for (int j = 0; j < qtyKey.length; j++) {
					qtyBind[j] = r.getValueNE(qtyKey[j]);
				}
				QtyR qtyR = bridge.down1().getFirst(qtyIdx, qtyBind);
				if (!isNull(qtyR)) {
					r.base_unit(calcUpri(r.act_cost(), qtyR.qty(), _baseUnitDigit));
				}
			}
			// 配賦一覧
			for (int i = 0; i < bridge.down6().size(); i++) {
				Rslt5R r = bridge.down6().get(i);
				Comparable<?>[] qtyBind = new Comparable[qtyKey.length];
				for (int j = 0; j < qtyKey.length; j++) {
					qtyBind[j] = r.getValueNE(qtyKey[j]);
				}
				QtyR qtyR = bridge.down1().getFirst(qtyIdx, qtyBind);
				if (!isNull(qtyR)) {
					r.base_unit(calcUpri(r.act_cost(), qtyR.qty(), _baseUnitDigit));
				}
			}
		}

		protected String[] getKeys() {
			ArrayList<String> keys = new ArrayList<String>();
			keys.add(QtyR.$ym);
			String[] array = (String[]) keys.toArray(new String[0]);
			return array;
		}

		protected void setRsltR(RsltR row, MCNumber disp, int id, String item,
				String unitCd, String unitNm, MCNumber decPlace) {
			row.disp(disp);
			row.id(id);
			row.item(getDispString(item));
			row.unit_cd(unitCd);
			row.unit_nm(unitNm);
			row.dec_place(decPlace);
		}

		protected void editDispRslt() {
			MCList<DispRsltR> rmList = MCList.create(DispRsltR.create());
			MCNumber ttlCost = MCNumber.ZERO;
			MCNumber ttlBaseUnit = MCNumber.ZERO;
			MCNumber ttlDimUnit = MCNumber.ZERO;
			MCNumber ttlWtUnit = MCNumber.ZERO;
			MCNumber ttlContsUnit = MCNumber.ZERO;
			MCNumber plnCost = MCNumber.ZERO;
			MCNumber baseUnit = MCNumber.ZERO;
			MCNumber dimUnit = MCNumber.ZERO;
			MCNumber wtUnit = MCNumber.ZERO;
			MCNumber contsUnit = MCNumber.ZERO;

			for (DispRsltR r : getDispRsltL()) {
				if (r.id().eq(1)) {
					r.pln(bridge.down2().pln_cost());
					plnCost = r.pln();
					ttlCost = r.ttl();
				}
				else if (r.id().eq(2)) {
					r.pln(bridge.down2().pln_qty());
					baseUnit = calcUpri(plnCost, r.pln(), getCostUnitDispDigit(panel));
					ttlBaseUnit = calcUpri(ttlCost, r.ttl(), getCostUnitDispDigit(panel));
				}
				else if (r.id().eq(3)) {
					r.pln(bridge.down2().pln_dim());
					dimUnit = calcUpri(plnCost, r.pln(), getCostUnitDispDigit(panel));
					ttlDimUnit = calcUpri(ttlCost, r.ttl(), getCostUnitDispDigit(panel));
					if (isNull(r.unit_cd())) {
						rmList.add(r);
					}
				}
				else if (r.id().eq(4)) {
					r.pln(bridge.down2().pln_wt());
					wtUnit = calcUpri(plnCost, r.pln(), getCostUnitDispDigit(panel));
					ttlWtUnit = calcUpri(ttlCost, r.ttl(), getCostUnitDispDigit(panel));
					if (isNull(r.unit_cd())) {
						rmList.add(r);
					}
				}
				else if (r.id().eq(5)) {
					r.pln(bridge.down2().pln_conts());
					contsUnit = calcUpri(plnCost, r.pln(), getCostUnitDispDigit(panel));
					ttlContsUnit = calcUpri(ttlCost, r.ttl(),
							getCostUnitDispDigit(panel));
					if (isNull(r.unit_cd())) {
						rmList.add(r);
					}
				}
				else if (r.id().eq(6)) {
					r.pln(baseUnit);
					r.ttl(ttlBaseUnit);
				}
				else if (r.id().eq(7)) {
					r.pln(dimUnit);
					r.ttl(ttlDimUnit);
					if (isNull(r.unit_cd())) {
						rmList.add(r);
					}
				}
				else if (r.id().eq(8)) {
					r.pln(wtUnit);
					r.ttl(ttlWtUnit);
					if (isNull(r.unit_cd())) {
						rmList.add(r);
					}
				}
				else if (r.id().eq(9)) {
					r.pln(contsUnit);
					r.ttl(ttlContsUnit);
					if (isNull(r.unit_cd())) {
						rmList.add(r);
					}
				}
				r.diff(calcDiff(r.pln(), r.ttl()));
			}
			// 上一覧：容積・重量・入り目の行で単位ＣＤのセットされない行は削除
			getDispRsltL().removeAll(rmList);

			for (DispRslt2R r : getDispRslt2L()) {
				String s;
				MCNumber sumQty = MCNumber.ZERO;
				MCNumber sumCost = MCNumber.ZERO;
				MCNumber sumPlnQty = MCNumber.ZERO;
				MCNumber sumPlnCost = MCNumber.ZERO;
				for (int i = 0; i < _vh2.getElmCols().length; i++) {
					if (i % _elmNum2 == 0) {
						s = _vh2.getElmCols()[i];
						sumQty = MCNumber.sum(sumQty, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum2 == 2) {
						s = _vh2.getElmCols()[i];
						sumCost = MCNumber.sum(sumCost, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum2 == 5) {
						s = _vh2.getElmCols()[i];
						sumPlnQty = MCNumber.sum(sumPlnQty, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum2 == 6) {
						s = _vh2.getElmCols()[i];
						sumPlnCost = MCNumber.sum(sumPlnCost, (MCNumber) r.getValueNE(s));
					}
				}
				r.ttl_qty(sumQty);
				r.ttl_cost(sumCost);
				r.ttl_unit(
						calcUpri(r.ttl_cost(), r.ttl_qty(), getCostUnitDispDigit(panel)));
				r.ttl_base(calcUpri(r.ttl_qty(), getDispRsltL().get(1).ttl(),
						_baseUnitDigit));
				r.ttl_base_unit(calcUpri(r.ttl_cost(), getDispRsltL().get(1).ttl(),
						_baseUnitDigit));

				r.pln_qty(sumPlnQty);
				r.pln_cost(sumPlnCost);
				r.pln_unit(
						calcUpri(r.pln_cost(), r.pln_qty(), getCostUnitDispDigit(panel)));
				r.pln_base(calcUpri(r.pln_qty(), getDispRsltL().get(1).pln(),
						_baseUnitDigit));
				r.pln_base_unit(calcUpri(r.pln_cost(), getDispRsltL().get(1).pln(),
						_baseUnitDigit));

				r.diff_qty(calcDiff(r.pln_qty(), r.ttl_qty()));
				r.diff_unit(calcDiff(r.pln_unit(), r.ttl_unit()));
				r.diff_cost(calcDiff(r.pln_cost(), r.ttl_cost()));
				r.diff_base(calcDiff(r.pln_base(), r.ttl_base()));
				r.diff_base_unit(calcDiff(r.pln_base_unit(), r.ttl_base_unit()));
			}
			// 合計行を作成・末尾行に追加
			if (getDispRslt2L().size() > 0) {
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.sum(getSumColNames2());
				DispRslt2R sumRow02 = getDispRslt2L().groupBy(policy).get(0);
				for (String nm : getSumColNames2()) {
					if (isNull(sumRow02.getValueNE(nm))) {
						sumRow02.setValue(nm, MCNumber.ZERO);
					}
				}
				getDispRslt2L().add(sumRow02);
			}

			for (DispRslt3R r : getDispRslt3L()) {
				String s;
				MCNumber sumQty = MCNumber.ZERO;
				MCNumber sumCost = MCNumber.ZERO;
				MCNumber sumPlnQty = MCNumber.ZERO;
				MCNumber sumPlnCost = MCNumber.ZERO;
				for (int i = 0; i < _vh3.getElmCols().length; i++) {
					if (i % _elmNum3 == 0) {
						s = _vh3.getElmCols()[i];
						sumQty = MCNumber.sum(sumQty, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum3 == 2) {
						s = _vh3.getElmCols()[i];
						sumCost = MCNumber.sum(sumCost, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum3 == 5) {
						s = _vh3.getElmCols()[i];
						sumPlnQty = MCNumber.sum(sumPlnQty, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum3 == 6) {
						s = _vh3.getElmCols()[i];
						sumPlnCost = MCNumber.sum(sumPlnCost, (MCNumber) r.getValueNE(s));
					}
				}
				r.ttl_qty(sumQty);
				r.ttl_cost(sumCost);
				r.ttl_unit(
						calcUpri(r.ttl_cost(), r.ttl_qty(), getCostUnitDispDigit(panel)));
				r.ttl_base(calcUpri(r.ttl_qty(), getDispRsltL().get(1).ttl(),
						_baseUnitDigit));
				r.ttl_base_unit(calcUpri(r.ttl_cost(), getDispRsltL().get(1).ttl(),
						_baseUnitDigit));

				r.pln_qty(sumPlnQty);
				r.pln_cost(sumPlnCost);
				r.pln_unit(
						calcUpri(r.pln_cost(), r.pln_qty(), getCostUnitDispDigit(panel)));
				r.pln_base(calcUpri(r.pln_qty(), getDispRsltL().get(1).pln(),
						_baseUnitDigit));
				r.pln_base_unit(calcUpri(r.pln_cost(), getDispRsltL().get(1).pln(),
						_baseUnitDigit));

				r.diff_qty(calcDiff(r.pln_qty(), r.ttl_qty()));
				r.diff_unit(calcDiff(r.pln_unit(), r.ttl_unit()));
				r.diff_cost(calcDiff(r.pln_cost(), r.ttl_cost()));
				r.diff_base(calcDiff(r.pln_base(), r.ttl_base()));
				r.diff_base_unit(calcDiff(r.pln_base_unit(), r.ttl_base_unit()));
			}
			// 合計行を作成・末尾行に追加
			if (getDispRslt3L().size() > 0) {
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.sum(getSumColNames3());
				DispRslt3R sumRow03 = getDispRslt3L().groupBy(policy).get(0);
				for (String nm : getSumColNames3()) {
					if (isNull(sumRow03.getValueNE(nm))) {
						sumRow03.setValue(nm, MCNumber.ZERO);
					}
				}
				getDispRslt3L().add(sumRow03);
			}

			for (DispRslt4R r : getDispRslt4L()) {
				String s;
				MCNumber sumCost = MCNumber.ZERO;
				MCNumber sumPlnCost = MCNumber.ZERO;
				for (int i = 0; i < _vh4.getElmCols().length; i++) {
					if (i % _elmNum4 == 0) {
						s = _vh4.getElmCols()[i];
						sumCost = MCNumber.sum(sumCost, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum4 == 2) {
						s = _vh4.getElmCols()[i];
						sumPlnCost = MCNumber.sum(sumPlnCost, (MCNumber) r.getValueNE(s));
					}
				}
				r.ttl_cost(sumCost);
				r.ttl_base_unit(calcUpri(r.ttl_cost(), getDispRsltL().get(1).ttl(),
						_baseUnitDigit));

				r.pln_cost(sumPlnCost);
				r.pln_base_unit(calcUpri(r.pln_cost(), getDispRsltL().get(1).pln(),
						_baseUnitDigit));

				r.diff_cost(calcDiff(r.pln_cost(), r.ttl_cost()));
				r.diff_base_unit(calcDiff(r.pln_base_unit(), r.ttl_base_unit()));
			}
			// 合計行を作成・末尾行に追加
			if (getDispRslt4L().size() > 0) {
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.sum(getSumColNames4());
				DispRslt4R sumRow04 = getDispRslt4L().groupBy(policy).get(0);
				for (String nm : getSumColNames4()) {
					if (isNull(sumRow04.getValueNE(nm))) {
						sumRow04.setValue(nm, MCNumber.ZERO);
					}
				}
				getDispRslt4L().add(sumRow04);
			}

			for (DispRslt5R r : getDispRslt5L()) {
				String s;
				MCNumber sumCost = MCNumber.ZERO;
				MCNumber sumPlnCost = MCNumber.ZERO;
				for (int i = 0; i < _vh5.getElmCols().length; i++) {
					if (i % _elmNum5 == 0) {
						s = _vh5.getElmCols()[i];
						sumCost = MCNumber.sum(sumCost, (MCNumber) r.getValueNE(s));
					}
					else if (i % _elmNum5 == 2) {
						s = _vh5.getElmCols()[i];
						sumPlnCost = MCNumber.sum(sumPlnCost, (MCNumber) r.getValueNE(s));
					}
				}
				r.ttl_cost(sumCost);
				r.ttl_base_unit(calcUpri(r.ttl_cost(), getDispRsltL().get(1).ttl(),
						_baseUnitDigit));

				r.pln_cost(sumPlnCost);
				r.pln_base_unit(calcUpri(r.pln_cost(), getDispRsltL().get(1).pln(),
						_baseUnitDigit));

				r.diff_cost(calcDiff(r.pln_cost(), r.ttl_cost()));
				r.diff_base_unit(calcDiff(r.pln_base_unit(), r.ttl_base_unit()));
			}
			// 合計行を作成・末尾行に追加
			if (getDispRslt5L().size() > 0) {
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.sum(getSumColNames5());
				DispRslt5R sumRow05 = getDispRslt5L().groupBy(policy).get(0);
				for (String nm : getSumColNames5()) {
					if (isNull(sumRow05.getValueNE(nm))) {
						sumRow05.setValue(nm, MCNumber.ZERO);
					}
				}
				getDispRslt5L().add(sumRow05);
			}
		}

		protected MCNumber calcDiff(MCNumber pln, MCNumber ttl) {
			return nvl(pln, MCNumber.ZERO).subtract(nvl(ttl, MCNumber.ZERO));
		}

	}

	/**
	 * Panel[Cnd]のボタン[select_all_alc]の押下時の処理
	 */
	@Override
	public void doCnd_select_all_alc(MCEventInfo info) {
		setBoolean(AlcTtlPanel, true);
	}

	/**
	 * Panel[Cnd]のボタン[deselect_all_alc]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all_alc(MCEventInfo info) {
		setBoolean(AlcTtlPanel, false);
	}

	/**
	 * Panel[LPnl]のボタン[redisplay]の押下時の処理
	 */
	@Override
	public void doLPnl_redisplay(MCEventInfo info) {
		setAddDigit();
		DispRsltTable.adjustWidth();
		DispRslt2Table.adjustWidth();
		DispRslt3Table.adjustWidth();
		DispRslt4Table.adjustWidth();
		DispRslt5Table.adjustWidth();
	}

	protected void setAddDigit() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) DispRsltTable.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
		cc = (MGUDP_CellConfig) DispRslt2Table.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
		cc = (MGUDP_CellConfig) DispRslt3Table.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
		cc = (MGUDP_CellConfig) DispRslt4Table.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
		cc = (MGUDP_CellConfig) DispRslt5Table.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0490_Srch01();
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();

		initVhInfo();
		initVhInfo2();
		initVhInfo3();
		initVhInfo4();
		initVhInfo5();
	}

	/**
	 * VHConverterの初期化
	 */
	protected void initVhInfo() {
		_dtl_col_num = initVhInfoSub(_vh, DispRsltTable,
				DispRsltR.create().getExtMap(DispRsltR.$$ELM));
	}

	protected void initVhInfo2() {
		_dtl_col_num2 = initVhInfoSub(_vh2, DispRslt2Table,
				DispRslt2R.create().getExtMap(DispRslt2R.$$ELM));
	}

	protected void initVhInfo3() {
		_dtl_col_num3 = initVhInfoSub(_vh3, DispRslt3Table,
				DispRslt3R.create().getExtMap(DispRslt3R.$$ELM));
	}

	protected void initVhInfo4() {
		_dtl_col_num4 = initVhInfoSub(_vh4, DispRslt4Table,
				DispRslt4R.create().getExtMap(DispRslt4R.$$ELM));
	}

	protected void initVhInfo5() {
		_dtl_col_num5 = initVhInfoSub(_vh5, DispRslt5Table,
				DispRslt5R.create().getExtMap(DispRslt5R.$$ELM));
	}

	protected int initVhInfoSub(MGUCP_VHConverter<?, ?> vh, MCTable<?> table,
			Map<String, String> map) {
		int i = 0;
		if (vh.getConfs() == null) {
			ArrayList<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : table.getColumnConfigs()) {
				String val = map.get(conf.getBaseRowColumnName());
				if (val != null) {
					confs.add(conf);
					i = i + 1;
				}
			}
			vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}
		else {
			i = vh.getConfs().length;
		}
		vh.initColInfo(_SCALE, 0, null, 0, i);
		vh.setInvisibleColumn();
		return i;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) DispRsltTable.getCellConfig();
		for (MCColumnConfig c : DispRsltTable.getColumnConfigs()) {
			cc.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc.putColumnBG(columnDispRslt_ttl, _allTtlColor);
		cc.putColumnBG(columnDispRslt_diff, _moneyDiffColor);

		cc = (MGUDP_CellConfig) DispRslt2Table.getCellConfig();
		for (MCColumnConfig c : DispRslt2Table.getColumnConfigs()) {
			cc.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc.putColumnBG(columnDispRslt2_ttl_qty, _allTtlColor);
		cc.putColumnBG(columnDispRslt2_ttl_unit, _allTtlColor);
		cc.putColumnBG(columnDispRslt2_ttl_cost, _allTtlColor);
		cc.putColumnBG(columnDispRslt2_ttl_base, _allTtlColor);
		cc.putColumnBG(columnDispRslt2_ttl_base_unit, _allTtlColor);
		cc.putColumnBG(columnDispRslt2_diff_qty, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt2_diff_unit, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt2_diff_cost, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt2_diff_base, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt2_diff_base_unit, _moneyDiffColor);

		cc = (MGUDP_CellConfig) DispRslt3Table.getCellConfig();
		for (MCColumnConfig c : DispRslt3Table.getColumnConfigs()) {
			cc.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc.putColumnBG(columnDispRslt3_ttl_qty, _allTtlColor);
		cc.putColumnBG(columnDispRslt3_ttl_unit, _allTtlColor);
		cc.putColumnBG(columnDispRslt3_ttl_cost, _allTtlColor);
		cc.putColumnBG(columnDispRslt3_ttl_base, _allTtlColor);
		cc.putColumnBG(columnDispRslt3_ttl_base_unit, _allTtlColor);
		cc.putColumnBG(columnDispRslt3_diff_qty, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt3_diff_unit, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt3_diff_cost, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt3_diff_base, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt3_diff_base_unit, _moneyDiffColor);

		cc = (MGUDP_CellConfig) DispRslt4Table.getCellConfig();
		for (MCColumnConfig c : DispRslt4Table.getColumnConfigs()) {
			cc.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc.putColumnBG(columnDispRslt4_ttl_cost, _allTtlColor);
		cc.putColumnBG(columnDispRslt4_ttl_base_unit, _allTtlColor);
		cc.putColumnBG(columnDispRslt4_diff_cost, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt4_diff_base_unit, _moneyDiffColor);

		cc = (MGUDP_CellConfig) DispRslt5Table.getCellConfig();
		for (MCColumnConfig c : DispRslt5Table.getColumnConfigs()) {
			cc.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc.putColumnBG(columnDispRslt5_ttl_cost, _allTtlColor);
		cc.putColumnBG(columnDispRslt5_ttl_base_unit, _allTtlColor);
		cc.putColumnBG(columnDispRslt5_diff_cost, _moneyDiffColor);
		cc.putColumnBG(columnDispRslt5_diff_base_unit, _moneyDiffColor);
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl,
			String type) {
		if (tbl == DispRsltTable || tbl == DispRslt2Table || tbl == DispRslt3Table
				|| tbl == DispRslt4Table || tbl == DispRslt5Table) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// 可変カラムの部分を再設定する
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
		}
		else if (table == DispRslt2Table) {
			customVisibleColumnConfigsSub(confSet, _vh2, table, DispRslt2R.$$CLEAR);
		}
		else if (table == DispRslt3Table) {
			customVisibleColumnConfigsSub(confSet, _vh3, table, DispRslt3R.$$CLEAR);
		}
		else if (table == DispRslt4Table) {
			customVisibleColumnConfigsSub(confSet, _vh4, table, DispRslt4R.$$CLEAR);
		}
		else if (table == DispRslt5Table) {
			customVisibleColumnConfigsSub(confSet, _vh5, table, DispRslt5R.$$CLEAR);
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	protected void customVisibleColumnConfigsSub(Set<MCColumnConfig> confSet,
			MGUCP_VHConverter vh, MCTable table, String group) {
		// 常に非表示にしている月別の計画用項目を除く
		confSet.removeAll(Arrays.asList(vh.getConfs()));
		List<MCColumnConfig> list = Arrays.asList(vh.getConfs()).subList(0,
				vh.getViewSize());
		ArrayList<MCColumnConfig> invList = getGroupColumnConfigs(table, group);
		ArrayList<MCColumnConfig> newList = new ArrayList<MCColumnConfig>();
		for (MCColumnConfig cc : list) {
			if (!invList.contains(cc)) {
				newList.add(cc);
			}
		}
		confSet.addAll(newList);
	}

	/**
	 * 集計対象のカラム名の配列を返す
	 */
	protected String[] getSumColNames2() {
		if (_sumColNames2 == null) {
			ArrayList<String> sumColNames = new ArrayList<String>();
			for (int i = 0; i < 60; i++) {
				sumColNames.add(
						"col_" + lpad(String.valueOf(i * _elmNum2 + 2), _SCALE, "0"));
				sumColNames.add(
						"col_" + lpad(String.valueOf(i * _elmNum2 + 4), _SCALE, "0"));
			}
			sumColNames.add(DispRslt2R.$ttl_cost);
			sumColNames.add(DispRslt2R.$ttl_base_unit);
			sumColNames.add(DispRslt2R.$pln_cost);
			sumColNames.add(DispRslt2R.$pln_base_unit);
			sumColNames.add(DispRslt2R.$diff_cost);
			sumColNames.add(DispRslt2R.$diff_base_unit);

			_sumColNames2 = sumColNames.toArray(new String[0]);
		}
		return _sumColNames2;
	}

	/**
	 * 集計対象のカラム名の配列を返す
	 */
	protected String[] getSumColNames3() {
		if (_sumColNames3 == null) {
			ArrayList<String> sumColNames = new ArrayList<String>();
			for (int i = 0; i < 60; i++) {
				sumColNames.add(
						"col_" + lpad(String.valueOf(i * _elmNum3 + 2), _SCALE, "0"));
				sumColNames.add(
						"col_" + lpad(String.valueOf(i * _elmNum3 + 4), _SCALE, "0"));
			}
			sumColNames.add(DispRslt3R.$ttl_cost);
			sumColNames.add(DispRslt3R.$ttl_base_unit);
			sumColNames.add(DispRslt3R.$pln_cost);
			sumColNames.add(DispRslt3R.$pln_base_unit);
			sumColNames.add(DispRslt3R.$diff_cost);
			sumColNames.add(DispRslt3R.$diff_base_unit);

			_sumColNames3 = sumColNames.toArray(new String[0]);
		}
		return _sumColNames3;
	}

	/**
	 * 集計対象のカラム名の配列を返す
	 */
	protected String[] getSumColNames4() {
		if (_sumColNames4 == null) {
			ArrayList<String> sumColNames = new ArrayList<String>();
			for (int i = 0; i < 60; i++) {
				sumColNames.add("col_" + lpad(String.valueOf(i * _elmNum4), _SCALE, "0"));
				sumColNames.add(
						"col_" + lpad(String.valueOf(i * _elmNum4 + 1), _SCALE, "0"));
			}
			sumColNames.add(DispRslt4R.$ttl_cost);
			sumColNames.add(DispRslt4R.$ttl_base_unit);
			sumColNames.add(DispRslt4R.$pln_cost);
			sumColNames.add(DispRslt4R.$pln_base_unit);
			sumColNames.add(DispRslt4R.$diff_cost);
			sumColNames.add(DispRslt4R.$diff_base_unit);

			_sumColNames4 = sumColNames.toArray(new String[0]);
		}
		return _sumColNames4;
	}

	/**
	 * 集計対象のカラム名の配列を返す
	 */
	protected String[] getSumColNames5() {
		if (_sumColNames5 == null) {
			ArrayList<String> sumColNames = new ArrayList<String>();
			for (int i = 0; i < 60; i++) {
				sumColNames.add("col_" + lpad(String.valueOf(i * _elmNum5), _SCALE, "0"));
				sumColNames.add(
						"col_" + lpad(String.valueOf(i * _elmNum5 + 1), _SCALE, "0"));
			}
			sumColNames.add(DispRslt5R.$ttl_cost);
			sumColNames.add(DispRslt5R.$ttl_base_unit);
			sumColNames.add(DispRslt5R.$pln_cost);
			sumColNames.add(DispRslt5R.$pln_base_unit);
			sumColNames.add(DispRslt5R.$diff_cost);
			sumColNames.add(DispRslt5R.$diff_base_unit);

			_sumColNames5 = sumColNames.toArray(new String[0]);
		}
		return _sumColNames5;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}

		setValueEx(LPnl_disp_qty, true);
		setValueEx(LPnl_disp_unit, true);
		setValueEx(LPnl_disp_amt, true);
		setValueEx(LPnl_disp_base, true);
		setValueEx(LPnl_disp_base_unit, true);
		setValueEx(LPnl_add_disp_digit, MCNumber.valueOf(_defAddDispDigit));
		displayColumn();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRslt2Table.addSortColumn(columnDispRslt2_oper_cd);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_typ);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_typ_d_cd);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_jnl_cd);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_cd);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_sub1);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_sub2);
		DispRslt2Table.addSortColumn(columnDispRslt2_itm_sub3);
		DispRslt2Table.addSortColumn(columnDispRslt2_inpt_rsn_cd);
		DispRslt2Table.addSortColumn(columnDispRslt2_asst_typ);

		DispRslt3Table.addSortColumn(columnDispRslt3_oper_cd);
		DispRslt3Table.addSortColumn(columnDispRslt3_wk_cost_cd);
		DispRslt3Table.addSortColumn(columnDispRslt3_wk_rsn_cd);

		DispRslt4Table.addSortColumn(columnDispRslt4_bp_cd);

		DispRslt5Table.addSortColumn(columnDispRslt5_alc_ac_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_wg_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_dpt_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_loc_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_oper_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_bp_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_ctg_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_itm_cd);
		DispRslt5Table.addSortColumn(columnDispRslt5_itm_sub1);
		DispRslt5Table.addSortColumn(columnDispRslt5_itm_sub2);
		DispRslt5Table.addSortColumn(columnDispRslt5_itm_sub3);
		DispRslt5Table.addSortColumn(columnDispRslt5_lot_no);
		DispRslt5Table.addSortColumn(columnDispRslt5_sublot_no);
		DispRslt5Table.addSortColumn(columnDispRslt5_sno1);
		DispRslt5Table.addSortColumn(columnDispRslt5_sno2);
		DispRslt5Table.addSortColumn(columnDispRslt5_sno3);
		DispRslt5Table.addSortColumn(columnDispRslt5_sno4);
		DispRslt5Table.addSortColumn(columnDispRslt5_expns_cd);
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		// 上部一覧は全行並び替え対象にする
		if (table == DispRsltTable) {
			return super.sort(table, policy);
		}

		return sortWithoutBottom(table, policy);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		DispRsltTable.selectLeftmostColumn(0);
	}

	// -----------------------------------------------
	// Event

	@Override
	public void doLPnl_add_disp_digit_LC(MCEventInfo info) {
		super.doLPnl_add_disp_digit_LC(info);

		MCNumber n = (MCNumber) info.getNewValue();
		if (isNull(n)) {
			LPnl_add_disp_digit.setValue(MCNumber.ZERO);
		}
	}

	@Override
	public boolean doLPnl_add_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber) info.getNewValue();
		if (!isDecPlace(n)) {
			return false;
		}
		return super.doLPnl_add_disp_digit_VC(info);
	}

	// 原単位追加表示桁のチェック
	protected boolean isDecPlace(MCNumber n) {
		return MCNumber.ZERO.lte(n) && new MCNumber(8).gte(n);
	}

	@Override
	public void doLPnl_disp_qty_NC(MCEventInfo info) {
		super.doLPnl_disp_qty_NC(info);
		displayColumnLowerTables();
	}

	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		displayColumnLowerTables();
	}

	@Override
	public void doLPnl_disp_amt_NC(MCEventInfo info) {
		super.doLPnl_disp_amt_NC(info);
		displayColumnLowerTables();
	}

	@Override
	public void doLPnl_disp_base_NC(MCEventInfo info) {
		super.doLPnl_disp_base_NC(info);
		displayColumnLowerTables();
	}

	@Override
	public void doLPnl_disp_base_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_base_unit_NC(info);
		displayColumnLowerTables();
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		getCndR().inv_flg(false);
		if (isNull(getCndR().pln_calc_grp_cd())) {
			getCndR().pln_flg(false);
		}
		else {
			getCndR().pln_flg(true);
		}
		changeColumnMode(DispRsltTable, getCndR(), DispRsltR.$$SHOW);
		_vh.setInvisibleColumn();
		displayColumnLowerTables();
	}

	protected void displayColumnLowerTables() {
		changeColumnMode(DispRslt2Table, getCndR(), DispRslt2R.$$SHOW);
		changeColumnMode(DispRslt3Table, getCndR(), DispRslt3R.$$SHOW);
		changeColumnMode(DispRslt4Table, getCndR(), DispRslt4R.$$SHOW);
		changeColumnMode(DispRslt5Table, getCndR(), DispRslt5R.$$SHOW);
		setPlnFlg();
		changeColumnMode(DispRslt2Table, getLPnlR(), DispRslt2R.$$OTHER);
		changeColumnMode(DispRslt3Table, getLPnlR(), DispRslt3R.$$OTHER);
		changeColumnMode(DispRslt4Table, getLPnlR(), DispRslt4R.$$OTHER);
		changeColumnMode(DispRslt5Table, getLPnlR(), DispRslt5R.$$OTHER);
		_vh2.setInvisibleColumn();
		_vh3.setInvisibleColumn();
		_vh4.setInvisibleColumn();
		_vh5.setInvisibleColumn();
		DispRslt2Table.adjustWidth();
		DispRslt3Table.adjustWidth();
		DispRslt4Table.adjustWidth();
		DispRslt5Table.adjustWidth();
	}

	protected void setPlnFlg() {
		getLPnlR().pln_and_qty_flg(getCndR().pln_flg() && getLPnlR().disp_qty());
		getLPnlR().pln_and_unit_flg(getCndR().pln_flg() && getLPnlR().disp_unit());
		getLPnlR().pln_and_amt_flg(getCndR().pln_flg() && getLPnlR().disp_amt());
		getLPnlR().pln_and_base_flg(getCndR().pln_flg() && getLPnlR().disp_base());
		getLPnlR().pln_and_base_unit_flg(
				getCndR().pln_flg() && getLPnlR().disp_base_unit());
	}

	// -----------------------------------------------
	// CellConfig

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltCellConfig());
		DispRslt2Table.setCellConfig(createDispRsltCellConfig());
		DispRslt3Table.setCellConfig(createDispRsltCellConfig());
		DispRslt4Table.setCellConfig(createDispRsltCellConfig());
		DispRslt5Table.setCellConfig(createDispRsltCellConfig());
	}

	protected DispRsltCellConfig createDispRsltCellConfig() {
		return new DispRsltCellConfig();
	}

	protected class DispRsltCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (table.getBaseTable() == DispRsltTable) {
				return super.getPriorBG(index, column, table, mode);
			}
			else if (table.getBaseTable() == DispRslt2Table
					&& index == getDispRslt2L().size() - 1) {
				return _allTtlColor;
			}
			else if (table.getBaseTable() == DispRslt3Table
					&& index == getDispRslt3L().size() - 1) {
				return _allTtlColor;
			}
			else if (table.getBaseTable() == DispRslt4Table
					&& index == getDispRslt4L().size() - 1) {
				return _allTtlColor;
			}
			else if (table.getBaseTable() == DispRslt5Table
					&& index == getDispRslt5L().size() - 1) {
				return _allTtlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		protected String getPriorViewScaleType(int index, MCColumnConfig column,
				MCTable<?> table) {
			if (table.getBaseTable() == DispRsltTable) {
				DispRsltR r = DispRsltTable.getRow(index);
				if (isSame(r.id(), 1)) {
					return IfViewScale.AMT;
				}
				else if (r.id().gt(5)) {
					return IfViewScale.UNIT;
				}
			}
			return super.getPriorViewScaleType(index, column, table);
		}

		@Override
		public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {
			int vs = super.getPriorViewScale(index, column, table);
			String type = getPriorViewScaleType(index, column, table);
			if (type != null) {
				if (isSame(type, "QTY")) { // 数量(この画面のみ有効)
					if (table.getBaseTable() == DispRslt2Table) {
						DispRslt2R r = DispRslt2Table.getRow(index);
						if (!isNull(r.dec_place())) {
							vs = r.dec_place().intValueExact();
						}
					}
					else if (table.getBaseTable() == DispRslt3Table) {
						DispRslt3R r = DispRslt3Table.getRow(index);
						if (!isNull(r.dec_place())) {
							vs = r.dec_place().intValueExact();
						}
					}
				}
				else if (isSame(type, IfViewScale.STD)) { // 原単位(通常STDは標準原価用)
					if (table.getBaseTable() == DispRslt2Table) {
						DispRslt2R r = DispRslt2Table.getRow(index);
						if (isNull(r.dec_place())) {
							vs = getAddDigit();
						}
						else {
							vs = r.dec_place().intValueExact() + getAddDigit();
						}
					}
					else if (table.getBaseTable() == DispRslt3Table) {
						DispRslt3R r = DispRslt3Table.getRow(index);
						if (isNull(r.dec_place())) {
							vs = getAddDigit();
						}
						else {
							vs = r.dec_place().intValueExact() + getAddDigit();
						}
					}
				}
				else if (isSame(type, IfViewScale.INPUT)) { // 原単位単価(通常INPUTは値入力用桁数)
					vs = getCostUnitDispDigit((MGUDP_PanelBase) table.getBaseRootPanel())
							+ getAddDigit();
				}
			}
			else {
				if (table.getBaseTable() == DispRsltTable
						&& !isNull(getDispRsltL().get(index).dec_place())) {
					return getDispRsltL().get(index).dec_place().intValue();
				}
			}
			return vs;
		}
	}

}