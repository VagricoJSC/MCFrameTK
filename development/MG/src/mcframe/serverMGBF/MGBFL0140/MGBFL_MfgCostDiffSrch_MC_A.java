package mcframe.serverMGBF.MGBFL0140;

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
 * "MGBFL_MfgCostDiffSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFL_MfgCostDiffSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBFL0140";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBFL_MfgCostDiffSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBFL0140_Srch01_INFO;
		this.aSrch01 = ((MGBFL_MfgCostDiffSrch)this).new Srch01();
	}

	public static MGBFL_MfgCostDiffSrch.Srch01 crtSrch01() {
		MGBFL_MfgCostDiffSrch lgc = new MGBFL_MfgCostDiffSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
		p.addDownBlock(aSrch01.down5());
		p.addDownBlock(aSrch01.down6());
		p.addDownBlock(aSrch01.down7());
		p.addDownBlock(aSrch01.down8());
		p.addDownBlock(aSrch01.down9());
		p.addDownBlock(aSrch01.down10());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_CndR.create();
	}

	/**
	 * Srch01_QtyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_QtyR createSrch01_QtyR(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_QtyR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_RsltR.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R createSrch01_Rslt3R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R createSrch01_Rslt5R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R createSrch01_Rslt6R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> createSrch01_Rslt6L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R createSrch01_Rslt7R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.create();
	}

	/**
	 * Srch01_Rslt7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> createSrch01_Rslt7L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
	}

	/**
	 * Srch01_Rslt8ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R createSrch01_Rslt8R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.create();
	}

	/**
	 * Srch01_Rslt8ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> createSrch01_Rslt8L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
	}

	/**
	 * Srch01_Rslt9ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R createSrch01_Rslt9R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.create();
	}

	/**
	 * Srch01_Rslt9ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> createSrch01_Rslt9L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
	}

	/**
	 * Srch01_Rslt10ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R createSrch01_Rslt10R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.create();
	}

	/**
	 * Srch01_Rslt10ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> createSrch01_Rslt10L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.class);
	}
	protected MGBFL_MfgCostDiffSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MG_MGBFL0140_Srch02_INFO;
		this.aSrch02 = ((MGBFL_MfgCostDiffSrch)this).new Srch02();
	}

	public static MGBFL_MfgCostDiffSrch.Srch02 crtSrch02() {
		MGBFL_MfgCostDiffSrch lgc = new MGBFL_MfgCostDiffSrch();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMGBF.MGBFL0140.Srch02_CndR.create();
	}

	/**
	 * Srch02_Rslt10ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R createSrch02_Rslt10R(){
		return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.create();
	}

	/**
	 * Srch02_Rslt10ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> createSrch02_Rslt10L(){
		return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造原価差異内訳を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBF.MGBFL0140.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBF.MGBFL0140.Srch01_QtyR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> down8;
		/** このオペレーションからの下り電文パラメータの第9ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> down9;
		/** このオペレーションからの下り電文パラメータの第10ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> down10;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0140.Srch01_CndR.create();
			down0 = mcframe.serverMGBF.MGBFL0140.Srch01_QtyR.create();
			down1 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.class);
			down3 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
			down5 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.class);
			down6 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
			down7 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
			down8 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
			down9 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
			down10 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			if (i == 7) return down7();
			if (i == 8) return down8();
			if (i == 9) return down9();
			if (i == 10) return down10();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBFL_MfgCostDiffSrch)MGBFL_MfgCostDiffSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
			down8().clear();
			down9().clear();
			down10().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_CndR.create();
		}

		/**
		 * Srch01_QtyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_QtyR createSrch01_QtyR(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_QtyR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_RsltR.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R createSrch01_Rslt3R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R createSrch01_Rslt5R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R createSrch01_Rslt6R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> createSrch01_Rslt6L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R createSrch01_Rslt7R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.create();
		}

		/**
		 * Srch01_Rslt7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> createSrch01_Rslt7L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
		}

		/**
		 * Srch01_Rslt8ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R createSrch01_Rslt8R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.create();
		}

		/**
		 * Srch01_Rslt8ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> createSrch01_Rslt8L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
		}

		/**
		 * Srch01_Rslt9ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R createSrch01_Rslt9R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.create();
		}

		/**
		 * Srch01_Rslt9ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> createSrch01_Rslt9L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R.class);
		}

		/**
		 * Srch01_Rslt10ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R createSrch01_Rslt10R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.create();
		}

		/**
		 * Srch01_Rslt10ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> createSrch01_Rslt10L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mfg_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>except_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>no_po_no_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>no_slo_no_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>no_iv_no_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0140.Srch01_CndR
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_unit_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0140.Srch01_QtyR
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_QtyR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>key</td></tr>
		 * 	<tr><td><br></td><td>label</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>mfg_inpt_cost</td></tr>
		 * 	<tr><td><br></td><td>sub_ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>top_rec_no</td></tr>
		 * 	<tr><td><br></td><td>lvl</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_upri</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>act_upri</td></tr>
		 * 	<tr><td><br></td><td>inst_upri</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>top_rec_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>lvl</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>qty_diff</td></tr>
		 * 	<tr><td><br></td><td>std_qty</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>top_rec_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>lvl</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>qty_diff</td></tr>
		 * 	<tr><td><br></td><td>std_qty</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_upri</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>act_upri</td></tr>
		 * 	<tr><td><br></td><td>diff_ttl</td></tr>
		 * 	<tr><td><br></td><td>std_ttl</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>diff_var_cost</td></tr>
		 * 	<tr><td><br></td><td>std_var_cost</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>diff_fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>std_fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * 	<tr><td><br></td><td>col_200</td></tr>
		 * 	<tr><td><br></td><td>col_201</td></tr>
		 * 	<tr><td><br></td><td>col_202</td></tr>
		 * 	<tr><td><br></td><td>col_203</td></tr>
		 * 	<tr><td><br></td><td>col_204</td></tr>
		 * 	<tr><td><br></td><td>col_205</td></tr>
		 * 	<tr><td><br></td><td>col_206</td></tr>
		 * 	<tr><td><br></td><td>col_207</td></tr>
		 * 	<tr><td><br></td><td>col_208</td></tr>
		 * 	<tr><td><br></td><td>col_209</td></tr>
		 * 	<tr><td><br></td><td>col_210</td></tr>
		 * 	<tr><td><br></td><td>col_211</td></tr>
		 * 	<tr><td><br></td><td>col_212</td></tr>
		 * 	<tr><td><br></td><td>col_213</td></tr>
		 * 	<tr><td><br></td><td>col_214</td></tr>
		 * 	<tr><td><br></td><td>col_215</td></tr>
		 * 	<tr><td><br></td><td>col_216</td></tr>
		 * 	<tr><td><br></td><td>col_217</td></tr>
		 * 	<tr><td><br></td><td>col_218</td></tr>
		 * 	<tr><td><br></td><td>col_219</td></tr>
		 * 	<tr><td><br></td><td>col_220</td></tr>
		 * 	<tr><td><br></td><td>col_221</td></tr>
		 * 	<tr><td><br></td><td>col_222</td></tr>
		 * 	<tr><td><br></td><td>col_223</td></tr>
		 * 	<tr><td><br></td><td>col_224</td></tr>
		 * 	<tr><td><br></td><td>col_225</td></tr>
		 * 	<tr><td><br></td><td>col_226</td></tr>
		 * 	<tr><td><br></td><td>col_227</td></tr>
		 * 	<tr><td><br></td><td>col_228</td></tr>
		 * 	<tr><td><br></td><td>col_229</td></tr>
		 * 	<tr><td><br></td><td>col_230</td></tr>
		 * 	<tr><td><br></td><td>col_231</td></tr>
		 * 	<tr><td><br></td><td>col_232</td></tr>
		 * 	<tr><td><br></td><td>col_233</td></tr>
		 * 	<tr><td><br></td><td>col_234</td></tr>
		 * 	<tr><td><br></td><td>col_235</td></tr>
		 * 	<tr><td><br></td><td>col_236</td></tr>
		 * 	<tr><td><br></td><td>col_237</td></tr>
		 * 	<tr><td><br></td><td>col_238</td></tr>
		 * 	<tr><td><br></td><td>col_239</td></tr>
		 * 	<tr><td><br></td><td>col_240</td></tr>
		 * 	<tr><td><br></td><td>col_241</td></tr>
		 * 	<tr><td><br></td><td>col_242</td></tr>
		 * 	<tr><td><br></td><td>col_243</td></tr>
		 * 	<tr><td><br></td><td>col_244</td></tr>
		 * 	<tr><td><br></td><td>col_245</td></tr>
		 * 	<tr><td><br></td><td>col_246</td></tr>
		 * 	<tr><td><br></td><td>col_247</td></tr>
		 * 	<tr><td><br></td><td>col_248</td></tr>
		 * 	<tr><td><br></td><td>col_249</td></tr>
		 * 	<tr><td><br></td><td>col_250</td></tr>
		 * 	<tr><td><br></td><td>col_251</td></tr>
		 * 	<tr><td><br></td><td>col_252</td></tr>
		 * 	<tr><td><br></td><td>col_253</td></tr>
		 * 	<tr><td><br></td><td>col_254</td></tr>
		 * 	<tr><td><br></td><td>col_255</td></tr>
		 * 	<tr><td><br></td><td>col_256</td></tr>
		 * 	<tr><td><br></td><td>col_257</td></tr>
		 * 	<tr><td><br></td><td>col_258</td></tr>
		 * 	<tr><td><br></td><td>col_259</td></tr>
		 * 	<tr><td><br></td><td>col_260</td></tr>
		 * 	<tr><td><br></td><td>col_261</td></tr>
		 * 	<tr><td><br></td><td>col_262</td></tr>
		 * 	<tr><td><br></td><td>col_263</td></tr>
		 * 	<tr><td><br></td><td>col_264</td></tr>
		 * 	<tr><td><br></td><td>col_265</td></tr>
		 * 	<tr><td><br></td><td>col_266</td></tr>
		 * 	<tr><td><br></td><td>col_267</td></tr>
		 * 	<tr><td><br></td><td>col_268</td></tr>
		 * 	<tr><td><br></td><td>col_269</td></tr>
		 * 	<tr><td><br></td><td>col_270</td></tr>
		 * 	<tr><td><br></td><td>col_271</td></tr>
		 * 	<tr><td><br></td><td>col_272</td></tr>
		 * 	<tr><td><br></td><td>col_273</td></tr>
		 * 	<tr><td><br></td><td>col_274</td></tr>
		 * 	<tr><td><br></td><td>col_275</td></tr>
		 * 	<tr><td><br></td><td>col_276</td></tr>
		 * 	<tr><td><br></td><td>col_277</td></tr>
		 * 	<tr><td><br></td><td>col_278</td></tr>
		 * 	<tr><td><br></td><td>col_279</td></tr>
		 * 	<tr><td><br></td><td>col_280</td></tr>
		 * 	<tr><td><br></td><td>col_281</td></tr>
		 * 	<tr><td><br></td><td>col_282</td></tr>
		 * 	<tr><td><br></td><td>col_283</td></tr>
		 * 	<tr><td><br></td><td>col_284</td></tr>
		 * 	<tr><td><br></td><td>col_285</td></tr>
		 * 	<tr><td><br></td><td>col_286</td></tr>
		 * 	<tr><td><br></td><td>col_287</td></tr>
		 * 	<tr><td><br></td><td>col_288</td></tr>
		 * 	<tr><td><br></td><td>col_289</td></tr>
		 * 	<tr><td><br></td><td>col_290</td></tr>
		 * 	<tr><td><br></td><td>col_291</td></tr>
		 * 	<tr><td><br></td><td>col_292</td></tr>
		 * 	<tr><td><br></td><td>col_293</td></tr>
		 * 	<tr><td><br></td><td>col_294</td></tr>
		 * 	<tr><td><br></td><td>col_295</td></tr>
		 * 	<tr><td><br></td><td>col_296</td></tr>
		 * 	<tr><td><br></td><td>col_297</td></tr>
		 * 	<tr><td><br></td><td>col_298</td></tr>
		 * 	<tr><td><br></td><td>col_299</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>top_rec_no</td></tr>
		 * 	<tr><td><br></td><td>lvl</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_upri</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>act_upri</td></tr>
		 * 	<tr><td><br></td><td>inst_upri</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt2R> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>top_rec_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>lvl</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>qty_diff</td></tr>
		 * 	<tr><td><br></td><td>std_qty</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt4R> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>std_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>std_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>std_ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>std_var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>std_fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> down8() {
			return down8;
		}

		/**
		 * 下り電文の第9ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第9ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>std_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>diff_ttl</td></tr>
		 * 	<tr><td><br></td><td>std_ttl</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>diff_var_cost</td></tr>
		 * 	<tr><td><br></td><td>std_var_cost</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>diff_fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>std_fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * 	<tr><td><br></td><td>col_200</td></tr>
		 * 	<tr><td><br></td><td>col_201</td></tr>
		 * 	<tr><td><br></td><td>col_202</td></tr>
		 * 	<tr><td><br></td><td>col_203</td></tr>
		 * 	<tr><td><br></td><td>col_204</td></tr>
		 * 	<tr><td><br></td><td>col_205</td></tr>
		 * 	<tr><td><br></td><td>col_206</td></tr>
		 * 	<tr><td><br></td><td>col_207</td></tr>
		 * 	<tr><td><br></td><td>col_208</td></tr>
		 * 	<tr><td><br></td><td>col_209</td></tr>
		 * 	<tr><td><br></td><td>col_210</td></tr>
		 * 	<tr><td><br></td><td>col_211</td></tr>
		 * 	<tr><td><br></td><td>col_212</td></tr>
		 * 	<tr><td><br></td><td>col_213</td></tr>
		 * 	<tr><td><br></td><td>col_214</td></tr>
		 * 	<tr><td><br></td><td>col_215</td></tr>
		 * 	<tr><td><br></td><td>col_216</td></tr>
		 * 	<tr><td><br></td><td>col_217</td></tr>
		 * 	<tr><td><br></td><td>col_218</td></tr>
		 * 	<tr><td><br></td><td>col_219</td></tr>
		 * 	<tr><td><br></td><td>col_220</td></tr>
		 * 	<tr><td><br></td><td>col_221</td></tr>
		 * 	<tr><td><br></td><td>col_222</td></tr>
		 * 	<tr><td><br></td><td>col_223</td></tr>
		 * 	<tr><td><br></td><td>col_224</td></tr>
		 * 	<tr><td><br></td><td>col_225</td></tr>
		 * 	<tr><td><br></td><td>col_226</td></tr>
		 * 	<tr><td><br></td><td>col_227</td></tr>
		 * 	<tr><td><br></td><td>col_228</td></tr>
		 * 	<tr><td><br></td><td>col_229</td></tr>
		 * 	<tr><td><br></td><td>col_230</td></tr>
		 * 	<tr><td><br></td><td>col_231</td></tr>
		 * 	<tr><td><br></td><td>col_232</td></tr>
		 * 	<tr><td><br></td><td>col_233</td></tr>
		 * 	<tr><td><br></td><td>col_234</td></tr>
		 * 	<tr><td><br></td><td>col_235</td></tr>
		 * 	<tr><td><br></td><td>col_236</td></tr>
		 * 	<tr><td><br></td><td>col_237</td></tr>
		 * 	<tr><td><br></td><td>col_238</td></tr>
		 * 	<tr><td><br></td><td>col_239</td></tr>
		 * 	<tr><td><br></td><td>col_240</td></tr>
		 * 	<tr><td><br></td><td>col_241</td></tr>
		 * 	<tr><td><br></td><td>col_242</td></tr>
		 * 	<tr><td><br></td><td>col_243</td></tr>
		 * 	<tr><td><br></td><td>col_244</td></tr>
		 * 	<tr><td><br></td><td>col_245</td></tr>
		 * 	<tr><td><br></td><td>col_246</td></tr>
		 * 	<tr><td><br></td><td>col_247</td></tr>
		 * 	<tr><td><br></td><td>col_248</td></tr>
		 * 	<tr><td><br></td><td>col_249</td></tr>
		 * 	<tr><td><br></td><td>col_250</td></tr>
		 * 	<tr><td><br></td><td>col_251</td></tr>
		 * 	<tr><td><br></td><td>col_252</td></tr>
		 * 	<tr><td><br></td><td>col_253</td></tr>
		 * 	<tr><td><br></td><td>col_254</td></tr>
		 * 	<tr><td><br></td><td>col_255</td></tr>
		 * 	<tr><td><br></td><td>col_256</td></tr>
		 * 	<tr><td><br></td><td>col_257</td></tr>
		 * 	<tr><td><br></td><td>col_258</td></tr>
		 * 	<tr><td><br></td><td>col_259</td></tr>
		 * 	<tr><td><br></td><td>col_260</td></tr>
		 * 	<tr><td><br></td><td>col_261</td></tr>
		 * 	<tr><td><br></td><td>col_262</td></tr>
		 * 	<tr><td><br></td><td>col_263</td></tr>
		 * 	<tr><td><br></td><td>col_264</td></tr>
		 * 	<tr><td><br></td><td>col_265</td></tr>
		 * 	<tr><td><br></td><td>col_266</td></tr>
		 * 	<tr><td><br></td><td>col_267</td></tr>
		 * 	<tr><td><br></td><td>col_268</td></tr>
		 * 	<tr><td><br></td><td>col_269</td></tr>
		 * 	<tr><td><br></td><td>col_270</td></tr>
		 * 	<tr><td><br></td><td>col_271</td></tr>
		 * 	<tr><td><br></td><td>col_272</td></tr>
		 * 	<tr><td><br></td><td>col_273</td></tr>
		 * 	<tr><td><br></td><td>col_274</td></tr>
		 * 	<tr><td><br></td><td>col_275</td></tr>
		 * 	<tr><td><br></td><td>col_276</td></tr>
		 * 	<tr><td><br></td><td>col_277</td></tr>
		 * 	<tr><td><br></td><td>col_278</td></tr>
		 * 	<tr><td><br></td><td>col_279</td></tr>
		 * 	<tr><td><br></td><td>col_280</td></tr>
		 * 	<tr><td><br></td><td>col_281</td></tr>
		 * 	<tr><td><br></td><td>col_282</td></tr>
		 * 	<tr><td><br></td><td>col_283</td></tr>
		 * 	<tr><td><br></td><td>col_284</td></tr>
		 * 	<tr><td><br></td><td>col_285</td></tr>
		 * 	<tr><td><br></td><td>col_286</td></tr>
		 * 	<tr><td><br></td><td>col_287</td></tr>
		 * 	<tr><td><br></td><td>col_288</td></tr>
		 * 	<tr><td><br></td><td>col_289</td></tr>
		 * 	<tr><td><br></td><td>col_290</td></tr>
		 * 	<tr><td><br></td><td>col_291</td></tr>
		 * 	<tr><td><br></td><td>col_292</td></tr>
		 * 	<tr><td><br></td><td>col_293</td></tr>
		 * 	<tr><td><br></td><td>col_294</td></tr>
		 * 	<tr><td><br></td><td>col_295</td></tr>
		 * 	<tr><td><br></td><td>col_296</td></tr>
		 * 	<tr><td><br></td><td>col_297</td></tr>
		 * 	<tr><td><br></td><td>col_298</td></tr>
		 * 	<tr><td><br></td><td>col_299</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt9R> down9() {
			return down9;
		}

		/**
		 * 下り電文の第10ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第10ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>diff_alc_tgt_val</td></tr>
		 * 	<tr><td><br></td><td>std_alc_tgt_val</td></tr>
		 * 	<tr><td><br></td><td>alc_tgt_val</td></tr>
		 * 	<tr><td><br></td><td>diff_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>std_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>alc_rate</td></tr>
		 * 	<tr><td><br></td><td>diff_std_tgt_std_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>diff_std_tgt_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>std_tgt_amt</td></tr>
		 * 	<tr><td><br></td><td>diff_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>std_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>alc_amt</td></tr>
		 * 	<tr><td><br></td><td>expns_cd</td></tr>
		 * 	<tr><td><br></td><td>expns_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>diff_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>diff_calc_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> down10() {
			return down10;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_MfgCostDiffSrch)MGBFL_MfgCostDiffSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 工数差異選択時に、配賦費用情報を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBF.MGBFL0140.Srch02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0140.Srch02_CndR.create();
			down0 = MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.class);

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
			invoke((MGBFL_MfgCostDiffSrch)MGBFL_MfgCostDiffSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMGBF.MGBFL0140.Srch02_CndR.create();
		}

		/**
		 * Srch02_Rslt10ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R createSrch02_Rslt10R(){
			return mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.create();
		}

		/**
		 * Srch02_Rslt10ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> createSrch02_Rslt10L(){
			return MCList.create(mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd2</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0140.Srch02_CndR
		 */
		public mcframe.serverMGBF.MGBFL0140.Srch02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>diff_alc_tgt_val</td></tr>
		 * 	<tr><td><br></td><td>std_alc_tgt_val</td></tr>
		 * 	<tr><td><br></td><td>alc_tgt_val</td></tr>
		 * 	<tr><td><br></td><td>diff_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>std_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>alc_rate</td></tr>
		 * 	<tr><td><br></td><td>diff_std_tgt_std_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>diff_std_tgt_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>std_tgt_amt</td></tr>
		 * 	<tr><td><br></td><td>diff_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>std_alc_amt</td></tr>
		 * 	<tr><td><br></td><td>alc_amt</td></tr>
		 * 	<tr><td><br></td><td>expns_cd</td></tr>
		 * 	<tr><td><br></td><td>expns_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>diff_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>diff_calc_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0140.Srch01_Rslt10R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_MfgCostDiffSrch)MGBFL_MfgCostDiffSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}