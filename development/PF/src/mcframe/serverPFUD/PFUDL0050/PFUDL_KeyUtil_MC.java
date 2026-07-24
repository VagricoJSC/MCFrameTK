package mcframe.serverPFUD.PFUDL0050;

import mcframe.commonCore.lang.*;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

abstract public class PFUDL_KeyUtil_MC {
	
	///////////////////////////////////////////
	// キーの基本処理
	///////////////////////////////////////////
	
	/** 
	 * 任意の文字列を表すキー。通常のキーの文字列には使用しない。
	 */
	protected String _anyKey = "*";
	
	/**
	 *  キーを分割する文字
	 */
	protected String _keySep = ".";
	
	/**
	 *  キーを分割する文字の正規表現
	 */
	protected String _keySepRegex = "\\.";
	
	/**
	 *  親キーを持つか否か。trueの場合、親キーを持つ。
	 */
	public boolean hasParent(String key) {
		return key != null && splitKey(key).length > 1;
	}
	
	/**
	 *  親キーを取得する。親キーを持たない場合、nullを返す。
	 */
	public String getParentKey(String key) {
		String[] keys = splitKey(key);
		if (keys == null || keys.length == 0) {
			return null;
		}
		String[] parts = new String[keys.length - 1];
		for (int i=0; i < parts.length; i++) {
			parts[i] = keys[i];
		}
		
		return createKey(parts);
	}
	
	/**
	 *  キーを分割した際の最下位の階層のサブキーを取得する。
	 */
	public String getLastKey(String key) {
		if (isNull(key)) {
			return key;
		}
		String[] keys = splitKey(key);
		return keys[keys.length - 1];
	}
	
	/**
	 *  サブキーから、キーを作成する。
	 */
	public String createKey(String... keys) {
		if (keys == null || keys.length == 0) {
			return null;
		}
		if (keys.length == 1) {
			return keys[0];
		}
		
		StringBuilder sb = new StringBuilder();
		boolean headFlg = true;
		for (int i =0 ; i < keys.length; i++) {
			if (!isNull(keys[i])) {
				if (headFlg == true) {
					headFlg = false;
				}
				else {
					sb.append(_keySep);
				}
				sb.append(keys[i]);
			}
		}
		return sb.toString();
	}
	
	/**
	 *  キーをサブキーに分割する。
	 */
	public String[] splitKey(String key) {
		if (key == null) {
			return null;
		}
		return key.split(_keySepRegex);
	}
	
	
	///////////////////////////////////////////
	// キーの解析に関する処理
	///////////////////////////////////////////
	
	/**
	 * 解析対象のrawキー（曖昧キー含む）の一覧
	 */
	protected HashSet<String> _rawKeySet;
	protected HashMap<MCNumber, ArrayList<String[]>> _keyMap;
	
	/**
	 *  解析対象のキーの一覧を設定する。
	 */
	public void setRawKeyList(Set<String> keySet) {
		_rawKeySet = new HashSet<>();
		_keyMap = new HashMap<>();
		
		if (keySet == null) {
			return;
		}
		
		_rawKeySet.addAll(keySet);
		crtKeyMap(_rawKeySet, _keyMap);
	}
	
	protected void crtKeyMap(HashSet<String> keySet, HashMap<MCNumber, ArrayList<String[]>> keyMap) {
		
		ArrayList<String> keyList = new ArrayList<>();
		keyList.addAll(keySet);
		keyList.sort(crtKeyComparator());
		
		for (String key : keyList) {
			String[] keys = splitKey(key);
			if (keys.length == 0) {
				continue;
			}
			MCNumber idx = MCNumber.valueOf(keys.length);
			ArrayList<String[]> akL = keyMap.get(idx);
			if (akL == null) {
				akL = new ArrayList<>();
				keyMap.put(idx, akL);
			}
			akL.add(keys);
		}
	}
	
