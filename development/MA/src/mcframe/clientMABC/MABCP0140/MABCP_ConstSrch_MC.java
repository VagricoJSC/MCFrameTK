package mcframe.clientMABC.MABCP0140;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.lang.reflect.Method;
import mcframe.commonFX.constant.FX_Const;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonFS.constant.FSC_MODULE_ID;
import static mcframe.commonFX.notice.FX_Msg_FW_A.*;
import mcframe.clientCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ConstSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ConstSrch_MC extends MABCP_ConstSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 定数グループのリスト */
	protected MCList<DtlR> _dtlL;
	/** モジュールＩＤのマップ */
	protected Map<String, FSC_MODULE_ID> _map;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ConstSrch_MC() {
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
	public MABCP_ConstSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[SrchBtn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doSrchBtn_srch(MCEventInfo info) {
		srchConst();
	}

	/**
	 * 検索条件に合致した定数のリストを定数一覧に表示します。
	 */
	protected void srchConst() {
		DtlSubTable.clear();

		String modId = getCnvStr(getCndR().module_id(), getSrchBtnR().partial_flg());
		String constGrp = getCnvStr(getCndR().const_grp(), getSrchBtnR().partial_flg());
		String constGrpNm = getCnvStr(getCndR().const_grp_nm(), getSrchBtnR().partial_flg());

		MCList<DtlR> list = MCList.create(DtlR.class);
		for (DtlR r : _dtlL) {
			if (r.module_id().matches(modId) && r.const_grp().matches(constGrp)
					&& nvl(r.const_grp_nm(), "").matches(constGrpNm)) {
				list.add(r);
			}
		}

		getDtlL().setAll(list);
		DtlTable.adjustWidth();

		if (list.isEmpty()) {
			dialog(FXBAP0033);
			CndPanel.focusFirstComponent();
		} else {
			DtlTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * 部分一致チェック用の文字列に変換した文字列を返す
	 */
	protected String getCnvStr(String str, boolean partialFlg) {
		if (isNull(str)) {
			return ".*";
		}
		return partialFlg ? ".*" + str.toUpperCase() + ".*" : str.toUpperCase();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		DtlR r = getDtlL().get(info.getEventIndex());

		String mdlId = r.module_id();
		String typeId = mdlId + "C_" + r.const_grp();

		Class cls = MCFactory.getClass(FX_Const.class, "mcframe.common" + mdlId + ".constant." + typeId);

		// 属性メソッドの取得
		List<Method> mtdList = new ArrayList<Method>();
		for (Method m : cls.getDeclaredMethods()) {
			if (!isSame(m.getName(), "value") && !isSame(m.getName(), "toString")) {
				mtdList.add(m);
			}
		}
		mtdList.sort(new Comparator<Method>() {
			public int compare(Method mtd1, Method mtd2) {
				return mtd1.getName().compareTo(mtd2.getName());
			}
		});
		// 属性カラム表示制御
		for (int i = 1; i <= 30; i++) {
			MCColumnConfig c = DtlSubTable.getColumnConfig("DtlSub.col" + i);
			if (mtdList.size() >= i) {
				setDefaultMode(c);
				c.setHeaderName(mtdList.get(i - 1).getName());
				c.setHeaderMessage(mtdList.get(i - 1).getName());
			} else {
				c.setMode(MCMode.INVISIBLE);
			}
		}

		FX_Const[] constArr = (FX_Const[]) MCFactory.invokeStatic(cls, "array", null, null);

		MCList<DtlSubR> list = MCList.create(DtlSubR.class);
		for (FX_Const c : constArr) {
			DtlSubR row = DtlSubR.create();
			row.const_key(c.key());
			row.const_value(c.value().toString());
			row.const_name(c.name());
			String key = MCConst.createKey(r.module_id(), "CONST", r.const_grp(), "keys", c.key(), "rmrks");
			row.const_rmrks(MCConst.label.getLabel(key));

			for (int i = 1; i <= mtdList.size(); i++) {
				try {
					Method m = mtdList.get(i - 1);
					Object o = m.invoke(c);
					if (o != null) {
						row.setString("col" + i, o.toString());
					}
				} catch (Exception e) {
					// 何もしない
				}
			}
			list.add(row);
		}
		getDtlSubL().setAll(list);
		DtlSubTable.adjustWidth();
		DtlSubTable.selectLeftmostColumn(0);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(SrchBtn_partial_flg, true);
		setConstInfo();
	}

	/**
	 * リソースから定数情報を取得・保持します。
	 */
	protected void setConstInfo() {
		if (_dtlL == null) {
			_dtlL = MCList.create(DtlR.class);

			for (String key : MCConst.label.keySet()) {
				String[] strs = key.split("\\.");
				// リソースから定数グループを取得（モジュールF*は対象外）
				if (isSame(strs[1], "CONST") && !strs[0].matches("^F.*")) {
					addModuleMap(strs[0]);

					DtlR row = DtlR.create();
					row.module_id(strs[0]);
					FSC_MODULE_ID id = _map.get(strs[0]);
					if (id != null) {
						row.module_nm(id.name());
					}
					row.const_grp(strs[2]);
					_dtlL.add(row);
				}
			}
			_dtlL = _dtlL.groupBy(DtlR.$module_id, DtlR.$module_nm, DtlR.$const_grp);

			// 定数グループ名設定
			for (DtlR r : _dtlL) {
				String key = MCConst.createKey(r.module_id(), "CONST", r.const_grp(), "label");
				r.const_grp_nm(MCConst.label.getLabel(key));
			}
		}
	}

	/**
	 * 検索対象となるモジュールＩＤとそのクラスをマップに保持します。
	 */
	protected void addModuleMap(String moduleId) {
		if (_map == null) {
			_map = new HashMap<String, FSC_MODULE_ID>();
		}
		if (_map.containsKey(moduleId)) {
			return;
		}
		FSC_MODULE_ID id = FSC_MODULE_ID.getNE(moduleId);
		if (id != null) {
			_map.put(moduleId, id);
		}
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getCnd_module_id(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = MCList.create(MCRow.class);
		for (FSC_MODULE_ID id : _map.values()) {
			MCRow r = MCRow.create();
			r.addStringColumn(DtlR.$module_id, id.value());
			r.addStringColumn(DtlR.$module_nm, id.name());
			r.addStringColumn("_view", id.value() + " : " + id.name());
			l.add(r);
		}
		return l;
	}

	@Override
	public MCList getCnd_const_grp(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = MCList.create(MCRow.class);
		String modId = getCnvStr(getCndR().module_id(), getSrchBtnR().partial_flg());
		for (DtlR dtlR : _dtlL) {
			if (dtlR.module_id().matches(modId)) {
				MCRow r = MCRow.create();
				r.addStringColumn(DtlR.$const_grp, dtlR.const_grp());
				r.addStringColumn(DtlR.$const_grp_nm, nvl(dtlR.const_grp_nm(), ""));
				r.addStringColumn("_view", dtlR.const_grp() + " : " + nvl(dtlR.const_grp_nm(), ""));
				l.add(r);
			}
		}
		return l;
	}

	//--------------------リストロジック表示制御End-----------------------

}