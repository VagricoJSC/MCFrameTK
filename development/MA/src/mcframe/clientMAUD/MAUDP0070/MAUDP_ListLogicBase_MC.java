package mcframe.clientMAUD.MAUDP0070;

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

import mcframe.clientCore.beans.list.MCListConfig;
import mcframe.clientCore.beans.list.MCLinkBeans;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.$IS_REQ_PLURAL;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.$INPUT_REQ_PLURAL_VAL;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_ListLogicBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_ListLogicBase_MC extends MAUDP_ListLogicBase_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_ListLogicBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	@Override
	protected void setInputValue(MCRow row,
			MCListConfig c,
			Comparable<?> newValue) {
		super.setInputValue(row, c, newValue);

		if (MCListConfig.INPUT.equals(c.getOpeType())) {
			MCLinkBeans ib = c.getListPutter().getLinkBeans();
			//必須複数値項目に複数値が入力された場合、サーバ側で分岐できるように条件を加工する
			if (isStrictPluralValueField(ib)) {
				if (!isNull(newValue) && newValue instanceof String) {
					String[] pv = mcframe.commonCore.lang.MCStringUtil.arrayValueSplit((String) newValue);
					if (pv.length > 1) {
						//複数値用の条件を追加させる
						row.setValueNE($IS_REQ_PLURAL, true);
						row.setValueNE($INPUT_REQ_PLURAL_VAL, newValue);
						//標準の手入力条件はカットオフさせる
						row.setValueNE($INPUT_VAL, null);
					}
				}
			}
		}
	}
	
	/**
	 * GUI部品が見出しの入力制限つき複数値入力フィールドかどうかを判定します。
	 */
	protected boolean isStrictPluralValueField(MCLinkBeans b) {
		//MCPluralValueFieldを実装している見出し用GUI部品
		//標準では処理速度を優先しMCPluralValueFieldでは評価しない。
		if (b instanceof MCTextField || b instanceof MCTextComboBox) {
			MCPluralValueField pf = (MCPluralValueField)b;
			if (pf.isPluralValueEnable()) {
				return mcframe.clientCore.beans.list.MCListType.STRICT == b.getListType();
			}
		}
		return false;
	}

}