	/**
	 * キーの階層が浅いが優先順位が高い。任意キーでないキーが先頭の方が優先順位が高い。
	 * <ol>
	 * 	<li>zzz</li>
	 * 	<li>xxx.yyy</li>
	 * 	<li>xxx.*</li>
	 * 	<li>*.yyy</li>
	 * 	<li>*.yyy.*</li>
	 * 	<li>*.*.zzz</li>
	 * </ol>
	 */
	protected Comparator<String> crtKeyComparator() {
		return new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 == null && o2 == null) {
					return 0;
				}
				if (o1 == null) {
					return 1;
				}
				if (o2 == null) {
					return -1;
				}
				
				String[] keys1 = splitKey(o1);
				String[] keys2 = splitKey(o2);
				
				if (keys1.length < keys2.length) {
					return -1;
				}
				if (keys1.length > keys2.length) {
					return 1;
				}
				
				int x = 0;
				
				for (int i = 0; i < keys1.length; i++) {
					if (keys1[i].equals(_anyKey)) {
						if (keys2[i].equals(_anyKey)) {
							continue;
						}
						return 1;
					}
					if (keys2[i].equals(_anyKey)) {
						return -1;
					}
					
					x = keys1[i].compareTo(keys2[i]);
					if (x != 0) {
						return x;
					}
				}
				
				return x;
			}
		};
	}
	
	/**
	 *  指定されたキー（曖昧キー含まない）に対する元のキー（曖昧キー含む）を取得する。
	 */
	public String getRawKey(String key) {
		ArrayList<String> rawKeyList = getRawKeys(key, false);
		if (rawKeyList == null || rawKeyList.isEmpty()) {
			return key;
		}
		return rawKeyList.get(0);
	}
	
	protected ArrayList<String> getChildRawKeys(String parentKey) {
		return getRawKeys(parentKey, true);
	}
	
	protected ArrayList<String> getRawKeys(String key, boolean childFlg) {
		ArrayList<String> rawKeyList = new ArrayList<>();
		if (key == null) {
			return rawKeyList;
		}
		String[] subKeys = splitKey(key);
		
		if (subKeys.length == 0) {
			return rawKeyList;
		}
		
		// key自身に対応するものを取得する場合、keyと同じサイズのリストを取得する。
		// keyの子キーを取得する場合、keyよりもサイズが１つ大きいリストを取得する。
		// そのうち、keyのサイズがだけ一致するものが子キーの一覧となる。
		ArrayList<String[]> keyList = _keyMap.get(MCNumber.valueOf(childFlg ? subKeys.length + 1 : subKeys.length));
		if (keyList == null) {
			return rawKeyList;
		}
		
		for (String[] ks : keyList) {
			boolean matchFlg = true;
			for (int i=0; i < subKeys.length; i++) {
				if (isSame(_anyKey, ks[i])) {
					continue;
				}
				if (!isSame(ks[i], subKeys[i])) {
					matchFlg = false;
					break;
				}
			}
			if (matchFlg) {
				rawKeyList.add(createKey(ks));
			}
		}
		return rawKeyList;
	}
	
	/**
	 * ルート直下が最下位であるキーの一覧を取得する。曖昧キーを除く。
	 */
	public Set<String> getChildOfRootLastKeys() {
		Set<String> childKeySet = new HashSet<>();
		ArrayList<String[]> keysList = _keyMap.get(MCNumber.ONE);
		if (keysList == null) {
			return childKeySet;
		}
		for (String[] keys : keysList) {
			if (!isSame(_anyKey, keys[0])) {
				childKeySet.add(keys[0]);
			}
		}
		return childKeySet;
	}
	
	/**
	 *  指定されたキー直下が最下位であるキーのLastKeyの一覧を取得する。LastKeyが曖昧キーを除く。
	 */
	public Set<String> getChildLastKeys(String key) {
		Set<String> childKeySet = new HashSet<>();
		if (key == null) {
			return childKeySet;
		}
		
		ArrayList<String> RawChildKeyList = getChildRawKeys(key);
		if (RawChildKeyList != null) {
			for (String rawChildKey : RawChildKeyList) {
				String lastKey = getLastKey(rawChildKey);
				if (!isSame(_anyKey, lastKey)) {
					childKeySet.add(getLastKey(rawChildKey));
				}
			}
		}
		return childKeySet;
	}
	
}
