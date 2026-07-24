package mcframe.serverMSBA.MSBAL5100;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBAL_WgRqstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAL_WgRqstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBAL5100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBAL_WgRqstService.WgRqst_Chk01 aWgRqst_Chk01;

	protected void initWgRqst_Chk01() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Chk01_INFO;
		this.aWgRqst_Chk01 = ((MSBAL_WgRqstService)this).new WgRqst_Chk01();
	}

	public static MSBAL_WgRqstService.WgRqst_Chk01 crtWgRqst_Chk01() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Chk01();
		return lgc.aWgRqst_Chk01;
	}

	protected void paramWgRqst_Chk01(MCParam p) {
		if (this.aWgRqst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Chk01.up0());
		p.addUpBlock(aWgRqst_Chk01.up1());
		p.addDownBlock(aWgRqst_Chk01.down0());
		p.addDownBlock(aWgRqst_Chk01.down1());
		p.addDownBlock(aWgRqst_Chk01.down2());
	}

	protected void doWgRqst_Chk01() {
		aWgRqst_Chk01.call();
	};

	/**
	 * WgRqst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR createWgRqst_Chk01_DtlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR.create();
	}

	/**
	 * WgRqst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR> createWgRqst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR.class);
	}

	/**
	 * WgRqst_Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR createWgRqst_Chk01_CtrlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR.create();
	}

	/**
	 * WgRqst_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R createWgRqst_Chk01_Dtl2R(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R.create();
	}

	/**
	 * WgRqst_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R> createWgRqst_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R.class);
	}

	/**
	 * WgRqst_Chk01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R createWgRqst_Chk01_Dtl3R(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R.create();
	}

	/**
	 * WgRqst_Chk01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R> createWgRqst_Chk01_Dtl3L(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R.class);
	}
	protected MSBAL_WgRqstService.WgRqst_Upd01 aWgRqst_Upd01;

	protected void initWgRqst_Upd01() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Upd01_INFO;
		this.aWgRqst_Upd01 = ((MSBAL_WgRqstService)this).new WgRqst_Upd01();
	}

	public static MSBAL_WgRqstService.WgRqst_Upd01 crtWgRqst_Upd01() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Upd01();
		return lgc.aWgRqst_Upd01;
	}

	protected void paramWgRqst_Upd01(MCParam p) {
		if (this.aWgRqst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Upd01.up0());
		p.addDownBlock(aWgRqst_Upd01.down0());
	}

	protected void doWgRqst_Upd01() {
		aWgRqst_Upd01.call();
	};

	/**
	 * WgRqst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR createWgRqst_Upd01_DtlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR.create();
	}

	/**
	 * WgRqst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR> createWgRqst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR.class);
	}
	protected MSBAL_WgRqstService.WgRqst_Chk02 aWgRqst_Chk02;

	protected void initWgRqst_Chk02() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Chk02_INFO;
		this.aWgRqst_Chk02 = ((MSBAL_WgRqstService)this).new WgRqst_Chk02();
	}

	public static MSBAL_WgRqstService.WgRqst_Chk02 crtWgRqst_Chk02() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Chk02();
		return lgc.aWgRqst_Chk02;
	}

	protected void paramWgRqst_Chk02(MCParam p) {
		if (this.aWgRqst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Chk02.up0());
		p.addDownBlock(aWgRqst_Chk02.down0());
	}

	protected void doWgRqst_Chk02() {
		aWgRqst_Chk02.call();
	};

	/**
	 * WgRqst_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR createWgRqst_Chk02_DtlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR.create();
	}

	/**
	 * WgRqst_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR> createWgRqst_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR.class);
	}
	protected MSBAL_WgRqstService.WgRqst_Upd02 aWgRqst_Upd02;

	protected void initWgRqst_Upd02() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Upd02_INFO;
		this.aWgRqst_Upd02 = ((MSBAL_WgRqstService)this).new WgRqst_Upd02();
	}

	public static MSBAL_WgRqstService.WgRqst_Upd02 crtWgRqst_Upd02() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Upd02();
		return lgc.aWgRqst_Upd02;
	}

	protected void paramWgRqst_Upd02(MCParam p) {
		if (this.aWgRqst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Upd02.up0());
		p.addUpBlock(aWgRqst_Upd02.up1());
		p.addDownBlock(aWgRqst_Upd02.down0());
		p.addDownBlock(aWgRqst_Upd02.down1());
	}

	protected void doWgRqst_Upd02() {
		aWgRqst_Upd02.call();
	};

	/**
	 * WgRqst_Upd02_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R createWgRqst_Upd02_Dtl1R(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R.create();
	}

	/**
	 * WgRqst_Upd02_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R> createWgRqst_Upd02_Dtl1L(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R.class);
	}

	/**
	 * WgRqst_Upd02_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R createWgRqst_Upd02_Dtl2R(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R.create();
	}

	/**
	 * WgRqst_Upd02_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R> createWgRqst_Upd02_Dtl2L(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R.class);
	}
	protected MSBAL_WgRqstService.WgRqst_Upd03 aWgRqst_Upd03;

	protected void initWgRqst_Upd03() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Upd03_INFO;
		this.aWgRqst_Upd03 = ((MSBAL_WgRqstService)this).new WgRqst_Upd03();
	}

	public static MSBAL_WgRqstService.WgRqst_Upd03 crtWgRqst_Upd03() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Upd03();
		return lgc.aWgRqst_Upd03;
	}

	protected void paramWgRqst_Upd03(MCParam p) {
		if (this.aWgRqst_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Upd03.up0());
	}

	protected void doWgRqst_Upd03() {
		aWgRqst_Upd03.call();
	};

	/**
	 * WgRqst_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR createWgRqst_Upd03_DtlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR.create();
	}

	/**
	 * WgRqst_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR> createWgRqst_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR.class);
	}
	protected MSBAL_WgRqstService.WgRqst_Upd04 aWgRqst_Upd04;

	protected void initWgRqst_Upd04() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Upd04_INFO;
		this.aWgRqst_Upd04 = ((MSBAL_WgRqstService)this).new WgRqst_Upd04();
	}

	public static MSBAL_WgRqstService.WgRqst_Upd04 crtWgRqst_Upd04() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Upd04();
		return lgc.aWgRqst_Upd04;
	}

	protected void paramWgRqst_Upd04(MCParam p) {
		if (this.aWgRqst_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Upd04.up0());
	}

	protected void doWgRqst_Upd04() {
		aWgRqst_Upd04.call();
	};

	/**
	 * WgRqst_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR createWgRqst_Upd04_DtlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR.create();
	}

	/**
	 * WgRqst_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR> createWgRqst_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR.class);
	}
	protected MSBAL_WgRqstService.WgRqst_Upd05 aWgRqst_Upd05;

	protected void initWgRqst_Upd05() {
		this.info = PDef.MS_MSBAL5100_WgRqst_Upd05_INFO;
		this.aWgRqst_Upd05 = ((MSBAL_WgRqstService)this).new WgRqst_Upd05();
	}

	public static MSBAL_WgRqstService.WgRqst_Upd05 crtWgRqst_Upd05() {
		MSBAL_WgRqstService lgc = new MSBAL_WgRqstService();
		lgc.initWgRqst_Upd05();
		return lgc.aWgRqst_Upd05;
	}

	protected void paramWgRqst_Upd05(MCParam p) {
		if (this.aWgRqst_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgRqst_Upd05.up0());
	}

	protected void doWgRqst_Upd05() {
		aWgRqst_Upd05.call();
	};

	/**
	 * WgRqst_Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR createWgRqst_Upd05_DtlR(){
		return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR.create();
	}

	/**
	 * WgRqst_Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR> createWgRqst_Upd05_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * WgRqst_Chk01オペレーション.<p>
	 *
	 * ＷＧ間依頼の登録・更新・削除前のチェックを行う<br>
	 */
	abstract public class WgRqst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R> down2;
		
		
		// コンストラクタ
		protected WgRqst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR.class);
			up1 = mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R.class);
			down2 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * WgRqst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR createWgRqst_Chk01_DtlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR.create();
		}

		/**
		 * WgRqst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR> createWgRqst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR.class);
		}

		/**
		 * WgRqst_Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR createWgRqst_Chk01_CtrlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR.create();
		}

		/**
		 * WgRqst_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R createWgRqst_Chk01_Dtl2R(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R.create();
		}

		/**
		 * WgRqst_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R> createWgRqst_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R.class);
		}

		/**
		 * WgRqst_Chk01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R createWgRqst_Chk01_Dtl3R(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R.create();
		}

		/**
		 * WgRqst_Chk01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R> createWgRqst_Chk01_Dtl3L(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.slo_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_can_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>start_peg_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_po_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>poSchdChk01</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfrSchdChk04</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk01_Dtl3R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}
	/**
	 * WgRqst_Upd01オペレーション.<p>
	 *
	 * ＷＧ間依頼の登録・更新・削除<br>
	 */
	abstract public class WgRqst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected WgRqst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * WgRqst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR createWgRqst_Upd01_DtlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR.create();
		}

		/**
		 * WgRqst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR> createWgRqst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.last_wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_inst_rcpt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.lot_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.ver_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.not_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.slo_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.comp_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.spec_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_prms_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_can_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst.wg_rqst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}
	/**
	 * WgRqst_Chk02オペレーション.<p>
	 *
	 * ＷＧ間依頼回答の登録・更新・削除<br>
	 */
	abstract public class WgRqst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected WgRqst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * WgRqst_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR createWgRqst_Chk02_DtlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR.create();
		}

		/**
		 * WgRqst_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR> createWgRqst_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>last_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_cng_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_po_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}
	/**
	 * WgRqst_Upd02オペレーション.<p>
	 *
	 * ＷＧ間依頼回答の登録・更新・削除<br>
	 */
	abstract public class WgRqst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R> down1;
		
		
		// コンストラクタ
		protected WgRqst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * WgRqst_Upd02_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R createWgRqst_Upd02_Dtl1R(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R.create();
		}

		/**
		 * WgRqst_Upd02_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R> createWgRqst_Upd02_Dtl1L(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R.class);
		}

		/**
		 * WgRqst_Upd02_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R createWgRqst_Upd02_Dtl2R(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R.create();
		}

		/**
		 * WgRqst_Upd02_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R> createWgRqst_Upd02_Dtl2L(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_dt</td></tr>
		 * 	<tr><td><br></td><td>re_prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>man_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_prms_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.wg_rqst_prms_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.fix_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.prms_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.prms_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.prms_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.prms_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.gr_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.can_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_dt</td></tr>
		 * 	<tr><td><br></td><td>re_prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>last_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms.wg_rqst_prms_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd02_Dtl2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}
	/**
	 * WgRqst_Upd03オペレーション.<p>
	 *
	 * ＷＧ間依頼の状況の更新<br>
	 */
	abstract public class WgRqst_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR> up0;
		
		
		// コンストラクタ
		protected WgRqst_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * WgRqst_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR createWgRqst_Upd03_DtlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR.create();
		}

		/**
		 * WgRqst_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR> createWgRqst_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}
	/**
	 * WgRqst_Upd04オペレーション.<p>
	 *
	 * ＷＧ間依頼の再調整依頼<br>
	 */
	abstract public class WgRqst_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR> up0;
		
		
		// コンストラクタ
		protected WgRqst_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * WgRqst_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR createWgRqst_Upd04_DtlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR.create();
		}

		/**
		 * WgRqst_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR> createWgRqst_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd04_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}
	/**
	 * WgRqst_Upd05オペレーション.<p>
	 *
	 * 出荷依頼の登録・訂正・取消<br>
	 */
	abstract public class WgRqst_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgRqst_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR> up0;
		
		
		// コンストラクタ
		protected WgRqst_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * WgRqst_Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR createWgRqst_Upd05_DtlR(){
			return mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR.create();
		}

		/**
		 * WgRqst_Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR> createWgRqst_Upd05_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>auto_prms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5100.WgRqst_Upd05_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstService)MSBAL_WgRqstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}