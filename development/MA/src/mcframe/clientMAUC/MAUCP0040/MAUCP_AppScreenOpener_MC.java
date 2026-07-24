package mcframe.clientMAUC.MAUCP0040;

import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import static mcframe.commonMA.meta.MA_META.*;

import java.util.Map;

import mcframe.clientCore.beans.MCModeBeans;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.clientCore.beans.MCRowBeans;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import java.util.Optional;
import mcframe.clientCore.beans.MCMode;

public class MAUCP_AppScreenOpener_MC extends mcframe.clientFXUC.FXUCP0200.FXUCP_AppScreenOpener {
	

	/**
	 * 入力値設定を有効にするか（デフォルト＝オフ）
	 */
	private boolean _psnlInput = false;

	/**
	 * 入力値設定の初期検索を有効にするか（デフォルト＝オフ）
	 */
	private boolean _initSrch = false;
	
	public MAUCP_AppScreenOpener_MC(String moduleid, String screenid) {
		super(moduleid, screenid);
	}

	/**
	 * 画面起動時に入力値設定を反映させる場合に実行する。
	 */
	public void runPsnlInput() {
		_psnlInput = true;
	}

	/**
	 * 入力値設定を反映させるかどうか。
	 * @return
	 */
	public boolean isPsnlInput() {
		return _psnlInput;
	}
	
	/**
	 * 入力値設定の初期検索設定を使用する場合に実行する。
	 */
	public void runPsnlInputInitSrch() {
		_initSrch = true;
		
	}
	
	/**
	 * 入力値設定の初期検索設定を使用するかどうか。
	 * @return
	 */
	public boolean isPsnlInputInitSrch() {
		return _initSrch;
	}
	
	
	@Override
	protected void beforeSetScreenParam(MCRootPanel rp) {
		super.beforeSetScreenParam(rp);
		
		if (rp instanceof IfMAUDP_PanelBase) {
			IfMAUDP_PanelBase p = (IfMAUDP_PanelBase) rp;
			// システムパラメータで非表示に設定されている項目を値設定対象から除外する（埋め込み画面）
			MCRootPanel[] parts = rp.getPartsPanels();
			for (MCRootPanel part : parts) {
				for (MCContainer c : ((MCRootPanel)part).getContainers()) {
					if (c instanceof MCConstRow) {
						MCConstRow r = (MCConstRow)((MCConstRow)c).createInstance();
						Map<String, String> m = r.getExtMap("DISP_CTL");
						if (m == null || m.isEmpty()) {
							continue;
						}
						for (Map.Entry<String, String> e : m.entrySet()) {
							if (MAUCP_BeansUtil.isInvisibleBySysParam(e.getValue(), p)) {
								MCRowBeans mb = (MCRowBeans)((MCRootPanel)p).getComponent((MCRow)c, e.getKey());
								removeParam(createGUIKey(mb));
							}
						}
					}
				}
			}

			// システムパラメータで非表示に設定されている項目を値設定対象から除外する（メイン画面）
			for (MCContainer c : ((MCRootPanel)p).getContainers()) {
				if (c instanceof MCConstRow) {
					MCConstRow r = (MCConstRow)((MCConstRow)c).createInstance();
					Map<String, String> m = r.getExtMap("DISP_CTL");
					if (m == null || m.isEmpty()) {
						continue;
					}
					for (Map.Entry<String, String> e : m.entrySet()) {
						if (MAUCP_BeansUtil.isInvisibleBySysParam(e.getValue(), p)) {
							MCRowBeans mb = (MCRowBeans)((MCRootPanel)p).getComponent((MCRow)c, e.getKey());
							removeParam(createGUIKey(mb));
						}
					}
				}
			}
			
			// 値の連携をモードで切り替える項目の評価。コンテナ拡張項目「DISP_CTL」で判別できない項目が対象。
			Optional.ofNullable(p.getDispCtl2CompsKeys()).ifPresent(keys -> {
				keys.stream().filter(key -> MAUCP_BeansUtil.isInvisibleBySysParam(key, p))
						.forEach(key -> {
							p.getDispCtl2CompsValue(key).forEach(beans -> {
								if (!MCMode.isEnable(beans)) {
									removeParam(createGUIKey(beans));
								}
							});
						});
			});
		}
	}
	
}
