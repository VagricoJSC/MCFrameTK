package mcframe.clientMSUA.MSUAP1090;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_SetItm"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_SetItm_MC extends MSUAP_SetItm_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_SetItm_MC() {
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
	public MSUAP_SetItm_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSUAL1090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSUAL1090_Srch01Caller<P extends MSUAP_SetItm, B extends MS_MSUAL1090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSUAL1090_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			
			if (!getRsltL().isEmpty()) {
				MCList<RsltR> tmp = getRsltL().groupBy(RsltR.$set_grp_cd);
				if (tmp.size() == 1) {
					getRsltL().setBoolean(RsltR.$check, true);
				}
			}
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		Cnd_main_itm_qty_p_PPanel.setRelateBeans(Cnd_main_itm_unit_cd, Cnd_dec_place);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_set_itm_unit_cd, columnRslt_dec_place);
	}

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>
	 * 起動タイプ：T1 （参照）<br>
	 * バインド値 ＜任意＞<br>
	 * <table border = 1>
	 * <tr><th>カラム名</th>			<th>型</th>			<th>備考</th></tr>
	 * <tr><td>main_itm_cd</td>			<td>String</td>		<td>必須です。</td></tr>
	 * <tr><td>main_itm_sub1</td>			<td>String</td>		<td>必須です。</td></tr>
	 * <tr><td>main_itm_sub2</td>			<td>String</td>		<td>必須です。</td></tr>
	 * <tr><td>main_itm_sub3</td>			<td>String</td>		<td>必須です。</td></tr>
	 * <tr><td>main_itm_unit_cd</td>	<td>String</td>		<td>必須です。</td>
	 * <tr><td>dec_place</td>	<td>MCNumber</td>		<td>-</td></tr>
	 * <tr><td>main_itm_qty</td>					<td>MCNumber</td>	<td>必須です。数量を指定すると係数に従って品揃品目の数量を決定します。</td></tr>
	 * <tr><td>base_dt</td>		<td>MCDate</td>	<td>必須です。品揃マスタを検索する際の基準日です。</td></tr>
	 * <tr><td>set_itm_grp_no</td>		<td>MCNumber</td>	<td>品揃グループＮＯを指定するとその番号で品揃品目を展開します。指定がない場合は自動的に採番します。</td></tr>
	 * </table> <br>
	 * その他の引数[0]：品目コードのカラムコンフィグ<br>
	 * その他の引数[1]：枝番１のカラムコンフィグ<br>
	 * その他の引数[2]：枝番２のカラムコンフィグ<br>
	 * その他の引数[3]：枝番３のカラムコンフィグ<br>
	 * その他の引数[4]：単位コードのカラムコンフィグ<br>
	 * その他の引数[5]：数量のカラムコンフィグ<br>
	 * その他の引数[6]：品揃グループＮＯのカラムコンフィグ<br>
	 * </li>
	 * </P>
	 *
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param param その他の引数
	 */

	@Override
	public void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		if (T1 == openTyp) {
			initByScreenParamT1(bind, param);
		}
	}

	/**
	 * 起動タイプ：T1の初期化を行う。
	 * @param bind バインド値
	 * @param param その他の引数
	 */
	protected void initByScreenParamT1(MCRow bind, Object... param) {
		
		// その他の引数
		_itm_cd_col = (MCColumnConfig)param[0];
		_itm_sub1_col = (MCColumnConfig)param[1];
		_itm_sub2_col = (MCColumnConfig)param[2];
		_itm_sub3_col = (MCColumnConfig)param[3];
		_unit_col = (MCColumnConfig)param[4];
		_qty_col = (MCColumnConfig)param[5];
		_grp_no_col = (MCColumnConfig)param[6];

		// バインド値
		String main_itm_cd = bind.getString("main_itm_cd");
		String main_itm_sub1 = bind.getString("main_itm_sub1");
		String main_itm_sub2 = bind.getString("main_itm_sub2");
		String main_itm_sub3 = bind.getString("main_itm_sub3");
		String main_itm_unit_cd = bind.getString("main_itm_unit_cd");
		MCNumber dec_place = bind.getNumber("dec_place");
		MCNumber main_itm_qty = bind.getNumber("main_itm_qty");
		MCDate base_dt = bind.getDate("base_dt");
		MCNumber set_itm_grp_no = bind.getNumber("set_itm_grp_no");

		getCndR().main_itm_cd(main_itm_cd);
		getCndR().main_itm_sub1(main_itm_sub1);
		getCndR().main_itm_sub2(main_itm_sub2);
		getCndR().main_itm_sub3(main_itm_sub3);
		getCndR().main_itm_unit_cd(main_itm_unit_cd);
		getCndR().dec_place(dec_place);
		getCndR().main_itm_qty(main_itm_qty);
		getCndR().base_dt(base_dt);
		getCndR().set_itm_grp_no(set_itm_grp_no);
		
		// 検索
		addDoBehind(Cnd_srch);
	}

	/** 親画面の品目コード反映用のカラムコンフィグ */
	protected MCColumnConfig _itm_cd_col;

	/** 親画面の品目枝番1反映用のカラムコンフィグ */
	protected MCColumnConfig _itm_sub1_col;

	/** 親画面の品目枝番2反映用のカラムコンフィグ */
	protected MCColumnConfig _itm_sub2_col;

	/** 親画面の品目枝番3反映用のカラムコンフィグ */
	protected MCColumnConfig _itm_sub3_col;

	/** 親画面の単位コード反映用のカラムコンフィグ */
	protected MCColumnConfig _unit_col;

	/** 親画面の数量反映用のカラムコンフィグ */
	protected MCColumnConfig _qty_col;
	
	/** 親画面の日付反映用のテキストフィールド */
	protected MCDateField _base_dt_field;

	/** 親画面の品揃グループＮＯ反映用のカラムコンフィグ */
	protected MCColumnConfig _grp_no_col;

	/**
	 * 品揃品目をベーステーブルに展開する
	 *
	 * @param checkedL チェックした行のリスト
	 */
	protected void setGrpItms(MCList<RsltR> checkedL) {
		
		MCTable<?> base = _itm_cd_col.getBaseTable();
		
		int i = base.getMCSelectedRow();
		
		if (i < 0) {
			return;
		}

		// 番号の取得と選択行への設定
		MCNumber no = getSetItmGrpNo(i);
		
		if (!checkedL.subList(RsltR.$ship_assort_flg, true).isEmpty()) {
			setValueEx(_grp_no_col, i, no);
		}
		
		// 品揃品目の展開
		for (RsltR r : checkedL) {
			// 行追加
			i++;
			_setGrpItms(base, r, no, i);
		}
	}

	/**
	 * 品揃品目を呼び出し元のテーブルに追加する。
	 * 
	 * @param base 呼び出し元のテーブル
	 * @param r 本画面の選択行
	 * @param no 品揃グループＮＯ
	 * @param i 対象行のインデックス
	 */
	protected void _setGrpItms(MCTable<?> base, RsltR r, MCNumber no, int i) {
		
		MCRow nextR = base.getRow(i);
		if (nextR == null || !nextR.isEmpty()) {
			base.insertRow(i);
		}
		// 値の設定
		setValueEx(_itm_cd_col, i, r.set_itm_cd());
		setValueEx(_itm_sub1_col, i, r.set_itm_sub1());
		setValueEx(_itm_sub2_col, i, r.set_itm_sub2());
		setValueEx(_itm_sub3_col, i, r.set_itm_sub3());
		setValueEx(_unit_col, i, r.set_itm_unit_cd());
		setValueEx(_qty_col, i, r.qty());
		
		if (r.ship_assort_flg()) {
			setValueEx(_grp_no_col, i, no);
		}
	}
	
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSUAL1090_Srch01();
	}
	
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), true);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), false);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		
		setGrpItms(getRsltL().subList(RsltR.$check, true));
		requestCloseWindow();
	}

	/**
	 * 品揃グループＮＯを取得する<br>
	 * 呼び出し元から指定がある場合にはその値を使用する<br>
	 * 指定されていない場合は新規に採番する
	 *
	 * @param i 対象行のインデックス
	 * @return 品揃グループＮＯ
	 */
	protected MCNumber getSetItmGrpNo(int i) {
		
		MCNumber no = getCndR().set_itm_grp_no();
		
		if (isNull(no)) {
			
			MCList<?> list = _grp_no_col.getTable().getList();
			String nm = _grp_no_col.getRowColumnName();
			
			MCNumber max = (MCNumber)list.max(nm);
			no = isNull(max) ? MCNumber.ZERO : max.add(1);
		}
		return no;
	}

}