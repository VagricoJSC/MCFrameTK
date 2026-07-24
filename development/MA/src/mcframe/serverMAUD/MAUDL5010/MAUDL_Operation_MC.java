package mcframe.serverMAUD.MAUDL5010;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

import mcframe.commonCore.container.MCContainer;
import mcframe.serverCore.logic.MCOperation;

public abstract class MAUDL_Operation_MC extends MCOperation {

	// 実行I/F
	@Override
	protected void call() {
		init();
		doIt();
		doEditDown();
		post();
	}

	/**
	 * 初期処理を行います。<p>
	 */
	void init() {

	}

	/**
	 * 処理を実行します。<p>
	 */
	protected abstract void doIt();

	/**
	 * 下り電文コンテナを編集します。<p>
	 * 下り電文のコンテナ全てに対して、doEditDown(MCContainer)を実行します。
	 */
	protected void doEditDown() {
		int i = 0;
		while(down(i) != null) {
			doEditDown(down(i++));
		}
	}

	/**
	 * 下り電文コンテナを編集します。
	 * @param cont 下り電文のコンテナ
	 */
	protected void doEditDown(MCContainer container) {
		// 区分名の設定
		setConstNm(container);
	}

	/**
	 * 後処理を行います。<p>
	 */
	void post() {

	}
}

