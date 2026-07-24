package mcframe.clientMAUB.MAUBP5370;

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
import mcframe.commonCore.resource.ctrl.MCCustomResource;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_SprtTxt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_SprtTxt_D_MC extends MAUBP_SprtTxt_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final String RES_NM = "MCInputHistory";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_SprtTxt_D_MC() {
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
	public MAUBP_SprtTxt_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 指定したメタの長さで入力制御します。
	 * 
	 * @param meta 項目メタ
	 */
	public void setMetaLength(mcframe.commonCore.meta.MCMeta meta) {
		columnTxt_txt.setLength(meta.length());
	}

	@Override
	public MCList<MCRow> getTxt_txt(MCRow row, MCEventInfo info){
		MCList<MCRow> l = MCList.create(MCRow.class);
		int i = info.getEventIndex();
		if (i < 0) {
			return l;
		}
		String txt = (String)columnTxt_txt.getViewValue(i);
		for (String s : getInputHistory()) {
			if (isSame(l.size(), _viewSize)) {
				break;
			}
			if (isNull(txt) || s.matches(".*" + java.util.regex.Pattern.quote(txt) + ".*")) {
				MCRow r = MCRow.create();
				r.addStringColumn("txt", s);
				r.addStringColumn("_view", s);
				l.add(r);
			}
		}
		return l;
	}
	
	
	protected List<String> _inputHistory = null;
	protected List<String> getInputHistory() {
		if (_inputHistory == null) {

			_inputHistory = new ArrayList<String>();

			try {
				MCCustomResource cr = new MCCustomResource(RES_NM);
				cr.loadUser(MCSys.env.USERPROFILE(), null, null);
				String[] strArr = cr.getStringArray(getResKey(), null, null);
				
				int min = strArr.length;
				if (_memSize < min) {
					min = _memSize;
				}
				for (int i = 0; i < min; i++) {
					_inputHistory.add(strArr[i]);
				}
			}
			catch (Exception e) {
				// 何もしない
			}
		}
		return _inputHistory;
	}

	protected String getResKey() {
		String key = MCConst.createKey(getBaseRootPanel().getScreenID(),
				columnTxt_txt.getAliasName(getBaseRootPanel()));
		return key;
	}

	@Override
	public void beforeCallParts(MCRowMatcher matcher, MCCaller caller) {
		super.beforeCallParts(matcher, caller);
		saveInputHistory();
	}

	protected void saveInputHistory() {
		for (TxtR r :getTxtL()) {
			saveInputHistory(r);
		}
	}

	protected void saveInputHistory(TxtR r) {
		String txt = r.txt();
		if (isNull(txt)) {
			return ;
		}

		if (isSame(_memSize,0)) {
			_inputHistory = new ArrayList<String>();
		}
		else {
			if (getInputHistory().contains(txt)) {
				getInputHistory().remove(txt);
			}
			else {
				if (getInputHistory().size() == _memSize) {
					getInputHistory().remove(_memSize-1);
				}
			}
			getInputHistory().add(0,txt);
		}
		
		try {
			MCCustomResource cr = new MCCustomResource(RES_NM);
			cr.loadUser(MCSys.env.USERPROFILE(), null, null);
			cr.setStringArray(getResKey(), _inputHistory.toArray(new String[0]));
			cr.saveUser(MCSys.env.USERPROFILE(), null, null);
		}
		catch (Exception e) {
			// 何もしない
		}
	}

	protected int _memSize;
	protected int _viewSize;

	@Override
	protected void valueInit() {
		super.valueInit();

		_memSize = MCConst.app.getInteger("MA.MAUBP0220.his_memory_size", 100);
		_viewSize = MCConst.app.getInteger("MA.MAUBP0220.his_view_size", 20);
		
		if (_memSize < 0) {
			_memSize = 0;
		}
		if (_viewSize < 0) {
			_viewSize = 0;
		}
	}

}